
import java.awt.Graphics;
import java.awt.Image;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nichw
 */
public class PeluruhIcePea extends Peluruh{

    public PeluruhIcePea(int x, int y, int damage, Image peluruhImage, int speedPeluruh, int terakhirPeluruhGerak) {
        super(x, y, damage, peluruhImage, speedPeluruh, terakhirPeluruhGerak);
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(this.peluruhImage, this.x, this.y, null);
    }
    
}
