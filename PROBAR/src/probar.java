
import java.util.Random;


public class probar {

    public static void main(String[] args) {
        
        
        char entrada[]={'A','B','C'};
        String combina="";
        
        Random aleatorio=new Random();
        int tamaño=entrada.length;
        char M[]=new char[entrada.length];
        int x=0, y=0;

        M[y]=entrada[aleatorio.nextInt(tamaño+0)];

        for(x=1; x<entrada.length; x++)
        {
            M[x]=entrada[aleatorio.nextInt(tamaño+0)];
            
            y=0;
            
            while(y<x)
            {
                if(M[x]==M[y])
                    x--;
                else
                    y++;                
            }
        }
        
        for(x=0; x<entrada.length; x++)
        {
            combina+=M[x];
        }
        System.out.println(combina);
        
  
        
        
    }
}
