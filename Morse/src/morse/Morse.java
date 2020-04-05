/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morse;

import java.util.Scanner;

/**
 *
 * @author FeGa
 */
public class Morse {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String pregunta;
        
        Scanner preg = new Scanner(System.in);
        System.out.print("Escriba letras si desea traducir de letras a morse");
        System.out.print("\n");
        System.out.print("Escriba morse si desea traducir de morse a letras: ");
        pregunta = preg.nextLine();
        
        if (pregunta.equals("letras"))
        {
            System.out.print("\n");
            String morse[] = { ".- ", "-... ", "-.-. ", "-.. ", ". ", "..-. ", "--. ", ".... ", ".. ",
            ".--- ", "-.- ", ".-.. ", "-- ", "-. ", "--- ", ".--. ", "--.- ", 
            ".-. ", "... ", "- ", "..- ", "...- ", ".-- ", "-..- ", "-.-- ", "--.. "};
        
            String palabra;

            Scanner leer = new Scanner(System.in);

            System.out.print("Ingrese oración letras a morse: ");

            palabra=leer.nextLine();
            System.out.print("\n");

            String [] oracion = palabra.split("");


            for (int i=0 ; i<=oracion.length-1; i++)
            {
                if (oracion[i].equals("a") || oracion[i].equals("A") )
                {
                    System.out.print(morse[0]);
                }
                else if (oracion[i].equals("b") || oracion[i].equals("B"))
                {
                    System.out.print(morse[1]);
                }
                else if (oracion[i].equals("c") || oracion[i].equals("C") )
                {
                    System.out.print(morse[2]);
                }
                else if (oracion[i].equals("d") || oracion[i].equals("D"))
                {
                    System.out.print(morse[3]);
                }
                else if (oracion[i].equals("e") || oracion[i].equals("E") )
                {
                    System.out.print(morse[4]);
                }
                else if (oracion[i].equals("f") || oracion[i].equals("F"))
                {
                    System.out.print(morse[5]);
                }
                else if (oracion[i].equals("g") || oracion[i].equals("G") )
                {
                    System.out.print(morse[6]);
                }
                else if (oracion[i].equals("h") || oracion[i].equals("H"))
                {
                    System.out.print(morse[7]);
                }
                else if (oracion[i].equals("i") || oracion[i].equals("I") )
                {
                    System.out.print(morse[8]);
                }
                else if (oracion[i].equals("j") || oracion[i].equals("J"))
                {
                    System.out.print(morse[9]);
                }
                else if (oracion[i].equals("k") || oracion[i].equals("K") )
                {
                    System.out.print(morse[10]);
                }
                else if (oracion[i].equals("l") || oracion[i].equals("L"))
                {
                    System.out.print(morse[11]);
                }
                else if (oracion[i].equals("m") || oracion[i].equals("M") )
                {
                    System.out.print(morse[12]);
                }
                else if (oracion[i].equals("n") || oracion[i].equals("N"))
                {
                    System.out.print(morse[13]);
                }
                else if (oracion[i].equals("o") || oracion[i].equals("O") )
                {
                    System.out.print(morse[14]);
                }
                else if (oracion[i].equals("p") || oracion[i].equals("P"))
                {
                    System.out.print(morse[15]);
                }
                else if (oracion[i].equals("q") || oracion[i].equals("Q") )
                {
                    System.out.print(morse[16]);
                }
                else if (oracion[i].equals("r") || oracion[i].equals("R"))
                {
                    System.out.print(morse[17]);
                }
                else if (oracion[i].equals("s") || oracion[i].equals("S"))
                {
                    System.out.print(morse[18]);
                }
                else if (oracion[i].equals("t") || oracion[i].equals("T") )
                {
                    System.out.print(morse[19]);
                }
                else if (oracion[i].equals("u") || oracion[i].equals("U"))
                {
                    System.out.print(morse[20]);
                }
                else if (oracion[i].equals("v") || oracion[i].equals("V") )
                {
                    System.out.print(morse[21]);
                }
                else if (oracion[i].equals("w") || oracion[i].equals("W"))
                {
                    System.out.print(morse[22]);
                }
                else if (oracion[i].equals("x") || oracion[i].equals("X"))
                {
                    System.out.print(morse[23]);
                }
                else if (oracion[i].equals("y") || oracion[i].equals("Y") )
                {
                    System.out.print(morse[24]);
                }
                else if (oracion[i].equals("z") || oracion[i].equals("Z"))
                {
                    System.out.print(morse[25]);
                }
                else if (oracion[i].equals("ñ") || oracion[i].equals("Ñ"))
                {
                    System.out.print("--.-- ");
                }
                else if (oracion[i].equals(" "))
                {
                    System.out.print("   ");
                }
            }
        
        }
        
