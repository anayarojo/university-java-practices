
import java.io.IOException;


public class hexadecimal {

    public static String caracter(int mod){
              
        String caracter="";
        switch(mod)
            {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:caracter+=mod;break;
                case 10:caracter="A";break;
                case 11:caracter="B";break;
                case 12:caracter="C";break;
                case 13:caracter="D";break;
                case 14:caracter="E";break;
                case 15:caracter="F";break;                    
                case 16:caracter="10";break;    
            } 
        return caracter;
    }
    public static void main(String[] args) throws IOException {
       
       java.io.BufferedReader lector=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
       
        System.out.println("Ingresa numero");
        int numero=Integer.parseInt(lector.readLine());
        
        int ciclo=numero;
        int mod;
        String cache="", caracter;

        while(ciclo>16)
        {
            mod=ciclo%16;
            
            cache+=hexadecimal.caracter(mod);
  
            ciclo=ciclo/16;
        }
        
        cache+=hexadecimal.caracter(ciclo);
        System.out.println(cache);
        
        
    }
}
