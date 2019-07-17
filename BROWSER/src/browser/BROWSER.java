
package browser;

import java.io.*;
import java.util.Scanner;

public class BROWSER {
         static char op=' ';
         static boolean tipo;
         static String nombre="", dir="";
         static int cont=0;
         static String result="";
        
    public static class MENU{
        
        
        
        MENU() {
            
            BufferedReader L=new BufferedReader(new InputStreamReader(System.in));
            
            
            while(op!='S'&op!='N'){
                
                
                //ENTRADA Y SALIDA AL PROGRAMA
                System.out.println("Deseas BUSCAR algun Archivo o Carpeta (S/N)");
                
                //VALIDACION
                    try{
                        op=L.readLine().toUpperCase().charAt(0);
                    }catch(IOException e){
                        System.err.println("Se perdio la conexion con el dispositivo");
                    }catch(Exception e){
                        System.err.println("Ha ocurrido un error desconocido");      
                    }
                    
                    //PEDIR TIPO DE ARCHIVO A BUSCAR
                    if(op=='S'){
                        
                    int Btipo=0;    
                    
                        System.out.println("=================================");
                    while(Btipo!=1&Btipo!=2){
                        System.out.println("Que deseas buscar \n 1.-Archivo\n 2.-Carpeta");
                        System.out.println("=================================");
                    //VALIDACION    
                        try{
                             Btipo=Integer.parseInt(L.readLine());
                        }catch(IOException e){
                            System.err.println("Se perdio la conexion con el dispositivo");
                        }catch(Exception e){
                            System.err.println("Ha ocurrido un error desconocido");      
                        }
                        
                        //DETERMINAMOS SI BUSCAREMOS UNA CARPETA O UN ARCHIVO
                        
                        if(Btipo==1)
                            tipo=true;
                        else
                            tipo=false;
                        
                        //PEDIR NOMBRE DE ARCHIVO O CARPETA
                        System.out.println("=================================");
                        System.out.println("Escribe el nombre "+((tipo==true)?"del Archivo":"de la Carpeta"));
                        
                        //VALIDACION
                        try{
                             nombre=L.readLine();
                        }catch(IOException e){
                            System.err.println("Se perdio la conexion con el dispositivo");
                        }catch(Exception e){
                            System.err.println("Ha ocurrido un error desconocido");      
                        }
                        System.out.println("=================================");
                        
                        //PEDIR DIRECTORIO
                        System.out.println("Escribe el directorio donde quieres buscar "+((tipo==true)?" el Archivo ":" la Carpeta ") +"\""+nombre+"\"");
                        try{
                             dir=L.readLine();
                        }catch(IOException e){
                            System.err.println("Se perdio la conexion con el dispositivo");
                        }catch(Exception e){
                            System.err.println("Ha ocurrido un error desconocido");      
                        }
                        System.out.println("=================================");
                    }  
                    //IMPRESION AL SALIR DEL PROGRAMA    
                    }else
                        System.out.println("Gracias por usar el programa BROWSER");
            }  
        }
    }
    
    public static class DIR{
        DIR(String D){
            
            File A=new File(D);
            String Arr[]=A.list();
            
            for (int i = 0; i < Arr.length; i++) {
                File B=new File(A.getAbsolutePath()+"\\"+Arr[i]);
                
                
                if(nombre.equals(Arr[i])){
                    
                    result+="===================\n";
                    result+=("Nombre: "+Arr[i]+"\n");
                    result+=("Tipo: "+((B.isFile())?"Archivo":"Carpeta")+"\n");
                    result+=("Tamaño: "+B.length()+" Bytes"+"\n");
                    result+=("Direccion: "+B.getAbsolutePath()+"\n");
                    cont ++;
                }
                
                if(B.isDirectory()){
                    DIR OBJ =new DIR(A.getAbsolutePath()+"\\"+Arr[i]);
                }
                    
            }  
        }
    }
    
    

    public static void main(String[] args) {
        
        
        while(op!='S'){
            MENU OBJ=new MENU();
        }
        
        if(op=='S'){
            DIR OBJ=new DIR(dir);
        }
         
         
        System.out.println("RESULTADO\nSe han encontrado "+cont+((cont==1)?"concidencia":"concidencias"));
        System.out.println(result);
        
        
        
        
        
        
        
        
        
        
    }
}
