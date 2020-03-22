package pong;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.JOptionPane;
import javax.swing.Timer;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FeGa
 */
public class Frmpong extends javax.swing.JFrame implements KeyListener{
    
    /**
     * Creates new form Frmpong
     */
    
    int pelotaX= 290,pelotaY=200;
    int signo=1;
    int signo2=1;
    
    int paleta1=170;
    int paleta2=170;
    int tope=20;
    int medidaiz=0;
    int medidader=0;
    int jugador1=0;
    int jugador2=0;
    
    int velpaleta;
    int rapibola;
    
    public Frmpong() {
        initComponents();
        //setFocusable(true);
        addKeyListener(this);
        btnfacil.addKeyListener(this);
        btnmedio.addKeyListener(this);
        btndificil.addKeyListener(this);
        btnjugar.addKeyListener(this);
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.BLACK);
        
        
               
                
    }
    @Override
    public void keyTyped(KeyEvent e) {}
    @Override
    public void keyReleased(KeyEvent e) {}
    @Override
    public void keyPressed(KeyEvent e)

    
    {
       System.out.println(e.getKeyCode());
       if (e.getKeyCode()==38)
       {
           paleta2-=velpaleta;
       }
       if (e.getKeyCode()==40)
       {
           paleta2+=velpaleta;
       }
       if (e.getKeyCode()==65)
       {
           paleta1-=velpaleta;
       }
       if (e.getKeyCode()==90)
       {
           paleta1+=velpaleta;
       }
    
    }

    
    public void paint(Graphics g) // g es de tipo graphics
    {
        super.paint(g);
                
        g.setColor(Color.WHITE);
        g.drawOval(pelotaX, pelotaY, 20, 20);
        g.drawRect(0, paleta1, tope, 60);
        g.drawRect(580, paleta2, tope, 60);
        g.drawRect(0, 25, 600, 370);
        
        repaint();
    }
    
    Timer temporizador = new Timer(10, new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            pelotaX+=signo*rapibola; // el uno es incremnto de avance
            pelotaY+=signo2*rapibola;
            //if (pelotaX<=0 || pelotaX>=580) 
            //{
              //  signo*=-1;
                                     
            //}
            
            if (pelotaY<= 30 || pelotaY >=380)
            {
                signo2*=-1;
            }
             
            //medidaiz=paleta1+60;
            if (pelotaX==20 && pelotaY>=paleta1-20 && pelotaY<=paleta1+70)

            {
                signo*=-1;
            }
            
            if (pelotaX==560 && pelotaY>=paleta2-20 && pelotaY<=paleta2+70)

            {
                signo*=-1;
            }
            Condicion();
            
            if (paleta1>335)
            {
                paleta1=335;
            }
            if (paleta1<38)
            {
                paleta1=38;
            }
            if (paleta2>335)
            {
                paleta2=335;
            }
            if (paleta2<38)
            {
                paleta2=38;
            }
              
           
            
            
        }
});
    
    public void Condicion()
    {
        if (pelotaX>=600 && pelotaX<=602)
        {
            
            jugador1++;
            lbl1.setText(String.valueOf(jugador1));
            pelotaX=290;
            pelotaY=200; 
            signo*=-1;
            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("inicio.wav"));
            sonido.play();
            
        }
        if (pelotaX<=0 && pelotaX>=-2)
        {
            jugador2++;
            lbl2.setText(String.valueOf(jugador2));
            pelotaX=290;
            pelotaY=200;
            signo*=-1;
            AudioClip sonido;
            sonido = java.applet.Applet.newAudioClip(getClass().getResource("inicio.wav"));
            sonido.play();
                               
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

        lbl1 = new javax.swing.JLabel();
        lbl2 = new javax.swing.JLabel();
        lblj1 = new javax.swing.JLabel();
        lblj2 = new javax.swing.JLabel();
        btnfacil = new javax.swing.JButton();
        btnmedio = new javax.swing.JButton();
        btndificil = new javax.swing.JButton();
        btnjugar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(0, 0, 0));
        setPreferredSize(new java.awt.Dimension(600, 550));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        lbl1.setForeground(new java.awt.Color(255, 255, 255));

        lbl2.setForeground(new java.awt.Color(255, 255, 255));

        lblj1.setForeground(new java.awt.Color(255, 255, 255));
        lblj1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblj1.setText("Jugador 1");

        lblj2.setForeground(new java.awt.Color(255, 255, 255));
        lblj2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblj2.setText("Jugador 2");

        btnfacil.setBackground(new java.awt.Color(51, 255, 0));
        btnfacil.setText("Fácil");
        btnfacil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnfacilActionPerformed(evt);
            }
        });

        btnmedio.setBackground(new java.awt.Color(255, 153, 0));
        btnmedio.setText("Medio");
        btnmedio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnmedioActionPerformed(evt);
            }
        });

        btndificil.setBackground(new java.awt.Color(255, 0, 51));
        btndificil.setText("Difícil");
        btndificil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btndificilActionPerformed(evt);
            }
        });

        btnjugar.setText("Jugar");
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
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblj1)
                    .addComponent(btndificil, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnfacil, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnmedio, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(95, 95, 95)
                        .addComponent(lbl1, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 156, Short.MAX_VALUE)
                        .addComponent(lbl2, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(37, 37, 37)
                        .addComponent(lblj2, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(56, 56, 56))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(209, 209, 209)
                        .addComponent(btnjugar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(lblj2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lblj1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(lbl1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                    .addComponent(lbl2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 291, Short.MAX_VALUE)
                .addComponent(btnfacil)
                .addGap(18, 18, 18)
                .addComponent(btnmedio)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btndificil)
                    .addComponent(btnjugar))
                .addGap(28, 28, 28))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        btnjugar.setEnabled(false);
        JOptionPane.showMessageDialog(null, "Bienvenido al juego Pong \nPara iniciar el juego primero debe ingresar el nombre \nde los jugadores y despues seleccionar la dificultad \nPara comenzar presiona el botón Jugar \nJugador 1 usa 'a' y 'z', Jugador 2 usa las flechas \nDiviertanse");
        
        String j1 = JOptionPane.showInputDialog("Ingrese el nombre del jugador 1");
        lblj1.setText(j1);
        
        String j2 = JOptionPane.showInputDialog("Ingrese el nombre del jugador 2");
        lblj2.setText(j2);
        
        
        
        lbl1.setText(String.valueOf(jugador1));
        lbl2.setText(String.valueOf(jugador2));
        
        
        
        
        
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowActivated

    private void btnfacilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnfacilActionPerformed
        // TODO add your handling code here:
        velpaleta=20;
        rapibola = 2;
        
        int input = JOptionPane.showConfirmDialog(null, "Seguro que desea jugar en esta dificultad? ");
        if (input==JOptionPane.YES_OPTION)
        {
            btnjugar.setEnabled(true);
            btnmedio.setEnabled(false);
            btndificil.setEnabled(false);
        }
        
        
    }//GEN-LAST:event_btnfacilActionPerformed

    private void btnjugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjugarActionPerformed
        // TODO add your handling code here:
        
        temporizador.start();
        
    }//GEN-LAST:event_btnjugarActionPerformed

    private void btnmedioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnmedioActionPerformed
        // TODO add your handling code here:
        velpaleta=40;
        rapibola = 3;
        
        int input = JOptionPane.showConfirmDialog(null, "Seguro que desea jugar en esta dificultad? ");
        if (input==JOptionPane.YES_OPTION)
        {
            btnjugar.setEnabled(true);
            btnfacil.setEnabled(false);
            btndificil.setEnabled(false);
        }
        
        
    }//GEN-LAST:event_btnmedioActionPerformed

    private void btndificilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btndificilActionPerformed
        // TODO add your handling code here:
        velpaleta=60;
        rapibola = 5;
        
        int input = JOptionPane.showConfirmDialog(null, "Seguro que desea jugar en esta dificultad? ");
        if (input==JOptionPane.YES_OPTION)
        {
            btnjugar.setEnabled(true);
            btnmedio.setEnabled(false);
            btnfacil.setEnabled(false);
        }
        
        
        
    }//GEN-LAST:event_btndificilActionPerformed

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
            java.util.logging.Logger.getLogger(Frmpong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmpong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmpong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmpong.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmpong().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btndificil;
    private javax.swing.JButton btnfacil;
    private javax.swing.JButton btnjugar;
    private javax.swing.JButton btnmedio;
    private javax.swing.JLabel lbl1;
    private javax.swing.JLabel lbl2;
    private javax.swing.JLabel lblj1;
    private javax.swing.JLabel lblj2;
    // End of variables declaration//GEN-END:variables
}
