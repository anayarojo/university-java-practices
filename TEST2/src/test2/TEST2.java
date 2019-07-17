
package test2;

import java.util.Scanner;

public class TEST2 {
    
    
    
    
    public static class NUMERO{
        public int num[];
       
        NUMERO(int tamaño){
            
            Scanner L=new Scanner(System.in);
            num=new int[tamaño];
            
            for (int i = 0; i < tamaño; i++) {
                num[i]=(int)(Math.random()*(10-1+1)+1);
            } 
        }
        
        void IMPRIMIR(){
            for (int i = 0; i < num.length; i++) {
                System.out.println(num[i]);
            }
        } 
    }

    public static void main(String[] args) {
       
        Scanner L=new Scanner(System.in);
        System.out.println("Ingresa tamaño");
        int tamaño=L.nextInt();
        
        NUMERO OBJ=new NUMERO(tamaño);
        OBJ.IMPRIMIR();
        
        
        
        
        
    }
}
