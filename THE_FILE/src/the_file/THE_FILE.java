
package the_file;

import java.io.File;

public class THE_FILE {

    public static void main(String[] args) {
        
        File a=new File("C:\\");
        String list[]=a.list();
        
        for (int i = 0; i < list.length; i++) {
            
            System.out.println("====================");
            System.out.println("Nombre: "+list[i]);
            File b=new File("C:\\"+list[i]);
            
            if(b.isFile()==true)
               System.out.println("Tipo: Archivo");
            else
               System.out.println("Tipo: Carpeta");
            
            System.out.println("Tamaño: "+(b.length())/1024+ " Kb ");
        }
        System.out.println("====================");
    }
}
