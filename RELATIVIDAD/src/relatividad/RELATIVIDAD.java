
package relatividad;

public class RELATIVIDAD {
    
    
    
    public static class R{
    
        
        public int C(int N){
            R OBJ=new R();
            
            if(N==1)return 1;
            else return N*OBJ.C(N-1);
        }
    }
    
    
    public static class RE{
        String nombre;
        int calificacion;
        
        public void R(){
            RE OBJ[]=new RE[10];
            for (int i = 0; i < 10; i++) {
                OBJ[i]=new RE();
            }
            
            
        }
        
    }

    public static void main(String[] args) {
        
        /*
        R OBJ=new R();
        System.out.println( OBJ.C(31));
        
         * 
         */
        
    }
}
