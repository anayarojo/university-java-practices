
package arreglos4;

import java.util.Scanner;

public class ARREGLOS4 {
    
     public static class ARREGLOS{
        
        int arreglo[]=new int[20];
        int c[]=new int[10];
        Scanner lector=new Scanner(System.in);
        
        public void ASIGNACION_ALEATORIA(){
            System.out.println("===================ARREGLO===================");
            for(int i=0; i<arreglo.length; i++){
                arreglo[i]=(int)(Math.random()*(10-1+1)+1);
                System.out.print(arreglo[i]+" ");
            }
            System.out.println("");
            System.out.println("=============================================");

        }
        public void CONTAR(){
            for(int i=0; i<arreglo.length; i++){
                switch(arreglo[i]){
                    case 1: c[0]++; break;
                    case 2: c[1]++; break;
                    case 3: c[2]++; break;
                    case 4: c[3]++; break;
                    case 5: c[4]++; break;
                    case 6: c[5]++; break;
                    case 7: c[6]++; break;
                    case 8: c[7]++; break;
                    case 9: c[8]++; break; 
                    case 10:c[9]++; break;     
                }
            }
        }
        public void REPETICIONES(){
             System.out.println("     ==========REPETICIONES==========");
             for(int i=0; i<10; i++){
                    System.out.println("     El numero "+(i+1)+" se repite "+c[i]+((c[i]==1)?" vez ":" veces "));
                }
             System.out.println("     ================================");
        }
        
        public void MAYOR(){
           int mayor=0;
           for(int i=0; i<c.length; i++){
               if(mayor<c[i])
                   mayor=c[i];
           }
           for(int i=0; i<c.length; i++){
               if(c[i]==mayor)
                   System.out.println("El numero "+(i+1)+" es MAYOR con "+c[i]+" repeticiones");
           }  
        }
        public void MENOR(){
           int menor=10;
           for(int i=0; i<c.length; i++){
               if(menor>c[i]&c[i]!=0)
                   menor=c[i];
           }
           
           for(int i=0; i<c.length; i++){
               if(c[i]==menor)
                   System.out.println("El numero "+(i+1)+" es MENOR con "+c[i]+" repeticiones");
           }  
        }
        
    }
    public static void main(String[] args) {
        
       ARREGLOS ins=new ARREGLOS();
       
       ins.ASIGNACION_ALEATORIA();
       ins.CONTAR();
       ins.REPETICIONES();
       ins.MAYOR();
       ins.MENOR();
    }
}
