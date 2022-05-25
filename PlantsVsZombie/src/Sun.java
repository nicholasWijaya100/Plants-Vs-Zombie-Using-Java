
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

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(this.sunImage, this.x, this.y, null);
    }
}
