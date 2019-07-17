
package cronos;

import java.io.File;
import java.io.IOException;

public class CRONOS {

    public static void main(String[] args) throws IOException {
        /*
        String comando="cmd /c label c:";
        Process p=Runtime.getRuntime().exec(comando);
        
        java.io.BufferedReader L=new java.io.BufferedReader(new java.io.InputStreamReader(p.getInputStream()));
        java.io.BufferedReader E=new java.io.BufferedReader(new java.io.InputStreamReader(p.getErrorStream()));
        
        String c=null;
        while((c=L.readLine())!=null)
        System.out.println(c);
        
        File a[]= File.listRoots();
        
         * 
         */
        
        System.out.println(System.getProperty("c.dir"));
    }
}
