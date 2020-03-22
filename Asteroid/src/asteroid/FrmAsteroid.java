package asteroid;

import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.awt.image.AffineTransformOp;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
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
public class FrmAsteroid extends javax.swing.JFrame implements KeyListener{
    int asteroideposX = (int)(Math.random()*800+1);
    int asteroideposY = (int)(Math.random()*600+1);
    
    int vidas=3;
    
    int aparecer;
    int aparecer2;
    int aparecer3;
    int aparecer4;
    int aparecer5;
    
    int desap= (int)(Math.random()*800+1);
    int desap2= (int)(Math.random()*800+1);
    int desap3= (int)(Math.random()*800+1);
    int desap4= (int)(Math.random()*800+1);
    int desap5= (int)(Math.random()*800+1);
    int desap6= (int)(Math.random()*800+1);
    int desapY= (int)(Math.random()*600+1);
    int desap2Y= (int)(Math.random()*600+1);
    int desap3Y= (int)(Math.random()*600+1);
    int desap4Y= (int)(Math.random()*600+1);
    int desap5Y= (int)(Math.random()*600+1);
    int desap6Y= (int)(Math.random()*600+1);
    
    ////////////888888888888888888888888
    int asteroideposX2 = (int)(Math.random()*800+1);
    int asteroideposY2 = (int)(Math.random()*600+1);
    Objeto asteroide2 = new Objeto(asteroideposX2,asteroideposY2,0,0,0);
    int signo2= (int)(Math.random()*20+1);
    int signoaste2;
    int velocidadaste2= (int)(Math.random()*20+1);
    double distancia3;
    double distancia4;
    /////////////8888888888888888888888
    
    ////////////888888888888888888888888
    int asteroideposX3 = (int)(Math.random()*800+1);
    int asteroideposY3 = (int)(Math.random()*600+1);
    Objeto asteroide3 = new Objeto(asteroideposX3,asteroideposY3,0,0,0);
    int signo3= (int)(Math.random()*20+1);
    int signoaste3;
    int velocidadaste3= (int)(Math.random()*20+1);
    double distancia5;
    double distancia6;
    int colision3;
    /////////////8888888888888888888888
    
     ////////////888888888888888888888888
    int asteroideposX4 = (int)(Math.random()*800+1);
    int asteroideposY4 = (int)(Math.random()*600+1);
    Objeto asteroide4 = new Objeto(asteroideposX4,asteroideposY4,0,0,0);
    int signo4= (int)(Math.random()*20+1);
    int signoaste4;
    int velocidadaste4= (int)(Math.random()*20+1);
    double distancia7;
    double distancia8;
    int colision4;
    /////////////8888888888888888888888
    
     ////////////888888888888888888888888
    int asteroideposX5 = (int)(Math.random()*800+1);
    int asteroideposY5 = (int)(Math.random()*600+1);
    Objeto asteroide5 = new Objeto(asteroideposX5,asteroideposY5,0,0,0);
    int signo5= (int)(Math.random()*20+1);
    int signoaste5;
    int velocidadaste5= (int)(Math.random()*20+1);
    double distancia9;
    double distancia10;
    int colision5;
    /////////////8888888888888888888888
    
    ////////////888888888888888888888888
    int asteroideposX6 = (int)(Math.random()*800+1);
    int asteroideposY6 = (int)(Math.random()*600+1);
    Objeto asteroide6 = new Objeto(asteroideposX6,asteroideposY6,0,0,0);
    int signo6= (int)(Math.random()*20+1);
    int signoaste6;
    int velocidadaste6= (int)(Math.random()*20+1);
    double distancia11;
    double distancia12;
    int colision6;
    /////////////8888888888888888888888
    
    
    
    int signo= (int)(Math.random()*20+1);
    int residuo;
    int signoaste;
    int velocidadaste= (int)(Math.random()*20+1);
    // sistema de choque
    double distancia;
    int colision,colision2;
    int exploX,exploY;
    int coorX=0;//imagenes de dondo repetición
    int coorX2=-640; //imagenes de dondo repetición
    int cambio=0; //cambio de nave a llamas
    int aste=0;
    
