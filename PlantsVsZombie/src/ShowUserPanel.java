
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

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
        try{
            user2.setText(Driver.player.get(1).getUsername());
        }catch(Exception e){
            user2.setText("-");
        }

        
        try{
            user3.setText(Driver.player.get(2).getUsername());
        }catch(Exception e){
            user3.setText("-");
        }

        
        try{
            user4.setText(Driver.player.get(3).getUsername());
        }catch(Exception e){
            user4.setText("-");
        }

        
        try{
            user5.setText(Driver.player.get(4).getUsername());
        }catch(Exception e){
            user5.setText("-");
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
        user2 = new javax.swing.JLabel();
        user1 = new javax.swing.JLabel();
        user3 = new javax.swing.JLabel();
        user4 = new javax.swing.JLabel();
        user5 = new javax.swing.JLabel();

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

        user2.setBackground(new java.awt.Color(255, 255, 255));
        user2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        user2.setForeground(new java.awt.Color(255, 255, 255));
        user2.setText(Driver.player.get(0).getUsername());
        user2.setToolTipText("");
        user2.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        user1.setBackground(new java.awt.Color(255, 255, 255));
        user1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        user1.setForeground(new java.awt.Color(255, 255, 255));
        user1.setText(Driver.player.get(0).getUsername());
        user1.setToolTipText("");
        user1.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        user3.setBackground(new java.awt.Color(255, 255, 255));
        user3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        user3.setForeground(new java.awt.Color(255, 255, 255));
        user3.setText(Driver.player.get(0).getUsername());
        user3.setToolTipText("");
        user3.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        user4.setBackground(new java.awt.Color(255, 255, 255));
        user4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        user4.setForeground(new java.awt.Color(255, 255, 255));
        user4.setText(Driver.player.get(0).getUsername());
        user4.setToolTipText("");
        user4.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        user5.setBackground(new java.awt.Color(255, 255, 255));
        user5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        user5.setForeground(new java.awt.Color(255, 255, 255));
        user5.setText(Driver.player.get(0).getUsername());
        user5.setToolTipText("");
        user5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

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
            .addGroup(layout.createSequentialGroup()
                .addGap(214, 214, 214)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(user5, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user4, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user3, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user1, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(user2, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(225, Short.MAX_VALUE)
                .addComponent(user1, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user2, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user3, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user4, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(62, 62, 62)
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
        MM.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_Can_BtnMouseClicked

    private void Rename_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Rename_BtnMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_Rename_BtnMouseClicked

    private void Ok_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ok_BtnMouseClicked
        MainMenuFrame MM = new MainMenuFrame();
        MM.setVisible(true);
        MM.setLocationRelativeTo(null);
        this.setVisible(false);
    }//GEN-LAST:event_Ok_BtnMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Can_Btn;
    private javax.swing.JButton Del_Btn;
    private javax.swing.JButton Ok_Btn;
    private javax.swing.JButton Rename_Btn;
    private javax.swing.JLabel user1;
    private javax.swing.JLabel user2;
    private javax.swing.JLabel user3;
    private javax.swing.JLabel user4;
    private javax.swing.JLabel user5;
    // End of variables declaration//GEN-END:variables
}
