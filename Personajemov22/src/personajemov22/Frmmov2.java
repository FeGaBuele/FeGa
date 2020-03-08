package personajemov22;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
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
public class Frmmov2 extends javax.swing.JFrame implements KeyListener{

    int filas,columnas;
    int filas2,columnas2;
    int filas3,columnas3;
    int avanceder=100;
    int direccion=1;
    int brazo;
    int salto;
    int bajar;
    int arriba=100;
    int res1;
    int x=new Color(234,42,1).getRGB();// los tres numeros son los valores del rgb
    int o=new Color(0,0,0).getRGB();
    int c=new Color(208,147,55).getRGB();
    int v=new Color(141,126,29).getRGB();
    
                              //        //        //        //        //      //         
                   // 1 2 3 4,5 6 7 8,9 0 1 2,3 4 5 6,7 8 9 0,1 2 3 4,5 6 7 8 9
    int [][] mario={{o,o,o,o,o,o,o,x,x,x,x,x,x,x,x,x,x,x,x,x,o,o,o,o,o,o,o,o,o},
                     {o,o,o,o,o,o,o,x,x,x,x,x,x,x,x,x,x,x,x,x,o,o,o,o,o,o,o,o,o},
                     {o,o,o,o,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,o,o,o},
                     {o,o,o,o,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,o,o,o},//
                     {o,o,o,o,v,v,v,v,v,v,v,v,v,c,c,c,c,c,v,v,v,c,c,o,o,o,o,o,o},
                     {o,o,o,o,v,v,v,v,v,v,v,v,v,c,c,c,c,c,v,v,v,c,c,o,o,o,o,o,o},
                     {o,v,v,v,c,c,c,v,v,v,c,c,c,c,c,c,c,c,v,v,v,c,c,o,o,o,o,o,o},
                     {o,v,v,v,c,c,c,v,v,v,c,c,c,c,c,c,c,c,v,v,v,c,c,c,c,c,c,o,o},//
                     {o,v,v,v,c,c,c,v,v,v,c,c,c,c,c,c,c,c,v,v,v,c,c,c,c,c,c,o,o},
                     {o,v,v,v,c,c,c,v,v,v,v,v,v,c,c,c,c,c,c,c,c,v,v,v,c,c,c,c,c},
                     {o,v,v,v,c,c,c,v,v,v,v,v,v,c,c,c,c,c,c,c,c,v,v,v,c,c,c,c,c},
                     {o,v,v,v,v,v,v,c,c,c,c,c,c,c,c,c,c,c,v,v,v,v,v,v,v,v,v,o,o},//
                     {o,v,v,v,v,v,v,c,c,c,c,c,c,c,c,c,c,c,v,v,v,v,v,v,v,v,v,o,o},
                     {o,o,o,o,o,o,o,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,o,o,o,o},
                     {o,o,o,o,o,o,o,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,o,o,o,o},
                     {o,o,o,o,v,v,v,v,v,v,x,x,v,v,v,v,v,v,v,v,v,o,o,o,o,o,o,o,o},//
                     {o,o,o,o,v,v,v,v,v,v,x,x,v,v,v,v,v,v,v,v,v,o,o,o,o,o,o,o,o},
                     {o,o,v,v,v,v,v,v,v,v,x,x,v,v,v,v,v,v,x,x,x,v,v,v,v,v,o,o,o},
                     {o,o,v,v,v,v,v,v,v,v,x,x,v,v,v,v,v,v,x,x,x,v,v,v,v,v,o,o,o},
                     {v,v,v,v,v,v,v,v,v,v,x,x,x,x,x,x,x,x,x,x,x,v,v,v,v,v,v,v,v},//
                     {v,v,v,v,v,v,v,v,v,v,x,x,x,x,x,x,x,x,x,x,x,v,v,v,v,v,v,v,v},
                     {c,c,c,c,c,c,v,v,x,x,c,c,x,x,x,x,x,x,x,c,c,x,x,v,v,c,c,c,c},
                     {c,c,c,c,c,c,v,v,x,x,c,c,x,x,x,x,x,x,x,c,c,x,x,v,v,c,c,c,c},
                     {c,c,c,c,c,c,c,c,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,c,c,c,c,c,c},//
                     {c,c,c,c,c,c,c,c,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,c,c,c,c,c,c},
                     {c,c,c,c,c,c,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,c,c,c,c},
                     {c,c,c,c,c,c,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,c,c,c,c},
                     {o,o,o,o,o,o,x,x,x,x,x,x,x,o,o,o,o,o,x,x,x,x,x,x,x,o,o,o,o},//
                     {o,o,o,o,o,o,x,x,x,x,x,x,x,o,o,o,o,o,x,x,x,x,x,x,x,o,o,o,o},
                     {o,o,o,v,v,v,v,v,v,v,o,o,o,o,o,o,o,o,o,o,o,v,v,v,v,v,v,o,o},
                     {v,v,v,v,v,v,v,v,v,v,o,o,o,o,o,o,o,o,o,o,o,v,v,v,v,v,v,v,v},
                     {v,v,v,v,v,v,v,v,v,v,o,o,o,o,o,o,o,o,o,o,o,v,v,v,v,v,v,v,v}};//
    
