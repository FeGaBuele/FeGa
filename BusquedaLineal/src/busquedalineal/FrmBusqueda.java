/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package busquedalineal;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;

/**
 *
 * @author FeGa
 */
public class FrmBusqueda extends javax.swing.JFrame {

    /**
     * Creates new form FrmBusqueda
     */
    
    DefaultListModel modelo = new DefaultListModel();
    int iteracion = 0;
    int elementos = -1;
    int salir=0;
    
    /////
    int mitad;
    int menor = 0;
    
    //
    int [] vecdatos=new int[10];
    //int [] vec;
    int pos=0;
    int minimo;
    int aux;
    
    int aux2;
    int pos2;
    
    public FrmBusqueda() {
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

        btnAgregar = new javax.swing.JButton();
        btnBusquedalineal = new javax.swing.JButton();
        txtBusqueda = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        lstNumeros = new javax.swing.JList<>();
        txtNumero = new javax.swing.JTextField();
        btnBusquedabinaria = new javax.swing.JButton();
        btnseleccion = new javax.swing.JButton();
        btnInsercion = new javax.swing.JButton();
        btnCombinacion = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnAgregar.setText("Agregar");
        btnAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgregarActionPerformed(evt);
            }
        });

        btnBusquedalineal.setText("Busqueda Lineal");
        btnBusquedalineal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedalinealActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(lstNumeros);

        btnBusquedabinaria.setText("Busqueda Binaria");
        btnBusquedabinaria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBusquedabinariaActionPerformed(evt);
            }
        });

        btnseleccion.setText("Ordenamiento por selección");
        btnseleccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnseleccionActionPerformed(evt);
            }
        });

        btnInsercion.setText("Ordenamiento por Inserción");
        btnInsercion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnInsercionActionPerformed(evt);
            }
        });

        btnCombinacion.setText("Ordenamiento por Combinación");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 235, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnBusquedalineal)
                            .addComponent(btnBusquedabinaria)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(btnInsercion)
                                    .addComponent(btnseleccion)
                                    .addComponent(btnCombinacion)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(56, 56, 56)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnAgregar))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGap(190, 190, 190))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(txtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(30, 30, 30)
                        .addComponent(btnAgregar)
                        .addGap(31, 31, 31)
                        .addComponent(btnseleccion)
                        .addGap(18, 18, 18)
                        .addComponent(btnInsercion)
                        .addGap(18, 18, 18)
                        .addComponent(btnCombinacion))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBusquedalineal)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addComponent(btnBusquedabinaria)
                .addGap(105, 105, 105))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgregarActionPerformed
        // TODO add your handling code here:
        modelo.addElement(txtNumero.getText());
        lstNumeros.setModel(modelo);
        
        txtNumero.setText("");
        
        elementos++;
        
    }//GEN-LAST:event_btnAgregarActionPerformed

    private void btnBusquedalinealActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedalinealActionPerformed
        // TODO add your handling code here:
        
        while ((iteracion < elementos) && salir==0)
        {
            lstNumeros.setSelectedIndex(iteracion); // le estamos colocando en el priemr elemento
            
            if (lstNumeros.getSelectedValue().toString().equals(txtBusqueda.getText()))
            {
               JOptionPane.showMessageDialog(null, iteracion);
               salir=1;
            }
            
            /*if (lstNumeros.getSelectedValue()==txtBusqueda.getText())
            {
               JOptionPane.showMessageDialog(null, iteracion);
            }*/
            
            iteracion++;
        }
    }//GEN-LAST:event_btnBusquedalinealActionPerformed

    private void btnBusquedabinariaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBusquedabinariaActionPerformed
        // TODO add your handling code here:
        
       //mitad= (elementos-menor)/2;
       
       while ((iteracion < elementos) && salir==0)
        {
            
  
            mitad= (elementos+menor)/2;
            lstNumeros.setSelectedIndex(mitad); // le estamos colocando en el priemr elemento
            System.out.printf("Elemntos: %d \n", elementos);
            System.out.printf("Menor: %d \n", menor);
            System.out.printf("Mitad: %d \n", mitad);
            System.out.printf("valor selecionado: %s \n", lstNumeros.getSelectedValue());
            System.out.printf("valor buscado: %s \n", txtBusqueda.getText());
            if (lstNumeros.getSelectedValue().toString().equals(txtBusqueda.getText()))
            {
               JOptionPane.showMessageDialog(null, iteracion);
               salir=1;
            }
            
            else if (Integer.valueOf(txtBusqueda.getText()) > Integer.valueOf(lstNumeros.getSelectedValue()))
            {
                menor=mitad+1;
                iteracion++;
            }
            else /*if (Integer.valueOf(lstNumeros.getSelectedValue())< Integer.valueOf(txtBusqueda.getText()))*/
            {
                elementos=mitad-1;
                iteracion++;
            }
            
            
            /*System.out.printf("Elemntos: %d \n", elementos);
            System.out.printf("Mitad: %d \n", mitad);
            System.out.printf("valor selecionado: %s \n", lstNumeros.getSelectedValue());*/
            
            
            /*if (lstNumeros.getSelectedValue()==txtBusqueda.getText())
            {
               JOptionPane.showMessageDialog(null, iteracion);
            }*/
            
            //iteracion++;
        }
       
       lstNumeros.setSelectedIndex(0);
       
       if (lstNumeros.getSelectedValue().toString().equals(txtBusqueda.getText()))
            {
               JOptionPane.showMessageDialog(null, iteracion);
               salir=1;
            }
       
       lstNumeros.setSelectedIndex(1);
       
       if (lstNumeros.getSelectedValue().toString().equals(txtBusqueda.getText()))
            {
               JOptionPane.showMessageDialog(null, iteracion);
               salir=1;
            }
            
        
                
        
        
        
    }//GEN-LAST:event_btnBusquedabinariaActionPerformed

    private void btnseleccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnseleccionActionPerformed
        // TODO add your handling code here:
        int [] vec=new int[elementos+1];
        
        for (int i=0; i<elementos+1 ; i++)
        {
            lstNumeros.setSelectedIndex(iteracion);
            vec[i]= Integer.valueOf(lstNumeros.getSelectedValue());
            iteracion++;
            //JOptionPane.showMessageDialog(null, vec[i]);
        }
        
        iteracion=0;
                
        for (int i=0; i<vec.length ; i++)
        {
           
           minimo=vec[i];
           pos=i;
           
           for (int j=i+1 ; j<vec.length ; j++)
           {
               if(vec[j]<minimo)
               {
                   minimo=vec[j];
                   pos=j;   
               }
                              
           }
           
           if (pos!=i)
           {
               aux = vec[i];
               vec[i]=vec[pos];
               vec[pos]=aux;
               iteracion++;
               
           }           
           System.out.print(vec[i]);
           
           
        }
        
        JOptionPane.showMessageDialog(null, iteracion);
        //System.out.print(minimo);
    }//GEN-LAST:event_btnseleccionActionPerformed

    private void btnInsercionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnInsercionActionPerformed
        // TODO add your handling code here:
        
        int [] vec2=new int[elementos+1];
        for (int i=0; i<elementos+1 ; i++)
        {
            lstNumeros.setSelectedIndex(iteracion);
            vec2[i]= Integer.valueOf(lstNumeros.getSelectedValue());
            iteracion++;
            //JOptionPane.showMessageDialog(null, vec[i]);
        }
        
        iteracion = 0;
        int contador = 1;
        int change=0;
        
        for (int i = contador ; i<vec2.length ; i++)
        {
            if (vec2[pos2]>vec2[i])
            {
                change=1;
                iteracion++;
            }
            
            if (change==1)
            {
                aux2=vec2[pos2];
                vec2[pos2]=vec2[i];
                vec2[i]=aux2;
            }
            
            for (int j=pos2 ; j>=1 ; j--)
            {
                if(vec2[j]<vec2[j-1])
                {
                    aux2=vec2[j-1];
                    vec2[j-1]=vec2[j];
                    vec2[j]=aux2;
                }
            }
            
            change =0;
            pos2++;
        }
        
