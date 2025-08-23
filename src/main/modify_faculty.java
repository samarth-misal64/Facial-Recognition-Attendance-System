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
import java.sql.Statement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileNameExtensionFilter;

public class modify_faculty extends javax.swing.JPanel {

    
    public modify_faculty() {
        initComponents();
   }

    Connection con=null;
    PreparedStatement ps = null;
    ResultSet rs=null;
    Statement st=null;
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jComboBox6 = new javax.swing.JComboBox<>();
        updatebtn = new javax.swing.JButton();
        resetbtn = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        facultyidtxt = new javax.swing.JTextField();
        nextbtn = new javax.swing.JButton();
        fidval = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        fnametxt = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        emailtxt = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        mobtxt = new javax.swing.JTextField();
        deptcombo = new javax.swing.JComboBox<>();
        browsebtn = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        desigcombo = new javax.swing.JComboBox<>();
        uploadimgtxt = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        modifyidtxt = new javax.swing.JTextField();
        fnameval = new javax.swing.JLabel();
        emailval = new javax.swing.JLabel();
        mobval = new javax.swing.JLabel();

        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(51, 51, 51));
        setMaximumSize(new java.awt.Dimension(740, 520));
        setMinimumSize(new java.awt.Dimension(740, 520));
        setPreferredSize(new java.awt.Dimension(740, 520));

        updatebtn.setBackground(new java.awt.Color(255, 255, 255));
        updatebtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        updatebtn.setForeground(new java.awt.Color(51, 51, 51));
        updatebtn.setText("UPDATE DETAILS");
        updatebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                updatebtnActionPerformed(evt);
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

        jPanel1.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)), " SELECT FACULTY ", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("FACULTY ID :");
        jLabel1.setToolTipText("");

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

        nextbtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        nextbtn.setText("NEXT");
        nextbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nextbtnActionPerformed(evt);
            }
        });

        fidval.setForeground(java.awt.Color.red);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(facultyidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(fidval))
                    .addComponent(nextbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(89, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(facultyidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fidval))
                .addGap(18, 18, 18)
                .addComponent(nextbtn)
                .addGap(14, 14, 14))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(51, 51, 51)), "MODIFY DETAILS", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 1, 12))); // NOI18N

        fnametxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fnametxt.setForeground(new java.awt.Color(51, 51, 51));
        fnametxt.setAutoscrolls(false);
        fnametxt.setMinimumSize(new java.awt.Dimension(6, 25));
        fnametxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                fnametxtKeyReleased(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 51, 51));
        jLabel7.setText("EMAIL ID:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(51, 51, 51));
        jLabel4.setText("DEPARTMENT :");

        emailtxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        emailtxt.setForeground(new java.awt.Color(51, 51, 51));
        emailtxt.setAutoscrolls(false);
        emailtxt.setMinimumSize(new java.awt.Dimension(6, 25));
        emailtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                emailtxtKeyReleased(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 51, 51));
        jLabel10.setText("DESIGNATION :");
        jLabel10.setToolTipText("");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 51, 51));
        jLabel11.setText("FACULTY NAME :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 51, 51));
        jLabel8.setText("UPLOAD IMAGE :");

        mobtxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        mobtxt.setForeground(new java.awt.Color(51, 51, 51));
        mobtxt.setAutoscrolls(false);
        mobtxt.setMinimumSize(new java.awt.Dimension(6, 25));
        mobtxt.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                mobtxtKeyReleased(evt);
            }
        });

        deptcombo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deptcombo.setForeground(new java.awt.Color(51, 51, 51));
        deptcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Computer Science (CS)", "Mechanical (ME)", "Information Technology(IT)", "Chemical(CE)" }));
        deptcombo.setMinimumSize(new java.awt.Dimension(6, 25));

        browsebtn.setBackground(new java.awt.Color(255, 255, 255));
        browsebtn.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        browsebtn.setForeground(new java.awt.Color(51, 51, 51));
        browsebtn.setText("BROWSE");
        browsebtn.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        browsebtn.setHorizontalTextPosition(javax.swing.SwingConstants.LEADING);
        browsebtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                browsebtnActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("MOBILE NO :");

        desigcombo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        desigcombo.setForeground(new java.awt.Color(51, 51, 51));
        desigcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "HOD", "PREOFESSOR" }));
        desigcombo.setMinimumSize(new java.awt.Dimension(6, 25));

        uploadimgtxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        uploadimgtxt.setForeground(new java.awt.Color(51, 51, 51));
        uploadimgtxt.setAutoscrolls(false);
        uploadimgtxt.setMinimumSize(new java.awt.Dimension(6, 25));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setForeground(new java.awt.Color(51, 51, 51));
        jLabel12.setText("FACULTY ID :");

        modifyidtxt.setEditable(false);
        modifyidtxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        modifyidtxt.setForeground(new java.awt.Color(51, 51, 51));
        modifyidtxt.setAutoscrolls(false);
        modifyidtxt.setMinimumSize(new java.awt.Dimension(6, 25));
        modifyidtxt.setPreferredSize(new java.awt.Dimension(72, 25));

        fnameval.setForeground(java.awt.Color.red);

        emailval.setForeground(java.awt.Color.red);

        mobval.setForeground(java.awt.Color.red);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jLabel4)
                    .addComponent(jLabel11)
                    .addComponent(jLabel5)
                    .addComponent(jLabel10)
                    .addComponent(jLabel12))
                .addGap(18, 18, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(deptcombo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(emailtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(emailval))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(uploadimgtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(browsebtn))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(fnametxt, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(desigcombo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(mobtxt, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 233, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fnameval)
                            .addComponent(mobval)))
                    .addComponent(modifyidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(modifyidtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fnametxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(fnameval))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(desigcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mobtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(mobval))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(emailtxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(emailval))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deptcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
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
                .addContainerGap(107, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(102, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(updatebtn)
                .addGap(18, 18, 18)
                .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(211, 211, 211))
            .addGroup(layout.createSequentialGroup()
                .addGap(150, 150, 150)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(updatebtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(resetbtn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(13, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

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
    
        JFileChooser browse= new JFileChooser();
        browse.setMultiSelectionEnabled(true);
        browse.setFileSelectionMode(JFileChooser.FILES_ONLY);
        browse.setFileHidingEnabled(false);
        if (browse.showOpenDialog(null) == JFileChooser.APPROVE_OPTION)
        {
           File f = browse.getSelectedFile();
           uploadimgtxt.setText(f.getPath());
        }
        else if(browse.showOpenDialog(null) == JFileChooser.CANCEL_OPTION)
                JOptionPane.showMessageDialog(this,"No File Select");
    }//GEN-LAST:event_browsebtnActionPerformed
    
    private void nextbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nextbtnActionPerformed
        // TODO add your handling code here:
        
        try
        {
            Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            con = DriverManager.getConnection("jdbc:ucanaccess://attendance_db/face_recog_db.accdb");
            st = con.createStatement();
            String sql ="Select f_id,f_designation,f_name,f_mobile,f_email,f_dept,f_dataset from faculty"
                    + " where f_id='"+facultyidtxt.getText()+"'";
            
            rs=st.executeQuery(sql);
            while(rs.next())
            {
                modifyidtxt.setText(String.valueOf(rs.getInt("f_id")));
                fnametxt.setText(rs.getString("f_name"));
                desigcombo.setSelectedItem(rs.getString("f_designation"));             
                mobtxt.setText(rs.getString("f_mobile"));
                emailtxt.setText(rs.getString("f_email"));
                deptcombo.setSelectedItem(rs.getString("f_dept"));
                uploadimgtxt.setText(rs.getString("f_dataset"));
            }
           
            rs.close();
            st.close();
            con.close();       
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this,ex);
        }
    }//GEN-LAST:event_nextbtnActionPerformed

    private void updatebtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_updatebtnActionPerformed
    
        if(validation())
        {
            try
            {
                Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
                con = DriverManager.getConnection("jdbc:ucanaccess://attendance_db/face_recog_db.accdb");

                String sql="update faculty set f_name='"+fnametxt.getText().toUpperCase()+"' ,f_designation='"+desigcombo.getSelectedItem().toString()
                        +"' ,f_mobile='"+mobtxt.getText()+"' ,f_email='"+emailtxt.getText()+"' ,f_dept='"+deptcombo.getSelectedItem().toString()
                        +"' ,f_dataset='"+uploadimgtxt.getText()+"' where f_id='"+modifyidtxt.getText()+"'";
                ps = con.prepareStatement(sql);

                int n = ps.executeUpdate();
                JOptionPane.showMessageDialog(this,"Updated Successfully..");
                ps.close();
                con.close();

            }
            catch(Exception ex){
                JOptionPane.showMessageDialog(this,ex);
            }
        }               
    }//GEN-LAST:event_updatebtnActionPerformed

    private void resetbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetbtnActionPerformed
        // TODO add your handling code here:
        facultyidtxt.setText(" ");
        modifyidtxt.setText(" ");
        fnametxt.setText(" ");
        mobtxt.setText(" ");
        emailtxt.setText(" ");
        uploadimgtxt.setText(" ");
        desigcombo.setSelectedItem("--Select--");
        deptcombo.setSelectedItem("--Select--");
        fidval.setText(" ");
        fnameval.setText(" ");
        mobval.setText(" ");
        emailval.setText(" ");
        
    }//GEN-LAST:event_resetbtnActionPerformed

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
        
        if(mobtxt.getText().isEmpty() || mobtxt.getText().length() < 10)
        {
            JOptionPane.showMessageDialog(this,"Please Enter 10 digit valid Mobile No.");
            return false;
        }
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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton browsebtn;
    private javax.swing.JComboBox<String> deptcombo;
    private javax.swing.JComboBox<String> desigcombo;
    private javax.swing.JTextField emailtxt;
    private javax.swing.JLabel emailval;
    private javax.swing.JTextField facultyidtxt;
    private javax.swing.JLabel fidval;
    private javax.swing.JTextField fnametxt;
    private javax.swing.JLabel fnameval;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField mobtxt;
    private javax.swing.JLabel mobval;
    private javax.swing.JTextField modifyidtxt;
    private javax.swing.JButton nextbtn;
    private javax.swing.JButton resetbtn;
    private javax.swing.JButton updatebtn;
    private javax.swing.JTextField uploadimgtxt;
    // End of variables declaration//GEN-END:variables


    
}




