/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package coco2;

import java.io.File;
import java.io.IOException;
import java.nio.file.FileSystem;
import javax.swing.filechooser.FileSystemView;
import org.hyperic.sigar.FileSystemUsage;
import org.hyperic.sigar.NfsFileSystem;
import org.hyperic.sigar.Sigar;
import org.hyperic.sigar.SigarException;
import org.hyperic.sigar.SigarProxy;
import org.hyperic.sigar.SigarProxyCache;

/**
 *
 * @author Raul
 */
public class COCO2 {
   
    
    public static void main(String[] args) throws SigarException, IOException {
        
        
        Sigar sigar=new Sigar();
        SigarProxy driver=SigarProxyCache.newInstance();
        org.hyperic.sigar.FileSystem disco[]=driver.getFileSystemList();
        
        System.out.println(disco[0].getDevName());
        
        
        /*
         * 
        File disco5[]=File.listRoots();
        
        File coco=new File("C:\\");
        System.out.println(coco);
       
        
                File dirActual = new File("F://");
        File lista[] = dirActual.listFiles();
        for (int i = 0; i < lista.length; i++)
        {

           System.out.println("Nombre: "+lista[i].getName());
           System.out.println("Tamaño: "+lista[i].length());
           if(lista[i].isDirectory())
               System.out.println("Es un directorio");
           else
               System.out.println("Es un archivo");
           System.out.println("-------------------");
        }

        //Comprobar si existe el archivo "prueba.txt"

        File imagen=new File("F:\\DIBUJOS.png");
                System.out.println(imagen.length());

        File prueba = new File("F:\\prueba.txt");
        System.out.println(prueba.createNewFile());
                System.out.println(prueba.length()/1024);
                System.out.println(prueba.getAbsolutePath());
        if(prueba.exists())
           System.out.println("El archivo prueba.txt existe");
        else
           System.out.println("El archivo prueba.txt NO existe");
         * 
         */
        
        /*
        File coco[]=File.listRoots();
        System.out.println(coco[0]);
         * 
         */
    }
}
