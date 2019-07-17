
import java.util.Random;


public class strings {
    
        public static int numero(int n){

           if(n==1) return 1;
           else return n*(numero(n-1));
       }
    
    public static String combinacion(char entrada[]){
        

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
        return combina;
        
    }
    
    public static void main(String[] args) {
    
    int x=0, y=0;
    char entrada[]={'A','B','C','D','E','F','G','H','I','K'};
    
    int n=entrada.length;
    int numero=strings.numero(n);
    
    String combinacion="";
    String combi[]=new String[numero];

    for(x=0; x<entrada.length; x++)
    {
        combinacion+=entrada[x];
    }
    combi[y]=combinacion;
    
    for(x=1; x<combi.length; x++)
    {
        combi[x]=strings.combinacion(entrada);
        y=0;
        
        while(y<x)
        {
            if(combi[x].equals(combi[y])==true)
                x--;       
            else 
               y++;
        }
    }
    
    for(int i=0; i<combi.length; i++)
      System.out.println(combi[i]);
    
    

        
    }
}
