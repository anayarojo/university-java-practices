
import java.io.IOException;
import java.util.Arrays;

public class calificaciones {

    public static void main(String[] args) throws IOException {
      
     java.io.BufferedReader lector=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
       
     
     char opcion;
     
     String nombre[]=new String[1000];
     int calificacion[]=new int[1000];
     
     int indice=0;
     do{
         
        
         System.out.println("Ingresa nombre del alumno");
            nombre[indice]=(lector.readLine());           
            
         System.out.println("Ingresa calificacion del alumno"); 
            calificacion[indice]=(Integer.parseInt(lector.readLine()));
            
         indice++;
         
         System.out.println("Deseas agregar otro Alumno?"); 
            opcion=lector.readLine().toUpperCase().charAt(0);            
         
     }while(opcion=='S');   
     
     int cal[]=new int[calificacion.length];
     
        for(int i=0; i<cal.length; i++)
            cal[i]=calificacion[i];
        
        Arrays.sort(cal);
        
     String name[]=new String[nombre.length];
     
        for(int i=0; i<name.length; i++)
            name[Arrays.binarySearch(cal, calificacion[i])]=nombre[i];
        
        System.out.println("LISTA DE CALIFICACIONES ");
        for(int i=indice; i<0; i--)
        {
             System.out.println(name[i]);
             System.out.println(cal[i]);
        }
         
     
     
        
        
    }
}
