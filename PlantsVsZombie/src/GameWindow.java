
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Rectangle;
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
import javax.swing.Timer;

public class GameWindow extends javax.swing.JPanel {

    /**
     * Creates new form GameWindow
     */
    
    Image menuImage;
    Image imagePlant;
    Image imagePea;
    Image imageZombie;
    Image imageSun;
    ArrayList<Plant> listPlant = new ArrayList<>();
    ArrayList<Zombie> listZombie = new ArrayList<>();
    static ArrayList<Peluruh> listPeluruh = new ArrayList<>();
    static Sun sunGeneric;
    ArrayList<Plant> plantDitanam = new ArrayList<>();
    ArrayList<Zombie> zombieDiLawn = new ArrayList<>();
    static ArrayList<Peluruh> peluruhDiLawn = new ArrayList<>();
    static ArrayList<Sun> sunDiLawn = new ArrayList<>();
    Plant selectedPlant;
    JButton btnPilihSunflower = null;
    boolean pilihTile = false;
    int x;
    int y;
    int marginKiri = 48;
    int marginAtas = 110;
    int ctrDetik = 0;
    Timer tmr = new Timer(100, new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            ctrDetik++;
            if(ctrDetik == 5) {
                try {
                    Zombie tempZombie = (Zombie) listZombie.get(0).clone();
                    tempZombie.setX(950);
                    tempZombie.setY(120);
                    zombieDiLawn.add(tempZombie);
                } catch (CloneNotSupportedException ex) {
                    Logger.getLogger(GameWindow.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            for(Plant i : plantDitanam) {
                if(i instanceof Sunflower && ((Sunflower)i).getTerakhirGenerateSun() + ((Sunflower)i).getWaktuGenerateSun() <= ctrDetik) {
                   ((Sunflower)i).setTerakhirGenerateSun(ctrDetik);
                   i.generateSun(sunGeneric, sunDiLawn, i.getX(), i.getY());
                }
            }
            //Cek Apakah Zombie makan plant atau tidak
            for(Zombie i : zombieDiLawn) {
                boolean lagiMakanPlant = false;
                Rectangle recZom = new Rectangle(i.getX(),i.getY(),62,100);
                for (Plant j : plantDitanam){
                    Rectangle recPlant = new Rectangle(j.getX(),j.getY(),74,73);
                    if (recZom.intersects(recPlant)){
                        lagiMakanPlant = true;
                        if(i.getTerakhirMakan() + i.getWaktuTiapMakan() <= ctrDetik) {
                            j.setHp(j.getHp() - i.getDamage());
                            i.setTerakhirGerak(ctrDetik);
                        }
                    }
                }
                if(i.getTerakhirGerak() + 10 <= ctrDetik && lagiMakanPlant == false) {
                    i.setX(i.getX() - i.getKecepatan());
                    i.setTerakhirGerak(ctrDetik);
                }
            }
            //Cek Apakah plant sudah mati atau belum, apabila sudah di remove
            for(int i = plantDitanam.size() - 1; i >= 0; i--) {
                if(plantDitanam.get(i).getHp() < 0) {
                    plantDitanam.remove(i);
                }
            }
            for(Zombie i : zombieDiLawn) {
                for(Plant j : plantDitanam) {
                    if(i.getY() == j.getY()) {
                       if(j instanceof Peashooter) {
                           ((Peashooter)j).setTembakAktif(true);
                       } else if(j instanceof SnowPea) {
                           ((SnowPea)j).setTembakAktif(true);
                       }
                    }
                }
            }
            for(Plant i : plantDitanam) {
                if(i instanceof Peashooter && ((Peashooter)i).isTembakAktif() == true) {
                    if(((Peashooter)i).getTerakhirTembak() + ((Peashooter)i).getWaktuTiapTembak() <= ctrDetik) {
                        i.shoot(listPeluruh, peluruhDiLawn);
                        ((Peashooter)i).setTerakhirTembak(ctrDetik);
                    }
                    ((Peashooter)i).setTembakAktif(false);
                } else if(i instanceof SnowPea && ((SnowPea)i).isTembakAktif() == true) {
                    if(((SnowPea)i).getTerakhirTembak() + ((SnowPea)i).getWaktuTiapTembak() <= ctrDetik) {
                        i.shoot(listPeluruh, peluruhDiLawn);
                        ((SnowPea)i).setTerakhirTembak(ctrDetik);
                    }
                    ((SnowPea)i).setTembakAktif(false);
                }
            }
            for(Peluruh i : peluruhDiLawn) {
                i.setX(i.getX() + 10);
            }
            for(int i = peluruhDiLawn.size() - 1; i >= 0; i--) {
                if(peluruhDiLawn.get(i).getX() >= 1000) {
                    peluruhDiLawn.remove(i);
                }
            }
            for(int i = peluruhDiLawn.size() - 1; i >= 0; i--) {
                Rectangle recPeluruh = new Rectangle(peluruhDiLawn.get(i).getX(), peluruhDiLawn.get(i).getY(), 28, 28);
                for(Zombie j : zombieDiLawn) {
                    Rectangle recZom = new Rectangle(j.getX(), j.getY(), 62, 100);
                    if(recPeluruh.intersects(recZom)) {
                        j.setHp(j.getHp() - peluruhDiLawn.get(i).getDamage());
                        peluruhDiLawn.remove(i);
                    }
                }
            }
            for(int i = zombieDiLawn.size() - 1; i >= 0; i--) {
                if(zombieDiLawn.get(i).getHp() <= 0) {
                    zombieDiLawn.remove(i);
                }
            }
            repaint();
        }
    });
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

    ActionListener actionPilihWallnut = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            selectedPlant = listPlant.get(3);
            System.out.println("Pilih Wallnut");
        }
    };
    
    ActionListener actionPilihCherrybomb = new ActionListener() {
        @Override
        public void actionPerformed(ActionEvent e) {
            selectedPlant = listPlant.get(4);
            System.out.println("Pilih Cherrybomb");
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
            Rectangle recMouse = new Rectangle(x - 1 + marginKiri, y - 1 + marginAtas, 2, 2);
            for(int i = sunDiLawn.size() - 1; i >= 0; i--) {
                Rectangle recSun = new Rectangle(sunDiLawn.get(i).getX(), sunDiLawn.get(i).getY(), 80, 80);
                if(recMouse.intersects(recSun)) {
                    System.out.println("Sun hilang");
                    sunDiLawn.remove(i);
                }
            }
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
                int xSet = 0;
                int ySet = 0;
                if(x >= 0 && x < 100 && y >= 0 && y < 120) {
                    xSet = 65;
                    ySet = 120;
                } else if(x >= 0 && x < 100 && y >= 120 && y < 240) {
                    xSet = 65;
                    ySet = 240;
                } else if(x >= 0 && x < 100 && y >= 240 && y < 360) {
                    xSet = 65;
                    ySet = 360;
                } else if(x >= 0 && x < 100 && y >= 360 && y < 480) {
                    xSet = 65;
                    ySet = 480;
                } else if(x >= 0 && x < 100 && y >= 480 && y <= 600) {
                    xSet = 65;
                    ySet = 610;
                } else if(x >= 100 && x < 200 && y >= 0 && y < 120) {
                    xSet = 160;
                    ySet = 120;
                } else if(x >= 100 && x < 200 && y >= 120 && y < 240) {
                    xSet = 160;
                    ySet = 240;
                } else if(x >= 100 && x < 200 && y >= 240 && y < 360) {
                    xSet = 160;
                    ySet = 360;
                } else if(x >= 100 && x < 200 && y >= 360 && y < 480) {
                    xSet = 160;
                    ySet = 480;
                } else if(x >= 100 && x < 200 && y >= 480 && y <= 600) {
                    xSet = 160;
                    ySet = 610;
                } else if(x >= 200 && x < 300 && y >= 0 && y < 120) {
                    xSet = 255;
                    ySet = 120;
                } else if(x >= 200 && x < 300 && y >= 120 && y < 240) {
                    xSet = 255;
                    ySet = 240;
                } else if(x >= 200 && x < 300 && y >= 240 && y < 360) {
                    xSet = 255;
                    ySet = 360;
                } else if(x >= 200 && x < 300 && y >= 360 && y < 480) {
                    xSet = 255;
                    ySet = 480;
                } else if(x >= 200 && x < 300 && y >= 480 && y <= 600) {
                    xSet = 255;
                    ySet = 610;
                } else if(x >= 300 && x < 400 && y >= 0 && y < 120) {
                    xSet = 370;
                    ySet = 120;
                } else if(x >= 300 && x < 400 && y >= 120 && y < 240) {
                    xSet = 370;
                    ySet = 240;
                } else if(x >= 300 && x < 400 && y >= 240 && y < 360) {
                    xSet = 370;
                    ySet = 360;
                } else if(x >= 300 && x < 400 && y >= 360 && y < 480) {
                    xSet = 370;
                    ySet = 480;
                } else if(x >= 300 && x < 400 && y >= 480 && y <= 600) {
                    xSet = 370;
                    ySet = 610;
                } else if(x >= 400 && x < 500 && y >= 0 && y < 120) {
                    xSet = 465;
                    ySet = 120;
                } else if(x >= 400 && x < 500 && y >= 120 && y < 240) {
                    xSet = 465;
                    ySet = 240;
                } else if(x >= 400 && x < 500 && y >= 240 && y < 360) {
                    xSet = 465;
                    ySet = 360;
                } else if(x >= 400 && x < 500 && y >= 360 && y < 480) {
                    xSet = 465;
                    ySet = 480;
                } else if(x >= 400 && x < 500 && y >= 480 && y <= 600) {
                    xSet = 465;
                    ySet = 610;
                } else if(x >= 500 && x < 600 && y >= 0 && y < 120) {
                    xSet = 570;
                    ySet = 120;
                } else if(x >= 500 && x < 600 && y >= 120 && y < 240) {
                    xSet = 570;
                    ySet = 240;
                } else if(x >= 500 && x < 600 && y >= 240 && y < 360) {
                    xSet = 570;
                    ySet = 360;
                } else if(x >= 500 && x < 600 && y >= 360 && y < 480) {
                    xSet = 570;
                    ySet = 480;
                } else if(x >= 500 && x < 600 && y >= 480 && y < 600) {
                    xSet = 570;
                    ySet = 610;
                } else if(x >= 600 && x < 700 && y >= 0 && y < 120) {
                    xSet = 670;
                    ySet = 120;
                } else if(x >= 600 && x < 700 && y >= 120 && y < 240) {
                    xSet = 670;
                    ySet = 240;
                } else if(x >= 600 && x < 700 && y >= 240 && y < 360) {
                    xSet = 670;
                    ySet = 360;
                } else if(x >= 600 && x < 700 && y >= 360 && y < 480) {
                    xSet = 670;
                    ySet = 480;
                } else if(x >= 600 && x < 700 && y >= 480 && y <= 600) {
                    xSet = 670;
                    ySet = 610;
                } else if(x >= 700 && x < 800 && y >= 0 && y < 120) {
                    xSet = 770;
                    ySet = 120;
                } else if(x >= 700 && x < 800 && y >= 120 && y < 240) {
                    xSet = 770;
                    ySet = 240;
                } else if(x >= 700 && x < 800 && y >= 240 && y < 360) {
                    xSet = 770;
                    ySet = 360;
                } else if(x >= 700 && x < 800 && y >= 360 && y < 480) {
                    xSet = 770;
                    ySet = 480;
                } else if(x >= 700 && x < 800 && y >= 480 && y <= 600) {
                    xSet = 770;
                    ySet = 610;
                } else if(x >= 800 && x <= 900 && y >= 0 && y < 120) {
                    xSet = 870;
                    ySet = 120;
                } else if(x >= 800 && x <= 900 && y >= 120 && y < 240) {
                    xSet = 870;
                    ySet = 240;
                } else if(x >= 800 && x <= 900 && y >= 240 && y < 360) {
                    xSet = 870;
                    ySet = 360;
                } else if(x >= 800 && x <= 900 && y >= 360 && y < 480) {
                    xSet = 870;
                    ySet = 480;
                } else if(x >= 800 && x <= 900 && y >= 480 && y <= 600) {
                    xSet = 870;
                    ySet = 610;
                }
                if(xSet != 0 && ySet != 0) {
                    try {
                        Plant copy = (Plant)selectedPlant.clone();
                        copy.setX(xSet);
                        copy.setY(ySet);
                        plantDitanam.add(copy);
                    } catch (CloneNotSupportedException ex) {
                        Logger.getLogger(GameWindow.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                selectedPlant = null;
            }
        }
    };
    public GameWindow() {
        initComponents();
        this.setSize(1000, 752);
        plantDitanam = new ArrayList<>();
        zombieDiLawn = new ArrayList<>();
        peluruhDiLawn = new ArrayList<>();
        tmr.start();
        try {

            menuImage = ImageIO.read(new File("images/mainBG.png"));
        } catch (IOException ex) {
            Logger.getLogger(GameWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        //Image icon = new ImageIcon(new URL("http://i.stack.imgur.com/KSnus.gif")).getImage();
        //Memasukkan jenis plant ke dalam program
        try { 
            //imagePlant = ImageIO.read(new File("images/sunflower.gif"));
            imagePlant = new ImageIcon("images/sunflower.gif").getImage();
            listPlant.add(new Sunflower(40, 100, imagePlant, 160, 610, 50));
        } catch (Exception ex) {
            System.out.println("Gambar Sunflower tidak ada");
            Logger.getLogger(GameWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try { 
            imagePlant = new ImageIcon("images/peashooter.gif").getImage();
            listPlant.add(new Peashooter(15, 100, imagePlant, 160, 610, 100));
        } catch (Exception ex) {
            System.out.println("Gambar Peashooter tidak ada");
            Logger.getLogger(GameWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try { 
            imagePlant = new ImageIcon("images/freezepeashooter.gif").getImage();
            listPlant.add(new SnowPea(15, 100, imagePlant, 160, 610, 175));
        } catch (Exception ex) {
            System.out.println("Gambar Snow Pea tidak ada");
            Logger.getLogger(GameWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try { 
            imagePlant = new ImageIcon("images/wallnut.gif").getImage();
            listPlant.add(new Wallnut(100, imagePlant, 160, 610, 50));
        } catch (Exception ex) {
            System.out.println("Gambar Wallnut tidak ada");
            Logger.getLogger(GameWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try { 
            imagePlant = new ImageIcon("images/cherrybomb.png").getImage();
            listPlant.add(new Cherrybomb(100, imagePlant, 160, 610, 150));
        } catch (Exception ex) {
            System.out.println("Gambar Cherrybomb tidak ada");
            Logger.getLogger(GameWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Memasukan jenis zombie yang ada
        try {
            imageZombie = ImageIO.read(new File("images/normalZombie.png"));
            listZombie.add(new NormalZombie(140, imageZombie, 0, 0, 30, 3, 30));
        } catch (IOException ex) {
            System.out.println("Gambar Zombie Normal tidak ada");
            Logger.getLogger(GameWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        //Memasukkan jenis peluruh plant atau zombie yang ada
        try {
            imagePea = ImageIO.read(new File("images/pea.png"));
            listPeluruh.add(new PeluruhGreenPea(0, 0, 20, imagePea, 30, 0));
        } catch (Exception ex) {
            System.out.println("Gambar green pea tidak ada");
            Logger.getLogger(GameWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            imagePea = ImageIO.read(new File("images/freezepea.png"));
            listPeluruh.add(new PeluruhIcePea(0, 0, 20, imagePea, 30, 0));
        } catch (Exception ex) {
            System.out.println("Gambar ice pea tidak ada");
            Logger.getLogger(GameWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            //Add genericSun
            imageSun = ImageIO.read(new File("images/sun.png"));
            sunGeneric = new Sun(0, 0, 20, imageSun);
        } catch (IOException ex) {
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
        
        JButton btnPilihWallnut = new JButton("Wallnut");
        btnPilihWallnut.setBounds(305, 8, 64, 90);
        btnPilihWallnut.addActionListener(actionPilihWallnut);
        this.add(btnPilihWallnut);
        
        JButton btnPilihCherrybomb = new JButton("Cherrybomb");
        btnPilihCherrybomb.setBounds(370, 8, 64, 90);
        btnPilihCherrybomb.addActionListener(actionPilihCherrybomb);
        this.add(btnPilihCherrybomb);
        
        //Button untuk select tile rumput
        JButton btnLawn = new JButton("");
        btnLawn.setBounds(marginKiri, marginAtas, 900, 600);
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
        for(Zombie i : zombieDiLawn) {
            i.draw(g);
        }
        for(Peluruh i : peluruhDiLawn) {
            i.draw(g);
        }
        for(Sun i : sunDiLawn) {
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
