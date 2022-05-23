
import java.awt.Image;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nichw
 */
public class NormalZombie extends Zombie{

    public NormalZombie(int maxHp, Image zombieImage, int x, int y, int damage, double waktuTiapMakan, double terakhirMakan, int kecepatan) {
        super(maxHp, zombieImage, x, y, damage, waktuTiapMakan, terakhirMakan, kecepatan);
    }
}
