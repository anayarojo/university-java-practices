
import java.io.IOException;
import java.util.Random;


public class mix {
    
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
    
    public static void main(String[] args) throws IOException {
    
    java.io.BufferedReader lector=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
    System.out.println("Ingresa la combinacion base");
    String base=lector.readLine();
    
    
    int x=0, w, y=0;
    
    char entrada[]=new char[base.length()];
    
    for(w=0; w<entrada.length; w++)
    {
        entrada[w]=base.charAt(w);
    }
    
    int n=entrada.length;
    int numero=mix.numero(n);
    
    String combinacion="";
    String combi[]=new String[numero];

    for(x=0; x<entrada.length; x++)
    {
        combinacion+=entrada[x];
    }
    combi[y]=combinacion;
    
    for(x=1; x<combi.length; x++)
    {
        combi[x]=mix.combinacion(entrada);
        y=0;
        
        while(y<x)
        {
            if(combi[x].equals(combi[y])==true)
                x--;       
            else 
               y++;
        }
    }
        System.out.println("\nLISTA DE COMBINACIONES");
    for(int i=0; i<combi.length; i++)
      System.out.println(combi[i]);
    
    

        
    }
}
