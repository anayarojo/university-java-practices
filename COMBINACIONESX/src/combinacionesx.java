
import java.io.IOException;
import java.util.Random;


public class combinacionesx {
    
        public static int numero(int n){
            //METE CANTIDAD DE CARACTERES Y OBTIENES NUMERO DE COMBINACIONES 
           if(n==1) return 1;
           else return n*(numero(n-1));
       }
    
    public static String poscombinacion(int tamaño){
        
            //METES NUMERO DE CARACTERES Y DETERMINA POSCIONES PARA LAS COMBINACIONES
        String posicion="";
        Random aleatorio=new Random();

        int M[]=new int[tamaño];
        int x=0, y=0;
        M[y]=aleatorio.nextInt(tamaño+0);

        for(x=1; x<tamaño; x++)
        {
            M[x]=aleatorio.nextInt(tamaño+0);
            y=0;
            while(y<x)
            {
                if(M[x]==M[y])x--;
                else y++;                
            }
        }
        
        for(x=0; x<tamaño; x++)
            posicion+=M[x];

        return posicion;
        
    }
    
    public static void main(String[] args) throws IOException {
    
        //LECTURA
    java.io.BufferedReader lector=new java.io.BufferedReader(new java.io.InputStreamReader(System.in));
    System.out.println("Ingresa la combinacion base");
    String base=lector.readLine();
    
       //CADENA TO CHAR O CARACTERES
    int x=0, w, y=0;
    char entrada[]=new char[base.length()];
    for(w=0; w<entrada.length; w++)
        entrada[w]=base.charAt(w);
 
    
    
      //DECLARANDO LOS CONTENEDORES DE LAS POSICIONES 
    int n=entrada.length;
    int numero=combinacionesx.numero(n);
    String pos[]=new String[numero];

    
      //MAKING POSICIONES PARA LAS COMBINACIONES 
    String posini="";    
    for(x=0; x<n; x++)
    {
        posini+=x;
    }
    pos[y]=posini;
    
    for(x=1; x<pos.length; x++)
    {
        pos[x]=combinacionesx.poscombinacion(n);
        y=0;
        
        while(y<x)
        {
            if(pos[x].equals(pos[y])==true)
                x--;       
            else 
               y++;
        }
    }
    
       //HACER COMBINACIONES USANDO LAS POSICIONES
    String combinacion;
    String combi[]=new String[numero]; 
    for(int i=0; i<numero; i++)
    {   
        combinacion="";
        for(int j=0; j<n; j++)
        {   
            String aux="";
                   aux+=pos[i].charAt(j);
                   
            combinacion+=entrada[Integer.parseInt(aux)];
        }
        combi[i]=combinacion;
        
    }
        //IMPRIMIR COMBINACIONES
        System.out.println("\nLISTA DE COMBINACIONES");
    for(int i=0; i<combi.length; i++)
      System.out.println(combi[i]);
    
        
    }
}
