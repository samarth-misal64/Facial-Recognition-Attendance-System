package recognition;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.FilenameFilter;
import java.io.IOException;
import java.nio.IntBuffer;
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
import org.bytedeco.javacpp.opencv_objdetect;
import static org.bytedeco.javacpp.opencv_objdetect.CV_HAAR_DO_CANNY_PRUNING;
import org.bytedeco.javacpp.opencv_objdetect.CvHaarClassifierCascade;
import org.bytedeco.javacv.Frame;
import org.bytedeco.javacv.Java2DFrameConverter;
import org.bytedeco.javacv.OpenCVFrameConverter;
import org.bytedeco.javacv.OpenCVFrameGrabber;


public class FaceDetector {

	LBPHFaceRecognizer faceRecognizer;
 
	public File root;
	MatVector images;
	Mat labels;
        CvHaarClassifierCascade classifier = null;
        
        OpenCVFrameGrabber grabber = null;
        OpenCVFrameConverter.ToIplImage grabberConverter = null;
        IplImage grabbedImage = null, grayImage = null, smallImage = null, temp = null, manual_img = null;
        CvMemStorage storage = null;
        Java2DFrameConverter paintConverter = new Java2DFrameConverter(); 
        CvSeq faces = null;    
        

        
	public void init(String dataset_path, int code, String name) 
        {
            // mention the directory the faces has been saved
            // Example (use project-relative path):
            // String trainingDir = "Face_recog_Project_attendance/stud_faces";
            
            String trainingDir = dataset_path;
            root = new File(trainingDir);

            FilenameFilter imgFilter = new FilenameFilter() {
                    public boolean accept(File dir, String name) {
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

            } 
            catch (Exception e) 
            {
                Object exception = null;
                if (exception == null) 
                        exception = e;
            }
            
            //******************************************************************
            
            for (File imag : imageFiles) 
            {
                Mat img = imread(imag.getAbsolutePath(), CV_LOAD_IMAGE_GRAYSCALE);
                
                try 
                {
                    grabber = OpenCVFrameGrabber.createDefault(0); //parameter 0 default camera , 1 for secondary
                    grabberConverter = new OpenCVFrameConverter.ToIplImage();
                    grabber.setImageWidth(700);
                    grabber.setImageHeight(700);
                    grabber.start();


                    grabbedImage = grabberConverter.convert(grabber.grab());


                    grabber.close();
                    storage = CvMemStorage.create();
                } 
                catch (Exception e) 
                {
                    System.out.println("Exception caught: " + e);
                }

                     
//            File fil = new File("haar/me.jpg");
                grabbedImage = new IplImage(new Mat(cvLoadImage(imag.getAbsolutePath())));
                grayImage = cvCreateImage(cvGetSize(grabbedImage), 8, 1); //converting image to grayscale
			
                //reducing the size of the image to speed up the processing
                smallImage = cvCreateImage(cvSize(grabbedImage.width() / 4, grabbedImage.height() / 4), 8, 1);
                
                Frame frame = grabberConverter.convert(grabbedImage);
                cvClearMemStorage(storage);
                BufferedImage image = paintConverter.getBufferedImage(frame, 2.2 / grabber.getGamma());
                Graphics2D g2 = image.createGraphics();

                //creating a temporary image
                temp = cvCreateImage(cvGetSize(grabbedImage), grabbedImage.depth(), grabbedImage.nChannels());

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
                        
                        String fName = "Face_recog_Project_attendance/stud_faces/" + code
                                + "" + "-" +  name + counter + ".jpg";
                        cvSaveImage(fName, temp);
                        counter++;
                    }                                                       
                }
                
                
                
                
            }
            //******************************************************************
            
	}

        public static  void main(String[] args)
        {
//            FaceDetector f = new FaceDetector();
//            f.init();
        }      
            
        
}







//deepface - 97%  effficiency human brain