package jframe;

import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class PRO_6 extends javax.swing.JFrame {

    public PRO_6() {
        initComponents();
        this.buttonGroup1.add(R1);
        this.buttonGroup1.add(R2);
        this.buttonGroup1.add(R3);

        T1.setHorizontalAlignment(JTextField.CENTER);
        T2.setHorizontalAlignment(JTextField.CENTER);
        T3.setHorizontalAlignment(JTextField.CENTER);
        T4.setHorizontalAlignment(JTextField.CENTER);
        T5.setHorizontalAlignment(JTextField.CENTER);
        T6.setHorizontalAlignment(JTextField.CENTER);
        L2.setHorizontalAlignment(SwingConstants.CENTER);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        T1 = new javax.swing.JTextField();
        C1 = new javax.swing.JCheckBox();
        T2 = new javax.swing.JTextField();
        T3 = new javax.swing.JTextField();
        T4 = new javax.swing.JTextField();
        T5 = new javax.swing.JTextField();
        T6 = new javax.swing.JTextField();
        C2 = new javax.swing.JCheckBox();
        C3 = new javax.swing.JCheckBox();
        C4 = new javax.swing.JCheckBox();
        C5 = new javax.swing.JCheckBox();
        C6 = new javax.swing.JCheckBox();
        E = new javax.swing.JButton();
        R3 = new javax.swing.JRadioButton();
        R2 = new javax.swing.JRadioButton();
        R1 = new javax.swing.JRadioButton();
        L1 = new javax.swing.JLabel();
        L2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("PROGRAMA 6");

        C1.setText(" ");

        C2.setText(" ");

        C3.setText(" ");

        C4.setText(" ");

        C5.setText(" ");

        C6.setText(" ");

        E.setText("EJECUTAR");
        E.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EActionPerformed(evt);
            }
        });

        R3.setText("MULTPLICACION");

        R2.setText("RESTA");

        R1.setText("SUMA");

        L1.setText("SELECCION DE OPERACION");

        L2.setText("RESULTADO");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(T6, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C6))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(T5, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C5))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(T4, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(C3)
                            .addComponent(C4)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(C1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(L1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(E)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(R2)
                                .addComponent(R3)
                                .addComponent(R1)))
                        .addGap(42, 42, 42)))
                .addGap(37, 37, 37))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(L2, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(252, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(L1)
                        .addGap(37, 37, 37)
                        .addComponent(R1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(R3)
                        .addGap(18, 18, 18)
                        .addComponent(E))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C2))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(T6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(C6))))
                .addGap(18, 18, 18)
                .addComponent(L2)
                .addContainerGap(67, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void EActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EActionPerformed


    try {

        int r = 0;
        if (R1.isSelected()) {
            int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;

            if (C1.isSelected()) {
                a = Integer.parseInt(T1.getText());
            }
            if (C2.isSelected()) {
                b = Integer.parseInt(T2.getText());
            }
            if (C3.isSelected()) {
                c = Integer.parseInt(T3.getText());
            }
            if (C4.isSelected()) {
                d = Integer.parseInt(T4.getText());
            }
            if (C5.isSelected()) {
                e = Integer.parseInt(T5.getText());
            }
            if (C6.isSelected()) {
                f = Integer.parseInt(T6.getText());
            }

            r = a + b + c + d + e + f;
        } else if (R2.isSelected()) {

            try {

                int suma = 0;
                int a = 0, b = 0, c = 0, d = 0, e = 0, f = 0;

                if (C1.isSelected()) {
                    a = Integer.parseInt(T1.getText());

                } else {
                    suma += Integer.parseInt(T1.getText());
                }
                if (C2.isSelected()) {
                    b = Integer.parseInt(T2.getText());
                } else {
                    suma += Integer.parseInt(T2.getText());
                }
                if (C3.isSelected()) {
                    c = Integer.parseInt(T3.getText());
                } else {
                    suma += Integer.parseInt(T3.getText());
                }
                if (C4.isSelected()) {
                    d = Integer.parseInt(T4.getText());
                } else {
                    suma += Integer.parseInt(T4.getText());
                }
                if (C5.isSelected()) {
                    e = Integer.parseInt(T5.getText());
                } else {
                    suma += Integer.parseInt(T5.getText());
                }
                if (C6.isSelected()) {
                    f = Integer.parseInt(T6.getText());
                } else {
                    suma += Integer.parseInt(T6.getText());
                }


                r = suma - (a + b + c + d + e + f);

            } catch (NumberFormatException e) {
                JOptionPane.showMessageDialog(rootPane, "PARA REALIZAR LA RESTA\nINGRESA SOLO NUMEROS EN TODOS LOS ESPACIOS");
            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, "ERROR DESCONOCIDO");
            }


        } else if (R3.isSelected()) {

            int a = 1, b = 1, c = 1, d = 1, e = 1, f = 1;

            if (C1.isSelected()) {
                a = Integer.parseInt(T1.getText());
            }
            if (C2.isSelected()) {
                b = Integer.parseInt(T2.getText());
            }
            if (C3.isSelected()) {
                c = Integer.parseInt(T3.getText());
            }
            if (C4.isSelected()) {
                d = Integer.parseInt(T4.getText());
            }
            if (C5.isSelected()) {
                e = Integer.parseInt(T5.getText());
            }
            if (C6.isSelected()) {
                f = Integer.parseInt(T6.getText());
            }

            r = a * b * c * d * e * f;

        }

        L2.setText(String.valueOf(r));

    } catch (NumberFormatException e) {
        JOptionPane.showMessageDialog(rootPane, "INSERTA SOLO NUMEROS");
    } catch (ArithmeticException e) {
        JOptionPane.showMessageDialog(rootPane, "ERROR ARITMETICO");
    } catch (Exception e) {
        JOptionPane.showMessageDialog(rootPane, "ERROR DESCONOCIDO");
    }




}//GEN-LAST:event_EActionPerformed

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
            java.util.logging.Logger.getLogger(PRO_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PRO_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PRO_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PRO_6.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new PRO_6().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JCheckBox C1;
    private javax.swing.JCheckBox C2;
    private javax.swing.JCheckBox C3;
    private javax.swing.JCheckBox C4;
    private javax.swing.JCheckBox C5;
    private javax.swing.JCheckBox C6;
    private javax.swing.JButton E;
    private javax.swing.JLabel L1;
    private javax.swing.JLabel L2;
    private javax.swing.JRadioButton R1;
    private javax.swing.JRadioButton R2;
    private javax.swing.JRadioButton R3;
    private javax.swing.JTextField T1;
    private javax.swing.JTextField T2;
    private javax.swing.JTextField T3;
    private javax.swing.JTextField T4;
    private javax.swing.JTextField T5;
    private javax.swing.JTextField T6;
    private javax.swing.ButtonGroup buttonGroup1;
    // End of variables declaration//GEN-END:variables
}
