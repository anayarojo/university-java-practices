
import java.io.IOException;


public class numeros {

    public static void main(String[] args) throws IOException {

     java.io.BufferedReader lector=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
     
     
        System.out.println("Ingresa un numero");
        String numero=lector.readLine();
        
        char digito;
        int longitud=numero.length();
        
        String romano="";
        int ciclo=longitud;
        
        
        while(ciclo>0)
        {
        String uno="", dos="", tres="";    
        if(ciclo==1)
        {
            uno="I";
            dos="V";
            tres="X";     
        }
        else if(ciclo==2)
        {
            uno="X";
            dos="L";
            tres="C";    
        }
        else if(ciclo==3)
        {
            uno="C";
            dos="D";
            tres="M";
        }    
        else
        {
            uno="";
            dos="";
            tres="";
            romano="El numero no se puede procesar";        
        }    

        digito=numero.charAt(longitud-ciclo);
         
            switch(digito)
                {
                case '1':
                    romano+=uno;
                break; 
                case '2':
                    romano+=uno+uno;
                break; 
                 case '3':
                    romano+=uno+uno+uno;
                break; 
                case '4':
                    romano+=uno+dos;
                break; 
                case '5':
                    romano+=dos;
                break; 
                case '6':
                    romano+=dos+uno;
                break; 
                case '7':
                    romano+=dos+uno+uno;
                break; 
                case '8':
                    romano+=dos+uno+uno+uno;
                break;                     
                case '9':
                    romano+=uno+tres;
                break; 

                }
        
         ciclo--;
         }
        
        System.out.println(romano);
        
        
    }
}
