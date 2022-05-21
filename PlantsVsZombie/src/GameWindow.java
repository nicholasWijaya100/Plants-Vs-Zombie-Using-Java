
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class GameWindow extends javax.swing.JPanel {

    /**
     * Creates new form GameWindow
     */
    
    Image menuImage;
    Image imagePlant;
    Image imagePea;
    ArrayList<Plant> listPlant = new ArrayList<>();
    ArrayList<Plant> plantDitanam = new ArrayList<>();
    Plant selectedPlant;
    JButton btnPilihSunflower = null;
    boolean pilihTile = false;
    int x;
    int y;
    ActionListener actionPilihSunflower = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            selectedPlant = listPlant.get(0);
            System.out.println("Pilih Sunflower");
        }
    };
    ActionListener actionPilihPeashooter = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            selectedPlant = listPlant.get(1);
            System.out.println("Pilih Peashooter");
        }
    };
    ActionListener actionPilihSnowPea = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            selectedPlant = listPlant.get(2);
            System.out.println("Pilih Snow Pea");
        }
    };
    MouseListener mouseClickLocation = new MouseListener() {
        @Override
        public void mouseClicked(MouseEvent e) {
            
        }

        @Override
        public void mousePressed(MouseEvent e) {
            x = e.getX();
            y = e.getY();
            System.out.println(x + "," + y);//these co-ords are relative to the component
        }

        @Override
        public void mouseReleased(MouseEvent e) {
            
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            
        }

        @Override
        public void mouseExited(MouseEvent e) {
            
        }
    };
    
    ActionListener pilihTileLawn = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            if(selectedPlant != null) {
                if(x >= 0 && x < 100 && y >= 0 && y < 120) {
                    System.out.println("0,0");
//                    try {
//                        Plant copy = (Plant)selectedPlant.clone();
//                        copy.setX(65);
//                        copy.setY(120);
//                        plantDitanam.add(copy);
//                    } catch (CloneNotSupportedException ex) {
//                        Logger.getLogger(GameWindow.class.getName()).log(Level.SEVERE, null, ex);
//                    }
                    selectedPlant = null;
                }
            }
        }
    };
    public GameWindow() {
        initComponents();
        this.setSize(1000, 752);
        
        try {
            menuImage = ImageIO.read(new File("images/mainBG.png"));
        } catch (IOException ex) {
            Logger.getLogger(GameWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Memasukkan jenis plant ke dalam program
        try { 
            imagePlant = ImageIO.read(new File("images/sunflower.gif"));
            listPlant.add(new Sunflower(5, 100, imagePlant, 160, 610, 50));
        } catch (IOException ex) {
            System.out.println("Gambar Sunflower tidak ada");
            Logger.getLogger(GameWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try { 
            imagePlant = ImageIO.read(new File("images/peashooter.gif"));
            imagePea = ImageIO.read(new File("images/pea.png"));
            listPlant.add(new Peashooter(imagePea, 20, 5, 100, imagePlant, 160, 610, 100));
        } catch (IOException ex) {
            System.out.println("Gambar Peashooter tidak ada");
            Logger.getLogger(GameWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try { 
            imagePlant = ImageIO.read(new File("images/freezepeashooter.gif"));
            imagePea = ImageIO.read(new File("images/freezepea.png"));
            listPlant.add(new Peashooter(imagePea, 20, 5, 100, imagePlant, 160, 610, 175));
        } catch (IOException ex) {
            System.out.println("Gambar Snow Pea tidak ada");
            Logger.getLogger(GameWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Button Untuk pilih plant yang akan ditanam
        JButton btnPilihSunflower = new JButton("Sunflower");
        btnPilihSunflower.setBounds(110, 8, 64, 90);
        btnPilihSunflower.addActionListener(actionPilihSunflower);
        this.add(btnPilihSunflower);
        
        JButton btnPilihPeashooter = new JButton("Peashooter");
        btnPilihPeashooter.setBounds(175, 8, 64, 90);
        btnPilihPeashooter.addActionListener(actionPilihPeashooter);
        this.add(btnPilihPeashooter);
        
        JButton btnPilihSnowPea = new JButton("Snow Pea");
        btnPilihSnowPea.setBounds(240, 8, 64, 90);
        btnPilihSnowPea.addActionListener(actionPilihSnowPea);
        this.add(btnPilihSnowPea);
        
        //Button untuk select tile rumput
        JButton btnLawn = new JButton("");
        btnLawn.setBounds(48, 110, 900, 600);
        btnLawn.addActionListener(pilihTileLawn);
        btnLawn.addMouseListener(mouseClickLocation);
        btnLawn.setContentAreaFilled(false);
        btnLawn.setBorderPainted(false);
        this.add(btnLawn);
    }
    
    @Override
    protected void paintComponent(Graphics g) {
        g.clearRect(0, 0, 1000, 752);
        g.drawImage(menuImage, 0, 0, 1000, 752, null);
        for(Plant i : plantDitanam) {
            i.draw(g);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setPreferredSize(new java.awt.Dimension(1000, 752));
        setRequestFocusEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 752, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
