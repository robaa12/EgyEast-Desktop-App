/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FavPage;

import EgyEast.Films.*;
import EgyEast.Home;
import EgyEast.com.roundedpanal.RoundedPanel;
import ImagePrint.ImagePanel;
import MovieFrame.MoviesFrame;
import com.mycompany.egyeastlogin.EgyEastLogin;
import static com.mycompany.egyeastlogin.EgyEastLogin.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;
import javax.swing.border.EmptyBorder;


class FilmCardFav {
    private Connection conn = EgyEastLogin.dbConn();
    private String title;
    private String path;
    

    public FilmCardFav(String title, String path) {
        this.title = title;
        this.path = path;
        
    }

    public RoundedPanel createCardPanel() {
        RoundedPanel cardPanel = new RoundedPanel(50);
        cardPanel.setLayout(new BorderLayout());
        cardPanel.setBackground(Home.light_bg);
        cardPanel.setForeground(Home.light_bg);
        cardPanel.setBorder(BorderFactory.createLineBorder(Home.dark_bg));
        cardPanel.setPreferredSize(new Dimension(260,385));
        

        JLabel titleLabel = new JLabel(title);
        
        titleLabel.setForeground(Home.white_text);
        titleLabel.setFont(new Font("Rubik", Font.BOLD,18)); 
        titleLabel.setHorizontalAlignment(JLabel.CENTER);
        titleLabel.setBorder(new EmptyBorder(10,0,10,0));
        
        ImagePanel image=new ImagePanel(40);
        image.setImage(path);
        
        cardPanel.add(titleLabel, BorderLayout.SOUTH);
        cardPanel.add(image, BorderLayout.CENTER);
        
        
             cardPanel.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseEntered(MouseEvent e) {
                // Change the cursor to a hand when the mouse enters the panel
               cardPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e) {
                // Change the cursor back to the default when the mouse exits the panel
               cardPanel.setCursor(Cursor.getDefaultCursor());
            }
            @Override
            public void mousePressed(MouseEvent e){
                String sql = "SELECT Content_id ,Title, Pic_path, Cover_path, Pic1_path, Pic2_path, "
                        + "Pic3_path, release_date, Category, Description, Trailer_link FROM Content WHERE Title = '" + title + "'"  ;
                    ResultSet resultSet = retriveData(sql);
                    MoviesFrame.film_data = resultSet;
                    movieframe = new MoviesFrame();
                    movieframe.setVisible(true);
            }
        });
        return cardPanel;
    }
    
           public static JPanel createFakeCardPanel() {
        JPanel cardPanel = new JPanel();
        cardPanel.setLayout(new BorderLayout());
        cardPanel.setBackground(new Color(19,20,28));
        return cardPanel;
       }
           
           
           
       
}
