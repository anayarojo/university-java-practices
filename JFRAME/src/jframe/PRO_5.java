/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * PRO_5.java
 *
 * Created on 22-abr-2012, 12:03:15
 */
package jframe;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

/**
 *
 * @author Raul
 */
public class PRO_5 extends javax.swing.JFrame {

    /** Creates new form PRO_5 */
    public PRO_5() {
        initComponents();

        T1.setHorizontalAlignment(JTextField.CENTER);
        T2.setHorizontalAlignment(JTextField.CENTER);
        L1.setHorizontalAlignment(SwingConstants.CENTER);
        
        this.buttonGroup1.add(R1);
        this.buttonGroup1.add(R2);
        this.buttonGroup1.add(R3);
        this.buttonGroup1.add(R4);
        this.buttonGroup1.add(R5);
    }
    
    float a = 0;
    float b = 0;

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        R1 = new javax.swing.JRadioButton();
        R2 = new javax.swing.JRadioButton();
        R3 = new javax.swing.JRadioButton();
        R4 = new javax.swing.JRadioButton();
        R5 = new javax.swing.JRadioButton();
        L1 = new javax.swing.JLabel();
        T1 = new javax.swing.JTextField();
        B = new javax.swing.JButton();
        T2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROGRAMA 5");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        R1.setText("MULTIPLICAR");
        R1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1ActionPerformed(evt);
            }
        });

        R2.setText("DIVIDIR");
        R2.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        R2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1ActionPerformed(evt);
            }
        });

        R3.setText("RESTAR");
        R3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1ActionPerformed(evt);
            }
        });

        R4.setText("SUMAR");
        R4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1ActionPerformed(evt);
            }
        });

        R5.setText("POTENCIA");
        R5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                R1ActionPerformed(evt);
            }
        });

        L1.setText("0");

        B.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        B.setText("ENTER");
        B.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(R3)
                    .addComponent(R2)
                    .addComponent(R1)
                    .addComponent(R4)
                    .addComponent(R5))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(T2)
                            .addComponent(T1, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(L1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(R1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(R2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R3, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R4))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(B, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(R5))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(L1)))
                .addContainerGap(28, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void BActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BActionPerformed

    try {

        a = Integer.parseInt(T1.getText());
        b = Integer.parseInt(T2.getText());

        float c = 0;

        if (R1.isSelected()) {
            c = a * b;
        } else if (R2.isSelected()) {
            c = a / b;;
        } else if (R3.isSelected()) {
            c = a - b;
        } else if (R4.isSelected()) {
            c = a + b;
        } else if (R5.isSelected()) {
            c = (float) Math.pow(a, b);
        } else {
            JOptionPane.showMessageDialog(rootPane, "SELECCIONA UNA OPERACION");
        }
        L1.setText(String.valueOf(c));

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(rootPane, "ERROR, INGRESA NUMEROS VALIDOS");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, "ERROR DESCONOCIDO");
    }

}//GEN-LAST:event_BActionPerformed

private void R1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_R1ActionPerformed

            if (R1.isSelected()) {
            B.setText("*");
        } else if (R2.isSelected()) {
            B.setText("/");
        } else if (R3.isSelected()) {
            B.setText("-");
        } else if (R4.isSelected()) {
            B.setText("+");
        } else if (R5.isSelected()) {
            B.setText("^");
        }
}//GEN-LAST:event_R1ActionPerformed

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
            java.util.logging.Logger.getLogger(PRO_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRO_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRO_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRO_5.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PRO_5().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton B;
    private javax.swing.JLabel L1;
    private javax.swing.JRadioButton R1;
    private javax.swing.JRadioButton R2;
    private javax.swing.JRadioButton R3;
    private javax.swing.JRadioButton R4;
    private javax.swing.JRadioButton R5;
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    // End of variables declaration//GEN-END:variables
}
