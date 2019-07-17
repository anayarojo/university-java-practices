import java.util.Scanner;
public class persona {
    private Scanner teclado;
    private String nombre;
    private int edad;
    
    public void inicializar() {
        teclado=new Scanner(System.in);
        System.out.print("Ingrese nombre:");
        nombre=teclado.next();
        System.out.print("Ingrese edad:");
        edad=teclado.nextInt();
    }
    
    public void imprimir() {
        System.out.println("Nombre:"+nombre);
        System.out.println("Edad:"+edad);
    }
    
    public void esMayorEdad() {
        if (edad>=18) {
            System.out.print(nombre+" es mayor de edad.");
        } else {
            System.out.print(nombre+" no es mayor de edad.");
        }
    }
    
    public static void main(String[] ar) {
        persona persona1;
        persona1=new persona();
        persona1.inicializar();
        persona1.imprimir();
        persona1.esMayorEdad();
    }
}