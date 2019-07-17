
package arreglo2;

import java.util.Scanner;

public class ARREGLO2 {
    public static class ARREGLOS{
        
        int arreglo[]=new int[20];
        Scanner lector=new Scanner(System.in);
        
        public void ASIGNACION_ALEATORIA(){
            System.out.println("======ARREGLO======");
            for(int i=0; i<arreglo.length; i++){
                arreglo[i]=(int)(Math.random()*(10-1+1)+1);
                System.out.println("\t"+arreglo[i]+"\t");
            }
            System.out.println("==================");
        }
        
        
        public void PAR_O_IMPAR(){
            
            int contPAR=0, contIMPAR=0;
            
            for(int i=0; i<arreglo.length; i++){
                if(arreglo[i]%2==0){
                    System.out.println("El numero "+arreglo[i]+" es PAR");
                    contPAR++;
                }
                else{
                    System.out.println("El numero "+arreglo[i]+" es IMPAR");
                }
            }
            System.out.println("==================");
            System.out.println("En el ARREGLO hay "+contPAR+" PARES y "+contIMPAR+" IMPARES");  
        }
        
    }
        
    public static void main(String[] args) {
        ARREGLOS ins=new ARREGLOS();
        
        ins.ASIGNACION_ALEATORIA();
        ins.PAR_O_IMPAR();
    }
}
