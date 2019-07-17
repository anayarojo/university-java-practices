
package matriz;

public class MATRIZ {

    public static void main(String[] args) {
        
        
        
        int matriz[][]=new int[10][10];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
               matriz[i][j]=(int)(Math.random()*(9-1+1)+1);
            }
        }
        
    
        
        for (int i = 0; i <matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i==j)
                    System.out.print("["+matriz[i][j]+"] ");
                else
                    System.out.print(matriz[i][j]+" ");  
            }
            System.out.println("");
            
        }
        
        
        /*
        System.out.println("DIAGONAL\\");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i==j)
                    System.out.print(matriz[i][j]+" ");
            }
        }
        System.out.println("");
        System.out.println("DIAGONAL/");
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                if(i+j==matriz.length-1)
                    System.out.print(matriz[i][j]+" ");
            }
        }
        System.out.println("");
        
         * 
         */
        
        
        
    }
}
