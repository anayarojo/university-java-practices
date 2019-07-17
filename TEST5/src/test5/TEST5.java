
package test5;

import java.util.*;

public class TEST5 {

    public static class ARREGLOS {

        Scanner lector = new Scanner(System.in);
        String texto[] = new String[10];
        

        public void INGRESA_PALABRAS() {
            for (int i = 0; i < texto.length; i++) {
                System.out.println("Ingresa palabra en posicion " + i);
                texto[i] = lector.nextLine();
            }
        }

        public void ELEMENTOS() {
            //ELEMENTOS UNICOS
            Set A = new HashSet();
            A.addAll(Arrays.asList(texto));
            
            String elementos[]=new String[A.size()];
            int n = 0;
            Iterator E = A.iterator();
            while (E.hasNext()) {
                elementos[n] = (E.next().toString());
                n++;
            }
            for (int i = 0; i <elementos.length; i++) {
                System.out.println(elementos[i]);
                
            }
            int cont[] = new int[elementos.length];
            //CONTAR
            System.out.println("================CONTADOR================");
            for (int x = 0; x < elementos.length; x++) {
                for (int y = 0; y < texto.length; y++) {
                    if (elementos[x].equals(texto[y]) == true) {
                        cont[x]++;
                    }
                }
                System.out.println("El elemento \"" + elementos[x] + "\" se repite " + cont[x] + ((cont[x] == 1) ? " vez" : " veces"));
            }
            System.out.println("========================================");
            //MAXIMO
            int maximo = 0;
            for (int i = 0; i < cont.length; i++) {
                if (maximo < cont[i]) {
                    maximo = cont[i];
                }
            }
            for (int i = 0; i < elementos.length; i++) {
                if (cont[i] == maximo) 
                    System.out.println("El elemento \"" + elementos[i] + "\" es MAXIMO con " + cont[i] + ((cont[i] == 1) ? " repeticion" : " repeticiones"));
            }
            //MINIMO
            int minimo = elementos.length;
            for (int i = 0; i < cont.length; i++) {
                if (minimo > cont[i]) {
                    minimo = cont[i];
                }
            }
            for (int i = 0; i < elementos.length; i++) {
                if (cont[i] == minimo) 
                    System.out.println("El elemento \"" + elementos[i] + "\" es MINIMO con " + cont[i] + ((cont[i] == 1) ? " repeticion" : " repeticiones"));
            }
        }
    }

    public static void main(String[] args) {
        ARREGLOS ins=new ARREGLOS();
        ins.INGRESA_PALABRAS();
        ins.ELEMENTOS();
    }
}
