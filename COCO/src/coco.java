/*java.awt, que permite crear ventanas.
java.awt.event, que aporta mecanismos de detección de eventos.
Javax.swing, que proporciona controles como cajas de texto, botones,...
 * 
 */

//El código del programa es el siguiente:

// Ventana.java
// Ejemplo de aplicación en Java que trata de ilustrar el proceso de
// creación de ventanas y controles y manejo de eventos.
// Se añaden oyentes de eventos para gestionar el clic del ratón
// tanto sobre el botón de cierre de la esquina de la ventana como
// sobre el botón central de la misma.

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

// Ventana (clase principal)
public class coco {
// main
public static void main(String[] args) {
JFrame vent = new JFrame(); // Una ventana
JButton btnCerrar = new JButton("Cerrar"); // Un botón
JButton boton=new JButton("Boton");
Container cnt = vent.getContentPane(); // Contenedor de la ventana

// Propiedades del botón
btnCerrar.addActionListener(new OyenteBoton());
boton.addActionListener(new OyenteBoton());

// Añadir botón a la ventana:
cnt.add(btnCerrar);
cnt.add(boton);

// Propiedades de la ventana
vent.setLocation(100, 100);
vent.setSize(400, 300);
vent.setTitle("WINDOWS 9.7");


// Un Layout es la forma en que los controles se colocan
// en la ventana a medida que se añaden. FlowLayout
// coloca cada control a continuación del anterior.
vent.setLayout(new FlowLayout());

// Añadir el oyente a la ventana y mostrarla:
vent.addWindowListener(new OyenteVentana());
vent.setVisible(true);
}
}

// Oyente de la ventana
class OyenteVentana extends WindowAdapter {
// Oyente del evento de cierre de ventana
public void windowClosing(WindowEvent e) {
System.exit(0); // Salir del programa
}
}

// Oyente del botón
class OyenteBoton implements ActionListener {
// Oyente del evento de clic en el botón
public void actionPerformed(ActionEvent e) {
// Si el texto del control es "Cerrar",
// el programa termina.
if (e.getActionCommand() == "Cerrar")
System.exit(0);
}
}
