
package explo;

import java.io.File;
import java.io.IOException;
import java.net.URI;
import java.nio.file.Path;
import java.util.Scanner;

public class EXPLO {
    
    static String DIR;
    static boolean TIPO;
    
    
    
    public static class FILES{
        FILES(String D){
            
            File a=new File(D);
            Path dr=a.toPath();
            
            String A[]=a.list();
            
            for (int i = 0; i < A.length; i++) {
                File b=new File(a.getAbsoluteFile()+"\\"+A[i]);
                
                if(b.isFile()==TIPO){
                    System.out.println("====================");
                    System.out.println("Nombre: "+A[i]);
                    System.out.println("Tipo: "+((b.isFile())? "Archivo":"Carpeta" ));
                    System.out.println("Tamaño: "+b.length());
                }
                if(b.isDirectory()){
                    FILES OBJ=new FILES(a.getAbsoluteFile()+"\\"+A[i]);
                }
            }
            
            
        }
    }

    public static void main(String[] args) throws IOException {
        
        Scanner L=new Scanner(System.in);
        Scanner M=new Scanner(System.in);
        
        System.out.println("Listar archivos o carpetas 1.-A  2.-C");
        int x=L.nextInt();
            if(x==1)
                TIPO=true;
            else
                TIPO=false;
        
        System.out.println("Ingresa Directorio");
        String D=M.nextLine();
        FILES OBJ=new FILES(D);
        
        /*
        File a=new File("F:\\RAUL\\ITSON\\ARESW");
        Path dir=a.toPath();
        Path ff=dir.getParent();
        
        System.out.println(dir.getParent());
        System.out.println(ff.getParent());
        
        System.out.println(dir);
        URI F=a.toURI();
        System.out.println(F);
         * 
         */
        
        
    }
}