                   // 1 2 3 4,5 6 7 8,9 0 1 2,3 4 5 6,7 8 9 0,1 2 3 4,5 6 7 8 9
    
    ///////////////////////
    
                              //        //        //        //        //      //         
                   // 1 2 3 4,5 6 7 8,9 0 1 2,3 4 5 6,7 8 9 0,1 2 3 4,5 6 7 8 9
    int [][] mario2={{o,o,o,o,o,o,o,x,x,x,x,x,x,x,x,x,x,x,x,x,o,o,o,o,c,c,c,c,c},
                     {o,o,o,o,o,o,o,x,x,x,x,x,x,x,x,x,x,x,x,x,o,o,o,o,c,c,c,c,c},
                     {o,o,o,o,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,c,c,c},
                     {o,o,o,o,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,c,c,c},//
                     {o,o,o,o,v,v,v,v,v,v,v,v,v,c,c,c,c,c,v,v,v,c,c,o,c,c,c,c,c},
                     {o,o,o,o,v,v,v,v,v,v,v,v,v,c,c,c,c,c,v,v,v,c,c,o,c,c,c,c,c},
                     {o,o,v,v,c,c,c,v,v,v,c,c,c,c,c,c,c,c,v,v,v,c,c,o,v,v,v,v,v},
                     {o,o,v,v,c,c,c,v,v,v,c,c,c,c,c,c,c,c,v,v,v,c,c,c,c,c,v,v,v},//
                     {o,o,v,v,c,c,c,v,v,v,c,c,c,c,c,c,c,c,v,v,v,c,c,c,c,c,c,v,v},
                     {o,o,v,v,c,c,c,v,v,v,v,v,v,c,c,c,c,c,c,c,c,v,v,v,v,v,v,v,v},
                     {o,o,v,v,c,c,c,v,v,v,v,v,v,c,c,c,c,c,c,c,c,v,v,v,v,v,v,v,v},
                     {o,o,v,v,v,v,v,c,c,c,c,c,c,c,c,c,c,c,v,v,v,v,v,v,v,v,v,o,o},//
                     {o,o,v,v,v,v,v,c,c,c,c,c,c,c,c,c,c,c,v,v,v,v,v,v,v,v,v,o,o},
                     {o,o,o,o,o,o,o,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,v,v,o,o,o,o},
                     {o,o,o,o,o,o,o,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,v,v,o,o,o,o},
                     {o,o,o,o,o,o,v,v,v,v,x,x,v,v,v,v,v,v,v,x,x,v,v,o,o,o,o,o,o},//
                     {o,o,o,o,o,o,v,v,v,v,x,x,v,v,v,v,v,v,v,x,x,v,v,o,o,o,o,o,o},
                     {o,o,o,o,v,v,v,v,v,v,v,v,x,x,v,v,v,v,v,v,v,x,x,o,o,o,o,o,o},
                     {o,o,o,o,v,v,v,v,v,v,v,v,x,x,v,v,v,v,v,v,v,x,x,o,o,o,o,o,o},
                     {c,c,c,v,v,v,v,v,v,v,x,x,x,x,x,x,x,x,x,x,x,x,x,o,o,o,o,v,v},//
                     {c,c,c,v,v,v,v,v,v,v,x,x,x,x,x,x,x,x,x,x,x,x,x,o,o,o,o,v,v},
                     {c,c,c,c,c,v,v,v,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,o,o,o,o,v,v},
                     {c,c,c,c,c,v,v,v,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,o,o,o,o,v,v},
                     {c,c,o,o,x,x,v,v,x,x,x,x,x,x,x,c,c,x,x,x,c,c,x,x,x,v,v,v,v},//
                     {o,o,o,o,x,x,v,v,x,x,x,x,x,x,x,c,c,x,x,x,c,c,x,x,x,v,v,v,v},
                     {o,v,v,o,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,v,v,v,v},
                     {o,v,v,o,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,v,v,v,v},
                     {o,v,v,v,v,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,o,o,o,o,o,o,o},//
                     {o,v,v,v,v,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,o,o,o,o,o,o,o},
                     {o,v,v,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,o,o,o,o,o,o,o,o,o,o,o},
                     {v,v,v,x,x,x,x,x,x,x,x,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o},
                     {v,v,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o}};//
    
