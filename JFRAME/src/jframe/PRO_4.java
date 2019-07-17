/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PRO_4.java
 *
 * Created on 22-abr-2012, 12:03:08
 */
package jframe;

import javax.swing.DefaultListCellRenderer;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

/**
 *
 * @author Raul
 */
public class PRO_4 extends javax.swing.JFrame {

    /** Creates new form PRO_4 */
    public PRO_4() {
        initComponents();
        
        DefaultListCellRenderer OBJ = (DefaultListCellRenderer) L1.getCellRenderer();
        DefaultListCellRenderer OBJ2 = (DefaultListCellRenderer) L2.getCellRenderer();
        OBJ.setHorizontalAlignment(SwingConstants.CENTER);
        OBJ2.setHorizontalAlignment(SwingConstants.CENTER);
        
    }
    int a[] = new int[30];

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        L1 = new javax.swing.JList();
        B1 = new javax.swing.JButton();
        B2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        L2 = new javax.swing.JList();
        SP1 = new javax.swing.JSpinner();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROGRAMA 4");

        jScrollPane1.setViewportView(L1);

        B1.setText("Generar Aleatorios");
        B1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B1ActionPerformed(evt);
            }
        });

        B2.setText("Multiplos de ");
        B2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                B2ActionPerformed(evt);
            }
        });

        jScrollPane2.setViewportView(L2);

        SP1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(B2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(55, 55, 55)
                                .addComponent(SP1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(31, 31, 31)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(B1)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(49, Short.MAX_VALUE)
                .addComponent(B1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B2)
                        .addGap(18, 18, 18)
                        .addComponent(SP1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(73, 73, 73))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void B1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B1ActionPerformed

    javax.swing.DefaultListModel M = new javax.swing.DefaultListModel();
    M.removeAllElements();
    for (int i = 0; i < a.length; i++) {
        int x = (int) (Math.random() * (50 - 1 + 1) + 1);
        a[i] = x;
        M.addElement(x);
    }

    L1.setModel(M);
}//GEN-LAST:event_B1ActionPerformed

private void B2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_B2ActionPerformed


    try {

        Object O = SP1.getValue();
        javax.swing.DefaultListModel M = new javax.swing.DefaultListModel();
        M.removeAllElements();

        String t = O.toString();
        int b = Integer.parseInt(t);

        for (int i = 0; i < a.length; i++) {
            if (a[i] % b == 0) {
                M.addElement(a[i]);
            }
        }
        L2.setModel(M);

    } catch (ArithmeticException e) {
        JOptionPane.showMessageDialog(rootPane, "ERROR ARITMETICO \nELIGE UN NUMERO VALIDO");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, "ERROR DESCONOCIDO");
    }


}//GEN-LAST:event_B2ActionPerformed

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
            java.util.logging.Logger.getLogger(PRO_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRO_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRO_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRO_4.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PRO_4().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B1;
    private javax.swing.JButton B2;
    private javax.swing.JList L1;
    private javax.swing.JList L2;
    private javax.swing.JSpinner SP1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
