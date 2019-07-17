
import java.io.IOException;


public class trayectoria {

    public static void main(String[] args) throws IOException {
  
      java.io.BufferedReader lector=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
      
        System.out.println("Ingresa A");
        int a=Integer.parseInt(lector.readLine());
        
        System.out.println("Ingresa B");
        int b=Integer.parseInt(lector.readLine());
        
        System.out.println("Ingresa X");
        int x=Integer.parseInt(lector.readLine());
  
        
        if(a<b)
        {
            for(int i=a; i<=b; i+=x)
                System.out.println(i);
        }
        else
        {
            for(int i=a; i>=b; i-=x)
                System.out.println(i);
        }    
        
        
        
    }
}
