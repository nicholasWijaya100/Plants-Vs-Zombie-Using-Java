
import java.util.ArrayList;
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
    
    public static void add(Player p) {
        player.add(p);
    }
    
    public void load(Player p){
        
    }
    
    public static void save(Player p){
        
    }
    
    public static void main(String[] args) {
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