        else if(pregunta.equals("morse"))
        {
            System.out.print("\n");
            System.out.print("Recuerde dejar un espacio entre código y código");
            System.out.print("\n");
        
            String letras[] = { "a ", "b ", "c ", "d ", "e ", "f ", "g ", "h ", "i ",
                "j ", "k ", "l ", "m ", "n ", "o ", "p ", "q ", 
                "r ", "s ", "t ", "u ", "v ", "w ", "x ", "y ", "z "};



            String palabra2;

            Scanner leer2 = new Scanner(System.in);

            System.out.print("Ingrese oración morse a letras: ");

            palabra2=leer2.nextLine();
            System.out.print("\n");

            String [] oracion2 = palabra2.split("\\ ");


            for (int i=0 ; i<=oracion2.length-1; i++)
            {
                if (oracion2[i].equals(".-"))
                {
                    System.out.print(letras[0]);
                }
                else if (oracion2[i].equals("-..."))
                {
                    System.out.print(letras[1]);
                }
                else if (oracion2[i].equals("-.-."))
                {
                    System.out.print(letras[2]);
                }
                else if (oracion2[i].equals("-.."))
                {
                    System.out.print(letras[3]);
                }
                else if (oracion2[i].equals("."))
                {
                    System.out.print(letras[4]);
                }
                else if (oracion2[i].equals("..-."))
                {
                    System.out.print(letras[5]);
                }
                else if (oracion2[i].equals("--."))
                {
                    System.out.print(letras[6]);
                }
                else if (oracion2[i].equals("...."))
                {
                    System.out.print(letras[7]);
                }
                else if (oracion2[i].equals(".."))
                {
                    System.out.print(letras[8]);
                }
                else if (oracion2[i].equals(".---"))
                {
                    System.out.print(letras[9]);
                }
                else if (oracion2[i].equals("-.-"))
                {
                    System.out.print(letras[10]);
                }
                else if (oracion2[i].equals(".-.."))
                {
                    System.out.print(letras[11]);
                }
                else if (oracion2[i].equals("--"))
                {
                    System.out.print(letras[12]);
                }
                else if (oracion2[i].equals("-."))
                {
                    System.out.print(letras[13]);
                }
                else if (oracion2[i].equals("---"))
                {
                    System.out.print(letras[14]);
                }
                else if (oracion2[i].equals(".--."))
                {
                    System.out.print(letras[15]);
                }
                else if (oracion2[i].equals("--.-"))
                {
                    System.out.print(letras[16]);
                }
                else if (oracion2[i].equals(".-."))
                {
                    System.out.print(letras[17]);
                }
                else if (oracion2[i].equals("..."))
                {
                    System.out.print(letras[18]);
                }
                else if (oracion2[i].equals("-") )
                {
                    System.out.print(letras[19]);
                }
                else if (oracion2[i].equals("..-"))
                {
                    System.out.print(letras[20]);
                }
                else if (oracion2[i].equals("...-") )
                {
                    System.out.print(letras[21]);
                }
                else if (oracion2[i].equals(".--"))
                {
                    System.out.print(letras[22]);
                }
                else if (oracion2[i].equals("-..-"))
                {
                    System.out.print(letras[23]);
                }
                else if (oracion2[i].equals("-.--") )
                {
                    System.out.print(letras[24]);
                }
                else if (oracion2[i].equals("--.."))
                {
                    System.out.print(letras[25]);
                }
                else if (oracion2[i].equals("--.--"))
                {
                    System.out.print("ñ ");
                }
                else if (oracion2[i].equals("  "))
                {
                    System.out.print("   ");
                }
            }
            
            
        }

        System.out.print("\n");
  
    }
    
}
