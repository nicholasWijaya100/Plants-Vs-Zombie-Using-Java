
import javax.swing.Icon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nichw
 */
public class Sunflower extends Plant{
    
    private double waktuGenerateSun; //waktu yang diperlukan sunflower untuk spawn sun
    private double terakhirGenerateSun; //Detik terakhir sun di generate

    public Sunflower(double waktuGenerateSun, double terakhirGenerateSun, int hp, Icon plantImage) {
        super(hp, plantImage);
        this.waktuGenerateSun = waktuGenerateSun;
        this.terakhirGenerateSun = terakhirGenerateSun;
    }

    public double getWaktuGenerateSun() {
        return waktuGenerateSun;
    }

    public void setWaktuGenerateSun(double waktuGenerateSun) {
        this.waktuGenerateSun = waktuGenerateSun;
    }

    public double getTerakhirGenerateSun() {
        return terakhirGenerateSun;
    }

    public void setTerakhirGenerateSun(double terakhirGenerateSun) {
        this.terakhirGenerateSun = terakhirGenerateSun;
    }
    
    @Override
    public void generateSun() {
        System.out.println("Sunflower create sun");
    }

    @Override
    public void shoot() {
        System.out.println("Sunflower cannot shoot");
    }

    @Override
    public void explode() {
        System.out.println("Sunflower Cannot Explode");
    }
}
