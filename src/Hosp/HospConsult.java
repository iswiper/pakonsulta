/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Hosp;

import java.awt.Color;
import java.awt.HeadlessException;
import static java.lang.Class.forName;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.text.BadLocationException;

/**
 *
 * @author W34
 */
public class HospConsult extends javax.swing.JFrame {
    
    Connection con = null;
    PreparedStatement pst= null;
    ResultSet rs = null;
  
    
    public HospConsult() {
        initComponents();
       // try{
         //   Class.forName("com.mysql.jdbc.Driver");
         // Connection cn = null;
               //   cn= DriverManager.getConnection("jdbc:mysql://localhost:3306/patient","root","");
       /////   Statement st = cn.createStatement();
                //    JOptionPane.showMessageDialog(null,"connected");
                    
       // }
       // catch(Exception e){
         //   JOptionPane.showMessageDialog(null,"not connected");
        //}
    }
    
   // public void fetch(){
      //  try{
       //     String q = "select * from queue";
       //     xd = cd.prepareStatement(q);
       //     rd = xd.executeQuery();
            
            
        //}
    
    
   //// }
    
        
    
   public void yourAddRow(String str1, String str2){
    
 //// DefaultTableModel yourModel = (DefaultTableModel) queuetable.getModel();
 // yourModel.addRow(new Object[]{str2, str1});
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Main = new javax.swing.JPanel();
        MenuPanel = new javax.swing.JPanel();
        MenuPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        queue = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        addrec = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        aboutUs = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        exit = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cardpanel = new javax.swing.JPanel();
        queuepanel = new javax.swing.JPanel();
        Title = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        PatientText = new javax.swing.JTextArea();
        jLabel20 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jScrollPane3 = new javax.swing.JScrollPane();
        PatientText1 = new javax.swing.JTextArea();
        jLabel22 = new javax.swing.JLabel();
        addrecpanel = new javax.swing.JPanel();
        Title1 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        fname = new javax.swing.JTextField();
        mname = new javax.swing.JTextField();
        lname = new javax.swing.JTextField();
        jLabel16 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTextField7 = new javax.swing.JTextField();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jTextField8 = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        aboutpanel = new javax.swing.JPanel();
        Title2 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        setUndecorated(true);
        setResizable(false);

        Main.setBackground(new java.awt.Color(255, 255, 255));
        Main.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuPanel.setBackground(new java.awt.Color(0, 153, 153));
        MenuPanel.setDoubleBuffered(false);
        MenuPanel.setPreferredSize(new java.awt.Dimension(250, 500));
        MenuPanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        MenuPanel1.setBackground(new java.awt.Color(0, 153, 153));
        MenuPanel1.setDoubleBuffered(false);
        MenuPanel1.setPreferredSize(new java.awt.Dimension(250, 500));
        MenuPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("_________________________");
        MenuPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, 200, -1));

        queue.setBackground(new java.awt.Color(0, 153, 153));
        queue.setPreferredSize(new java.awt.Dimension(250, 70));
        queue.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                queueMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                queueMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                queueMouseExited(evt);
            }
        });
        queue.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel5.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Waiting Area");
        queue.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 90, 30));

        MenuPanel1.add(queue, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 160, -1, -1));

        addrec.setBackground(new java.awt.Color(0, 153, 153));
        addrec.setPreferredSize(new java.awt.Dimension(250, 70));
        addrec.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                addrecMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                addrecMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                addrecMouseExited(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Add Patient's Record");

        javax.swing.GroupLayout addrecLayout = new javax.swing.GroupLayout(addrec);
        addrec.setLayout(addrecLayout);
        addrecLayout.setHorizontalGroup(
            addrecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addrecLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22))
        );
        addrecLayout.setVerticalGroup(
            addrecLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addrecLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        MenuPanel1.add(addrec, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 230, -1, 70));

        aboutUs.setBackground(new java.awt.Color(0, 153, 153));
        aboutUs.setPreferredSize(new java.awt.Dimension(250, 70));
        aboutUs.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                aboutUsMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                aboutUsMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                aboutUsMouseExited(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("About Us");

        javax.swing.GroupLayout aboutUsLayout = new javax.swing.GroupLayout(aboutUs);
        aboutUs.setLayout(aboutUsLayout);
        aboutUsLayout.setHorizontalGroup(
            aboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutUsLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(103, 103, 103))
        );
        aboutUsLayout.setVerticalGroup(
            aboutUsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutUsLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        MenuPanel1.add(aboutUs, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 300, -1, -1));

        exit.setBackground(new java.awt.Color(0, 153, 153));
        exit.setPreferredSize(new java.awt.Dimension(250, 70));
        exit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                exitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                exitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                exitMouseExited(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Segoe UI Semibold", 0, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Exit Application");

        javax.swing.GroupLayout exitLayout = new javax.swing.GroupLayout(exit);
        exit.setLayout(exitLayout);
        exitLayout.setHorizontalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, exitLayout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(102, 102, 102))
        );
        exitLayout.setVerticalGroup(
            exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(exitLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        MenuPanel1.add(exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 370, -1, -1));

        jLabel2.setFont(new java.awt.Font("Segoe UI Semibold", 1, 17)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Hospital Consultation System");
        MenuPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 20, 240, 70));

        MenuPanel.add(MenuPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        Main.add(MenuPanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, 500));

        cardpanel.setLayout(new java.awt.CardLayout());

        Title.setBackground(new java.awt.Color(0, 153, 204));
        Title.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Waiting Area...");
        Title.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 510, 70));

        PatientText.setEditable(false);
        PatientText.setColumns(20);
        PatientText.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        PatientText.setRows(5);
        PatientText.setBorder(null);
        jScrollPane2.setViewportView(PatientText);

        jLabel20.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel20.setText("Priority Lane");

        jButton2.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton2.setText("Next Patient");
        jButton2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton2MouseClicked(evt);
            }
        });
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        PatientText1.setEditable(false);
        PatientText1.setColumns(20);
        PatientText1.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        PatientText1.setRows(5);
        PatientText1.setBorder(null);
        jScrollPane3.setViewportView(PatientText1);

        jLabel22.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel22.setText("Regular Patients");

        javax.swing.GroupLayout queuepanelLayout = new javax.swing.GroupLayout(queuepanel);
        queuepanel.setLayout(queuepanelLayout);
        queuepanelLayout.setHorizontalGroup(
            queuepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Title, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 550, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, queuepanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(queuepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, queuepanelLayout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)))
                .addContainerGap())
            .addGroup(queuepanelLayout.createSequentialGroup()
                .addGap(87, 87, 87)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
        );
        queuepanelLayout.setVerticalGroup(
            queuepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(queuepanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Title, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 74, Short.MAX_VALUE)
                .addGroup(queuepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(queuepanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        cardpanel.add(queuepanel, "card2");

        Title1.setBackground(new java.awt.Color(0, 153, 204));
        Title1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Add Patient's Record...");
        Title1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 510, 70));

        jLabel13.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel13.setText("First Name:");

        jLabel14.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel14.setText("Last Name:");

        jLabel15.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel15.setText("Middle Name:");

        fname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fnameActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel16.setText("Age:");

        jTextField4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField4ActionPerformed(evt);
            }
        });

        jTextField7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField7ActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel18.setText("Address:");

        jLabel19.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel19.setText("Contact:");

        jTextField8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField8ActionPerformed(evt);
            }
        });

        jLabel21.setFont(new java.awt.Font("Segoe UI Semilight", 0, 14)); // NOI18N
        jLabel21.setText("Gender:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Male", "Female" }));

        jButton1.setFont(new java.awt.Font("Segoe UI Semibold", 0, 14)); // NOI18N
        jButton1.setText("Submit");
        jButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jButton1MouseClicked(evt);
            }
        });
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout addrecpanelLayout = new javax.swing.GroupLayout(addrecpanel);
        addrecpanel.setLayout(addrecpanelLayout);
        addrecpanelLayout.setHorizontalGroup(
            addrecpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addrecpanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Title1, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(addrecpanelLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(addrecpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(addrecpanelLayout.createSequentialGroup()
                        .addGroup(addrecpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel14)
                            .addComponent(jLabel15)
                            .addComponent(jLabel13))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(addrecpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(lname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 238, Short.MAX_VALUE)
                            .addComponent(mname, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(fname, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(addrecpanelLayout.createSequentialGroup()
                        .addComponent(jLabel18)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 451, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(addrecpanelLayout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(addrecpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(addrecpanelLayout.createSequentialGroup()
                                .addComponent(jLabel19)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(addrecpanelLayout.createSequentialGroup()
                                .addGroup(addrecpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel21)
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addrecpanelLayout.createSequentialGroup()
                                        .addComponent(jLabel16)
                                        .addGap(2, 2, 2)))
                                .addGroup(addrecpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(addrecpanelLayout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(24, 24, 24)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        addrecpanelLayout.setVerticalGroup(
            addrecpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(addrecpanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Title1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addGroup(addrecpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addrecpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(mname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addrecpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lname, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addrecpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jTextField7, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(addrecpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(addrecpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField8, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(addrecpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(addrecpanelLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addGroup(addrecpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, addrecpanelLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))))
        );

        cardpanel.add(addrecpanel, "card2");

        Title2.setBackground(new java.awt.Color(0, 153, 204));
        Title2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel8.setFont(new java.awt.Font("Segoe UI Semibold", 1, 36)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(255, 255, 255));
        jLabel8.setText("About Us...");
        Title2.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 10, 510, 70));

        jLabel10.setBackground(new java.awt.Color(255, 255, 255));
        jLabel10.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel10.setText("Senior Citizen Patients in waiting area. This system is based ");

        jLabel11.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel11.setText("Hospital Consultation System is made to prioritize");

        jLabel12.setBackground(new java.awt.Color(255, 255, 255));
        jLabel12.setFont(new java.awt.Font("Segoe UI Semibold", 0, 18)); // NOI18N
        jLabel12.setText("on Piority Scheduling System in Operating System.");

        javax.swing.GroupLayout aboutpanelLayout = new javax.swing.GroupLayout(aboutpanel);
        aboutpanel.setLayout(aboutpanelLayout);
        aboutpanelLayout.setHorizontalGroup(
            aboutpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutpanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(Title2, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(aboutpanelLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(aboutpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, aboutpanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 428, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );
        aboutpanelLayout.setVerticalGroup(
            aboutpanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(aboutpanelLayout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(Title2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(66, 66, 66)
                .addComponent(jLabel11)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel12)
                .addContainerGap(208, Short.MAX_VALUE))
        );

        cardpanel.add(aboutpanel, "card2");

        Main.add(cardpanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 0, 550, 500));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Main, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void queueMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_queueMouseEntered
      queue.setBackground(new Color(0, 102, 102));
    }//GEN-LAST:event_queueMouseEntered

    private void queueMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_queueMouseClicked
        
         
        cardpanel.removeAll();
        cardpanel.repaint();
        cardpanel.revalidate();

        cardpanel.add(queuepanel);
        cardpanel.repaint();
        cardpanel.revalidate();  
    }//GEN-LAST:event_queueMouseClicked

    private void addrecMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addrecMouseClicked
        cardpanel.removeAll();
        cardpanel.repaint();
        cardpanel.revalidate();

        cardpanel.add(addrecpanel);
        cardpanel.repaint();
        cardpanel.revalidate();  
    }//GEN-LAST:event_addrecMouseClicked

    private void exitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseClicked
     
         int p=JOptionPane.showConfirmDialog(null,"Confirm Exit? " ,"",JOptionPane.YES_NO_OPTION);
        
        
        if(p==0){
            
            try {
             
                Thread.sleep(1000);
                setVisible(false);
                System.exit(0);

            } catch (InterruptedException ex) {
                Logger.getLogger(HospConsult.class.getName()).log(Level.SEVERE, null, ex);
                JOptionPane.showMessageDialog(null, ex);
            }
        }       
    }//GEN-LAST:event_exitMouseClicked

    private void aboutUsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutUsMouseClicked
        cardpanel.removeAll();
        cardpanel.repaint();
        cardpanel.revalidate();

        cardpanel.add(aboutpanel);
        cardpanel.repaint();
        cardpanel.revalidate(); 
    }//GEN-LAST:event_aboutUsMouseClicked

    private void queueMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_queueMouseExited
        queue.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_queueMouseExited

    private void addrecMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addrecMouseEntered
       addrec.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_addrecMouseEntered

    private void addrecMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_addrecMouseExited
        addrec.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_addrecMouseExited

    private void aboutUsMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutUsMouseExited
       aboutUs.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_aboutUsMouseExited

    private void aboutUsMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_aboutUsMouseEntered
        aboutUs.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_aboutUsMouseEntered

    private void exitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseEntered
       exit.setBackground(new Color(0,102,102));
    }//GEN-LAST:event_exitMouseEntered

    private void exitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_exitMouseExited
        exit.setBackground(new Color(0,153,153));
    }//GEN-LAST:event_exitMouseExited

    private void fnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fnameActionPerformed

    private void jTextField4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField4ActionPerformed

    private void jTextField8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField8ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField8ActionPerformed

    private void jTextField7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField7ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField7ActionPerformed

    @SuppressWarnings("empty-statement")
    private void jButton1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton1MouseClicked
       String dat=jTextField7.getText().trim();     
       String dat1= jTextField4.getText().trim();
       String dat2= jTextField8.getText().trim();
       String dat6= fname.getText().trim();
       String dat3= mname.getText().trim();
       String dat4= lname.getText().trim();
       
       String combine = dat.concat(dat1+dat2+dat6+dat3+dat4);
       
       
       if(combine.equals("")){
        JOptionPane.showMessageDialog(null,"Please Fill All The Fields");
            
       }
       
       else{
        jButton2.setEnabled(true);   
           int x = Integer.parseInt(jTextField8.getText());
     //   int i = QueueText.getLineCount();
        
        //QueueText.append("  00"+i+"\n");
        String finame = fname.getText();  
        String midname = mname.getText();
        String lastname = lname.getText();
        String name = finame.concat(" "+midname+" "+lastname);
        
        if(x>=60){   
            PatientText1.append("   "+name+"\n");
            JOptionPane.showMessageDialog(null,"Record Submitted");
        }
   
        else{
            PatientText.append("   "+name+"\n");
            JOptionPane.showMessageDialog(null,"Record Submitted");
        }
        
        
        fname.setText("");
        mname.setText(""); 
        lname.setText("");
        jTextField7.setText("");
        jTextField4.setText("");
        jTextField8.setText("");
       }
         

      
    }//GEN-LAST:event_jButton1MouseClicked

    private void jButton2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jButton2MouseClicked
      String data=PatientText.getText().trim();
      String data2=PatientText1.getText().trim();
      if(data.equals("") && data2.equals("")){
             JOptionPane.showMessageDialog(null,"There is no Patient in Waiting Area");
            
      }
      else if(data2.equals("")){
       
       int endpatient = 0;
 
             
        try {
            endpatient = PatientText.getLineEndOffset(0);
            
        } catch (BadLocationException ex) {
            Logger.getLogger(HospConsult.class.getName()).log(Level.SEVERE, null, ex);
        }
        PatientText.replaceRange("", 0, endpatient);    
            
        
        JOptionPane.showMessageDialog(null,"Please Go to Doctor's Room");
    }
      
      else if(data.equals("")){
          
       int endpatient = 0;
 
             
        try {
            endpatient = PatientText1.getLineEndOffset(0);
            
        } catch (BadLocationException ex) {
            Logger.getLogger(HospConsult.class.getName()).log(Level.SEVERE, null, ex);
        }
        PatientText1.replaceRange("", 0, endpatient);    
            
        
        JOptionPane.showMessageDialog(null,"Please Go to Doctor's Room");
    }
    else{
         
       int endpatient = 0;
 
             
        try {
            endpatient = PatientText1.getLineEndOffset(0);
            
        } catch (BadLocationException ex) {
            Logger.getLogger(HospConsult.class.getName()).log(Level.SEVERE, null, ex);
        }
        PatientText1.replaceRange("", 0, endpatient);    
            
        
        JOptionPane.showMessageDialog(null,"Please Go to Doctor's Room");
    }  
   

       
        
        
    }//GEN-LAST:event_jButton2MouseClicked

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(HospConsult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(HospConsult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(HospConsult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(HospConsult.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new HospConsult().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Main;
    private javax.swing.JPanel MenuPanel;
    private javax.swing.JPanel MenuPanel1;
    private javax.swing.JTextArea PatientText;
    private javax.swing.JTextArea PatientText1;
    private javax.swing.JPanel Title;
    private javax.swing.JPanel Title1;
    private javax.swing.JPanel Title2;
    private javax.swing.JPanel aboutUs;
    private javax.swing.JPanel aboutpanel;
    private javax.swing.JPanel addrec;
    private javax.swing.JPanel addrecpanel;
    private javax.swing.JPanel cardpanel;
    private javax.swing.JPanel exit;
    private javax.swing.JTextField fname;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JTextField jTextField7;
    private javax.swing.JTextField jTextField8;
    private javax.swing.JTextField lname;
    private javax.swing.JTextField mname;
    private javax.swing.JPanel queue;
    private javax.swing.JPanel queuepanel;
    // End of variables declaration//GEN-END:variables
}
