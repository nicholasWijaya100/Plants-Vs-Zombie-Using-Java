
import java.awt.Image;
import javax.swing.Icon;

public abstract class Plant implements DrawInterface{
    protected int hp;
    protected Image plantImage;
    protected int x;
    protected int y;

    public Plant(int hp, Image plantImage, int x, int y) {
        this.hp = hp;
        this.plantImage = plantImage;
        this.x = x;
        this.y = y;
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

    public Image getPlantImage() {
        return plantImage;
    }

    public void setPlantImage(Image plantImage) {
        this.plantImage = plantImage;
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
}
