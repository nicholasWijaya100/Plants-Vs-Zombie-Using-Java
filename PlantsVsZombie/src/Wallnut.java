
import java.awt.Graphics;
import java.awt.Image;
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Mario
 */
public class Wallnut extends Plant{

    public Wallnut(int hp, Image plantImage, int x, int y, int cost) {
        super(hp, plantImage, x, y, cost);
    }
    
    @Override
    public void generateSun(Sun sunGeneric, ArrayList<Sun> sunDiLawn, int xFlower, int yFlower) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void shoot(ArrayList<Peluruh> peluruhList, ArrayList<Peluruh> peluruhDiLawn) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void explode() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void draw(Graphics g) {
        g.drawImage(this.plantImage, x, y, null);
    }
    
}
