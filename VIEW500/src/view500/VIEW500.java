/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view500;

import java.io.IOException;

/**
 *
 * @author Raul
 */
public class VIEW500 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
       
        String c="cmd /c vol c:";
        
        Process P=Runtime.getRuntime().exec(c);
        java.io.BufferedReader L=new java.io.BufferedReader(new java.io.InputStreamReader(P.getInputStream()));
        
        String rec=null;
        
        while((rec=L.readLine())!=null){
            System.out.println(rec);
        }
        
        
        
        
        
    }
}
