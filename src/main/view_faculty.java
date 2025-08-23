/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author samar
 */
public class view_faculty extends javax.swing.JPanel {

    /**
     * Creates new form attendance_fill_manually
     */
    public view_faculty() {
        initComponents();
        SelectFaculty();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jScrollPane1 = new javax.swing.JScrollPane();
        facultytable = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        fnamecombo = new javax.swing.JComboBox<>();
        deptcombo = new javax.swing.JComboBox<>();
        facultyidtxt = new javax.swing.JTextField();
        showbtn = new javax.swing.JButton();

        setBackground(new java.awt.Color(255, 255, 255));
        setForeground(new java.awt.Color(51, 51, 51));
        setMaximumSize(new java.awt.Dimension(740, 520));
        setMinimumSize(new java.awt.Dimension(740, 520));
        setPreferredSize(new java.awt.Dimension(740, 520));

        facultytable.setAutoCreateRowSorter(true);
        facultytable.setFont(new java.awt.Font("Segoe UI", 0, 11)); // NOI18N
        facultytable.setForeground(new java.awt.Color(51, 51, 51));
        facultytable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "Faculty ID", "Designation", "Name", "DOB", "Mobile", "Gender", "Emaill", "Department"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        facultytable.setColumnSelectionAllowed(true);
        facultytable.setMinimumSize(new java.awt.Dimension(404, 440));
        facultytable.setPreferredSize(new java.awt.Dimension(404, 440));
        facultytable.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                facultytableMouseDragged(evt);
            }
        });
        jScrollPane1.setViewportView(facultytable);
        facultytable.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        if (facultytable.getColumnModel().getColumnCount() > 0) {
            facultytable.getColumnModel().getColumn(0).setMaxWidth(80);
            facultytable.getColumnModel().getColumn(2).setMaxWidth(80);
        }

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 51, 51));
        jLabel5.setText("FACULTY NAME :");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 51, 51));
        jLabel3.setText("FACULTY ID :");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 51));
        jLabel1.setText("DEPARTMENT :");
        jLabel1.setToolTipText("");

        fnamecombo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        fnamecombo.setForeground(new java.awt.Color(51, 51, 51));

        deptcombo.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        deptcombo.setForeground(new java.awt.Color(51, 51, 51));
        deptcombo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Select--", "Computer Science (CS)", "Mechanical (ME)", "Information Technology(IT)", "Chemical(CE)" }));
        deptcombo.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                deptcomboItemStateChanged(evt);
            }
        });
        deptcombo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                deptcomboMouseClicked(evt);
            }
        });

        facultyidtxt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        facultyidtxt.setForeground(new java.awt.Color(51, 51, 51));
        facultyidtxt.setAutoscrolls(false);
        facultyidtxt.setMinimumSize(new java.awt.Dimension(6, 25));
        facultyidtxt.setPreferredSize(new java.awt.Dimension(72, 25));
        facultyidtxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                facultyidtxtActionPerformed(evt);
            }
        });

        showbtn.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        showbtn.setText("SHOW");
        showbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showbtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(deptcombo, javax.swing.GroupLayout.PREFERRED_SIZE, 295, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(showbtn)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addComponent(facultyidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(30, 30, 30)
                                .addComponent(jLabel5)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(fnamecombo, 0, 318, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(7, 7, 7)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(deptcombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(facultyidtxt, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fnamecombo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(showbtn)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 387, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void facultytableMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_facultytableMouseDragged
        // TODO add your handling code here:
    }//GEN-LAST:event_facultytableMouseDragged

    private void deptcomboMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_deptcomboMouseClicked
        // TODO add your handling code here:
        SelectFaculty();
    }//GEN-LAST:event_deptcomboMouseClicked

    private void showbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showbtnActionPerformed
        // TODO add your handling code here:
       try
        {
         Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
            Con = DriverManager.getConnection("jdbc:ucanaccess://attendance_db/face_recog_db.accdb");
         St = Con.createStatement();
         
         if(deptcombo.getSelectedItem().toString() != "--Select--" && facultyidtxt.getText().isEmpty()
                 && fnamecombo.getSelectedItem().toString() == "--Select--")
         {
            String sql = "Select f_id,f_designation,f_name,f_dob,f_mobile,f_gender,f_email,f_dept from faculty where f_dept='"+deptcombo.getSelectedItem().toString()+"'";
            Rs = St.executeQuery(sql);
            facultytable.setModel(DbUtils.resultSetToTableModel(Rs));
         }
         else if (!facultyidtxt.getText().isEmpty())
         {
            String sql = "Select f_id,f_designation,f_name,f_dob,f_mobile,f_gender,f_email,f_dept from faculty where "
                    + "f_id='" +facultyidtxt.getText()+ "'";
            Rs = St.executeQuery(sql);
            facultytable.setModel(DbUtils.resultSetToTableModel(Rs));
         }
         else //if (fnamecombo.getSelectedIndex() != 0 )
         {
             String sql = "Select f_id,f_designation,f_name,f_dob,f_mobile,f_gender,f_email,f_dept from faculty where "
                    + "f_name='" + fnamecombo.getSelectedItem().toString() + "' and f_dept='" +deptcombo.getSelectedItem().toString()+ "'";
            Rs = St.executeQuery(sql);
            facultytable.setModel(DbUtils.resultSetToTableModel(Rs));

         }
         Rs.close();
         St.close();
         Con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }//GEN-LAST:event_showbtnActionPerformed

    private void deptcomboItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_deptcomboItemStateChanged
        // TODO add your handling code here:

    }//GEN-LAST:event_deptcomboItemStateChanged

    private void facultyidtxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_facultyidtxtActionPerformed
        fnamecombo.setSelectedIndex(0);
    }//GEN-LAST:event_facultyidtxtActionPerformed
     
    PreparedStatement ps = null;
    Connection Con = null;
    Statement St = null;
    ResultSet Rs=null;
    
    public void SelectFaculty()
     {
        fnamecombo.removeAllItems();
        try
        {
         Class.forName("net.ucanaccess.jdbc.UcanaccessDriver");
         Con = DriverManager.getConnection("jdbc:ucanaccess://attendance_db/face_recog_db.accdb");
         St = Con.createStatement();
        
         String dept = deptcombo.getSelectedItem().toString();
         Rs=St.executeQuery("select f_name from faculty where f_dept='"+deptcombo.getSelectedItem().toString()+"'");
         fnamecombo.addItem("--Select--");
         while(Rs.next())
            fnamecombo.addItem(Rs.getString("f_name"));  
         fnamecombo.setSelectedIndex(0);
         String sql ="select f_id,f_designation,f_name,f_dob,f_mobile,f_gender,f_email,f_dept from faculty ";
         Rs = St.executeQuery(sql);
         facultytable.setModel(DbUtils.resultSetToTableModel(Rs));
         
         Rs.close();
         St.close();
         Con.close();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
     }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JComboBox<String> deptcombo;
    private javax.swing.JTextField facultyidtxt;
    private javax.swing.JTable facultytable;
    private javax.swing.JComboBox<String> fnamecombo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton showbtn;
    // End of variables declaration//GEN-END:variables


    
}




