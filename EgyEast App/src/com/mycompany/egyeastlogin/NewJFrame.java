/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.egyeastlogin;

import java.awt.Cursor;
import java.awt.Image;
import java.awt.Toolkit;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import Custom_Components.ImagePanel;
import static com.mycompany.egyeastlogin.EgyEastLogin.*;


public class NewJFrame extends javax.swing.JFrame {

    /**
     * Creates new form NewJFrame
     */
    public NewJFrame() {
        initComponents();   
        ImageIcon img = new ImageIcon("C:\\EgyEast_Image\\icons/EgyEast.png");
          this.setIconImage(img.getImage());
        
    }
        public void setImage(ImagePanel panel,String path){
     try{
            panel.setImage(ImageIO.read(new File(path)));
            }
            catch (IOException e) {
                    e.printStackTrace();
                       }
     }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        watch_label = new javax.swing.JLabel();
        moviesLabel = new javax.swing.JLabel();
        loginbtn = new com.mycompany.egyeastlogin.myButton();
        accountLabel = new javax.swing.JLabel();
        SignUp = new javax.swing.JLabel();
        coffeeIcon = new Custom_Components.ImagePanel();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("EgyEast");
        setAutoRequestFocus(false);
        setBackground(new java.awt.Color(30, 32, 44));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(30, 32, 44));
        jPanel1.setFont(new java.awt.Font("Rubik Light", 0, 24)); // NOI18N
        jPanel1.setMaximumSize(new java.awt.Dimension(1920, 1080));
        jPanel1.setMinimumSize(new java.awt.Dimension(1200, 800));
        jPanel1.setPreferredSize(new java.awt.Dimension(1200, 800));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        watch_label.setBackground(new java.awt.Color(255, 255, 255));
        watch_label.setFont(new java.awt.Font("Rubik Black", 0, 36)); // NOI18N
        watch_label.setForeground(new java.awt.Color(255, 255, 255));
        watch_label.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        watch_label.setLabelFor(watch_label);
        watch_label.setText("Watch");
        watch_label.setAlignmentY(0.0F);
        jPanel1.add(watch_label, new org.netbeans.lib.awtextra.AbsoluteConstraints(556, 321, -1, -1));

        moviesLabel.setFont(new java.awt.Font("Rubik", 0, 24)); // NOI18N
        moviesLabel.setForeground(new java.awt.Color(255, 255, 255));
        moviesLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        moviesLabel.setText("Enjoy the newest movies");
        jPanel1.add(moviesLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 370, -1, -1));

        loginbtn.setBackground(new java.awt.Color(11, 149, 255));
        loginbtn.setBorder(null);
        loginbtn.setForeground(new java.awt.Color(255, 255, 255));
        loginbtn.setText("Log in ");
        loginbtn.setBorderColor(new java.awt.Color(11, 149, 255));
        loginbtn.setColor(new java.awt.Color(11, 149, 255));
        loginbtn.setColorClick(new java.awt.Color(36, 39, 64));
        loginbtn.setColorOver(new java.awt.Color(11, 149, 255));
        loginbtn.setFocusable(false);
        loginbtn.setFont(new java.awt.Font("Rubik Black", 0, 24)); // NOI18N
        loginbtn.setRadius(15);
        loginbtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                loginbtnActionPerformed(evt);
            }
        });
        jPanel1.add(loginbtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(453, 433, 274, 46));
        loginbtn.setCursor(new Cursor(Cursor.HAND_CURSOR));

        accountLabel.setFont(new java.awt.Font("Rubik", 0, 20)); // NOI18N
        accountLabel.setForeground(new java.awt.Color(255, 255, 255));
        accountLabel.setText("No account?");
        jPanel1.add(accountLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 494, -1, 30));

        SignUp.setFont(new java.awt.Font("Rubik Black", 0, 20)); // NOI18N
        SignUp.setForeground(new java.awt.Color(255, 255, 255));
        SignUp.setText("SignUp");
        SignUp.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        SignUp.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                SignUpMouseClicked(evt);
            }
        });
        jPanel1.add(SignUp, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 494, -1, 30));

        coffeeIcon.setPreferredSize(new java.awt.Dimension(41, 38));

        setImage(coffeeIcon , "C:\\EgyEast_Image\\icons\\coffee.png");

        javax.swing.GroupLayout coffeeIconLayout = new javax.swing.GroupLayout(coffeeIcon);
        coffeeIcon.setLayout(coffeeIconLayout);
        coffeeIconLayout.setHorizontalGroup(
            coffeeIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 41, Short.MAX_VALUE)
        );
        coffeeIconLayout.setVerticalGroup(
            coffeeIconLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 38, Short.MAX_VALUE)
        );

        jPanel1.add(coffeeIcon, new org.netbeans.lib.awtextra.AbsoluteConstraints(503, 326, -1, -1));
        jPanel1.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(610, 520, 70, 30));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        setSize(new java.awt.Dimension(1200, 800));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void loginbtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_loginbtnActionPerformed
        // TODO add your handling code here:
        login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_loginbtnActionPerformed

    private void SignUpMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_SignUpMouseClicked
        // TODO add your handling code here:
        signup = new SignUp();
        signup.setVisible(true);
        dispose();
    }//GEN-LAST:event_SignUpMouseClicked

    /**
     * @param args the command line arguments
     */
    public void close(){
        WindowEvent closeWindow = new WindowEvent(this,WindowEvent.WINDOW_CLOSING);
        Toolkit.getDefaultToolkit().getSystemEventQueue().postEvent(closeWindow);
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
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewJFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new NewJFrame().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel SignUp;
    private javax.swing.JLabel accountLabel;
    private Custom_Components.ImagePanel coffeeIcon;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private com.mycompany.egyeastlogin.myButton loginbtn;
    private javax.swing.JLabel moviesLabel;
    private javax.swing.JLabel watch_label;
    // End of variables declaration//GEN-END:variables

}