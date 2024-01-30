/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package FavPage;
import EgyEast.CustomScrollBarUI;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import EgyEast.Films.RowsCards;
import static EgyEast.Home.scroll;
import EgyEast.com.roundedpanal.RoundedPanel;
import ImagePrint.ImagePanel;
import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.*;
import   java.util.*;

import java.awt.Color;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.util.ArrayList;

import java.util.ArrayList;
import javax.swing.Timer;
import EgyEast.Films.*;
import EgyEast.Home;
import static FavPage.RowsCardsFav.filmCardsFav;
import static com.mycompany.egyeastlogin.EgyEastLogin.favFrame;
import static com.mycompany.egyeastlogin.EgyEastLogin.home;
import static com.mycompany.egyeastlogin.EgyEastLogin.login;
import static com.mycompany.egyeastlogin.EgyEastLogin.user_account;

/**
 *
 * @author YoussefTarek
 */
public class FavFrame extends javax.swing.JFrame {

    public FavFrame() {
        initComponents();
       RowsCardsFav firstrow = new RowsCardsFav(Scroll);
        FavScroll.getVerticalScrollBar().setUI(new CustomScrollBarUI());
        ImageIcon img = new ImageIcon("C:\\EgyEast_Image\\icons/EgyEast.png");
          this.setIconImage(img.getImage());
    }
    
