

package arreglo;

import java.util.Scanner;


public class ARREGLO {
    
    public static class ARREGLOS{
        
        int arreglo[]=new int[20];
        Scanner lector=new Scanner(System.in);
        int numero;
        
        public void ASIGNACION_ALEATORIA(){
            System.out.println("======ARREGLO======");
            for(int i=0; i<arreglo.length; i++){
                arreglo[i]=(int)(Math.random()*(10-1+1)+1);
                System.out.println("\t"+arreglo[i]+"\t");
            }
            System.out.println("==================");
        }
        
        public void PEDIR_Y_BUSCAR(){
            
            int contador=0;
            
            System.out.println("Ingresa NUMERO a BUSCAR");
            numero=lector.nextInt();
            
            for(int i=0; i<arreglo.length; i++)
                if(numero==arreglo[i]){
                    System.out.println("El numero "+numero+" esta en la posicion "+i);
                    contador++;
                }
            System.out.println("El numero "+numero+ " se encontro "+contador+((contador==1)? " vez ":" veces "));
                    
        }
        
    }
    
    

    
    public static void main(String[] args) {
       ARREGLOS ins=new ARREGLOS();
       ins.ASIGNACION_ALEATORIA();
       ins.PEDIR_Y_BUSCAR();
        
    }
}
