/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package college.student.mangement.system;

import static java.lang.Short.TYPE;
import java.sql.Connection;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import javax.swing.Icon;
import javax.swing.JOptionPane;
import javax.tools.DocumentationTool.Location;
import student.NewClass;


/**
 *
 * @author LAKSHITHA
 */
public class NewStudent extends javax.swing.JFrame {

    /**
     * Creates new form NewStudent
     */
    public NewStudent() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jTextField5 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();
        jComboBox4 = new javax.swing.JComboBox<>();
        jComboBox5 = new javax.swing.JComboBox<>();
        jComboBox6 = new javax.swing.JComboBox<>();
        jComboBox7 = new javax.swing.JComboBox<>();
        jComboBox8 = new javax.swing.JComboBox<>();
        jComboBox9 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();
        jLabel17 = new javax.swing.JLabel();
        jButton4 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel19 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setLocation(new java.awt.Point(0, 230));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel1.setText("Student ID");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 158, 97, -1));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel2.setText("Name");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 213, 69, -1));

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel3.setText("SurName");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 275, 113, -1));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel4.setText("Address");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 337, -1, -1));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel5.setText("Gender");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 401, 60, -1));

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel6.setText("Mobile Number");
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 469, -1, -1));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel7.setText("Nic No");
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 522, 59, -1));

        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 155, 162, -1));

        jTextField2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 210, 162, -1));

        jTextField3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        getContentPane().add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 272, 162, -1));

        jTextField4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        getContentPane().add(jTextField4, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 334, 162, -1));

        jTextField5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        getContentPane().add(jTextField5, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 466, 162, -1));

        jTextField6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        getContentPane().add(jTextField6, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 519, 162, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel8.setText("Date");
        getContentPane().add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 581, 42, -1));

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel9.setText("Mathas");
        getContentPane().add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 158, 66, -1));

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel10.setText("English");
        getContentPane().add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 213, -1, -1));

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel11.setText("Web Development");
        getContentPane().add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 275, -1, -1));

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel12.setText("Moblile Application");
        getContentPane().add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 337, -1, -1));

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel13.setText(" Object Oriyented");
        getContentPane().add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 401, -1, -1));

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel14.setText("Data Analze");
        getContentPane().add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 469, -1, -1));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel15.setText("Graphic Design");
        getContentPane().add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 522, -1, -1));

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jLabel16.setText("Free And Open Souce");
        getContentPane().add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(649, 581, -1, -1));

        jComboBox1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Male", "Female" }));
        getContentPane().add(jComboBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 398, 162, -1));

        jComboBox2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));
        getContentPane().add(jComboBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 155, 181, -1));

        jComboBox3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));
        getContentPane().add(jComboBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 210, 181, -1));

        jComboBox4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jComboBox4.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));
        getContentPane().add(jComboBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 272, 181, -1));

        jComboBox5.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jComboBox5.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));
        getContentPane().add(jComboBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 334, 181, -1));

        jComboBox6.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jComboBox6.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));
        getContentPane().add(jComboBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 398, 181, -1));

        jComboBox7.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jComboBox7.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));
        getContentPane().add(jComboBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 466, 181, -1));

        jComboBox8.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jComboBox8.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));
        getContentPane().add(jComboBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 519, 181, -1));

        jComboBox9.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jComboBox9.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select", "Yes", "No" }));
        getContentPane().add(jComboBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(875, 578, 181, -1));

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAKSHITHA\\Documents\\NetBeansProjects\\College Student Mangement System\\src\\image\\HMS ICON\\save-icon--1.png")); // NOI18N
        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(153, 662, -1, -1));

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAKSHITHA\\Documents\\NetBeansProjects\\College Student Mangement System\\src\\image\\HMS ICON\\icons8-synchronize-24.png")); // NOI18N
        jButton2.setText("Clear");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(548, 662, -1, -1));

        jButton3.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAKSHITHA\\Documents\\NetBeansProjects\\College Student Mangement System\\src\\image\\HMS ICON\\Close.png")); // NOI18N
        jButton3.setText("Close");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1100, 660, -1, -1));

        jDateChooser1.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        getContentPane().add(jDateChooser1, new org.netbeans.lib.awtextra.AbsoluteConstraints(302, 581, 162, -1));

        jLabel17.setFont(new java.awt.Font("Arial Black", 1, 32)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(0, 204, 0));
        jLabel17.setText("New Student Record");
        getContentPane().add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(604, 43, -1, -1));

        jButton4.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAKSHITHA\\Documents\\NetBeansProjects\\College Student Mangement System\\src\\image\\HMS ICON\\icons8-printer-28.png")); // NOI18N
        jButton4.setText("Print Card");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(1700, 650, -1, -1));

        jTextArea1.setColumns(20);
        jTextArea1.setFont(new java.awt.Font("Arial Black", 1, 15)); // NOI18N
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        getContentPane().add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1270, 150, 590, 470));

        jLabel19.setText("jLabel19");
        getContentPane().add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 40, -1, -1));

        jLabel18.setIcon(new javax.swing.ImageIcon("C:\\Users\\LAKSHITHA\\Documents\\NetBeansProjects\\College Student Mangement System\\src\\image\\St.jpg")); // NOI18N
        jLabel18.setText("jLabel18");
        getContentPane().add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -160, 2000, 1020));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
       setVisible(false);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