     public static Color primary =new Color(11,149,255)
            ,dark_bg=new Color(19,20,28)
            ,light_bg=new Color(30,32,44)
            ,login_hover=new Color(75,77,90),
            signup_hover=new Color(25, 53, 145)
            ,text_hover=new Color(136,136,136)
            ,white_text=new Color(242,242,242);
     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        lbar2 = new javax.swing.JPanel();
        jPanel6 = new javax.swing.JPanel();
        jLabel3 = new javax.swing.JLabel();
        homebtn = new EgyEast.com.roundedpanal.RoundedPanel();
        homebtnl = new javax.swing.JLabel();
        homeImage = new ImagePrint.ImagePanel();
        logoutbtn = new EgyEast.com.roundedpanal.RoundedPanel();
        logoutbtnl = new javax.swing.JLabel();
        logout = new ImagePrint.ImagePanel();
        favouritesbtn = new EgyEast.com.roundedpanal.RoundedPanel();
        favourtiebtnl = new javax.swing.JLabel();
        favourites = new ImagePrint.ImagePanel();
        profilebtn = new EgyEast.com.roundedpanal.RoundedPanel();
        profilebtnl = new javax.swing.JLabel();
        profile = new ImagePrint.ImagePanel();
        ubar = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        roundedPanel1 = new EgyEast.com.roundedpanal.RoundedPanel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        FavScroll = new javax.swing.JScrollPane();
        Scroll = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EgyEast");
        setPreferredSize(new java.awt.Dimension(1200, 800));
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(19, 20, 28));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbar2.setBackground(new java.awt.Color(30, 32, 44));
        lbar2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel6.setBackground(new java.awt.Color(30, 32, 44));
        jPanel6.setLayout(new java.awt.GridBagLayout());

        jLabel3.setFont(new java.awt.Font("Rubik", 1, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(11, 149, 255));
        jLabel3.setText("EgyEast");
        jPanel6.add(jLabel3, new java.awt.GridBagConstraints());

        lbar2.add(jPanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 80));

        homebtn.setBackground(new java.awt.Color(30, 32, 44));
        homebtn.setForeground(new java.awt.Color(30, 32, 44));
        homebtn.setPreferredSize(new java.awt.Dimension(204, 49));
        homebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homebtnMousePressed(evt);
            }
        });
        homebtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        homebtnl.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        homebtnl.setForeground(new java.awt.Color(242, 242, 242));
        homebtnl.setText("Home");
        homebtnl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        homebtnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homebtnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                homebtnlMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homebtnlMousePressed(evt);
            }
        });
        homebtn.add(homebtnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 120, 50));

        homeImage.setMinimumSize(new java.awt.Dimension(25, 25));
        homeImage.setPreferredSize(new java.awt.Dimension(24, 24));
        homeImage.setImage("C:\\EgyEast_Image\\icons\\Home.png");
        homeImage.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                homeImageMouseEntered(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                homeImageMousePressed(evt);
            }
        });

        javax.swing.GroupLayout homeImageLayout = new javax.swing.GroupLayout(homeImage);
        homeImage.setLayout(homeImageLayout);
        homeImageLayout.setHorizontalGroup(
            homeImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        homeImageLayout.setVerticalGroup(
            homeImageLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        homebtn.add(homeImage, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lbar2.add(homebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 150, -1, -1));

        logoutbtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                logoutbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {

                logoutbtn.setCursor(Cursor.getDefaultCursor());
            }
        });
        logoutbtn.setBackground(new java.awt.Color(30, 32, 44));
        logoutbtn.setForeground(new java.awt.Color(30, 32, 44));
        logoutbtn.setPreferredSize(new java.awt.Dimension(204, 49));
        logoutbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutbtnMousePressed(evt);
            }
        });
        logoutbtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        logoutbtnl.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        logoutbtnl.setForeground(new java.awt.Color(242, 242, 242));
        logoutbtnl.setText("Logout");
        logoutbtnl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        logoutbtnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                logoutbtnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                logoutbtnlMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutbtnlMousePressed(evt);
            }
        });
        logoutbtn.add(logoutbtnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 120, 50));

        logout.setMinimumSize(new java.awt.Dimension(25, 25));
        logout.setImage("C:\\EgyEast_Image\\icons\\Logout.png");
        logout.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                logoutMousePressed(evt);
            }
        });

        javax.swing.GroupLayout logoutLayout = new javax.swing.GroupLayout(logout);
        logout.setLayout(logoutLayout);
        logoutLayout.setHorizontalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        logoutLayout.setVerticalGroup(
            logoutLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        logoutbtn.add(logout, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lbar2.add(logoutbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 670, -1, -1));

        favouritesbtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                favouritesbtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {

                favouritesbtn.setCursor(Cursor.getDefaultCursor());
            }
        });
        favouritesbtn.setBackground(new java.awt.Color(19, 20, 28));
        favouritesbtn.setForeground(new java.awt.Color(11, 149, 255));
        favouritesbtn.setPreferredSize(new java.awt.Dimension(204, 49));
        favouritesbtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                favouritesbtnMousePressed(evt);
            }
        });
        favouritesbtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        favourtiebtnl.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        favourtiebtnl.setForeground(new java.awt.Color(242, 242, 242));
        favourtiebtnl.setText("Favourites");
        favourtiebtnl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        favourtiebtnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                favourtiebtnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                favourtiebtnlMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                favourtiebtnlMousePressed(evt);
            }
        });
        favouritesbtn.add(favourtiebtnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 120, 50));

        favourites.setMinimumSize(new java.awt.Dimension(25, 25));
        favourites.setPreferredSize(new java.awt.Dimension(24, 24));
        favourites.setImage("C:\\EgyEast_Image\\icons\\Heart-clicked.png");
        favourites.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                favouritesMousePressed(evt);
            }
        });

        javax.swing.GroupLayout favouritesLayout = new javax.swing.GroupLayout(favourites);
        favourites.setLayout(favouritesLayout);
        favouritesLayout.setHorizontalGroup(
            favouritesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        favouritesLayout.setVerticalGroup(
            favouritesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        favouritesbtn.add(favourites, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lbar2.add(favouritesbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 240, -1, -1));

        profilebtn.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {

                profilebtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {

                profilebtn.setCursor(Cursor.getDefaultCursor());
            }
        });
        profilebtn.setBackground(new java.awt.Color(30, 32, 44));
        profilebtn.setForeground(new java.awt.Color(30, 32, 44));
        profilebtn.setPreferredSize(new java.awt.Dimension(204, 49));
        profilebtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                profilebtnMousePressed(evt);
            }
        });
        profilebtn.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        profilebtnl.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        profilebtnl.setForeground(new java.awt.Color(242, 242, 242));
        profilebtnl.setText("Profile");
        profilebtnl.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        profilebtnl.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                profilebtnlMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                profilebtnlMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                profilebtnlMousePressed(evt);
            }
        });
        profilebtn.add(profilebtnl, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 0, 120, 50));

        profile.setMinimumSize(new java.awt.Dimension(25, 25));
        profile.setPreferredSize(new java.awt.Dimension(24, 24));
        profile.setImage("C:\\EgyEast_Image\\icons\\Profile.png");
        profile.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                profileMousePressed(evt);
            }
        });

        javax.swing.GroupLayout profileLayout = new javax.swing.GroupLayout(profile);
        profile.setLayout(profileLayout);
        profileLayout.setHorizontalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );
        profileLayout.setVerticalGroup(
            profileLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 25, Short.MAX_VALUE)
        );

        profilebtn.add(profile, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lbar2.add(profilebtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 330, -1, -1));

        jPanel1.add(lbar2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 210, 800));

        ubar.setBackground(new java.awt.Color(19, 20, 28));
        ubar.setInheritsPopupMenu(true);
        ubar.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setFont(new java.awt.Font("Rubik Medium", 0, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Search");
        ubar.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 30, -1, 30));

        roundedPanel1.setBackground(new java.awt.Color(30, 32, 44));
        roundedPanel1.setForeground(new java.awt.Color(30, 32, 44));

        jTextField1.setBackground(new java.awt.Color(30, 32, 44));
        jTextField1.setFont(new java.awt.Font("Rubik", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));
        jTextField1.setBorder(null);
        jTextField1.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        javax.swing.GroupLayout roundedPanel1Layout = new javax.swing.GroupLayout(roundedPanel1);
        roundedPanel1.setLayout(roundedPanel1Layout);
        roundedPanel1Layout.setHorizontalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(roundedPanel1Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 468, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        roundedPanel1Layout.setVerticalGroup(
            roundedPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, roundedPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 24, Short.MAX_VALUE)
                .addContainerGap())
        );

        ubar.add(roundedPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 20, 500, 50));

        jPanel1.add(ubar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 0, 1000, 80));

        jLabel5.setFont(new java.awt.Font("Rubik", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Favourites");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 80, 320, 50));

        FavScroll.setBorder(null);
        FavScroll.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
        FavScroll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                FavScrollMousePressed(evt);
            }
        });

        Scroll.setBackground(new java.awt.Color(19, 20, 28));
        Scroll.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ScrollMousePressed(evt);
            }
        });
        Scroll.setLayout(new java.awt.GridLayout(RowsCardsFav.getRowNum(), 1, 0, 60));
        FavScroll.setViewportView(Scroll);

        JViewport viewport = FavScroll.getViewport();
        viewport.setViewPosition(new Point(0, 0));

        jPanel1.add(FavScroll, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 130, 910, 620));

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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void homebtnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnlMouseEntered

        setHover(homebtnl,light_bg,text_hover);

    }//GEN-LAST:event_homebtnlMouseEntered

    private void homebtnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnlMouseExited
        resetHover(homebtnl,light_bg,white_text);

    }//GEN-LAST:event_homebtnlMouseExited

    private void homebtnlMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnlMousePressed
        
                home.setVisible(true);
                dispose();
            
    }//GEN-LAST:event_homebtnlMousePressed

    private void homeImageMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeImageMouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_homeImageMouseEntered

    private void homeImageMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homeImageMousePressed

                home.setVisible(true);  
                dispose();
                
    }//GEN-LAST:event_homeImageMousePressed

    private void homebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_homebtnMousePressed
                home.setVisible(true);  
                dispose();
    }//GEN-LAST:event_homebtnMousePressed

    private void logoutbtnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtnlMouseEntered
        setHover(logoutbtnl,light_bg,new Color(251,99,99));
    }//GEN-LAST:event_logoutbtnlMouseEntered

    private void logoutbtnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtnlMouseExited
        resetHover(logoutbtnl,light_bg,white_text);
    }//GEN-LAST:event_logoutbtnlMouseExited

    private void logoutbtnlMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtnlMousePressed
                System.exit(0);
    }//GEN-LAST:event_logoutbtnlMousePressed

    private void logoutMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutMousePressed
        // TODO add your handling code here:
                System.exit(0);
    }//GEN-LAST:event_logoutMousePressed

    private void logoutbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logoutbtnMousePressed
                System.exit(0);
    }//GEN-LAST:event_logoutbtnMousePressed

    private void favourtiebtnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favourtiebtnlMouseEntered
        setHover(favourtiebtnl,light_bg,text_hover);
    }//GEN-LAST:event_favourtiebtnlMouseEntered

    private void favourtiebtnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favourtiebtnlMouseExited
        resetHover(favourtiebtnl,light_bg,white_text);
    }//GEN-LAST:event_favourtiebtnlMouseExited

    private void favourtiebtnlMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favourtiebtnlMousePressed

    }//GEN-LAST:event_favourtiebtnlMousePressed

    private void favouritesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favouritesMousePressed

    }//GEN-LAST:event_favouritesMousePressed

    private void favouritesbtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_favouritesbtnMousePressed
        
    }//GEN-LAST:event_favouritesbtnMousePressed

    private void profilebtnlMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilebtnlMouseEntered
        setHover(profilebtnl,light_bg,text_hover);
    }//GEN-LAST:event_profilebtnlMouseEntered

    private void profilebtnlMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilebtnlMouseExited
        resetHover(profilebtnl,light_bg,white_text);
    }//GEN-LAST:event_profilebtnlMouseExited

    private void profilebtnlMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilebtnlMousePressed
                favFrame.setVisible(false);
                user_account.setVisible(true); 
    }//GEN-LAST:event_profilebtnlMousePressed

    private void profileMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profileMousePressed
                favFrame.setVisible(false);
                user_account.setVisible(true); 
    }//GEN-LAST:event_profileMousePressed

    private void profilebtnMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_profilebtnMousePressed
                favFrame.setVisible(false);
                user_account.setVisible(true); 
    }//GEN-LAST:event_profilebtnMousePressed

    private void ScrollMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ScrollMousePressed
        // TODO add your handling code here:
    }//GEN-LAST:event_ScrollMousePressed

    private void FavScrollMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_FavScrollMousePressed

    }//GEN-LAST:event_FavScrollMousePressed

    public void resetHover(JLabel label,Color bg,Color fg){
        label.setBackground(bg);
        label.setForeground(fg);
    }
       public void setHover(JLabel label,Color bg,Color fg){
        label.setBackground(bg);//light_bg
        label.setForeground(fg);//text_hover
    }
     
    
    public void setColor(JPanel panel,Color bg ,Color fg){
        panel.setBackground(bg);//dark_bg
        panel.setForeground(fg); //light_bg
       
    }
    
     public void resetColor(JPanel []  panel,Color bg ,Color fg){
        for(JPanel i : panel) {
            i.setBackground(bg);
            i.setForeground(fg);
        }
    }
     public void setIcons(ImagePanel icon,String path){
     icon.setImage(path);
     
     }
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
            java.util.logging.Logger.getLogger(FavFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FavFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FavFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FavFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FavFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JScrollPane FavScroll;
    private javax.swing.JPanel Scroll;
    private ImagePrint.ImagePanel favourites;
    private EgyEast.com.roundedpanal.RoundedPanel favouritesbtn;
    private javax.swing.JLabel favourtiebtnl;
    private ImagePrint.ImagePanel homeImage;
    private EgyEast.com.roundedpanal.RoundedPanel homebtn;
    private javax.swing.JLabel homebtnl;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel6;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JPanel lbar2;
    private ImagePrint.ImagePanel logout;
    private EgyEast.com.roundedpanal.RoundedPanel logoutbtn;
    private javax.swing.JLabel logoutbtnl;
    private ImagePrint.ImagePanel profile;
    private EgyEast.com.roundedpanal.RoundedPanel profilebtn;
    private javax.swing.JLabel profilebtnl;
    private EgyEast.com.roundedpanal.RoundedPanel roundedPanel1;
    private javax.swing.JPanel ubar;
    // End of variables declaration//GEN-END:variables
}
