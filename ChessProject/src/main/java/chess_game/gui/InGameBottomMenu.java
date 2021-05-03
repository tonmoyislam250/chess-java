/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chess_game.gui;

import javax.swing.JLabel;
import javax.swing.JList;

/**
 *
 * @author Enes Kızılcın <nazifenes.kizilcin@stu.fsm.edu.tr>
 */
public class InGameBottomMenu extends javax.swing.JPanel {

    /**
     * Creates new form NewJPanel
     */
    public InGameBottomMenu() {
        initComponents();
    }

    public JLabel getPlayersColorLBL() {
        return playersColorLBL;
    }

    public JList<String> getKilledPiecesLIST() {
        return killedPiecesLIST;
    }

    public void setKilledPiecesLIST(JList<String> killedPiecesLIST) {
        this.killedPiecesLIST = killedPiecesLIST;
    }

    public JLabel getTurnLBL() {
        return turnLBL;
    }

    public void setTurnLBL(JLabel turnLBL) {
        this.turnLBL = turnLBL;
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        anaMenuBTN = new javax.swing.JButton();
        playersColorLBL = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        killedPiecesLIST = new javax.swing.JList<>();
        turnLBL = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        anaMenuBTN.setForeground(new java.awt.Color(51, 255, 0));
        anaMenuBTN.setText("Menuye Dön");
        anaMenuBTN.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                anaMenuBTNActionPerformed(evt);
            }
        });

        playersColorLBL.setText("You're playing: ");

        jScrollPane2.setViewportView(killedPiecesLIST);

        turnLBL.setBackground(new java.awt.Color(13, 197, 197));
        turnLBL.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        turnLBL.setForeground(new java.awt.Color(153, 255, 153));
        turnLBL.setText("YOUR TURN!");

        jLabel2.setBackground(new java.awt.Color(0, 153, 102));
        jLabel2.setForeground(new java.awt.Color(0, 255, 153));
        jLabel2.setText("Killed Pieces");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(playersColorLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(97, 97, 97)
                        .addComponent(turnLBL)
                        .addContainerGap(80, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(anaMenuBTN)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGap(94, 94, 94)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(turnLBL)
                    .addComponent(playersColorLBL, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 11, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(anaMenuBTN, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(17, 17, 17))))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void anaMenuBTNActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_anaMenuBTNActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_anaMenuBTNActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton anaMenuBTN;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList<String> killedPiecesLIST;
    private javax.swing.JLabel playersColorLBL;
    private javax.swing.JLabel turnLBL;
    // End of variables declaration//GEN-END:variables
}
