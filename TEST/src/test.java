
import java.io.IOException;


public class test {

    public static void main(String[] args) throws IOException {
       
        
        
        java.io.BufferedReader lector = new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
        System.out.println("Ingresa numero");
        int numero=Integer.parseInt(lector.readLine());
        String hexa=Integer.toHexString(numero).toUpperCase();
        
        System.out.println(hexa);
        
    }
}