//Insert the data to database on sql Quear
        String student_ID=jTextField1.getText();
        String name=jTextField2.getText();
        String sur_Name=jTextField3.getText();
        String address=jTextField4.getText();
        String gender=(String)jComboBox1.getSelectedItem();
        String mobile_Number=jTextField5.getText();
        String nicNo=jTextField6.getText();
        SimpleDateFormat dateFormat= new SimpleDateFormat("mm-dd-yyy");
        String Date=dateFormat.format(jDateChooser1.getDate());
        String mathas=(String)jComboBox2.getSelectedItem();
        String english=(String)jComboBox3.getSelectedItem();
        String web_Development=(String)jComboBox4.getSelectedItem();
        String mobile_Application=(String)jComboBox5.getSelectedItem();
        String object_Oriyented=(String)jComboBox6.getSelectedItem();
        String data_Analze=(String)jComboBox7.getSelectedItem();
        String graphic_Design=(String)jComboBox8.getSelectedItem();
        String free_And_OpenSouce=(String)jComboBox9.getSelectedItem();
        
        try{
            Connection con=NewClass.getCon();
            Statement st=con.createStatement();
            st.execute("insert into record values('"+student_ID+"','"+name+"','"+sur_Name+"','"+address+"','"+gender+"','"+mobile_Number+"','"+nicNo+"','"+Date+"','"+mathas+"','"+english+"','"+web_Development+"','"+mobile_Application+"','"+object_Oriyented+"','"+data_Analze+"','"+graphic_Design+"','"+free_And_OpenSouce+"')");
            Icon icon=new javax.swing.ImageIcon("C:\\Users\\LAKSHITHA\\Downloads\\icons8-ok-68.png");
            JOptionPane.showMessageDialog(this,"<html><b style=\"color:green; font-size:16px;\">Data Saved Successfully</b></html>", "Clicky POS - Notification" ,JOptionPane.INFORMATION_MESSAGE,icon);
                        
            setVisible(false);
            new NewStudent().setVisible(true);
        }
        
        catch(Exception e)
        {
         
           Icon icon=new javax.swing.ImageIcon("C:\\Users\\LAKSHITHA\\Downloads\\icons8-close-window-48.png");
           JOptionPane.showMessageDialog(this,"Data Saved UnSuccessfully", "Clickey.Pos - Notification", JOptionPane.ERROR_MESSAGE,icon);       
        }
        
              
        
        
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
//Print Card
        recipt();
         
         try{
            jTextArea1.print();
            JOptionPane.showMessageDialog(null, "Print Succssfully");
         
         }catch(Exception e){
             JOptionPane.showMessageDialog(null, "Print UnSuccssfully");
         
         }
    }//GEN-LAST:event_jButton4ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
