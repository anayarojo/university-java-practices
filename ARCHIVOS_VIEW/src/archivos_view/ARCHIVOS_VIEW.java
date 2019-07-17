
package archivos_view;

import java.io.File;
import javax.swing.JFrame;

public class ARCHIVOS_VIEW {
    /*
    public static class DIR{
        String b[];
        File a;
        
        DIR(String D){
          a=new File(D);
          b=a.list();
        }
        
        public void ARR(){
            
            
            for (int i = 0; i < b.length; i++) {
                File c=new File(a.getAbsoluteFile()+"\\"+b[i]);
                
                if(c.isFile()==true){
                    System.out.println("====================");
                    System.out.println("Nombre: "+b[i]);
                    System.out.println("Tipo: "+((c.isFile()==true)?"Archivo":"Directorio"));
                    System.out.println("Tamaño: "+c.length());
                    System.out.println("Directorio: "+c.getAbsolutePath());  
                }
                else{
                    
                }  
            }
            
        }
    }
    
     * 
     */
    
    
        public static class DIR{
            
        String b[];
        File a;
        
        DIR(String D){
          a=new File(D);
          b=a.list();
          
          
          for (int i = 0; i < b.length; i++) {
                File c=new File(a.getAbsoluteFile()+"\\"+b[i]);
                
                if(c.isFile()==true){
                    System.out.println("====================");
                    System.out.println("Nombre: "+b[i]);
                    System.out.println("Tipo: "+((c.isFile()==true)?"Archivo":"Directorio"));
                    System.out.println("Tamaño: "+c.length());
                    System.out.println("Directorio: "+c.getAbsolutePath());  
                }
                else{
                    DIR OBJ=new DIR(c.getAbsolutePath());
                    
                }
        }   
        }
    }
        public static class VIEW{
            public void J(){
                JFrame V=new JFrame();
                V.setBounds(10, 20, 600, 400);
                V.setVisible(true);
                
                
                
                
            }
        }
    
    
    public static void main(String[] args) {
        
        //DIR OBJ=new DIR("F:\\RAUL");
        //VIEW OBJ2=new VIEW();
        //OBJ2.J();
        
    }
}
