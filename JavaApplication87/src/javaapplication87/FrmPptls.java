package javaapplication87;

import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FeGa
 */
public class FrmPptls extends javax.swing.JFrame {

    int aleatorio;
    
    public FrmPptls() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnPiedra = new javax.swing.JButton();
        btnPapel = new javax.swing.JButton();
        btntijera = new javax.swing.JButton();
        btnspock = new javax.swing.JButton();
        btnlagarto = new javax.swing.JButton();
        btnjugar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btnPiedra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication87/piedra.png"))); // NOI18N
        btnPiedra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPiedraActionPerformed(evt);
            }
        });

        btnPapel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication87/papel.png"))); // NOI18N
        btnPapel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPapelActionPerformed(evt);
            }
        });

        btntijera.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication87/tijera.png"))); // NOI18N
        btntijera.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btntijeraActionPerformed(evt);
            }
        });

        btnspock.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication87/spock.png"))); // NOI18N
        btnspock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnspockActionPerformed(evt);
            }
        });

        btnlagarto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/javaapplication87/lagarto.png"))); // NOI18N
        btnlagarto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnlagartoActionPerformed(evt);
            }
        });

        btnjugar.setText("jugar");
        btnjugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjugarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnjugar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnspock, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnlagarto, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(67, 67, 67)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnPapel, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btntijera, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 186, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(115, 115, 115)
                .addComponent(btnPiedra, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(btnPiedra, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(btnspock, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(btnPapel)))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btntijera, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnlagarto, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addComponent(btnjugar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPiedraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPiedraActionPerformed
        if (aleatorio == 1)
        {
            JOptionPane.showMessageDialog(null, "empate");
        }
        
        else if ((aleatorio == 2) || (aleatorio == 5))
        {
            JOptionPane.showMessageDialog(null, "perdiste");
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, "ganaste");
        }
        
    }//GEN-LAST:event_btnPiedraActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        //aleatorio = (int)(Math.random()*5+1);
        //System.out.print(aleatorio);
    }//GEN-LAST:event_formWindowOpened

    private void btnPapelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPapelActionPerformed
        if (aleatorio == 2)
        {
            JOptionPane.showMessageDialog(null, "empate");
        }
        
        else if ((aleatorio == 3) || (aleatorio == 4))
        {
            JOptionPane.showMessageDialog(null, "perdiste");
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, "ganaste");
        }
    }//GEN-LAST:event_btnPapelActionPerformed

    private void btntijeraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btntijeraActionPerformed
        if (aleatorio == 3)
        {
            JOptionPane.showMessageDialog(null, "empate");
        }
        
        else if ((aleatorio == 1) || (aleatorio == 5))
        {
            JOptionPane.showMessageDialog(null, "perdiste");
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, "ganaste");
        }
    }//GEN-LAST:event_btntijeraActionPerformed

    private void btnlagartoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnlagartoActionPerformed
        if (aleatorio == 4)
        {
            JOptionPane.showMessageDialog(null, "empate");
        }
        
        else if ((aleatorio == 2) || (aleatorio == 5))
        {
            JOptionPane.showMessageDialog(null, "ganaste");
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, "perdiste");
        }
    }//GEN-LAST:event_btnlagartoActionPerformed

    private void btnspockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnspockActionPerformed
        if (aleatorio == 5)
        {
            JOptionPane.showMessageDialog(null, "empate");
        }
        
        else if ((aleatorio == 1) || (aleatorio == 3))
        {
            JOptionPane.showMessageDialog(null, "ganaste");
        }
        
        else
        {
            JOptionPane.showMessageDialog(null, "perdiste");
        }
    }//GEN-LAST:event_btnspockActionPerformed

    private void btnjugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjugarActionPerformed
        aleatorio = (int)(Math.random()*5+1);
        System.out.print(aleatorio);
    }//GEN-LAST:event_btnjugarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmPptls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPptls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPptls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPptls.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmPptls().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPapel;
    private javax.swing.JButton btnPiedra;
    private javax.swing.JButton btnjugar;
    private javax.swing.JButton btnlagarto;
    private javax.swing.JButton btnspock;
    private javax.swing.JButton btntijera;
    // End of variables declaration//GEN-END:variables
}
