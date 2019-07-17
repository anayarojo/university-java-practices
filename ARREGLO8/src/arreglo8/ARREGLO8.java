package arreglo8;

import java.util.Scanner;

public class ARREGLO8 {

    public static class ARREGLOS {

        Scanner lector = new Scanner(System.in);
        int numeros[] = new int[20];
        int numerox;

        public void DECLARACION() {
            System.out.println("=======================ARREGLO=======================");
            for (int i = 0; i < numeros.length; i++) {
                numeros[i] = (int) (Math.random() * (50 - 1 + 1) + 1);
                System.out.print(numeros[i] + " ");
            }
            System.out.println("");
            System.out.println("=====================================================");
        }

        public void VECES() {

            int contador = 0;
            System.out.println("=====================================================");
            System.out.println("Ingrese numero para ver las REPETICIONES");
            numerox = lector.nextInt();

            for (int i = 0; i < numeros.length; i++) {
                if (numerox == numeros[i]) {
                    contador++;
                }
            }
            System.out.println("El numero " + numerox + " se repite " + contador + ((contador == 1) ? " vez " : " veces "));
        }

        public void DONDE() {

            int contador = 0;
            System.out.println("=====================================================");
            System.out.println("Ingrese numero para ver las POSICIONES");
            numerox = lector.nextInt();

            for (int i = 0; i < numeros.length; i++) {
                if (numerox == numeros[i]) {
                    System.out.println("El numero " + numerox + " esta en la posicion " + i);
                } else {
                    System.out.println("El numero " + numerox + " NO ESTA");
                    break;
                }
            }
        }
    }

    public static void main(String[] args) {

        ARREGLOS ins = new ARREGLOS();
        ins.DECLARACION();
        ins.VECES();
        ins.DONDE();

    }
}