    int nbala=0;
    
    Objeto nave = new Objeto(345,300,0,0,0);
    Objeto asteroide = new Objeto(asteroideposX,asteroideposY,0,0,0);
    Objeto bala = new Objeto (345,300,0,0,0);
    //bala
    double blastX[]={100,0,0,0,0,0};
    double blastY[]={100,0,0,0,0,0};
    double accBlastX[]={0,0,0,0,0,0};
    double accBlastY[]={0,0,0,0,0,0};
    byte disparo[]={0,0,0,0,0,0};
    byte contadorDisparo[]={0,0,0,0,0,0};
    byte elemento=0;
    int contador=0;
    int disparador=0;
    double distancia2=0;
        
    /**
     * Creates new form FrmAsteroid
     */
    
    public FrmAsteroid() {
        initComponents();
        addKeyListener(this);
            
    }
    
    public void keyTyped(KeyEvent e) {}
    public void keyReleased(KeyEvent e) 
    {
        if (e.getKeyCode()==38)
            cambio=0;
                    
        
    }
    public void keyPressed(KeyEvent e)
    {
       System.out.println(e.getKeyCode());
       
       if (e.getKeyCode()==39)
       {
           nave.setAngulo(nave.getAngulo()+20); // para girar a la derecha
                             
       }
       if (e.getKeyCode()==37)
       {
           nave.setAngulo(nave.getAngulo()-20); // para girar a la izquierda                   
           
       }
       
       if (e.getKeyCode()==38)
       {
           cambio=1;
           nave.setAccX(Math.cos(Math.toRadians(nave.getAngulo()%360))*9.99); // 5.99 es el valor opcional de aceleracion
           nave.setAccY(Math.sin(Math.toRadians(nave.getAngulo()%360))*9.99);
                            
       }
       if (e.getKeyCode()==32)
        {
            elemento++;
            
            if (elemento>5)
            {
                elemento=0;
            }
            
            accBlastX[elemento]= Math.cos(Math.toRadians(nave.getAngulo()%360))*15;
            accBlastY[elemento]= Math.sin(Math.toRadians(nave.getAngulo()%360))*15;
            disparo[elemento]=1;
            
            
        }

       
    }
    

    
    
