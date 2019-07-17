
import java.io.IOException;


public class retrovizordual {

    public static void main(String[] args) throws IOException {
      
        java.io.BufferedReader lector=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        int a;
        
        System.out.println("Ingresa tu nombre para invertirlo");
        String nombre=lector.readLine();
  
        if(nombre.length()%2!=0)
            nombre+=" ";
        
        char caracteres[]=new char[nombre.length()];
        
        for(a=0; a<caracteres.length; a+=2)
        {
        caracteres[a]=nombre.charAt(a+1);
        }
        
        for(a=1; a<caracteres.length; a+=2)
        {
        caracteres[a]=nombre.charAt(a-1);
        }
        
        String invertidodual="";
        System.out.println("\nINVERTIDO");
        for(a=0; a<caracteres.length; a++)
           invertidodual+=caracteres[a];
       
        System.out.println(invertidodual.replace(" ", ""));
        
        
    }
}
