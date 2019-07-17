
import java.io.IOException;


public class numero {

    public static void main(String[] args) throws IOException {
        
        java.io.BufferedReader lector=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        
        System.out.println("Ingresa numero");
          int num=Integer.parseInt(lector.readLine());
        
            
        int res=0, nc=0;
        
        for(int i=1; i<=num; i++)
        {  
            res=num%i;
            
            if(res==0)
               nc++;
            
            if(nc>2)
               break;    
        }
        
        if(nc==2)
            System.out.println("PRIMO");
        else
            System.out.println("NOPRIMO");
        
        
        
    }
}
