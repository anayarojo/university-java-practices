
package algoritomo_de_no_repeticion;

public class ALGORITOMO_DE_NO_REPETICION {

    public static void main(String[] args) {
       
        int num[]=new int[5];
        
        int y=0;
        num[y]=(int)(Math.random()*(5-1+1)+1);
        
        for (int i = 1; i < num.length; i++) {
            
            num[i]=(int)(Math.random()*(5-1+1)+1);
            
            y=0;
            while(y<i){
            if(num[y]==num[i])
                i--;
            else
                y++;
            }
        }
        
        
        for (int i = 0; i < num.length; i++) {
            System.out.print(num[i]+" ");
        }
        System.out.println("");
        
        
    }
}
