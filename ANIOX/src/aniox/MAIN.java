
package aniox;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import javax.swing.DefaultListModel;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;
import javax.swing.filechooser.FileSystemView;


public class MAIN extends javax.swing.JFrame {

    DefaultListModel Ma=new DefaultListModel();
    DefaultListModel Mb=new DefaultListModel();
    
    File a;
    File b;
    
    int cont_a=0;
    int cont_b=0;
    
    
    public MAIN() {
        initComponents();
        
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPopupMenu1 = new javax.swing.JPopupMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jPopupMenu2 = new javax.swing.JPopupMenu();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuItem6 = new javax.swing.JMenuItem();
        jMenuItem7 = new javax.swing.JMenuItem();
        jMenuItem8 = new javax.swing.JMenuItem();
        jPanel2 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JTextField();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();

        jPopupMenu1.setBackground(new java.awt.Color(51, 51, 51));
        jPopupMenu1.setForeground(new java.awt.Color(204, 204, 204));
        jPopupMenu1.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPopupMenu1.setBorderPainted(false);
        jPopupMenu1.setFocusable(false);

        jMenuItem1.setBackground(new java.awt.Color(51, 51, 51));
        jMenuItem1.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem1.setText("Copiar");
        jMenuItem1.setBorder(null);
        jMenuItem1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem1);

