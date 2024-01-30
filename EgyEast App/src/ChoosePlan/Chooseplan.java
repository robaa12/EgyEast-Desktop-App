/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package ChoosePlan;

import EgyEast.Home;
import com.mycompany.egyeastlogin.CurrentUser;
import com.mycompany.egyeastlogin.EgyEastLogin;
import static com.mycompany.egyeastlogin.EgyEastLogin.*;
import static com.mycompany.egyeastlogin.SignUp.user_data;
import java.awt.Color;
import java.sql.Connection;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;


/**
 *
 * @author Abdelrahman
 */
public class Chooseplan extends javax.swing.JFrame {
    
    /**
     * Creates new form choose plan
     */
    public Chooseplan() {
        initComponents();
        ImageIcon img = new ImageIcon("C:\\EgyEast_Image\\icons/EgyEast.png");
          this.setIconImage(img.getImage());
        
        
    }
    public void addPlan(int planId){
        String userEmail = "";
        try {
            userEmail = CurrentUser.user_data.getString("Email");
        } catch (SQLException ex) {
            Logger.getLogger(Chooseplan.class.getName()).log(Level.SEVERE, null, ex);
        }
        int newPlanId = planId;
        String sql = "UPDATE [Users] SET Plan_id = " + newPlanId + "Where " + "Email = '" + userEmail +"'";
        updateData(sql);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        java.awt.GridBagConstraints gridBagConstraints;

        jLabel8 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        countianer = new javax.swing.JPanel();
        hover_platinum_plan = new EgyEast.com.roundedpanal.RoundedPanel();
        platinum_plan = new EgyEast.com.roundedpanal.RoundedPanel();
        jLabel11 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        jLabel16 = new javax.swing.JLabel();
        jLabel17 = new javax.swing.JLabel();
        jLabel18 = new javax.swing.JLabel();
        diamond_btn = new com.mycompany.egyeastlogin.myButton();
        jLabel38 = new javax.swing.JLabel();
        jLabel41 = new javax.swing.JLabel();
        hover_diamound_plan = new EgyEast.com.roundedpanal.RoundedPanel();
        diamound_plan = new EgyEast.com.roundedpanal.RoundedPanel();
        jLabel19 = new javax.swing.JLabel();
        jLabel22 = new javax.swing.JLabel();
        jLabel23 = new javax.swing.JLabel();
        jLabel24 = new javax.swing.JLabel();
        jLabel25 = new javax.swing.JLabel();
        platinum_btn = new com.mycompany.egyeastlogin.myButton();
        jLabel40 = new javax.swing.JLabel();
        jLabel39 = new javax.swing.JLabel();
        hover_diamound_plan1 = new EgyEast.com.roundedpanal.RoundedPanel();
        diamound_plan1 = new EgyEast.com.roundedpanal.RoundedPanel();
        jLabel20 = new javax.swing.JLabel();
        jLabel42 = new javax.swing.JLabel();
        jLabel43 = new javax.swing.JLabel();
        jLabel27 = new javax.swing.JLabel();
        jLabel28 = new javax.swing.JLabel();
        jLabel29 = new javax.swing.JLabel();
        gold_btn = new com.mycompany.egyeastlogin.myButton();

        jLabel8.setFont(new java.awt.Font("Inter", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(11, 149, 255));
        jLabel8.setText("# Unlimited Movies");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EgyEast");
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(19, 20, 28));
        jPanel2.setForeground(new java.awt.Color(30, 32, 44));
        jPanel2.setFont(new java.awt.Font("Inter", 0, 12)); // NOI18N
        jPanel2.setPreferredSize(new java.awt.Dimension(1200, 800));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Rubik Black", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(11, 149, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Choose your plan");
        jPanel2.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 20, 1030, 90));

        countianer.setBackground(new java.awt.Color(19, 20, 28));
        countianer.setForeground(new java.awt.Color(19, 20, 28));

        hover_platinum_plan.setBackground(new java.awt.Color(136, 136, 136));
        hover_platinum_plan.setForeground(new java.awt.Color(136, 136, 136));
        hover_platinum_plan.setPreferredSize(new java.awt.Dimension(383, 393));
        hover_platinum_plan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hover_platinum_planMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hover_platinum_planMouseExited(evt);
            }
        });
        hover_platinum_plan.setLayout(new java.awt.GridBagLayout());

        platinum_plan.setBackground(new java.awt.Color(30, 32, 44));
        platinum_plan.setForeground(new java.awt.Color(19, 20, 28));
        platinum_plan.setMinimumSize(new java.awt.Dimension(364, 340));
        platinum_plan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                platinum_planMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                platinum_planMouseExited(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Rubik Black", 0, 24)); // NOI18N
        jLabel11.setForeground(new java.awt.Color(255, 255, 255));
        jLabel11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel11.setText("Diamond plan");

        jLabel14.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(255, 255, 255));
        jLabel14.setText("• Unlimited Movies");

        jLabel15.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        jLabel15.setForeground(new java.awt.Color(255, 255, 255));
        jLabel15.setText("• No Ads");

        jLabel16.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(255, 255, 255));
        jLabel16.setText("• Team watching up to 35 member");

        jLabel17.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        jLabel17.setForeground(new java.awt.Color(255, 255, 255));
        jLabel17.setText("• 4K +HDR Resolution");

        jLabel18.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(255, 255, 255));
        jLabel18.setText("• 300 Downloading");

        diamond_btn.setBackground(new java.awt.Color(11, 149, 255));
        diamond_btn.setForeground(new java.awt.Color(255, 255, 255));
        diamond_btn.setText("Get Trail Period");
        diamond_btn.setBorderColor(new java.awt.Color(11, 149, 255));
        diamond_btn.setColor(new java.awt.Color(11, 149, 255));
        diamond_btn.setFocusable(false);
        diamond_btn.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        diamond_btn.setRadius(25);
        diamond_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                diamond_btnActionPerformed(evt);
            }
        });

        jLabel38.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        jLabel38.setForeground(new java.awt.Color(255, 255, 255));
        jLabel38.setText("/ Year");

        jLabel41.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        jLabel41.setForeground(new java.awt.Color(11, 149, 255));
        jLabel41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel41.setText("$29.99");

        javax.swing.GroupLayout platinum_planLayout = new javax.swing.GroupLayout(platinum_plan);
        platinum_plan.setLayout(platinum_planLayout);
        platinum_planLayout.setHorizontalGroup(
            platinum_planLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(platinum_planLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(platinum_planLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, platinum_planLayout.createSequentialGroup()
                        .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(106, 106, 106))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, platinum_planLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(platinum_planLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel15, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel17, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel18, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(platinum_planLayout.createSequentialGroup()
                .addGap(118, 118, 118)
                .addComponent(diamond_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        platinum_planLayout.setVerticalGroup(
            platinum_planLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(platinum_planLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel11)
                .addGap(11, 11, 11)
                .addGroup(platinum_planLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel38, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel41, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addComponent(jLabel14)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel15)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel16)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel17)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 77, Short.MAX_VALUE)
                .addComponent(diamond_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipady = 79;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 6);
        hover_platinum_plan.add(platinum_plan, gridBagConstraints);

        hover_diamound_plan.setBackground(new java.awt.Color(136, 136, 136));
        hover_diamound_plan.setForeground(new java.awt.Color(136, 136, 136));
        hover_diamound_plan.setPreferredSize(new java.awt.Dimension(383, 393));
        hover_diamound_plan.setLayout(new java.awt.GridBagLayout());

        diamound_plan.setBackground(new java.awt.Color(30, 32, 44));
        diamound_plan.setForeground(new java.awt.Color(19, 20, 28));
        diamound_plan.setMinimumSize(new java.awt.Dimension(364, 340));
        diamound_plan.setPreferredSize(new java.awt.Dimension(364, 344));
        diamound_plan.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                diamound_planMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                diamound_planMouseExited(evt);
            }
        });

        jLabel19.setFont(new java.awt.Font("Rubik Black", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(255, 255, 255));
        jLabel19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel19.setText("Platinum plan");

        jLabel22.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        jLabel22.setForeground(new java.awt.Color(255, 255, 255));
        jLabel22.setText("• Unlimited Movies");

        jLabel23.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        jLabel23.setForeground(new java.awt.Color(255, 255, 255));
        jLabel23.setText("• Team watching up to 20 member");

        jLabel24.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        jLabel24.setForeground(new java.awt.Color(255, 255, 255));
        jLabel24.setText("• 100 Downloading");

        jLabel25.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        jLabel25.setForeground(new java.awt.Color(255, 255, 255));
        jLabel25.setText("• 1080p Resolution");

        platinum_btn.setBackground(new java.awt.Color(11, 149, 255));
        platinum_btn.setForeground(new java.awt.Color(255, 255, 255));
        platinum_btn.setText("Get Trail Period");
        platinum_btn.setBorderColor(new java.awt.Color(11, 149, 255));
        platinum_btn.setColor(new java.awt.Color(11, 149, 255));
        platinum_btn.setFocusable(false);
        platinum_btn.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        platinum_btn.setRadius(25);
        platinum_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                platinum_btnActionPerformed(evt);
            }
        });

        jLabel40.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        jLabel40.setForeground(new java.awt.Color(255, 255, 255));
        jLabel40.setText("/ Year");

        jLabel39.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        jLabel39.setForeground(new java.awt.Color(11, 149, 255));
        jLabel39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel39.setText("$19.99");

        javax.swing.GroupLayout diamound_planLayout = new javax.swing.GroupLayout(diamound_plan);
        diamound_plan.setLayout(diamound_planLayout);
        diamound_planLayout.setHorizontalGroup(
            diamound_planLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, diamound_planLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(diamound_planLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel23, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel24, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel25, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, diamound_planLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(diamound_planLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel19, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel22, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
            .addGroup(diamound_planLayout.createSequentialGroup()
                .addGroup(diamound_planLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(diamound_planLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(diamound_planLayout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(platinum_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        diamound_planLayout.setVerticalGroup(
            diamound_planLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diamound_planLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel19)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(diamound_planLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel40, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel39, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(jLabel22)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel23)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel24)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel25)
                .addGap(29, 29, 29)
                .addComponent(platinum_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(29, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -58;
        gridBagConstraints.ipady = -6;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 8);
        hover_diamound_plan.add(diamound_plan, gridBagConstraints);

        hover_diamound_plan1.setBackground(new java.awt.Color(136, 136, 136));
        hover_diamound_plan1.setForeground(new java.awt.Color(136, 136, 136));
        hover_diamound_plan1.setPreferredSize(new java.awt.Dimension(383, 393));
        hover_diamound_plan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                hover_diamound_plan1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                hover_diamound_plan1MouseExited(evt);
            }
        });
        hover_diamound_plan1.setLayout(new java.awt.GridBagLayout());

        diamound_plan1.setBackground(new java.awt.Color(30, 32, 44));
        diamound_plan1.setForeground(new java.awt.Color(19, 20, 28));
        diamound_plan1.setMinimumSize(new java.awt.Dimension(364, 340));
        diamound_plan1.setPreferredSize(new java.awt.Dimension(364, 344));
        diamound_plan1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                diamound_plan1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                diamound_plan1MouseExited(evt);
            }
        });

        jLabel20.setFont(new java.awt.Font("Rubik Black", 0, 24)); // NOI18N
        jLabel20.setForeground(new java.awt.Color(255, 255, 255));
        jLabel20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel20.setText("Gold plan");

        jLabel42.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        jLabel42.setForeground(new java.awt.Color(255, 255, 255));
        jLabel42.setText("/ Year");

        jLabel43.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        jLabel43.setForeground(new java.awt.Color(11, 149, 255));
        jLabel43.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel43.setText("$9.99");

        jLabel27.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        jLabel27.setForeground(new java.awt.Color(255, 255, 255));
        jLabel27.setText("• Team watching up to 5 member");

        jLabel28.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        jLabel28.setForeground(new java.awt.Color(255, 255, 255));
        jLabel28.setText("• 50 Downloading");

        jLabel29.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        jLabel29.setForeground(new java.awt.Color(255, 255, 255));
        jLabel29.setText("• 720p Resolution");

        gold_btn.setBackground(new java.awt.Color(11, 149, 255));
        gold_btn.setForeground(new java.awt.Color(255, 255, 255));
        gold_btn.setText("Get Trail Period");
        gold_btn.setBorderColor(new java.awt.Color(11, 149, 255));
        gold_btn.setColor(new java.awt.Color(11, 149, 255));
        gold_btn.setFocusable(false);
        gold_btn.setFont(new java.awt.Font("Rubik", 1, 14)); // NOI18N
        gold_btn.setRadius(25);
        gold_btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gold_btnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout diamound_plan1Layout = new javax.swing.GroupLayout(diamound_plan1);
        diamound_plan1.setLayout(diamound_plan1Layout);
        diamound_plan1Layout.setHorizontalGroup(
            diamound_plan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, diamound_plan1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel20, javax.swing.GroupLayout.PREFERRED_SIZE, 314, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(44, 44, 44))
            .addGroup(diamound_plan1Layout.createSequentialGroup()
                .addGroup(diamound_plan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(diamound_plan1Layout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(diamound_plan1Layout.createSequentialGroup()
                        .addGap(90, 90, 90)
                        .addComponent(gold_btn, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(diamound_plan1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel27, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(diamound_plan1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel28, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(diamound_plan1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel29, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        diamound_plan1Layout.setVerticalGroup(
            diamound_plan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(diamound_plan1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel20)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(diamound_plan1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel42, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel43, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel27)
                .addGap(18, 18, 18)
                .addComponent(jLabel28)
                .addGap(18, 18, 18)
                .addComponent(jLabel29)
                .addGap(63, 63, 63)
                .addComponent(gold_btn, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(23, Short.MAX_VALUE))
        );

        gridBagConstraints = new java.awt.GridBagConstraints();
        gridBagConstraints.gridx = 0;
        gridBagConstraints.gridy = 0;
        gridBagConstraints.ipadx = -52;
        gridBagConstraints.ipady = -4;
        gridBagConstraints.anchor = java.awt.GridBagConstraints.NORTHWEST;
        gridBagConstraints.insets = new java.awt.Insets(6, 6, 6, 10);
        hover_diamound_plan1.add(diamound_plan1, gridBagConstraints);

        javax.swing.GroupLayout countianerLayout = new javax.swing.GroupLayout(countianer);
        countianer.setLayout(countianerLayout);
        countianerLayout.setHorizontalGroup(
            countianerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(countianerLayout.createSequentialGroup()
                .addGap(420, 420, 420)
                .addComponent(hover_platinum_plan, javax.swing.GroupLayout.PREFERRED_SIZE, 370, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(hover_diamound_plan, javax.swing.GroupLayout.PREFERRED_SIZE, 320, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(countianerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, countianerLayout.createSequentialGroup()
                    .addContainerGap(50, Short.MAX_VALUE)
                    .addComponent(hover_diamound_plan1, javax.swing.GroupLayout.PREFERRED_SIZE, 328, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(802, Short.MAX_VALUE)))
        );
        countianerLayout.setVerticalGroup(
            countianerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(countianerLayout.createSequentialGroup()
                .addGroup(countianerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(countianerLayout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(hover_diamound_plan, javax.swing.GroupLayout.PREFERRED_SIZE, 350, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(countianerLayout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addComponent(hover_platinum_plan, javax.swing.GroupLayout.PREFERRED_SIZE, 438, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(73, Short.MAX_VALUE))
            .addGroup(countianerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, countianerLayout.createSequentialGroup()
                    .addContainerGap(123, Short.MAX_VALUE)
                    .addComponent(hover_diamound_plan1, javax.swing.GroupLayout.PREFERRED_SIZE, 352, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(125, Short.MAX_VALUE)))
        );

        jPanel2.add(countianer, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 100, 1180, 600));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void diamound_planMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diamound_planMouseEntered
        hover_diamound_plan.setBackground(new Color(11,149,255)); 
    }//GEN-LAST:event_diamound_planMouseEntered

    private void diamound_planMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diamound_planMouseExited

            hover_diamound_plan.setBackground(new Color(136,136,136));
    }
/*
            roundedPanel2.setBackground(new Color(136,136,136));            roundedPanel2.setBackground(new Color(136,136,136));    }//GEN-LAST:event_diamound_planMouseExited
*/
    private void platinum_planMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_platinum_planMouseEntered
        hover_platinum_plan.setBackground(new Color(11,149,255)); 
    }//GEN-LAST:event_platinum_planMouseEntered

    private void platinum_planMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_platinum_planMouseExited

             hover_platinum_plan.setBackground(new Color(136,136,136));
    }/*
        roundedPanel4.setBackground(new Color(136,136,136));        roundedPanel4.setBackground(new Color(136,136,136));    }//GEN-LAST:event_platinum_planMouseExited
*/
   
    private void hover_platinum_planMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover_platinum_planMouseEntered
        
    }//GEN-LAST:event_hover_platinum_planMouseEntered

    private void hover_platinum_planMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover_platinum_planMouseExited
    }//GEN-LAST:event_hover_platinum_planMouseExited

    private void platinum_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_platinum_btnActionPerformed
        // TODO add your handling code here:
        addPlan(2);
        dispose();
        home = new Home();
        home.setVisible(true);
        
    }//GEN-LAST:event_platinum_btnActionPerformed

    private void diamond_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_diamond_btnActionPerformed
        // TODO add your handling code here:
        addPlan(3);
        dispose();
        home = new Home();
        home.setVisible(true);
        
    }//GEN-LAST:event_diamond_btnActionPerformed

    private void gold_btnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gold_btnActionPerformed
        // TODO add your handling code here:
        addPlan(1);
        dispose();
        home = new Home();
        home.setVisible(true);
        
    }//GEN-LAST:event_gold_btnActionPerformed

    private void diamound_plan1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diamound_plan1MouseEntered
        // TODO add your handling code here:
        hover_diamound_plan1.setBackground(new Color(11,149,255));
    }//GEN-LAST:event_diamound_plan1MouseEntered

    private void diamound_plan1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_diamound_plan1MouseExited
        // TODO add your handling code here:
        hover_diamound_plan1.setBackground(new Color(136,136,136));
    }//GEN-LAST:event_diamound_plan1MouseExited

    private void hover_diamound_plan1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover_diamound_plan1MouseEntered
        // TODO add your handling code here:
         
    }//GEN-LAST:event_hover_diamound_plan1MouseEntered

    private void hover_diamound_plan1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_hover_diamound_plan1MouseExited
        // TODO add your handling code here:
        
    }//GEN-LAST:event_hover_diamound_plan1MouseExited

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
            java.util.logging.Logger.getLogger(Chooseplan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Chooseplan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Chooseplan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Chooseplan.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Chooseplan().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel countianer;
    private com.mycompany.egyeastlogin.myButton diamond_btn;
    private EgyEast.com.roundedpanal.RoundedPanel diamound_plan;
    private EgyEast.com.roundedpanal.RoundedPanel diamound_plan1;
    private com.mycompany.egyeastlogin.myButton gold_btn;
    private EgyEast.com.roundedpanal.RoundedPanel hover_diamound_plan;
    private EgyEast.com.roundedpanal.RoundedPanel hover_diamound_plan1;
    private EgyEast.com.roundedpanal.RoundedPanel hover_platinum_plan;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel20;
    private javax.swing.JLabel jLabel22;
    private javax.swing.JLabel jLabel23;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel27;
    private javax.swing.JLabel jLabel28;
    private javax.swing.JLabel jLabel29;
    private javax.swing.JLabel jLabel38;
    private javax.swing.JLabel jLabel39;
    private javax.swing.JLabel jLabel40;
    private javax.swing.JLabel jLabel41;
    private javax.swing.JLabel jLabel42;
    private javax.swing.JLabel jLabel43;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private com.mycompany.egyeastlogin.myButton platinum_btn;
    private EgyEast.com.roundedpanal.RoundedPanel platinum_plan;
    // End of variables declaration//GEN-END:variables
}