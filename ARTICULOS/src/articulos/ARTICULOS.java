
package articulos;

import java.util.Scanner;

public class ARTICULOS {
    
    public static class ARTICULO{
        public String NOMBRE;
        public int PRECIO;
        public int IVA;
        public int TOTAL;
    }
    public static class VENTAS{
        Scanner L=new Scanner(System.in);
        ARTICULO OBJ[]=new ARTICULO[5];
        
        public void CAPTURAR_DATOS(){
            for (int i = 0; i < OBJ.length; i++) {
                OBJ[i]=new ARTICULO();
            }
            
            for (int i = 0; i < OBJ.length; i++) {
                System.out.println("Ingresa el NOMBRE del articulo");
                OBJ[i].NOMBRE=L.nextLine();
                
                System.out.println("Ingresa el PRECIO del articulo");
                OBJ[i].PRECIO=L.nextInt();
                
                System.out.println("Ingresa el IVA del articulo");
                OBJ[i].IVA=L.nextInt();
                
                OBJ[i].TOTAL=(OBJ[i].PRECIO*OBJ[i].IVA)+OBJ[i].PRECIO;
            }
        }
        public void CALCULAR_TOTAL(){
            
            for (int i = 0; i < 10; i++) {
                
            }
        }
        
    }
    

    public static void main(String[] args) {
        
    }
}
