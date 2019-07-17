
package Interfaz;

import Paneles.Control;
import java.awt.BorderLayout;
import java.awt.Color;
import java.text.SimpleDateFormat;
import java.util.*;
import javax.swing.*;

public class Integrador extends javax.swing.JFrame {
    
    Calendar Ca;
    java.util.Date Actual;
    String fecha;
    
    Color azul = new java.awt.Color(0,95,173);
    Color rojo = new java.awt.Color(235,0,15);        
    Color naranja = new java.awt.Color(255,51,0);        
    Color verde = new java.awt.Color(0,158,56);
    Color gris = new java.awt.Color(51,51,51);
    //Color gris = new java.awt.Color(51,51,51);
    
    public Integrador() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage (new ImageIcon(getClass().getResource("/Iconos/hotel.png")).getImage());
        this.setTitle("Hotel Suite San Juan - Alamos, Sonora");
        Menu();
        Fecha();
    }
    
    public void Fecha(){
       SimpleDateFormat Sf = new SimpleDateFormat("dd 'de' MMMM 'de' yyyy", new Locale("ES"));
       SimpleDateFormat D = new SimpleDateFormat("d/MM/yyyy", new Locale("ES"));
       Ca=Calendar.getInstance();
       Actual =Ca.getTime();
       int d=Actual.getDay();
       String dia="";
       switch(d)
       {
           case 0: dia="domingo"; break;
           case 1: dia="lunes"; break;
           case 2: dia="martes"; break;
           case 3: dia="miercoles"; break;
           case 4: dia="jueves"; break;
           case 5: dia="viernes"; break; 
           case 6: dia="sabado"; break;     
       }
       Fecha_larga.setText("Hoy es "+dia+", "+Sf.format(Actual));
       fecha=D.format(Actual);
    }
    
    public void Menu(){
        Control.setColor(azul, gris);  Control.setTexto("CONTROL"); Control.setIcono("/Recursos/Control.png"); Control.Iniciar();
        Registro.setColor(rojo, gris); Registro.setTexto("REGISTRO"); Registro.setIcono("/Recursos/Registro.png"); Registro.Iniciar();
        Consulta.setColor(naranja, gris); Consulta.setTexto("CONSULTA"); Consulta.setIcono("/Recursos/Consulta.png"); Consulta.Iniciar();
        Informes.setColor(azul, gris); Informes.setTexto("INFORMES"); Informes.setIcono("/Recursos/Informes.png"); Informes.Iniciar();
        Historial.setColor(verde, gris); Historial.setTexto("HISTORIAL"); Historial.setIcono("/Recursos/Historial.png"); Historial.Iniciar();
        Opciones.setColor(naranja, gris); Opciones.setTexto("OPCIONES"); Opciones.setIcono("/Recursos/Opciones.png"); Opciones.Iniciar();
        Cerrar.setColor(rojo, gris); Cerrar.setTexto("CERRAR"); Cerrar.setIcono("/Recursos/Cerrar.png"); Cerrar.Iniciar();
    }
    
    public void Menu(int A, int B, int C, int D, int E, int F, int G){
        Control.setStatus(A);
        Registro.setStatus(B);
        Consulta.setStatus(C);
        Informes.setStatus(D);
        Historial.setStatus(E);
        Opciones.setStatus(F);
        Cerrar.setStatus(G);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        LayerMenu = new javax.swing.JLayeredPane();
        Control = new Librerias.Menu();
        Registro = new Librerias.Menu();
        Consulta = new Librerias.Menu();
        Informes = new Librerias.Menu();
        Historial = new Librerias.Menu();
        Opciones = new Librerias.Menu();
        Cerrar = new Librerias.Menu();
        L = new javax.swing.JLayeredPane();
        R = new javax.swing.JLayeredPane();
        jPanel3 = new javax.swing.JPanel();
        Fecha_larga = new javax.swing.JLabel();
        Area = new javax.swing.JLayeredPane();
        L1 = new javax.swing.JLayeredPane();
        R1 = new javax.swing.JLayeredPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(1024, 768));

        jPanel2.setBackground(new java.awt.Color(38, 38, 38));

        Control.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ControlMouseClicked(evt);
            }
        });
        Control.setBounds(10, 0, 120, 120);
        LayerMenu.add(Control, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Registro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RegistroMouseClicked(evt);
            }
        });
        Registro.setBounds(140, 0, 120, 120);
        LayerMenu.add(Registro, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Consulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ConsultaMouseClicked(evt);
            }
        });
        Consulta.setBounds(270, 0, 120, 120);
        LayerMenu.add(Consulta, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Informes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InformesMouseClicked(evt);
            }
        });
        Informes.setBounds(400, 0, 120, 120);
        LayerMenu.add(Informes, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Historial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                HistorialMouseClicked(evt);
            }
        });
        Historial.setBounds(530, 0, 120, 120);
        LayerMenu.add(Historial, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Opciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OpcionesMouseClicked(evt);
            }
        });
        Opciones.setBounds(660, 0, 120, 120);
        LayerMenu.add(Opciones, javax.swing.JLayeredPane.DEFAULT_LAYER);

        Cerrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CerrarMouseClicked(evt);
            }
        });
        Cerrar.setBounds(790, 0, 120, 120);
        LayerMenu.add(Cerrar, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addComponent(R, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LayerMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 922, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(R, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE)
                    .addComponent(LayerMenu, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 134, Short.MAX_VALUE))
                .addGap(11, 11, 11))
        );

        jPanel3.setBackground(new java.awt.Color(38, 38, 38));

        Fecha_larga.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        Fecha_larga.setForeground(new java.awt.Color(255, 255, 255));
        Fecha_larga.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fecha_larga.setText("Hoy es ...");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fecha_larga, javax.swing.GroupLayout.DEFAULT_SIZE, 1024, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Fecha_larga)
                .addContainerGap(26, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(R1, javax.swing.GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Area, javax.swing.GroupLayout.PREFERRED_SIZE, 986, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(L1, javax.swing.GroupLayout.DEFAULT_SIZE, 13, Short.MAX_VALUE))
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(L1, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                    .addComponent(R1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE)
                    .addComponent(Area, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 544, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void ControlMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ControlMouseClicked
    Menu(1, 0, 0, 0, 0, 0, 0);
    //Area.removeAll();
    //Paneles.Control C=new Paneles.Control(Area.getSize(), fecha);
    //Adds.Control C=new Adds.Control(this,false, fecha);
    //Area.add(C, BorderLayout.CENTER);
    //C.show();
    
}//GEN-LAST:event_ControlMouseClicked

private void RegistroMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RegistroMouseClicked
    Menu(0, 1, 0, 0, 0, 0, 0);
}//GEN-LAST:event_RegistroMouseClicked

private void ConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ConsultaMouseClicked
    Menu(0, 0, 1, 0, 0, 0, 0);
}//GEN-LAST:event_ConsultaMouseClicked

