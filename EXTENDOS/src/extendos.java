/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Raul
 */
public class extendos {
    public static class UNO
    {
        public static class SUBUNO
        {
            public void SUMA()
            {
                System.out.println("5");
            }
        }
      public void ONE()
      {
          
      }
    }
    
    public static class DOS extends UNO
    {
      public void TWO()
      {
          
      }       
    }
    
    
    public static void main(String[] args) {
        
        UNO.SUBUNO obj=new UNO.SUBUNO();
        obj.SUMA();
        DOS element=new DOS();
        element.ONE();
    }
}
