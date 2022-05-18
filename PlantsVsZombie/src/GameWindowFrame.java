
import java.awt.Desktop;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
public class GameWindowFrame extends javax.swing.JFrame {


    public GameWindowFrame() {
        initComponents();
        this.setSize(1000, 752);
        setLocationRelativeTo(null);
        try {
           Driver.clip.stop();
           File f = new File("openingVideo.mp4");
           Desktop d = Desktop.getDesktop();
           d.open(f);
        } catch (IOException ex) {
            System.out.println("Err : " + ex.getMessage().toString());
        }
        try{
            Driver.audioInputStream = AudioSystem.getAudioInputStream(new File("music/day.wav"));
            Driver.clip = AudioSystem.getClip( );
            Driver.clip.loop(Clip.LOOP_CONTINUOUSLY);
            Driver.clip.open(Driver.audioInputStream);
            Driver.clip.start();
        } catch(LineUnavailableException | UnsupportedAudioFileException | IOException ex) {
            Logger.getLogger(Driver.class.getName()).log(Level.SEVERE, null, ex);
        }
        try {
            CardPlant sunflower = new CardPlant(ImageIO.read(new File("images/card_sunflower.png")));
            sunflower.setLocation(110,8);
            getLayeredPane().add(sunflower,new Integer(3));

            CardPlant plant2 = new CardPlant(ImageIO.read(new File("images/card_sunflower.png")));
            plant2.setLocation(175,8);
            getLayeredPane().add(plant2,new Integer(3));

            CardPlant plant3 = new CardPlant(ImageIO.read(new File("images/card_sunflower.png")));
            plant3.setLocation(240,8);
            getLayeredPane().add(plant3,new Integer(3));

            CardPlant plant4 = new CardPlant(ImageIO.read(new File("images/card_sunflower.png")));
            plant4.setLocation(305,8);
            getLayeredPane().add(plant4,new Integer(3));
        } catch(IOException e) {
            
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

        gameWindow1 = new GameWindow();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Zombie Vs Plants");
        setPreferredSize(new java.awt.Dimension(1000, 300));

        javax.swing.GroupLayout gameWindow1Layout = new javax.swing.GroupLayout(gameWindow1);
        gameWindow1.setLayout(gameWindow1Layout);
        gameWindow1Layout.setHorizontalGroup(
            gameWindow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        gameWindow1Layout.setVerticalGroup(
            gameWindow1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 752, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gameWindow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(gameWindow1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private GameWindow gameWindow1;
    // End of variables declaration//GEN-END:variables
}
