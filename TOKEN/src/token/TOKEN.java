
package token;

import java.util.Scanner;

public class TOKEN {

    public static void main(String[] args) {
        Scanner L=new Scanner(System.in);
        
        System.out.println("Ingresa el texto");
        String texto=(L.nextLine()).toLowerCase();
        
        char C[]=texto.toCharArray();
        int A[]=new int[C.length];
        
        for (int i = 0; i < A.length; i++) {
            A[i]=(int)C[i];
        }
        
        int cont=0;
        if(A[0]!=32)
            A[0]-=32;
        
        for (int i = 1; i < A.length; i++) {
            if(A[i]==32&A[i+((i<A.length-1)?1:-1)]!=32)
                A[i+1]-=32;
                cont++;
        }
        for (int i = 0; i < A.length; i++) {
            System.out.print((char)A[i]);
        }
        System.out.println("");
        for (int i = 0; i < A.length; i++) {
            System.out.print(A[i]+((i<A.length-1)?"-":""));
        }
        System.out.println("");
        
      
        
    }
}
