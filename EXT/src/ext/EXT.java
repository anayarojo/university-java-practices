/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ext;

import java.io.File;
import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Raul
 */
public class EXT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
       JFileChooser view = new JFileChooser(); 
       File a=new File("E:\\ANIOX.jar");
       
       
        System.out.println(javax.activation.MimetypesFileTypeMap.getDefaultFileTypeMap().getContentType(a));
    }
}
