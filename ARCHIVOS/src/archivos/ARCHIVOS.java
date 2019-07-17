
package archivos;

import java.io.File;

public class ARCHIVOS {
    
    public static  class DIR{
        
        String A[];
        File a;
        
        DIR(String dir){
            a=new File (dir);
            A=a.list();
        }
        
        public void ARCHIVO(){
            for (int i = 0; i < A.length; i++) {
                
                File b=new File(a.getAbsolutePath()+A[i]);
            
                System.out.println("==============================");
                    if(b.isFile()==true){
                        System.out.println("Nombre: "+b.getName());
                        System.out.println("Tamaño: "+b.length()+" Bytes");
                    }else{
                        DIR OBJ=new DIR(b.getAbsolutePath());
                    }
            }
            
        }
    }

    public static void main(String[] args) {
       
        File a=new File("E:\\");
        String archivo[]=a.list();
    
        for (int i = 0; i < archivo.length; i++) {
            
            
            File b=new File(a.getAbsolutePath()+archivo[i]);
            
            System.out.println("==============================");
            if(b.isFile()==true){
                System.out.println("Nombre: "+b.getName());
                System.out.println("Tamaño: "+b.length()+" Bytes");
            }else{
                DIR OBJ=new DIR(b.getAbsolutePath());
                OBJ.ARCHIVO();
            }
            
            
            
        }
        
         
        
        
        
    }
}