        jMenuItem2.setBackground(new java.awt.Color(51, 51, 51));
        jMenuItem2.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem2.setText("Mover");
        jMenuItem2.setBorder(null);
        jMenuItem2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem2ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem2);

        jMenuItem3.setBackground(new java.awt.Color(51, 51, 51));
        jMenuItem3.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem3.setText("Renombrar");
        jMenuItem3.setBorder(null);
        jMenuItem3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem3ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem3);

        jMenuItem4.setBackground(new java.awt.Color(51, 51, 51));
        jMenuItem4.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem4.setText("Ver");
        jMenuItem4.setBorder(null);
        jMenuItem4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem4ActionPerformed(evt);
            }
        });
        jPopupMenu1.add(jMenuItem4);

        jPopupMenu2.setBackground(new java.awt.Color(51, 51, 51));
        jPopupMenu2.setForeground(new java.awt.Color(204, 204, 204));
        jPopupMenu2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 1, true));
        jPopupMenu2.setBorderPainted(false);
        jPopupMenu2.setFocusable(false);

        jMenuItem5.setBackground(new java.awt.Color(51, 51, 51));
        jMenuItem5.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem5.setText("Copiar");
        jMenuItem5.setBorder(null);
        jMenuItem5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem5ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem5);

        jMenuItem6.setBackground(new java.awt.Color(51, 51, 51));
        jMenuItem6.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem6.setText("Mover");
        jMenuItem6.setBorder(null);
        jMenuItem6.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem6ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem6);

        jMenuItem7.setBackground(new java.awt.Color(51, 51, 51));
        jMenuItem7.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem7.setText("Renombrar");
        jMenuItem7.setBorder(null);
        jMenuItem7.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem7.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem7ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem7);

        jMenuItem8.setBackground(new java.awt.Color(51, 51, 51));
        jMenuItem8.setForeground(new java.awt.Color(255, 255, 255));
        jMenuItem8.setText("Ver");
        jMenuItem8.setBorder(null);
        jMenuItem8.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jMenuItem8.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem8ActionPerformed(evt);
            }
        });
        jPopupMenu2.add(jMenuItem8);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("EXPLORADOR - ANIOX");
        setIconImages(null);
        setResizable(false);

        jPanel2.setBackground(new java.awt.Color(204, 204, 204));
        jPanel2.setToolTipText("");

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));
        jPanel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jButton1.setBackground(new java.awt.Color(51, 51, 51));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aniox/FOLDER.png"))); // NOI18N
        jButton1.setToolTipText("");
        jButton1.setBorder(null);
        jButton1.setBorderPainted(false);
        jButton1.setContentAreaFilled(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setFocusPainted(false);
        jButton1.setFocusable(false);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setBackground(new java.awt.Color(51, 51, 51));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aniox/FOLDER.png"))); // NOI18N
        jButton2.setToolTipText("");
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setFocusPainted(false);
        jButton2.setFocusable(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(26, 26, 26));
        jLabel1.setEditable(false);
        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 153, 0));
        jLabel1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jLabel1.setText("NO HAY RUTA");
        jLabel1.setToolTipText("");
        jLabel1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel1.setSelectedTextColor(new java.awt.Color(204, 255, 0));
        jLabel1.setSelectionColor(new java.awt.Color(0, 0, 0));

        jLabel2.setBackground(new java.awt.Color(26, 26, 26));
        jLabel2.setEditable(false);
        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 153, 0));
        jLabel2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        jLabel2.setText("NO HAY RUTA");
        jLabel2.setToolTipText("");
        jLabel2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jLabel2.setSelectedTextColor(new java.awt.Color(204, 255, 0));
        jLabel2.setSelectionColor(new java.awt.Color(0, 0, 0));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 373, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(38, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        jPanel3.setBackground(new java.awt.Color(204, 204, 204));
        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jScrollPane1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jList2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jList2.setFocusable(false);
        jList2.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jList2.setSelectionForeground(new java.awt.Color(204, 204, 204));
        jList2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList2MouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jList2);

        jList1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        jList1.setFocusable(false);
        jList1.setSelectionBackground(new java.awt.Color(51, 51, 51));
        jList1.setSelectionForeground(new java.awt.Color(204, 204, 204));
        jList1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jList1MouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jList1);

        jLabel4.setText("0 Archivos");

        jLabel5.setText("0 Archivos");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 434, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(274, 274, 274))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 433, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel3.setText("© 2012 ANIOX. Reserva todos los derechos");

        jButton3.setBackground(new java.awt.Color(204, 204, 204));
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/aniox/36667354258.png"))); // NOI18N
        jButton3.setToolTipText("");
        jButton3.setBorder(null);
        jButton3.setBorderPainted(false);
        jButton3.setContentAreaFilled(false);
        jButton3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton3.setFocusable(false);
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(632, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(41, 41, 41))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(24, 24, 24))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jButton3)
                        .addContainerGap())))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed

    JFileChooser F1=new JFileChooser();
    F1.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    
    if(F1.showOpenDialog(null)== JFileChooser.APPROVE_OPTION)
    {
        int error=0;
        String A[] = null;
        
        try
        {
            a=F1.getSelectedFile();
            A=a.list();
            
            Ma.removeAllElements();
            
            for (int i = 0; i < A.length; i++) 
            {
                Ma.addElement(A[i]);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "RUTA NO VALIDA", "ERROR", 0);
            Ma.removeAllElements();
            
            this.jLabel1.setText("NO HAY RUTA");
            this.jLabel4.setText("0 Archivos");
            error++;
        }
        
        if(error==0)
        {
            File R[]=File.listRoots();
            
            int x=0;
            String name="";
            
            for (int i = 0; i < R.length; i++) 
            {
                if(R[i].equals(a))
                {
                    name=FileSystemView.getFileSystemView().getSystemDisplayName(R[i]);
                    x=1;
                }
            }
            
            if(x==1)
            {
                this.jLabel1.setText(name);
            }
            else
            {
                this.jLabel1.setText(a.getAbsolutePath());
            }
            
            cont_a=A.length;
            this.jList1.setModel(Ma);
            this.jLabel4.setText(String.valueOf(A.length)+((A.length==1)?" Archivo":" Archivos"));
        }
        
    }
    else
    {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}//GEN-LAST:event_jButton1ActionPerformed

private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

    JFileChooser F2=new JFileChooser();
    F2.setFileSelectionMode(JFileChooser.DIRECTORIES_ONLY);
    
    if(F2.showOpenDialog(null)== JFileChooser.APPROVE_OPTION)
    {
        int error=0;
        String B[] = null;
        
        try
        {
            b=F2.getSelectedFile();
            B=b.list();
            
            Mb.removeAllElements();
            
            for (int i = 0; i < B.length; i++) 
            {
                Mb.addElement(B[i]);
            }
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(rootPane, "RUTA NO VALIDA", "ERROR", 0);
            Mb.removeAllElements();
            this.jLabel2.setText("NO HAY RUTA");
            this.jLabel5.setText("0 Archivos");
            error++;
        }
        
        if(error==0)
        {
            File R[]=File.listRoots();
            
            int x=0;
            String name="";
            
            for (int i = 0; i < R.length; i++) 
            {
                if(R[i].equals(b))
                {
                    name=FileSystemView.getFileSystemView().getSystemDisplayName(R[i]);
                    x=1;
                }
            }
            
            if(x==1)
            {
                this.jLabel2.setText(name);
            }
            else
            {
                this.jLabel2.setText(b.getAbsolutePath());
            }
            
            cont_b=B.length;
            this.jList2.setModel(Mb);
            this.jLabel5.setText(String.valueOf(B.length)+((B.length==1)?" Archivo":" Archivos"));
        }
        
    }
    else
    {
        this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
}//GEN-LAST:event_jButton2ActionPerformed

