
import javax.swing.Icon;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author nichw
 */
public abstract class Plant {
    protected int hp;
    protected Icon plantImage;

    public Plant(int hp, Icon plantImage) {
        this.hp = hp;
        this.plantImage = plantImage;
    }
    
    public abstract void generateSun();
    public abstract void shoot();
    public abstract void explode();

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }
}
