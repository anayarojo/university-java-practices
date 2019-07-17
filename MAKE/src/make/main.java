
package make;

import java.util.Scanner;

public class main {
    
    public static class ALUMNO{
        Scanner L=new Scanner(System.in);
        
        public String NOMBRE[]=new String[5];
        public int EDAD[]=new int[5];
        public int CAL[]=new int[5];
        
        public void CAPTURAR_DATOS(){
            for (int i = 0; i < EDAD.length; i++) {
                System.out.println("Ingresa NOMBRE del alumno "+i);
                NOMBRE[i]=L.nextLine();
                
                System.out.println("Ingresa EDAD del alumno "+NOMBRE[i]);
                EDAD[i]=L.nextInt();
                
                System.out.println("Ingresa CALIFICACION del alumno "+NOMBRE[i]);
                CAL[i]=L.nextInt();
            }
        }
        public void X_CALIFICACION(){
            System.out.println("Ingresa X calificacion");
            int x=L.nextInt();
            
            for (int i = 0; i < 10; i++) {
                if(x==CAL[i])
                    System.out.println("El alumno "+NOMBRE[i]+" tiene "+x+" calificacion");
            }
        }
        public void MENOR(){
            int menor=10;
            for (int i = 0; i < CAL.length; i++) {
                if(menor>CAL[i])
                    menor=CAL[i];
            }
            for (int i = 0; i < CAL.length; i++) {
                if(menor==CAL[i])
                    System.out.println("El alumno "+NOMBRE[i]+" con calificacion "+menor+", es DEFICIENTE ");
            }
        }
        public void MAYOR(){
            int mayor=0;
            for (int i = 0; i < CAL.length; i++) {
                if(mayor<CAL[i])
                    mayor=CAL[i];
            }
            for (int i = 0; i < CAL.length; i++) {
                if(mayor==CAL[i])
                    System.out.println("El alumno "+NOMBRE[i]+" con calificacion "+mayor+", es SOBRE SALIENTE ");
            }   
        }
        public void LETRA(){
            System.out.println("Ingresa INICIAL del alumno");
            char A=L.nextLine().charAt(0);
            
            System.out.println("Alumnos encontrados con inicial "+A);
            for (int i = 0; i <NOMBRE.length; i++) {
                if(NOMBRE[i].charAt(0)==A)
                    System.out.println(NOMBRE[i]);  
            }
        }
        public void CAL_MAYOR_X(){
            System.out.println("Ingresa X calificacion");
            int x=L.nextInt();
            
            for (int i = 0; i < 10; i++) {
                if(x>=CAL[i])
                    System.out.println("El alumno "+NOMBRE[i]+" tiene "+x+" calificacion");
            }
        }
        public void CAL_MENOR_X(){
            System.out.println("Ingresa X calificacion");
            int x=L.nextInt();
            
            for (int i = 0; i < 10; i++) {
                if(x<=CAL[i])
                    System.out.println("El alumno "+NOMBRE[i]+" tiene "+x+" calificacion");
            }
        }
    }

    public static void main(String[] args) {
        
        Scanner L=new Scanner(System.in);
        ALUMNO OBJ=new ALUMNO();
        System.out.println("=========00=====MENU=====00=========\n"
                + "1.-Capturar datos\n"
                + "2.-Los de X calificacion\n"
                + "3.-Menor calificacion\n"
                + "4.-Mayor calificacion\n"
                + "5.-Bucar nombre apartir de una INICIAL\n"
                + "6.-Calificacion mayor o igual a X\n"
                + "7.-Calificacion menor o igual a X\n"
                + "0.-Salir\n"
                + "=========00===============00=========\n");
        int opcion=L.nextInt();
        switch(opcion){
            case 1:
                OBJ.CAPTURAR_DATOS();
            break;
            case 2:
                OBJ.X_CALIFICACION();
            break;                
             case 3:
                OBJ.MENOR();
            break;               
            case 4:
                OBJ.MAYOR();
            break;
            case 5:
                OBJ.LETRA();
            break;
            case 6:
                OBJ.CAL_MAYOR_X();
            break;
            case 7:
                OBJ.CAL_MENOR_X();
            break; 
            case 0:
                 System.out.println("Usted eligio salir...");
            break;
            default:
                System.err.println("Opcion INVALIDA");
            break;      
        }
        
        
        
    }
}
