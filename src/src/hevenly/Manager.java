/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package hevenly;


import com.sun.jdi.connect.spi.Connection;
import javax.swing.JOptionPane;
import net.sf.jasperreports.engine.JasperCompileManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.design.JRDesignQuery;
import net.sf.jasperreports.engine.design.JasperDesign;
import net.sf.jasperreports.engine.xml.JRXmlLoader;
import net.sf.jasperreports.view.JasperViewer;
import hevenly.Database.DatabaseConnector;
import net.sf.jasperreports.engine.JRException;
import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;








/**
 *
 * @author MSii
 */


public class Manager extends javax.swing.JFrame {

    /**
     * Creates new form Manager
     */
    public Manager() {
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

        jLabel6 = new javax.swing.JLabel();
        btn_customer_report = new javax.swing.JButton();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jCheckBox5 = new javax.swing.JCheckBox();
        jCheckBox6 = new javax.swing.JCheckBox();
        jCheckBox7 = new javax.swing.JCheckBox();
        jCheckBox8 = new javax.swing.JCheckBox();
        jSpinner1 = new javax.swing.JSpinner();
        jSpinner2 = new javax.swing.JSpinner();
        jSpinner3 = new javax.swing.JSpinner();
        jSpinner4 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel73 = new javax.swing.JLabel();
        jLabel74 = new javax.swing.JLabel();
        jLabel75 = new javax.swing.JLabel();
        jLabel76 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jCheckBox9 = new javax.swing.JCheckBox();
        jCheckBox10 = new javax.swing.JCheckBox();
        jCheckBox11 = new javax.swing.JCheckBox();
        jCheckBox12 = new javax.swing.JCheckBox();
        jSpinner5 = new javax.swing.JSpinner();
        jSpinner6 = new javax.swing.JSpinner();
        jSpinner7 = new javax.swing.JSpinner();
        jSpinner8 = new javax.swing.JSpinner();
        jButton5 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();
        jButton7 = new javax.swing.JButton();
        jButton8 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel77 = new javax.swing.JLabel();
        jLabel78 = new javax.swing.JLabel();
        jLabel79 = new javax.swing.JLabel();
        jLabel80 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jCheckBox1 = new javax.swing.JCheckBox();
        jCheckBox2 = new javax.swing.JCheckBox();
        jCheckBox3 = new javax.swing.JCheckBox();
        jCheckBox4 = new javax.swing.JCheckBox();
        spinner_updatechicken_sandwich_price = new javax.swing.JSpinner();
        jSpinner14 = new javax.swing.JSpinner();
        jSpinner15 = new javax.swing.JSpinner();
        jSpinner16 = new javax.swing.JSpinner();
        btn_update_chicken_sandwich_price = new javax.swing.JButton();
        jButton14 = new javax.swing.JButton();
        jButton15 = new javax.swing.JButton();
        jButton16 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel85 = new javax.swing.JLabel();
        jLabel86 = new javax.swing.JLabel();
        jLabel87 = new javax.swing.JLabel();
        jLabel88 = new javax.swing.JLabel();
        txt_update_chicken_sandwich_price = new javax.swing.JTextField();
        jPanel4 = new javax.swing.JPanel();
        jCheckBox13 = new javax.swing.JCheckBox();
        jCheckBox14 = new javax.swing.JCheckBox();
        jCheckBox15 = new javax.swing.JCheckBox();
        jCheckBox16 = new javax.swing.JCheckBox();
        jSpinner9 = new javax.swing.JSpinner();
        jSpinner10 = new javax.swing.JSpinner();
        jSpinner11 = new javax.swing.JSpinner();
        jSpinner12 = new javax.swing.JSpinner();
        jButton9 = new javax.swing.JButton();
        jButton10 = new javax.swing.JButton();
        jButton11 = new javax.swing.JButton();
        jButton12 = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jLabel81 = new javax.swing.JLabel();
        jLabel82 = new javax.swing.JLabel();
        jLabel83 = new javax.swing.JLabel();
        jLabel84 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel6.setIcon(new javax.swing.ImageIcon("C:\\Users\\MSii\\Desktop\\EADCW\\update customer\\img_cup_cake.jpg")); // NOI18N

        btn_customer_report.setText("report");
        btn_customer_report.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_customer_reportActionPerformed(evt);
            }
        });

        jTabbedPane1.setBackground(new java.awt.Color(209, 181, 165));
        jTabbedPane1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(236, 227, 219));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox5.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jCheckBox5.setForeground(new java.awt.Color(48, 33, 24));
        jCheckBox5.setText("mocha");
        jPanel2.add(jCheckBox5, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 256, 176, -1));

        jCheckBox6.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jCheckBox6.setForeground(new java.awt.Color(48, 33, 24));
        jCheckBox6.setText("Americano");
        jPanel2.add(jCheckBox6, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 178, 176, -1));

        jCheckBox7.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jCheckBox7.setForeground(new java.awt.Color(48, 33, 24));
        jCheckBox7.setText("latte");
        jPanel2.add(jCheckBox7, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 32, 176, -1));

        jCheckBox8.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jCheckBox8.setForeground(new java.awt.Color(48, 33, 24));
        jCheckBox8.setText("cappuccino");
        jPanel2.add(jCheckBox8, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 100, 176, -1));

        jSpinner1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jPanel2.add(jSpinner1, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 41, -1, -1));

        jSpinner2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jPanel2.add(jSpinner2, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 109, -1, -1));

        jSpinner3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jPanel2.add(jSpinner3, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 187, -1, -1));

        jSpinner4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jPanel2.add(jSpinner4, new org.netbeans.lib.awtextra.AbsoluteConstraints(297, 265, -1, -1));

        jButton1.setBackground(new java.awt.Color(193, 154, 133));
        jButton1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jButton1.setText("Add");
        jPanel2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 187, -1, -1));

        jButton2.setBackground(new java.awt.Color(193, 154, 133));
        jButton2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jButton2.setText("Add");
        jPanel2.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 265, -1, -1));

        jButton3.setBackground(new java.awt.Color(193, 154, 133));
        jButton3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jButton3.setText("Add");
        jPanel2.add(jButton3, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 109, -1, -1));

        jButton4.setBackground(new java.awt.Color(193, 154, 133));
        jButton4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jButton4.setText("Add");
        jPanel2.add(jButton4, new org.netbeans.lib.awtextra.AbsoluteConstraints(411, 41, -1, -1));

        jLabel4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel4.setText("300");
        jPanel2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(227, 44, 37, -1));

        jLabel5.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel5.setText("300");
        jPanel2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 37, -1));

        jLabel7.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel7.setText("300");
        jPanel2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 37, -1));

        jLabel8.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel8.setText("300");
        jPanel2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 270, 37, -1));

        jLabel73.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel73.setText("Rs");
        jPanel2.add(jLabel73, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 44, -1, -1));

        jLabel74.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel74.setText("Rs");
        jPanel2.add(jLabel74, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, -1, -1));

        jLabel75.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel75.setText("Rs");
        jPanel2.add(jLabel75, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 190, -1, -1));

        jLabel76.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel76.setText("Rs");
        jPanel2.add(jLabel76, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jTabbedPane1.addTab("coffees", jPanel2);

        jPanel3.setBackground(new java.awt.Color(236, 227, 219));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox9.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jCheckBox9.setForeground(new java.awt.Color(48, 33, 24));
        jCheckBox9.setText("chocalatte");
        jPanel3.add(jCheckBox9, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 99, 176, -1));

        jCheckBox10.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jCheckBox10.setForeground(new java.awt.Color(48, 33, 24));
        jCheckBox10.setText("coffee");
        jPanel3.add(jCheckBox10, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 243, 176, -1));

        jCheckBox11.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jCheckBox11.setForeground(new java.awt.Color(48, 33, 24));
        jCheckBox11.setText("strawberry");
        jPanel3.add(jCheckBox11, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 168, 176, -1));

        jCheckBox12.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jCheckBox12.setForeground(new java.awt.Color(48, 33, 24));
        jCheckBox12.setText("vanila");
        jPanel3.add(jCheckBox12, new org.netbeans.lib.awtextra.AbsoluteConstraints(17, 30, 176, -1));

        jSpinner5.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jPanel3.add(jSpinner5, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 39, -1, -1));

        jSpinner6.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jPanel3.add(jSpinner6, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 108, -1, -1));

        jSpinner7.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jPanel3.add(jSpinner7, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 244, -1, -1));

        jSpinner8.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jPanel3.add(jSpinner8, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 177, -1, -1));

        jButton5.setBackground(new java.awt.Color(193, 154, 133));
        jButton5.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jButton5.setText("Add");
        jPanel3.add(jButton5, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 39, -1, -1));

        jButton6.setBackground(new java.awt.Color(193, 154, 133));
        jButton6.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jButton6.setText("Add");
        jPanel3.add(jButton6, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 244, -1, -1));

        jButton7.setBackground(new java.awt.Color(193, 154, 133));
        jButton7.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jButton7.setText("Add");
        jPanel3.add(jButton7, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 177, -1, -1));

        jButton8.setBackground(new java.awt.Color(193, 154, 133));
        jButton8.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jButton8.setText("Add");
        jPanel3.add(jButton8, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 108, -1, -1));

        jLabel9.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel9.setText("300");
        jPanel3.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 37, -1));

        jLabel10.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel10.setText("300");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 180, 37, -1));

        jLabel11.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel11.setText("300");
        jPanel3.add(jLabel11, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 250, 37, -1));

        jLabel12.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel12.setText("300");
        jPanel3.add(jLabel12, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 40, 37, -1));

        jLabel77.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel77.setText("Rs");
        jPanel3.add(jLabel77, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, -1, -1));

        jLabel78.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel78.setText("Rs");
        jPanel3.add(jLabel78, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 250, -1, -1));

        jLabel79.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel79.setText("Rs");
        jPanel3.add(jLabel79, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 180, -1, -1));

        jLabel80.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel80.setText("Rs");
        jPanel3.add(jLabel80, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 40, -1, -1));

        jTabbedPane1.addTab("cakes", jPanel3);

        jPanel1.setBackground(new java.awt.Color(237, 226, 219));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox1.setFont(new java.awt.Font("Lucida Calligraphy", 0, 16)); // NOI18N
        jCheckBox1.setForeground(new java.awt.Color(48, 33, 24));
        jCheckBox1.setText("chicken");
        jPanel1.add(jCheckBox1, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 89, 109, -1));

        jCheckBox2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 16)); // NOI18N
        jCheckBox2.setForeground(new java.awt.Color(48, 33, 24));
        jCheckBox2.setText("banana&honey");
        jPanel1.add(jCheckBox2, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 242, 154, -1));

        jCheckBox3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 16)); // NOI18N
        jCheckBox3.setForeground(new java.awt.Color(48, 33, 24));
        jCheckBox3.setText("egg");
        jPanel1.add(jCheckBox3, new org.netbeans.lib.awtextra.AbsoluteConstraints(81, 134, 94, -1));

        jCheckBox4.setFont(new java.awt.Font("Lucida Calligraphy", 0, 16)); // NOI18N
        jCheckBox4.setForeground(new java.awt.Color(48, 33, 24));
        jCheckBox4.setText("chocalatte");
        jPanel1.add(jCheckBox4, new org.netbeans.lib.awtextra.AbsoluteConstraints(44, 286, 120, 26));

        spinner_updatechicken_sandwich_price.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jPanel1.add(spinner_updatechicken_sandwich_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 90, -1, -1));

        jSpinner14.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jPanel1.add(jSpinner14, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 135, -1, -1));

        jSpinner15.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jPanel1.add(jSpinner15, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 287, -1, -1));

        jSpinner16.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jPanel1.add(jSpinner16, new org.netbeans.lib.awtextra.AbsoluteConstraints(307, 243, -1, -1));

        btn_update_chicken_sandwich_price.setBackground(new java.awt.Color(193, 154, 133));
        btn_update_chicken_sandwich_price.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        btn_update_chicken_sandwich_price.setText("update");
        btn_update_chicken_sandwich_price.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_update_chicken_sandwich_priceActionPerformed(evt);
            }
        });
        jPanel1.add(btn_update_chicken_sandwich_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 90, -1, -1));

        jButton14.setBackground(new java.awt.Color(193, 154, 133));
        jButton14.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jButton14.setText("Add");
        jPanel1.add(jButton14, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 135, -1, -1));

        jButton15.setBackground(new java.awt.Color(193, 154, 133));
        jButton15.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jButton15.setText("Add");
        jPanel1.add(jButton15, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 287, -1, -1));

        jButton16.setBackground(new java.awt.Color(193, 154, 133));
        jButton16.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jButton16.setText("Add");
        jPanel1.add(jButton16, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 243, -1, -1));

        jLabel2.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel2.setText("woffles");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 191, 131, -1));

        jLabel3.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jLabel3.setText("sandwich");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(36, 38, 131, -1));

        jLabel16.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel16.setText("300");
        jPanel1.add(jLabel16, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 37, -1));

        jLabel17.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel17.setText("300");
        jPanel1.add(jLabel17, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 130, 37, -1));

        jLabel18.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel18.setText("300");
        jPanel1.add(jLabel18, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 240, 37, -1));

        jLabel19.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel19.setText("300");
        jPanel1.add(jLabel19, new org.netbeans.lib.awtextra.AbsoluteConstraints(260, 290, 37, -1));

        jLabel85.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel85.setText("Rs");
        jPanel1.add(jLabel85, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 240, 20, -1));

        jLabel86.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel86.setText("Rs");
        jPanel1.add(jLabel86, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 130, 20, -1));

        jLabel87.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel87.setText("Rs");
        jPanel1.add(jLabel87, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 290, 20, -1));

        jLabel88.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel88.setText("Rs");
        jPanel1.add(jLabel88, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, 20, -1));
        jPanel1.add(txt_update_chicken_sandwich_price, new org.netbeans.lib.awtextra.AbsoluteConstraints(194, 90, 80, -1));

        jTabbedPane1.addTab("breakfast", jPanel1);

        jPanel4.setBackground(new java.awt.Color(236, 227, 219));
        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jCheckBox13.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jCheckBox13.setForeground(new java.awt.Color(48, 33, 24));
        jCheckBox13.setText("milk tea");
        jPanel4.add(jCheckBox13, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 90, 176, -1));

        jCheckBox14.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jCheckBox14.setForeground(new java.awt.Color(48, 33, 24));
        jCheckBox14.setText("hot chocalatte");
        jPanel4.add(jCheckBox14, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 160, -1, -1));

        jCheckBox15.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jCheckBox15.setForeground(new java.awt.Color(48, 33, 24));
        jCheckBox15.setText("ginger tea");
        jPanel4.add(jCheckBox15, new org.netbeans.lib.awtextra.AbsoluteConstraints(14, 31, 176, -1));

        jCheckBox16.setFont(new java.awt.Font("Lucida Calligraphy", 0, 24)); // NOI18N
        jCheckBox16.setForeground(new java.awt.Color(48, 33, 24));
        jCheckBox16.setText("mix fruit juice");
        jPanel4.add(jCheckBox16, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 230, 220, -1));

        jSpinner9.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jPanel4.add(jSpinner9, new org.netbeans.lib.awtextra.AbsoluteConstraints(326, 40, -1, -1));

        jSpinner10.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jPanel4.add(jSpinner10, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 100, -1, -1));

        jSpinner11.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jPanel4.add(jSpinner11, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 230, -1, -1));

        jSpinner12.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jPanel4.add(jSpinner12, new org.netbeans.lib.awtextra.AbsoluteConstraints(330, 170, -1, -1));

        jButton9.setBackground(new java.awt.Color(193, 154, 133));
        jButton9.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jButton9.setText("Add");
        jPanel4.add(jButton9, new org.netbeans.lib.awtextra.AbsoluteConstraints(408, 40, -1, -1));

        jButton10.setBackground(new java.awt.Color(193, 154, 133));
        jButton10.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jButton10.setText("Add");
        jPanel4.add(jButton10, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, -1, -1));

        jButton11.setBackground(new java.awt.Color(193, 154, 133));
        jButton11.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jButton11.setText("Add");
        jPanel4.add(jButton11, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 100, -1, -1));

        jButton12.setBackground(new java.awt.Color(193, 154, 133));
        jButton12.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jButton12.setText("Add");
        jPanel4.add(jButton12, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 230, -1, -1));

        jLabel13.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel13.setText("300");
        jPanel4.add(jLabel13, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 40, 37, -1));

        jLabel14.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel14.setText("300");
        jPanel4.add(jLabel14, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 100, 37, -1));

        jLabel15.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel15.setText("300");
        jPanel4.add(jLabel15, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 37, -1));

        jLabel20.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel20.setText("300");
        jPanel4.add(jLabel20, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 230, 37, -1));

        jLabel81.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel81.setText("Rs");
        jPanel4.add(jLabel81, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 230, 20, -1));

        jLabel82.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel82.setText("Rs");
        jPanel4.add(jLabel82, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 100, 20, -1));

        jLabel83.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel83.setText("Rs");
        jPanel4.add(jLabel83, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 170, 20, -1));

        jLabel84.setFont(new java.awt.Font("Lucida Calligraphy", 0, 14)); // NOI18N
        jLabel84.setText("Rs");
        jPanel4.add(jLabel84, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 40, 20, -1));

        jTabbedPane1.addTab("bevarages", jPanel4);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(385, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(196, 196, 196))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btn_customer_report)
                        .addGap(43, 43, 43))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 341, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 739, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(91, 91, 91)
                .addComponent(btn_customer_report)
                .addGap(19, 19, 19)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(336, Short.MAX_VALUE))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