private void jList1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList1MouseClicked

    if (evt.isMetaDown()) 
    {
        if(cont_a!=0)
        {
            this.jList1.setComponentPopupMenu(jPopupMenu1);
        }
        else
        {
            this.jList1.setComponentPopupMenu(null);
        } 
    }
}//GEN-LAST:event_jList1MouseClicked

private void jList2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jList2MouseClicked

        if (evt.isMetaDown()) 
    {
        if(cont_b!=0)
        {
            this.jList2.setComponentPopupMenu(jPopupMenu2);
        }
        else
        {
            this.jList2.setComponentPopupMenu(null);
        } 
    }

}//GEN-LAST:event_jList2MouseClicked

private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed

    INFO N=new INFO(this, false);
    N.show();
    
}//GEN-LAST:event_jButton3ActionPerformed

private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed

    String file="";
    File a_2 = null;
    File a_copy = null;
    int error=0;
    
    
    file=(String) this.jList1.getSelectedValue();
    if(file==null)
    {
        JOptionPane.showMessageDialog(rootPane, "NO HAS SELECCIONADO UN ARCHIVO","ERROR -NullPointerException",0);
        error++;
    }
   
        if(error==0)
        {
            try
            {
                a_2=new File(a.getAbsolutePath()+File.separator+file);
                a_copy=new File(b.getAbsolutePath()+File.separator+a_2.getName());
            }
            catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(rootPane, "NO HAY RUTA PARA COPIAR EL ARCHIVO ","ERROR - NullPointerException",0);
                error++;
            }
        }
        
        if(error==0)
            {
                if(a_copy.exists())
            {
                JOptionPane.showMessageDialog(rootPane, "EL ARCHIVO YA EXISTE","ERROR - FILE EXISTS",0);
            }
            else
            {
                try
                {
                    FileInputStream in = new FileInputStream(a_2);
                    FileOutputStream out = new FileOutputStream(b.getAbsolutePath()+File.separator+a_2.getName());
            
                    byte Buffer[] = new byte[1024];
                    int x;

                    while ((x = in.read(Buffer)) > 0) 
                    {
                        out.write(Buffer, 0, x);
                    }
                
                if(a_copy.exists())
                {
                    JOptionPane.showMessageDialog(rootPane, "Has copiado el archivo \"" + a_copy.getName() + "\" a \"" + a_copy.getParent() + "\"");
                    Mb.addElement(a_copy.getName());
                    this.jList2.setModel(Mb);
                    cont_b++;
                    this.jLabel5.setText(String.valueOf(cont_b)+((cont_b==1)?" Archivo":" Archivos"));
                }

                //GUARDAR Y LIBERAR BUFFER
                in.close();
                out.close();
                out.flush();
                
            }
            catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(rootPane, "NO HAY RUTA PARA EL DESTINO ","ERROR - NullPointerException",0);
            }
            catch(FileNotFoundException e)
            {
                JOptionPane.showMessageDialog(rootPane, "NO SE HA ENCONTRADO EL ARCHIVO","ERROR - FileNotFoundException",0);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "OCURRIO UN ERROR","ERROR - Exception",0);
            }
        }
     }
}//GEN-LAST:event_jMenuItem1ActionPerformed

