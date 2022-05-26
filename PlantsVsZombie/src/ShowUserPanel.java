
import java.awt.Graphics;
import java.awt.Image;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JOptionPane;

public class ShowUserPanel extends javax.swing.JPanel {

    /**
     * Creates new form ShowUserFrame
     */
    public static int temp=0;
    public static int select=0;
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
            New_Btn.setContentAreaFilled(false);
            New_Btn.setBorderPainted(false);
        } catch (IOException ex) {
            Logger.getLogger(GameWindow.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try{
            user1.setText(Driver.player.get(0).getUsername());
        }catch(Exception e){
            user1.setText("-");
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
        New_Btn = new javax.swing.JButton();
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

        New_Btn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        New_Btn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                New_BtnMouseClicked(evt);
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
        user2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user2MouseClicked(evt);
            }
        });

        user1.setBackground(new java.awt.Color(255, 255, 255));
        user1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        user1.setForeground(new java.awt.Color(255, 255, 255));
        user1.setText(Driver.player.get(0).getUsername());
        user1.setToolTipText("");
        user1.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        user1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user1MouseClicked(evt);
            }
        });

        user3.setBackground(new java.awt.Color(255, 255, 255));
        user3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        user3.setForeground(new java.awt.Color(255, 255, 255));
        user3.setText(Driver.player.get(0).getUsername());
        user3.setToolTipText("");
        user3.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        user3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user3MouseClicked(evt);
            }
        });

        user4.setBackground(new java.awt.Color(255, 255, 255));
        user4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        user4.setForeground(new java.awt.Color(255, 255, 255));
        user4.setText(Driver.player.get(0).getUsername());
        user4.setToolTipText("");
        user4.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        user4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user4MouseClicked(evt);
            }
        });

        user5.setBackground(new java.awt.Color(255, 255, 255));
        user5.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        user5.setForeground(new java.awt.Color(255, 255, 255));
        user5.setText(Driver.player.get(0).getUsername());
        user5.setToolTipText("");
        user5.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        user5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                user5MouseClicked(evt);
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
                    .addComponent(New_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 256, javax.swing.GroupLayout.PREFERRED_SIZE))
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
                        .addComponent(New_Btn, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
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
         if (Driver.player.size()==1) {
            try {
                Driver.player.remove(temp);
                RegisterAccountFrame RAF = new RegisterAccountFrame();
                RAF.setVisible(true);
                RAF.setLocationRelativeTo(null);
                this.setVisible(false);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Tidak ada data yang di select!", "Warning!", JOptionPane.ERROR_MESSAGE);
            }
        }else{
            try {
                Driver.player.remove(temp);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Tidak ada data yang di select!", "Warning!", JOptionPane.ERROR_MESSAGE);
            }
            MainMenuFrame MM = new MainMenuFrame();
            MM.setVisible(true);
            MM.setLocationRelativeTo(null);
            this.setVisible(false);
        }
    }//GEN-LAST:event_Del_BtnMouseClicked

    private void Can_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Can_BtnMouseClicked
        MainMenuFrame MM = new MainMenuFrame();
        MM.setVisible(true);
        MM.setLocationRelativeTo(null);
        ShowUserFrame show = new ShowUserFrame();
        show.setVisible(false);
        this.setVisible(false);
    }//GEN-LAST:event_Can_BtnMouseClicked

    private void New_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_New_BtnMouseClicked
        if (Driver.player.size()<5) {
            RegisterAccountFrame RAF = new RegisterAccountFrame();
            RAF.setVisible(true);
            RAF.setLocationRelativeTo(null);
            ShowUserFrame show = new ShowUserFrame();
            show.setVisible(false);
            this.setVisible(false);
        }else
            JOptionPane.showMessageDialog(this, "Data user telah penuh!", "Warning!", JOptionPane.ERROR_MESSAGE);
    }//GEN-LAST:event_New_BtnMouseClicked

    private void Ok_BtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Ok_BtnMouseClicked
        Driver.currentPlayer = Driver.player.get(select);
        MainMenuFrame MM = new MainMenuFrame();
        MM.setVisible(true);
        MM.setLocationRelativeTo(null);
        ShowUserFrame show = new ShowUserFrame();
        this.setVisible(false);
        show.setVisible(false);
    }//GEN-LAST:event_Ok_BtnMouseClicked

    private void user1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user1MouseClicked
        temp=0;
        select=0;
    }//GEN-LAST:event_user1MouseClicked

    private void user2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user2MouseClicked
        temp=1;
        select=1;
    }//GEN-LAST:event_user2MouseClicked

    private void user3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user3MouseClicked
        temp=2;
        select=2;
    }//GEN-LAST:event_user3MouseClicked

    private void user4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user4MouseClicked
        temp=3;
        select=3;
    }//GEN-LAST:event_user4MouseClicked

    private void user5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_user5MouseClicked
        temp=4;
        select=4;
    }//GEN-LAST:event_user5MouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Can_Btn;
    private javax.swing.JButton Del_Btn;
    private javax.swing.JButton New_Btn;
    private javax.swing.JButton Ok_Btn;
    private javax.swing.JLabel user1;
    private javax.swing.JLabel user2;
    private javax.swing.JLabel user3;
    private javax.swing.JLabel user4;
    private javax.swing.JLabel user5;
    // End of variables declaration//GEN-END:variables
}
