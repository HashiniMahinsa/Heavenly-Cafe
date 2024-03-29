/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hevenly;

import static hevenly.CustermerRegistration.isValidPhone;
import javax.swing.JOptionPane;
import java.sql.*;
import hevenly.Database.DatabaseConnector;
import java.util.regex.Pattern;
import java.util.regex.*;
/**
 *
 * @author MSii
 */
public class UpdateCustomer extends javax.swing.JFrame {

    /**
     * Creates new form UpdateCustomer
     */
    public UpdateCustomer() {
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

        btn_customer_update_confirm = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_update_customer_old_phone_number = new javax.swing.JTextField();
        txt_update_customer_new_phone_number = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_customer_update_confirm.setBackground(new java.awt.Color(255, 224, 212));
        btn_customer_update_confirm.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        btn_customer_update_confirm.setForeground(new java.awt.Color(95, 0, 0));
        btn_customer_update_confirm.setText("comfirm");
        btn_customer_update_confirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_customer_update_confirmActionPerformed(evt);
            }
        });
        getContentPane().add(btn_customer_update_confirm, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 310, 110, 40));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("new phone number");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 210, -1, -1));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("old phone number");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 160, -1, -1));

        txt_update_customer_old_phone_number.setFont(new java.awt.Font("Book Antiqua", 0, 12)); // NOI18N
        getContentPane().add(txt_update_customer_old_phone_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 160, 270, -1));
        getContentPane().add(txt_update_customer_new_phone_number, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 210, 270, -1));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSii\\Desktop\\EADCW\\update customer\\img_cup_cake.jpg")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    Connection con = null;
    PreparedStatement pst = null;
    
    
    public static boolean isValidPhone(String phone){  
        String phoneFormate ="^([+]\\d{2})?\\d{10}$";  
          
        Pattern p = Pattern.compile(phoneFormate);  
        if(phone == null){  
        return false;  
        }   
        return p.matcher(phone).matches();  
    }
    
    
    private void btn_customer_update_confirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_customer_update_confirmActionPerformed
        if(isValidPhone(txt_update_customer_old_phone_number.getText()) == false)
        {
        JOptionPane.showMessageDialog(this, "Enter valid phone number","customer update profile", JOptionPane.ERROR_MESSAGE); 
        txt_update_customer_old_phone_number.setText("");
        }
        else if(isValidPhone(txt_update_customer_new_phone_number.getText()) == false)
        {
        JOptionPane.showMessageDialog(this, "Enter valid phone number","customer update profile", JOptionPane.ERROR_MESSAGE); 
        txt_update_customer_new_phone_number.setText("");
        }
        else{
        try{
        con = DatabaseConnector.connect();
        String q = "update customer set c_TP ='"+txt_update_customer_new_phone_number.getText()+"' where c_tp='"+txt_update_customer_old_phone_number.getText()+"'";
        pst  = con.prepareStatement(q);
        pst.execute();
        }
        
        catch(Exception e){
        JOptionPane.showMessageDialog(this, "Error please contact 0771477627","customer registration", JOptionPane.ERROR_MESSAGE); 
        }
        
        
        this.dispose();
        int response1 = JOptionPane.showConfirmDialog(this,"Are you sure?" , "Update profile",JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
         
        if(response1==JOptionPane.YES_OPTION)
        {
            
            this.dispose();
        
            
            JOptionPane.showMessageDialog(this, "Profile updated","Update profile", JOptionPane.INFORMATION_MESSAGE);  
        }
        
        else if(response1==JOptionPane.NO_OPTION)
        {
          this.setVisible(true);
            
        }
        
       
        
        }
    }//GEN-LAST:event_btn_customer_update_confirmActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(UpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UpdateCustomer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UpdateCustomer().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_customer_update_confirm;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txt_update_customer_new_phone_number;
    private javax.swing.JTextField txt_update_customer_old_phone_number;
    // End of variables declaration//GEN-END:variables
}
