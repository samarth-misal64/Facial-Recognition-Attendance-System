/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;


public class add_faculty extends javax.swing.JPanel {

    public add_faculty() {
        initComponents();     
    }

   
    @SuppressWarnings("unchecked")
    Connection con=null;
    PreparedStatement ps = null;
    ResultSet rs=null;
    
    public boolean validation()
    { 
        if(facultyidtxt.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please Enter Faculty ID");   
            return false;
        }
        if(desigcombo.getSelectedItem()== "--Select--")
        {
            JOptionPane.showMessageDialog(this,"Please Select Designation");    
            return false;
        }
        if(fnametxt.getText().isEmpty())
        {
           JOptionPane.showMessageDialog(this,"Please Enter Name");
           return false;
        }
        if(datecombo.getSelectedItem()=="Date")
        {
            JOptionPane.showMessageDialog(this,"Please Select Date!");    
            return false;
        }
        if(monthcombo.getSelectedItem()=="Month")
        {
            JOptionPane.showMessageDialog(this,"Please Select Month!");    
            return false;
        }
        if(yearcombo.getSelectedItem()=="Year")
        {
            JOptionPane.showMessageDialog(this,"Please Select Year!");    
            return false;
        }
        if(mobtxt.getText().isEmpty() || mobtxt.getText().length() < 10)
        {
            JOptionPane.showMessageDialog(this,"Please Enter 10 digit valid Mobile No.");
            return false;
        }
        if(!female_radiobtn.isSelected() && !maleradiobtn.isSelected())
        {
            JOptionPane.showMessageDialog(this,"Kindly Select Gender!");    
            return false;
        }
//        else if()
//        {
//            JOptionPane.showMessageDialog(this,"Kindly Select Gender!");    
//            return false;
//        }
        if(emailtxt.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please Enter Email");
            return false;
        }
        if(deptcombo.getSelectedItem()== "--Select--")
        {
            JOptionPane.showMessageDialog(this,"Please Select Department!");    
            return false;
        }
        if(uploadimgtxt.getText().isEmpty())
        {
            JOptionPane.showMessageDialog(this,"Please Upload an Image !");    
            return false;
        }
        
        return true;
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox6 = new javax.swing.JComboBox<>();
        savebtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        maleradiobtn = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        browsebtn = new javax.swing.JButton();
        datecombo = new javax.swing.JComboBox<>();
        monthcombo = new javax.swing.JComboBox<>();
        jLabel10 = new javax.swing.JLabel();
        yearcombo = new javax.swing.JComboBox<>();
        deptcombo = new javax.swing.JComboBox<>();
        female_radiobtn = new javax.swing.JRadioButton();
        mobtxt = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        uploadimgtxt = new javax.swing.JTextField();
        facultyidtxt = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        desigcombo = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        fnametxt = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        fidval = new javax.swing.JLabel();
        fnameval = new javax.swing.JLabel();
        mobval = new javax.swing.JLabel();
        emailval = new javax.swing.JLabel();

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(51, 51, 51));
        setMaximumSize(new java.awt.Dimension(740, 520));
        setMinimumSize(new java.awt.Dimension(740, 520));
        setPreferredSize(new java.awt.Dimension(740, 520));