                   // 1 2 3 4,5 6 7 8,9 0 1 2,3 4 5 6,7 8 9 0,1 2 3 4,5 6 7 8 9
    
    /////////////////////////////salto
    
                              //        //        //        //        //      //         
                   // 1 2 3 4,5 6 7 8,9 0 1 2,3 4 5 6,7 8 9 0,1 2 3 4,5 6 7 8 9
    int [][] mario3={{c,c,c,c,c,c,o,x,x,x,x,x,x,x,x,x,x,x,x,x,o,o,o,o,c,c,c,c,c},
                     {c,c,c,c,c,c,o,x,x,x,x,x,x,x,x,x,x,x,x,x,o,o,o,o,c,c,c,c,c},
                     {c,c,c,c,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,c,c,c},
                     {c,c,c,c,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,c,c,c},//
                     {c,c,c,c,v,v,v,v,v,v,v,v,v,c,c,c,c,c,v,v,v,c,c,o,c,c,c,c,c},
                     {c,c,c,c,v,v,v,v,v,v,v,v,v,c,c,c,c,c,v,v,v,c,c,o,c,c,c,c,c},
                     {c,c,v,v,c,c,c,v,v,v,c,c,c,c,c,c,c,c,v,v,v,c,c,o,v,v,v,v,v},
                     {v,v,v,v,c,c,c,v,v,v,c,c,c,c,c,c,c,c,v,v,v,c,c,c,c,c,v,v,v},//
                     {v,v,v,v,c,c,c,v,v,v,c,c,c,c,c,c,c,c,v,v,v,c,c,c,c,c,c,v,v},
                     {v,v,v,v,c,c,c,v,v,v,v,v,v,c,c,c,c,c,c,c,c,v,v,v,v,v,v,v,v},
                     {v,v,v,v,c,c,c,v,v,v,v,v,v,c,c,c,c,c,c,c,c,v,v,v,v,v,v,v,v},
                     {v,v,v,v,v,v,o,c,c,c,c,c,c,c,c,c,c,c,v,v,v,v,v,v,v,v,v,o,o},//
                     {v,v,v,v,v,v,o,c,c,c,c,c,c,c,c,c,c,c,v,v,v,v,v,v,v,v,v,o,o},
                     {v,v,v,v,v,v,o,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,v,v,o,o,o,o},
                     {v,v,v,v,v,v,o,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,c,v,v,o,o,o,o},
                     {o,o,v,v,v,v,v,v,v,v,x,x,v,v,v,v,v,v,v,x,x,v,v,o,o,o,o,o,o},//
                     {o,o,v,v,v,v,v,v,v,v,x,x,v,v,v,v,v,v,v,x,x,v,v,o,o,o,o,o,o},
                     {o,o,o,o,o,o,v,v,v,v,x,x,v,v,v,v,v,v,v,x,x,v,v,o,o,o,o,o,o},
                     {o,o,o,o,o,o,v,v,v,v,x,x,v,v,v,v,v,v,v,x,x,v,v,o,o,o,o,o,o},
                     {v,v,o,o,o,o,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,o,o,o,o,v,v},//
                     {v,v,o,o,o,o,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,o,o,o,o,v,v},
                     {v,v,o,o,o,o,x,x,x,x,x,x,c,c,x,x,x,c,c,x,x,x,x,o,o,o,o,v,v},
                     {v,v,o,o,o,o,x,x,x,x,x,x,c,c,x,x,x,c,c,x,x,x,x,o,o,o,o,v,v},
                     {v,v,v,v,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,v,v,v,v},//
                     {v,v,v,v,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,v,v,v,v},
                     {v,v,v,v,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,v,v,v,v},
                     {v,v,v,v,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,v,v,v,v},
                     {o,o,o,o,o,o,o,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,o,o,o,o,o,o,o},//
                     {o,o,o,o,o,o,o,x,x,x,x,x,x,x,x,x,x,x,x,x,x,x,o,o,o,o,o,o,o},
                     {o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o},
                     {o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o},
                     {o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o,o}};//
    
