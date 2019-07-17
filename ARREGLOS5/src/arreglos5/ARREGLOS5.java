
package arreglos5;

import java.util.Scanner;

public class ARREGLOS5 {
    
    public static class ARREGLOS{
        
        Scanner lector=new Scanner(System.in);
        String cadena;
        
        public void INGRESA_CADENA(){
            System.out.println("Ingresa el texto");
            cadena=lector.nextLine();
            
            int  A[]=new int[cadena.length()];
            for(int i=0; i<A.length; i++){
                A[i]=cadena.charAt(i);
            }
            
            //MODO NOMBRE Y CONTADOR
            if(A[0]>96)
                A[0]-=32;
            
            int contador=1; 
            for(int j=1; j<A.length; j++){
               if(A[j]==32){
                   if(A[j+1]>96)
                       A[j+1]-=32;
                   contador++;
               }
            }
            
            //IMPRESION
            for(int k=0; k<A.length; k++)
                System.out.print((char)A[k]);
            System.out.println("");
            System.out.println("La cadena \""+cadena+"\" tiene "+contador+((contador==1)?" palabra":" palabras"));
        
        }
    }

    public static void main(String[] args) {
        
        ARREGLOS ins=new ARREGLOS();
        ins.INGRESA_CADENA();
        
    }
}
