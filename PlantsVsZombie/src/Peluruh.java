
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
public abstract class Peluruh implements Cloneable, DrawInterface{
    protected int x;
    protected int y;
    protected int damage;
    protected Image peluruhImage;
    protected int speedPeluruh;
    protected int terakhirPeluruhGerak;

    public Peluruh(int x, int y, int damage, Image peluruhImage, int speedPeluruh, int terakhirPeluruhGerak) {
        this.x = x;
        this.y = y;
        this.damage = damage;
        this.peluruhImage = peluruhImage;
        this.speedPeluruh = speedPeluruh;
        this.terakhirPeluruhGerak = terakhirPeluruhGerak;
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

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Image getPlantImage() {
        return peluruhImage;
    }

    public void setPlantImage(Image peluruhImage) {
        this.peluruhImage = peluruhImage;
    }

    public int getSpeedPeluruh() {
        return speedPeluruh;
    }

    public void setSpeedPeluruh(int speedPeluruh) {
        this.speedPeluruh = speedPeluruh;
    }

    public int getTerakhirPeluruhGerak() {
        return terakhirPeluruhGerak;
    }

    public void setTerakhirPeluruhGerak(int terakhirPeluruhGerak) {
        this.terakhirPeluruhGerak = terakhirPeluruhGerak;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
