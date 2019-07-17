
import java.io.IOException;


public class binarios {

    public static void main(String[] args) throws IOException {
        
    java.io.BufferedReader lector=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
    
        System.out.println("Ingresa un numero");
        int numero=Integer.parseInt(lector.readLine());

        int ciclo=numero;
        String cache="";

        while(ciclo>1)
        {
            cache+=ciclo%2;
            ciclo=ciclo/2;

        }
        if(ciclo==1)
            cache+=1;
        else
            cache+=0;           
       
        
        String binario="";
        
        for(int i=(cache.length()-1); i>=0; i--)
            binario+=cache.charAt(i);
            
            
        System.out.println(binario);
  
        
        
    }
}
 