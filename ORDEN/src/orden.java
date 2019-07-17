
import java.io.IOException;


public class orden {

    public static void main(String[] args) throws IOException {
        
        java.io.BufferedReader lector=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        
       int numeros[]={8,9,3,1,20,4,6,8,9,4,5,6};
       int i=0;
       
       
  
       
       int cache=0;
             for(int k=0;k<numeros.length-1;k++) {
            for(int f=0;f<numeros.length-1-k;f++) {
                if (numeros[f]>numeros[f+1]) {
                    
                    cache=numeros[f];
                    numeros[f]=numeros[f+1];
                    numeros[f+1]=cache;
                }
            }}

  
       for(i=0; i<numeros.length; i++)
       {
           System.out.print(numeros[i]+" ");
       }
       
        
        
    }
}
