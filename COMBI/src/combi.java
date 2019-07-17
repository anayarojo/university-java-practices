
public class combi {

    public static void main(String[] args) {
       
        char entrada[]={'A','B','C'};
        int M=entrada.length;
        
        char FIL[][]=new char[M][(M)*(M-1)];
        
        System.out.println(FIL.length);
        System.out.println(FIL[0].length);
        
        for(int a=0; a<FIL.length; a++)
            FIL[0][a]=entrada[a];
        
        for(int i=1; i<FIL[i].length; i++)
        {
            int x, k;
      
            for(int j=1; j<FIL.length; j++)
            {
                x=(int)(Math.random()*(M-0+1)+0);
                FIL[i][j]=entrada[x];
                
                k=0;
                while(k<j)
                {
                    if(FIL[i][j]==FIL[i][k])
                       j--;
                    else
                       k++; 
                }
  
            }
        }
        
        
        
        /*
              int numeros[]=new int[5];  
      int x=0, y=0;
      
      numeros[y]=(int)(Math.random()*(20-1+1)+1);
      
      for( x =1; x<5; x++)
      {
        numeros[x]=(int)(Math.random()*(20-1+1)+1);
        
        y=0;
        
        while(y<x)
        {
        if(numeros[x]==numeros[y])
            x--;
        else
            y++;
        }    
      }      
        System.out.println("Los numeros son");
      for(x=0; x<5; x++)
            System.out.print(numeros[x]+" ");
          
        System.out.println("");
         * 
         */
        
    }
}