Connection con = null;
    private void btn_customer_reportActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_customer_reportActionPerformed
        /*try
        {
            JasperDesign design= JRXmlLoader.load("C:\\Users\\MSii\\Desktop\\Hevenly\\src\\report1.jrxml");
            JRDesignQuery designQuery =  new JRDesignQuery();
            designQuery.setText("select * from customer");
            design.setQuery(designQuery);
            JasperReport report = JasperCompileManager.compileReport(design);
            String dbpath = "jdbc:mysql://localhost:3306/heavenlycafedatabase";
            Connection con=(Connection) DriverManager.getConnection(dbpath,"root","");

            JasperPrint print;
            print = JasperFillManager.fillReport(report, null, con);
            
            JasperViewer.viewReport(print);
        }
        catch(Exception e)
        {
            //JOptionPane.showMessageDialog(null,e); 
        }*/
    
    }//GEN-LAST:event_btn_customer_reportActionPerformed

    private void btn_update_chicken_sandwich_priceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_update_chicken_sandwich_priceActionPerformed
       
    }//GEN-LAST:event_btn_update_chicken_sandwich_priceActionPerformed

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
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Manager().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_customer_report;
    private javax.swing.JButton btn_update_chicken_sandwich_price;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton10;
    private javax.swing.JButton jButton11;
    private javax.swing.JButton jButton12;
    private javax.swing.JButton jButton14;
    private javax.swing.JButton jButton15;
    private javax.swing.JButton jButton16;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JButton jButton7;
    private javax.swing.JButton jButton8;
    private javax.swing.JButton jButton9;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JCheckBox jCheckBox10;
    private javax.swing.JCheckBox jCheckBox11;
    private javax.swing.JCheckBox jCheckBox12;
    private javax.swing.JCheckBox jCheckBox13;
    private javax.swing.JCheckBox jCheckBox14;
    private javax.swing.JCheckBox jCheckBox15;
    private javax.swing.JCheckBox jCheckBox16;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JCheckBox jCheckBox3;
    private javax.swing.JCheckBox jCheckBox4;
    private javax.swing.JCheckBox jCheckBox5;
    private javax.swing.JCheckBox jCheckBox6;
    private javax.swing.JCheckBox jCheckBox7;
    private javax.swing.JCheckBox jCheckBox8;
    private javax.swing.JCheckBox jCheckBox9;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel73;
    private javax.swing.JLabel jLabel74;
    private javax.swing.JLabel jLabel75;
    private javax.swing.JLabel jLabel76;
    private javax.swing.JLabel jLabel77;
    private javax.swing.JLabel jLabel78;
    private javax.swing.JLabel jLabel79;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel80;
    private javax.swing.JLabel jLabel81;
    private javax.swing.JLabel jLabel82;
    private javax.swing.JLabel jLabel83;
    private javax.swing.JLabel jLabel84;
    private javax.swing.JLabel jLabel85;
    private javax.swing.JLabel jLabel86;
    private javax.swing.JLabel jLabel87;
    private javax.swing.JLabel jLabel88;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JSpinner jSpinner10;
    private javax.swing.JSpinner jSpinner11;
    private javax.swing.JSpinner jSpinner12;
    private javax.swing.JSpinner jSpinner14;
    private javax.swing.JSpinner jSpinner15;
    private javax.swing.JSpinner jSpinner16;
    private javax.swing.JSpinner jSpinner2;
    private javax.swing.JSpinner jSpinner3;
    private javax.swing.JSpinner jSpinner4;
    private javax.swing.JSpinner jSpinner5;
    private javax.swing.JSpinner jSpinner6;
    private javax.swing.JSpinner jSpinner7;
    private javax.swing.JSpinner jSpinner8;
    private javax.swing.JSpinner jSpinner9;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JSpinner spinner_updatechicken_sandwich_price;
    private javax.swing.JTextField txt_update_chicken_sandwich_price;
    // End of variables declaration//GEN-END:variables
}
