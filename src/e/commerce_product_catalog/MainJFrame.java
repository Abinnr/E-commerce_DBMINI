
package e.commerce_product_catalog;

import java.sql.*;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class MainJFrame extends javax.swing.JFrame {

    Connection con;
    PreparedStatement pst;
    public MainJFrame() {
        initComponents();
        setExtendedState (MainJFrame.MAXIMIZED_BOTH);
        Connect();
        
    }
    
    
    
    public void Connect(){
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/e_commercedb","root","root");
            System.out.println("connection is done for mainframe");
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(OrderJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
    
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        menuLbl = new javax.swing.JLabel();
        profilebutton = new javax.swing.JButton();
        cartbutton = new javax.swing.JButton();
        likebutton = new javax.swing.JButton();
        orderButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        jButton8 = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        jPanel8 = new javax.swing.JPanel();
        cartButton1 = new javax.swing.JButton();
        likeButton1 = new javax.swing.JButton();
        orderButton1 = new javax.swing.JButton();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        productnameLbl1 = new javax.swing.JLabel();
        priceLbl1 = new javax.swing.JLabel();
        jPanel11 = new javax.swing.JPanel();
        likeButton2 = new javax.swing.JButton();
        cartButton2 = new javax.swing.JButton();
        orderButton2 = new javax.swing.JButton();
        productnameLbl2 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel57 = new javax.swing.JLabel();
        priceLbl2 = new javax.swing.JLabel();
        jPanel12 = new javax.swing.JPanel();
        likeButton3 = new javax.swing.JButton();
        cartButton3 = new javax.swing.JButton();
        orderButton3 = new javax.swing.JButton();
        jLabel25 = new javax.swing.JLabel();
        productnameLbl3 = new javax.swing.JLabel();
        jLabel58 = new javax.swing.JLabel();
        jLabel59 = new javax.swing.JLabel();
        priceLbl3 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jPanel9 = new javax.swing.JPanel();
        likeButton4 = new javax.swing.JButton();
        cartButton4 = new javax.swing.JButton();
        orderButton4 = new javax.swing.JButton();
        jLabel30 = new javax.swing.JLabel();
        productnameLbl4 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        priceLbl4 = new javax.swing.JLabel();
        jPanel13 = new javax.swing.JPanel();
        likeButton5 = new javax.swing.JButton();
        cartButton5 = new javax.swing.JButton();
        orderButton5 = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        productnameLbl5 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        priceLbl5 = new javax.swing.JLabel();
        jPanel14 = new javax.swing.JPanel();
        likeButton6 = new javax.swing.JButton();
        cartButton6 = new javax.swing.JButton();
        orderButton6 = new javax.swing.JButton();
        jLabel40 = new javax.swing.JLabel();
        productnameLbl6 = new javax.swing.JLabel();
        jLabel60 = new javax.swing.JLabel();
        jLabel61 = new javax.swing.JLabel();
        priceLbl6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jPanel7 = new javax.swing.JPanel();
        jPanel10 = new javax.swing.JPanel();
        likeButton7 = new javax.swing.JButton();
        cartButton7 = new javax.swing.JButton();
        orderButton7 = new javax.swing.JButton();
        jLabel55 = new javax.swing.JLabel();
        productnameLbl7 = new javax.swing.JLabel();
        jLabel62 = new javax.swing.JLabel();
        jLabel63 = new javax.swing.JLabel();
        priceLbl7 = new javax.swing.JLabel();
        jPanel15 = new javax.swing.JPanel();
        likeButton8 = new javax.swing.JButton();
        cartButton8 = new javax.swing.JButton();
        orderButton8 = new javax.swing.JButton();
        jLabel50 = new javax.swing.JLabel();
        productnameLbl8 = new javax.swing.JLabel();
        jLabel64 = new javax.swing.JLabel();
        jLabel65 = new javax.swing.JLabel();
        priceLbl8 = new javax.swing.JLabel();
        jPanel16 = new javax.swing.JPanel();
        likeButton9 = new javax.swing.JButton();
        cartButton9 = new javax.swing.JButton();
        orderButton9 = new javax.swing.JButton();
        jLabel45 = new javax.swing.JLabel();
        productnameLbl9 = new javax.swing.JLabel();
        jLabel66 = new javax.swing.JLabel();
        jLabel67 = new javax.swing.JLabel();
        priceLbl9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel2.setBackground(new java.awt.Color(153, 153, 153));

        jPanel3.setBackground(new java.awt.Color(102, 102, 102));

        menuLbl.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 48)); // NOI18N
        menuLbl.setForeground(new java.awt.Color(51, 204, 0));
        menuLbl.setText("MENU");

        profilebutton.setForeground(new java.awt.Color(255, 255, 255));
        profilebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Icons/user.png"))); // NOI18N
        profilebutton.setBorder(null);
        profilebutton.setBorderPainted(false);
        profilebutton.setContentAreaFilled(false);
        profilebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                profilebuttonActionPerformed(evt);
            }
        });

        cartbutton.setBackground(new java.awt.Color(102, 102, 102));
        cartbutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Icons/cart.png"))); // NOI18N
        cartbutton.setBorder(null);
        cartbutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartbuttonActionPerformed(evt);
            }
        });

        likebutton.setBackground(new java.awt.Color(102, 102, 102));
        likebutton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Icons/love.png"))); // NOI18N
        likebutton.setBorder(null);
        likebutton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                likebuttonActionPerformed(evt);
            }
        });

        orderButton.setBackground(new java.awt.Color(102, 102, 102));
        orderButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Icons/checkout.png"))); // NOI18N
        orderButton.setBorder(null);
        orderButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("ORDER");

        jLabel4.setText("CART");

        jLabel5.setText("WISHLIST");

        jLabel6.setText("PRFILE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(0, 42, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addComponent(menuLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orderButton)
                            .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(cartbutton)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(93, 93, 93))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(likebutton)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(profilebutton)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addComponent(menuLbl)
                .addGap(109, 109, 109)
                .addComponent(orderButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1)
                .addGap(63, 63, 63)
                .addComponent(cartbutton)
                .addGap(15, 15, 15)
                .addComponent(jLabel4)
                .addGap(64, 64, 64)
                .addComponent(likebutton)
                .addGap(18, 18, 18)
                .addComponent(jLabel5)
                .addGap(63, 63, 63)
                .addComponent(profilebutton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(81, 81, 81))
        );

        jPanel4.setBackground(new java.awt.Color(51, 51, 51));

        jLabel3.setFont(new java.awt.Font("Wide Latin", 1, 24)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(51, 204, 0));
        jLabel3.setText("EaseBUY");

        jButton8.setBackground(new java.awt.Color(51, 51, 51));
        jButton8.setFont(new java.awt.Font("Arial Rounded MT Bold", 0, 24)); // NOI18N
        jButton8.setForeground(new java.awt.Color(255, 255, 255));
        jButton8.setText("X");
        jButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton8ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(425, 425, 425)
                .addComponent(jButton8)
                .addGap(23, 23, 23))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jButton8)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel4Layout.createSequentialGroup()
                .addGap(0, 35, Short.MAX_VALUE)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        jPanel5.setBackground(new java.awt.Color(51, 51, 51));

        jPanel8.setBackground(new java.awt.Color(102, 102, 102));

        cartButton1.setBackground(new java.awt.Color(0, 153, 0));
        cartButton1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cartButton1.setText("CART");
        cartButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartButton1ActionPerformed(evt);
            }
        });

        likeButton1.setBackground(new java.awt.Color(0, 153, 0));
        likeButton1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        likeButton1.setText("LIKE");
        likeButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                likeButton1ActionPerformed(evt);
            }
        });

        orderButton1.setBackground(new java.awt.Color(0, 153, 0));
        orderButton1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        orderButton1.setText("ORDER");
        orderButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButton1ActionPerformed(evt);
            }
        });

        jLabel12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Icons/sneakers.png"))); // NOI18N

        jLabel13.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(255, 255, 0));
        jLabel13.setText("RATING : 9.7");

        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("PRICE:  ₹ ");

        productnameLbl1.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        productnameLbl1.setForeground(new java.awt.Color(255, 255, 255));
        productnameLbl1.setText("AIR JORDAN 3 RETRO ");

        priceLbl1.setForeground(new java.awt.Color(255, 255, 255));
        priceLbl1.setText("7000");

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(likeButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cartButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel13))
                        .addGap(10, 10, 10)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(orderButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(jLabel14)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(priceLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(productnameLbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(productnameLbl1)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(jLabel14)
                            .addComponent(priceLbl1))
                        .addGap(18, 18, 18)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderButton1)
                    .addComponent(likeButton1)
                    .addComponent(cartButton1))
                .addGap(21, 21, 21))
        );

        jPanel11.setBackground(new java.awt.Color(102, 102, 102));
        jPanel11.setForeground(new java.awt.Color(102, 102, 102));

        likeButton2.setBackground(new java.awt.Color(0, 153, 0));
        likeButton2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        likeButton2.setText("LIKE");
        likeButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                likeButton2ActionPerformed(evt);
            }
        });

        cartButton2.setBackground(new java.awt.Color(0, 153, 0));
        cartButton2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cartButton2.setText("CART");
        cartButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartButton2ActionPerformed(evt);
            }
        });

        orderButton2.setBackground(new java.awt.Color(0, 153, 0));
        orderButton2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        orderButton2.setText("ORDER");
        orderButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButton2ActionPerformed(evt);
            }
        });

        productnameLbl2.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        productnameLbl2.setForeground(new java.awt.Color(255, 255, 255));
        productnameLbl2.setText("FOSSIL BRONSON");

        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Icons/smartwatch.png"))); // NOI18N

        jLabel16.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 0));
        jLabel16.setText("RATING : 8.9");

        jLabel57.setForeground(new java.awt.Color(255, 255, 255));
        jLabel57.setText("PRICE:  ₹ ");

        priceLbl2.setForeground(new java.awt.Color(255, 255, 255));
        priceLbl2.setText("9500");

        javax.swing.GroupLayout jPanel11Layout = new javax.swing.GroupLayout(jPanel11);
        jPanel11.setLayout(jPanel11Layout);
        jPanel11Layout.setHorizontalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel11Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(likeButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cartButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel16))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(jLabel57)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(priceLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(38, Short.MAX_VALUE))
                            .addGroup(jPanel11Layout.createSequentialGroup()
                                .addComponent(orderButton2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(16, 16, 16))))
                    .addGroup(jPanel11Layout.createSequentialGroup()
                        .addComponent(productnameLbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(87, 87, 87))))
        );
        jPanel11Layout.setVerticalGroup(
            jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(productnameLbl2)
                        .addGap(36, 36, 36)
                        .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel16)
                            .addComponent(jLabel57)
                            .addComponent(priceLbl2))
                        .addGap(31, 31, 31))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel11Layout.createSequentialGroup()
                        .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addGroup(jPanel11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(orderButton2)
                    .addComponent(likeButton2)
                    .addComponent(cartButton2))
                .addGap(21, 21, 21))
        );

        jPanel12.setBackground(new java.awt.Color(102, 102, 102));

        likeButton3.setBackground(new java.awt.Color(0, 153, 0));
        likeButton3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        likeButton3.setText("LIKE");
        likeButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                likeButton3ActionPerformed(evt);
            }
        });

        cartButton3.setBackground(new java.awt.Color(0, 153, 0));
        cartButton3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cartButton3.setText("CART");
        cartButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartButton3ActionPerformed(evt);
            }
        });

        orderButton3.setBackground(new java.awt.Color(0, 153, 0));
        orderButton3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        orderButton3.setText("ORDER");
        orderButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButton3ActionPerformed(evt);
            }
        });

        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Icons/jacket.png"))); // NOI18N

        productnameLbl3.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        productnameLbl3.setForeground(new java.awt.Color(255, 255, 255));
        productnameLbl3.setText("GUCCI MEN'S ZIPPERED");

        jLabel58.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel58.setForeground(new java.awt.Color(255, 255, 0));
        jLabel58.setText("RATING : 8.3");

        jLabel59.setForeground(new java.awt.Color(255, 255, 255));
        jLabel59.setText("PRICE:  ₹ ");

        priceLbl3.setForeground(new java.awt.Color(255, 255, 255));
        priceLbl3.setText("4250");

        javax.swing.GroupLayout jPanel12Layout = new javax.swing.GroupLayout(jPanel12);
        jPanel12.setLayout(jPanel12Layout);
        jPanel12Layout.setHorizontalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel12Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel12Layout.createSequentialGroup()
                                .addComponent(jLabel58)
                                .addGap(53, 53, 53)
                                .addComponent(jLabel59)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(priceLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(productnameLbl3, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(25, 25, 25))
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(likeButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cartButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(orderButton3, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addGap(21, 21, 21))))
        );
        jPanel12Layout.setVerticalGroup(
            jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel12Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel12Layout.createSequentialGroup()
                        .addComponent(productnameLbl3)
                        .addGap(40, 40, 40)
                        .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel59)
                            .addComponent(priceLbl3)
                            .addComponent(jLabel58))
                        .addGap(9, 9, 9)))
                .addGap(18, 18, 18)
                .addGroup(jPanel12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(likeButton3)
                    .addComponent(cartButton3)
                    .addComponent(orderButton3))
                .addGap(23, 23, 23))
        );

        jLabel2.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(51, 255, 51));
        jLabel2.setText(">>");

        jLabel7.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 204, 0));
        jLabel7.setText("FASHON");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 99, Short.MAX_VALUE)
                .addComponent(jPanel11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(533, 533, 533))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(10, Short.MAX_VALUE)
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel6.setBackground(new java.awt.Color(51, 51, 51));

        jPanel9.setBackground(new java.awt.Color(102, 102, 102));

        likeButton4.setBackground(new java.awt.Color(0, 153, 0));
        likeButton4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        likeButton4.setText("LIKE");
        likeButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                likeButton4ActionPerformed(evt);
            }
        });

        cartButton4.setBackground(new java.awt.Color(0, 153, 0));
        cartButton4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cartButton4.setText("CART");
        cartButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartButton4ActionPerformed(evt);
            }
        });

        orderButton4.setBackground(new java.awt.Color(0, 153, 0));
        orderButton4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        orderButton4.setText("ORDER");
        orderButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButton4ActionPerformed(evt);
            }
        });

        jLabel30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Icons/fries.png"))); // NOI18N

        productnameLbl4.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        productnameLbl4.setForeground(new java.awt.Color(255, 255, 255));
        productnameLbl4.setText("AMUL HAPPY TREATS");

        jLabel17.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 0));
        jLabel17.setText("RATING : 9.8");

        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("PRICE:  ₹ ");

        priceLbl4.setForeground(new java.awt.Color(255, 255, 255));
        priceLbl4.setText("100");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(likeButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(27, 27, 27)
                        .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(cartButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(orderButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(20, 20, 20))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productnameLbl4)
                            .addGroup(jPanel9Layout.createSequentialGroup()
                                .addComponent(jLabel17)
                                .addGap(54, 54, 54)
                                .addComponent(jLabel18)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(priceLbl4, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(27, 27, 27))))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel9Layout.createSequentialGroup()
                        .addComponent(productnameLbl4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel18)
                            .addComponent(priceLbl4)
                            .addComponent(jLabel17)))
                    .addComponent(jLabel30, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                .addGroup(jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(likeButton4)
                    .addComponent(cartButton4)
                    .addComponent(orderButton4))
                .addGap(15, 15, 15))
        );

        jPanel13.setBackground(new java.awt.Color(102, 102, 102));
        jPanel13.setForeground(new java.awt.Color(102, 102, 102));

        likeButton5.setBackground(new java.awt.Color(0, 153, 0));
        likeButton5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        likeButton5.setText("LIKE");
        likeButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                likeButton5ActionPerformed(evt);
            }
        });

        cartButton5.setBackground(new java.awt.Color(0, 153, 0));
        cartButton5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cartButton5.setText("CART");
        cartButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartButton5ActionPerformed(evt);
            }
        });

        orderButton5.setBackground(new java.awt.Color(0, 153, 0));
        orderButton5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        orderButton5.setText("ORDER");
        orderButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButton5ActionPerformed(evt);
            }
        });

        jLabel35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Icons/shampoo.png"))); // NOI18N

        productnameLbl5.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        productnameLbl5.setForeground(new java.awt.Color(255, 255, 255));
        productnameLbl5.setText("SCALPE PRO");

        jLabel19.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 0));
        jLabel19.setText("RATING : 8.7");

        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setText("PRICE:  ₹ ");

        priceLbl5.setForeground(new java.awt.Color(255, 255, 255));
        priceLbl5.setText("250");

        javax.swing.GroupLayout jPanel13Layout = new javax.swing.GroupLayout(jPanel13);
        jPanel13.setLayout(jPanel13Layout);
        jPanel13Layout.setHorizontalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel13Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(likeButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cartButton5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(productnameLbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel19))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(jLabel20)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceLbl5, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(orderButton5, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                        .addGap(20, 20, 20))))
        );
        jPanel13Layout.setVerticalGroup(
            jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel13Layout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel13Layout.createSequentialGroup()
                        .addComponent(productnameLbl5)
                        .addGap(31, 31, 31)
                        .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel20)
                            .addComponent(priceLbl5)
                            .addComponent(jLabel19))
                        .addGap(18, 18, 18)))
                .addGap(18, 18, 18)
                .addGroup(jPanel13Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(likeButton5)
                    .addComponent(cartButton5)
                    .addComponent(orderButton5))
                .addGap(19, 19, 19))
        );

        jPanel14.setBackground(new java.awt.Color(102, 102, 102));

        likeButton6.setBackground(new java.awt.Color(0, 153, 0));
        likeButton6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        likeButton6.setText("LIKE");
        likeButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                likeButton6ActionPerformed(evt);
            }
        });

        cartButton6.setBackground(new java.awt.Color(0, 153, 0));
        cartButton6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cartButton6.setText("CART");
        cartButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartButton6ActionPerformed(evt);
            }
        });

        orderButton6.setBackground(new java.awt.Color(0, 153, 0));
        orderButton6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        orderButton6.setText("ORDER");
        orderButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButton6ActionPerformed(evt);
            }
        });

        jLabel40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Icons/soap.png"))); // NOI18N

        productnameLbl6.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        productnameLbl6.setForeground(new java.awt.Color(255, 255, 255));
        productnameLbl6.setText("PEARS");

        jLabel60.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel60.setForeground(new java.awt.Color(255, 255, 0));
        jLabel60.setText("RATING : 7.9");

        jLabel61.setForeground(new java.awt.Color(255, 255, 255));
        jLabel61.setText("PRICE:  ₹ ");

        priceLbl6.setForeground(new java.awt.Color(255, 255, 255));
        priceLbl6.setText("50");

        javax.swing.GroupLayout jPanel14Layout = new javax.swing.GroupLayout(jPanel14);
        jPanel14.setLayout(jPanel14Layout);
        jPanel14Layout.setHorizontalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel14Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addComponent(jLabel60)
                                .addGap(52, 52, 52)
                                .addComponent(jLabel61)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(priceLbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel14Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addComponent(productnameLbl6, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(29, 29, 29))
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addComponent(likeButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(cartButton6, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addComponent(orderButton6, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                        .addGap(25, 25, 25))))
        );
        jPanel14Layout.setVerticalGroup(
            jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel14Layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(productnameLbl6)
                        .addGap(26, 26, 26)
                        .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel61)
                            .addComponent(priceLbl6)
                            .addComponent(jLabel60))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel14Layout.createSequentialGroup()
                        .addContainerGap(30, Short.MAX_VALUE)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(likeButton6)
                    .addComponent(cartButton6)
                    .addComponent(orderButton6))
                .addGap(21, 21, 21))
        );

        jLabel8.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 204, 0));
        jLabel8.setText("GROCERIES");

        jLabel9.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 255, 51));
        jLabel9.setText(">>");

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, 369, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel8)
                .addGap(521, 521, 521))
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel6Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel6Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel13, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel9)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jPanel7.setBackground(new java.awt.Color(51, 51, 51));

        jPanel10.setBackground(new java.awt.Color(102, 102, 102));

        likeButton7.setBackground(new java.awt.Color(0, 153, 0));
        likeButton7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        likeButton7.setText("LIKE");
        likeButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                likeButton7ActionPerformed(evt);
            }
        });

        cartButton7.setBackground(new java.awt.Color(0, 153, 0));
        cartButton7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cartButton7.setText("CART");
        cartButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartButton7ActionPerformed(evt);
            }
        });

        orderButton7.setBackground(new java.awt.Color(0, 153, 0));
        orderButton7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        orderButton7.setText("ORDER");
        orderButton7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButton7ActionPerformed(evt);
            }
        });

        jLabel55.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Icons/earphone.png"))); // NOI18N

        productnameLbl7.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        productnameLbl7.setForeground(new java.awt.Color(255, 255, 255));
        productnameLbl7.setText("JBL WAVE BEAM");

        jLabel62.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel62.setForeground(new java.awt.Color(255, 255, 0));
        jLabel62.setText("RATING : 9.5");

        jLabel63.setForeground(new java.awt.Color(255, 255, 255));
        jLabel63.setText("PRICE:  ₹ ");

        priceLbl7.setForeground(new java.awt.Color(255, 255, 255));
        priceLbl7.setText("2500");

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addComponent(likeButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cartButton7, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(orderButton7, javax.swing.GroupLayout.DEFAULT_SIZE, 94, Short.MAX_VALUE)
                .addGap(19, 19, 19))
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addComponent(jLabel62)
                        .addGap(51, 51, 51)
                        .addComponent(jLabel63)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceLbl7, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(productnameLbl7))
                .addGap(23, 23, 23))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(jLabel55, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel10Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(productnameLbl7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel63)
                            .addComponent(priceLbl7)
                            .addComponent(jLabel62))
                        .addGap(16, 16, 16)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(likeButton7)
                    .addComponent(cartButton7)
                    .addComponent(orderButton7))
                .addGap(17, 17, 17))
        );

        jPanel15.setBackground(new java.awt.Color(102, 102, 102));
        jPanel15.setForeground(new java.awt.Color(102, 102, 102));

        likeButton8.setBackground(new java.awt.Color(0, 153, 0));
        likeButton8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        likeButton8.setText("LIKE");
        likeButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                likeButton8ActionPerformed(evt);
            }
        });

        cartButton8.setBackground(new java.awt.Color(0, 153, 0));
        cartButton8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cartButton8.setText("CART");
        cartButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartButton8ActionPerformed(evt);
            }
        });

        orderButton8.setBackground(new java.awt.Color(0, 153, 0));
        orderButton8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        orderButton8.setText("ORDER");
        orderButton8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButton8ActionPerformed(evt);
            }
        });

        jLabel50.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Icons/iphone.png"))); // NOI18N

        productnameLbl8.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        productnameLbl8.setForeground(new java.awt.Color(255, 255, 255));
        productnameLbl8.setText("Iphone 16 pro max");

        jLabel64.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel64.setForeground(new java.awt.Color(255, 255, 0));
        jLabel64.setText("RATING : 7.3");

        jLabel65.setForeground(new java.awt.Color(255, 255, 255));
        jLabel65.setText("PRICE:  ₹ ");

        priceLbl8.setForeground(new java.awt.Color(255, 255, 255));
        priceLbl8.setText("135000");

        javax.swing.GroupLayout jPanel15Layout = new javax.swing.GroupLayout(jPanel15);
        jPanel15.setLayout(jPanel15Layout);
        jPanel15Layout.setHorizontalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel15Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(likeButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(cartButton8, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(orderButton8, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                .addGap(15, 15, 15))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(jLabel64)
                        .addGap(55, 55, 55)
                        .addComponent(jLabel65)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(priceLbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(productnameLbl8, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19))
        );
        jPanel15Layout.setVerticalGroup(
            jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel15Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel50, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel15Layout.createSequentialGroup()
                        .addComponent(productnameLbl8)
                        .addGap(32, 32, 32)
                        .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel65)
                            .addComponent(priceLbl8)
                            .addComponent(jLabel64))
                        .addGap(17, 17, 17)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(likeButton8)
                    .addComponent(cartButton8)
                    .addComponent(orderButton8))
                .addGap(22, 22, 22))
        );

        jPanel16.setBackground(new java.awt.Color(102, 102, 102));

        likeButton9.setBackground(new java.awt.Color(0, 153, 0));
        likeButton9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        likeButton9.setText("LIKE");
        likeButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                likeButton9ActionPerformed(evt);
            }
        });

        cartButton9.setBackground(new java.awt.Color(0, 153, 0));
        cartButton9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cartButton9.setText("CART");
        cartButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cartButton9ActionPerformed(evt);
            }
        });

        orderButton9.setBackground(new java.awt.Color(0, 153, 0));
        orderButton9.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        orderButton9.setText("ORDER");
        orderButton9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                orderButton9ActionPerformed(evt);
            }
        });

        jLabel45.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Assets/Icons/fan.png"))); // NOI18N

        productnameLbl9.setFont(new java.awt.Font("Berlin Sans FB", 1, 14)); // NOI18N
        productnameLbl9.setForeground(new java.awt.Color(255, 255, 255));
        productnameLbl9.setText("BAJAJ PYGMY MINI");

        jLabel66.setFont(new java.awt.Font("Playbill", 0, 18)); // NOI18N
        jLabel66.setForeground(new java.awt.Color(255, 255, 0));
        jLabel66.setText("RATING : 7.1");

        jLabel67.setForeground(new java.awt.Color(255, 255, 255));
        jLabel67.setText("PRICE:  ₹ ");

        priceLbl9.setForeground(new java.awt.Color(255, 255, 255));
        priceLbl9.setText("7500");

        javax.swing.GroupLayout jPanel16Layout = new javax.swing.GroupLayout(jPanel16);
        jPanel16.setLayout(jPanel16Layout);
        jPanel16Layout.setHorizontalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel16Layout.createSequentialGroup()
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(likeButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(cartButton9, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(orderButton9, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE)
                                .addGap(18, 18, 18))
                            .addGroup(jPanel16Layout.createSequentialGroup()
                                .addComponent(jLabel66)
                                .addGap(35, 35, 35)
                                .addComponent(jLabel67)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(priceLbl9, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGap(44, 44, 44)
                        .addComponent(productnameLbl9)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel16Layout.setVerticalGroup(
            jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(productnameLbl9)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel45, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel16Layout.createSequentialGroup()
                        .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel66)
                            .addComponent(jLabel67)
                            .addComponent(priceLbl9))
                        .addGap(27, 27, 27)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(likeButton9)
                    .addComponent(cartButton9)
                    .addComponent(orderButton9))
                .addGap(22, 22, 22))
        );

        jLabel10.setFont(new java.awt.Font("Arial Rounded MT Bold", 1, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(51, 204, 0));
        jLabel10.setText("ELECTRONICS");

        jLabel11.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(51, 255, 51));
        jLabel11.setText(">>");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jPanel10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(jPanel16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel11, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 191, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(497, 497, 497))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel11)
                .addContainerGap(95, Short.MAX_VALUE))
        );

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setText("Swipe for more");
        jButton1.setBorder(null);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(554, 554, 554)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void profilebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_profilebuttonActionPerformed
        new ProfileJFrame(con).setVisible(true);
        
    }//GEN-LAST:event_profilebuttonActionPerformed

    private void orderButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButtonActionPerformed
        System.out.println("Opening OrderJFrame...");
        new OrderJFrame(con).setVisible(true);
        System.out.println("Opend OrderJFrame...");
    }//GEN-LAST:event_orderButtonActionPerformed

    private void likebuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_likebuttonActionPerformed
        new LikeJFrame(con).setVisible(true);
    }//GEN-LAST:event_likebuttonActionPerformed

    private void cartbuttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartbuttonActionPerformed
        new CartJFrame(con).setVisible(true);
    }//GEN-LAST:event_cartbuttonActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:    swipe button
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton8ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton8ActionPerformed

    private void cartButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartButton1ActionPerformed
        try {
            int productid =1001;
            //String productprice = priceLbl1.getText();
            String productprice = priceLbl1.getText();
            int price = Integer.parseInt(productprice);

            String productname = productnameLbl1.getText();
            int count=1;
            //String address=profileaddress.getText();
            //String address="MH2 Hostel,LBS";
            //String email = txtEmail.getText();
            //String address = txtAddress.getText();
            
            pst = con.prepareStatement("INSERT INTO cartproduct (productid,productname,count,productprice)VALUES(?,?,?,?)");
            
            pst.setInt(1,productid);
            pst.setString(2,productname);
            pst.setInt(4,count);
            pst.setInt(3,price);
            
            //pst.setString(5,address);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product added to your cart");
            System.out.println("Opening CartJFrame...");
            new CartJFrame(con).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CartJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cartButton1ActionPerformed

    private void likeButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_likeButton1ActionPerformed
        try {
            int productid =1001;
            //String productprice = priceLbl1.getText();
            String productprice = priceLbl1.getText();
            int price = Integer.parseInt(productprice);

            String productname = productnameLbl1.getText();
            //int count=1;
            //String address=profileaddress.getText();
            //String address="MH2 Hostel,LBS";
            //String email = txtEmail.getText();
            //String address = txtAddress.getText();
            
            pst = con.prepareStatement("INSERT INTO likeproduct (productid,productname,productprice)VALUES(?,?,?)");
            
            pst.setInt(1,productid);
            pst.setString(2,productname);
            pst.setInt(3,price);
            //pst.setInt(4,count);
            //pst.setString(5,address);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product added to your wishlist");
            System.out.println("Opening LikeJFrame...");
            new LikeJFrame(con).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(LikeJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_likeButton1ActionPerformed

    private void orderButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButton1ActionPerformed
           
 try {
            int productid =1001;
            //String productprice = priceLbl1.getText();
            String productprice = priceLbl1.getText();
            int price = Integer.parseInt(productprice);

            String productname = productnameLbl1.getText();
            int count=1;
            //String address=profileaddress.getText();
            String address="MH2 Hostel,LBS";
            //String email = txtEmail.getText();
            //String address = txtAddress.getText();
            
            pst = con.prepareStatement("INSERT INTO orderproduct (productid,productname,productprice,count,address)VALUES(?,?,?,?,?)");
            
            pst.setInt(1,productid);
            pst.setString(2,productname);
            pst.setInt(3,price);
            pst.setInt(4,count);
            pst.setString(5,address);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "ORDER CONFIRMED");
            System.out.println("Opening OrderJFrame...");
            new OrderJFrame(con).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(OrderJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
   
            

        
    }//GEN-LAST:event_orderButton1ActionPerformed

    private void likeButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_likeButton2ActionPerformed
        try {
            int productid =1002;
            //String productprice = priceLbl1.getText();
            String productprice = priceLbl2.getText();
            int price = Integer.parseInt(productprice);

            String productname = productnameLbl2.getText();
            //int count=1;
            //String address=profileaddress.getText();
            //String address="MH2 Hostel,LBS";
            //String email = txtEmail.getText();
            //String address = txtAddress.getText();
            
            pst = con.prepareStatement("INSERT INTO likeproduct (productid,productname,productprice)VALUES(?,?,?)");
            
            pst.setInt(1,productid);
            pst.setString(2,productname);
            pst.setInt(3,price);
            //pst.setInt(4,count);
            //pst.setString(5,address);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product added to your wishlist");
            System.out.println("Opening LikeJFrame...");
            new LikeJFrame(con).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(LikeJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_likeButton2ActionPerformed

    private void cartButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartButton2ActionPerformed
        try {
            int productid =1002;
            //String productprice = priceLbl1.getText();
            String productprice = priceLbl2.getText();
            int price = Integer.parseInt(productprice);

            String productname = productnameLbl2.getText();
            int count=1;
            //String address=profileaddress.getText();
            //String address="MH2 Hostel,LBS";
            //String email = txtEmail.getText();
            //String address = txtAddress.getText();
            
            pst = con.prepareStatement("INSERT INTO cartproduct (productid,productname,count,productprice)VALUES(?,?,?,?)");
            
            pst.setInt(1,productid);
            pst.setString(2,productname);
            pst.setInt(4,count);
            pst.setInt(3,price);
            
            //pst.setString(5,address);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product added to your cart");
            System.out.println("Opening CartJFrame...");
            new CartJFrame(con).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CartJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cartButton2ActionPerformed

    private void orderButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButton2ActionPerformed
        try {
            int productid =1002;
            //String productprice = priceLbl1.getText();
            String productprice = priceLbl2.getText();
            int price = Integer.parseInt(productprice);

            String productname = productnameLbl2.getText();
            int count=1;
            //String address=profileaddress.getText();
            String address="MH2 Hostel,LBS";
            //String email = txtEmail.getText();
            //String address = txtAddress.getText();
            
            pst = con.prepareStatement("INSERT INTO orderproduct (productid,productname,productprice,count,address)VALUES(?,?,?,?,?)");
            
            pst.setInt(1,productid);
            pst.setString(2,productname);
            pst.setInt(3,price);
            pst.setInt(4,count);
            pst.setString(5,address);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "ORDER CONFIRMED");
            System.out.println("Opening OrderJFrame...");
            new OrderJFrame(con).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(OrderJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_orderButton2ActionPerformed

    private void likeButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_likeButton4ActionPerformed
        try {
            int productid =1004;
            //String productprice = priceLbl1.getText();
            String productprice = priceLbl4.getText();
            int price = Integer.parseInt(productprice);

            String productname = productnameLbl4.getText();
            //int count=1;
            //String address=profileaddress.getText();
            //String address="MH2 Hostel,LBS";
            //String email = txtEmail.getText();
            //String address = txtAddress.getText();
            
            pst = con.prepareStatement("INSERT INTO likeproduct (productid,productname,productprice)VALUES(?,?,?)");
            
            pst.setInt(1,productid);
            pst.setString(2,productname);
            pst.setInt(3,price);
            //pst.setInt(4,count);
            //pst.setString(5,address);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product added to your wishlist");
            System.out.println("Opening LikeJFrame...");
            new LikeJFrame(con).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(LikeJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_likeButton4ActionPerformed

    private void cartButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartButton4ActionPerformed
        try {
            int productid =1004;
            //String productprice = priceLbl1.getText();
            String productprice = priceLbl4.getText();
            int price = Integer.parseInt(productprice);

            String productname = productnameLbl4.getText();
            int count=1;
            //String address=profileaddress.getText();
            //String address="MH2 Hostel,LBS";
            //String email = txtEmail.getText();
            //String address = txtAddress.getText();
            
            pst = con.prepareStatement("INSERT INTO cartproduct (productid,productname,count,productprice)VALUES(?,?,?,?)");
            
            pst.setInt(1,productid);
            pst.setString(2,productname);
            pst.setInt(4,count);
            pst.setInt(3,price);
            
            //pst.setString(5,address);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product added to your cart");
            System.out.println("Opening CartJFrame...");
            new CartJFrame(con).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CartJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cartButton4ActionPerformed

    private void orderButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButton4ActionPerformed
        try {
            int productid =1004;
            //String productprice = priceLbl1.getText();
            String productprice = priceLbl4.getText();
            int price = Integer.parseInt(productprice);

            String productname = productnameLbl4.getText();
            int count=1;
            //String address=profileaddress.getText();
            String address="MH2 Hostel,LBS";
            //String email = txtEmail.getText();
            //String address = txtAddress.getText();
            
            pst = con.prepareStatement("INSERT INTO orderproduct (productid,productname,productprice,count,address)VALUES(?,?,?,?,?)");
            
            pst.setInt(1,productid);
            pst.setString(2,productname);
            pst.setInt(3,price);
            pst.setInt(4,count);
            pst.setString(5,address);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "ORDER CONFIRMED");
            System.out.println("Opening OrderJFrame...");
            new OrderJFrame(con).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(OrderJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_orderButton4ActionPerformed

    private void likeButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_likeButton5ActionPerformed
        try {
            int productid =1005;
            //String productprice = priceLbl1.getText();
            String productprice = priceLbl5.getText();
            int price = Integer.parseInt(productprice);

            String productname = productnameLbl5.getText();
            //int count=1;
            //String address=profileaddress.getText();
            //String address="MH2 Hostel,LBS";
            //String email = txtEmail.getText();
            //String address = txtAddress.getText();
            
            pst = con.prepareStatement("INSERT INTO likeproduct (productid,productname,productprice)VALUES(?,?,?)");
            
            pst.setInt(1,productid);
            pst.setString(2,productname);
            pst.setInt(3,price);
            //pst.setInt(4,count);
            //pst.setString(5,address);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product added to your wishlist");
            System.out.println("Opening LikeJFrame...");
            new LikeJFrame(con).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(LikeJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_likeButton5ActionPerformed

    private void cartButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartButton5ActionPerformed
        try {
            int productid =1005;
            //String productprice = priceLbl1.getText();
            String productprice = priceLbl5.getText();
            int price = Integer.parseInt(productprice);

            String productname = productnameLbl5.getText();
            int count=1;
            //String address=profileaddress.getText();
            //String address="MH2 Hostel,LBS";
            //String email = txtEmail.getText();
            //String address = txtAddress.getText();
            
            pst = con.prepareStatement("INSERT INTO cartproduct (productid,productname,count,productprice)VALUES(?,?,?,?)");
            
            pst.setInt(1,productid);
            pst.setString(2,productname);
            pst.setInt(4,count);
            pst.setInt(3,price);
            
            //pst.setString(5,address);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product added to your cart");
            System.out.println("Opening CartJFrame...");
            new CartJFrame(con).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CartJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cartButton5ActionPerformed

    private void orderButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButton5ActionPerformed
        try {
            int productid =1005;
            //String productprice = priceLbl1.getText();
            String productprice = priceLbl5.getText();
            int price = Integer.parseInt(productprice);

            String productname = productnameLbl5.getText();
            int count=1;
            //String address=profileaddress.getText();
            String address="MH2 Hostel,LBS";
            //String email = txtEmail.getText();
            //String address = txtAddress.getText();
            
            pst = con.prepareStatement("INSERT INTO orderproduct (productid,productname,productprice,count,address)VALUES(?,?,?,?,?)");
            
            pst.setInt(1,productid);
            pst.setString(2,productname);
            pst.setInt(3,price);
            pst.setInt(4,count);
            pst.setString(5,address);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "ORDER CONFIRMED");
            System.out.println("Opening OrderJFrame...");
            new OrderJFrame(con).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(OrderJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_orderButton5ActionPerformed

    private void likeButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_likeButton3ActionPerformed
        try {
            int productid =1003;
            //String productprice = priceLbl1.getText();
            String productprice = priceLbl3.getText();
            int price = Integer.parseInt(productprice);

            String productname = productnameLbl3.getText();
            //int count=1;
            //String address=profileaddress.getText();
            //String address="MH2 Hostel,LBS";
            //String email = txtEmail.getText();
            //String address = txtAddress.getText();
            
            pst = con.prepareStatement("INSERT INTO likeproduct (productid,productname,productprice)VALUES(?,?,?)");
            
            pst.setInt(1,productid);
            pst.setString(2,productname);
            pst.setInt(3,price);
            //pst.setInt(4,count);
            //pst.setString(5,address);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product added to your wishlist");
            System.out.println("Opening LikeJFrame...");
            new LikeJFrame(con).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(LikeJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_likeButton3ActionPerformed

    private void cartButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartButton3ActionPerformed
        try {
            int productid =1003;
            //String productprice = priceLbl1.getText();
            String productprice = priceLbl3.getText();
            int price = Integer.parseInt(productprice);

            String productname = productnameLbl3.getText();
            int count=1;
            //String address=profileaddress.getText();
            //String address="MH2 Hostel,LBS";
            //String email = txtEmail.getText();
            //String address = txtAddress.getText();
            
            pst = con.prepareStatement("INSERT INTO cartproduct (productid,productname,count,productprice)VALUES(?,?,?,?)");
            
            pst.setInt(1,productid);
            pst.setString(2,productname);
            pst.setInt(4,count);
            pst.setInt(3,price);
            
            //pst.setString(5,address);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product added to your cart");
            System.out.println("Opening CartJFrame...");
            new CartJFrame(con).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CartJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cartButton3ActionPerformed

    private void orderButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButton3ActionPerformed
        try {
            int productid =1003;
            //String productprice = priceLbl1.getText();
            String productprice = priceLbl3.getText();
            int price = Integer.parseInt(productprice);

            String productname = productnameLbl3.getText();
            int count=1;
            //String address=profileaddress.getText();
            String address="MH2 Hostel,LBS";
            //String email = txtEmail.getText();
            //String address = txtAddress.getText();
            
            pst = con.prepareStatement("INSERT INTO orderproduct (productid,productname,productprice,count,address)VALUES(?,?,?,?,?)");
            
            pst.setInt(1,productid);
            pst.setString(2,productname);
            pst.setInt(3,price);
            pst.setInt(4,count);
            pst.setString(5,address);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "ORDER CONFIRMED");
            System.out.println("Opening OrderJFrame...");
            new OrderJFrame(con).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(OrderJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_orderButton3ActionPerformed

    private void likeButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_likeButton6ActionPerformed
        try {
            int productid =1006;
            //String productprice = priceLbl1.getText();
            String productprice = priceLbl6.getText();
            int price = Integer.parseInt(productprice);

            String productname = productnameLbl6.getText();
            //int count=1;
            //String address=profileaddress.getText();
            //String address="MH2 Hostel,LBS";
            //String email = txtEmail.getText();
            //String address = txtAddress.getText();
            
            pst = con.prepareStatement("INSERT INTO likeproduct (productid,productname,productprice)VALUES(?,?,?)");
            
            pst.setInt(1,productid);
            pst.setString(2,productname);
            pst.setInt(3,price);
            //pst.setInt(4,count);
            //pst.setString(5,address);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product added to your wishlist");
            System.out.println("Opening LikeJFrame...");
            new LikeJFrame(con).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(LikeJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_likeButton6ActionPerformed

    private void cartButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartButton6ActionPerformed
        try {
            int productid =1006;
            //String productprice = priceLbl1.getText();
            String productprice = priceLbl6.getText();
            int price = Integer.parseInt(productprice);

            String productname = productnameLbl6.getText();
            int count=1;
            //String address=profileaddress.getText();
            //String address="MH2 Hostel,LBS";
            //String email = txtEmail.getText();
            //String address = txtAddress.getText();
            
            pst = con.prepareStatement("INSERT INTO cartproduct (productid,productname,count,productprice)VALUES(?,?,?,?)");
            
            pst.setInt(1,productid);
            pst.setString(2,productname);
            pst.setInt(4,count);
            pst.setInt(3,price);
            
            //pst.setString(5,address);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product added to your cart");
            System.out.println("Opening CartJFrame...");
            new CartJFrame(con).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CartJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cartButton6ActionPerformed

    private void orderButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButton6ActionPerformed
        try {
            int productid =1006;
            //String productprice = priceLbl1.getText();
            String productprice = priceLbl6.getText();
            int price = Integer.parseInt(productprice);

            String productname = productnameLbl6.getText();
            int count=1;
            //String address=profileaddress.getText();
            String address="MH2 Hostel,LBS";
            //String email = txtEmail.getText();
            //String address = txtAddress.getText();
            
            pst = con.prepareStatement("INSERT INTO orderproduct (productid,productname,productprice,count,address)VALUES(?,?,?,?,?)");
            
            pst.setInt(1,productid);
            pst.setString(2,productname);
            pst.setInt(3,price);
            pst.setInt(4,count);
            pst.setString(5,address);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "ORDER CONFIRMED");
            System.out.println("Opening OrderJFrame...");
            new OrderJFrame(con).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(OrderJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_orderButton6ActionPerformed

    private void likeButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_likeButton7ActionPerformed
        try {
            int productid =1007;
            //String productprice = priceLbl1.getText();
            String productprice = priceLbl7.getText();
            int price = Integer.parseInt(productprice);

            String productname = productnameLbl7.getText();
            //int count=1;
            //String address=profileaddress.getText();
            //String address="MH2 Hostel,LBS";
            //String email = txtEmail.getText();
            //String address = txtAddress.getText();
            
            pst = con.prepareStatement("INSERT INTO likeproduct (productid,productname,productprice)VALUES(?,?,?)");
            
            pst.setInt(1,productid);
            pst.setString(2,productname);
            pst.setInt(3,price);
            //pst.setInt(4,count);
            //pst.setString(5,address);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product added to your wishlist");
            System.out.println("Opening LikeJFrame...");
            new LikeJFrame(con).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(LikeJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_likeButton7ActionPerformed

    private void cartButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartButton7ActionPerformed
        try {
            int productid =1007;
            //String productprice = priceLbl1.getText();
            String productprice = priceLbl7.getText();
            int price = Integer.parseInt(productprice);

            String productname = productnameLbl7.getText();
            int count=1;
            //String address=profileaddress.getText();
            //String address="MH2 Hostel,LBS";
            //String email = txtEmail.getText();
            //String address = txtAddress.getText();
            
            pst = con.prepareStatement("INSERT INTO cartproduct (productid,productname,count,productprice)VALUES(?,?,?,?)");
            
            pst.setInt(1,productid);
            pst.setString(2,productname);
            pst.setInt(4,count);
            pst.setInt(3,price);
            
            //pst.setString(5,address);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product added to your cart");
            System.out.println("Opening CartJFrame...");
            new CartJFrame(con).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CartJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cartButton7ActionPerformed

    private void orderButton7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButton7ActionPerformed
        try {
            int productid =1007;
            //String productprice = priceLbl1.getText();
            String productprice = priceLbl7.getText();
            int price = Integer.parseInt(productprice);

            String productname = productnameLbl7.getText();
            int count=1;
            //String address=profileaddress.getText();
            String address="MH2 Hostel,LBS";
            //String email = txtEmail.getText();
            //String address = txtAddress.getText();
            
            pst = con.prepareStatement("INSERT INTO orderproduct (productid,productname,productprice,count,address)VALUES(?,?,?,?,?)");
            
            pst.setInt(1,productid);
            pst.setString(2,productname);
            pst.setInt(3,price);
            pst.setInt(4,count);
            pst.setString(5,address);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "ORDER CONFIRMED");
            System.out.println("Opening OrderJFrame...");
            new OrderJFrame(con).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(OrderJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_orderButton7ActionPerformed

    private void likeButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_likeButton8ActionPerformed
        try {
            int productid =1008;
            //String productprice = priceLbl1.getText();
            String productprice = priceLbl8.getText();
            int price = Integer.parseInt(productprice);

            String productname = productnameLbl8.getText();
            //int count=1;
            //String address=profileaddress.getText();
            //String address="MH2 Hostel,LBS";
            //String email = txtEmail.getText();
            //String address = txtAddress.getText();
            
            pst = con.prepareStatement("INSERT INTO likeproduct (productid,productname,productprice)VALUES(?,?,?)");
            
            pst.setInt(1,productid);
            pst.setString(2,productname);
            pst.setInt(3,price);
            //pst.setInt(4,count);
            //pst.setString(5,address);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product added to your wishlist");
            System.out.println("Opening LikeJFrame...");
            new LikeJFrame(con).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(LikeJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_likeButton8ActionPerformed

    private void cartButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartButton8ActionPerformed
        try {
            int productid =1008;
            //String productprice = priceLbl1.getText();
            String productprice = priceLbl8.getText();
            int price = Integer.parseInt(productprice);

            String productname = productnameLbl8.getText();
            int count=1;
            //String address=profileaddress.getText();
            //String address="MH2 Hostel,LBS";
            //String email = txtEmail.getText();
            //String address = txtAddress.getText();
            
            pst = con.prepareStatement("INSERT INTO cartproduct (productid,productname,count,productprice)VALUES(?,?,?,?)");
            
            pst.setInt(1,productid);
            pst.setString(2,productname);
            pst.setInt(4,count);
            pst.setInt(3,price);
            
            //pst.setString(5,address);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product added to your cart");
            System.out.println("Opening CartJFrame...");
            new CartJFrame(con).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CartJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cartButton8ActionPerformed

    private void orderButton8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButton8ActionPerformed
        try {
            int productid =1008;
            //String productprice = priceLbl1.getText();
            String productprice = priceLbl8.getText();
            int price = Integer.parseInt(productprice);

            String productname = productnameLbl8.getText();
            int count=1;
            //String address=profileaddress.getText();
            String address="MH2 Hostel,LBS";
            //String email = txtEmail.getText();
            //String address = txtAddress.getText();
            
            pst = con.prepareStatement("INSERT INTO orderproduct (productid,productname,productprice,count,address)VALUES(?,?,?,?,?)");
            
            pst.setInt(1,productid);
            pst.setString(2,productname);
            pst.setInt(3,price);
            pst.setInt(4,count);
            pst.setString(5,address);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "ORDER CONFIRMED");
            System.out.println("Opening OrderJFrame...");
            new OrderJFrame(con).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(OrderJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_orderButton8ActionPerformed

    private void likeButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_likeButton9ActionPerformed
        try {
            int productid =1009;
            //String productprice = priceLbl1.getText();
            String productprice = priceLbl9.getText();
            int price = Integer.parseInt(productprice);

            String productname = productnameLbl9.getText();
            //int count=1;
            //String address=profileaddress.getText();
            //String address="MH2 Hostel,LBS";
            //String email = txtEmail.getText();
            //String address = txtAddress.getText();
            
            pst = con.prepareStatement("INSERT INTO likeproduct (productid,productname,productprice)VALUES(?,?,?)");
            
            pst.setInt(1,productid);
            pst.setString(2,productname);
            pst.setInt(3,price);
            //pst.setInt(4,count);
            //pst.setString(5,address);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product added to your wishlist");
            System.out.println("Opening LikeJFrame...");
            new LikeJFrame(con).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(LikeJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_likeButton9ActionPerformed

    private void cartButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cartButton9ActionPerformed
        try {
            int productid =1009;
            //String productprice = priceLbl1.getText();
            String productprice = priceLbl9.getText();
            int price = Integer.parseInt(productprice);

            String productname = productnameLbl9.getText();
            int count=1;
            //String address=profileaddress.getText();
            //String address="MH2 Hostel,LBS";
            //String email = txtEmail.getText();
            //String address = txtAddress.getText();
            
            pst = con.prepareStatement("INSERT INTO cartproduct (productid,productname,count,productprice)VALUES(?,?,?,?)");
            
            pst.setInt(1,productid);
            pst.setString(2,productname);
            pst.setInt(4,count);
            pst.setInt(3,price);
            
            //pst.setString(5,address);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "Product added to your cart");
            System.out.println("Opening CartJFrame...");
            new CartJFrame(con).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(CartJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_cartButton9ActionPerformed

    private void orderButton9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_orderButton9ActionPerformed
        try {
            int productid =1009;
            //String productprice = priceLbl1.getText();
            String productprice = priceLbl9.getText();
            int price = Integer.parseInt(productprice);

            String productname = productnameLbl9.getText();
            int count=1;
            //String address=profileaddress.getText();
            String address="MH2 Hostel,LBS";
            //String email = txtEmail.getText();
            //String address = txtAddress.getText();
            
            pst = con.prepareStatement("INSERT INTO orderproduct (productid,productname,productprice,count,address)VALUES(?,?,?,?,?)");
            
            pst.setInt(1,productid);
            pst.setString(2,productname);
            pst.setInt(3,price);
            pst.setInt(4,count);
            pst.setString(5,address);
            
            
            pst.executeUpdate();
            JOptionPane.showMessageDialog(this, "ORDER CONFIRMED");
            System.out.println("Opening OrderJFrame...");
            new OrderJFrame(con).setVisible(true);
        } catch (SQLException ex) {
            Logger.getLogger(OrderJFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_orderButton9ActionPerformed

    
    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainJFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton cartButton1;
    private javax.swing.JButton cartButton2;
    private javax.swing.JButton cartButton3;
    private javax.swing.JButton cartButton4;
    private javax.swing.JButton cartButton5;
    private javax.swing.JButton cartButton6;
    private javax.swing.JButton cartButton7;
    private javax.swing.JButton cartButton8;
    private javax.swing.JButton cartButton9;
    private javax.swing.JButton cartbutton;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton8;
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
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel30;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel45;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel50;
    private javax.swing.JLabel jLabel55;
    private javax.swing.JLabel jLabel57;
    private javax.swing.JLabel jLabel58;
    private javax.swing.JLabel jLabel59;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel60;
    private javax.swing.JLabel jLabel61;
    private javax.swing.JLabel jLabel62;
    private javax.swing.JLabel jLabel63;
    private javax.swing.JLabel jLabel64;
    private javax.swing.JLabel jLabel65;
    private javax.swing.JLabel jLabel66;
    private javax.swing.JLabel jLabel67;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel11;
    private javax.swing.JPanel jPanel12;
    private javax.swing.JPanel jPanel13;
    private javax.swing.JPanel jPanel14;
    private javax.swing.JPanel jPanel15;
    private javax.swing.JPanel jPanel16;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JButton likeButton1;
    private javax.swing.JButton likeButton2;
    private javax.swing.JButton likeButton3;
    private javax.swing.JButton likeButton4;
    private javax.swing.JButton likeButton5;
    private javax.swing.JButton likeButton6;
    private javax.swing.JButton likeButton7;
    private javax.swing.JButton likeButton8;
    private javax.swing.JButton likeButton9;
    private javax.swing.JButton likebutton;
    private javax.swing.JLabel menuLbl;
    private javax.swing.JButton orderButton;
    private javax.swing.JButton orderButton1;
    private javax.swing.JButton orderButton2;
    private javax.swing.JButton orderButton3;
    private javax.swing.JButton orderButton4;
    private javax.swing.JButton orderButton5;
    private javax.swing.JButton orderButton6;
    private javax.swing.JButton orderButton7;
    private javax.swing.JButton orderButton8;
    private javax.swing.JButton orderButton9;
    private javax.swing.JLabel priceLbl1;
    private javax.swing.JLabel priceLbl2;
    private javax.swing.JLabel priceLbl3;
    private javax.swing.JLabel priceLbl4;
    private javax.swing.JLabel priceLbl5;
    private javax.swing.JLabel priceLbl6;
    private javax.swing.JLabel priceLbl7;
    private javax.swing.JLabel priceLbl8;
    private javax.swing.JLabel priceLbl9;
    private javax.swing.JLabel productnameLbl1;
    private javax.swing.JLabel productnameLbl2;
    private javax.swing.JLabel productnameLbl3;
    private javax.swing.JLabel productnameLbl4;
    private javax.swing.JLabel productnameLbl5;
    private javax.swing.JLabel productnameLbl6;
    private javax.swing.JLabel productnameLbl7;
    private javax.swing.JLabel productnameLbl8;
    private javax.swing.JLabel productnameLbl9;
    private javax.swing.JButton profilebutton;
    // End of variables declaration//GEN-END:variables
}
