
package org.xemacscode.demo;


import java.awt.Component;
import java.awt.TextField;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.UIManager;
import javax.swing.UIManager.LookAndFeelInfo;
import javax.swing.UnsupportedLookAndFeelException;




public class User extends javax.swing.JFrame {
    
    double firstnum;
    double secondnum;
    double result;
    String operations;

    
    
    
    public User() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel0 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jtextChickenBurgerM = new javax.swing.JTextField();
        jtextBaconCheeseBurger = new javax.swing.JTextField();
        jtextChickenLegend = new javax.swing.JTextField();
        jtextFiletOFish = new javax.swing.JTextField();
        jtextChickenBurger = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jtextCostOfMeal = new javax.swing.JTextField();
        jtextCofDrink = new javax.swing.JTextField();
        jtextTCOfItem = new javax.swing.JTextField();
        jPanel01 = new javax.swing.JPanel();
        jtextMilkShake = new javax.swing.JTextField();
        jtextVanMilkShake = new javax.swing.JTextField();
        jtextChocMilkShake = new javax.swing.JTextField();
        jtextVanillaCone = new javax.swing.JTextField();
        jtextClasVanilla = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        jLabel20 = new javax.swing.JLabel();
        jPanel6 = new javax.swing.JPanel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jtextDisplay = new javax.swing.JTextField();
        jBtn7 = new javax.swing.JButton();
        jBtn8 = new javax.swing.JButton();
        jBtn9 = new javax.swing.JButton();
        jBtnplus = new javax.swing.JButton();
        jBtndivide = new javax.swing.JButton();
        jBtn5 = new javax.swing.JButton();
        jBtnminus = new javax.swing.JButton();
        jBtn6 = new javax.swing.JButton();
        jBtn2 = new javax.swing.JButton();
        jBtn3 = new javax.swing.JButton();
        jBtnasterik = new javax.swing.JButton();
        jBtn4 = new javax.swing.JButton();
        jBtnzero = new javax.swing.JButton();
        jBtn1 = new javax.swing.JButton();
        jBtnplusminus = new javax.swing.JButton();
        jBtnc = new javax.swing.JButton();
        jBtnequal = new javax.swing.JButton();
        jBtnarrow = new javax.swing.JButton();
        jBtndot = new javax.swing.JButton();
        jtextReceipt = new javax.swing.JPanel();
        jTextField2 = new javax.swing.JTextField();
        jPanel10 = new javax.swing.JPanel();
        jBtnExit = new javax.swing.JButton();
        jBtnTotal1 = new javax.swing.JButton();
        jBtnRecept = new javax.swing.JButton();
        jBtnReset = new javax.swing.JButton();
        jPanel7 = new javax.swing.JPanel();
        jtextSubTotal = new javax.swing.JTextField();
        jtextTotal = new javax.swing.JTextField();
        jtextTax = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setUndecorated(true);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel0.setBackground(new java.awt.Color(0, 181, 204));
        jPanel0.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));
        jPanel0.setPreferredSize(new java.awt.Dimension(1250, 598));
        jPanel0.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));
        jPanel3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jtextChickenBurgerM.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtextChickenBurgerM.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextChickenBurgerM.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jtextBaconCheeseBurger.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtextBaconCheeseBurger.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextBaconCheeseBurger.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jtextChickenLegend.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtextChickenLegend.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextChickenLegend.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jtextFiletOFish.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtextFiletOFish.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextFiletOFish.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jtextChickenBurger.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtextChickenBurger.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextChickenBurger.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel2.setText("Filet-O-Fish");

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel10.setText("Chicken Burger");

        jLabel11.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel11.setText("Chicken Legend");

        jLabel12.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel12.setText("Chicken Burger Meal");

        jLabel13.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel13.setText("Baccon & Cheese Burger");

        jLabel14.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel14.setText("Meals");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel10)
                    .addComponent(jLabel11)
                    .addComponent(jLabel12)
                    .addComponent(jLabel13))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtextBaconCheeseBurger, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(jtextChickenBurgerM, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtextChickenLegend, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtextChickenBurger, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtextFiletOFish, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(31, 31, 31))
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(143, 143, 143)
                .addComponent(jLabel14)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 12, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtextFiletOFish, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtextChickenBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtextChickenLegend, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtextChickenBurgerM, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtextBaconCheeseBurger, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13))
                .addContainerGap())
        );

        jPanel0.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 170, 390, 260));

        jPanel5.setBackground(new java.awt.Color(255, 255, 255));
        jPanel5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel4.setText("Cost of Drinks :");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setText("Cost of Meal :");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel6.setText("Total Cost of Items :");

        jtextCostOfMeal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtextCostOfMeal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextCostOfMeal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jtextCofDrink.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtextCofDrink.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextCofDrink.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jtextTCOfItem.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtextTCOfItem.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextTCOfItem.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtextCostOfMeal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                    .addComponent(jtextCofDrink, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtextTCOfItem, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(22, 22, 22))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtextCostOfMeal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtextCofDrink, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(19, 19, 19)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtextTCOfItem, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25))
        );

        jPanel0.add(jPanel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 440, 388, 220));

        jPanel01.setBackground(new java.awt.Color(255, 255, 255));
        jPanel01.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jtextMilkShake.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtextMilkShake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextMilkShake.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jtextVanMilkShake.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtextVanMilkShake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextVanMilkShake.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jtextChocMilkShake.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtextChocMilkShake.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextChocMilkShake.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jtextVanillaCone.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtextVanillaCone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextVanillaCone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jtextClasVanilla.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtextClasVanilla.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextClasVanilla.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel15.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel15.setText("Milk Shake");

        jLabel16.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel16.setText("Vanilla Cone");

        jLabel17.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel17.setText("Classic Vanilla");

        jLabel18.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel18.setText("Vanilla Milk Shake");
        jLabel18.setToolTipText("");

        jLabel19.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel19.setText("Chocolate Milik Shake");

        jLabel20.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel20.setText("Drinks");

        javax.swing.GroupLayout jPanel01Layout = new javax.swing.GroupLayout(jPanel01);
        jPanel01.setLayout(jPanel01Layout);
        jPanel01Layout.setHorizontalGroup(
            jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel01Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel17)
                    .addComponent(jLabel18)
                    .addComponent(jLabel19)
                    .addComponent(jLabel16)
                    .addComponent(jLabel15))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jtextChocMilkShake, javax.swing.GroupLayout.DEFAULT_SIZE, 104, Short.MAX_VALUE)
                    .addComponent(jtextClasVanilla)
                    .addComponent(jtextVanillaCone)
                    .addComponent(jtextMilkShake)
                    .addComponent(jtextVanMilkShake))
                .addGap(38, 38, 38))
            .addGroup(jPanel01Layout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel20)
                .addContainerGap(188, Short.MAX_VALUE))
        );
        jPanel01Layout.setVerticalGroup(
            jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel01Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(jtextMilkShake, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtextVanillaCone, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16))
                .addGap(11, 11, 11)
                .addGroup(jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtextClasVanilla, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtextVanMilkShake, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel01Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtextChocMilkShake, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel19))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel0.add(jPanel01, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 170, 420, 260));

        jPanel6.setBackground(new java.awt.Color(255, 255, 255));
        jPanel6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jTabbedPane1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jPanel1.setBackground(new java.awt.Color(0, 181, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jtextDisplay.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtextDisplay.setHorizontalAlignment(javax.swing.JTextField.RIGHT);
        jtextDisplay.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jBtn7.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn7.setText("7");
        jBtn7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jBtn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn7ActionPerformed(evt);
            }
        });

        jBtn8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn8.setText("8");
        jBtn8.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jBtn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn8ActionPerformed(evt);
            }
        });

        jBtn9.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn9.setText("9");
        jBtn9.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jBtn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn9ActionPerformed(evt);
            }
        });

        jBtnplus.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnplus.setText("+");
        jBtnplus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jBtnplus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnplusActionPerformed(evt);
            }
        });

        jBtndivide.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtndivide.setText("/");
        jBtndivide.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jBtndivide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtndivideActionPerformed(evt);
            }
        });

        jBtn5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn5.setText("5");
        jBtn5.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jBtn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn5ActionPerformed(evt);
            }
        });

        jBtnminus.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnminus.setText("-");
        jBtnminus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jBtnminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnminusActionPerformed(evt);
            }
        });

        jBtn6.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn6.setText("6");
        jBtn6.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jBtn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn6ActionPerformed(evt);
            }
        });

        jBtn2.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn2.setText("2");
        jBtn2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jBtn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn2ActionPerformed(evt);
            }
        });

        jBtn3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn3.setText("3");
        jBtn3.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jBtn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn3ActionPerformed(evt);
            }
        });

        jBtnasterik.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnasterik.setText("*");
        jBtnasterik.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jBtnasterik.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnasterikActionPerformed(evt);
            }
        });

        jBtn4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn4.setText("4");
        jBtn4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jBtn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn4ActionPerformed(evt);
            }
        });

        jBtnzero.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnzero.setText("0");
        jBtnzero.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jBtnzero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnzeroActionPerformed(evt);
            }
        });

        jBtn1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtn1.setText("1");
        jBtn1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jBtn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn1ActionPerformed(evt);
            }
        });

        jBtnplusminus.setFont(new java.awt.Font("Tahoma", 1, 15)); // NOI18N
        jBtnplusminus.setText("+/-");
        jBtnplusminus.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jBtnplusminus.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnplusminusActionPerformed(evt);
            }
        });

        jBtnc.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnc.setText("C");
        jBtnc.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jBtnc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtncActionPerformed(evt);
            }
        });

        jBtnequal.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnequal.setText("=");
        jBtnequal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jBtnequal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnequalActionPerformed(evt);
            }
        });

        jBtnarrow.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtnarrow.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/xemacscode/demo/icons/left-arrow.png"))); // NOI18N
        jBtnarrow.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jBtnarrow.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnarrowActionPerformed(evt);
            }
        });

        jBtndot.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jBtndot.setText(".");
        jBtndot.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jBtndot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtndotActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnarrow, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnc, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnplusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnplus, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                    .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jBtnminus, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtnasterik, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBtndivide, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jtextDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jBtnzero, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtndot, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jBtnequal, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jtextDisplay, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnplus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnplusminus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnc, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnarrow, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnminus, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn7, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn8, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnasterik, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn6, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn5, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn4, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtndivide, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtn3, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnzero, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnequal, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtndot, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(146, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Calculator", jPanel1);

        jtextReceipt.setBackground(new java.awt.Color(255, 255, 255));

        jTextField2.setAutoscrolls(false);

        javax.swing.GroupLayout jtextReceiptLayout = new javax.swing.GroupLayout(jtextReceipt);
        jtextReceipt.setLayout(jtextReceiptLayout);
        jtextReceiptLayout.setHorizontalGroup(
            jtextReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 335, Short.MAX_VALUE)
        );
        jtextReceiptLayout.setVerticalGroup(
            jtextReceiptLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 538, Short.MAX_VALUE)
        );

        jTabbedPane1.addTab("Recept", jtextReceipt);

        javax.swing.GroupLayout jPanel6Layout = new javax.swing.GroupLayout(jPanel6);
        jPanel6.setLayout(jPanel6Layout);
        jPanel6Layout.setHorizontalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        jPanel6Layout.setVerticalGroup(
            jPanel6Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel6Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );

        jPanel0.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(840, 170, -1, 600));

        jPanel10.setBackground(new java.awt.Color(0, 181, 204));
        jPanel10.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jBtnExit.setBackground(new java.awt.Color(255, 0, 51));
        jBtnExit.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnExit.setForeground(new java.awt.Color(255, 255, 255));
        jBtnExit.setText("Exit");
        jBtnExit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jBtnExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jBtnExitMouseClicked(evt);
            }
        });
        jBtnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnExitActionPerformed(evt);
            }
        });

        jBtnTotal1.setBackground(new java.awt.Color(51, 255, 51));
        jBtnTotal1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnTotal1.setForeground(new java.awt.Color(255, 255, 255));
        jBtnTotal1.setText("Total");
        jBtnTotal1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jBtnTotal1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnTotal1ActionPerformed(evt);
            }
        });

        jBtnRecept.setBackground(new java.awt.Color(0, 0, 255));
        jBtnRecept.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnRecept.setForeground(new java.awt.Color(255, 255, 255));
        jBtnRecept.setText("Confirm");
        jBtnRecept.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jBtnRecept.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnReceptActionPerformed(evt);
            }
        });

        jBtnReset.setBackground(new java.awt.Color(255, 0, 153));
        jBtnReset.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jBtnReset.setForeground(new java.awt.Color(255, 255, 255));
        jBtnReset.setText("Reset");
        jBtnReset.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jBtnReset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtnResetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jBtnTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(93, 93, 93)
                .addComponent(jBtnRecept, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
                .addComponent(jBtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 124, Short.MAX_VALUE)
                .addComponent(jBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel10Layout.createSequentialGroup()
                .addContainerGap(31, Short.MAX_VALUE)
                .addGroup(jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBtnRecept, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnTotal1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnReset, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBtnExit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jPanel0.add(jPanel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 670, 820, -1));

        jPanel7.setBackground(new java.awt.Color(255, 255, 255));
        jPanel7.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 4));

        jtextSubTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtextSubTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextSubTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jtextTotal.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtextTotal.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextTotal.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jtextTax.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jtextTax.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jtextTax.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setText("Sub Total :");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Tax :");

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel9.setText("Total :");

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(20, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.Alignment.TRAILING))
                .addGap(106, 106, 106)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtextTax, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtextSubTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtextTotal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtextTax, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtextSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtextTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
        );

        jPanel0.add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 440, 420, 220));

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("x");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });
        jPanel0.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(1150, 15, -1, -1));

        jTextField1.setBackground(new java.awt.Color(0, 181, 204));
        jTextField1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setText("  Online Food Ordering System  ");
        jTextField1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel0.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(444, 100, 371, 48));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/org/xemacscode/demo/icons/logo.png"))); // NOI18N
        jPanel0.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(591, 25, -1, -1));

        getContentPane().add(jPanel0, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1226, 790));

        setSize(new java.awt.Dimension(1228, 790));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel3MouseClicked
        // TODO add your handling code here:

       System.exit(0);
    }//GEN-LAST:event_jLabel3MouseClicked

    private void jBtnasterikActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnasterikActionPerformed
        // TODO add your handling code here:
        firstnum = Double.parseDouble(jtextDisplay.getText());
        jtextDisplay.setText("");
        operations = "*";
    }//GEN-LAST:event_jBtnasterikActionPerformed

    private void jBtn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn4ActionPerformed
        // TODO add your handling code here:
        String Enternumber = jtextDisplay.getText() + jBtn4.getText();
        jtextDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn4ActionPerformed

    private void jBtn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn7ActionPerformed
        // TODO add your handling code here:
        
        String Enternumber = jtextDisplay.getText() + jBtn7.getText();
        jtextDisplay.setText(Enternumber);
        
    }//GEN-LAST:event_jBtn7ActionPerformed

    private void jBtn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn8ActionPerformed
        // TODO add your handling code here:
        
        String Enternumber = jtextDisplay.getText() + jBtn8.getText();
        jtextDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn8ActionPerformed

    private void jBtn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn9ActionPerformed
        // TODO add your handling code here:
        
        String Enternumber = jtextDisplay.getText() + jBtn9.getText();
        jtextDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn9ActionPerformed

    private void jBtn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn5ActionPerformed
        // TODO add your handling code here:
        String Enternumber = jtextDisplay.getText() + jBtn5.getText();
        jtextDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn5ActionPerformed

    private void jBtn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn6ActionPerformed
        // TODO add your handling code here:
        String Enternumber = jtextDisplay.getText() + jBtn6.getText();
        jtextDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn6ActionPerformed

    private void jBtn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn1ActionPerformed
        // TODO add your handling code here:
        String Enternumber = jtextDisplay.getText() + jBtn1.getText();
        jtextDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn1ActionPerformed

    private void jBtn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn2ActionPerformed
        // TODO add your handling code here:
        String Enternumber = jtextDisplay.getText() + jBtn2.getText();
        jtextDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn2ActionPerformed

    private void jBtn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn3ActionPerformed
        // TODO add your handling code here:
        String Enternumber = jtextDisplay.getText() + jBtn3.getText();
        jtextDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtn3ActionPerformed

    private void jBtnzeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnzeroActionPerformed
        // TODO add your handling code here:
        String Enternumber = jtextDisplay.getText() + jBtnzero.getText();
        jtextDisplay.setText(Enternumber);
    }//GEN-LAST:event_jBtnzeroActionPerformed

    private void jBtncActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtncActionPerformed
        // TODO add your handling code here:
        
        jtextDisplay.setText(null);
        
        
    }//GEN-LAST:event_jBtncActionPerformed

    private void jBtnarrowActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnarrowActionPerformed
        // TODO add your handling code here:
        
        String backspace = null;
        
        if(jtextDisplay.getText().length() > 0){
            
            StringBuilder strB = new StringBuilder(jtextDisplay.getText());
            strB.deleteCharAt(jtextDisplay.getText().length()-1);
            backspace = strB.toString();
            jtextDisplay.setText(backspace);
            
        }
    }//GEN-LAST:event_jBtnarrowActionPerformed

    private void jBtnplusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnplusActionPerformed
        // TODO add your handling code here:
        
        firstnum = Double.parseDouble(jtextDisplay.getText());
        jtextDisplay.setText("");
        operations = "+";
        
        
    }//GEN-LAST:event_jBtnplusActionPerformed

    private void jBtndivideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtndivideActionPerformed
        // TODO add your handling code here:
        
        firstnum = Double.parseDouble(jtextDisplay.getText());
        jtextDisplay.setText("");
        operations = "/";
    }//GEN-LAST:event_jBtndivideActionPerformed

    private void jBtndotActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtndotActionPerformed
        // TODO add your handling code here:
        
        jtextDisplay.setText(jtextDisplay.getText() + jBtndot.getText());
        
        
    }//GEN-LAST:event_jBtndotActionPerformed

    private void jBtnminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnminusActionPerformed
        // TODO add your handling code here:
        firstnum = Double.parseDouble(jtextDisplay.getText());
        jtextDisplay.setText("");
        operations = "-";
    }//GEN-LAST:event_jBtnminusActionPerformed

    private void jBtnplusminusActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnplusminusActionPerformed
        // TODO add your handling code here:
        
        double ops = Double.parseDouble(jtextDisplay.getText());
        ops = ops * (-1);
        jtextDisplay.setText(String.valueOf(ops));

    }//GEN-LAST:event_jBtnplusminusActionPerformed

    private void jBtnequalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnequalActionPerformed
        // TODO add your handling code here:
        
        String answer;
        secondnum = Double.parseDouble(jtextDisplay.getText());
        
        if(operations == "+"){
            
            result = firstnum + secondnum;
            answer = String.format("%.2f", result);
            jtextDisplay.setText(answer);
        }
        else if(operations == "-"){
            
            result = firstnum - secondnum;
            answer = String.format("%.2f", result);
            jtextDisplay.setText(answer);

        }
        
        else if(operations == "*"){
            
            result = firstnum * secondnum;
            answer = String.format("%.2f", result);
            jtextDisplay.setText(answer);
            
        }
        else if(operations == "/"){
           
            result = firstnum / secondnum;
            answer = String.format("%.2f", result);
            jtextDisplay.setText(answer);
        }
        else if(operations == "%"){
            
            result = firstnum % secondnum;
            answer = String.format("%.2f", result);
            jtextDisplay.setText(answer);
        }
    }//GEN-LAST:event_jBtnequalActionPerformed

    private void jBtnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnExitActionPerformed
        
         
         
       

    }//GEN-LAST:event_jBtnExitActionPerformed

    private void jBtnExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jBtnExitMouseClicked
        // TODO add your handling code here:
        
       System.exit(0);
    }//GEN-LAST:event_jBtnExitMouseClicked

    private void jBtnResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnResetActionPerformed
        // TODO add your handling code here:
        
        JTextField cleartext = null;
        
        for(Component c:jPanel3.getComponents()){
            
            if(c.getClass().toString().contains("javax.swing.JTextField")){
                
                cleartext = (JTextField)c;
                
                cleartext.setText("0");

            }   
        } 
        
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        
        for(Component c:jPanel01.getComponents()){
            
            if(c.getClass().toString().contains("javax.swing.JTextField")){
                
                cleartext = (JTextField)c;
                
                cleartext.setText("0");

            }   
        }
        
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        
        for(Component c:jPanel5.getComponents()){
            
            if(c.getClass().toString().contains("javax.swing.JTextField")){
                
                cleartext = (JTextField)c;
                
                cleartext.setText("");

            }   
        }
        
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        
        for(Component c:jPanel7.getComponents()){
            
            if(c.getClass().toString().contains("javax.swing.JTextField")){
                
                cleartext = (JTextField)c;
                
                cleartext.setText("");

            }   
        }
        
        //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
        
        jTextField2.setText(null);
        
        //jtextReceipt.setToolTipText(null);
      /*  for(Component c:.getComponents()){
            
            if(c.getClass().toString().contains("javax.swing.JTextField")){
                
                cleartext = (JTextField)c;
                
                cleartext.setText("");

            }   
        } */
        
        //jTabbedPane1.setText(null);

    }//GEN-LAST:event_jBtnResetActionPerformed

    private void jBtnTotal1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnTotal1ActionPerformed
        // TODO add your handling code here:
        
        SubClass_Child ItemCost = new SubClass_Child();
        
        double iTax, iSubTotal, iTotal;
        
        ItemCost.Filet_O_Fish = ItemCost.pFilet_O_Fish * Double.parseDouble(jtextFiletOFish.getText());
        ItemCost.ChickenBurger = ItemCost.pChickenBurger * Double.parseDouble(jtextChickenBurger.getText());
        ItemCost.ChickenLegend = ItemCost.pChickenLegend * Double.parseDouble(jtextChickenLegend.getText());
        ItemCost.ChickenBurgerM = ItemCost.pChickenBurgerM * Double.parseDouble(jtextChickenBurgerM.getText());
        ItemCost.BaconCheeseBurger = ItemCost.pBaconCheeseBurger * Double.parseDouble(jtextBaconCheeseBurger.getText());
        
        
        ItemCost.MilkShake = ItemCost.pMilkShake * Double.parseDouble(jtextMilkShake.getText());
        ItemCost.VanillaCone = ItemCost.pVanillaCone * Double.parseDouble(jtextVanillaCone.getText());
        ItemCost.ClasVanilla = ItemCost.pClasVanilla * Double.parseDouble(jtextClasVanilla.getText());
        ItemCost.VanMilkShake = ItemCost.pVanMilkShake * Double.parseDouble(jtextVanMilkShake.getText());
        ItemCost.ChocMilkShake = ItemCost.pChocMilkShake * Double.parseDouble(jtextChocMilkShake.getText());
        
        iSubTotal = ItemCost.GetAmount();
        iTax = ItemCost.cFindTax(iSubTotal);
        iTotal = iSubTotal + iTax;
        
        String SubTotal = String.format("$ %.2f", iSubTotal);
        jtextSubTotal.setText(SubTotal);
        
        String Tax = String.format("$ %.2f", iTax);
        jtextTax.setText(Tax);
        
        String Total = String.format("$ %.2f", iTotal);
        jtextTotal.setText(Total);
        
        
        String Meal= String.format("$ %.2f", ItemCost.Meals);
        jtextCostOfMeal.setText(Meal);
        
        String CostofD = String.format("$ %.2f", ItemCost.Drinks);
        jtextCofDrink.setText(CostofD);
        
        String TotalCofItem = String.format("$ %.2f", ItemCost.TotalofMD);
        jtextTCOfItem.setText(TotalCofItem);
        

        
        
    }//GEN-LAST:event_jBtnTotal1ActionPerformed

    private void jBtnReceptActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtnReceptActionPerformed
       
     
       StringBuffer display = new StringBuffer();
     
       jTextField2.setText("\tCongratulations!");
       
    }//GEN-LAST:event_jBtnReceptActionPerformed

   
    public static void main(String args[]) throws ClassNotFoundException, IllegalAccessException, InstantiationException, UnsupportedLookAndFeelException {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new User().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn1;
    private javax.swing.JButton jBtn2;
    private javax.swing.JButton jBtn3;
    private javax.swing.JButton jBtn4;
    private javax.swing.JButton jBtn5;
    private javax.swing.JButton jBtn6;
    private javax.swing.JButton jBtn7;
    private javax.swing.JButton jBtn8;
    private javax.swing.JButton jBtn9;
    private javax.swing.JButton jBtnExit;
    private javax.swing.JButton jBtnRecept;
    private javax.swing.JButton jBtnReset;
    private javax.swing.JButton jBtnTotal1;
    private javax.swing.JButton jBtnarrow;
    private javax.swing.JButton jBtnasterik;
    private javax.swing.JButton jBtnc;
    private javax.swing.JButton jBtndivide;
    private javax.swing.JButton jBtndot;
    private javax.swing.JButton jBtnequal;
    private javax.swing.JButton jBtnminus;
    private javax.swing.JButton jBtnplus;
    private javax.swing.JButton jBtnplusminus;
    private javax.swing.JButton jBtnzero;
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
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel0;
    private javax.swing.JPanel jPanel01;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jtextBaconCheeseBurger;
    private javax.swing.JTextField jtextChickenBurger;
    private javax.swing.JTextField jtextChickenBurgerM;
    private javax.swing.JTextField jtextChickenLegend;
    private javax.swing.JTextField jtextChocMilkShake;
    private javax.swing.JTextField jtextClasVanilla;
    private javax.swing.JTextField jtextCofDrink;
    private javax.swing.JTextField jtextCostOfMeal;
    private javax.swing.JTextField jtextDisplay;
    private javax.swing.JTextField jtextFiletOFish;
    private javax.swing.JTextField jtextMilkShake;
    private javax.swing.JPanel jtextReceipt;
    private javax.swing.JTextField jtextSubTotal;
    private javax.swing.JTextField jtextTCOfItem;
    private javax.swing.JTextField jtextTax;
    private javax.swing.JTextField jtextTotal;
    private javax.swing.JTextField jtextVanMilkShake;
    private javax.swing.JTextField jtextVanillaCone;
    // End of variables declaration//GEN-END:variables

    private StringBuffer jTextField2() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
