package arreglos6;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ARREGLOS6 {

    public static class ARREGLOS {

        Scanner lector = new Scanner(System.in);
        String cadena;

        public void INGRESA_CADENA() {
            System.out.println("Ingresa el texto");
            cadena = lector.nextLine();

            char A[] = new char[cadena.length()];

            for (int i = 0; i < A.length; i++) {
                A[i] = cadena.charAt(i);
            }

            System.out.println("=========================================");
            for (int x = 0; x < A.length; x++) {

                int contador = -1;
                for (int y = 0; y < A.length; y++) {
                    if (A[x] == A[y]) {
                        contador++;
                    }
                }
                if (contador == 0) {
                    System.out.println("La letra " + A[x] + " NO SE REPITE ");
                } else {
                    System.out.println("La letra " + A[x] + " se repite " + contador + ((contador == 1) ? " vez" : " veces"));
                }
            }
        }
    }

    public static void main(String[] args) {

        ARREGLOS ins = new ARREGLOS();
        ins.INGRESA_CADENA();

    }
}