                   // 1 2 3 4,5 6 7 8,9 0 1 2,3 4 5 6,7 8 9 0,1 2 3 4,5 6 7 8 9
    
    @Override
    public void paint(Graphics g)
    {
       
        
        super.paint(g);
        
         /////////derecha       
        if (direccion==1)
        {
            for(filas=0;filas<32*4;filas++)
            {
                for(columnas=0;columnas<29*4;columnas++)
                {
                    g.setColor(new Color(mario[filas/4][columnas/4]));
                    g.drawRect(avanceder+ columnas,arriba+filas,1,1);

                }
            }
        }
        
        if (brazo==2)
        {
            for(filas2=0;filas2<32*4;filas2++)
            {
                for(columnas2=0;columnas2<29*4;columnas2++)
                {
                    g.setColor(new Color(mario2[filas2/4][columnas2/4]));
                    g.drawRect(avanceder+ columnas2,arriba+filas2,1,1);

                }
            }
            brazo=1;
        }
        
        /////////////izquierda
        
        if (direccion==-1)
        {
            
            for(filas=0;filas<32*4;filas++)
            {
                for(columnas=0;columnas<29*4;columnas++)
                {
                    g.setColor(new Color(mario[filas/4][columnas/4]));
                    g.drawRect(avanceder - columnas,arriba+filas,1,1);

                }
            }
        }
        
        if(brazo==-2)
        {
            for(filas2=0;filas2<32*4;filas2++)
            {
                for(columnas2=0;columnas2<29*4;columnas2++)
                {
                    g.setColor(new Color(mario2[filas2/4][columnas2/4]));
                    g.drawRect(avanceder - columnas2,arriba+filas2,1,1);

                }
            }
            brazo=0;
        }
        
        /////salto
        
        if (salto==1)
        {
            for(filas3=0;filas3<32*4;filas3++)
            {
                for(columnas3=0;columnas3<29*4;columnas3++)
                {
                    g.setColor(new Color(mario3[filas3/4][columnas3/4]));
                    g.drawRect(avanceder + columnas3,arriba+filas3,1,1);

                }
            }
            salto=0;
        }
        
        
        if (salto==-1)
        {
            for(filas3=0;filas3<32*4;filas3++)
            {
                for(columnas3=0;columnas3<29*4;columnas3++)
                {
                    g.setColor(new Color(mario3[filas3/4][columnas3/4]));
                    g.drawRect(avanceder - columnas3, arriba+filas3,1,1);

                }
            }
            salto=0;
        }
        ///// bajar
        
        if (bajar==1)
        {
            for(filas=0;filas<32*4;filas++)
            {
                for(columnas=0;columnas<29*4;columnas++)
                {
                    g.setColor(new Color(mario[filas/4][columnas/4]));
                    g.drawRect(avanceder + columnas, arriba+filas,1,1);

                }
            }
        }
        
        if (bajar==-1)
        {
            for(filas=0;filas<32*4;filas++)
            {
                for(columnas=0;columnas<29*4;columnas++)
                {
                    g.setColor(new Color(mario[filas/4][columnas/4]));
                    g.drawRect(avanceder - columnas, arriba+filas,1,1);

                }
            }
        }
        
                
        
    }
    
    Timer temporizador = new Timer(50, new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            repaint();
        }
});
    
    /**
     * Creates new form Frmmov2
     */
    public Frmmov2() {
        initComponents();
        this.getContentPane().setBackground(Color.BLACK);
        addKeyListener(this);
    }
    
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
    public void keyPressed(KeyEvent e)
    {
       System.out.println(e.getKeyCode());
       
       if (e.getKeyCode()==39)
       {
           direccion=1;
           brazo=2;
           salto=0;
           bajar=0;
           avanceder+=30;
           
       }
       if (e.getKeyCode()==37)
       {
           direccion=-1;
           brazo=-2;
           salto=0;
           bajar=0;
           avanceder-=30;
       }
       
       if (e.getKeyCode()==38 && direccion==1)
       {
           salto=1;
           arriba-=30;
       }
       
       if (e.getKeyCode()==38 && direccion==-1)
       {
           salto=-1;
           arriba-=30;
       }
       
       if (e.getKeyCode()==40 && direccion==1)
       {
           bajar=1;
           arriba+=30;
       }
       if(e.getKeyCode()==40 && direccion==-1)
       {
           bajar=-1;
           arriba+=30;
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(700, 700));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        temporizador.start();
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Frmmov2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Frmmov2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Frmmov2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Frmmov2.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Frmmov2().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
