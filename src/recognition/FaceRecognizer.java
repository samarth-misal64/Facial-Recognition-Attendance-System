package recognition;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.IntBuffer;
import java.util.SortedSet;
import java.util.TreeSet;
import java.util.logging.Level;
import java.util.logging.Logger;

import static org.bytedeco.javacpp.opencv_core.*;

import static org.bytedeco.javacpp.opencv_face.createLBPHFaceRecognizer;
import org.bytedeco.javacpp.opencv_core.Mat;
import org.bytedeco.javacpp.opencv_core.MatVector;
 
import org.bytedeco.javacpp.opencv_face.*;

 

import static org.bytedeco.javacpp.opencv_imgcodecs.*;
import static org.bytedeco.javacpp.opencv_imgproc.*;

import static org.bytedeco.javacpp.opencv_imgcodecs.imread;
import static org.bytedeco.javacpp.opencv_imgcodecs.CV_LOAD_IMAGE_GRAYSCALE;

import org.bytedeco.javacpp.IntPointer;
import org.bytedeco.javacpp.BytePointer;
import org.bytedeco.javacpp.DoublePointer;
import org.bytedeco.javacpp.Loader;
import static org.bytedeco.javacpp.helper.opencv_objdetect.cvHaarDetectObjects;
import static org.bytedeco.javacpp.opencv_highgui.cvShowImage;
import org.bytedeco.javacpp.opencv_objdetect;
import static org.bytedeco.javacpp.opencv_objdetect.CV_HAAR_DO_CANNY_PRUNING;
import org.bytedeco.javacpp.opencv_objdetect.CvHaarClassifierCascade;
import org.bytedeco.javacv.FFmpegFrameGrabber;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.Java2DFrameConverter;
import org.bytedeco.javacv.OpenCVFrameConverter;
import org.bytedeco.javacv.OpenCVFrameGrabber;


public class FaceRecognizer 
{

    LBPHFaceRecognizer faceRecognizer;

    public File root;
    MatVector images;
    Mat labels;
    
    SortedSet<Integer> face_codes = new TreeSet<>();

    public void init() 
    {
        // mention the directory the faces has been saved
    String trainingDir = "Face_recog_Project_attendance/stud_faces";

        root = new File(trainingDir);

        FilenameFilter imgFilter = new FilenameFilter() 
        {
            public boolean accept(File dir, String name) 
            {
                name = name.toLowerCase();
                return name.endsWith(".jpg") || name.endsWith(".pgm") || name.endsWith(".png");
            }
        };

        File[] imageFiles = root.listFiles(imgFilter);

        this.images = new MatVector(imageFiles.length);

        this.labels = new Mat(imageFiles.length, 1, CV_32SC1);
        IntBuffer labelsBuf = labels.createBuffer();

        int counter = 0;

        // reading face images from the folder
        for (File image : imageFiles) 
        {
            Mat img = imread(image.getAbsolutePath(), CV_LOAD_IMAGE_GRAYSCALE);

            int label = Integer.parseInt(image.getName().split("\\-")[0]);

            images.put(counter, img);

            labelsBuf.put(counter, label);

            counter++;
        }

        // face training
        System.out.print("Training the model again");
        this.faceRecognizer = createLBPHFaceRecognizer();
        this.faceRecognizer.train(images, labels);
    }

    public int recognize(IplImage faceData) 
    {
        Mat faces = cvarrToMat(faceData);

        cvtColor(faces, faces, CV_BGR2GRAY);

        IntPointer label = new IntPointer(1);
        DoublePointer confidence = new DoublePointer(0);

        this.faceRecognizer.predict(faces, label, confidence);

        int predictedLabel = label.get(0);

        //System.out.println(confidence.get(0));

        //Confidence value less than 60 means face is known 
        //Confidence value greater than 60 means face is unknown 
         if(confidence.get(0) > 60)
         {
            //System.out.println("-1");
            return -1;
         }

        return predictedLabel;
    }


