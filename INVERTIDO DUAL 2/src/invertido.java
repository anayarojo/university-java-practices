
import java.io.IOException;


public class invertido {

    public static void main(String[] args) throws IOException {
        
        java.io.BufferedReader lector=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        
        System.out.println("Ingresa lo que quieras invertir");
            String nombre=lector.readLine();
            
            if(nombre.length()%2!=0)
                nombre+=" ";
            
            char caracteres[]=new char[nombre.length()];
            
        for(int i=0; i<nombre.length(); i+=2)
            caracteres[i]=nombre.charAt(i+1);
        
        for(int i=1; i<nombre.length(); i+=2)
            caracteres[i]=nombre.charAt(i-1);
        
            String invertido="";
        for(int i=0; i<nombre.length(); i++)
            invertido+=caracteres[i];
        
        System.out.println(invertido.replace(" ", ""));
            
        
            
            
            
    }
}
