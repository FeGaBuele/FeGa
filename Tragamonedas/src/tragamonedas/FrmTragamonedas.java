package tragamonedas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author FeGa
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.Timer;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class FrmTragamonedas extends javax.swing.JFrame {
    
    int aleatorio1, aleatorio2, aleatorio3;
    int para1=0;
    int para2=0;
    int para3=0;
    int div1;
    int div2;
    int div3;
    int comodin=6;
    int p;
    int r1;
    int p2;

    /**
     * Creates new form FrmTragamonedas
     */
    
     Timer temporizador = new Timer(1, new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            //aleatorio1= (int)(Math.random()*10+1);
            //aleatorio2= (int)(Math.random()*10+1);
            //aleatorio3= (int)(Math.random()*10+1);
            para1++;
            
            
            div1=para1%250;
            
            div2=para1%150;
            
            div3=para1%50;
            
            
            if ((div1==0)&&(para1<=1300))
            {
                aleatorio1= (int)(Math.random()*10+1);
                
                switch (aleatorio1)
                {
                    case 1: lblfig1.setIcon(new ImageIcon(this.getClass().getResource("brillo.png")));
                        break;

                    case 2: lblfig1.setIcon(new ImageIcon(this.getClass().getResource("campana.png")));
                        break;

                    case 3: lblfig1.setIcon(new ImageIcon(this.getClass().getResource("corazon.png")));
                        break;

                    case 4: lblfig1.setIcon(new ImageIcon(this.getClass().getResource("corazonnegro.png")));
                        break;

                    case 5: lblfig1.setIcon(new ImageIcon(this.getClass().getResource("corona.png")));
                        break;

                    case 6: lblfig1.setIcon(new ImageIcon(this.getClass().getResource("dinero.png")));
                        break;

                    case 7: lblfig1.setIcon(new ImageIcon(this.getClass().getResource("estrella.png")));
                        break;

                    case 8: lblfig1.setIcon(new ImageIcon(this.getClass().getResource("limon.png")));
                        break;

                    case 9: lblfig1.setIcon(new ImageIcon(this.getClass().getResource("naranja.png")));
                        break;

                    case 10: lblfig1.setIcon(new ImageIcon(this.getClass().getResource("trebol.png")));
                        break;

                } 
                
            }
            
            if ((div2==0)&& (para1<=900))
            {
                aleatorio2= (int)(Math.random()*10+1);
                switch (aleatorio2)
                {
                    case 1: lblfig2.setIcon(new ImageIcon(this.getClass().getResource("brillo.png")));
                        break;

                    case 2: lblfig2.setIcon(new ImageIcon(this.getClass().getResource("campana.png")));
                        break;

                    case 3: lblfig2.setIcon(new ImageIcon(this.getClass().getResource("corazon.png")));
                        break;

                    case 4: lblfig2.setIcon(new ImageIcon(this.getClass().getResource("corazonnegro.png")));
                        break;

                    case 5: lblfig2.setIcon(new ImageIcon(this.getClass().getResource("corona.png")));
                        break;

                    case 6: lblfig2.setIcon(new ImageIcon(this.getClass().getResource("dinero.png")));
                        break;

                    case 7: lblfig2.setIcon(new ImageIcon(this.getClass().getResource("estrella.png")));
                        break;

                    case 8: lblfig2.setIcon(new ImageIcon(this.getClass().getResource("limon.png")));
                        break;

                    case 9: lblfig2.setIcon(new ImageIcon(this.getClass().getResource("naranja.png")));
                        break;

                    case 10: lblfig2.setIcon(new ImageIcon(this.getClass().getResource("trebol.png")));
                        break;

                }
                 
                
            }
            
            if ((div3==0)&&(para1<=400))
            {
                aleatorio3= (int)(Math.random()*10+1);
                switch (aleatorio3)
                {
                    case 1: lblfig3.setIcon(new ImageIcon(this.getClass().getResource("brillo.png")));
                        break;

                    case 2: lblfig3.setIcon(new ImageIcon(this.getClass().getResource("campana.png")));
                        break;

                    case 3: lblfig3.setIcon(new ImageIcon(this.getClass().getResource("corazon.png")));
                        break;

                    case 4: lblfig3.setIcon(new ImageIcon(this.getClass().getResource("corazonnegro.png")));
                        break;

                    case 5: lblfig3.setIcon(new ImageIcon(this.getClass().getResource("corona.png")));
                        break;

                    case 6: lblfig3.setIcon(new ImageIcon(this.getClass().getResource("dinero.png")));
                        break;

                    case 7: lblfig3.setIcon(new ImageIcon(this.getClass().getResource("estrella.png")));
                        break;

                    case 8: lblfig3.setIcon(new ImageIcon(this.getClass().getResource("limon.png")));
                        break;

                    case 9: lblfig3.setIcon(new ImageIcon(this.getClass().getResource("naranja.png")));
                        break;

                    case 10: lblfig3.setIcon(new ImageIcon(this.getClass().getResource("trebol.png")));
                        break;

                }
                 
                
            }
            
            if (para1 == 1300)
            {
                
                if ((aleatorio1==6) && (aleatorio2==6) && (aleatorio3==6))
                {
                    p=Integer.parseInt((String) cbxapuesta.getSelectedItem());
                    p2=Integer.valueOf(txtsaldo.getText());
                    r1=(3*p)+p2;
                    
                    txtsaldo.setText(String.valueOf(r1));
                    
                    JOptionPane.showMessageDialog(null, "Ganaste el triple de lo que apostaste. Revisa tu nuevo saldo ");
                }
                
                else if ((aleatorio1==aleatorio2) && (aleatorio2==aleatorio3)) //((aleatorio1 == aleatorio2) && (aleatorio2 == aleatorio3) && (aleatorio1 == aleatorio3))
                {
                    p=Integer.parseInt((String) cbxapuesta.getSelectedItem());
                    p2=Integer.valueOf(txtsaldo.getText());
                    r1=(2*p)+p2;
                    
                    txtsaldo.setText(String.valueOf(r1));
                    
                    JOptionPane.showMessageDialog(null, "Ganaste el doble de lo que apostaste. Revisa tu nuevo saldo ");
                }
                
                else if (((aleatorio1==6) && (aleatorio2==aleatorio3)) || ((aleatorio2==6) && (aleatorio1==aleatorio3)) || ((aleatorio3==6) && (aleatorio1==aleatorio2)))
                {
                    p=Integer.parseInt((String) cbxapuesta.getSelectedItem());
                    p2=Integer.valueOf(txtsaldo.getText());
                    r1=p+p2;
                    
                    txtsaldo.setText(String.valueOf(r1));
                    
                    JOptionPane.showMessageDialog(null, "Ganaste lo que apostaste. Revisa tu nuevo saldo ");
                    
                }
                
                
                else
                {
                    p=Integer.parseInt((String) cbxapuesta.getSelectedItem());
                    p2=Integer.valueOf(txtsaldo.getText());
                    r1=p2-p;
                    
                    txtsaldo.setText(String.valueOf(r1));
                    
                    JOptionPane.showMessageDialog(null, "Perdiste");    
                    
                }
                
                
            }

            
        }
    });
     
    public FrmTragamonedas() {
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

        btnjugar = new javax.swing.JButton();
        lblfig1 = new javax.swing.JLabel();
        lblfig2 = new javax.swing.JLabel();
        lblfig3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtsaldo = new javax.swing.JTextField();
        cbxapuesta = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnjugar.setText("Jugar");
        btnjugar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnjugarActionPerformed(evt);
            }
        });

        jLabel4.setText("Apuesta");

        jLabel5.setText("Saldo");

        txtsaldo.setText("100");

        cbxapuesta.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "5", "10", "20", "50", "100" }));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(lblfig1, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addComponent(lblfig2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28)
                        .addComponent(lblfig3, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(73, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnjugar)
                        .addGap(130, 130, 130))))
            .addGroup(layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4))
                .addGap(51, 51, 51)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxapuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblfig1, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfig3, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblfig2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cbxapuesta, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtsaldo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addComponent(btnjugar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnjugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjugarActionPerformed
        temporizador.start();
        if (para1>1300)
        {
            para1=0;
        }
        
        //casos
        
        
        
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
            java.util.logging.Logger.getLogger(FrmTragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmTragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmTragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmTragamonedas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmTragamonedas().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnjugar;
    private javax.swing.JComboBox<String> cbxapuesta;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblfig1;
    private javax.swing.JLabel lblfig2;
    private javax.swing.JLabel lblfig3;
    private javax.swing.JTextField txtsaldo;
    // End of variables declaration//GEN-END:variables
}
