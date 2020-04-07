/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spaceinvaders;

import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.Timer;


/**
 *
 * @author FeGa
 */
public class FrmSpace extends javax.swing.JFrame implements KeyListener{
    
        
    int even = 1; // para el intercambio de imagenes simulacion de mov
    int locationX = 20; //lugar donde se va a aparecer el invasor
    int locationY = 100; // 
    int disparo=0;
    int balaY=530;
    int coordxnave;
    int teclaespacio=32;
    double distancia1;
    double distancia1b;
    double distancia2;
    double distancia2b;
    double distancia3;
    double distancia3b;
    int movhorizontal=1;
    
    int marcador = 0;
    int vidas = 3;
   
    int randomsup=1;
    int movsup;
    int randomsup2;
    int randomsup3;
    double distanciasup;
    int random5;
    
    int escucambio1=0;
    int escucambio2=0;
    int escucambio3=0;
    int escucambio1b=0;
    int escucambio2b=0;
    int escucambio3b=0;
    int escucambio1c=0;
    int escucambio2c=0;
    int escucambio3c=0;
    
    
    
    
    int escudoX=40;
    int escudoY=450;
    double disescu1;
    double disescu2;
    double disescu3;
    double disescu1b;
    double disescu2b;
    double disescu3b;
    double disescu1c;
    double disescu2c;
    double disescu3c;
    
    
    
    Space tank = new Space(375,550); // instanciando para crear tanque y aparezca en esa pos
    
    /*Space invader1  = new Space(locationX,locationY+200);
    Space invader2 = new Space(locationX,locationY+100);
    Space invader3 = new Space(locationX,locationY); // intanciando los tres tipod e invazores */
    Space bala = new Space(coordxnave,balaY); // intanciando los tres tipod e invazores
    
    /////////////
    Space[] invader1 = new Space[8];
    Space[] invader1b = new Space[8];
    Space[] invader2 = new Space[8];
    Space[] invader2b = new Space[8];
    Space[] invader3 = new Space[8];
    Space[] invader3b = new Space[8];
    
    /*Space[] escudo1 = new Space[3];
    Space[] escudo2 = new Space[3];
    Space[] escudo3 = new Space[3];*/
    
    Space escudo1 = new Space(40,450);
    Space escudo2 = new Space(340,450);
    Space escudo3 = new Space(640,450);
    Space escudo1b = new Space(70,450);
    Space escudo2b = new Space(370,450);
    Space escudo3b = new Space(670,450);
    Space escudo1c = new Space(100,450);
    Space escudo2c = new Space(400,450);
    Space escudo3c = new Space(700,450);
    
    /////////////////
    Space invadersup = new Space(-1000,60);
    //////////////////
    Space dispinvader = new Space(0,-100);
    int random8;
    double disbalanave1;
    double disbalanave2;
    double disbalanave3;
    double disbalanave1b;
    double disbalanave2b;
    double disbalanave3b;
    double disbalanave1c;
    double disbalanave2c;
    double disbalanave3c;
    double disbalanave10;
    
    int ganaste;
    
    
    
    ////////////////////
    
    BufferedImage imgTank=null;
    BufferedImage imgFondo=null;
    BufferedImage imgBala=null;
    BufferedImage imgGanaste=null;
    BufferedImage imgPerdiste=null;
    BufferedImage imgEscudo1=null;
    BufferedImage imgEscudo2=null;
    BufferedImage imgEscudo3=null;
    
    BufferedImage imgInvader1a=null;// dos variables de img para cada invasor
    BufferedImage imgInvader1b=null;
    
    BufferedImage imgInvader2a=null;
    BufferedImage imgInvader2b=null;
    
    BufferedImage imgInvader3a=null;
    BufferedImage imgInvader3b=null; // esto siempre va afuera
    