private void InformesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InformesMouseClicked
    Menu(0, 0, 0, 1, 0, 0, 0);
}//GEN-LAST:event_InformesMouseClicked

private void HistorialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_HistorialMouseClicked
    Menu(0, 0, 0, 0, 1, 0, 0);
}//GEN-LAST:event_HistorialMouseClicked

private void OpcionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OpcionesMouseClicked
    Menu(0, 0, 0, 0, 0, 1, 0);    
}//GEN-LAST:event_OpcionesMouseClicked

private void CerrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CerrarMouseClicked
    Menu(0, 0, 0, 0, 0, 0, 1);
}//GEN-LAST:event_CerrarMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Integrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Integrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Integrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Integrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Integrador().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLayeredPane Area;
    private Librerias.Menu Cerrar;
    private Librerias.Menu Consulta;
    private Librerias.Menu Control;
    private javax.swing.JLabel Fecha_larga;
    private Librerias.Menu Historial;
    private Librerias.Menu Informes;
    private javax.swing.JLayeredPane L;
    private javax.swing.JLayeredPane L1;
    private javax.swing.JLayeredPane LayerMenu;
    private Librerias.Menu Opciones;
    private javax.swing.JLayeredPane R;
    private javax.swing.JLayeredPane R1;
    private Librerias.Menu Registro;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}