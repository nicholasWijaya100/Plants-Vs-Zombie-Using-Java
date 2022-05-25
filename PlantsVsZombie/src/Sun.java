
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
import java.util.Random;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nichw
 */
public class Sun implements Cloneable, DrawInterface{
    private int x;
    private int y;
    private int waktuSebelumHilang;
    private Image sunImage;

    public Sun(int x, int y, int waktuSebelumHilang, Image sunImage) {
        this.x = x;
        this.y = y;
        this.waktuSebelumHilang = waktuSebelumHilang;
        this.sunImage = sunImage;
    }
    
    public Sun(){
        
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getWaktuSebelumHilang() {
        return waktuSebelumHilang;
    }

    public void setWaktuSebelumHilang(int waktuSebelumHilang) {
        this.waktuSebelumHilang = waktuSebelumHilang;
    }

    public void generateSun(Sun sunGeneric, ArrayList<Sun> sunDiLawn) {
        Random rnd = new Random();
        int xBaru = rnd.nextInt(800)+100;
        int yBaru = rnd.nextInt(300)+200;
        System.out.println("Sun generated");
        try {
            Sun baru = (Sun) sunGeneric.clone();
            baru.setX(xBaru);
            baru.setY(yBaru);
            sunDiLawn.add(baru);
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Sunflower.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(this.sunImage, this.x, this.y, null);
    }
}
