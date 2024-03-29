/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hevenly;

import javax.swing.JOptionPane;
import java.sql.*;
import hevenly.Database.DatabaseConnector;

/**
 *
 * @author MSii
 */
public class Rate extends javax.swing.JFrame {

    /**
     * Creates new form Rate
     */
    public Rate() {
        initComponents();
        
        getContentPane().setBackground(new java.awt.Color(190, 168, 149));
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn_rate_and_log_out = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        spinner_rate_service = new javax.swing.JSpinner();
        spinner_rate_product = new javax.swing.JSpinner();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txt_location = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txt_bill_id = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btn_rate_and_log_out.setBackground(new java.awt.Color(255, 224, 212));
        btn_rate_and_log_out.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        btn_rate_and_log_out.setForeground(new java.awt.Color(95, 0, 0));
        btn_rate_and_log_out.setText("Log Out");
        btn_rate_and_log_out.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_rate_and_log_outActionPerformed(evt);
            }
        });
        getContentPane().add(btn_rate_and_log_out, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 390, 130, 30));

        jLabel1.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Service 0-10");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(720, 280, -1, -1));
        getContentPane().add(spinner_rate_service, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 270, 100, 50));
        getContentPane().add(spinner_rate_product, new org.netbeans.lib.awtextra.AbsoluteConstraints(950, 180, 100, 50));

        jLabel2.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Product 0-10");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 200, -1, -1));

        jLabel3.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Bill id");
        getContentPane().add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 20, -1, -1));

        txt_location.setText("0");
        getContentPane().add(txt_location, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 60, -1, -1));

        jLabel4.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("please rate 0-10");
        getContentPane().add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 140, -1, -1));

        jLabel5.setFont(new java.awt.Font("Book Antiqua", 0, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Location");
        getContentPane().add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 60, -1, -1));

        txt_bill_id.setText("0");
        getContentPane().add(txt_bill_id, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 20, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSii\\Desktop\\EADCW\\customer\\gif_coffee.gif")); // NOI18N
        getContentPane().add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 80, 500, 350));

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSii\\Desktop\\EADCW\\update customer\\img_cup_cake.jpg")); // NOI18N
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 0, 590, 530));

        pack();
    }// </editor-fold>//GEN-END:initComponents
       Connection con = null;
       PreparedStatement pst = null;
    
    private void btn_rate_and_log_outActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_rate_and_log_outActionPerformed
        
        
       int i =(int) spinner_rate_product.getValue();
       int j =(int) spinner_rate_service.getValue();
       String k = txt_location.getText();
        if(i < 0 ){
               JOptionPane.showMessageDialog(this, "invalid rate","order", JOptionPane.ERROR_MESSAGE); 
        }
        else if(i>10){
               JOptionPane.showMessageDialog(this, "invalid rate","order", JOptionPane.ERROR_MESSAGE); 
        }
        else if(j<0){
               JOptionPane.showMessageDialog(this, "invalid rate","order", JOptionPane.ERROR_MESSAGE); 
        }
        else if(j>10){
               JOptionPane.showMessageDialog(this, "invalid rate","order", JOptionPane.ERROR_MESSAGE); 
        }
        else
        {      try{
               con = DatabaseConnector.connect();
               String q = "update bill set product_rate= '"+spinner_rate_product.getValue()+"' where bill_id='"+txt_bill_id.getText()+"'";
               
               pst  = con.prepareStatement(q);
               pst.execute();
               
               String r = "update bill set service_rate='"+spinner_rate_service.getValue()+"' where bill_id='"+txt_bill_id.getText()+"'";
              
               pst  = con.prepareStatement(r);
               pst.execute();
               
               JOptionPane.showMessageDialog(this, "thank you for your feedback","rate added succsessfuly", JOptionPane.INFORMATION_MESSAGE); 
               }
               catch(Exception e){
               JOptionPane.showMessageDialog(this, "cannot save your rate","error", JOptionPane.ERROR_MESSAGE);         
               }
        
        
        if(k=="DriveThru")
            {
                Start l = new Start();
                l.setVisible(true);
                this.dispose();
                
            }
        else if(k=="TakeAway")
            {
                Start l = new Start();
                l.setVisible(true);
                this.dispose();
                
            }
        else
            {
                try{
                con = DatabaseConnector.connect();
                String q = "update customertable set status='available' where table_no='"+k+"'";
                pst  = con.prepareStatement(q);
                pst.execute();
        
                JOptionPane.showMessageDialog(this, "from now ,your table available for other customers. this does not apply to the drive thru and take away services","log out", JOptionPane.INFORMATION_MESSAGE);     
                
                Start l = new Start();
                l.setVisible(true);
                this.dispose();
                
                }
               catch(Exception e){
                JOptionPane.showMessageDialog(this, "cannot change table status 'available' for other customers please let staff know about this problem ","error", JOptionPane.ERROR_MESSAGE);          
                }
            }
        }
    }//GEN-LAST:event_btn_rate_and_log_outActionPerformed

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
            java.util.logging.Logger.getLogger(Rate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Rate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Rate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Rate.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Rate().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_rate_and_log_out;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JSpinner spinner_rate_product;
    private javax.swing.JSpinner spinner_rate_service;
    public javax.swing.JTextField txt_bill_id;
    public javax.swing.JTextField txt_location;
    // End of variables declaration//GEN-END:variables
}
