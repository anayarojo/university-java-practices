
import java.io.IOException;


public class palabras {

    public static void main(String[] args) throws IOException {
        
        java.io.BufferedReader lector=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));

        System.out.println("Ingresa numero");
            int numero=Integer.parseInt(lector.readLine());
            String letras="";
           
         
       
       if(numero>=0&numero<=100)
       {

        if(numero==0)
        {
            letras="CERO";
        }    
        
        do{
        if(numero>=0&numero<16)
        {
          switch(numero)
            {
            case 1: letras+="UNO";numero-=numero; break;
            case 2: letras+="DOS";numero-=numero; break;
            case 3: letras+="TRES";numero-=numero; break;
            case 4: letras+="CUATRO";numero-=numero; break;
            case 5: letras+="CINCO";numero-=numero; break;
            case 6: letras+="SEIS";numero-=numero; break;
            case 7: letras+="SIETE";numero-=numero; break;
            case 8: letras+="OCHO";numero-=numero; break;
            case 9: letras+="NUEVE";numero-=numero; break;
            case 10: letras+="DIEZ";numero-=numero; break;
            case 11: letras+="ONCE";numero-=numero; break;
            case 12: letras+="DOCE";numero-=numero; break;
            case 13: letras+="TRECE";numero-=numero; break;
            case 14: letras+="CATORCE";numero-=numero; break;
            case 15: letras+="QUINCE";numero-=numero; break;
            }
        }
        else if(numero>=16&numero<20)
        {
            letras="DIECI";
            numero-=10;
        }
        else if(numero==20)
        {
            letras="VEINTE";
            numero-=numero;
        }
        else if(numero>=21&numero<29)
        {
            letras="VEINTI";
            numero-=20;
        }
        else if(numero>=30&numero<40){numero-=30; if(numero==0){letras="TRINTA";} else {letras="TREINTA Y ";}}
        else if(numero>=40&numero<50){numero-=40; if(numero==0){letras="CUARENTA";} else {letras="CUARENTA Y ";}} 
        else if(numero>=50&numero<60){numero-=50; if(numero==0){letras="CINCUENTA";} else {letras="CINCUENTA Y ";}} 
        else if(numero>=60&numero<70){numero-=60; if(numero==0){letras="SESENTA";} else {letras="SESENTA Y ";}} 
        else if(numero>=70&numero<80){numero-=70; if(numero==0){letras="SETENTA";} else {letras="SETENTA Y ";}} 
        else if(numero>=80&numero<90){numero-=80; if(numero==0){letras="OCHENTA";} else {letras="OCHENTA Y ";}}
        else if(numero>=90&numero<100){numero-=90; if(numero==0){letras="NOVENTA";} else {letras="NOVENTA Y ";}}  
        
        else
        {
            letras="CIEN";
            numero-=numero;
        }
        }while(numero!=0);
        }
       else
        letras="EL NUMERO "+numero+" NO SE PUEDE PROCESAR";   
            

        System.out.println(letras);
       
    }
}