    public void paint(Graphics g)
    {
        BufferedImage imgNebula=null;
        BufferedImage imgDebris=null;
        BufferedImage imgAsteroid=null;
        BufferedImage imgShip=null;
        BufferedImage imgShot=null;
        BufferedImage imgExplosion=null;
        BufferedImage imgShip2=null;
        
                
        try {
            //imgNebula = ImageIO.read(new File(this.getClass().getResource(nebula_blue.png))); // en el try se pone todo el codigo que se queire ejecutar
            imgNebula = ImageIO.read(new File("c:/Asteroids/nebula_blue.png"));
            imgDebris = ImageIO.read(new File("c:/Asteroids/debris2_blue.png"));
            imgShip = ImageIO.read(new File("c:/Asteroids/nave1.png"));
            imgShip2 = ImageIO.read(new File("c:/Asteroids/nave2.png"));
            imgAsteroid = ImageIO.read(new File("c:/Asteroids/asteroid_blue.png"));
            imgExplosion = ImageIO.read(new File("c:/Asteroids/explosion.hasgraphics.png"));
            imgShot = ImageIO.read(new File("c:/Asteroids/shot1.png"));
            
        } catch (IOException ex) {
            Logger.getLogger(FrmAsteroid.class.getName()).log(Level.SEVERE, null, ex); // codigo que se debe ejecutar en caso de que haya error
        }
        /*finally //se ejecuta haya o no error
        {
            
        }*/
        
        super.paint(g);
        g.drawImage(imgNebula, 0, 0, 800, 600,this);//nebula
        g.drawImage(imgDebris, coorX, 100, 640, 480,this);//nebula
        g.drawImage(imgDebris, coorX2, 100, 640, 480,this);//nebula
        
        // movimineoto de la nave
        nave.setDrawLocationX(nave.getDrawLocationX()+nave.getAccX());
        nave.setDrawLocationY(nave.getDrawLocationY()+nave.getAccY()); //modificando la posicion de la nave
        
        
        // movimiento de los asteroides
        if (signo%2==0)
        {
            signoaste=-1;
        }
            
        else
        {
            signoaste=1;
        }
        
        // movimiento y rotacion del asteroide
        asteroide.setDrawLocationX(asteroide.getDrawLocationX()+ signoaste * velocidadaste);
        asteroide.setDrawLocationY(asteroide.getDrawLocationY()+ signoaste * velocidadaste);
        asteroide.setAccX(Math.cos(Math.toRadians(asteroide.getAngulo()%360))* 3.99); // 5.99 es el valor opcional de aceleracion
        asteroide.setAccY(Math.sin(Math.toRadians(asteroide.getAngulo()%360))* 3.99);
        
        ///////////////////////8888888888888888888888888888888888
        // movimiento de los asteroides
        if (signo2%2==0)
        {
            signoaste2=-1;
        }
            
        else
        {
            signoaste2=1;
        }
        
        // movimiento y rotacion del asteroide
        asteroide2.setDrawLocationX(asteroide2.getDrawLocationX()+ signoaste2 * velocidadaste2);
        asteroide2.setDrawLocationY(asteroide2.getDrawLocationY()+ signoaste2 * velocidadaste2);
        asteroide2.setAccX(Math.cos(Math.toRadians(asteroide2.getAngulo()%360))* 3.99); // 5.99 es el valor opcional de aceleracion
        asteroide2.setAccY(Math.sin(Math.toRadians(asteroide2.getAngulo()%360))* 3.99);
        /////////////////////8888888888888888888888888888
        
        ///////////////////////8888888888888888888888888888888888
        // movimiento de los asteroides
        if (signo3%2==0)
        {
            signoaste3=-1;
        }
            
        else
        {
            signoaste3=1;
        }
        
        // movimiento y rotacion del asteroide
        asteroide3.setDrawLocationX(asteroide3.getDrawLocationX()+ signoaste3 * velocidadaste3);
        asteroide3.setDrawLocationY(asteroide3.getDrawLocationY()+ signoaste3 * velocidadaste3);
        asteroide3.setAccX(Math.cos(Math.toRadians(asteroide3.getAngulo()%360))* 3.99); // 5.99 es el valor opcional de aceleracion
        asteroide2.setAccY(Math.sin(Math.toRadians(asteroide3.getAngulo()%360))* 3.99);
        /////////////////////8888888888888888888888888888
        
        ///////////////////////8888888888888888888888888888888888
        // movimiento de los asteroides
        if (signo4%2==0)
        {
            signoaste4=-1;
        }
            
        else
        {
            signoaste4=1;
        }
        
        // movimiento y rotacion del asteroide
        asteroide4.setDrawLocationX(asteroide4.getDrawLocationX()+ signoaste4 * velocidadaste4);
        asteroide4.setDrawLocationY(asteroide4.getDrawLocationY()+ signoaste4 * velocidadaste4);
        asteroide4.setAccX(Math.cos(Math.toRadians(asteroide4.getAngulo()%360))* 3.99); // 5.99 es el valor opcional de aceleracion
        asteroide4.setAccY(Math.sin(Math.toRadians(asteroide4.getAngulo()%360))* 3.99);
        /////////////////////8888888888888888888888888888
        
        ///////////////////////8888888888888888888888888888888888
        // movimiento de los asteroides
        if (signo5%2==0)
        {
            signoaste5=-1;
        }
            
        else
        {
            signoaste5=1;
        }
        
        // movimiento y rotacion del asteroide
        asteroide5.setDrawLocationX(asteroide5.getDrawLocationX()+ signoaste5 * velocidadaste5);
        asteroide5.setDrawLocationY(asteroide5.getDrawLocationY()+ signoaste5 * velocidadaste5);
        asteroide5.setAccX(Math.cos(Math.toRadians(asteroide5.getAngulo()%360))* 3.99); // 5.99 es el valor opcional de aceleracion
        asteroide5.setAccY(Math.sin(Math.toRadians(asteroide5.getAngulo()%360))* 3.99);
        /////////////////////8888888888888888888888888888
        
        ///////////////////////8888888888888888888888888888888888
        // movimiento de los asteroides
        if (signo6%2==0)
        {
            signoaste6=-1;
        }
            
        else
        {
            signoaste6=1;
        }
        
        // movimiento y rotacion del asteroide
        asteroide6.setDrawLocationX(asteroide6.getDrawLocationX()+ signoaste6 * velocidadaste6);
        asteroide6.setDrawLocationY(asteroide6.getDrawLocationY()+ signoaste6 * velocidadaste6);
        asteroide6.setAccX(Math.cos(Math.toRadians(asteroide6.getAngulo()%360))* 3.99); // 5.99 es el valor opcional de aceleracion
        asteroide6.setAccY(Math.sin(Math.toRadians(asteroide6.getAngulo()%360))* 3.99);
        /////////////////////8888888888888888888888888888
        
        System.out.print(asteroide.getDrawLocationX());
        System.out.print(asteroide.getDrawLocationY());
// Rotation information

        // para que aparezca la nave con llamas o sin llamas

        if (cambio==0)
        {
            double rotationRequired = Math.toRadians(nave.getAngulo()); // pasar de grados a radianes
            double locationX = imgShip.getWidth() / 2; // obtener el centor de la imagen
            double locationY = imgShip.getHeight() / 2;
            AffineTransform tx = AffineTransform.getRotateInstance(rotationRequired, locationX, locationY);
            AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
            Graphics2D g2=(Graphics2D) g; //convertr g en una g2
            // Drawing the rotated image at the required drawing locations
            g2.drawImage(op.filter(imgShip, null), (int)nave.getDrawLocationX(), (int)nave.getDrawLocationY(), null);
        }
        else if (cambio==1)
        {
            double rotationRequired = Math.toRadians(nave.getAngulo()); // pasar de grados a radianes
            double locationX = imgShip.getWidth() / 2; // obtener el centor de la imagen
            double locationY = imgShip.getHeight() / 2;
            AffineTransform tx = AffineTransform.getRotateInstance(rotationRequired, locationX, locationY);
            AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
            Graphics2D g2=(Graphics2D) g; //convertr g en una g2
            // Drawing the rotated image at the required drawing locations
            g2.drawImage(op.filter(imgShip2, null), (int)nave.getDrawLocationX(), (int)nave.getDrawLocationY(), null);
            
        }
        
        // para que aparezca el asteroide
            
        if (aste==0)
        {
            double rotationRequired = Math.toRadians(asteroide.getAngulo()); // pasar de grados a radianes
            double locationX = imgAsteroid.getWidth() / 2; // obtener el centor de la imagen
            double locationY = imgAsteroid.getHeight() / 2;
            AffineTransform tx = AffineTransform.getRotateInstance(rotationRequired, locationX, locationY);
            AffineTransformOp op = new AffineTransformOp(tx, AffineTransformOp.TYPE_BILINEAR);
            Graphics2D g2=(Graphics2D) g; //convertr g en una g2
            // Drawing the rotated image at the required drawing locations
            if (colision==0)
            {
                g2.drawImage(op.filter(imgAsteroid, null), (int)asteroide.getDrawLocationX(), (int)asteroide.getDrawLocationY(), null);
                
            }
            else // codigo para cambiar la imagen de explosion
            {
                g.drawImage(imgExplosion, (int)asteroide.getDrawLocationX(), (int)asteroide.getDrawLocationY(), (int)asteroide.getDrawLocationX()+90, (int)asteroide.getDrawLocationY()+90, exploX, exploY, exploX+100, exploY+100, this);
                asteroide.setDrawLocationX(desap);
                asteroide.setDrawLocationY(desapY);
            }
            /////////////////////8888888888888
            if (aparecer>100)
            {
                if (colision2==0)
                {
                    g2.drawImage(op.filter(imgAsteroid, null), (int)asteroide2.getDrawLocationX(), (int)asteroide2.getDrawLocationY(), null);
                }
                else
                {
                    g.drawImage(imgExplosion, (int)asteroide2.getDrawLocationX(), (int)asteroide2.getDrawLocationY(), (int)asteroide2.getDrawLocationX()+90, (int)asteroide2.getDrawLocationY()+90, exploX, exploY, exploX+100, exploY+100, this);
                    asteroide2.setDrawLocationX(desap2);
                    asteroide2.setDrawLocationY(desap2Y);
                }
            }
            
            //////////////////////88888888
            if (aparecer2>200)
            {
                if (colision3==0)
                {
                    g2.drawImage(op.filter(imgAsteroid, null), (int)asteroide3.getDrawLocationX(), (int)asteroide3.getDrawLocationY(), null);
                }
                else
                {
                    g.drawImage(imgExplosion, (int)asteroide3.getDrawLocationX(), (int)asteroide3.getDrawLocationY(), (int)asteroide3.getDrawLocationX()+90, (int)asteroide3.getDrawLocationY()+90, exploX, exploY, exploX+100, exploY+100, this);
                    asteroide3.setDrawLocationX(-desap3);
                    asteroide3.setDrawLocationY(-desap3Y);
                }
            }
            
            /////////////////////8888888888888
            if (aparecer3>300)
            {
                if (colision4==0)
                {
                    g2.drawImage(op.filter(imgAsteroid, null), (int)asteroide4.getDrawLocationX(), (int)asteroide4.getDrawLocationY(), null);
                }
                else
                {
                    g.drawImage(imgExplosion, (int)asteroide4.getDrawLocationX(), (int)asteroide4.getDrawLocationY(), (int)asteroide4.getDrawLocationX()+90, (int)asteroide4.getDrawLocationY()+90, exploX, exploY, exploX+100, exploY+100, this);
                    asteroide4.setDrawLocationX(desap4);
                    asteroide4.setDrawLocationY(desap4Y);
                }
            }
            
            //////////////////////88888888
            /////////////////////8888888888888
            if (aparecer4>300)
            {
                 if (colision5==0)
                {
                    g2.drawImage(op.filter(imgAsteroid, null), (int)asteroide5.getDrawLocationX(), (int)asteroide5.getDrawLocationY(), null);
                }
                else
                {
                    g.drawImage(imgExplosion, (int)asteroide5.getDrawLocationX(), (int)asteroide5.getDrawLocationY(), (int)asteroide5.getDrawLocationX()+90, (int)asteroide5.getDrawLocationY()+90, exploX, exploY, exploX+100, exploY+100, this);
                    asteroide5.setDrawLocationX(-desap5);
                    asteroide5.setDrawLocationY(-desap5Y);
                }
            }
           
            //////////////////////88888888
            /////////////////////8888888888888
            if (aparecer5>400)
            {
                if (colision6==0)
                {
                    g2.drawImage(op.filter(imgAsteroid, null), (int)asteroide6.getDrawLocationX(), (int)asteroide6.getDrawLocationY(), null);
                }
                else
                {
                    g.drawImage(imgExplosion, (int)asteroide6.getDrawLocationX(), (int)asteroide6.getDrawLocationY(), (int)asteroide6.getDrawLocationX()+90, (int)asteroide6.getDrawLocationY()+90, exploX, exploY, exploX+100, exploY+100, this);
                    asteroide6.setDrawLocationX(desap6);
                    asteroide6.setDrawLocationY(desap6Y);
                }
            }
            
            //////////////////////88888888
            
        }            
            
            
        /// para que aparezca la bala
        
        bala.setDrawLocationY(nave.getDrawLocationY() + (signo*velocidadaste));
        bala.setDrawLocationX(nave.getDrawLocationX() + (signo*velocidadaste)); //movimiento de la bala
        
        
        for (int i=0 ; i<=5 ; i++)
        {
            if (blastX[i]<0)
            {
                blastX[i]=799;
            }
                
            if (blastY[i]<0)
            {
                blastY[i]=499;
            }
                
            blastX[i]=blastX[i]%800;
            blastY[i]=blastY[i]%600;
        }
        
        double rotationBlast[]={0,0,0,0,0,0};
        {
            for (int i=0 ; i<=5 ; i++)
            {
                if (disparo[i]==1)
                {
                    rotationBlast[i]= Math.toRadians(contador);
                    blastX[i]=bala.getDrawLocationX()+37.5; //+37.5
                    blastY[i]=bala.getDrawLocationY()+35.5;
                    disparo[i]=2;
                }
            }
        }
        
        for(int i=0;i<=5;i++)
        {
            
            AffineTransform txBlast = AffineTransform.getRotateInstance(rotationBlast[i], 5, 5);
            AffineTransformOp opBlast = new AffineTransformOp(txBlast, AffineTransformOp.TYPE_BILINEAR);
            Graphics2D g2=(Graphics2D) g;
        
            if(disparo[i]==2)
            {
                blastX[i]+=accBlastX[i];
                blastY[i]+=accBlastY[i]; 
                
                g2.drawImage(opBlast.filter(imgShot, null), (int)blastX[i], (int)blastY[i], null);
                contadorDisparo[i]++;
                if(contadorDisparo[i]==20)
                {
                    disparo[i]=0;
                    contadorDisparo[i]=0;
                }
            }
        }
        
        
        
        
        

    }
    
    
    Timer temporizador = new Timer(1, new ActionListener()
    {
        public void actionPerformed(ActionEvent e)
        {
            aparecer++;
            aparecer2++;
            aparecer3++;
            aparecer4++;
            aparecer5++;
            
            //////////
            
            desap= (int)(Math.random()*800+1);
            desap2= (int)(Math.random()*800+1);
            desap3= (int)(Math.random()*800+1);
            desap4= (int)(Math.random()*800+1);
            desap5= (int)(Math.random()*800+1);
            desap6= (int)(Math.random()*800+1);
            desapY= (int)(Math.random()*600+1);
            desap2Y= (int)(Math.random()*600+1);
            desap3Y= (int)(Math.random()*600+1);
            desap4Y= (int)(Math.random()*600+1);
            desap5Y= (int)(Math.random()*600+1);
            desap6Y= (int)(Math.random()*600+1);

            // para que la imagen de fondo se repita
            coorX+=3; // imagen de asteroides de fondo
            coorX2+=3;
            
            if (coorX>640)
            {
                coorX=-640;
            }
            if (coorX2>640)
            {
                coorX2=-640;
            }
            
            //para que la nave aparezca en el frm de nuevo
            
            if (nave.getDrawLocationX()<0)
                nave.setDrawLocationX(799);
            if (nave.getDrawLocationY()<0)
                nave.setDrawLocationY(599);
            
            nave.setDrawLocationX(nave.getDrawLocationX()%800);
            nave.setDrawLocationY(nave.getDrawLocationY()%600);
            
            //rotacion del asteroide
            asteroide.setAngulo(asteroide.getAngulo()+ signoaste * velocidadaste);
            
            if (asteroide.getDrawLocationX()<0)
                asteroide.setDrawLocationX(799);
            if (asteroide.getDrawLocationY()<0)
                asteroide.setDrawLocationY(599);
            
            asteroide.setDrawLocationX(asteroide.getDrawLocationX()%800);
            asteroide.setDrawLocationY(asteroide.getDrawLocationY()%600);
            
            /////////////////888888888888888
            asteroide2.setAngulo(asteroide2.getAngulo()+ signoaste2 * velocidadaste2);
            
            if (asteroide2.getDrawLocationX()<0)
                asteroide2.setDrawLocationX(799);
            if (asteroide2.getDrawLocationY()<0)
                asteroide2.setDrawLocationY(599);
            
            asteroide2.setDrawLocationX(asteroide2.getDrawLocationX()%800);
            asteroide2.setDrawLocationY(asteroide2.getDrawLocationY()%600);
            
            distancia3= Math.sqrt(Math.pow(nave.getDrawLocationX() - asteroide2.getDrawLocationX(),2) + Math.pow(nave.getDrawLocationY()- asteroide2.getDrawLocationY(),2 ) );
            distancia4= Math.sqrt(Math.pow(blastX[elemento]- asteroide2.getDrawLocationX(),2) + Math.pow(blastY [elemento]- asteroide2.getDrawLocationY(),2 ) );
            
            if (distancia3 <=90 || distancia4<=85)
            {
                colision2=1;
                vidas--;
                exploX+=100;
                if (exploX>=900)
                {
                    exploX=0;
                    exploY+=100;
                                        
                }

            }
            else
            {
                colision2=0;
                exploX=0;
                exploY=0;
                
            }
            
            //////////////////////888888888888
             /////////////////888888888888888
            asteroide3.setAngulo(asteroide3.getAngulo()+ signoaste3 * velocidadaste3);
            
            if (asteroide3.getDrawLocationX()<0)
                asteroide3.setDrawLocationX(799);
            if (asteroide3.getDrawLocationY()<0)
                asteroide3.setDrawLocationY(599);
            
            asteroide3.setDrawLocationX(asteroide3.getDrawLocationX()%800);
            asteroide3.setDrawLocationY(asteroide3.getDrawLocationY()%600);
            
            distancia5= Math.sqrt(Math.pow(nave.getDrawLocationX() - asteroide3.getDrawLocationX(),2) + Math.pow(nave.getDrawLocationY()- asteroide3.getDrawLocationY(),2 ) );
            distancia6= Math.sqrt(Math.pow(blastX[elemento]- asteroide3.getDrawLocationX(),2) + Math.pow(blastY [elemento]- asteroide3.getDrawLocationY(),2 ) );
            
            if (distancia5 <=90 || distancia6<=85)
            {
                colision3=1;
                vidas--;
                exploX+=100;
                if (exploX>=900)
                {
                    exploX=0;
                    exploY+=100;
                                        
                }
            }
            else
            {
                colision3=0;
                exploX=0;
                exploY=0;   
            }
            //////////////////////888888888888
            
             /////////////////888888888888888
            asteroide4.setAngulo(asteroide4.getAngulo()+ signoaste4 * velocidadaste4);
            
            if (asteroide4.getDrawLocationX()<0)
                asteroide4.setDrawLocationX(799);
            if (asteroide4.getDrawLocationY()<0)
                asteroide4.setDrawLocationY(599);
            
            asteroide4.setDrawLocationX(asteroide4.getDrawLocationX()%800);
            asteroide4.setDrawLocationY(asteroide4.getDrawLocationY()%600);
            
            distancia7= Math.sqrt(Math.pow(nave.getDrawLocationX() - asteroide4.getDrawLocationX(),2) + Math.pow(nave.getDrawLocationY()- asteroide4.getDrawLocationY(),2 ) );
            distancia8= Math.sqrt(Math.pow(blastX[elemento]- asteroide4.getDrawLocationX(),2) + Math.pow(blastY [elemento]- asteroide4.getDrawLocationY(),2 ) );
            
            if (distancia7 <=90 || distancia8<=85)
            {
                colision4=1;
                vidas--;
                exploX+=100;
                if (exploX>=900)
                {
                    exploX=0;
                    exploY+=100;
                                        
                }
            }
            else
            {
                colision4=0;
                exploX=0;
                exploY=0;   
            }
            //////////////////////888888888888
            
             /////////////////888888888888888
            asteroide5.setAngulo(asteroide5.getAngulo()+ signoaste5 * velocidadaste5);
            
            if (asteroide5.getDrawLocationX()<0)
                asteroide5.setDrawLocationX(799);
            if (asteroide5.getDrawLocationY()<0)
                asteroide5.setDrawLocationY(599);
            
            asteroide5.setDrawLocationX(asteroide5.getDrawLocationX()%800);
            asteroide5.setDrawLocationY(asteroide5.getDrawLocationY()%600);
            
            distancia9= Math.sqrt(Math.pow(nave.getDrawLocationX() - asteroide5.getDrawLocationX(),2) + Math.pow(nave.getDrawLocationY()- asteroide5.getDrawLocationY(),2 ) );
            distancia10= Math.sqrt(Math.pow(blastX[elemento]- asteroide5.getDrawLocationX(),2) + Math.pow(blastY [elemento]- asteroide5.getDrawLocationY(),2 ) );
            
            if (distancia9 <=90 || distancia10<=85)
            {
                colision5=1;
                vidas--;
                exploX+=100;
                if (exploX>=900)
                {
                    exploX=0;
                    exploY+=100;
                                        
                }
            }
            else
            {
                colision5=0;
                exploX=0;
                exploY=0;   
            }
            //////////////////////888888888888
            
             /////////////////888888888888888
            asteroide6.setAngulo(asteroide6.getAngulo()+ signoaste6 * velocidadaste6);
            
            if (asteroide6.getDrawLocationX()<0)
                asteroide6.setDrawLocationX(799);
            if (asteroide6.getDrawLocationY()<0)
                asteroide6.setDrawLocationY(599);
            
            asteroide6.setDrawLocationX(asteroide6.getDrawLocationX()%800);
            asteroide6.setDrawLocationY(asteroide6.getDrawLocationY()%600);
            
            distancia11= Math.sqrt(Math.pow(nave.getDrawLocationX() - asteroide6.getDrawLocationX(),2) + Math.pow(nave.getDrawLocationY()- asteroide6.getDrawLocationY(),2 ) );
            distancia12= Math.sqrt(Math.pow(blastX[elemento]- asteroide6.getDrawLocationX(),2) + Math.pow(blastY [elemento]- asteroide6.getDrawLocationY(),2 ) );
            
            if (distancia11 <=90 || distancia12<=85)
            {
                colision6=1;
                vidas--;
                exploX+=100;
                if (exploX>=900)
                {
                    exploX=0;
                    exploY+=100;
                                        
                }
            }
            else
            {
                colision6=0;
                exploX=0;
                exploY=0;   
            }
            //////////////////////888888888888
            
            
            
            // analisis de choque
            
            distancia= Math.sqrt(Math.pow(nave.getDrawLocationX() - asteroide.getDrawLocationX(),2) + Math.pow(nave.getDrawLocationY()- asteroide.getDrawLocationY(),2 ) );
            //////choque de la bala
            distancia2= Math.sqrt(Math.pow(blastX[elemento]- asteroide.getDrawLocationX(),2) + Math.pow(blastY [elemento]- asteroide.getDrawLocationY(),2 ) );
                                    
            if (distancia <=90 || distancia2 <=85 )
            {
                colision=1;
                vidas--;
                exploX+=100;
                if (exploX>=900)
                {
                    exploX=0;
                    exploY+=100;
                                        
                }

            }
            else
            {
                colision=0;
                exploX=0;
                exploY=0;
                
            }
            
            
            
            
                
            
            
            
            repaint();
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
            public void windowActivated(java.awt.event.WindowEvent evt) {
                formWindowActivated(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 538, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 335, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        temporizador.start();
       
    }//GEN-LAST:event_formWindowOpened

    private void formWindowActivated(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowActivated
        // TODO add your handling code here:
        
    }//GEN-LAST:event_formWindowActivated

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
            java.util.logging.Logger.getLogger(FrmAsteroid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAsteroid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAsteroid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAsteroid.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmAsteroid().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
