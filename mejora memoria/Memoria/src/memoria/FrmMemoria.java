package memoria;

import java.applet.AudioClip;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
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
public class FrmMemoria extends javax.swing.JFrame {

    /*int [] numeros = new int[16];
    
    int aleatorio=(int)(Math.random()*8);
    
    int posicion=0;
    int contador=0;
    int contador2=0;*/
    ///////////////////////////////
    
    int numeros[]=new int [16];
    int posicion=0;
    int posicion2=0;
    int contador=1;
    int condicion;
    int aleatorio;
    int click=0;
    int anterior;
    int anterior2;
    int pos1;
    int pos2;
    int intentos=0;
    int aciertos=0;
    
    int contador2=0;
    int cont2=1;
    int cont3 =1;
    
     Timer temporizador = new Timer(100, new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            //aqui va el codigo qeu se va a ejecutar            
            contador2+=1;
            
            
            
            
            if (contador2 == 10)
            {
                contador2=0;
                if (cont2>=9)
                {
                    lblsegundos.setText(String.valueOf(cont2));
                }
                else
                {
                    lblsegundos.setText("0"+String.valueOf(cont2));
                }
                
                
                cont2++;
                
                
                
                
            }
            
            if (cont2 == 61)
            {
                lblminutos.setText(String.valueOf(cont3));
                cont3++;
                cont2=0;
                
            }
            
            lbldecimas.setText(String.valueOf(contador2));
            
        }
            
    });
    
    
    
    public FrmMemoria()  //este es el constructor
    {
        initComponents();
        
        this.setLocationRelativeTo(null);
        this.getContentPane().setBackground(Color.BLACK);
        
        /*for (posicion=0;posicion<=15;posicion++)
        {
            numeros[posicion]=0;
        }
        
        numeros[0]=(int)(Math.random()*8);
        
        while (posicion<16)
        {
            
            aleatorio=(int)(Math.random()*8);
            
            
            for (contador=0 ; contador<=posicion ; contador++)
            {
                if (numeros[contador] == numeros[posicion])
                {
                    contador2++;
                }
            }
            
            if (contador2<=2)
            {
                numeros[posicion]=aleatorio;
                posicion++;
                
            }
            contador2=0;
            
        }
        
         for (posicion=0;posicion<=15;posicion++)
         {
             System.out.print(numeros[posicion]);
         }*/
        
        ////////////////////////////////////////////////////////////////////
        
        /*for (x=0;x<=15;x++)
        {
            vec[x]=(int)(Math.random()*8);
        }
        
        //vec[2]=(int)(Math.random()*8);
        
        while (x<16)
        {
            aleatorio=(int)(Math.random()*8);
            
            for (cont=0;cont<=x;cont++)
            {
                if (vec[x]==vec[cont])
                {
                    cont2++;
                    
                }    
            }
            
            if (cont2<2)
            {
                vec[x]=aleatorio;
                x++;
            }
            cont2=0;
            
        }
        
        
        
        for (x=0;x<=15;x++)
        {
            System.out.print(vec[x]);
        }*/
        
        while (posicion <= 15)
        {
            
            condicion=0;
            posicion2=0;
            aleatorio=(int)(Math.random()*8);  
            
            while(posicion>posicion2)
            {
                if(aleatorio==numeros[posicion2])
                {
                    condicion++;
                }  
                posicion2++;
            }
            
            if(condicion<2)
            {
                System.out.print("aleatorio: "+aleatorio+"\n");
                numeros[posicion2]=aleatorio;
                posicion++;
            }
        }
        
        
        
    }
    
    
    public void Bloquear()
    {
        switch (pos1)
                {
                    case 0: btn1.setEnabled(false);
                        break;
                    case 1: btn2.setEnabled(false);
                        break;
                    case 2: btn3.setEnabled(false);
                        break;
                    case 3: btn4.setEnabled(false);
                        break;
                    case 4: btn5.setEnabled(false);
                        break;
                    case 5: btn6.setEnabled(false);
                        break;
                    case 6: btn7.setEnabled(false);
                        break;
                    case 7: btn8.setEnabled(false);
                        break;
                    case 8: btn9.setEnabled(false);
                        break;
                    case 9: btn10.setEnabled(false);
                        break;
                    case 10: btn11.setEnabled(false);
                        break;
                    case 11: btn12.setEnabled(false);
                        break;
                    case 12: btn13.setEnabled(false);
                        break;
                    case 13: btn14.setEnabled(false);
                        break;
                    case 14: btn15.setEnabled(false);
                        break;
                    case 15: btn16.setEnabled(false);
                        break;     
                }
                
                switch (pos2)
                {
                    case 0: btn1.setEnabled(false);                    
                        break;
                    case 1: btn2.setEnabled(false);
                        break;
                    case 2: btn3.setEnabled(false);
                        break;
                    case 3: btn4.setEnabled(false);
                        break;
                    case 4: btn5.setEnabled(false);
                        break;
                    case 5: btn6.setEnabled(false);
                        break;
                    case 6: btn7.setEnabled(false);
                        break;
                    case 7: btn8.setEnabled(false);
                        break;
                    case 8: btn9.setEnabled(false);
                        break;
                    case 9: btn10.setEnabled(false);
                        break;
                    case 10: btn11.setEnabled(false);
                        break;
                    case 11: btn12.setEnabled(false);
                        break;
                    case 12: btn13.setEnabled(false);
                        break;
                    case 13: btn14.setEnabled(false);
                        break;
                    case 14: btn15.setEnabled(false);
                        break;
                    case 15: btn16.setEnabled(false);
                        break;     
                }
                aciertos++;
                intentos++;
                lblintentos.setText(String.valueOf(intentos));
                lblaciertos.setText(String.valueOf(aciertos));
                AudioClip sonido2;
                sonido2= java.applet.Applet.newAudioClip(getClass().getResource("inicio.wav"));
                sonido2.play();
    }
    
    public void Tapar()
    {
       switch (pos1)
                {
                    case 0: btn1.setText("");                            
                        break;
                    case 1: btn2.setText("");
                        break;
                    case 2: btn3.setText("");
                        break;
                    case 3: btn4.setText("");
                        break;
                    case 4: btn5.setText("");
                        break;
                    case 5: btn6.setText("");
                        break;
                    case 6: btn7.setText("");
                        break;
                    case 7: btn8.setText("");
                        break;
                    case 8: btn9.setText("");
                        break;
                    case 9: btn10.setText("");
                        break;
                    case 10: btn11.setText("");
                        break;
                    case 11: btn12.setText("");
                        break;
                    case 12: btn13.setText("");
                        break;
                    case 13: btn14.setText("");
                        break;
                    case 14: btn15.setText("");
                        break;
                    case 15: btn16.setText("");
                        break;     
                }
                
                switch (pos2)
                {
                    case 0: btn1.setText("");
                        break;
                    case 1: btn2.setText("");
                        break;
                    case 2: btn3.setText("");
                        break;
                    case 3: btn4.setText("");
                        break;
                    case 4: btn5.setText("");
                        break;
                    case 5: btn6.setText("");
                        break;
                    case 6: btn7.setText("");
                        break;
                    case 7: btn8.setText("");
                        break;
                    case 8: btn9.setText("");
                        break;
                    case 9: btn10.setText("");
                        break;
                    case 10: btn11.setText("");
                        break;
                    case 11: btn12.setText("");
                        break;
                    case 12: btn13.setText("");
                        break;
                    case 13: btn14.setText("");
                        break;
                    case 14: btn15.setText("");
                        break;
                    case 15: btn16.setText("");
                        break;     
                } 
                intentos++;
                lblintentos.setText(String.valueOf(intentos));
    }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btn1 = new javax.swing.JButton();
        btn5 = new javax.swing.JButton();
        btn6 = new javax.swing.JButton();
        btn7 = new javax.swing.JButton();
        btn8 = new javax.swing.JButton();
        btn9 = new javax.swing.JButton();
        btn10 = new javax.swing.JButton();
        btn11 = new javax.swing.JButton();
        btn12 = new javax.swing.JButton();
        btn13 = new javax.swing.JButton();
        btn14 = new javax.swing.JButton();
        btn15 = new javax.swing.JButton();
        btn16 = new javax.swing.JButton();
        btnreset = new javax.swing.JButton();
        btn2 = new javax.swing.JButton();
        btn3 = new javax.swing.JButton();
        btn4 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblnombre = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        lblintentos = new javax.swing.JLabel();
        lblaciertos = new javax.swing.JLabel();
        lbldecimas = new javax.swing.JLabel();
        lblsegundos = new javax.swing.JLabel();
        lblminutos = new javax.swing.JLabel();
        btnjugar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        btn1.setPreferredSize(new java.awt.Dimension(70, 70));
        btn1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn1ActionPerformed(evt);
            }
        });

        btn5.setPreferredSize(new java.awt.Dimension(70, 70));
        btn5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn5ActionPerformed(evt);
            }
        });

        btn6.setPreferredSize(new java.awt.Dimension(70, 70));
        btn6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn6ActionPerformed(evt);
            }
        });

        btn7.setPreferredSize(new java.awt.Dimension(70, 70));
        btn7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn7ActionPerformed(evt);
            }
        });

        btn8.setPreferredSize(new java.awt.Dimension(70, 70));
        btn8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn8ActionPerformed(evt);
            }
        });

        btn9.setPreferredSize(new java.awt.Dimension(70, 70));
        btn9.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn9ActionPerformed(evt);
            }
        });

        btn10.setPreferredSize(new java.awt.Dimension(70, 70));
        btn10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn10ActionPerformed(evt);
            }
        });

        btn11.setPreferredSize(new java.awt.Dimension(70, 70));
        btn11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn11ActionPerformed(evt);
            }
        });

        btn12.setPreferredSize(new java.awt.Dimension(70, 70));
        btn12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn12ActionPerformed(evt);
            }
        });

        btn13.setPreferredSize(new java.awt.Dimension(70, 70));
        btn13.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn13ActionPerformed(evt);
            }
        });

        btn14.setPreferredSize(new java.awt.Dimension(70, 70));
        btn14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn14ActionPerformed(evt);
            }
        });

        btn15.setPreferredSize(new java.awt.Dimension(70, 70));
        btn15.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn15ActionPerformed(evt);
            }
        });

        btn16.setPreferredSize(new java.awt.Dimension(70, 70));
        btn16.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn16ActionPerformed(evt);
            }
        });

        btnreset.setBackground(new java.awt.Color(255, 0, 0));
        btnreset.setText("Reset");
        btnreset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnresetActionPerformed(evt);
            }
        });

        btn2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn2ActionPerformed(evt);
            }
        });

        btn3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn3ActionPerformed(evt);
            }
        });

        btn4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn4ActionPerformed(evt);
            }
        });

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Nombre del jugador");

        lblnombre.setForeground(new java.awt.Color(255, 102, 0));
        lblnombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Intentos");

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Aciertos");

        lblintentos.setForeground(new java.awt.Color(255, 153, 0));
        lblintentos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lblaciertos.setForeground(new java.awt.Color(255, 153, 0));
        lblaciertos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        lbldecimas.setBackground(new java.awt.Color(0, 0, 0));
        lbldecimas.setForeground(new java.awt.Color(255, 255, 255));
        lbldecimas.setText("0");

        lblsegundos.setBackground(new java.awt.Color(0, 0, 0));
        lblsegundos.setForeground(new java.awt.Color(255, 255, 255));
        lblsegundos.setText("00");

        lblminutos.setBackground(new java.awt.Color(0, 0, 0));
        lblminutos.setForeground(new java.awt.Color(255, 255, 255));
        lblminutos.setText("0");

        btnjugar.setBackground(new java.awt.Color(102, 255, 0));
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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btn1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(31, 31, 31)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btn7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addComponent(btnjugar))
                .addGap(33, 33, 33)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btn16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(btnreset, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(lblminutos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblsegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lbldecimas, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14)))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblaciertos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(lblintentos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(btn1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblnombre, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(128, 128, 128)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblintentos, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblaciertos, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(59, 59, 59)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btn9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btn12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblminutos, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(lbldecimas, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblsegundos, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 53, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnreset)
                    .addComponent(btnjugar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btn1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn1ActionPerformed
        // TODO add your handling code here:
        click++;
        btn1.setText(String.valueOf(numeros[0]));
             
                
        if (click==1)
        {
            anterior=numeros[0];
            pos1=0;
        }
        else if (click==2)
        {
            anterior2=numeros[0];
            pos2=0;
            
        }
        
        else if (click==3)
        {
            if (anterior==anterior2)
            {
                //btn1.setText("");
                //btn1.setEnabled(false);
                
                Bloquear();
                click=1;
                anterior=numeros[0];
                pos1=0;
                
                
            }
            else 
            {
                Tapar();
                click=1;
                anterior=numeros[0];
                pos1=0;
            }
        }
        
    }//GEN-LAST:event_btn1ActionPerformed

    private void btn2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn2ActionPerformed
        // TODO add your handling code here:
        click++;
        btn2.setText(String.valueOf(numeros[1]));
             
                
        if (click==1)
        {
            anterior=numeros[1];
            pos1=1;
        }
        else if (click==2)
        {
            anterior2=numeros[1];
            pos2=1;
        }
        
        else if (click==3)
        {
            if (anterior==anterior2)
            {
                //btn1.setText("");
                //btn1.setEnabled(false);
                
                Bloquear();
                click=1;
                anterior=numeros[1];
                pos1=1;
                
                
                
            }
            else 
            {
                Tapar();
                click=1;
                anterior=numeros[1];
                pos1=1;
            }
        }
    }//GEN-LAST:event_btn2ActionPerformed

    private void btn3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn3ActionPerformed
        // TODO add your handling code here:
        click++;
        btn3.setText(String.valueOf(numeros[2]));
             
                
        if (click==1)
        {
            anterior=numeros[2];
            pos1=2;
        }
        else if (click==2)
        {
            anterior2=numeros[2];
            pos2=2;
        }
        
        else if (click==3)
        {
            if (anterior==anterior2)
            {
                //btn1.setText("");
                //btn1.setEnabled(false);
                
                Bloquear();
                click=1;
                anterior=numeros[2];
                pos1=2;
                
                
            }
            else 
            {
                Tapar();
                click=1;
                anterior=numeros[2];
                pos1=2;
            }
        }
    }//GEN-LAST:event_btn3ActionPerformed

    private void btn4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn4ActionPerformed
        // TODO add your handling code here:
        click++;
        btn4.setText(String.valueOf(numeros[3]));
             
                
        if (click==1)
        {
            anterior=numeros[3];
            pos1=3;
        }
        else if (click==2)
        {
            anterior2=numeros[3];
            pos2=3;
        }
        
        else if (click==3)
        {
            if (anterior==anterior2)
            {
                
                //btn1.setEnabled(false);
                
                Bloquear();
                
                click=1;
                anterior=numeros[3];
                pos1=3;
                
            }
            else 
            {
                Tapar();
                click=1;
                anterior=numeros[3];
                pos1=3;
            }
        }
    }//GEN-LAST:event_btn4ActionPerformed

    private void btn5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn5ActionPerformed
        // TODO add your handling code here:
        click++;
        btn5.setText(String.valueOf(numeros[4]));
             
                
        if (click==1)
        {
            anterior=numeros[4];
            pos1=4;
        }
        else if (click==2)
        {
            anterior2=numeros[4];
            pos2=4;
        }
        
        else if (click==3)
        {
            if (anterior==anterior2)
            {
                //btn1.setText("");
                //btn1.setEnabled(false);
                
                Bloquear();
                click=1;
                anterior=numeros[4];
                pos1=4;
                
                
                
            }
            else 
            {
                Tapar();
                click=1;
                anterior=numeros[4];
                pos1=4;
            }
        }
    }//GEN-LAST:event_btn5ActionPerformed

    private void btn6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn6ActionPerformed
        // TODO add your handling code here:
        click++;
        btn6.setText(String.valueOf(numeros[5]));
             
                
        if (click==1)
        {
            anterior=numeros[5];
            pos1=5;
        }
        else if (click==2)
        {
            anterior2=numeros[5];
            pos2=5;
        }
        
        else if (click==3)
        {
            if (anterior==anterior2)
            {
                //btn1.setText("");
                //btn1.setEnabled(false);
                
                Bloquear();
                click=1;
                anterior=numeros[5];
                pos1=5;
                          
            }
            else 
            {
                Tapar();
                click=1;
                anterior=numeros[5];
                pos1=5;
                
                
            }
        }
    }//GEN-LAST:event_btn6ActionPerformed

    private void btn7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn7ActionPerformed
        // TODO add your handling code here:
        click++;
        btn7.setText(String.valueOf(numeros[6]));
             
                
        if (click==1)
        {
            anterior=numeros[6];
            pos1=6;
        }
        else if (click==2)
        {
            anterior2=numeros[6];
            pos2=6;
        }
        
        else if (click==3)
        {
            if (anterior==anterior2)
            {
                //btn1.setText("");
                //btn1.setEnabled(false);
                
                Bloquear();
                click=1;
                anterior=numeros[6];
                pos1=6;
                
                
                
            }
            else 
            {
                Tapar();
                click=1;
                anterior=numeros[6];
                pos1=6;
            }
        }
    }//GEN-LAST:event_btn7ActionPerformed

    private void btn8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn8ActionPerformed
        // TODO add your handling code here:
        click++;
        btn8.setText(String.valueOf(numeros[7]));
             
                
        if (click==1)
        {
            anterior=numeros[7];
            pos1=7;
        }
        else if (click==2)
        {
            anterior2=numeros[7];
            pos2=7;
        }
        
        else if (click==3)
        {
            if (anterior==anterior2)
            {
                //btn1.setText("");
                //btn1.setEnabled(false);
                
                Bloquear();
                click=1;
                anterior=numeros[7];
                pos1=7;
                
                
                
            }
            else 
            {
                Tapar();
                click=1;
                anterior=numeros[7];
                pos1=7;
                
            }
        }
    }//GEN-LAST:event_btn8ActionPerformed

    private void btn9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn9ActionPerformed
        // TODO add your handling code here:
        click++;
        btn9.setText(String.valueOf(numeros[8]));
             
                
        if (click==1)
        {
            anterior=numeros[8];
            pos1=8;
        }
        else if (click==2)
        {
            anterior2=numeros[8];
            pos2=8;
        }
        
        else if (click==3)
        {
            if (anterior==anterior2)
            {
                //btn1.setText("");
                //btn1.setEnabled(false);
                
                Bloquear();
                click=1;
                anterior=numeros[8];
                pos1=8;                
                
                
                
                
            }
            else 
            {
                Tapar();
                click=1;
                anterior=numeros[8];
                pos1=8;
                
            }
        }
    }//GEN-LAST:event_btn9ActionPerformed

    private void btn10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn10ActionPerformed
        // TODO add your handling code here:
        click++;
        btn10.setText(String.valueOf(numeros[9]));
             
                
        if (click==1)
        {
            anterior=numeros[9];
            pos1=9;
        }
        else if (click==2)
        {
            anterior2=numeros[9];
            pos2=9;
        }
        
        else if (click==3)
        {
            if (anterior==anterior2)
            {
                //btn1.setText("");
                //btn1.setEnabled(false);
                
                Bloquear();
                click=1;
                anterior=numeros[9];
                pos1=9;
                
                
                
            }
            else 
            {
                Tapar();
                click=1;
                anterior=numeros[9];
                pos1=9;
                
            }
        }
    }//GEN-LAST:event_btn10ActionPerformed

    private void btn11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn11ActionPerformed
        // TODO add your handling code here:
        click++;
        btn11.setText(String.valueOf(numeros[10]));
             
                
        if (click==1)
        {
            anterior=numeros[10];
            pos1=10;
        }
        else if (click==2)
        {
            anterior2=numeros[10];
            pos2=10;
        }
        
        else if (click==3)
        {
            if (anterior==anterior2)
            {
                //btn1.setText("");
                //btn1.setEnabled(false);
                
                Bloquear();
                click=1;
                anterior=numeros[10];
                pos1=10;
                
                
                
            }
            else 
            {
                Tapar();
                click=1;
                anterior=numeros[10];
                pos1=10;
               
            }
        }
    }//GEN-LAST:event_btn11ActionPerformed

    private void btn12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn12ActionPerformed
        // TODO add your handling code here:
        click++;
        btn12.setText(String.valueOf(numeros[11]));
             
                
        if (click==1)
        {
            anterior=numeros[11];
            pos1=11;
        }
        else if (click==2)
        {
            anterior2=numeros[11];
            pos2=11;
        }
        
        else if (click==3)
        {
            if (anterior==anterior2)
            {
                //btn1.setText("");
                //btn1.setEnabled(false);
                
                Bloquear();
                click=1;
                anterior=numeros[11];
                pos1=11;
                
                
                
            }
            else 
            {
                Tapar();
                click=1;
                anterior=numeros[11];
                pos1=11;
                
            }
        }
    }//GEN-LAST:event_btn12ActionPerformed

    private void btn13ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn13ActionPerformed
        // TODO add your handling code here:
        click++;
        btn13.setText(String.valueOf(numeros[12]));
             
                
        if (click==1)
        {
            anterior=numeros[12];
            pos1=12;
        }
        else if (click==2)
        {
            anterior2=numeros[12];
            pos2=12;
        }
        
        else if (click==3)
        {
            if (anterior==anterior2)
            {
                //btn1.setText("");
                //btn1.setEnabled(false);
                
                Bloquear();
                click=1;
                anterior=numeros[12];
                pos1=12;
                
                
                
            }
            else 
            {
                Tapar();
                click=1;
                anterior=numeros[12];
                pos1=12;
                
            }
        }
    }//GEN-LAST:event_btn13ActionPerformed

    private void btn14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn14ActionPerformed
        // TODO add your handling code here:
        click++;
        btn14.setText(String.valueOf(numeros[13]));
             
                
        if (click==1)
        {
            anterior=numeros[13];
            pos1=13;
        }
        else if (click==2)
        {
            anterior2=numeros[13];
            pos2=13;
        }
        
        else if (click==3)
        {
            if (anterior==anterior2)
            {
                //btn1.setText("");
                //btn1.setEnabled(false);
                
                Bloquear();
                click=1;
                anterior=numeros[13];
                pos1=13;
                
                
                
            }
            else 
            {
                Tapar();
                click=1;
                anterior=numeros[13];
                pos1=13;
                
            }
        }
    }//GEN-LAST:event_btn14ActionPerformed

    private void btn15ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn15ActionPerformed
        // TODO add your handling code here:
        click++;
        btn15.setText(String.valueOf(numeros[14]));
             
                
        if (click==1)
        {
            anterior=numeros[14];
            pos1=14;
        }
        else if (click==2)
        {
            anterior2=numeros[14];
            pos2=14;
        }
        
        else if (click==3)
        {
            if (anterior==anterior2)
            {
                //btn1.setText("");
                //btn1.setEnabled(false);
                
                Bloquear();
                click=1;
                anterior=numeros[14];
                pos1=14;
                
                
                
            }
            else 
            {
                Tapar();
                click=1;
                anterior=numeros[14];
                pos1=14;
                
            }
        }
    }//GEN-LAST:event_btn15ActionPerformed

    private void btn16ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn16ActionPerformed
        // TODO add your handling code here:
        click++;
        btn16.setText(String.valueOf(numeros[15]));
             
                
        if (click==1)
        {
            anterior=numeros[15];
            pos1=15;
        }
        else if (click==2)
        {
            anterior2=numeros[15];
            pos2=15;
        }
        
        else if (click==3)
        {
            if (anterior==anterior2)
            {
                //btn1.setText("");
                //btn1.setEnabled(false);
                
                Bloquear();
                click=1;
                anterior=numeros[15];
                pos1=15;
                
                
                
            }
            else 
            {
                Tapar();
                click=1;
                anterior=numeros[15];
                pos1=15;
                
            }
        }
    }//GEN-LAST:event_btn16ActionPerformed

    private void btnresetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnresetActionPerformed
        // TODO add your handling code here:
        click=0;
        
        System.out.print("\n");
        System.out.print("Nuevo aleatorio");
        System.out.print("\n");
        
        posicion=0;
        posicion2=0;
        contador=1;
        
        
        
        
        while (posicion <= 15)
        {
            
            condicion = 0;
            posicion2 = 0;
            aleatorio = (int)(Math.random()*8);  
            
            while(posicion > posicion2)
            {
                if(aleatorio == numeros[posicion2])
                {
                    condicion++;
                }  
                
                posicion2++;
            }
            
            if(condicion < 2)
            {
                System.out.print("aleatorio: "+ aleatorio + "\n");
                numeros[posicion2] = aleatorio;
                posicion++;
            }
        }
        
        
        
        
        btn1.setText("");
        btn2.setText("");
        btn3.setText("");
        btn4.setText("");
        btn5.setText("");
        btn6.setText("");
        btn7.setText("");
        btn8.setText("");
        btn9.setText("");
        btn10.setText("");
        btn11.setText("");
        btn12.setText("");
        btn13.setText("");
        btn14.setText("");
        btn15.setText("");
        btn16.setText("");
        
        btn1.setEnabled(true);
        btn2.setEnabled(true);
        btn3.setEnabled(true);
        btn4.setEnabled(true);
        btn5.setEnabled(true);
        btn6.setEnabled(true);
        btn7.setEnabled(true);
        btn8.setEnabled(true);
        btn9.setEnabled(true);
        btn10.setEnabled(true);
        btn11.setEnabled(true);
        btn12.setEnabled(true);
        btn13.setEnabled(true);
        btn14.setEnabled(true);
        btn15.setEnabled(true);
        btn16.setEnabled(true);
               
        intentos=0;
        aciertos=0;
        lblintentos.setText(String.valueOf(intentos));
        lblaciertos.setText(String.valueOf(aciertos));
        
        contador2=0;
        cont2=0;
        cont3 =0;
        lbldecimas.setText(String.valueOf(contador));
        lblsegundos.setText("0"+String.valueOf(cont2));
        lblminutos.setText(String.valueOf(cont3));
        
        
        
        
    }//GEN-LAST:event_btnresetActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        
        btnreset.setEnabled(false);
        
        JOptionPane.showMessageDialog(null, "Bienvenido al juego de Memoria \nPara inciar ingrese su nombre \nSi desea volver a jugar Presione el botón Reset");
        
        String nombre = JOptionPane.showInputDialog("Ingrese su nombre");
        
        lblnombre.setText(nombre);
        
        
        
       
    }//GEN-LAST:event_formWindowOpened

    private void btnjugarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnjugarActionPerformed
        // TODO add your handling code here:
        AudioClip sonido;
        sonido= java.applet.Applet.newAudioClip(getClass().getResource("musica.wav"));
        sonido.play();
        
        lblintentos.setText(String.valueOf(intentos));
        lblaciertos.setText(String.valueOf(aciertos));
        
        temporizador.start();
        
        btnreset.setEnabled(true);
        btnjugar.setEnabled(false);
        
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
            java.util.logging.Logger.getLogger(FrmMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmMemoria.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmMemoria().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn1;
    private javax.swing.JButton btn10;
    private javax.swing.JButton btn11;
    private javax.swing.JButton btn12;
    private javax.swing.JButton btn13;
    private javax.swing.JButton btn14;
    private javax.swing.JButton btn15;
    private javax.swing.JButton btn16;
    private javax.swing.JButton btn2;
    private javax.swing.JButton btn3;
    private javax.swing.JButton btn4;
    private javax.swing.JButton btn5;
    private javax.swing.JButton btn6;
    private javax.swing.JButton btn7;
    private javax.swing.JButton btn8;
    private javax.swing.JButton btn9;
    private javax.swing.JButton btnjugar;
    private javax.swing.JButton btnreset;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel lblaciertos;
    private javax.swing.JLabel lbldecimas;
    private javax.swing.JLabel lblintentos;
    private javax.swing.JLabel lblminutos;
    private javax.swing.JLabel lblnombre;
    private javax.swing.JLabel lblsegundos;
    // End of variables declaration//GEN-END:variables
}