private void jMenuItem5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem5ActionPerformed

    String file="";
    File b_2 = null;
    File b_copy = null;
    int error=0;
    
    file=(String) this.jList2.getSelectedValue();
    if(file==null)
    {
        JOptionPane.showMessageDialog(rootPane, "NO HAS SELECCIONADO UN ARCHIVO","ERROR -NullPointerException",0);
        error++;
    }
        if(error==0)
        {
            try
            {
                b_2=new File(b.getAbsolutePath()+File.separator+file);
                b_copy=new File(a.getAbsolutePath()+File.separator+b_2.getName());
            }
            catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(rootPane, "NO HAY RUTA PARA COPIAR EL ARCHIVO ","ERROR - NullPointerException",0);
                error++;
            }
        }
        
        if(error==0)
            {
                if(b_copy.exists())
            {
                JOptionPane.showMessageDialog(rootPane, "EL ARCHIVO YA EXISTE","ERROR - FILE EXISTS",0);
            }
            else
            {
                try
                {
                    FileInputStream in = new FileInputStream(b_2);
                    FileOutputStream out = new FileOutputStream(a.getAbsolutePath()+File.separator+b_2.getName());
            
                    byte Buffer[] = new byte[1024];
                    int x;

                    while ((x = in.read(Buffer)) > 0) 
                    {
                        out.write(Buffer, 0, x);
                    }
                
                if(b_copy.exists())
                {
                    JOptionPane.showMessageDialog(rootPane, "Has copiado el archivo \"" + b_copy.getName() + "\" a \"" + b_copy.getParent() + "\"");
                    Ma.addElement(b_copy.getName());
                    this.jList1.setModel(Ma);
                    cont_a++;
                    this.jLabel4.setText(String.valueOf(cont_a)+((cont_a==1)?" Archivo":" Archivos"));
                }

                //GUARDAR Y LIBERAR BUFFER
                in.close();
                out.close();
                out.flush();
                
            }
            catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(rootPane, "NO HAY RUTA PARA EL DESTINO ","ERROR - NullPointerException",0);
            }
            catch(FileNotFoundException e)
            {
                JOptionPane.showMessageDialog(rootPane, "NO SE HA ENCONTRADO EL ARCHIVO","ERROR - FileNotFoundException",0);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "OCURRIO UN ERROR","ERROR - Exception",0);
            }
        }
     }
}//GEN-LAST:event_jMenuItem5ActionPerformed

private void jMenuItem2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem2ActionPerformed

    String file="";
    File a_2 = null;
    File a_copy = null;
    int error=0;
    
    file=(String) this.jList1.getSelectedValue();
    if(file==null)
    {
        JOptionPane.showMessageDialog(rootPane, "NO HAS SELECCIONADO UN ARCHIVO","ERROR -NullPointerException",0);
        error++;
    }
        if(error==0)
        {
            try
            {
                a_2=new File(a.getAbsolutePath()+File.separator+file);
                a_copy=new File(b.getAbsolutePath()+File.separator+a_2.getName());
            }
            catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(rootPane, "NO HAY RUTA PARA MOVER EL ARCHIVO ","ERROR - NullPointerException",0);
                error++;
            }
        }
        
        if(error==0)
            {
                if(a_copy.exists())
            {
                JOptionPane.showMessageDialog(rootPane, "EL ARCHIVO YA EXISTE","ERROR - FILE EXISTS",0);
            }
            else
            {
                try
                {
                    FileInputStream in = new FileInputStream(a_2);
                    FileOutputStream out = new FileOutputStream(b.getAbsolutePath()+File.separator+a_2.getName());
            
                    byte Buffer[] = new byte[1024];
                    int x;

                    while ((x = in.read(Buffer)) > 0) 
                    {
                        out.write(Buffer, 0, x);
                    }
                
                if(a_copy.exists())
                {
                    
                    JOptionPane.showMessageDialog(rootPane, "Has movido el archivo \"" + a_copy.getName() + "\" a \"" + a_copy.getParent() + "\"");
                    
                    Ma.removeElement(a_copy.getName());
                    this.jList1.setModel(Ma);
                    cont_a--;
                    this.jLabel4.setText(String.valueOf(cont_a)+((cont_a==1)?" Archivo":" Archivos"));
                    
                    
                    
                    Mb.addElement(a_copy.getName());
                    this.jList2.setModel(Mb);
                    cont_b++;
                    this.jLabel5.setText(String.valueOf(cont_b)+((cont_b==1)?" Archivo":" Archivos"));
                }

                //GUARDAR Y LIBERAR BUFFER
                in.close();
                out.close();
                out.flush();
                a_2.delete();
            }
            catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(rootPane, "NO HAY RUTA PARA EL DESTINO ","ERROR - NullPointerException",0);
            }
            catch(FileNotFoundException e)
            {
                JOptionPane.showMessageDialog(rootPane, "NO SE HA ENCONTRADO EL ARCHIVO","ERROR - FileNotFoundException",0);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "OCURRIO UN ERROR","ERROR - Exception",0);
            }
        }
     }
}//GEN-LAST:event_jMenuItem2ActionPerformed

