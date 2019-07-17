
package split;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

public class Split {
    
    public static class ARREGLOS{
        
        Scanner L=new Scanner(System.in);
        String texto;
        
        
        public void PEDIR_TEXT(){
            //PEDIR TEXTO
            System.out.println("Ingresa el TEXTO");
            texto=L.nextLine();
            
            //TODOS LOS ELEMENTOS
            char C[]=texto.toCharArray();
            Set A=new HashSet();
            
            //ELEMENTOS UNICOS
            for(int i=0; i<C.length; i++)
                A.add(C[i]);
            Iterator E=A.iterator();
            
            String elementos="";
            while (E.hasNext())
            elementos+=E.next();
            
            char M[]=new char[elementos.length()];
            int cont[]=new int[M.length];
                    
            for(int i=0; i<M.length; i++)
                M[i]=elementos.charAt(i);
            
            //CONTADOR
            System.out.println("============CONTADOR============");
            for(int x=0; x<M.length; x++){
                for(int y=0; y<C.length; y++){
                    if(M[x]==C[y])
                    cont[x]++;
                }
                System.out.println("El elemento \""+M[x]+"\" se repite "+cont[x]+((cont[x]==1)?" vez":" veces"));
            }
            System.out.println("================================");
            
            //MAXIMO
            int maximo=0;
            for(int i=0; i<cont.length; i++){
                if(maximo<cont[i])
                    maximo=cont[i];
            }
            for(int i=0; i<M.length; i++)
                if(cont[i]==maximo)
                    System.out.println("El elemento \""+M[i]+"\" es MAXIMO con "+cont[i]+((cont[i]==1)? " repeticion":" repeticiones"));
            
            //MINIMO
            int minimo=cont.length;
            for(int i=0; i<cont.length; i++){
                if(minimo>cont[i])
                    minimo=cont[i];
            }
            for(int i=0; i<M.length; i++)
                if(cont[i]==minimo)
                    System.out.println("El elemento \""+M[i]+"\" es MINIMO con "+cont[i]+((cont[i]==1)? " repeticion":" repeticiones")); 
        } 
    }

    public static void main(String[] args) {
        ARREGLOS ins=new ARREGLOS();
        ins.PEDIR_TEXT();
        
        
        
    }
}
