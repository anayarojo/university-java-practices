
package Buttons;


import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.JPanel;

public class Habitacion extends javax.swing.JLabel implements MouseListener {
    
    JPanel P=new JPanel();
    Color entrar=Color.RED;
    Color salir=Color.GRAY;
    
    public  Habitacion(){
         super();
         //se le da un tamaño        
         this.setPreferredSize(new Dimension(260,60));
         //se le coloca una imagen
         this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/On.png")));               
         //se cambia de cursor default por otro, el de la "manito"
         this.setCursor(new Cursor(Cursor.HAND_CURSOR));       
         //se añade los eventos del mouse
         P.setSize(this.getSize());
         this.add(P);
         this.addMouseListener(this);                
     }    
    
    @Override
     public void mouseClicked(MouseEvent e) {        
         
     }
 
    @Override
     public void mousePressed(MouseEvent e) {
     }
 
    @Override
     public void mouseReleased(MouseEvent e) {                     
     }
 
    @Override
     public void mouseEntered(MouseEvent e) {
         this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/On.png")));
         P.setBackground(entrar);
     }
 
    @Override
     public void mouseExited(MouseEvent e) {
         this.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Off.png")));
         P.setBackground(salir);
     }   
    
}
