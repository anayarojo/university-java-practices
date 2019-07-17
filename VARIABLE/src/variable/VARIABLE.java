
package variable;

import java.io.BufferedReader;

import java.io.IOException;
import java.io.InputStreamReader;

public class VARIABLE {


    static class CLASE{
    BufferedReader lector=new BufferedReader(new InputStreamReader(System.in));        
        String nombre;
        int edad;
        
        void METODO() throws IOException{
            System.out.println("Ingresa nombre");
            nombre=lector.readLine();
            
            System.out.println("Ingresa tu edad");
            edad=Integer.parseInt(lector.readLine());
        }
    }
    
    public static void main(String[] args) throws IOException {
        
        CLASE ins[]=new CLASE[5];
        
        for(int i=0; i<5; i++)
            ins[i]=new CLASE();
        
        for(int i=0; i<5; i++)
        ins[i].METODO();
        
        for(int i=0; i<5; i++){
            System.out.println(ins[i].nombre);
            System.out.println(ins[i].edad);
        }
       
    }
}