        savebtn.setBackground(new java.awt.Color(255, 255, 255));
        savebtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        savebtn.setForeground(new java.awt.Color(51, 51, 51));
        savebtn.setText("SAVE");
        savebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                savebtnActionPerformed(evt);
            }
        });

        resetbtn.setBackground(new java.awt.Color(255, 255, 255));
        resetbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        resetbtn.setForeground(new java.awt.Color(51, 51, 51));
        resetbtn.setText("RESET");
        resetbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetbtnActionPerformed(evt);
            }
        });

        jLabel9.setBackground(new java.awt.Color(204, 255, 51));
        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 51, 51));
        jLabel9.setText("*Default Username & Password: (Faculty ID)");
        jLabel9.setToolTipText("");
        jLabel9.setOpaque(true);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)));

        maleradiobtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        maleradiobtn.setForeground(new java.awt.Color(51, 51, 51));
        maleradiobtn.setText("MALE");
        maleradiobtn.setMinimumSize(new java.awt.Dimension(6, 25));
        maleradiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleradiobtnActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("EMAIL ID:");

        browsebtn.setBackground(new java.awt.Color(255, 255, 255));
        browsebtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        browsebtn.setForeground(new java.awt.Color(51, 51, 51));
        browsebtn.setText("..BROWSE");
        browsebtn.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        browsebtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        browsebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsebtnActionPerformed(evt);
            }
        });

        datecombo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        datecombo.setForeground(new java.awt.Color(51, 51, 51));
        datecombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Date", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));
        datecombo.setMinimumSize(new java.awt.Dimension(6, 25));
        datecombo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                datecomboActionPerformed(evt);
            }
        });

        monthcombo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        monthcombo.setForeground(new java.awt.Color(51, 51, 51));
        monthcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Month", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12" }));
        monthcombo.setMinimumSize(new java.awt.Dimension(6, 25));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("DESIGNATION :");
        jLabel10.setToolTipText("");

        yearcombo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        yearcombo.setForeground(new java.awt.Color(51, 51, 51));
        yearcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Year", "1991", "1992", "1993", "1994", "1995", "1996", "1997", "1998", "1999", "2000", "2001", "2002", "2003", "2004", "2005", "2006", "2007", "2008", "2009", "2010", "2011", "2012", "2013", "2014", "2015", "2016", "2017", "2018", "2019", "2020", "2021", "2022", "2023", "2024", "2025" }));
        yearcombo.setMinimumSize(new java.awt.Dimension(6, 25));

        deptcombo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deptcombo.setForeground(new java.awt.Color(51, 51, 51));
        deptcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Computer Science (CS)", "Mechanical (ME)", "Information Technology(IT)", "Chemical(CE)" }));
        deptcombo.setMinimumSize(new java.awt.Dimension(6, 25));

        female_radiobtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        female_radiobtn.setForeground(new java.awt.Color(51, 51, 51));
        female_radiobtn.setText("FEMALE");
        female_radiobtn.setMinimumSize(new java.awt.Dimension(6, 25));
        female_radiobtn.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                female_radiobtnItemStateChanged(evt);
            }
        });
        female_radiobtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                female_radiobtnActionPerformed(evt);
            }
        });

        mobtxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mobtxt.setForeground(new java.awt.Color(51, 51, 51));
        mobtxt.setAutoscrolls(false);
        mobtxt.setMinimumSize(new java.awt.Dimension(6, 25));
        mobtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mobtxtKeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 51, 51));
        jLabel2.setText("DOB :");

        uploadimgtxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        uploadimgtxt.setForeground(new java.awt.Color(51, 51, 51));
        uploadimgtxt.setAutoscrolls(false);
        uploadimgtxt.setMinimumSize(new java.awt.Dimension(6, 25));

        facultyidtxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        facultyidtxt.setForeground(new java.awt.Color(51, 51, 51));
        facultyidtxt.setAutoscrolls(false);
        facultyidtxt.setMinimumSize(new java.awt.Dimension(6, 25));
        facultyidtxt.setPreferredSize(new java.awt.Dimension(72, 25));
        facultyidtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                facultyidtxtKeyReleased(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("FACULTY NAME :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 51, 51));
        jLabel6.setText("GENDER :");

        emailtxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        emailtxt.setForeground(new java.awt.Color(51, 51, 51));
        emailtxt.setAutoscrolls(false);
        emailtxt.setMinimumSize(new java.awt.Dimension(6, 25));
        emailtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailtxtKeyReleased(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("FACULTY ID :");
        jLabel1.setToolTipText("");

        desigcombo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        desigcombo.setForeground(new java.awt.Color(51, 51, 51));
        desigcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "HOD", "PREOFESSOR" }));
        desigcombo.setMinimumSize(new java.awt.Dimension(6, 25));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("UPLOAD IMAGE :");

        fnametxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fnametxt.setForeground(new java.awt.Color(51, 51, 51));
        fnametxt.setAutoscrolls(false);
        fnametxt.setMinimumSize(new java.awt.Dimension(6, 25));
        fnametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fnametxtKeyReleased(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("MOBILE NO :");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("DEPARTMENT :");

        fidval.setForeground(java.awt.Color.red);

        fnameval.setForeground(java.awt.Color.red);

        mobval.setForeground(java.awt.Color.red);

        emailval.setForeground(java.awt.Color.red);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel2))
                        .addGap(69, 69, 69)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(datecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(monthcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(yearcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(mobtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(mobval))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(93, 93, 93)
                        .addComponent(maleradiobtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(female_radiobtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel1)
                            .addComponent(jLabel10))
                        .addGap(42, 42, 42)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(facultyidtxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(desigcombo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fnametxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 272, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fidval)
                            .addComponent(fnameval)))
                    .addComponent(jLabel4)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addGap(42, 42, 42)
                                    .addComponent(uploadimgtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                    .addGap(161, 161, 161)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(deptcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(browsebtn)
                            .addComponent(emailval))))
                .addGap(12, 12, 12))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(facultyidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fidval))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desigcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fnametxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fnameval))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(datecombo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(monthcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(yearcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mobval))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(maleradiobtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(female_radiobtn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailval))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deptcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(browsebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(uploadimgtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(235, 235, 235)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel9))
                .addContainerGap(234, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(savebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(17, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
        facultyidtxt.setText(" ");
        fnametxt.setText(" ");
        mobtxt.setText(" ");
        emailtxt.setText(" ");
        uploadimgtxt.setText(" ");
        desigcombo.setSelectedItem("--Select--");
        datecombo.setSelectedItem("Date");
        monthcombo.setSelectedItem("Month");
        yearcombo.setSelectedItem("Year");
        deptcombo.setSelectedItem("--Select--");
        maleradiobtn.setSelected(false);
        female_radiobtn.setSelected(false);
        fidval.setText(" ");
        fnameval.setText(" ");
        mobval.setText(" ");
        emailval.setText(" ");
    }//GEN-LAST:event_resetbtnActionPerformed

    private void savebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_savebtnActionPerformed
        // TODO add your handling code here:                                                              
                                                  
       if(validation()){
        
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://attendance_db/face_recog_db.accdb");
            String desig,fname,gender,email,dept,img,d,m,y,dob,mobno;
            int fid;
 
            fid = Integer.valueOf(facultyidtxt.getText());
            desig = desigcombo.getSelectedItem().toString();
            fname = fnametxt.getText().toUpperCase();
            d=datecombo.getSelectedItem().toString();
            m=monthcombo.getSelectedItem().toString();
            y=yearcombo.getSelectedItem().toString();
            dob = d+"-"+m+"-"+y;
           //Date dob = Date.valueOf(date); 
           //Date dob =(Date) new SimpleDateFormat("d-MM-yyyy").parse(date);        
            mobno = mobtxt.getText();
            if(maleradiobtn.isSelected())
                gender=maleradiobtn.getText();
            else
                gender=female_radiobtn.getText();
            
            email = emailtxt.getText();
            dept = deptcombo.getSelectedItem().toString();
            img = uploadimgtxt.getText();
            
            String sql ="insert into faculty(f_id,f_designation,f_name,f_dob,f_mobile,f_gender,f_email,f_dept,f_dataset,f_uname,f_pwd) values(?,?,?,?,?,?,?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setInt(1,fid);
            ps.setString(2,desig);
            ps.setString(3,fname);
            ps.setString(4,dob); 
            ps.setString(5,mobno);
            ps.setString(6,gender);
            ps.setString(7,email);
            ps.setString(8,dept);
            ps.setString(9,img);
            ps.setString(10,email);
            ps.setString(11,String.valueOf(fid));
            
            int n = ps.executeUpdate();
            JOptionPane.showMessageDialog(this,"Register Successfully..");
            ps.close();
            con.close();
            
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
      } 
    }//GEN-LAST:event_savebtnActionPerformed
    
    private void maleradiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleradiobtnActionPerformed
        // TODO add your handling code here:
        if(maleradiobtn.isSelected())
           female_radiobtn.setSelected(false);
        
    }//GEN-LAST:event_maleradiobtnActionPerformed

    private void female_radiobtnItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_female_radiobtnItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_female_radiobtnItemStateChanged

    private void female_radiobtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_female_radiobtnActionPerformed
        // TODO add your handling code here:
       if(female_radiobtn.isSelected())
           maleradiobtn.setSelected(false);
    }//GEN-LAST:event_female_radiobtnActionPerformed

    private void datecomboActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_datecomboActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_datecomboActionPerformed

    private void facultyidtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_facultyidtxtKeyReleased
        // TODO add your handling code here:
        String pattern="^[0-9]{1,20}$";
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(facultyidtxt.getText());
        if(!match.matches())
        {
            fidval.setText("Ineger Number Only");
        }
        else
        {
               fidval.setText("");
        }
    }//GEN-LAST:event_facultyidtxtKeyReleased

    private void fnametxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_fnametxtKeyReleased
        // TODO add your handling code here:
        String pattern="^[a-zA-Z ]{1,30}$";
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(fnametxt.getText());
        if(!match.matches())
        {
            fnameval.setText("Enter Valid Name");
        }
        else
        {
               fnameval.setText("");
        }
    }//GEN-LAST:event_fnametxtKeyReleased

    private void mobtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_mobtxtKeyReleased
        // TODO add your handling code here:
        String pattern="^[0-9]{1,20}$";
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(mobtxt.getText());
        if(!match.matches())
        {
            mobval.setText("Ineger Number Only");
        }
        else
        {
               mobval.setText("");
        }
    }//GEN-LAST:event_mobtxtKeyReleased

    private void emailtxtKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_emailtxtKeyReleased
        // TODO add your handling code here:
        String pattern="^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";
        Pattern patt=Pattern.compile(pattern);
        Matcher match=patt.matcher(emailtxt.getText());
        if(!match.matches())
        {
            emailval.setText("Not Valid Email");
        }
        else
        {
               emailval.setText("");
        }
    }//GEN-LAST:event_emailtxtKeyReleased

    private void browsebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_browsebtnActionPerformed
        // TODO add your handling code here:
        try
        {
            UIManager.setLookAndFeel(UIManager.getSystemLookAndFeelClassName());
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        JFileChooser browse = new JFileChooser();
        browse.setMultiSelectionEnabled(true);
        browse.setFileSelectionMode(JFileChooser.FILES_ONLY);
        browse.setFileHidingEnabled(false);
        if (browse.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
            java.io.File f = browse.getSelectedFile();
            // System.out.println(f.getPath());
            uploadimgtxt.setText(f.getPath());
        }
        else if(browse.showOpenDialog(null) == JFileChooser.CANCEL_OPTION)
        JOptionPane.showMessageDialog(this,"No File Select");

    }//GEN-LAST:event_browsebtnActionPerformed
    
   
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browsebtn;
    private javax.swing.JComboBox<String> datecombo;
    private javax.swing.JComboBox<String> deptcombo;
    private javax.swing.JComboBox<String> desigcombo;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JLabel emailval;
    private javax.swing.JTextField facultyidtxt;
    private javax.swing.JRadioButton female_radiobtn;
    private javax.swing.JLabel fidval;
    private javax.swing.JTextField fnametxt;
    private javax.swing.JLabel fnameval;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JRadioButton maleradiobtn;
    private javax.swing.JTextField mobtxt;
    private javax.swing.JLabel mobval;
    private javax.swing.JComboBox<String> monthcombo;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton savebtn;
    private javax.swing.JTextField uploadimgtxt;
    private javax.swing.JComboBox<String> yearcombo;
    // End of variables declaration//GEN-END:variables


    
}




