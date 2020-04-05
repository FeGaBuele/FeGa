/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadena1;

/**
 *
 * @author FeGa
 */
public class Cadena1 {

    /**
     * @param args the command line arguments
     */    
    
    public static void main(String[] args) {
        // TODO code application logic here
        int aleatorio1 = (int)(Math.random()*4+1);
        if (aleatorio1==4)
        {
            aleatorio1=0;
        }
        
        int aleatorio2 = (int)(Math.random()*5+1);
        if (aleatorio2==5)
        {
            aleatorio2=0;
        }
        
        int aleatorio3 = (int)(Math.random()*5+1);
        if (aleatorio3==5)
        {
            aleatorio3=0;
        }
        
        int aleatorio4 = (int)(Math.random()*5+1);
        if (aleatorio4==5)
        {
            aleatorio4=0;
        }
        
        int aleatorio5 = (int)(Math.random()*4+1);
        if (aleatorio5==4)
        {
            aleatorio5=0;
        }
        
        int aleatorio6 = (int)(Math.random()*5+1);
        if (aleatorio6==5)
        {
            aleatorio6=0;
        }
        
        
        String[] articulo = {"el ", "un ", "algún ","ningún "};
        String[] sustantivo = {"niño", "niña", "perro", "ciudad", "auto"};
        String[] verbo = {" manejo ", " salto ", " corrió ", " camino ", " omitió "};
        String[] proposicion = {"a ", "desde ", "encima de ", "debajo de ", "sobre "};
        
              
        
        String a = articulo[aleatorio1];
        String s = sustantivo[aleatorio2];
        String v = verbo[aleatorio3];
        String p = proposicion[aleatorio4];
        String a2 = articulo[aleatorio5];
        String s2 = sustantivo[aleatorio6];
        
        String conca = a.concat(s) ; 
        String conca2 = conca.concat(v) ; 
        String conca3 = conca2.concat(p); 
        String conca4 = conca3.concat(a2); 
        String conca5 = conca4.concat(s2); 
        
        String[] fin = conca5.split("");
        fin[0]=fin[0].toUpperCase();
        
        for (int i=0; i<conca5.length() ; i++)
        {
            System.out.print(fin[i]);
            if(i==conca5.length()-1)
            {
                System.out.print(".");               
            }
        }
        
        
        
            
        
    }
    
}
