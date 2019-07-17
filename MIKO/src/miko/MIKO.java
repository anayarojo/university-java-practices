/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package miko;

import java.util.Scanner;

/**
 *
 * @author Raul
 */
public class MIKO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                
        Scanner sc= new Scanner (System.in);
        
        System.out.println("Ingrese una frase:");
        String cadena = sc.nextLine();
        
        char nombre= '\n';
        int a[] = new int [300];
        int numerosveces=0, letrasrepetidas=0;
        
        for(int i=0; i<cadena.length(); i++)
        {
            a[cadena.codePointAt(i)]++;
        }
       
        for (int i=48; i<a.length; i++)
        {
            if(a[i]>numerosveces)
            {
                numerosveces = a[i];
                letrasrepetidas=i;
            }
        }
        
        for(int i=0; i<cadena.length(); i++)
        {
            if(letrasrepetidas==cadena.codePointAt(i))
            {
                nombre=cadena.charAt(i);
            }
        }
            
        System.out.println("\n El caracter que mas se repite es:" + nombre);
        System.out.println("Se repite " + numerosveces + " veces ");
    }
}
