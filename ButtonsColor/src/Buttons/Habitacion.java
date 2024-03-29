
package Buttons;

import java.awt.*;
import java.awt.event.*;

public class Habitacion extends javax.swing.JPanel implements MouseListener{

    Color Rojo=(new java.awt.Color(255,0,15));
    Color Verde=(new java.awt.Color(0,158,56));
    Color Gris=(new java.awt.Color(51,51,51));
    Color Rojo_claro=(new java.awt.Color(255,20,40));
    Color Verde_claro=(new java.awt.Color(0,185,85));
    Color Gris_claro=(new java.awt.Color(75,75,75));
    
    int status=0;
    
    public Habitacion() {
        super();
        initComponents();
        this.setCursor(new Cursor(Cursor.HAND_CURSOR));
        this.addMouseListener(this);
    }
    
    public void texto(String cuarto, String tipo){
        txt_cuarto.setText(cuarto);
        txt_tipo.setText(tipo);
    }
    
    public void status(int x){
        status=x;
    }
    
     public void mouseClicked(MouseEvent e) {        
         
     }
 
     public void mousePressed(MouseEvent e) {
         
     }
 
     public void mouseReleased(MouseEvent e) {
         
     }
 
     public void mouseEntered(MouseEvent e) {
        switch(status){
            case 0:
                this.setBackground(Gris_claro);
                break;
            case 1:
                this.setBackground(Verde_claro);
                break;
            case 2: 
                this.setBackground(Rojo_claro); 
                break;
            default:
                this.setBackground(Gris_claro); 
                break;        
        }
     }
 
     public void mouseExited(MouseEvent e) {
         switch(status){
            case 0:
                this.setBackground(Gris);
                break;
            case 1:
                this.setBackground(Verde);
                break;
            case 2: 
                this.setBackground(Rojo); 
                break;
            default:
                this.setBackground(Gris); 
                break;        
        }
     }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        icono = new javax.swing.JLabel();
        txt_tipo = new javax.swing.JLabel();
        txt_cuarto = new javax.swing.JLabel();

        setBackground(new java.awt.Color(51, 51, 51));
        setPreferredSize(new java.awt.Dimension(120, 40));

        icono.setFont(new java.awt.Font("Segoe UI Light", 0, 18)); // NOI18N
        icono.setForeground(new java.awt.Color(255, 255, 255));
        icono.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Cuarto.png"))); // NOI18N

        txt_tipo.setFont(new java.awt.Font("Segoe UI Light", 0, 14)); // NOI18N
        txt_tipo.setForeground(new java.awt.Color(255, 255, 255));
        txt_tipo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_tipo.setText("SUITE");

        txt_cuarto.setFont(new java.awt.Font("Segoe UI Light", 1, 18)); // NOI18N
        txt_cuarto.setForeground(new java.awt.Color(255, 255, 255));
        txt_cuarto.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_cuarto.setText("02");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(icono)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txt_tipo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txt_cuarto, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_cuarto)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                .addComponent(txt_tipo)
                .addComponent(icono))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel icono;
    private javax.swing.JLabel txt_cuarto;
    private javax.swing.JLabel txt_tipo;
    // End of variables declaration//GEN-END:variables
}
