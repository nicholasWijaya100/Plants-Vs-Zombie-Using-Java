
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */

/**
 *
 * @author alvin
 */
public class ShowUserPanel extends javax.swing.JPanel {

    /**
     * Creates new form ShowUserFrame
     */
    Image menuImage = null;
    public ShowUserPanel() {
        initComponents();
        this.setSize(811, 607);
        try {
            menuImage = ImageIO.read(new File("images/ShowUser.png"));
            Del_Btn.setContentAreaFilled(false);
            Del_Btn.setBorderPainted(false);
            Ok_Btn.setContentAreaFilled(false);
            Ok_Btn.setBorderPainted(false);
            Can_Btn.setContentAreaFilled(false);
            Can_Btn.setBorderPainted(false);
            Rename_Btn.setContentAreaFilled(false);
            Rename_Btn.setBorderPainted(false);
        } catch (IOException ex) {
            Logger.getLogger(GameWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    protected void paintComponent(Graphics g) {
        g.drawImage(menuImage, 0, 0, 811, 607, null);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Del_Btn = new javax.swing.JButton();
        Can_Btn = new javax.swing.JButton();
        Rename_Btn = new javax.swing.JButton();
        Ok_Btn = new javax.swing.JButton();

        Del_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Del_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Del_BtnMouseClicked(evt);
            }
        });

        Can_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Can_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Can_BtnMouseClicked(evt);
            }
        });

        Rename_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Rename_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Rename_BtnMouseClicked(evt);
            }
        });

        Ok_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Ok_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Ok_BtnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(167, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ok_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Rename_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Can_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Del_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(114, 114, 114))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(466, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Rename_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Ok_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(Del_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(Can_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(64, 64, 64))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void Del_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Del_BtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Del_BtnMouseClicked

    private void Can_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Can_BtnMouseClicked
        MainMenuFrame MM = new MainMenuFrame();
        MM.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Can_BtnMouseClicked

    private void Rename_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rename_BtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Rename_BtnMouseClicked

    private void Ok_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ok_BtnMouseClicked
        MainMenuFrame MM = new MainMenuFrame();
        MM.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_Ok_BtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Can_Btn;
    private javax.swing.JButton Del_Btn;
    private javax.swing.JButton Ok_Btn;
    private javax.swing.JButton Rename_Btn;
    // End of variables declaration//GEN-END:variables
}