//        for (int i=1 ; i<vec2.length ; i++ )
//        {
//            pos2=vec2[i];
//                        
//            for (int j=i-1 ; j>=0 ; j--)
//            {
//                if (vec2[j]>pos2)
//                {
//                    vec2[j+1]=vec2[j];
//                    vec2[j]=pos2;
//                    
//                }
//                
//            }
// 
//        }


//        for(int i=1 ; i<vec2.length ; i++)
//        {
//            aux2=vec2[i];
//            pos2= i;
//            
//            while (pos2>0 && vec2[pos2-1]>aux2)
//            {
//                vec2[pos2]=vec2[pos2-1];
//                pos2=pos2-1;
//            }
//            vec2[pos2]=aux2;
//        }


//        for (int i=1; i<vec2.length ; i++)
//        {
//            aux2=vec2[i];
//            pos2=i;
//            
//            while (pos2>0 && vec2[pos2-1]>aux2)
//            {
//                vec2[pos2] = vec2[pos2-1];
//                pos2--;
//                        
//            }
//            
//        }

        for (int i=0 ; i<vec2.length ; i++ )
        {
            System.out.println(vec2[i]);
        }
        
        JOptionPane.showMessageDialog(null, iteracion);
        
        
        
    }//GEN-LAST:event_btnInsercionActionPerformed

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
            java.util.logging.Logger.getLogger(FrmBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmBusqueda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmBusqueda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgregar;
    private javax.swing.JButton btnBusquedabinaria;
    private javax.swing.JButton btnBusquedalineal;
    private javax.swing.JButton btnCombinacion;
    private javax.swing.JButton btnInsercion;
    private javax.swing.JButton btnseleccion;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> lstNumeros;
    private javax.swing.JTextField txtBusqueda;
    private javax.swing.JTextField txtNumero;
    // End of variables declaration//GEN-END:variables
}
