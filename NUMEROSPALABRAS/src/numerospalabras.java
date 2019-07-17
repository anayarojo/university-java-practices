
import java.io.IOException;


public class numerospalabras {

    private static String unidades[]={"","UNO","DOS","TRES","CUATRO","CINCO","SEIS","SIETE","OCHO","NUEVE","DIEZ","ONCE","DOCE","TRECE","CATORCE","QUINCE","DIECISEIS","DIECISIETE","DIECIOCHO","DIECINUEVE"};
    private static String decenas[]={"","","VEINTE","TREINTA","CUARENTA","CINCUENTA","SESENTA","SETENTA","OCHENTA","NOVENTA"};
    private static String centenas[]={"","CIEN","DOCIENTOS","TRECIENTOS","CUATROCIENTOS","QUINIENTOS","SEISCIENTOS","SETECIENTOS","OCHOCIENTOS","NOVECIENTOS"};

  
        public static String NUMERO(long numeros){
        String letras="";
        int numero=(int) numeros;
        int cache;
        
        do{
        if(numero>=1&numero<20)
        {
            letras+=unidades[numero];
            numero=0;
        }
        else if(numero>=20&numero<30)
        {
            cache=numero/10;
            if(numero%10==0)
               letras+=decenas[cache];
            else
               letras+="VEINTI";
            
            numero=numero%10;
        }
        else if(numero>=30&numero<100)
        {
            cache=numero/10;
            if(numero%10==0)
               letras+=decenas[cache];
            else
               letras+=decenas[cache]+" Y ";
            
            numero=numero%10;   
        }
        else if(numero>=100&numero<1000)
        {
            cache=numero/100;
            if(numero%10==0)
               letras+=centenas[cache]+" ";
            else
               letras+=centenas[cache]+" ";
            
            numero=numero%100;               
        }
        }while(numero!=0);
      
        return letras;
    }
        public static String MIL(long numeros){
          String letras="";
          int cache=(int) (numeros/1000);
          
          if(cache==1)
            letras="MIL ";
          else
            letras+=numerospalabras.NUMERO(cache)+" MIL ";
          
            return letras;
        }
        public static String MILLON(long numeros){
           String letras="";
           
          int cache=(int) (numeros/1000000);
          
          if(cache==1)
            letras="UN MILLON ";
          else
          {
              if(cache>=2&cache<1000)
                   letras+=numerospalabras.NUMERO(cache)+" MILLONES ";  
              else if(cache>=1000&cache<1000000)
                   letras+=numerospalabras.MIL(cache)+" MILLONES ";                  
          }
          
           
            return letras;
        }

    
    public static void main(String[] args) throws IOException {
        
        java.io.BufferedReader lector=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        System.out.println("Ingresa numero");
        long numero=Integer.parseInt(lector.readLine());
        
        
        
        String letras="";
        
        do{
            if(numero>=1&numero<1000)
            {
                letras+=numerospalabras.NUMERO(numero);
                numero=0;
            }
            else if(numero>=1000&numero<1000000)
            {
                letras+=numerospalabras.MIL(numero);
                numero=numero%1000;
            }
            else if(numero>=1000000&numero<1000000000000L)
            {
                letras+=numerospalabras.MILLON(numero);
                numero=numero%1000000;
            }
            else
                letras="EL NUMERO "+numero+" NO SE PUEDE PROCESAR";
            
        }while(numero!=0);
        
        
        
        
        System.out.println(letras);
    }
}