private void jMenuItem6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem6ActionPerformed

    String file="";
    File b_2 = null;
    File b_copy = null;
    int error=0;
    
    file=(String) this.jList2.getSelectedValue();
    if(file==null)
    {
        JOptionPane.showMessageDialog(rootPane, "NO HAS SELECCIONADO UN ARCHIVO","ERROR -NullPointerException",0);
        error++;
    }
    
        if(error==0)
        {
            try
            {
                b_2=new File(b.getAbsolutePath()+File.separator+file);
                b_copy=new File(a.getAbsolutePath()+File.separator+b_2.getName());
            }
            catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(rootPane, "NO HAY RUTA PARA MOVER EL ARCHIVO ","ERROR - NullPointerException",0);
                error++;
            }
        }
        
        if(error==0)
            {
                if(b_copy.exists())
            {
                JOptionPane.showMessageDialog(rootPane, "EL ARCHIVO YA EXISTE","ERROR - FILE EXISTS",0);
            }
            else
            {
                try
                {
                    FileInputStream in = new FileInputStream(b_2);
                    FileOutputStream out = new FileOutputStream(a.getAbsolutePath()+File.separator+b_2.getName());
            
                    byte Buffer[] = new byte[1024];
                    int x;

                    while ((x = in.read(Buffer)) > 0) 
                    {
                        out.write(Buffer, 0, x);
                    }
                
                if(b_copy.exists())
                {
                    
                    JOptionPane.showMessageDialog(rootPane, "Has movido el archivo \"" + b_copy.getName() + "\" a \"" + b_copy.getParent() + "\"");
                    
                    Mb.removeElement(b_copy.getName());
                    this.jList2.setModel(Mb);
                    cont_b--;
                    this.jLabel5.setText(String.valueOf(cont_b)+((cont_b==1)?" Archivo":" Archivos"));
                    
                    
                    
                    Ma.addElement(b_copy.getName());
                    this.jList1.setModel(Ma);
                    cont_a++;
                    this.jLabel4.setText(String.valueOf(cont_a)+((cont_a==1)?" Archivo":" Archivos"));
                }

                //GUARDAR Y LIBERAR BUFFER
                in.close();
                out.close();
                out.flush();
                b_2.delete();
                
            }
            catch(NullPointerException e)
            {
                JOptionPane.showMessageDialog(rootPane, "NO HAY RUTA PARA EL DESTINO ","ERROR - NullPointerException",0);
            }
            catch(FileNotFoundException e)
            {
                JOptionPane.showMessageDialog(rootPane, "NO SE HA ENCONTRADO EL ARCHIVO","ERROR - FileNotFoundException",0);
            }
            catch(Exception e)
            {
                JOptionPane.showMessageDialog(rootPane, "OCURRIO UN ERROR","ERROR - Exception",0);
            }
        }
     }    
}//GEN-LAST:event_jMenuItem6ActionPerformed

private void jMenuItem3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem3ActionPerformed

    String file="";
    File a_2 = null;
    File a_r = null;
    int error=0;
    
    file=(String) this.jList1.getSelectedValue();
    if(file==null)
    {
        JOptionPane.showMessageDialog(rootPane, "NO HAS SELECCIONADO UN ARCHIVO","ERROR -NullPointerException",0);
        error++;
    }
    
    try
    {
        if(file.equals("")==false&error==0)
        {
            String name=JOptionPane.showInputDialog(rootPane, "Ingresa el nuevo nombre");
            
            if(name.equals("")|name.equals(" ")){
                name=file;
                JOptionPane.showMessageDialog(rootPane, "NO HAS INGRESADO NOMBRE","ERROR - NullPointerException",0);
                error++;
            }
    
            a_2=new File(a.getAbsolutePath()+File.separator+file);
             a_r=new File(a.getAbsolutePath()+File.separator+name);
    
                if(a_2.renameTo(a_r)&error==0)
                {
                    JOptionPane.showMessageDialog(rootPane, "El archivo ha cambiado de nombre");
                    Ma.removeElement(file);
                    Ma.addElement(name);
                }
        }
    }
    catch(NullPointerException e)
    {
        JOptionPane.showMessageDialog(rootPane, "NO HAS INGRESADO NOMBRE","ERROR - NullPointerException",0);
    }

}//GEN-LAST:event_jMenuItem3ActionPerformed

