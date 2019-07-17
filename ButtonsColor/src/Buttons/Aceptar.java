
package Buttons;

import java.awt.*;
import java.awt.event.*;

public class Aceptar extends javax.swing.JPanel implements MouseListener{

    Color salir=(new java.awt.Color(50,50,50));
    Color entrar=(new java.awt.Color(100,100,100));
    
    public Aceptar() {
        super();
        initComponents();
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.addMouseListener(this);
    }
    
    public void mouseClicked(MouseEvent e) {        
         
     }
 
     public void mousePressed(MouseEvent e) {
         
     }
 
     public void mouseReleased(MouseEvent e) {
         
     }
 
     public void mouseEntered(MouseEvent e) {
        this.setBackground(entrar);
     }
 
     public void mouseExited(MouseEvent e) {
         this.setBackground(salir);
     }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        texto = new javax.swing.JLabel();

        setBackground(new java.awt.Color(50, 50, 50));
        setPreferredSize(new java.awt.Dimension(120, 40));

        texto.setFont(new java.awt.Font("Segoe UI Light", 0, 20)); // NOI18N
        texto.setForeground(new java.awt.Color(255, 255, 255));
        texto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        texto.setText("ACEPTAR");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 120, Short.MAX_VALUE)
            .addComponent(texto, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
            .addComponent(texto, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel texto;
    // End of variables declaration//GEN-END:variables
}
