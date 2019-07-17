
package coco5000;

public class COCO5000 {

  
    public static class UNO{
        public static class SUBUNO{
            public void SUBMETODO(){
                
            }
        }
        public static int cantidad=5;
        private int numero=5;
        
        public static void METODO(){
            int suma=8;
        }
    }
    public static class DOS extends UNO{
        public void MET(){
            
        }
    }
    
    public static void main(String[] args) {
        
        UNO instancia=new UNO();
        int cant=instancia.cantidad;
        System.out.println(cant);
        
        
    }
}
