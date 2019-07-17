
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*AUTOR: Raul
 * Programa que muestra los numeros primos
 * de un numero A hasta un numero B
 */

public class primos {

    public static void main(String[] args) throws IOException {
        
   BufferedReader lector=new BufferedReader(new InputStreamReader(System.in));
    
        System.out.println("Ingresa numero A");
            int a=Integer.parseInt(lector.readLine());
            
        System.out.println("Ingresa numero B");
            int b=Integer.parseInt(lector.readLine());
      
          int inicio, fin, num=0;  
          String primos="";
          
        if(a<b)
        {
         inicio=a;
         fin=b;  
        } 
        else
        {
         inicio=b;
         fin=a;  
        }
       
           for(int i=inicio; i<=fin; i++)
            {
                
             num=i;   
             
             int resto=0, tipo=0;
        
                for(int j=1; j<=num; j++)
                    {  
                        resto=num%j;
            
                        if(resto==0)
                            tipo++;
            
                        if(tipo>2)
                            break;    
                    }
        
            if(tipo==2)
            primos+=num+"  ";
            
            }
           
        System.out.println("LOS NUMEROS PRIMOS DEL "+inicio+" AL "+fin); 
        System.out.println(primos);
           
    }
}
