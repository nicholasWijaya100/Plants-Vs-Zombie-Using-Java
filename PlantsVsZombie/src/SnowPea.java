
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;
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
public class SnowPea extends Plant{
    private double waktuTiapTembak; //waktu yang diperlukan peashooter untuk menembak pea
    private double terakhirTembak; //Detik terakhir pea ditembakan
    private boolean tembakAktif;

    public SnowPea(double waktuTiapTembak, int hp, Image plantImage, int x, int y, int cost) {
        super(hp, plantImage, x, y, cost);
        this.waktuTiapTembak = waktuTiapTembak;
        this.terakhirTembak = 0;
        this.tembakAktif = true;
    }

    public double getWaktuTiapTembak() {
        return waktuTiapTembak;
    }

    public void setWaktuTiapTembak(double waktuTiapTembak) {
        this.waktuTiapTembak = waktuTiapTembak;
    }

    public double getTerakhirTembak() {
        return terakhirTembak;
    }

    public void setTerakhirTembak(double terakhirTembak) {
        this.terakhirTembak = terakhirTembak;
    }

    public boolean isTembakAktif() {
        return tembakAktif;
    }

    public void setTembakAktif(boolean tembakAktif) {
        this.tembakAktif = tembakAktif;
    }

    @Override
    public void generateSun(Sun sunGeneric, ArrayList<Sun> sunDiLawn, int xFlower, int yFlower) {
        
    }

    @Override
    public void shoot(ArrayList<Peluruh> peluruhList, ArrayList<Peluruh> peluruhDiLawn) {
        try {
            Peluruh peluruBaru =  (Peluruh) peluruhList.get(1).clone();
            peluruBaru.setX(this.x + 100);
            peluruBaru.setY(this.y);
            peluruhDiLawn.add(peluruBaru);
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Peashooter.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        System.out.println("SnowPea shoot");
    }

    @Override
    public void explode() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(this.plantImage, x, y, null);
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
