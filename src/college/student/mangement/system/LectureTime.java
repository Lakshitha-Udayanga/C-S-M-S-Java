/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college.student.mangement.system;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import net.proteanit.sql.DbUtils;
import student.NewClass;
import java.sql.*;
import java.text.MessageFormat;
import java.text.SimpleDateFormat;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author LAKSHITHA
 */
public class LectureTime extends javax.swing.JFrame {

    public int flag = 0;
    private Object e;

    /**
     * Creates new form LectureTime
     */
    public LectureTime() {
        initComponents();
        jLabel3.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton3 = new javax.swing.JButton();
        jTextField3 = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        jTable2 = new javax.swing.JTable();
        jLabel8 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 230));
        setUndecorated(true);
        addComponentListener(new java.awt.event.ComponentAdapter() {
            public void componentShown(java.awt.event.ComponentEvent evt) {
                formComponentShown(evt);
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAKSHITHA\\Documents\\NetBeansProjects\\College Student Mangement System\\src\\image\\HMS ICON\\Close.png")); // NOI18N
        jButton1.setText("Close");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1750, 700, -1, -1));

        jLabel1.setFont(new java.awt.Font("Arial Black", 1, 32)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 0));
        jLabel1.setText("Exam Time table");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(694, 21, 363, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Nic No");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 110, -1, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(735, 107, 252, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAKSHITHA\\Documents\\NetBeansProjects\\College Student Mangement System\\src\\image\\HMS ICON\\search.png")); // NOI18N
        jButton2.setText("Search");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(1067, 106, -1, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 13)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(204, 0, 0));
        jLabel3.setText("Nic No Not Work");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 150, -1, -1));

        jTable1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(jTable1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(63, 179, 1756, 108));

        jLabel4.setFont(new java.awt.Font("Arial Black", 1, 19)); // NOI18N
        jLabel4.setText("Subject");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 540, -1, -1));

        jLabel5.setFont(new java.awt.Font("Arial Black", 1, 19)); // NOI18N
        jLabel5.setText("Date");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 610, -1, -1));

        jLabel6.setFont(new java.awt.Font("Arial Black", 1, 19)); // NOI18N
        jLabel6.setText("Start Time");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 380, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "M_1213", "E_1214", "Web_1215", "Moblile_1216", "Object_1217", "Data_1218", "Graphic_1219", "F A O S_1220" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 470, 180, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAKSHITHA\\Documents\\NetBeansProjects\\College Student Mangement System\\src\\image\\HMS ICON\\save-icon--1.png")); // NOI18N
        jButton3.setText("Save");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(34, 701, -1, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 380, 200, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAKSHITHA\\Documents\\NetBeansProjects\\College Student Mangement System\\src\\image\\HMS ICON\\icons8-printer-28.png")); // NOI18N
        jButton4.setText("Print");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1220, 700, 120, -1));

        jButton5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton5.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAKSHITHA\\Documents\\NetBeansProjects\\College Student Mangement System\\src\\image\\HMS ICON\\icons8-synchronize-24.png")); // NOI18N
        jButton5.setText("Clear");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 700, -1, -1));

        jButton6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton6.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAKSHITHA\\Documents\\NetBeansProjects\\College Student Mangement System\\src\\image\\HMS ICON\\Ex history.png")); // NOI18N
        jButton6.setText("History Of the Exam");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1590, 30, 260, 80));

        jButton7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton7.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAKSHITHA\\Documents\\NetBeansProjects\\College Student Mangement System\\src\\image\\HMS ICON\\Add data.png")); // NOI18N
        jButton7.setText("Add Data");
        jButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton7ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(920, 700, -1, -1));

        jTable2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jTable2.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "SubjectID", "Subject", "Date", "StartTime", "EndTime"
            }
        ));
        jScrollPane3.setViewportView(jTable2);

        getContentPane().add(jScrollPane3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1070, 350, 750, 290));

        jLabel8.setFont(new java.awt.Font("Arial Black", 1, 19)); // NOI18N
        jLabel8.setText("Exam ID");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 390, -1, -1));

        jButton8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton8.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAKSHITHA\\Documents\\NetBeansProjects\\College Student Mangement System\\src\\image\\HMS ICON\\up time table.png")); // NOI18N
        jButton8.setText("Update Time Table");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 50, 250, 80));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 390, 180, -1));

        jLabel9.setFont(new java.awt.Font("Arial Black", 1, 19)); // NOI18N
        jLabel9.setText("Subject ID");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 470, -1, -1));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Mathas", "English", "Web Development", "Moblile Application", "Object Oriyented", "Data Analze", "Graphic Design", "Free And Open Souce" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 540, -1, -1));

        jLabel7.setFont(new java.awt.Font("Arial Black", 1, 19)); // NOI18N
        jLabel7.setText("End Time");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(620, 470, -1, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 470, 200, -1));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAKSHITHA\\Documents\\NetBeansProjects\\College Student Mangement System\\src\\image\\E1.jpg")); // NOI18N
        jLabel10.setText("jLabel10");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1900, 800));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        setVisible(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formComponentShown(java.awt.event.ComponentEvent evt) {//GEN-FIRST:event_formComponentShown
        // data Auto Display the table
        try {
            Connection con = NewClass.getCon();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select *from record where record.student_ID");

            jTable1.setModel(DbUtils.resultSetToTableModel(rs));

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_formComponentShown

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//Search the Data in the database
        String nicNo = jTextField1.getText();
        try {
            Connection con = NewClass.getCon();
            Statement st = con.createStatement();

            ResultSet rs = st.executeQuery("select *from record where nicNo='" + nicNo + "'");

            jTable1.setModel(DbUtils.resultSetToTableModel(rs));
            if (!rs.first()) {
                jLabel3.setVisible(true);
            } else {
                jLabel3.setVisible(false);
                jTextField1.setEditable(false);
                flag = 1;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Data Searched Succssfully");
        }
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        new HistoryOftheExam().setVisible(true);
    }//GEN-LAST:event_jButton6ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        //Print the Details

        MessageFormat header = new MessageFormat(" Time Table of the Print page");
        MessageFormat footer = new MessageFormat("page (0,number,integer");

        try {
            jTable2.print(JTable.PrintMode.NORMAL, header, footer);

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);

        }
        JOptionPane.showMessageDialog(null, " Print Succssfully");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        //Clear the Data
        jTextField1.setText("");
        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
//       jDateChooser1.setCalendar(null);
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
        jTable2.setModel(new DefaultTableModel(null, new String[]{"ID", "subjectID", "Subject", "date", "Starttime", "EndTime"}));

    }//GEN-LAST:event_jButton5ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        //Insert the data to database on sql Quear
        String ID = jTextField2.getText();
        String subjectID = (String) jComboBox1.getSelectedItem();
        String subject = (String) jComboBox2.getSelectedItem();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd-mm-yyy");
//        String date=dateFormat.format(jDateChooser1.getDate());
        String date = null;
        String startTime = jTextField3.getText();
        String endTime = jTextField4.getText();
        String nicNo = jTextField1.getText();

        try {
            if (!ID.isEmpty()) {
                if (!nicNo.isEmpty()) {
                    Connection con = NewClass.getCon();
                    Statement st = con.createStatement();
                    st.execute("insert into timeTable values('" + ID + "','" + subjectID + "','" + subject + "','" + date + "','" + startTime + "','" + endTime + "','" + nicNo + "')");
                    JOptionPane.showMessageDialog(null, " Data Saveed Successfully ");
                } else {
                    JOptionPane.showMessageDialog(null, "Plaze Seach the student.! ");
                }
            } else {
                JOptionPane.showMessageDialog(null, "Exam ID is can not empty.! ");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton7ActionPerformed
//Display the Data on table
        SimpleDateFormat dateFormat = new SimpleDateFormat("mm-dd-yyy");
//        String Date = dateFormat.format(jDateChooser1.getDate());
        DefaultTableModel Model = (DefaultTableModel) jTable2.getModel();
        Model.addRow(new Object[]{jTextField2.getText(), jComboBox1.getSelectedItem(), jComboBox2.getSelectedItem(), jTextField3.getText(), jTextField4.getText()});
        JOptionPane.showMessageDialog(null, " Data Add Successfully");

        jTextField2.setText("");
        jTextField3.setText("");
        jTextField4.setText("");
        jComboBox1.setSelectedIndex(0);
        jComboBox2.setSelectedIndex(0);
//        jDateChooser1.setCalendar(null);


    }//GEN-LAST:event_jButton7ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        new UpdateTimeTable().setVisible(true);
    }//GEN-LAST:event_jButton8ActionPerformed

    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(LectureTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LectureTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LectureTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LectureTime.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LectureTime().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTable jTable1;
    private javax.swing.JTable jTable2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
