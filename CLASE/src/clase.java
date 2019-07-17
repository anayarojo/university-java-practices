
import java.util.Random;


public class clase {
    
    private String nombres[]={"AGUILAR LOPEZ, JORGE ALBERTO","SANCHEZ OLIVAS, OMAR ALBERTO","RANGEL HERNANDEZ, JESUS MISSAEL",
    "CENICEROS ESCALANTE, JESUS GISELL","RUIZ HIGUERA, RAMIRO ANTONIO","ZAZUETA ALATORRE, MAURICIO","CASTRO VEGA, JESUS EMMANUEL",
    "MIRANDA LARA, JOSE VALENTE","OXIMEA VERDUGO, DANIEL ENRIQUE","VALENCIA ACOSTA, JOSE ANDRES","ESTRADA RENDON, CARLOS",
    "BORBON VILLASENOR, NIZABELEN","VALDEZ MONTEON, KAREN IVETH","LOPEZ DUARTE, OLIVER","GUTIERREZ NEYOY, JUAN EDEL",
    "VALADEZ LAZCANO, EDUARDO ALBERTO","MARTINEZ GARCIA, JOSE RAMON","ANAYA FALCON, FELIZARDO","CABALLERO PRECIADO, JOSE ANGEL",
    "ANAYA ROJO, RAUL","BELTRAN VERDUGO, GABRIELA","OLIVAS OBREGON, JESUS ALBERTO","HIGUERA LOPEZ, OSVALDO GUADALUPE",
    "ESQUER RUIZ, RAMON ELIEZER","CHONG VALDEZ, LUIS ALBERTO","GRANILLO GONZALEZ, EFREN"};
    
    public void QUIEN(){
        
        Random aleatorio=new Random();
        
        for(int i=0; i<3; i++)
        System.out.println((i+1)+".-"+nombres[aleatorio.nextInt(nombres.length)]);            
        

    }
    public void FIBONACCI(){
        
        int a=1, b=2, suma=0;
        
        
        while(suma<=500)
        {
            suma=a+b;
            
            System.out.println(suma);
            
            a=b;
            b=suma;
        }
        
    }
    
    public static class RUTA{
        
        public void COCO(){
            
                
            System.out.println("Hola");
        }
    }
    

    public static void main(String[] args) {

        clase coco=new clase();
        RUTA coco2=new RUTA();
        coco.FIBONACCI();
        coco.QUIEN();
        coco2.COCO();
        
        
        
    }
}
