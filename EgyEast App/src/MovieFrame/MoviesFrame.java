package MovieFrame;

import java.awt.Desktop;
import java.awt.Image;
import java.net.URL;
import javax.swing.ImageIcon;
import EgyEast.Films.*;
import com.mycompany.egyeastlogin.CurrentUser;
import com.mycompany.egyeastlogin.EgyEastLogin;
import static com.mycompany.egyeastlogin.EgyEastLogin.*;
import java.awt.Cursor;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MoviesFrame extends javax.swing.JFrame {
    public static ResultSet film_data;
    public void move_forward(){
        try {
            film_data.next();
        } catch (SQLException ex) {
            Logger.getLogger(MoviesFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    public  String test(String column) {
        try {
            return film_data.getString(column);
        } catch (SQLException ex) {
            Logger.getLogger(MoviesFrame.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        } 
    }
    private boolean state = false;
    public MoviesFrame() {
        move_forward();
        initComponents();
        
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        moviePanel = new javax.swing.JPanel();
        jLabel9 = new javax.swing.JLabel();
        moviePic = new ImagePanel.ImagePanel();
        storyLineLabel = new javax.swing.JLabel();
        movieCategory = new javax.swing.JLabel();
        movieTitle = new javax.swing.JLabel();
        movieYear = new javax.swing.JLabel();
        myButton1 = new com.mycompany.egyeastlogin.myButton();
        movieCover = new ImagePanel.ImagePanel();
        jLabel10 = new javax.swing.JLabel();
        imagePanel9 = new ImagePanel.ImagePanel();
        pic1 = new ImagePanel.ImagePanel();
        pic2 = new ImagePanel.ImagePanel();
        pic3 = new ImagePanel.ImagePanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextPane1 = new javax.swing.JTextPane();
        imagePanel8 = new ImagePanel.ImagePanel();
        imagePanel6 = new ImagePanel.ImagePanel();
        imagePanel7 = new ImagePanel.ImagePanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EgyEast");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(1200, 800));
        setResizable(false);
        setSize(new java.awt.Dimension(1200, 800));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        moviePanel.setBackground(new java.awt.Color(19, 20, 28));
        moviePanel.setPreferredSize(new java.awt.Dimension(1211, 800));
        moviePanel.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel9.setFont(new java.awt.Font("Rubik Black", 0, 24)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("Photos");
        moviePanel.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 410, 100, 40));

        moviePic.setImage(test("Pic_path"));

        moviePanel.add(moviePic, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, 150, 220));

        storyLineLabel.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        storyLineLabel.setForeground(new java.awt.Color(255, 255, 255));
        storyLineLabel.setText("StoryLine");
        moviePanel.add(storyLineLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 240, -1, -1));

        movieCategory.setFont(new java.awt.Font("Rubik", 0, 14)); // NOI18N
        movieCategory.setForeground(new java.awt.Color(255, 255, 255));
        movieCategory.setText(test("Category"));
        moviePanel.add(movieCategory, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 200, -1, -1));

        movieTitle.setFont(new java.awt.Font("Rubik Black", 0, 36)); // NOI18N
        movieTitle.setForeground(new java.awt.Color(255, 255, 255));
        movieTitle.setText(test("Title"));
        moviePanel.add(movieTitle, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 150, -1, -1));

        movieYear.setFont(new java.awt.Font("Rubik", 0, 18)); // NOI18N
        movieYear.setForeground(new java.awt.Color(255, 255, 255));
        movieYear.setText(test("release_date"));
        moviePanel.add(movieYear, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 120, -1, -1));

        myButton1.setBackground(new java.awt.Color(11, 149, 255));
        myButton1.setForeground(new java.awt.Color(255, 255, 255));
        myButton1.setText("Watch Trailer");
        myButton1.setBorderColor(new java.awt.Color(11, 149, 255));
        myButton1.setBorderPainted(false);
        myButton1.setColor(new java.awt.Color(11, 149, 255));
        myButton1.setColorClick(new java.awt.Color(11, 149, 255));
        myButton1.setColorOver(new java.awt.Color(30, 32, 44));
        myButton1.setFocusable(false);
        myButton1.setFont(new java.awt.Font("Rubik Black", 0, 14)); // NOI18N
        myButton1.setRadius(20);
        myButton1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                myButton1MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                myButton1MouseExited(evt);
            }
        });
        myButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                myButton1ActionPerformed(evt);
            }
        });
        moviePanel.add(myButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 710, 140, 40));

        movieCover.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Rubik Light", 0, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Back To Home");
        jLabel10.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel10MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jLabel10MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jLabel10MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jLabel10MousePressed(evt);
            }
        });
        movieCover.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 20, 90, 20));

        imagePanel9.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagePanel9MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imagePanel9MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imagePanel9MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imagePanel9MousePressed(evt);
            }
        });

        imagePanel9.setImage("C:\\EgyEast_Image\\icons\\arrow_back.png");

        movieCover.add(imagePanel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 20, 24, 24));

        movieCover.setImage(test("Cover_path"));

        moviePanel.add(movieCover, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 1210, 230));

        pic1.setImage(test("Pic1_path"));

        //pic1.setImage(CurrentFilm.path);

        moviePanel.add(pic1, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 460, 360, 240));

        pic2.setImage(test("Pic2_path"));

        //pic2.setImage(CurrentFilm.path);

        moviePanel.add(pic2, new org.netbeans.lib.awtextra.AbsoluteConstraints(420, 460, 360, 240));

        pic3.setImage(test("Pic3_path"));

        //pic3.setImage(CurrentFilm.path);

        moviePanel.add(pic3, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 460, 360, 240));

        jScrollPane1.setBorder(null);

        jTextPane1.setEditable(false);
        jTextPane1.setBackground(new java.awt.Color(19, 20, 28));
        jTextPane1.setBorder(null);
        jTextPane1.setFont(new java.awt.Font("Rubik", 0, 16)); // NOI18N
        jTextPane1.setForeground(new java.awt.Color(255, 255, 255));
        jTextPane1.setText(test("Description"));
        jScrollPane1.setViewportView(jTextPane1);

        moviePanel.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 750, 180));

        imagePanel8.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imagePanel8MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imagePanel8MouseExited(evt);
            }
        });

        imagePanel8.setImage("C:\\EgyEast_Image\\icons\\download.png");

        moviePanel.add(imagePanel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(1060, 260, 30, 30));

        imagePanel6.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imagePanel6MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imagePanel6MouseExited(evt);
            }
        });

        imagePanel6.setImage("C:\\EgyEast_Image\\icons\\alarm.png");

        moviePanel.add(imagePanel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(1120, 260, 30, 30));

        imagePanel7.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagePanel7MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                imagePanel7MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                imagePanel7MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                imagePanel7MousePressed(evt);
            }
        });

        try {
            int user_id = CurrentUser.user_data.getInt("User_id");
            int content_id = film_data.getInt("Content_id");
            String sql = "  select * from Favourite_content where User_id = " + user_id + "and Content_id = " + content_id;

            if (retriveData(sql).next()){
                imagePanel7.setImage("C:\\EgyEast_Image\\icons\\red_heart.png");
            }
            else{
                imagePanel7.setImage("C:\\EgyEast_Image\\icons\\white_heart.png");
                // TODO add your handling code here:
            }
        }
        catch (SQLException ex) {
            Logger.getLogger(MoviesFrame.class.getName()).log(Level.SEVERE, null, ex);
        }

        moviePanel.add(imagePanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(1000, 260, 30, 30));

        getContentPane().add(moviePanel, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1220, 800));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel10MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_jLabel10MouseClicked

    private void myButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_myButton1ActionPerformed
        try {
            Desktop.getDesktop().browse(new URL(test("Trailer_link")).toURI());
        }catch(Exception e){}
    }//GEN-LAST:event_myButton1ActionPerformed

    private void imagePanel9MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagePanel9MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_imagePanel9MouseClicked

    private void imagePanel9MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagePanel9MousePressed
        // TODO add your handling code here:
        home.setVisible(true);
        favFrame.setVisible(false);
        dispose();
    }//GEN-LAST:event_imagePanel9MousePressed

    private void jLabel10MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MousePressed
        // TODO add your handling code here:
        home.setVisible(true);
        favFrame.setVisible(false);
        dispose();
    }//GEN-LAST:event_jLabel10MousePressed

    private void jLabel10MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseEntered
        // TODO add your handling code here:
        jLabel10.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_jLabel10MouseEntered

    private void jLabel10MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel10MouseExited
        // TODO add your handling code here:
        jLabel10.setCursor(Cursor.getDefaultCursor());

    }//GEN-LAST:event_jLabel10MouseExited

    private void imagePanel9MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagePanel9MouseExited
        // TODO add your handling code here:
     imagePanel9.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_imagePanel9MouseExited

    private void imagePanel9MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagePanel9MouseEntered
        // TODO add your handling code here:
        imagePanel9.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_imagePanel9MouseEntered

    private void imagePanel6MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagePanel6MouseEntered
        // TODO add your handling code here:
        imagePanel6.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_imagePanel6MouseEntered

    private void imagePanel6MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagePanel6MouseExited
        // TODO add your handling code here:
        imagePanel6.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_imagePanel6MouseExited

    private void imagePanel7MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagePanel7MouseClicked
        
    }//GEN-LAST:event_imagePanel7MouseClicked

    private void imagePanel8MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagePanel8MouseEntered
        // TODO add your handling code here:
        imagePanel8.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_imagePanel8MouseEntered

    private void imagePanel8MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagePanel8MouseExited
        // TODO add your handling code here:
        imagePanel8.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_imagePanel8MouseExited

    private void imagePanel7MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagePanel7MouseExited
        // TODO add your handling code here:
        imagePanel7.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_imagePanel7MouseExited

    private void imagePanel7MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagePanel7MouseEntered
        // TODO add your handling code here:
        imagePanel7.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_imagePanel7MouseEntered

    private void myButton1MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myButton1MouseEntered
        // TODO add your handling code here:
        myButton1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
    }//GEN-LAST:event_myButton1MouseEntered

    private void myButton1MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_myButton1MouseExited
        // TODO add your handling code here:
        myButton1.setCursor(Cursor.getDefaultCursor());
    }//GEN-LAST:event_myButton1MouseExited

    private void imagePanel7MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagePanel7MousePressed
        try {
            int user_id = CurrentUser.user_data.getInt("User_id");
            int content_id = film_data.getInt("Content_id");
            String sql = "  select * from Favourite_content where User_id = " + user_id + "and Content_id = " + content_id;
            
            if (retriveData(sql).next()){
                sql = "  Delete from Favourite_content where User_id = " + user_id + "and Content_id = " + content_id;
                updateData(sql);
                imagePanel7.setImage("C:\\EgyEast_Image\\icons\\white_heart.png");
            }
            else{
                // TODO add your handling code here:
                sql = "INSERT INTO Favourite_Content (User_id , Content_id) VALUES (" + user_id + "," + content_id + ")";
                updateData(sql);
                imagePanel7.setImage("C:\\EgyEast_Image\\icons\\red_heart.png");
            }
            }
        catch (SQLException ex) {
            Logger.getLogger(MoviesFrame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_imagePanel7MousePressed

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new MoviesFrame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private ImagePanel.ImagePanel imagePanel6;
    private ImagePanel.ImagePanel imagePanel7;
    private ImagePanel.ImagePanel imagePanel8;
    private ImagePanel.ImagePanel imagePanel9;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextPane jTextPane1;
    private javax.swing.JLabel movieCategory;
    private ImagePanel.ImagePanel movieCover;
    private javax.swing.JPanel moviePanel;
    private ImagePanel.ImagePanel moviePic;
    private javax.swing.JLabel movieTitle;
    private javax.swing.JLabel movieYear;
    private com.mycompany.egyeastlogin.myButton myButton1;
    private ImagePanel.ImagePanel pic1;
    private ImagePanel.ImagePanel pic2;
    private ImagePanel.ImagePanel pic3;
    private javax.swing.JLabel storyLineLabel;
    // End of variables declaration//GEN-END:variables
}