    BufferedImage imgInvadersup=null;
    BufferedImage imgDispinvader=null;
    
    
    /**
     * Creates new form FrmSpace
     */
    public FrmSpace() {
        initComponents();
        addKeyListener(this);
        
        for (int i=0 ; i<8 ; i++)
        {
            invader1[i] = new Space(locationX,locationY+200);
            invader1b[i] = new Space(locationX,locationY+160);
            invader2[i] = new Space(locationX,locationY+120);
            invader2b[i] = new Space(locationX,locationY+80);
            invader3[i] = new Space(locationX,locationY);
            invader3b[i] = new Space(locationX,locationY+40);
            locationX+=80;
        }
        
        /*for (int j=0 ; j<3 ; j++)
        {
            escudo1[j] = new Space(escudoX,escudoY);
            escudo2[j] = new Space(escudoX+30,escudoY);
            escudo3[j] = new Space(escudoX+60,escudoY);
            escudoX+=300;
        }*/
        
        try {
             
            imgTank = ImageIO.read(new File("src/SpaceInvader/canyon.jpg")); //tank
            imgFondo = ImageIO.read(new File("src/SpaceInvader/fondo.png")); //fondo
            imgBala = ImageIO.read(new File("src/SpaceInvader/bala.png")); //fondo
            imgInvader1a = ImageIO.read(new File("src/SpaceInvader/Invader1a.png")); //invaders1a
            imgInvader1b = ImageIO.read(new File("src/SpaceInvader/Invader1b.png")); //invaders1a
            
            imgInvader2a = ImageIO.read(new File("src/SpaceInvader/Invader2a.png")); //invaders2a
            imgInvader2b = ImageIO.read(new File("src/SpaceInvader/Invader2b.png")); //invaders2a
           
            imgInvader3a = ImageIO.read(new File("src/SpaceInvader/Invader3a.png")); //invaders3a
            imgInvader3b = ImageIO.read(new File("src/SpaceInvader/Invader3b.png")); //invaders3a
            
            imgEscudo1 = ImageIO.read(new File("src/SpaceInvader/escudo1.png")); //escudo
            imgEscudo2 = ImageIO.read(new File("src/SpaceInvader/escudo2.png")); //escudo
            imgEscudo3 = ImageIO.read(new File("src/SpaceInvader/escudo3.png")); //escudo
            
            imgInvadersup = ImageIO.read(new File("src/SpaceInvader/navesup.png"));
            imgDispinvader = ImageIO.read(new File("src/SpaceInvader/balanave2.png"));
            
            imgGanaste = ImageIO.read(new File("src/SpaceInvader/ganaste.png"));
            imgPerdiste = ImageIO.read(new File("src/SpaceInvader/perdiste.png"));
            
        } catch (IOException ex) {
            Logger.getLogger(FrmSpace.class.getName()).log(Level.SEVERE, null, ex);
        }
            
            
       
    }
    
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) {}
    public void keyPressed(KeyEvent e)
    {
       System.out.println(e.getKeyCode());
       
       if (e.getKeyCode()==39)
       {           
           tank.setCoordX(tank.getCoordX()+5); // mover a la derecha
       }
       if (e.getKeyCode()==37)
       {           
           tank.setCoordX(tank.getCoordX()-5); // mover a la izquierda
       } 
       if (e.getKeyCode()==teclaespacio)
       {           
           teclaespacio=100;
           disparo=1; // mover a la izquierda
           
           coordxnave = tank.getCoordX()+22;
                    
       }  
    }
    
    public void paint(Graphics g)
    {
        
        super.paint(g);
        
        g.drawImage(imgFondo, 0,0,800,600, this);
                
        g.drawImage(imgTank, tank.getCoordX(),tank.getCoordY(),50,50,this); // 100 x160 original con 50,50 le escala
        
        if(dispinvader.getAparecer()==true)
        {
            g.drawImage(imgDispinvader, dispinvader.getCoordX(), dispinvader.getCoordY(),10,20, this);
        }
        if(even == 1)
        {
            for (int i=0; i<8; i++)
            {
                if (invader1[i].getAparecer()==true)
                {
                    g.drawImage(imgInvader1a, invader1[i].getCoordX(),invader1[i].getCoordY(),40,30,this); // 40 por 30 escalada
                }
                else if (invader1[i].getAparecer()==false)
                {
                    g.drawImage(imgInvader1a, invader1[i].getCoordX(),invader1[i].getCoordY(),0,0,this); // 40 por 30 escalada
                }
                if (invader1b[i].getAparecer()==true)
                {
                    g.drawImage(imgInvader1a, invader1b[i].getCoordX(),invader1b[i].getCoordY(),40,30,this); // 40 por 30 escalada
                }
                else if (invader1b[i].getAparecer()==false)
                {
                    g.drawImage(imgInvader1a, invader1b[i].getCoordX(),invader1b[i].getCoordY(),0,0,this); // 40 por 30 escalada
                }
                ////////////////////////////////
                
                if (invader2[i].getAparecer()==true)
                {
                    g.drawImage(imgInvader2a, invader2[i].getCoordX(),invader2[i].getCoordY(),40,30,this);
                }
                else if (invader2[i].getAparecer()==false)
                {
                    g.drawImage(imgInvader2a, invader2[i].getCoordX(),invader2[i].getCoordY(),0,0,this); // 40 por 30 escalada
                }
                if (invader2b[i].getAparecer()==true)
                {
                    g.drawImage(imgInvader2a, invader2b[i].getCoordX(),invader2b[i].getCoordY(),40,30,this);
                }
                else if (invader2b[i].getAparecer()==false)
                {
                    g.drawImage(imgInvader2a, invader2b[i].getCoordX(),invader2b[i].getCoordY(),0,0,this); // 40 por 30 escalada
                }
                //////////////////               
                
                if (invader3[i].getAparecer()==true)
                {
                    g.drawImage(imgInvader3a, invader3[i].getCoordX(),invader3[i].getCoordY(),40,30,this);
                }
                else if (invader3[i].getAparecer()==false)
                {
                    g.drawImage(imgInvader3a, invader3[i].getCoordX(),invader3[i].getCoordY(),0,0,this); // 40 por 30 escalada
                }
                if (invader3b[i].getAparecer()==true)
                {
                    g.drawImage(imgInvader3a, invader3b[i].getCoordX(),invader3b[i].getCoordY(),40,30,this);
                }
                else if (invader3b[i].getAparecer()==false)
                {
                    g.drawImage(imgInvader3a, invader3b[i].getCoordX(),invader3b[i].getCoordY(),0,0,this); // 40 por 30 escalada
                }
               
            }
            
            /*g.drawImage(imgInvader1a, invader1.getCoordX(),invader1.getCoordY(),40,30,this); // 40 por 30 escalada
            g.drawImage(imgInvader2a, invader2.getCoordX(),invader2.getCoordY(),40,30,this);
            g.drawImage(imgInvader3a, invader3.getCoordX(),invader3.getCoordY(),40,30,this);*/
        }
        else
        {
            for (int i=0; i<8 ; i++)
            {
                if (invader1[i].getAparecer()==true)
                {
                    g.drawImage(imgInvader1b, invader1[i].getCoordX(),invader1[i].getCoordY(),40,30,this); // 40 por 30 escalada
                }
                else if (invader1[i].getAparecer()==false)
                {
                    g.drawImage(imgInvader1b, invader1[i].getCoordX(),invader1[i].getCoordY(),0,0,this); // 40 por 30 escalada
                }
                if (invader1b[i].getAparecer()==true)
                {
                    g.drawImage(imgInvader1b, invader1b[i].getCoordX(),invader1b[i].getCoordY(),40,30,this); // 40 por 30 escalada
                }
                else if (invader1b[i].getAparecer()==false)
                {
                    g.drawImage(imgInvader1b, invader1b[i].getCoordX(),invader1b[i].getCoordY(),0,0,this); // 40 por 30 escalada
                }
                //////////////////////////////////////
                
                if (invader2[i].getAparecer()==true)
                {
                    g.drawImage(imgInvader2b, invader2[i].getCoordX(),invader2[i].getCoordY(),40,30,this);
                }
                else if (invader2[i].getAparecer()==false)
                {
                    g.drawImage(imgInvader2b, invader2[i].getCoordX(),invader2[i].getCoordY(),0,0,this); // 40 por 30 escalada
                }
                if (invader2b[i].getAparecer()==true)
                {
                    g.drawImage(imgInvader2b, invader2b[i].getCoordX(),invader2b[i].getCoordY(),40,30,this);
                }
                else if (invader2b[i].getAparecer()==false)
                {
                    g.drawImage(imgInvader2b, invader2b[i].getCoordX(),invader2b[i].getCoordY(),0,0,this); // 40 por 30 escalada
                }
                //////////////////////////////////
                
                if (invader3[i].getAparecer()==true)
                {
                    g.drawImage(imgInvader3b, invader3[i].getCoordX(),invader3[i].getCoordY(),40,30,this);
                }
                else if (invader3[i].getAparecer()==false)
                {
                    g.drawImage(imgInvader3b, invader3[i].getCoordX(),invader3[i].getCoordY(),0,0,this); // 40 por 30 escalada
                }
                if (invader3b[i].getAparecer()==true)
                {
                    g.drawImage(imgInvader3b, invader3b[i].getCoordX(),invader3b[i].getCoordY(),40,30,this);
                }
                else if (invader3b[i].getAparecer()==false)
                {
                    g.drawImage(imgInvader3b, invader3b[i].getCoordX(),invader3b[i].getCoordY(),0,0,this); // 40 por 30 escalada
                }
                
                /*g.drawImage(imgInvader1b, invader1[i].getCoordX(),invader1[i].getCoordY(),40,30,this); // 40 por 30 escalada
                g.drawImage(imgInvader2b, invader2[i].getCoordX(),invader2[i].getCoordY(),40,30,this);
                g.drawImage(imgInvader3b, invader3[i].getCoordX(),invader3[i].getCoordY(),40,30,this);*/
            }
            
            /*g.drawImage(imgInvader1b, invader1.getCoordX(),invader1.getCoordY(),40,30,this);
            g.drawImage(imgInvader2b, invader2.getCoordX(),invader2.getCoordY(),40,30,this);
            g.drawImage(imgInvader3b, invader3.getCoordX(),invader3.getCoordY(),40,30,this);*/
        }
        ///////////////////disparo
        if (disparo==1)
        {
            g.drawImage(imgBala, coordxnave,balaY,10,20,this);
        }
        
        //////////////////escudos
  
        if (escucambio1==0)        
            g.drawImage(imgEscudo1, escudo1.getCoordX(),escudo1.getCoordY(),30,40,this);
        if (escucambio1==1)        
            g.drawImage(imgEscudo2, escudo1.getCoordX(),escudo1.getCoordY(),30,40,this);
        if (escucambio1==2)        
            g.drawImage(imgEscudo3, escudo1.getCoordX(),escudo1.getCoordY(),30,40,this);
                
        if (escucambio2==0)        
            g.drawImage(imgEscudo1, escudo2.getCoordX(),escudo2.getCoordY(),30,40,this);
        if (escucambio2==1)        
            g.drawImage(imgEscudo2, escudo2.getCoordX(),escudo2.getCoordY(),30,40,this);
        if (escucambio2==2)       
            g.drawImage(imgEscudo3, escudo2.getCoordX(),escudo2.getCoordY(),30,40,this);
        
        if (escucambio3==0)        
            g.drawImage(imgEscudo1, escudo3.getCoordX(),escudo3.getCoordY(),30,40,this);
        if (escucambio3==1)        
            g.drawImage(imgEscudo2, escudo3.getCoordX(),escudo3.getCoordY(),30,40,this);
        if (escucambio3==2)        
            g.drawImage(imgEscudo3, escudo3.getCoordX(),escudo3.getCoordY(),30,40,this);
        
        if (escucambio1b==0)        
            g.drawImage(imgEscudo1, escudo1b.getCoordX(),escudo1b.getCoordY(),30,40,this);
        if (escucambio1b==1)        
            g.drawImage(imgEscudo2, escudo1b.getCoordX(),escudo1b.getCoordY(),30,40,this);
        if (escucambio1b==2)        
            g.drawImage(imgEscudo3, escudo1b.getCoordX(),escudo1b.getCoordY(),30,40,this);
        
        if (escucambio2b==0)        
            g.drawImage(imgEscudo1, escudo2b.getCoordX(),escudo2b.getCoordY(),30,40,this);
        if (escucambio2b==1)        
            g.drawImage(imgEscudo2, escudo2b.getCoordX(),escudo2b.getCoordY(),30,40,this);
        if (escucambio2b==2)       
            g.drawImage(imgEscudo3, escudo2b.getCoordX(),escudo2b.getCoordY(),30,40,this);
        
        if (escucambio3b==0)        
            g.drawImage(imgEscudo1, escudo3b.getCoordX(),escudo3b.getCoordY(),30,40,this);
        if (escucambio3b==1)        
            g.drawImage(imgEscudo2, escudo3b.getCoordX(),escudo3b.getCoordY(),30,40,this);
        if (escucambio3b==2)        
            g.drawImage(imgEscudo3, escudo3b.getCoordX(),escudo3b.getCoordY(),30,40,this);
        
        if (escucambio1c==0)        
            g.drawImage(imgEscudo1, escudo1c.getCoordX(),escudo1c.getCoordY(),30,40,this);
        if (escucambio1c==1)        
            g.drawImage(imgEscudo2, escudo1c.getCoordX(),escudo1c.getCoordY(),30,40,this);
        if (escucambio1c==2)        
            g.drawImage(imgEscudo3, escudo1c.getCoordX(),escudo1c.getCoordY(),30,40,this);
        
        if (escucambio2c==0)        
            g.drawImage(imgEscudo1, escudo2c.getCoordX(),escudo2c.getCoordY(),30,40,this);
        if (escucambio2c==1)        
            g.drawImage(imgEscudo2, escudo2c.getCoordX(),escudo2c.getCoordY(),30,40,this);
        if (escucambio2c==2)       
            g.drawImage(imgEscudo3, escudo2c.getCoordX(),escudo2c.getCoordY(),30,40,this);
       
        if (escucambio3c==0)        
            g.drawImage(imgEscudo1, escudo3c.getCoordX(),escudo3c.getCoordY(),30,40,this);
        if (escucambio3c==1)        
            g.drawImage(imgEscudo2, escudo3c.getCoordX(),escudo3c.getCoordY(),30,40,this);
        if (escucambio3c==2)        
            g.drawImage(imgEscudo3, escudo3c.getCoordX(),escudo3c.getCoordY(),30,40,this);
        
            
        disescu1= Math.sqrt(Math.pow(escudo1.getCoordX()+15 - coordxnave,2) + Math.pow(escudo1.getCoordY()+20 - balaY,2 ) );   
        if (disescu1<=20)
        {
            balaY=530;
            disparo=0;
            teclaespacio=32;
            escucambio1++;
            if (escucambio1>=3)        
            {
                escudo1.setCoordY(-2000);
                g.drawImage(imgEscudo3, escudo1.getCoordX()-1000,escudo1.getCoordY()-4000,30,40,this);
            }   
        }
        disescu1b= Math.sqrt(Math.pow(escudo1b.getCoordX()+15 - coordxnave,2) + Math.pow(escudo1b.getCoordY()+20 - balaY,2 ) );   
        if (disescu1b<=20)
        {
            balaY=530;
            disparo=0;
            teclaespacio=32;
            escucambio1b++;
            if (escucambio1b>=3)        
            {
                escudo1b.setCoordY(-2000);
                g.drawImage(imgEscudo3, escudo1b.getCoordX()-1000,escudo1b.getCoordY()-4000,30,40,this);
            }   
        }
        disescu1c= Math.sqrt(Math.pow(escudo1c.getCoordX()+15 - coordxnave,2) + Math.pow(escudo1c.getCoordY()+20 - balaY,2 ) );   
        if (disescu1c<=20)
        {
            balaY=530;
            disparo=0;
            teclaespacio=32;
            escucambio1c++;
            if (escucambio1c>=3)        
            {
                escudo1c.setCoordY(-2000);
                g.drawImage(imgEscudo3, escudo1c.getCoordX()-1000,escudo1c.getCoordY()-4000,30,40,this);
            }   
        }
        ///////////////////////////////////////////////////////////////        
                
        disescu2= Math.sqrt(Math.pow(escudo2.getCoordX()+15 - coordxnave,2) + Math.pow(escudo2.getCoordY()+20 - balaY,2 ) );   
        if (disescu2<=20)
        {
            balaY=530;
            disparo=0;
            teclaespacio=32;
            escucambio2++;
            if (escucambio2>=3)        
            {
                escudo2.setCoordY(-2000);
                g.drawImage(imgEscudo3, escudo2.getCoordX()-1000,escudo2.getCoordY()-4000,30,40,this);
            }   
        }
        disescu2b= Math.sqrt(Math.pow(escudo2b.getCoordX()+15 - coordxnave,2) + Math.pow(escudo2b.getCoordY()+20 - balaY,2 ) );   
        if (disescu2b<=20)
        {
            balaY=530;
            disparo=0;
            teclaespacio=32;
            escucambio2b++;
            if (escucambio2b>=3)        
            {
                escudo2b.setCoordY(-2000);
                g.drawImage(imgEscudo3, escudo2b.getCoordX()-1000,escudo2b.getCoordY()-4000,30,40,this);
            }   
        }
        disescu2c= Math.sqrt(Math.pow(escudo2c.getCoordX()+15 - coordxnave,2) + Math.pow(escudo2c.getCoordY()+20 - balaY,2 ) );   
        if (disescu2c<=20)
        {
            balaY=530;
            disparo=0;
            teclaespacio=32;
            escucambio2c++;
            if (escucambio2c>=3)        
            {
                escudo2c.setCoordY(-2000);
                g.drawImage(imgEscudo3, escudo2c.getCoordX()-1000,escudo2c.getCoordY()-4000,30,40,this);
            }   
        }        
        ///////////////////////////////////////////////////////////////        
                
        disescu3= Math.sqrt(Math.pow(escudo3.getCoordX()+15 - coordxnave,2) + Math.pow(escudo3.getCoordY()+20 - balaY,2 ) );   
        if (disescu3<=20)
        {
            balaY=530;
            disparo=0;
            teclaespacio=32;
            escucambio3++;
            if (escucambio3>=3)        
            {
                escudo3.setCoordY(-2000);
                g.drawImage(imgEscudo3, escudo3.getCoordX()-1000,escudo3.getCoordY()-4000,30,40,this);
            }   
        }
        disescu3b= Math.sqrt(Math.pow(escudo3b.getCoordX()+15 - coordxnave,2) + Math.pow(escudo3b.getCoordY()+20 - balaY,2 ) );   
        if (disescu3b<=20)
        {
            balaY=530;
            disparo=0;
            teclaespacio=32;
            escucambio3b++;
            if (escucambio3b>=3)        
            {
                escudo3b.setCoordY(-2000);
                g.drawImage(imgEscudo3, escudo3b.getCoordX()-1000,escudo3b.getCoordY()-4000,30,40,this);
            }   
        }
        disescu3c= Math.sqrt(Math.pow(escudo3c.getCoordX()+15 - coordxnave,2) + Math.pow(escudo3c.getCoordY()+20 - balaY,2 ) );   
        if (disescu3c<=20)
        {
            balaY=530;
            disparo=0;
            teclaespacio=32;
            escucambio3c++;
            if (escucambio3c>=3)        
            {
                escudo3c.setCoordY(-2000);
                g.drawImage(imgEscudo3, escudo3c.getCoordX()-1000,escudo3c.getCoordY()-4000,30,40,this);
            }   
        }
            
      
        
        //////////////////////////////// invade superorir
        
        g.drawImage(imgInvadersup, invadersup.getCoordX(),invadersup.getCoordY(),40,30,this);
        
        randomsup2=(int)(Math.random()*1000);
        randomsup3=(int)(Math.random()*1000);
        random5=(int)(Math.random()*200+1);
        
        
        if (randomsup==1)
        {
            invadersup.setCoordX(invadersup.getCoordX()+10);
        }
        
        if (randomsup==-1)
        {
            invadersup.setCoordX(invadersup.getCoordX()-10);
        }
        
        if(invadersup.getCoordX()< (-1000-randomsup2) || invadersup.getCoordX()>(1000+randomsup3) )
        {
            randomsup*=-1;
        }
        
        distanciasup= Math.sqrt(Math.pow(invadersup.getCoordX()+20 - coordxnave,2) + Math.pow(invadersup.getCoordY()+15 - balaY,2 ) );   
        if (distanciasup<=25)
        {
            balaY=530;
            disparo=0;
            teclaespacio=32;
            invadersup.setCoordX(-1000);
            marcador+=random5;
        }
        ///////////////////////////
        
        if(dispinvader.getCoordY() <= -100)   
        {
            random8 = (int)(Math.random()*8+1);
            if(random8==8)
                random8=0;                
            if(invader3[random8].getAparecer() == true )
            {
                dispinvader.setCoordX(invader3[random8].getCoordX()+22);
                dispinvader.setCoordY(invader3[random8].getCoordY()+30);  
            }   
        }
            
        dispinvader.setCoordY(dispinvader.getCoordY()+35);
         
        disbalanave1= Math.sqrt(Math.pow(dispinvader.getCoordX()+5 - escudo1.getCoordX(),2) + Math.pow(dispinvader.getCoordY()+10 - escudo1.getCoordY(),2 ) );
        if(disbalanave1<=30)
        {
            dispinvader.setCoordX(0);
            dispinvader.setCoordY(-100);
            escucambio1++;
            if (escucambio1>=3)        
            {
                escudo1.setCoordY(-2000);
                g.drawImage(imgEscudo3, escudo1.getCoordX()-1000,escudo1.getCoordY()-4000,30,40,this);
            }
        }
        
        disbalanave1b= Math.sqrt(Math.pow(dispinvader.getCoordX()+5 - escudo1b.getCoordX(),2) + Math.pow(dispinvader.getCoordY()+10 - escudo1b.getCoordY(),2 ) );
        if(disbalanave1b<=30)
        {
            dispinvader.setCoordX(0);
            dispinvader.setCoordY(-100);
            escucambio1b++;
            if (escucambio1b>=3)        
            {
                escudo1b.setCoordY(-2000);
                g.drawImage(imgEscudo3, escudo1b.getCoordX()-1000,escudo1b.getCoordY()-4000,30,40,this);
            }
        }
        
        disbalanave1c= Math.sqrt(Math.pow(dispinvader.getCoordX()+5 - escudo1c.getCoordX(),2) + Math.pow(dispinvader.getCoordY()+10 - escudo1c.getCoordY(),2 ) );
        if(disbalanave1c<=30)
        {
            dispinvader.setCoordX(0);
            dispinvader.setCoordY(-100);
            escucambio1c++;
            if (escucambio1c>=3)        
            {
                escudo1c.setCoordY(-2000);
                g.drawImage(imgEscudo3, escudo1c.getCoordX()-1000,escudo1c.getCoordY()-4000,30,40,this);
            }
        }
        
        disbalanave2= Math.sqrt(Math.pow(dispinvader.getCoordX()+5 - escudo2.getCoordX(),2) + Math.pow(dispinvader.getCoordY()+10 - escudo2.getCoordY(),2 ) );
        if(disbalanave2<=30)
        {
            dispinvader.setCoordX(0);
            dispinvader.setCoordY(-100);
            escucambio2++;
            if (escucambio2>=3)        
            {
                escudo2.setCoordY(-2000);
                g.drawImage(imgEscudo3, escudo2.getCoordX()-1000,escudo2.getCoordY()-4000,30,40,this);
            }
        }
        
        disbalanave2b= Math.sqrt(Math.pow(dispinvader.getCoordX()+5 - escudo2b.getCoordX(),2) + Math.pow(dispinvader.getCoordY()+10 - escudo2b.getCoordY(),2 ) );
        if(disbalanave2b<=30)
        {
            dispinvader.setCoordX(0);
            dispinvader.setCoordY(-100);
            escucambio2b++;
            if (escucambio2b>=3)        
            {
                escudo2b.setCoordY(-2000);
                g.drawImage(imgEscudo3, escudo2b.getCoordX()-1000,escudo2b.getCoordY()-4000,30,40,this);
            }
        }
        
        disbalanave2c= Math.sqrt(Math.pow(dispinvader.getCoordX()+5 - escudo2c.getCoordX(),2) + Math.pow(dispinvader.getCoordY()+10 - escudo2c.getCoordY(),2 ) );
        if(disbalanave2c<=30)
        {
            dispinvader.setCoordX(0);
            dispinvader.setCoordY(-100);
            escucambio2c++;
            if (escucambio2c>=3)        
            {
                escudo2c.setCoordY(-2000);
                g.drawImage(imgEscudo3, escudo2c.getCoordX()-1000,escudo2c.getCoordY()-4000,30,40,this);
            }
        }
        
        disbalanave3= Math.sqrt(Math.pow(dispinvader.getCoordX()+5 - escudo3.getCoordX(),2) + Math.pow(dispinvader.getCoordY()+10 - escudo3.getCoordY(),2 ) );
        if(disbalanave3<=30)
        {
            dispinvader.setCoordX(0);
            dispinvader.setCoordY(-100);
            escucambio3++;
            if (escucambio3>=3)        
            {
                escudo3.setCoordY(-2000);
                g.drawImage(imgEscudo3, escudo3.getCoordX()-1000,escudo3.getCoordY()-4000,30,40,this);
            }
        }
        
        disbalanave3b= Math.sqrt(Math.pow(dispinvader.getCoordX()+5 - escudo3b.getCoordX(),2) + Math.pow(dispinvader.getCoordY()+10 - escudo3b.getCoordY(),2 ) );
        if(disbalanave3b<=30)
        {
            dispinvader.setCoordX(0);
            dispinvader.setCoordY(-100);
            escucambio3b++;
            if (escucambio3b>=3)        
            {
                escudo3b.setCoordY(-2000);
                g.drawImage(imgEscudo3, escudo3b.getCoordX()-1000,escudo3b.getCoordY()-4000,30,40,this);
            }
        }
        
        disbalanave3c= Math.sqrt(Math.pow(dispinvader.getCoordX()+5 - escudo3c.getCoordX(),2) + Math.pow(dispinvader.getCoordY()+10 - escudo3c.getCoordY(),2 ) );
        if(disbalanave3c<=30)
        {
            dispinvader.setCoordX(0);
            dispinvader.setCoordY(-100);
            escucambio3c++;
            if (escucambio3c>=3)        
            {
                escudo3c.setCoordY(-2000);
                g.drawImage(imgEscudo3, escudo3c.getCoordX()-1000,escudo3c.getCoordY()-4000,30,40,this);
            }
        }
        
        disbalanave10 = Math.sqrt(Math.pow(dispinvader.getCoordX()+5 - tank.getCoordX(),2) + Math.pow(dispinvader.getCoordY()+10 - tank.getCoordY(),2 ) );
        if(disbalanave10<=30)
        {
            vidas--;
            dispinvader.setCoordX(0);
            dispinvader.setCoordY(-100);
            tank.setCoordX(375);
            
        }
            
            
        else if (dispinvader.getCoordY()>800)
        {
            dispinvader.setCoordX(0);
            dispinvader.setCoordY(-100);
        }
        
        if (ganaste==48)
        {
            g.drawImage(imgGanaste, 0, 0, 800,600 ,this);
            temporizador.stop();
        }
        
        if (vidas==0)
        {
            g.drawImage(imgPerdiste, 0, 0, 800,600 ,this);
            temporizador.stop();
        }
        
        //////////////////////////////////// marcador
        
        g.setColor(Color.white);
        g.setFont(new Font("Arial", Font.ITALIC,20));//fuente estilo, tipo de fuente, tamanio// plain es standar
        g.drawString("Score: ", 650, 70);
        g.drawString(String.valueOf(marcador), 730, 70);
        g.drawString("Lives: ", 20, 70);
        g.drawString(String.valueOf(vidas), 90, 70);
        
               
    }
    
    Timer temporizador = new Timer(100, new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            even*=-1; //para que vaya alternando entre 1 y -1
            /*locationX+=sign*5; //le suma signo por 10
            if(invader1[0].getCoordX() < 20 || invader1[6].getCoordX() > 750) // si es mayor de 20 o 750 signo por menos uno es para que vaya alternandoo
            {
                sign*=-1;
                //locationY+=20; // suma la locacion de y para que vaya bajando
                
                for (int i=0 ; i<7 ; i++)
                {
                    invader1[i].setCoordY(invader1[i].getCoordY()+5);
                    invader2[i].setCoordY(invader2[i].getCoordY()+5);
                    invader3[i].setCoordY(invader3[i].getCoordY()+5);
                }
                /*invader1.setCoordY(locationY+200); // como cambio el valor va actualizando Y
                invader2.setCoordY(locationY+100);
                invader3.setCoordY(locationY);
            }*/
            if (movhorizontal==1)
            {
                for (int i=0 ; i<8 ; i++)
                {
                    invader1[i].setCoordX(invader1[i].getCoordX()+4);
                    invader1b[i].setCoordX(invader1b[i].getCoordX()+4);
                    invader2[i].setCoordX(invader2[i].getCoordX()+4);
                    invader2b[i].setCoordX(invader2b[i].getCoordX()+4);
                    invader3[i].setCoordX(invader3[i].getCoordX()+4);
                    invader3b[i].setCoordX(invader3b[i].getCoordX()+4);
                }                
            }
            if (movhorizontal==-1)
            {
                for (int i=0 ; i<8 ; i++)
                {
                    invader1[i].setCoordX(invader1[i].getCoordX()-4);
                    invader1b[i].setCoordX(invader1b[i].getCoordX()-4);
                    invader2[i].setCoordX(invader2[i].getCoordX()-4);
                    invader2b[i].setCoordX(invader2b[i].getCoordX()-4);
                    invader3[i].setCoordX(invader3[i].getCoordX()-4);
                    invader3b[i].setCoordX(invader3b[i].getCoordX()-4);
                }                
            }
            
                       
            for (int j=0; j<8; j++)
            {
                if (invader3[j].getCoordX() < 20 || invader3[j].getCoordX() > 740 ||
                    invader2[j].getCoordX() < 20 || invader2[j].getCoordX() > 740 ||
                    invader1[j].getCoordX() < 20 || invader1[j].getCoordX() > 740 ||
                    invader3b[j].getCoordX() < 20 || invader3b[j].getCoordX() > 740 ||
                    invader2b[j].getCoordX() < 20 || invader2b[j].getCoordX() > 740 ||
                    invader1b[j].getCoordX() < 20 || invader1b[j].getCoordX() > 740)
                {
                    movhorizontal*=-1;
                    for (int i=0 ; i<8 ; i++)
                    {
                        invader1[i].setCoordY(invader1[i].getCoordY()+3);
                        invader1b[i].setCoordY(invader1b[i].getCoordY()+3);
                        invader2[i].setCoordY(invader2[i].getCoordY()+3);
                        invader2b[i].setCoordY(invader2b[i].getCoordY()+3);
                        invader3[i].setCoordY(invader3[i].getCoordY()+3);
                        invader3b[i].setCoordY(invader3b[i].getCoordY()+3);
                    }
                }
            }
            
               
            
            /*invader1.setCoordX(locationX); // actualiza la coord en x de cada invasor
            invader2.setCoordX(locationX);
            invader3.setCoordX(locationX);*/
            
            ////distancia bala invader
            /*for (int i=0 ; i<7 ; i++)
            {
                distancia1= Math.sqrt(Math.pow(invader1[i].getCoordX()+20 - coordxnave,2) + Math.pow(invader1[i].getCoordY()+15 - balaY,2 ) );   
                if (distancia1<=20)
                {
                    balaY=530;
                    disparo=0;
                    teclaespacio=32;
                    invader1[i].setAparecer(false);
                                    
                }
                else if(balaY<0)
                {
                    balaY=530;
                    disparo=0;
                    teclaespacio=32;
                }
            }*/
            //distancia1= Math.sqrt(Math.pow(invader1.getCoordX()+20 - coordxnave,2) + Math.pow(invader1.getCoordY()+15 - balaY,2 ) );
            /////////////////////////////////////////////////////////////////////////////////////////////////////////////
            ////////////////////////////////////////////////////// analisis de disyancia entre el invader y el misil
        for (int i=0 ; i<8 ; i++)
        {
            distancia1= Math.sqrt(Math.pow(invader1[i].getCoordX()+20 - coordxnave,2) + Math.pow(invader1[i].getCoordY()+15 - balaY,2 ) );   
            if (distancia1<=25)
            {
                balaY=530;
                disparo=0;
                teclaespacio=32;
                invader1[i].setAparecer(false);
                invader1[i].setCoordX(250);
                invader1[i].setCoordY(-2000);
                marcador+=10;
                ganaste++;
            }

            distancia1b= Math.sqrt(Math.pow(invader1b[i].getCoordX()+20 - coordxnave,2) + Math.pow(invader1b[i].getCoordY()+15 - balaY,2 ) );   
            if (distancia1b<=25)
            {
                balaY=530;
                disparo=0;
                teclaespacio=32;
                invader1b[i].setAparecer(false);
                invader1b[i].setCoordX(250);
                invader1b[i].setCoordY(-2000);
                marcador+=10;
                ganaste++;

            }
                ///////////////////////////////////////////////////////////////

            distancia2= Math.sqrt(Math.pow(invader2[i].getCoordX()+20 - coordxnave,2) + Math.pow(invader2[i].getCoordY()+15 - balaY,2 ) );   
            if (distancia2<=25)
            {
                balaY=530;
                disparo=0;
                teclaespacio=32;
                invader2[i].setAparecer(false);
                invader2[i].setCoordX(250);
                invader2[i].setCoordY(-2500);
                marcador+=20;
                ganaste++;
            }
            distancia2b= Math.sqrt(Math.pow(invader2b[i].getCoordX()+20 - coordxnave,2) + Math.pow(invader2b[i].getCoordY()+15 - balaY,2 ) );   
            if (distancia2b<=25)
            {
                balaY=530;
                disparo=0;
                teclaespacio=32;
                invader2b[i].setAparecer(false);
                invader2b[i].setCoordX(250);
                invader2b[i].setCoordY(-2500);           
                marcador+=20;
                ganaste++;
            }
            ////////////////////////////////////////

            distancia3= Math.sqrt(Math.pow(invader3[i].getCoordX()+20 - coordxnave,2) + Math.pow(invader3[i].getCoordY()+15 - balaY,2 ) );   
            if (distancia3<=25)
            {
                balaY=530;
                disparo=0;
                teclaespacio=32;
                invader3[i].setAparecer(false);
                invader3[i].setCoordX(250);
                invader3[i].setCoordY(-3000);
                marcador+=30;
                ganaste++;
            }
            distancia3b= Math.sqrt(Math.pow(invader3b[i].getCoordX()+20 - coordxnave,2) + Math.pow(invader3b[i].getCoordY()+15 - balaY,2 ) );   
            if (distancia3b<=25)
            {
                balaY=530;
                disparo=0;
                teclaespacio=32;
                invader3b[i].setAparecer(false);
                invader3b[i].setCoordX(250);
                invader3b[i].setCoordY(-3000);
                marcador+=30;
                ganaste++;
            }
            else if(balaY<0)
            {
                balaY=530;
                disparo=0;
                teclaespacio=32;
            }
        }
            ///////////////////////////////////////////////////////////////////////////////////////////////
            
            
            
            
            System.out.print(distancia1);
            if (disparo==1)
            {
                balaY-=50;
                             
            }
            
            if(tank.getCoordX()<0)
                tank.setCoordX(0);
            if(tank.getCoordX()>750)
                tank.setCoordX(750);
                     
            repaint(); // se llama al repaint
          
            
        }
    });
    
    
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setPreferredSize(new java.awt.Dimension(800, 600));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 554, Short.MAX_VALUE)
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
            java.util.logging.Logger.getLogger(FrmSpace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmSpace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmSpace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmSpace.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmSpace().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