//Clear the Data
      jTextArea1.setText("");
      jTextField1.setText("");
      jTextField2.setText("");
      jTextField3.setText("");
      jTextField4.setText("");
      jTextField5.setText("");
      jTextField6.setText("");
      jComboBox1.setSelectedIndex(0);
      jComboBox2.setSelectedIndex(0);
      jComboBox3.setSelectedIndex(0);
      jComboBox4.setSelectedIndex(0);
      jComboBox5.setSelectedIndex(0);
      jComboBox6.setSelectedIndex(0);
     jComboBox7.setSelectedIndex(0);
     jComboBox8.setSelectedIndex(0);
      jComboBox9.setSelectedIndex(0);
     jDateChooser1.setCalendar(null);
     
     
     Notification ni =new Notification();
     ni.setVisible(true);
     
    }//GEN-LAST:event_jButton2ActionPerformed

    public void recipt(){
    
    
        String studentID=jTextField1.getText();
        String name=jTextField2.getText();
        String surName=jTextField3.getText();
        String address=jTextField4.getText();
        String gender=(String)jComboBox1.getSelectedItem();
        String mobileNUmber=jTextField5.getText();
        String nicNo=jTextField6.getText();
       
        String mathas=(String)jComboBox2.getSelectedItem();
        String english=(String)jComboBox3.getSelectedItem();
        String webDevelopment=(String)jComboBox4.getSelectedItem();
        String mobileApplication=(String)jComboBox5.getSelectedItem();
        String objectOriyented=(String)jComboBox6.getSelectedItem();
        String dataAnalze=(String)jComboBox7.getSelectedItem();
        String graphicDesign=(String)jComboBox8.getSelectedItem();
        String freeAndOpenSouce=(String)jComboBox9.getSelectedItem();
        
    
    
    jTextArea1.setText(jTextArea1.getText()+"************************************************************************************\n"  );
    jTextArea1.setText(jTextArea1.getText()+"**                           Hansika Privat Colloge                               **\n"  );
    jTextArea1.setText(jTextArea1.getText()+"*************************************************************************************\n"  );
    jTextArea1.setText(jTextArea1.getText()+"\n"  );
    
     jTextArea1.setText(jTextArea1.getText()+"studentID       :"+studentID+"\n"+"\n"  );
     jTextArea1.setText(jTextArea1.getText()+"name            :"+name +"\n"+"\n"  );
     jTextArea1.setText(jTextArea1.getText()+"surName         :"+surName +"\n"+"\n"  );
     jTextArea1.setText(jTextArea1.getText()+"address         :"+address +"\n"+"\n"  );
     jTextArea1.setText(jTextArea1.getText()+"gender          :"+gender+"\n"+"\n"  ); 
     jTextArea1.setText(jTextArea1.getText()+"mobileNUmber    :"+mobileNUmber+"\n"+"\n"  );
     jTextArea1.setText(jTextArea1.getText()+"nicNo           :"+nicNo+"\n"+"\n"  );
   
     jTextArea1.setText(jTextArea1.getText()+"mathas          :"+mathas +"\n"+"\n"  );
     jTextArea1.setText(jTextArea1.getText()+"english         :"+english +"\n"+"\n"  );
     jTextArea1.setText(jTextArea1.getText()+"webDevelopment  :"+webDevelopment +"\n"+"\n"  );
     jTextArea1.setText(jTextArea1.getText()+"mobileApplication :"+mobileApplication +"\n"+"\n"  );
     jTextArea1.setText(jTextArea1.getText()+"objectOriyented :"+objectOriyented +"\n"+"\n"  );
     jTextArea1.setText(jTextArea1.getText()+"dataAnalze      :"+dataAnalze+"\n"+"\n"  );
     jTextArea1.setText(jTextArea1.getText()+"graphicDesign   :"+graphicDesign +"\n"+"\n"  );
     jTextArea1.setText(jTextArea1.getText()+"freeAndOpenSouce:"+freeAndOpenSouce +"\n"+"\n"  );

     jTextArea1.setText(jTextArea1.getText()+"\n"  );
     
     
    
  
     jTextArea1.setText(jTextArea1.getText()+"***************************************************************************************\n"  );
     jTextArea1.setText(jTextArea1.getText()+"                                                                                       \n"  );
     jTextArea1.setText(jTextArea1.getText()+"***************************************************************************************\n"  );
     jTextArea1.setText(jTextArea1.getText()+"\n"  );
     jTextArea1.setText(jTextArea1.getText()+"                                 Contact Us T.P.Number 011-222440                       \n"  );
     jTextArea1.setText(jTextArea1.getText()+"****************************************************************************************\n"  );
     
    
    java.util.Date obj =new java.util.Date();
    String  date=obj.toString();
    
    
    }
    
    
    
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
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewStudent.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewStudent().setVisible(true);
            }
        });
    }

    
    
    
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JComboBox<String> jComboBox4;
    private javax.swing.JComboBox<String> jComboBox5;
    private javax.swing.JComboBox<String> jComboBox6;
    private javax.swing.JComboBox<String> jComboBox7;
    private javax.swing.JComboBox<String> jComboBox8;
    private javax.swing.JComboBox<String> jComboBox9;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField5;
    private javax.swing.JTextField jTextField6;
    // End of variables declaration//GEN-END:variables
}
