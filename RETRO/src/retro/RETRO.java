
package retro;

import java.io.File;

public class RETRO {
    
    
    public static class RETOR{
        RETOR(String D){
            File a=new File(D);
            String A[]=a.list();
            
            try{
              for (int i = 0; i < A.length; i++) {
                File b=new File(a.getAbsoluteFile()+File.separator+A[i]);
                
                if(b.isFile()){
                    System.out.println(b.getName());
                }
                else{
                    RETOR O=new RETOR(a.getAbsoluteFile()+File.separator+A[i]);
                }
              }
            }catch(Exception e){
                System.err.println(e.getMessage());
            }
            
                    
            }
            
        }
    
    

    public static void main(String[] args) {
        
        RETOR OB=new RETOR("L:\\");
        
        //Setup.exe.manifest
    }
}
