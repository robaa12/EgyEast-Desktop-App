/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FavPage;

import EgyEast.Films.*;
import EgyEast.Home;
import com.mycompany.egyeastlogin.CurrentUser;
import com.mycompany.egyeastlogin.EgyEastLogin;
import static com.mycompany.egyeastlogin.EgyEastLogin.retriveData;
import com.mycompany.egyeastlogin.SignUp;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author ahmed
 */


public class RowsCardsFav {
    private Connection conn = EgyEastLogin.dbConn();
    public static ArrayList<FilmCardFav> filmCardsFav = new ArrayList<>();
    public RowsCardsFav(JPanel panel){
         addFilms();
        createRowsPanel(panel);
        if(getRowNum()<=1)
             addToSroll(FilmCardFav.createFakeCardPanel(),panel);
        JViewport viewport = FavFrame.FavScroll.getViewport();
            viewport.setViewPosition(new Point(0, 0));
            
    
    }
    public static int getRowNum(){
    return (int) Math.ceil((filmCardsFav.size()/3));
    }
    public void createRowsPanel(JPanel scroll){
        int i=0;
        while(i<filmCardsFav.size()){
        if(i+2>=filmCardsFav.size()||i+1>=filmCardsFav.size()){
            break;}
        addToSroll( rowPanel(i,i+2),scroll);
        i+=3;}
        if(i<filmCardsFav.size()){
          addToSroll( rowPanel(i,filmCardsFav.size()-1),scroll);
        }
        
      
         
 
    }
    
     public void addToSroll(JPanel cards,JPanel scroll){
        scroll.add(cards);
    }
    
     public JPanel rowPanel(int start,int end){
        JPanel rowcardsFav =new JPanel(new GridLayout(1, 3,20,0));
        rowcardsFav.setPreferredSize(new Dimension(260,385));
        rowcardsFav.setBackground(new Color(19,20,28));
        
            
        for(int i=start;i<=end;i++){
        rowcardsFav.add(filmCardsFav.get(i).createCardPanel());}
        if(start==end){
             rowcardsFav.add(FilmCardFav.createFakeCardPanel());
             rowcardsFav.add(FilmCardFav.createFakeCardPanel());
        }
        else if(end-start==1){
                         rowcardsFav.add(FilmCardFav.createFakeCardPanel());
        }
        
        

        return rowcardsFav;
     }
    
      public void addFilms( ){
          int user_id = 0;
        try {
            user_id = CurrentUser.user_data.getInt("User_id");
        } catch (SQLException ex) {
            Logger.getLogger(RowsCardsFav.class.getName()).log(Level.SEVERE, null, ex);
        }
            try{
            String sql = "SELECT Content.Title, Content.Pic_path FROM Favourite_Content JOIN Content ON Favourite_Content.Content_id = Content.Content_id JOIN Users ON Favourite_Content.User_id = Users.User_id WHERE Users.User_id = " + user_id;
            ResultSet x = retriveData(sql);
            while(x.next()){
            filmCardsFav.add(new FilmCardFav(x.getString("Title"), x.getString("Pic_path")));
            System.out.println(filmCardsFav.size());
            }
            }
         catch(Exception ex){
                ex.printStackTrace();
         }

           // filmCardsFav.add(new FilmCard("Film 6", "Description 6"));
    
    }
    
      
      
    
    
}
