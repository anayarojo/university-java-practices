package coco5001;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.MemoryMXBean;
import java.net.InetAddress;
import java.net.NetworkInterface;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.Properties;



public class COCO5001 {

    public static void main(String[] args) throws UnknownHostException, SocketException, FileNotFoundException, IOException {

        InetAddress ip = InetAddress.getLocalHost();
        NetworkInterface red = NetworkInterface.getByInetAddress(ip);

        /*
        System.out.print("MAC-Address: ");
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
        
        
        
        System.out.println("IP: "+ip.getHostAddress());
        System.out.println("IP: "+ip.getHostName());
        System.out.println("IP: "+ip.getCanonicalHostName());
        System.out.println("IP: "+ip.getAddress());
        System.out.println("Usuario: "+System.getProperty("user.name"));
        System.out.println("RAM: "+Runtime.getRuntime().totalMemory()/(1024));
        System.out.println("RAM: "+Runtime.getRuntime().totalMemory());
        System.out.println("SO: "+System.getProperty("user.country"));
        System.out.println("SO: "+System.getProperty("user.language"));
        System.out.println("SO: "+System.getProperty("os.name"));
        System.out.println("SO: "+System.getProperty("os.name"));
        System.out.println();
        
        Runtime runtime      = Runtime.getRuntime();
        
        long freeMemory      = runtime.freeMemory();
        long totalMemory     = runtime.totalMemory();
        long maxMemory  = runtime.maxMemory();
        
        System.out.println("Max Memory: "+(maxMemory/1024.0)+"KB");
        System.out.println("Total Memory: "+(totalMemory/1024.0)+"KB");
        System.out.println("Free Memory: "+(freeMemory/1024.0)+"KB");
        
        System.out.println("============================");
        MemoryMXBean mx = ManagementFactory.getMemoryMXBean();
        
        long initMemory = mx.getHeapMemoryUsage().getInit() + mx.getNonHeapMemoryUsage().getInit();
        long usedMemory = mx.getHeapMemoryUsage().getUsed() + mx.getNonHeapMemoryUsage().getUsed();
        long committedMemory = mx.getHeapMemoryUsage().getCommitted() + mx.getNonHeapMemoryUsage().getCommitted();
        long _maxMemory = mx.getHeapMemoryUsage().getMax() + mx.getNonHeapMemoryUsage().getMax();
        
        System.out.println("Max memory:"+(_maxMemory/1024.0)+"KB");
        System.out.println("Committed memory:"+(committedMemory/1024.0)+"KB");
        System.out.println("Init memory:"+(initMemory/1024.0)+"KB");
        System.out.println("Used memory:"+(usedMemory/1024.0)+"KB");
      
        
        
        org.hyperic.sigar.OperatingSystem SO=org.hyperic.sigar.OperatingSystem.getInstance();
        System.out.println(SO.getName());
        System.out.println(SO.getArch());
        System.out.println(SO.getMachine());
        System.out.println(SO.getDescription());
        System.out.println(SO.getCpuEndian());
        
         * 
         */
        
        File discos[]=File.listRoots();
        System.out.println(discos[0]);
        
        
    }
}
