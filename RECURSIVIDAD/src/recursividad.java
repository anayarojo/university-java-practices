
public class recursividad {

    
    public static void coco(int numero){

}
    public static void generarPermutacionSust(char[] elementos, String actual, int cantidad) {
        if(cantidad==0) {
            // Hacer con la secuencia generada
            System.out.println(actual);
        }
        else {
            for(int i=0; i<elementos.length; i++) {
                generarPermutacionSust(elementos, actual, elementos[i],cantidad-1);
            }
        }
    }

    private static void generarPermutacionSust(char[] elementos, String actual, char c, int i) {
        throw new UnsupportedOperationException("Not yet implemented");
    }
}

      
    

