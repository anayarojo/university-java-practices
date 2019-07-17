package arreglo9;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class ARREGLO9 {

    public static class ARREGLOS {

        Scanner lector = new Scanner(System.in);
        String oracion[] = new String[10];

        public void INGRESA_ORACIONES() {
            for (int i = 0; i < oracion.length; i++) {
                System.out.println("Ingresa oracion en posicion " + i);
                oracion[i] = lector.nextLine();
            }
        }
        
        public void ELEMENTOS(){
            
            Set A=new HashSet();
            A.addAll(Arrays.asList(oracion));
            Iterator E=A.iterator();
            
            String elementos[]=new String[A.size()];
            
            int x=0;
            while (E.hasNext()){
              elementos[x]=E.toString();
              x++;        
            }
            
            for(int i=0; i<elementos.length; i++)
                System.out.println(elementos[i]);
            
        }

        public void REPETICIONES() {
            
   
            }
        }
    

    public static void main(String[] args) {
        
        ARREGLOS ins=new ARREGLOS();
        ins.INGRESA_ORACIONES();
        ins.ELEMENTOS();
    }
}
