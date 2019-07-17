
import java.io.IOException;

public class aula {

    public static void main(String[] args) throws IOException {
       
     java.io.BufferedReader lector=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
       
     
     char opcion;
     
     String nombre[]=new String[1000];
     int calificacion[]=new int[1000];
     
     int indice=0, suma=0;
     do{
         
        
         System.out.println("Ingresa nombre del alumno");
            nombre[indice]=(lector.readLine());           
            
         System.out.println("Ingresa calificacion del alumno"); 
            calificacion[indice]=(Integer.parseInt(lector.readLine()));
            suma+=calificacion[indice];
            
         indice++;
         
         System.out.println("Deseas agregar otro Alumno?"); 
            opcion=lector.readLine().toUpperCase().charAt(0);            
          
            
     }while(opcion=='S');         
        
     
     float promedio=suma/(indice);
     int pMayor=0, pMenor=0;
     
     //ENCONTRAR EL MAYOR
     
     int mayor=0;
     for(int i=0; i<(indice); i++)
     {
         if(mayor<calificacion[i])
         {
             mayor=calificacion[i];
             pMayor=i;
         }
             
     }
     
     //ENCONTRAR EL MENOR
     int menor=10;
     for(int i=0; i<(indice); i++)
     {
         if(menor>calificacion[i]&calificacion[i]!=0)
         {
             menor=calificacion[i];
             pMenor=i;
         }
     }
     
    
     //IMPRIMIR
        System.out.println("CALIFICACIONES DEL AULA 501 ");
        System.out.println("Alumno mas sobre saliente: "+nombre[pMayor]);
        System.out.println("Su calificacion: "+mayor);
        System.out.println("Promedio: "+promedio);
        System.out.println("Alumno mas jodido: "+nombre[pMenor]);
        System.out.println("Su calificacion: "+menor);
    
    
     
    }
}
