/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package EgyEast.Films;

import EgyEast.Home;
import com.mycompany.egyeastlogin.EgyEastLogin;
import static com.mycompany.egyeastlogin.EgyEastLogin.retriveData;
import com.mycompany.egyeastlogin.SignUp;
import java.awt.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author ahmed
 */


public class RowsCards {
    private Connection conn = EgyEastLogin.dbConn();
    static ArrayList<FilmCard> filmCards = new ArrayList<>();
    public RowsCards(JPanel panel){
         addFilms();
        createRowsPanel(panel);
        JViewport viewport = Home.scroll.getViewport();
            viewport.setViewPosition(new Point(0, 0));
            
    
    }
    public static int getRowNum(){
    return (int) Math.ceil((filmCards.size()/3));
    }
    public void createRowsPanel(JPanel scroll){
        
           int i=0;
        while(i<filmCards.size()){
        if(i+2>=filmCards.size()||i+1>=filmCards.size()){
            break;}
        addToSroll( rowPanel(i,i+2),scroll);
        i+=3;}
        if(i<filmCards.size()){
          addToSroll( rowPanel(i,filmCards.size()-1),scroll);
        }
        
 
    }
    
     public void addToSroll(JPanel cards,JPanel scroll){
        scroll.add(cards);
    }
    
     public JPanel rowPanel(int start,int end){
        JPanel rowcards =new JPanel(new GridLayout(1, 3,20,0));
        rowcards.setPreferredSize(new Dimension(260,385));
        rowcards.setBackground(new Color(19,20,28));
        
            
        for(int i=start;i<=end;i++){
        rowcards.add(filmCards.get(i).createCardPanel());}
        if(start==end){
             rowcards.add(FilmCard.createFakeCardPanel());
             rowcards.add(FilmCard.createFakeCardPanel());
        }
        else if(end-start==1){
                         rowcards.add(FilmCard.createFakeCardPanel());
        }
        

        return rowcards;
     }
    
      public void addFilms( ){
            try{
            String sql = " select Content_id ,Title, Pic_path from Content;";
            ResultSet x = retriveData(sql);
            while(x.next()){
            filmCards.add(new FilmCard(x.getString("Title"), x.getString("Pic_path")));
            }
            }
         catch(Exception ex){
                ex.printStackTrace();
         }
             
            
           // filmCards.add(new FilmCard("Film 6", "Description 6"));
    
    }
    
      
      
    
    
}
