/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;

/**
 *
 * @author Raul
 */
public class PRUEBA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
                    try{
                
                File a=new File("Q:\\coco.txt");
                FileInputStream C=new FileInputStream(a);
                FileOutputStream V=new FileOutputStream("E:\\coco.txt");
                
                FileChannel I = C.getChannel();  
                FileChannel O = V.getChannel(); 
                I.transferTo(0, I.size(), O);
                
                C.close();
                V.close();
                
                File b=new File("E:\\coco.txt");
                if(b.exists()){
                    
                    System.out.println("______________________________________________________________________________________");
                    System.out.println("Has copiado el archivo \""+b.getName()+"\" a \""+b.getAbsolutePath()+"\"");
                    System.out.println("¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯¯");
                }
                
                
            }catch(FileNotFoundException e){
                System.err.println("NO SE HA ENCONTRADO EL ARCHIVO");
            }catch(IOException e){
                System.err.println("NO SE HA ENCONTRADO DISPOSITIVO");
            }catch(Exception e){
                System.err.println("ERROR DESCONOCIDO");
            }
        
        
    }
}
