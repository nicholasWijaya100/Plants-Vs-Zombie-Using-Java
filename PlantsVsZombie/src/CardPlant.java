
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.JPanel;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mario
 */
public class CardPlant extends JPanel{
    Image img;

    public CardPlant(Image img) {
        this.img = img;
        setSize(64,90);
    }
    
    
    @Override
    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawImage(img,0,0,null);
    }
}