    public SortedSet call_me()
    {
        FaceRecognizer f = new FaceRecognizer();
        f.init();
        
//        File fi = fil;

        FFmpegFrameGrabber grabber = null;
        OpenCVFrameConverter.ToIplImage grabberConverter = null;
        IplImage grabbedImage = null, grayImage = null, smallImage = null, temp = null, manual_img = null;
        CvMemStorage storage = null;
        Java2DFrameConverter paintConverter = new Java2DFrameConverter(); 
        CvSeq faces = null;
        int counter=0;
        
        //******************************** LOADING CLASSIFIER ***************************************
        CvHaarClassifierCascade classifier = null;
        Loader.load(opencv_objdetect.class);
        try 
        {

            File classifierFile = Loader.extractResource("haar/haarcascade_frontalface_alt.xml", null, "classifier", ".xml");

            if (classifierFile == null || classifierFile.length() <= 0) {
                    throw new IOException("Could not extract \"" + "haar/haarcascade_frontalface_alt.xml" + "\" from Java resources.");
            }

            // Preload the opencv_objdetect module to work around a known bug.
            Loader.load(opencv_objdetect.class);
            classifier = new CvHaarClassifierCascade(cvLoad(classifierFile.getAbsolutePath()));
            classifierFile.delete();
            if (classifier.isNull()) {
                    throw new IOException("Could not load the classifier file.");
            }

        } catch (Exception e) 
        {
            Object exception = null;
            if (exception == null) 
            {
                exception = e;
            }
        }
        //**************************************************************************************************
        
        
        //Pass the video path on which recognition is to be done
    grabber = new  FFmpegFrameGrabber("Face_recog_Project_attendance/stud_video/vid2.mp4"); //parameter 0 default camera , 1 for secondary
        grabberConverter = new OpenCVFrameConverter.ToIplImage();
        grabber.setImageWidth(700);
        grabber.setImageHeight(700);
        if (grabber == null)
        {
            System.out.println("!!! Failed OpenCVFrameGrabber");
            return null;
        }
        
        //**************************************************************************************
        
        int frame_cnt=0;

        try 
        {
            grabber.start();
            System.err.println("FRAMES: " + grabber.getLengthInFrames());
            int j=0;
            
            File root = new File("Face_recog_Project_attendance/stud_temp");

            FilenameFilter imgFilter = new FilenameFilter() {
                    public boolean accept(File dir, String name) {
                            name = name.toLowerCase();
                            return name.endsWith(".jpg") || name.endsWith(".pgm") || name.endsWith(".png");
                    }
            };

            File[] imageFiles = root.listFiles(imgFilter);

            for(File fil: imageFiles)
            {
                j++;
                System.err.println("grabbing");
                grabbedImage = grabberConverter.convert(grabber.grabImage());
//                cvShowImage("video_demo", grabbedImage);

                storage = CvMemStorage.create();
                
//                File fil = new File("Face_recog_Project_attendance/stud_test/t7.jpg");
                grabbedImage = new IplImage(new Mat(cvLoadImage(fil.getAbsolutePath())));
                grayImage = cvCreateImage(cvGetSize(grabbedImage), 8, 1); //converting image to grayscale

                //reducing the size of the image to speed up the processing
                smallImage = cvCreateImage(cvSize(grabbedImage.width() / 4, grabbedImage.height() / 4), 8, 1);

                Frame frame = grabberConverter.convert(grabbedImage);
                BufferedImage image = paintConverter.getBufferedImage(frame, 2.2 / grabber.getGamma());
                Graphics2D g2 = image.createGraphics();

                //creating a temporary image
                temp = cvCreateImage(cvGetSize(grabbedImage), grabbedImage.depth(), grabbedImage.nChannels());
                cvClearMemStorage(storage);

                cvCopy(grabbedImage, temp);

                cvCvtColor(grabbedImage, grayImage, CV_BGR2GRAY);
                cvResize(grayImage, smallImage, CV_INTER_AREA);

                //cvHaarDetectObjects(image, cascade, storage, scale_factor, min_neighbors, flags, min_size, max_size)
                faces = cvHaarDetectObjects(smallImage, classifier, storage, 1.1, 3, CV_HAAR_DO_CANNY_PRUNING);
                //face detection

                if (faces != null) 
                {
                    g2.setColor(Color.green);
                    g2.setStroke(new BasicStroke(2));
                    int total = faces.total();
                    System.err.println("Total Faces: " + total);
                    for (int i = 0; i < total; i++) 
                    {
                        //printing rectange box where face detected frame by frame
                        CvRect r = new CvRect(cvGetSeqElem(faces, i));
                        g2.drawRect((r.x() * 4), (r.y() * 4), (r.width() * 4), (r.height() * 4));

                        CvRect re = new CvRect((r.x() * 4), r.y() * 4, (r.width() * 4), r.height() * 4);

                        cvSetImageROI(temp, re);
                        int code = f.recognize(temp);
                        System.err.println(code);
                        face_codes.add(code);
                    }
                }

            }
            grabber.stop();
            grabber.close();
        } 
        catch (Exception e) 
        {
            System.out.println("Exception caught: " + e);
        }
    
        return face_codes;
    }
    
    
}
