
package arreglo3;

import java.util.Scanner;

public class ARREGLO3 {
    
    public static class ARREGLOS{
        
        int arreglo[]=new int[20];
        int arreglo2[]=new int[5];
        Scanner lector=new Scanner(System.in);

        public void ASIGNACION_ALEATORIA(){
            System.out.println("======PRIMERO======");
            for(int i=0; i<arreglo.length; i++){
                arreglo[i]=(int)(Math.random()*(100-1+1)+1);
                System.out.println("\t"+arreglo[i]+"\t");
            }
            System.out.println("======SEGUNDO======");
            for(int i=0; i<arreglo2.length; i++){
                arreglo2[i]=(int)(Math.random()*(10-1+1)+1);
                System.out.println("\t"+arreglo2[i]+"\t");
            }
            System.out.println("==================");
        }
        
        
        public void MULTIPLO(){
            
            for(int i=0; i<arreglo2.length; i++){
                for(int j=0; j<arreglo.length; j++){
                    if(arreglo[j]%arreglo2[i]==0)
                        System.out.println("El numero "+arreglo2[i]+" del SEGUNDO ARREGLO es multiplo del numero "+arreglo[j]+" del PRIMER ARREGLO");
                }
            }
        }
        
    }
    public static void main(String[] args) {
        
        ARREGLOS ins=new ARREGLOS();
        
        ins.ASIGNACION_ALEATORIA();
        ins.MULTIPLO();

    }
}
