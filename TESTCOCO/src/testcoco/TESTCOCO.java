
package testcoco;

import java.io.File;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;

public class TESTCOCO {

    public static void main(String[] args) throws UnknownHostException, SocketException {
        
        
        InetAddress ip=InetAddress.getLocalHost();
        NetworkInterface red = NetworkInterface.getByInetAddress(ip) ;
        
        if(red!=null){
            byte[] mac=red.getHardwareAddress();
            if(mac!=null){
                for(int i=0; i<mac.length; i++){
                    System.out.format("%02X%s", mac[i], (i < mac.length - 1) ? "-" : "");
                }
                System.out.println("");
            }
            else
                System.out.println("La Direccion no existe o no se puede accesar");
        }
        else
            System.out.println("No se encontro la ip de la Network Interface");
        
       
        
        
        
        
        
        
        System.out.println(ip);
        System.out.println(System.getProperty("java.vendor"));
        System.out.println(System.getProperty("java.vendor.url"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("os.name"));
        System.out.println(System.getProperty("user.dir"));
        System.out.println(System.getProperty("file.separator"));
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getenv("PROCESSOR_IDENTIFIER"));
        System.out.println(ip.getHostAddress());
        System.out.println(ip.getHostName());
        System.out.println(red.getName());
        System.out.println((Runtime.getRuntime().totalMemory())/(1024*1024));
        System.out.println(Runtime.getRuntime().maxMemory());
        
        System.out.println("UNIDADES DE DISCOS"); 
        File drives[] = File.listRoots();
       
        for (int index = 0; index < drives.length; index++) 
        {   
            System.out.println(drives[index]);   
        }               
        File file = new File( System.getProperty("user.dir"));  
        Long total = file.getTotalSpace(); 
        Long libre = file.getFreeSpace(); 
        Long usado = total - libre; 
        System.out.println( "Total: " + total/(1024*1024*1024)+"GB"); 
        System.out.println( "Libre: " + libre/(1024*1024*1024)+"GB"); 
        System.out.println( "Usado: " + usado/(1024*1024*1024)+"GB"); 
        
  
     
       
        
        
        

    }
}
