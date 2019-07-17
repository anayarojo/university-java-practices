
import java.io.IOException;


public class reduccion {

    public static void main(String[] args) throws IOException {
         
     java.io.BufferedReader lector=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        
        System.out.println("Ingresa nombre a reducir");
            String nombre=lector.readLine();
            
            int numero;
            String reducido="";  
        for(int i=0; i<nombre.length(); i++)
        {
            numero=(nombre.charAt(i))-1;
            reducido+=(char)numero;
        }
        
        System.out.println(reducido);
        
    }
}
