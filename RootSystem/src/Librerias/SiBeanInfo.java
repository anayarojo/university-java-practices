
package Librerias;

import java.awt.Image;
import java.beans.*;

public class SiBeanInfo extends SimpleBeanInfo {
    
     Image icon;
     Image icon32;
     Image iconM;
     Image icon32M;
     
     public SiBeanInfo(){
         icon = loadImage("/Recursos/Check x16.gif");
         icon32 = loadImage("/Recursos/Check x32.gif");
         iconM = loadImage("/Recursos/Check x16.gif");
         icon32M = loadImage("/Recursos/Check x32.gif");
     }
     
     @Override
     public Image getIcon(int i){
         switch(i)
         {
         case 1:
             return icon;
 
         case 2:
             return icon32;
 
         case 3:
             return iconM;

         case 4:
             return icon32M;
         }
         return null;
     }
    
}
