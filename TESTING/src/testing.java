
import java.io.IOException;


public class testing {

    public static void main(String[] args) throws IOException {
    
   java.io.BufferedReader lector=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        int sueldos[]=new int[6];
        for(int f=0;f<sueldos.length;f++) {
            System.out.print("Ingrese el sueldo:");
            sueldos[f]=Integer.parseInt(lector.readLine());
        }    
        
        for(int k=0;k<5;k++) {
            for(int f=0;f<5-k;f++) {
                if (sueldos[f]>sueldos[f+1]) {
                    int aux;
                    aux=sueldos[f];
                    sueldos[f]=sueldos[f+1];
                    sueldos[f+1]=aux;
                }
            }
        }
        
        for(int i=0; i<sueldos.length; i++)
            System.out.println(sueldos[i]);
        
        
    }
}
