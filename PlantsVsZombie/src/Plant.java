
import java.awt.Image;
import java.util.ArrayList;
import javax.swing.Icon;

public abstract class Plant implements DrawInterface, Cloneable{
    protected int maxHp;
    protected int hp;
    protected Image plantImage;
    protected int x;
    protected int y;
    protected int cost;

    public Plant(int hp, Image plantImage, int x, int y, int cost) {
        this.maxHp = hp;
        this.hp = hp;
        this.plantImage = plantImage;
        this.x = x;
        this.y = y;
        this.cost = cost;
    }
    
    public abstract void generateSun(Sun sunGeneric, ArrayList<Sun> sunDiLawn, int xFlower, int yFlower);
    public abstract void shoot(ArrayList<Peluruh> peluruhList, ArrayList<Peluruh> peluruhDiLawn);
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

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public int getMaxHp() {
        return maxHp;
    }

    public void setMaxHp(int maxHp) {
        this.maxHp = maxHp;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone(); 
    }
}