private void jMenuItem7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem7ActionPerformed

    String file="";
    File b_2 = null;
    File b_r = null;
    int error=0;
    
    file=(String) this.jList2.getSelectedValue();
    if(file==null)
    {
        JOptionPane.showMessageDialog(rootPane, "NO HAS SELECCIONADO UN ARCHIVO","ERROR -NullPointerException",0);
        error++;
    }
    
    try
    {
        if(file.equals("")==false&error==0)
        {
            String name=JOptionPane.showInputDialog(rootPane, "Ingresa el nuevo nombre");
            
            if(name.equals("")|name.equals(" ")){
                name=file;
                JOptionPane.showMessageDialog(rootPane, "NO HAS INGRESADO NOMBRE","ERROR - NullPointerException",0);
                error++;
            }           
        
            b_2=new File(b.getAbsolutePath()+File.separator+file);
            b_r=new File(b.getAbsolutePath()+File.separator+name);
    
            if(b_2.renameTo(b_r)&error==0)
            {
                JOptionPane.showMessageDialog(rootPane, "El archivo ha cambiado de nombre");
                Mb.removeElement(file);
                Mb.addElement(name);
            }
        }
    }
    catch(NullPointerException e)
    {
        JOptionPane.showMessageDialog(rootPane, "NO HAS INGRESADO NOMBRE","ERROR - NullPointerException",0);
    }

}//GEN-LAST:event_jMenuItem7ActionPerformed

private void jMenuItem4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem4ActionPerformed

    String file="";
    File a_2 = null;
    int error=0;
    
    file=(String) this.jList1.getSelectedValue();
    if(file==null)
    {
        JOptionPane.showMessageDialog(rootPane, "NO HAS SELECCIONADO UN ARCHIVO","ERROR -NullPointerException",0);
        error++;
    }
    
    try
    {
        if(file.equals("")==false&error==0)
        {
            a_2=new File(a.getAbsolutePath()+File.separator+file);
            
            if(a_2.getName().endsWith(".txt"))
            {
                VIEW V=new VIEW(this, false, a_2.getAbsolutePath());
                V.show();
            }
            else
            {
                FILE F=new FILE(this, false,a_2.getAbsolutePath());
                F.show();
            }
        }
    }
    catch(NullPointerException e)
    {
        JOptionPane.showMessageDialog(rootPane, "NO HAS SELECCIONADO UN ARCHIVO","ERROR",0);
    }
}//GEN-LAST:event_jMenuItem4ActionPerformed

private void jMenuItem8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem8ActionPerformed

    String file="";
    File b_2 = null;
    int error=0;
    
    file=(String) this.jList2.getSelectedValue();
    if(file==null)
    {
        JOptionPane.showMessageDialog(rootPane, "NO HAS SELECCIONADO UN ARCHIVO","ERROR -NullPointerException",0);
        error++;
    }
    
    try
    {
        if(file.equals("")==false&error==0)
        {
            b_2=new File(b.getAbsolutePath()+File.separator+file);
            
            if(b_2.getName().endsWith(".txt"))
            {
                VIEW V=new VIEW(this, false, b_2.getAbsolutePath());
                V.show();
            }
            else
            {
                FILE F=new FILE(this, false,b_2.getAbsolutePath());
                F.show();
            }
        }
    }
    catch(NullPointerException e)
    {
        JOptionPane.showMessageDialog(rootPane, "NO HAS SELECCIONADO UN ARCHIVO","ERROR",0);
    }    
}//GEN-LAST:event_jMenuItem8ActionPerformed



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
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MAIN.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new MAIN().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JTextField jLabel1;
    private javax.swing.JTextField jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JList jList1;
    private javax.swing.JList jList2;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    private javax.swing.JMenuItem jMenuItem6;
    private javax.swing.JMenuItem jMenuItem7;
    private javax.swing.JMenuItem jMenuItem8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPopupMenu jPopupMenu1;
    private javax.swing.JPopupMenu jPopupMenu2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}
