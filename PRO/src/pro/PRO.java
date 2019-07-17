/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pro;

import java.io.File;
import javax.swing.filechooser.FileSystemView;

/**
 *
 * @author Raul
 */
public class PRO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        File a=new File("F:\\");
        
        String path=a.getAbsolutePath();
            File R[]=File.listRoots();
        for (int i = 0; i < R.length; i++) 
            {
                if(R[i].equals(a))
                {
                    String name=FileSystemView.getFileSystemView().getSystemDisplayName(R[i]);
                    System.out.println(name);
                }
                else
                {
                    System.out.println(path);
                }
            }
    }
}
