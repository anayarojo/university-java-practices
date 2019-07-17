
public class fixbox {

    public static void main(String[] args) {
        

      String text;  
      for(int numero=1; numero<=100; numero++)
      {    
           text="";
           int FIX=numero%3;
           int BOX=numero%5;
           
           if(FIX==0&BOX==0)
               text="FIXBOX";
           else if(FIX==0)
               text="FIX";
           else if(BOX==0)
               text="BOX";
           else
               text=Integer.toString(numero);
      
          System.out.println(text);
      }

        
    }
}
