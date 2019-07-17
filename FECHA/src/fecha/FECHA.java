
package fecha;

import java.util.Calendar;
import java.util.Date;

public class FECHA {
    public static void main(String[] args) {

        Calendar fechas=Calendar.getInstance();
        
        int horas=fechas.get(Calendar.HOUR);
        Date horass=new Date();
        fechas.add(Calendar.DAY_OF_MONTH, +5);
        
        System.out.println(horass.getHours());
        System.out.println(horas);
        System.out.println(fechas.getTime());
        
    }
}
