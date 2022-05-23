
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
public abstract class Zombie implements DrawInterface, Cloneable {
    protected int maxHp;
    protected int hp;
    protected Image zombieImage;
    protected int x;
    protected int y;
    protected int damage;
    protected double waktuTiapMakan; //jeda waktu yang diperlukan zombie untuk tiap kali makan plant
    protected double terakhirMakan; //Detik terakhir zombie makan plant
    protected int kecepatan;
    protected int terakhirGerak;

    public Zombie(int maxHp, Image zombieImage, int x, int y, int damage, double waktuTiapMakan, int kecepatan) {
        this.maxHp = maxHp;
        this.hp = maxHp;
        this.zombieImage = zombieImage;
        this.x = x;
        this.y = y;
        this.damage = damage;
        this.waktuTiapMakan = waktuTiapMakan;
        this.terakhirMakan = 0;
        this.kecepatan = kecepatan;
        this.terakhirGerak = 0;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public Image getZombieImage() {
        return zombieImage;
    }

    public void setZombieImage(Image zombieImage) {
        this.zombieImage = zombieImage;
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

    public double getWaktuTiapMakan() {
        return waktuTiapMakan;
    }

    public void setWaktuTiapMakan(double waktuTiapMakan) {
        this.waktuTiapMakan = waktuTiapMakan;
    }

    public double getTerakhirMakan() {
        return terakhirMakan;
    }

    public void setTerakhirMakan(double terakhirMakan) {
        this.terakhirMakan = terakhirMakan;
    }

    public int getKecepatan() {
        return kecepatan;
    }

    public void setKecepatan(int kecepatan) {
        this.kecepatan = kecepatan;
    }

    public int getTerakhirGerak() {
        return terakhirGerak;
    }

    public void setTerakhirGerak(int terakhirGerak) {
        this.terakhirGerak = terakhirGerak;
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(zombieImage, x, y, null);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
