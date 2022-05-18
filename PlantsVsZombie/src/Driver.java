
import java.io.File;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.Clip;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JFrame;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author nichw
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static ArrayList<Player> player = new ArrayList<>();
    public static int jumUser = player.size();
    public static Player currentPlayer = null;
    public static AudioInputStream audioInputStream;
    public static Clip clip;
    public static Connection con;
    public static void add(Player p) {
        player.add(p);
    }
    
    public static void KoneksiDB (){
       try {
        DriverManager.registerDriver(new com.mysql.jdbc.Driver()); 
        //nama database yang di connect : db_bioskop --> nanti diganti
        con = DriverManager.getConnection("jdbc:mysql://127.0.01/db_proyekpbo_2022", "root", ""); 
        System.out.println("WELCOME, YOU SUCCESS FOR CONNECT TODATABASE");
        } catch (Exception ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("TRY AGAIN FOR CONNECT TO DATABASE!!");
        }       
    }
    
    public static void loadPlayers(){
        player.clear();
        try{
            Statement st = con.createStatement();
            String sql = "SELECT * FROM gameuser";
            ResultSet res = st.executeQuery(sql);
            while(res.next())
            {
                
                Player pnew = new Player(res.getString(1),res.getString(2),res.getString(3),
                                         res.getInt(4),res.getInt(5)
                                         );
                player.add(pnew);
            }
        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    
    public static void save(){
        
    }
    
    public static void main(String[] args) {
        KoneksiDB();
        loadPlayers();
        try {
            audioInputStream = AudioSystem.getAudioInputStream(new File("music/mainMenu.wav"));
            clip = AudioSystem.getClip( );
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.open(audioInputStream);
            clip.start();
        } catch (LineUnavailableException | UnsupportedAudioFileException | IOException ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }

        if(player.size() == 0) {
            RegisterAccountFrame regis = new RegisterAccountFrame();
            regis.setLocationRelativeTo(null);
            regis.setVisible(true);
        } else {
            MainMenuFrame menu = new MainMenuFrame();
            menu.setLocationRelativeTo(null);
            menu.setVisible(true);
        }
    }
    
}
