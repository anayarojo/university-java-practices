
package Paneles;

import Datos.Conexion;
import java.awt.*;
import java.sql.*;
import java.util.*;
import javax.swing.*;


public class PanelControl extends javax.swing.JPanel {
 
    String Hoy;
    String[] ID_cuarto;
    String[] Servicio;
    ArrayList Ocupadas;
    int Rentas=0;
    int Libres=0;
    int Inutiles=0;
    
    String Datos="dbRun", Pass="", Dir="C:";
    Conexion C=new Conexion();
    Connection Conect=null;
    Statement St=null;
    ResultSet Rs=null;
    String Query="";
    
    public PanelControl(Dimension D, String fecha) {
        initComponents();
        this.setSize(D);
        Hoy=fecha;
        Actualizar();
    }
    

    
    public void Actualizar(){
        Servicio();
        Ocupadas();
        Status("2", h02);
        Status("3", h03);
        Status("4", h04);
        Status("5", h05);
        Status("6", h06);
        Status("7", h07);
        Status("8", h08);
        Status("9", h09);
        Status("10", h10);
        Status("11", h11);
        Status("12", h12);
        Status("14", h14);
        Status("15", h15);
        Status("16", h16);
        Status("17", h17);
        Status("18", h18);
        Status("19", h19);
        Status("20", h20);
        Status("22", h22);
        Status("23", h23);
        Status("24", h24);
        Status("25", h25);
        Status("26", h26);
        Status("27", h27);
        Status("28", h28);
        Status("29", h29);
        Status("30", h30);
        Status("31", h31);
        Status("32", h32);
        Status("33", h33);
        Status("34", h34);
        Status("35", h35);
        Status("36", h36);
        Status("37", h37);
        Status("38", h38);
        Status("39", h39);
        Status("40", h40);
        Status("41", h41);
        
        if(Rentas<15)
        {
            Barra.setForeground(new java.awt.Color(0,158,56)); //verde
        }
        else if(Rentas>15&Rentas<30)
        {
            Barra.setForeground(new java.awt.Color(255,51,0)); //naranja
        }
        else
        {
            Barra.setForeground(new java.awt.Color(235,0,15)); //rojo
        }
        
        Barra.setValue(Rentas);
        lbl_ocupadas.setText(Rentas+" Ocupadas");
        lbl_fueradeservicio.setText(Inutiles+" Fuera de servicio");
        lbl_disponibles.setText((38-Rentas-Inutiles)+" Disponibles");
        lbl_barra.setText((Rentas*100/38)+"%");
    }
    
    public void Servicio(){
        ID_cuarto=new String[38];
        Servicio=new String[38];
        for (int i = 0; i < 38; i++)
        {
            Servicio[i]=null;
            ID_cuarto[i]=null;
        }
        Query="SELECT Cuarto,Servicio FROM Habitaciones";
        Conect=C.Conectar(Datos, Pass, Dir);
        
            try 
            {
                St=Conect.createStatement();
                Rs=St.executeQuery(Query);
            
                int i=0;
                while(Rs.next())
                {
                    Servicio[i]=Rs.getString("Servicio");
                    ID_cuarto[i]=Rs.getString("Cuarto");
                    i++;
                }     
            } 
            catch (SQLException e) 
            {
                JOptionPane.showMessageDialog(null, "Error "+e, "SQLException - PanelControl", 0);
            }
            catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, "Error "+e, "Exception - PanelControl", 0);
            }
          
         //HABILITAR TODAS LAS HABITACIONES Y CAMBIARLAS A COLOR VERDE   
         if(Servicio[0].equals("1")){h02.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[1].equals("1")){h03.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[2].equals("1")){h04.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[3].equals("1")){h05.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[4].equals("1")){h06.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[5].equals("1")){h07.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[6].equals("1")){h08.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[7].equals("1")){h09.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[8].equals("1")){h10.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[9].equals("1")){h11.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[10].equals("1")){h12.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[11].equals("1")){h14.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[12].equals("1")){h15.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[13].equals("1")){h16.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[14].equals("1")){h17.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[15].equals("1")){h18.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[16].equals("1")){h19.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[17].equals("1")){h20.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[18].equals("1")){h22.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[19].equals("1")){h23.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[20].equals("1")){h24.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[21].equals("1")){h25.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[22].equals("1")){h26.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[23].equals("1")){h27.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[24].equals("1")){h28.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[25].equals("1")){h29.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[26].equals("1")){h30.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[27].equals("1")){h31.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[28].equals("1")){h32.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[29].equals("1")){h33.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[30].equals("1")){h34.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[31].equals("1")){h35.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[32].equals("1")){h36.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[33].equals("1")){h37.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[34].equals("1")){h38.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[35].equals("1")){h39.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[36].equals("1")){h40.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
         if(Servicio[37].equals("1")){h41.setBackground(new java.awt.Color(0,158,56));}else{Inutiles++;}
    }
    
    public void Ocupadas(){
        Ocupadas=new ArrayList();
        Query="SELECT Fecha,Cuarto FROM clientes WHERE Fecha LIKE '%"+Hoy+"%';";
        Conect=C.Conectar(Datos, Pass, Dir);
            try 
            {
                St=Conect.createStatement();
                Rs=St.executeQuery(Query);
            
                while(Rs.next())
                {
                    Ocupadas.add(Rs.getString("Cuarto"));
                }     
            } 
            catch (SQLException e) 
            {
                JOptionPane.showMessageDialog(null, "Error "+e, "SQLException - PanelControl", 0);
            }
            catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, "Error "+e, "Exception - PanelControl", 0);
            }
    }
    
    public void Status(String cuarto, JPanel Panel){
        if(Ocupadas.contains(cuarto))
        {
            Rentas++;
            Panel.setBackground(new java.awt.Color(235,0,15)); //Color rojo
            //235,0,15
            //232,2,14
            //192,0,0
        }
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
        h18 = new javax.swing.JPanel();
        btn18 = new javax.swing.JLabel();
        jLabel159 = new javax.swing.JLabel();
        jLabel160 = new javax.swing.JLabel();
        h26 = new javax.swing.JPanel();
        btn26 = new javax.swing.JLabel();
        jLabel135 = new javax.swing.JLabel();
        jLabel136 = new javax.swing.JLabel();
        h25 = new javax.swing.JPanel();
        btn25 = new javax.swing.JLabel();
        jLabel141 = new javax.swing.JLabel();
        jLabel142 = new javax.swing.JLabel();
        h17 = new javax.swing.JPanel();
        btn17 = new javax.swing.JLabel();
        jLabel156 = new javax.swing.JLabel();
        jLabel157 = new javax.swing.JLabel();
        h09 = new javax.swing.JPanel();
        btn09 = new javax.swing.JLabel();
        jLabel132 = new javax.swing.JLabel();
        jLabel133 = new javax.swing.JLabel();
        h02 = new javax.swing.JPanel();
        btn4 = new javax.swing.JLabel();
        jLabel93 = new javax.swing.JLabel();
        jLabel94 = new javax.swing.JLabel();
        h03 = new javax.swing.JPanel();
        btn03 = new javax.swing.JLabel();
        jLabel91 = new javax.swing.JLabel();
        jLabel92 = new javax.swing.JLabel();
        h10 = new javax.swing.JPanel();
        btn10 = new javax.swing.JLabel();
        jLabel129 = new javax.swing.JLabel();
        jLabel130 = new javax.swing.JLabel();
        h32 = new javax.swing.JPanel();
        btn32 = new javax.swing.JLabel();
        jLabel180 = new javax.swing.JLabel();
        jLabel181 = new javax.swing.JLabel();
        h33 = new javax.swing.JPanel();
        btn33 = new javax.swing.JLabel();
        jLabel183 = new javax.swing.JLabel();
        jLabel184 = new javax.swing.JLabel();
        h39 = new javax.swing.JPanel();
        btn39 = new javax.swing.JLabel();
        jLabel201 = new javax.swing.JLabel();
        jLabel202 = new javax.swing.JLabel();
        h40 = new javax.swing.JPanel();
        btn40 = new javax.swing.JLabel();
        jLabel204 = new javax.swing.JLabel();
        jLabel205 = new javax.swing.JLabel();
        h41 = new javax.swing.JPanel();
        btn41 = new javax.swing.JLabel();
        jLabel207 = new javax.swing.JLabel();
        jLabel208 = new javax.swing.JLabel();
        h34 = new javax.swing.JPanel();
        btn34 = new javax.swing.JLabel();
        jLabel186 = new javax.swing.JLabel();
        jLabel187 = new javax.swing.JLabel();
        h27 = new javax.swing.JPanel();
        btn27 = new javax.swing.JLabel();
        jLabel150 = new javax.swing.JLabel();
        jLabel151 = new javax.swing.JLabel();
        h19 = new javax.swing.JPanel();
        btn19 = new javax.swing.JLabel();
        jLabel162 = new javax.swing.JLabel();
        jLabel163 = new javax.swing.JLabel();
        h11 = new javax.swing.JPanel();
        btn11 = new javax.swing.JLabel();
        jLabel126 = new javax.swing.JLabel();
        jLabel127 = new javax.swing.JLabel();
        h04 = new javax.swing.JPanel();
        btn04 = new javax.swing.JLabel();
        jLabel102 = new javax.swing.JLabel();
        jLabel103 = new javax.swing.JLabel();
        h05 = new javax.swing.JPanel();
        btn05 = new javax.swing.JLabel();
        jLabel99 = new javax.swing.JLabel();
        jLabel100 = new javax.swing.JLabel();
        h12 = new javax.swing.JPanel();
        btn12 = new javax.swing.JLabel();
        jLabel123 = new javax.swing.JLabel();
        jLabel124 = new javax.swing.JLabel();
        h20 = new javax.swing.JPanel();
        btn20 = new javax.swing.JLabel();
        jLabel165 = new javax.swing.JLabel();
        jLabel166 = new javax.swing.JLabel();
        h28 = new javax.swing.JPanel();
        btn28 = new javax.swing.JLabel();
        jLabel138 = new javax.swing.JLabel();
        jLabel139 = new javax.swing.JLabel();
        h35 = new javax.swing.JPanel();
        btn35 = new javax.swing.JLabel();
        jLabel189 = new javax.swing.JLabel();
        jLabel190 = new javax.swing.JLabel();
        h36 = new javax.swing.JPanel();
        btn36 = new javax.swing.JLabel();
        jLabel192 = new javax.swing.JLabel();
        jLabel193 = new javax.swing.JLabel();
        h29 = new javax.swing.JPanel();
        btn29 = new javax.swing.JLabel();
        jLabel153 = new javax.swing.JLabel();
        jLabel154 = new javax.swing.JLabel();
        h22 = new javax.swing.JPanel();
        btn22 = new javax.swing.JLabel();
        jLabel168 = new javax.swing.JLabel();
        jLabel169 = new javax.swing.JLabel();
        h14 = new javax.swing.JPanel();
        btn14 = new javax.swing.JLabel();
        jLabel120 = new javax.swing.JLabel();
        jLabel121 = new javax.swing.JLabel();
        h06 = new javax.swing.JPanel();
        btn06 = new javax.swing.JLabel();
        jLabel111 = new javax.swing.JLabel();
        jLabel112 = new javax.swing.JLabel();
        h07 = new javax.swing.JPanel();
        btn07 = new javax.swing.JLabel();
        jLabel105 = new javax.swing.JLabel();
        jLabel106 = new javax.swing.JLabel();
        h15 = new javax.swing.JPanel();
        btn15 = new javax.swing.JLabel();
        jLabel117 = new javax.swing.JLabel();
        jLabel118 = new javax.swing.JLabel();
        h23 = new javax.swing.JPanel();
        btn23 = new javax.swing.JLabel();
        jLabel171 = new javax.swing.JLabel();
        jLabel172 = new javax.swing.JLabel();
        h30 = new javax.swing.JPanel();
        btn30 = new javax.swing.JLabel();
        jLabel147 = new javax.swing.JLabel();
        jLabel148 = new javax.swing.JLabel();
        h37 = new javax.swing.JPanel();
        btn37 = new javax.swing.JLabel();
        jLabel195 = new javax.swing.JLabel();
        jLabel196 = new javax.swing.JLabel();
        h38 = new javax.swing.JPanel();
        btn38 = new javax.swing.JLabel();
        jLabel198 = new javax.swing.JLabel();
        jLabel199 = new javax.swing.JLabel();
        h31 = new javax.swing.JPanel();
        btn31 = new javax.swing.JLabel();
        jLabel144 = new javax.swing.JLabel();
        jLabel145 = new javax.swing.JLabel();
        h24 = new javax.swing.JPanel();
        btn24 = new javax.swing.JLabel();
        jLabel174 = new javax.swing.JLabel();
        jLabel175 = new javax.swing.JLabel();
        h16 = new javax.swing.JPanel();
        btn16 = new javax.swing.JLabel();
        jLabel114 = new javax.swing.JLabel();
        jLabel115 = new javax.swing.JLabel();
        h08 = new javax.swing.JPanel();
        btn08 = new javax.swing.JLabel();
        jLabel108 = new javax.swing.JLabel();
        jLabel109 = new javax.swing.JLabel();
        Barra = new javax.swing.JProgressBar();
        ico_disponibles = new javax.swing.JPanel();
        lbl_disponibles = new javax.swing.JLabel();
        lbl_ocupadas = new javax.swing.JLabel();
        ico_ocupadas = new javax.swing.JPanel();
        lbl_fueradeservicio = new javax.swing.JLabel();
        ico_fueradeservicio = new javax.swing.JPanel();
        lbl_barra = new javax.swing.JLabel();
        lbl_barra1 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(153, 153, 153));
        setPreferredSize(new java.awt.Dimension(1097, 562));

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153)));

        h18.setBackground(new java.awt.Color(102, 102, 102));
        h18.setMinimumSize(new java.awt.Dimension(50, 100));
        h18.setPreferredSize(new java.awt.Dimension(150, 50));

        btn18.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn18.setForeground(new java.awt.Color(255, 255, 255));
        btn18.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn18.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel159.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel159.setForeground(new java.awt.Color(255, 255, 255));
        jLabel159.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel159.setText("Doble");
        jLabel159.setAlignmentY(0.0F);

        jLabel160.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel160.setForeground(new java.awt.Color(255, 255, 255));
        jLabel160.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel160.setText("18");
        jLabel160.setAlignmentY(0.1F);

        javax.swing.GroupLayout h18Layout = new javax.swing.GroupLayout(h18);
        h18.setLayout(h18Layout);
        h18Layout.setHorizontalGroup(
            h18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h18Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn18, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel160, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel159, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h18Layout.setVerticalGroup(
            h18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h18Layout.createSequentialGroup()
                .addGroup(h18Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h18Layout.createSequentialGroup()
                        .addComponent(jLabel160, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel159, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h18Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn18)))
                .addContainerGap())
        );

        h26.setBackground(new java.awt.Color(102, 102, 102));
        h26.setMinimumSize(new java.awt.Dimension(50, 100));
        h26.setPreferredSize(new java.awt.Dimension(150, 50));

        btn26.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn26.setForeground(new java.awt.Color(255, 255, 255));
        btn26.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn26.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel135.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel135.setForeground(new java.awt.Color(255, 255, 255));
        jLabel135.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel135.setText("Suite");
        jLabel135.setAlignmentY(0.0F);

        jLabel136.setBackground(new java.awt.Color(38, 38, 38));
        jLabel136.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel136.setForeground(new java.awt.Color(255, 255, 255));
        jLabel136.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel136.setText("26");
        jLabel136.setAlignmentY(0.1F);

        javax.swing.GroupLayout h26Layout = new javax.swing.GroupLayout(h26);
        h26.setLayout(h26Layout);
        h26Layout.setHorizontalGroup(
            h26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h26Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn26, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel136, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h26Layout.setVerticalGroup(
            h26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h26Layout.createSequentialGroup()
                .addGroup(h26Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h26Layout.createSequentialGroup()
                        .addComponent(jLabel136, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel135, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h26Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn26)))
                .addContainerGap())
        );

        h25.setBackground(new java.awt.Color(102, 102, 102));
        h25.setMinimumSize(new java.awt.Dimension(50, 100));
        h25.setPreferredSize(new java.awt.Dimension(150, 50));

        btn25.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn25.setForeground(new java.awt.Color(255, 255, 255));
        btn25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel141.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel141.setForeground(new java.awt.Color(255, 255, 255));
        jLabel141.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel141.setText("Suite");
        jLabel141.setAlignmentY(0.0F);

        jLabel142.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel142.setForeground(new java.awt.Color(255, 255, 255));
        jLabel142.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel142.setText("25");
        jLabel142.setAlignmentY(0.1F);

        javax.swing.GroupLayout h25Layout = new javax.swing.GroupLayout(h25);
        h25.setLayout(h25Layout);
        h25Layout.setHorizontalGroup(
            h25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h25Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn25, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel142, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h25Layout.setVerticalGroup(
            h25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h25Layout.createSequentialGroup()
                .addGroup(h25Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h25Layout.createSequentialGroup()
                        .addComponent(jLabel142, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel141, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h25Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn25)))
                .addContainerGap())
        );

        h17.setBackground(new java.awt.Color(102, 102, 102));
        h17.setMinimumSize(new java.awt.Dimension(50, 100));
        h17.setPreferredSize(new java.awt.Dimension(150, 50));

        btn17.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn17.setForeground(new java.awt.Color(255, 255, 255));
        btn17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel156.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel156.setForeground(new java.awt.Color(255, 255, 255));
        jLabel156.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel156.setText("Doble");
        jLabel156.setAlignmentY(0.0F);

        jLabel157.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel157.setForeground(new java.awt.Color(255, 255, 255));
        jLabel157.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel157.setText("17");
        jLabel157.setAlignmentY(0.1F);

        javax.swing.GroupLayout h17Layout = new javax.swing.GroupLayout(h17);
        h17.setLayout(h17Layout);
        h17Layout.setHorizontalGroup(
            h17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h17Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn17, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel157, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel156, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h17Layout.setVerticalGroup(
            h17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h17Layout.createSequentialGroup()
                .addGroup(h17Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h17Layout.createSequentialGroup()
                        .addComponent(jLabel157, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel156, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h17Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn17)))
                .addContainerGap())
        );

        h09.setBackground(new java.awt.Color(102, 102, 102));
        h09.setMinimumSize(new java.awt.Dimension(50, 100));
        h09.setPreferredSize(new java.awt.Dimension(150, 50));

        btn09.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn09.setForeground(new java.awt.Color(255, 255, 255));
        btn09.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn09.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel132.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel132.setForeground(new java.awt.Color(255, 255, 255));
        jLabel132.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel132.setText("Simple");
        jLabel132.setAlignmentY(0.0F);

        jLabel133.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel133.setForeground(new java.awt.Color(255, 255, 255));
        jLabel133.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel133.setText("09");
        jLabel133.setAlignmentY(0.1F);

        javax.swing.GroupLayout h09Layout = new javax.swing.GroupLayout(h09);
        h09.setLayout(h09Layout);
        h09Layout.setHorizontalGroup(
            h09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h09Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn09, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel133, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h09Layout.setVerticalGroup(
            h09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h09Layout.createSequentialGroup()
                .addGroup(h09Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h09Layout.createSequentialGroup()
                        .addComponent(jLabel133, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel132, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h09Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn09)))
                .addContainerGap())
        );

        h02.setBackground(new java.awt.Color(102, 102, 102));
        h02.setMinimumSize(new java.awt.Dimension(50, 100));
        h02.setPreferredSize(new java.awt.Dimension(150, 50));

        btn4.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn4.setForeground(new java.awt.Color(255, 255, 255));
        btn4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel93.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel93.setForeground(new java.awt.Color(255, 255, 255));
        jLabel93.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel93.setText("Suite");
        jLabel93.setAlignmentY(0.0F);

        jLabel94.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel94.setForeground(new java.awt.Color(255, 255, 255));
        jLabel94.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel94.setText("02");
        jLabel94.setAlignmentY(0.1F);

        javax.swing.GroupLayout h02Layout = new javax.swing.GroupLayout(h02);
        h02.setLayout(h02Layout);
        h02Layout.setHorizontalGroup(
            h02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h02Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel94, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h02Layout.setVerticalGroup(
            h02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h02Layout.createSequentialGroup()
                .addGroup(h02Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h02Layout.createSequentialGroup()
                        .addComponent(jLabel94, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel93, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h02Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn4)))
                .addContainerGap())
        );

        h03.setBackground(new java.awt.Color(102, 102, 102));
        h03.setMinimumSize(new java.awt.Dimension(50, 100));
        h03.setPreferredSize(new java.awt.Dimension(150, 50));

        btn03.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn03.setForeground(new java.awt.Color(255, 255, 255));
        btn03.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn03.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel91.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel91.setForeground(new java.awt.Color(255, 255, 255));
        jLabel91.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel91.setText("Suite");
        jLabel91.setAlignmentY(0.0F);

        jLabel92.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel92.setForeground(new java.awt.Color(255, 255, 255));
        jLabel92.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel92.setText("03");
        jLabel92.setAlignmentY(0.1F);

        javax.swing.GroupLayout h03Layout = new javax.swing.GroupLayout(h03);
        h03.setLayout(h03Layout);
        h03Layout.setHorizontalGroup(
            h03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h03Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn03, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel92, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h03Layout.setVerticalGroup(
            h03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h03Layout.createSequentialGroup()
                .addGroup(h03Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h03Layout.createSequentialGroup()
                        .addComponent(jLabel92, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel91, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h03Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn03)))
                .addContainerGap())
        );

        h10.setBackground(new java.awt.Color(102, 102, 102));
        h10.setMinimumSize(new java.awt.Dimension(50, 100));
        h10.setPreferredSize(new java.awt.Dimension(150, 50));

        btn10.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn10.setForeground(new java.awt.Color(255, 255, 255));
        btn10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel129.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel129.setForeground(new java.awt.Color(255, 255, 255));
        jLabel129.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel129.setText("Doble");
        jLabel129.setAlignmentY(0.0F);

        jLabel130.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel130.setForeground(new java.awt.Color(255, 255, 255));
        jLabel130.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel130.setText("10");
        jLabel130.setAlignmentY(0.1F);

        javax.swing.GroupLayout h10Layout = new javax.swing.GroupLayout(h10);
        h10.setLayout(h10Layout);
        h10Layout.setHorizontalGroup(
            h10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h10Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn10, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel130, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h10Layout.setVerticalGroup(
            h10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h10Layout.createSequentialGroup()
                .addGroup(h10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h10Layout.createSequentialGroup()
                        .addComponent(jLabel130, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel129, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h10Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn10)))
                .addContainerGap())
        );

        h32.setBackground(new java.awt.Color(102, 102, 102));
        h32.setMinimumSize(new java.awt.Dimension(50, 100));
        h32.setPreferredSize(new java.awt.Dimension(150, 50));

        btn32.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn32.setForeground(new java.awt.Color(255, 255, 255));
        btn32.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn32.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel180.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel180.setForeground(new java.awt.Color(255, 255, 255));
        jLabel180.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel180.setText("Doble");
        jLabel180.setAlignmentY(0.0F);

        jLabel181.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel181.setForeground(new java.awt.Color(255, 255, 255));
        jLabel181.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel181.setText("32");
        jLabel181.setAlignmentY(0.1F);

        javax.swing.GroupLayout h32Layout = new javax.swing.GroupLayout(h32);
        h32.setLayout(h32Layout);
        h32Layout.setHorizontalGroup(
            h32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h32Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn32, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel181, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel180, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h32Layout.setVerticalGroup(
            h32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h32Layout.createSequentialGroup()
                .addGroup(h32Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h32Layout.createSequentialGroup()
                        .addComponent(jLabel181, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel180, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h32Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn32)))
                .addContainerGap())
        );

        h33.setBackground(new java.awt.Color(102, 102, 102));
        h33.setMinimumSize(new java.awt.Dimension(50, 100));
        h33.setPreferredSize(new java.awt.Dimension(150, 50));

        btn33.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn33.setForeground(new java.awt.Color(255, 255, 255));
        btn33.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn33.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel183.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel183.setForeground(new java.awt.Color(255, 255, 255));
        jLabel183.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel183.setText("Doble");
        jLabel183.setAlignmentY(0.0F);

        jLabel184.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel184.setForeground(new java.awt.Color(255, 255, 255));
        jLabel184.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel184.setText("33");
        jLabel184.setAlignmentY(0.1F);

        javax.swing.GroupLayout h33Layout = new javax.swing.GroupLayout(h33);
        h33.setLayout(h33Layout);
        h33Layout.setHorizontalGroup(
            h33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h33Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn33, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel184, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel183, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h33Layout.setVerticalGroup(
            h33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h33Layout.createSequentialGroup()
                .addGroup(h33Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h33Layout.createSequentialGroup()
                        .addComponent(jLabel184, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel183, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h33Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn33)))
                .addContainerGap())
        );

        h39.setBackground(new java.awt.Color(102, 102, 102));
        h39.setMinimumSize(new java.awt.Dimension(50, 100));
        h39.setPreferredSize(new java.awt.Dimension(150, 50));

        btn39.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn39.setForeground(new java.awt.Color(255, 255, 255));
        btn39.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn39.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel201.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel201.setForeground(new java.awt.Color(255, 255, 255));
        jLabel201.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel201.setText("Simple");
        jLabel201.setAlignmentY(0.0F);

        jLabel202.setBackground(new java.awt.Color(102, 102, 102));
        jLabel202.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel202.setForeground(new java.awt.Color(255, 255, 255));
        jLabel202.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel202.setText("39");
        jLabel202.setAlignmentY(0.1F);

        javax.swing.GroupLayout h39Layout = new javax.swing.GroupLayout(h39);
        h39.setLayout(h39Layout);
        h39Layout.setHorizontalGroup(
            h39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h39Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn39, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel202, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel201, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h39Layout.setVerticalGroup(
            h39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h39Layout.createSequentialGroup()
                .addGroup(h39Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h39Layout.createSequentialGroup()
                        .addComponent(jLabel202, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel201, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h39Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn39)))
                .addContainerGap())
        );

        h40.setBackground(new java.awt.Color(102, 102, 102));
        h40.setMinimumSize(new java.awt.Dimension(50, 100));
        h40.setPreferredSize(new java.awt.Dimension(150, 50));

        btn40.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn40.setForeground(new java.awt.Color(255, 255, 255));
        btn40.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn40.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel204.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel204.setForeground(new java.awt.Color(255, 255, 255));
        jLabel204.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel204.setText("Simple");
        jLabel204.setAlignmentY(0.0F);

        jLabel205.setBackground(new java.awt.Color(38, 38, 38));
        jLabel205.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel205.setForeground(new java.awt.Color(255, 255, 255));
        jLabel205.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel205.setText("40");
        jLabel205.setAlignmentY(0.1F);

        javax.swing.GroupLayout h40Layout = new javax.swing.GroupLayout(h40);
        h40.setLayout(h40Layout);
        h40Layout.setHorizontalGroup(
            h40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h40Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn40, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel205, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel204, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h40Layout.setVerticalGroup(
            h40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h40Layout.createSequentialGroup()
                .addGroup(h40Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h40Layout.createSequentialGroup()
                        .addComponent(jLabel205, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel204, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h40Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn40)))
                .addContainerGap())
        );

        h41.setBackground(new java.awt.Color(102, 102, 102));
        h41.setMinimumSize(new java.awt.Dimension(50, 100));
        h41.setPreferredSize(new java.awt.Dimension(150, 50));

        btn41.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn41.setForeground(new java.awt.Color(255, 255, 255));
        btn41.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn41.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel207.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel207.setForeground(new java.awt.Color(255, 255, 255));
        jLabel207.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel207.setText("Doble");
        jLabel207.setAlignmentY(0.0F);

        jLabel208.setBackground(new java.awt.Color(38, 38, 38));
        jLabel208.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel208.setForeground(new java.awt.Color(255, 255, 255));
        jLabel208.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel208.setText("41");
        jLabel208.setAlignmentY(0.1F);

        javax.swing.GroupLayout h41Layout = new javax.swing.GroupLayout(h41);
        h41.setLayout(h41Layout);
        h41Layout.setHorizontalGroup(
            h41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h41Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn41, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel208, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel207, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h41Layout.setVerticalGroup(
            h41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h41Layout.createSequentialGroup()
                .addGroup(h41Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h41Layout.createSequentialGroup()
                        .addComponent(jLabel208, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel207, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h41Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn41)))
                .addContainerGap())
        );

        h34.setBackground(new java.awt.Color(102, 102, 102));
        h34.setMinimumSize(new java.awt.Dimension(50, 100));
        h34.setPreferredSize(new java.awt.Dimension(150, 50));

        btn34.setBackground(new java.awt.Color(102, 102, 102));
        btn34.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn34.setForeground(new java.awt.Color(255, 255, 255));
        btn34.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn34.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel186.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel186.setForeground(new java.awt.Color(255, 255, 255));
        jLabel186.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel186.setText("Doble");
        jLabel186.setAlignmentY(0.0F);

        jLabel187.setBackground(new java.awt.Color(102, 102, 102));
        jLabel187.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel187.setForeground(new java.awt.Color(255, 255, 255));
        jLabel187.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel187.setText("34");
        jLabel187.setAlignmentY(0.1F);

        javax.swing.GroupLayout h34Layout = new javax.swing.GroupLayout(h34);
        h34.setLayout(h34Layout);
        h34Layout.setHorizontalGroup(
            h34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h34Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn34, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel187, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel186, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h34Layout.setVerticalGroup(
            h34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h34Layout.createSequentialGroup()
                .addGroup(h34Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h34Layout.createSequentialGroup()
                        .addComponent(jLabel187, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel186, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h34Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn34)))
                .addContainerGap())
        );

        h27.setBackground(new java.awt.Color(102, 102, 102));
        h27.setMinimumSize(new java.awt.Dimension(50, 100));
        h27.setPreferredSize(new java.awt.Dimension(150, 50));

        btn27.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn27.setForeground(new java.awt.Color(255, 255, 255));
        btn27.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn27.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel150.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel150.setForeground(new java.awt.Color(255, 255, 255));
        jLabel150.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel150.setText("Doble");
        jLabel150.setAlignmentY(0.0F);

        jLabel151.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel151.setForeground(new java.awt.Color(255, 255, 255));
        jLabel151.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel151.setText("27");
        jLabel151.setAlignmentY(0.1F);

        javax.swing.GroupLayout h27Layout = new javax.swing.GroupLayout(h27);
        h27.setLayout(h27Layout);
        h27Layout.setHorizontalGroup(
            h27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h27Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn27, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel151, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h27Layout.setVerticalGroup(
            h27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h27Layout.createSequentialGroup()
                .addGroup(h27Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h27Layout.createSequentialGroup()
                        .addComponent(jLabel151, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel150, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h27Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn27)))
                .addContainerGap())
        );

        h19.setBackground(new java.awt.Color(102, 102, 102));
        h19.setMinimumSize(new java.awt.Dimension(50, 100));
        h19.setPreferredSize(new java.awt.Dimension(150, 50));

        btn19.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn19.setForeground(new java.awt.Color(255, 255, 255));
        btn19.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn19.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel162.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel162.setForeground(new java.awt.Color(255, 255, 255));
        jLabel162.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel162.setText("Simple");
        jLabel162.setAlignmentY(0.0F);

        jLabel163.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel163.setForeground(new java.awt.Color(255, 255, 255));
        jLabel163.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel163.setText("19");
        jLabel163.setAlignmentY(0.1F);

        javax.swing.GroupLayout h19Layout = new javax.swing.GroupLayout(h19);
        h19.setLayout(h19Layout);
        h19Layout.setHorizontalGroup(
            h19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h19Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel163, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h19Layout.setVerticalGroup(
            h19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h19Layout.createSequentialGroup()
                .addGroup(h19Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h19Layout.createSequentialGroup()
                        .addComponent(jLabel163, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel162, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h19Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn19)))
                .addContainerGap())
        );

        h11.setBackground(new java.awt.Color(102, 102, 102));
        h11.setMinimumSize(new java.awt.Dimension(50, 100));
        h11.setPreferredSize(new java.awt.Dimension(150, 50));

        btn11.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn11.setForeground(new java.awt.Color(255, 255, 255));
        btn11.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel126.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel126.setForeground(new java.awt.Color(255, 255, 255));
        jLabel126.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel126.setText("Doble");
        jLabel126.setAlignmentY(0.0F);

        jLabel127.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel127.setForeground(new java.awt.Color(255, 255, 255));
        jLabel127.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel127.setText("11");
        jLabel127.setAlignmentY(0.1F);

        javax.swing.GroupLayout h11Layout = new javax.swing.GroupLayout(h11);
        h11.setLayout(h11Layout);
        h11Layout.setHorizontalGroup(
            h11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h11Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn11, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel127, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h11Layout.setVerticalGroup(
            h11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h11Layout.createSequentialGroup()
                .addGroup(h11Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h11Layout.createSequentialGroup()
                        .addComponent(jLabel127, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel126, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h11Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn11)))
                .addContainerGap())
        );

        h04.setBackground(new java.awt.Color(102, 102, 102));
        h04.setMinimumSize(new java.awt.Dimension(50, 100));
        h04.setPreferredSize(new java.awt.Dimension(150, 50));

        btn04.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn04.setForeground(new java.awt.Color(255, 255, 255));
        btn04.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn04.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel102.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel102.setForeground(new java.awt.Color(255, 255, 255));
        jLabel102.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel102.setText("Doble");
        jLabel102.setAlignmentY(0.0F);

        jLabel103.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel103.setForeground(new java.awt.Color(255, 255, 255));
        jLabel103.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel103.setText("04");
        jLabel103.setAlignmentY(0.1F);

        javax.swing.GroupLayout h04Layout = new javax.swing.GroupLayout(h04);
        h04.setLayout(h04Layout);
        h04Layout.setHorizontalGroup(
            h04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h04Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn04, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel103, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h04Layout.setVerticalGroup(
            h04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h04Layout.createSequentialGroup()
                .addGroup(h04Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h04Layout.createSequentialGroup()
                        .addComponent(jLabel103, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel102, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h04Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn04)))
                .addContainerGap())
        );

        h05.setBackground(new java.awt.Color(102, 102, 102));
        h05.setMinimumSize(new java.awt.Dimension(50, 100));
        h05.setPreferredSize(new java.awt.Dimension(150, 50));

        btn05.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn05.setForeground(new java.awt.Color(255, 255, 255));
        btn05.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn05.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel99.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel99.setForeground(new java.awt.Color(255, 255, 255));
        jLabel99.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel99.setText("Simple");
        jLabel99.setAlignmentY(0.0F);

        jLabel100.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel100.setForeground(new java.awt.Color(255, 255, 255));
        jLabel100.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel100.setText("05");
        jLabel100.setAlignmentY(0.1F);

        javax.swing.GroupLayout h05Layout = new javax.swing.GroupLayout(h05);
        h05.setLayout(h05Layout);
        h05Layout.setHorizontalGroup(
            h05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h05Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn05, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel100, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h05Layout.setVerticalGroup(
            h05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h05Layout.createSequentialGroup()
                .addGroup(h05Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h05Layout.createSequentialGroup()
                        .addComponent(jLabel100, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel99, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h05Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn05)))
                .addContainerGap())
        );

        h12.setBackground(new java.awt.Color(102, 102, 102));
        h12.setMinimumSize(new java.awt.Dimension(50, 100));
        h12.setPreferredSize(new java.awt.Dimension(150, 50));

        btn12.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn12.setForeground(new java.awt.Color(255, 255, 255));
        btn12.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn12.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel123.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel123.setForeground(new java.awt.Color(255, 255, 255));
        jLabel123.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel123.setText("Doble");
        jLabel123.setAlignmentY(0.0F);

        jLabel124.setBackground(new java.awt.Color(38, 38, 38));
        jLabel124.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel124.setForeground(new java.awt.Color(255, 255, 255));
        jLabel124.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel124.setText("12");
        jLabel124.setAlignmentY(0.1F);

        javax.swing.GroupLayout h12Layout = new javax.swing.GroupLayout(h12);
        h12.setLayout(h12Layout);
        h12Layout.setHorizontalGroup(
            h12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h12Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn12, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel124, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h12Layout.setVerticalGroup(
            h12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h12Layout.createSequentialGroup()
                .addGroup(h12Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h12Layout.createSequentialGroup()
                        .addComponent(jLabel124, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel123, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h12Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn12)))
                .addContainerGap())
        );

        h20.setBackground(new java.awt.Color(102, 102, 102));
        h20.setMinimumSize(new java.awt.Dimension(50, 100));
        h20.setPreferredSize(new java.awt.Dimension(150, 50));

        btn20.setBackground(new java.awt.Color(38, 38, 38));
        btn20.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn20.setForeground(new java.awt.Color(255, 255, 255));
        btn20.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn20.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel165.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel165.setForeground(new java.awt.Color(255, 255, 255));
        jLabel165.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel165.setText("Simple");
        jLabel165.setAlignmentY(0.0F);

        jLabel166.setBackground(new java.awt.Color(38, 38, 38));
        jLabel166.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel166.setForeground(new java.awt.Color(255, 255, 255));
        jLabel166.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel166.setText("20");
        jLabel166.setAlignmentY(0.1F);

        javax.swing.GroupLayout h20Layout = new javax.swing.GroupLayout(h20);
        h20.setLayout(h20Layout);
        h20Layout.setHorizontalGroup(
            h20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h20Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn20, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel166, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel165, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h20Layout.setVerticalGroup(
            h20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h20Layout.createSequentialGroup()
                .addGroup(h20Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h20Layout.createSequentialGroup()
                        .addComponent(jLabel166, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel165, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h20Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn20)))
                .addContainerGap())
        );

        h28.setBackground(new java.awt.Color(102, 102, 102));
        h28.setMinimumSize(new java.awt.Dimension(50, 100));
        h28.setPreferredSize(new java.awt.Dimension(150, 50));

        btn28.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn28.setForeground(new java.awt.Color(255, 255, 255));
        btn28.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn28.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel138.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel138.setForeground(new java.awt.Color(255, 255, 255));
        jLabel138.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel138.setText("Doble");
        jLabel138.setAlignmentY(0.0F);

        jLabel139.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel139.setForeground(new java.awt.Color(255, 255, 255));
        jLabel139.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel139.setText("28");
        jLabel139.setAlignmentY(0.1F);

        javax.swing.GroupLayout h28Layout = new javax.swing.GroupLayout(h28);
        h28.setLayout(h28Layout);
        h28Layout.setHorizontalGroup(
            h28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h28Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn28, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel139, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h28Layout.setVerticalGroup(
            h28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h28Layout.createSequentialGroup()
                .addGroup(h28Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h28Layout.createSequentialGroup()
                        .addComponent(jLabel139, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel138, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h28Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn28)))
                .addContainerGap())
        );

        h35.setBackground(new java.awt.Color(102, 102, 102));
        h35.setMinimumSize(new java.awt.Dimension(50, 100));
        h35.setPreferredSize(new java.awt.Dimension(150, 50));

        btn35.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn35.setForeground(new java.awt.Color(255, 255, 255));
        btn35.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn35.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel189.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel189.setForeground(new java.awt.Color(255, 255, 255));
        jLabel189.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel189.setText("Doble");
        jLabel189.setAlignmentY(0.0F);

        jLabel190.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel190.setForeground(new java.awt.Color(255, 255, 255));
        jLabel190.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel190.setText("35");
        jLabel190.setAlignmentY(0.1F);

        javax.swing.GroupLayout h35Layout = new javax.swing.GroupLayout(h35);
        h35.setLayout(h35Layout);
        h35Layout.setHorizontalGroup(
            h35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h35Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn35, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel190, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel189, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h35Layout.setVerticalGroup(
            h35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h35Layout.createSequentialGroup()
                .addGroup(h35Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h35Layout.createSequentialGroup()
                        .addComponent(jLabel190, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel189, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h35Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn35)))
                .addContainerGap())
        );

        h36.setBackground(new java.awt.Color(102, 102, 102));
        h36.setMinimumSize(new java.awt.Dimension(50, 100));
        h36.setPreferredSize(new java.awt.Dimension(150, 50));

        btn36.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn36.setForeground(new java.awt.Color(255, 255, 255));
        btn36.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn36.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel192.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel192.setForeground(new java.awt.Color(255, 255, 255));
        jLabel192.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel192.setText("Doble");
        jLabel192.setAlignmentY(0.0F);

        jLabel193.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel193.setForeground(new java.awt.Color(255, 255, 255));
        jLabel193.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel193.setText("36");
        jLabel193.setAlignmentY(0.1F);

        javax.swing.GroupLayout h36Layout = new javax.swing.GroupLayout(h36);
        h36.setLayout(h36Layout);
        h36Layout.setHorizontalGroup(
            h36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h36Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn36, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel193, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel192, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h36Layout.setVerticalGroup(
            h36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h36Layout.createSequentialGroup()
                .addGroup(h36Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h36Layout.createSequentialGroup()
                        .addComponent(jLabel193, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel192, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h36Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn36)))
                .addContainerGap())
        );

        h29.setBackground(new java.awt.Color(102, 102, 102));
        h29.setMinimumSize(new java.awt.Dimension(50, 100));
        h29.setPreferredSize(new java.awt.Dimension(150, 50));

        btn29.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn29.setForeground(new java.awt.Color(255, 255, 255));
        btn29.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn29.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel153.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel153.setForeground(new java.awt.Color(255, 255, 255));
        jLabel153.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel153.setText("Doble");
        jLabel153.setAlignmentY(0.0F);

        jLabel154.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel154.setForeground(new java.awt.Color(255, 255, 255));
        jLabel154.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel154.setText("29");
        jLabel154.setAlignmentY(0.1F);

        javax.swing.GroupLayout h29Layout = new javax.swing.GroupLayout(h29);
        h29.setLayout(h29Layout);
        h29Layout.setHorizontalGroup(
            h29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h29Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn29, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel154, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel153, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h29Layout.setVerticalGroup(
            h29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h29Layout.createSequentialGroup()
                .addGroup(h29Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h29Layout.createSequentialGroup()
                        .addComponent(jLabel154, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel153, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h29Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn29)))
                .addContainerGap())
        );

        h22.setBackground(new java.awt.Color(102, 102, 102));
        h22.setMinimumSize(new java.awt.Dimension(50, 100));
        h22.setPreferredSize(new java.awt.Dimension(150, 50));

        btn22.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn22.setForeground(new java.awt.Color(255, 255, 255));
        btn22.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn22.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel168.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel168.setForeground(new java.awt.Color(255, 255, 255));
        jLabel168.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel168.setText("Suite");
        jLabel168.setAlignmentY(0.0F);

        jLabel169.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel169.setForeground(new java.awt.Color(255, 255, 255));
        jLabel169.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel169.setText("22");
        jLabel169.setAlignmentY(0.1F);

        javax.swing.GroupLayout h22Layout = new javax.swing.GroupLayout(h22);
        h22.setLayout(h22Layout);
        h22Layout.setHorizontalGroup(
            h22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h22Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn22, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel169, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h22Layout.setVerticalGroup(
            h22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h22Layout.createSequentialGroup()
                .addGroup(h22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h22Layout.createSequentialGroup()
                        .addComponent(jLabel169, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel168, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h22Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn22)))
                .addContainerGap())
        );

        h14.setBackground(new java.awt.Color(102, 102, 102));
        h14.setMinimumSize(new java.awt.Dimension(50, 100));
        h14.setPreferredSize(new java.awt.Dimension(150, 50));

        btn14.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn14.setForeground(new java.awt.Color(255, 255, 255));
        btn14.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn14.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel120.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel120.setForeground(new java.awt.Color(255, 255, 255));
        jLabel120.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel120.setText("Doble");
        jLabel120.setAlignmentY(0.0F);

        jLabel121.setBackground(new java.awt.Color(38, 38, 38));
        jLabel121.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel121.setForeground(new java.awt.Color(255, 255, 255));
        jLabel121.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel121.setText("14");
        jLabel121.setAlignmentY(0.1F);

        javax.swing.GroupLayout h14Layout = new javax.swing.GroupLayout(h14);
        h14.setLayout(h14Layout);
        h14Layout.setHorizontalGroup(
            h14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h14Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn14, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel121, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h14Layout.setVerticalGroup(
            h14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h14Layout.createSequentialGroup()
                .addGroup(h14Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h14Layout.createSequentialGroup()
                        .addComponent(jLabel121, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel120, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h14Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn14)))
                .addContainerGap())
        );

        h06.setBackground(new java.awt.Color(102, 102, 102));
        h06.setMinimumSize(new java.awt.Dimension(50, 100));
        h06.setPreferredSize(new java.awt.Dimension(150, 50));

        btn06.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn06.setForeground(new java.awt.Color(255, 255, 255));
        btn06.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn06.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel111.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel111.setForeground(new java.awt.Color(255, 255, 255));
        jLabel111.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel111.setText("Doble");
        jLabel111.setAlignmentY(0.0F);

        jLabel112.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel112.setForeground(new java.awt.Color(255, 255, 255));
        jLabel112.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel112.setText("06");
        jLabel112.setAlignmentY(0.1F);

        javax.swing.GroupLayout h06Layout = new javax.swing.GroupLayout(h06);
        h06.setLayout(h06Layout);
        h06Layout.setHorizontalGroup(
            h06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h06Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn06, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel112, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h06Layout.setVerticalGroup(
            h06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h06Layout.createSequentialGroup()
                .addGroup(h06Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h06Layout.createSequentialGroup()
                        .addComponent(jLabel112, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel111, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h06Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn06)))
                .addContainerGap())
        );

        h07.setBackground(new java.awt.Color(102, 102, 102));
        h07.setMinimumSize(new java.awt.Dimension(50, 100));
        h07.setPreferredSize(new java.awt.Dimension(150, 50));

        btn07.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn07.setForeground(new java.awt.Color(255, 255, 255));
        btn07.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn07.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel105.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel105.setForeground(new java.awt.Color(255, 255, 255));
        jLabel105.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel105.setText("Doble");
        jLabel105.setAlignmentY(0.0F);

        jLabel106.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel106.setForeground(new java.awt.Color(255, 255, 255));
        jLabel106.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel106.setText("07");
        jLabel106.setAlignmentY(0.1F);

        javax.swing.GroupLayout h07Layout = new javax.swing.GroupLayout(h07);
        h07.setLayout(h07Layout);
        h07Layout.setHorizontalGroup(
            h07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h07Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn07, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel106, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h07Layout.setVerticalGroup(
            h07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h07Layout.createSequentialGroup()
                .addGroup(h07Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h07Layout.createSequentialGroup()
                        .addComponent(jLabel106, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel105, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h07Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn07)))
                .addContainerGap())
        );

        h15.setBackground(new java.awt.Color(102, 102, 102));
        h15.setMinimumSize(new java.awt.Dimension(50, 100));
        h15.setPreferredSize(new java.awt.Dimension(150, 50));

        btn15.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn15.setForeground(new java.awt.Color(255, 255, 255));
        btn15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel117.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel117.setForeground(new java.awt.Color(255, 255, 255));
        jLabel117.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel117.setText("Doble");
        jLabel117.setAlignmentY(0.0F);

        jLabel118.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel118.setForeground(new java.awt.Color(255, 255, 255));
        jLabel118.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel118.setText("15");
        jLabel118.setAlignmentY(0.1F);

        javax.swing.GroupLayout h15Layout = new javax.swing.GroupLayout(h15);
        h15.setLayout(h15Layout);
        h15Layout.setHorizontalGroup(
            h15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h15Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn15, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel118, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h15Layout.setVerticalGroup(
            h15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h15Layout.createSequentialGroup()
                .addGroup(h15Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h15Layout.createSequentialGroup()
                        .addComponent(jLabel118, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel117, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h15Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn15)))
                .addContainerGap())
        );

        h23.setBackground(new java.awt.Color(102, 102, 102));
        h23.setMinimumSize(new java.awt.Dimension(50, 100));
        h23.setPreferredSize(new java.awt.Dimension(150, 50));

        btn23.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn23.setForeground(new java.awt.Color(255, 255, 255));
        btn23.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn23.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel171.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel171.setForeground(new java.awt.Color(255, 255, 255));
        jLabel171.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel171.setText("Suite");
        jLabel171.setAlignmentY(0.0F);

        jLabel172.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel172.setForeground(new java.awt.Color(255, 255, 255));
        jLabel172.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel172.setText("23");
        jLabel172.setAlignmentY(0.1F);

        javax.swing.GroupLayout h23Layout = new javax.swing.GroupLayout(h23);
        h23.setLayout(h23Layout);
        h23Layout.setHorizontalGroup(
            h23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h23Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn23, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel172, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel171, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h23Layout.setVerticalGroup(
            h23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h23Layout.createSequentialGroup()
                .addGroup(h23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h23Layout.createSequentialGroup()
                        .addComponent(jLabel172, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel171, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h23Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn23)))
                .addContainerGap())
        );

        h30.setBackground(new java.awt.Color(102, 102, 102));
        h30.setMinimumSize(new java.awt.Dimension(50, 100));
        h30.setPreferredSize(new java.awt.Dimension(150, 50));

        btn30.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn30.setForeground(new java.awt.Color(255, 255, 255));
        btn30.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn30.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel147.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel147.setForeground(new java.awt.Color(255, 255, 255));
        jLabel147.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel147.setText("Doble");
        jLabel147.setAlignmentY(0.0F);

        jLabel148.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel148.setForeground(new java.awt.Color(255, 255, 255));
        jLabel148.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel148.setText("30");
        jLabel148.setAlignmentY(0.1F);

        javax.swing.GroupLayout h30Layout = new javax.swing.GroupLayout(h30);
        h30.setLayout(h30Layout);
        h30Layout.setHorizontalGroup(
            h30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h30Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn30, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel148, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h30Layout.setVerticalGroup(
            h30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h30Layout.createSequentialGroup()
                .addGroup(h30Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h30Layout.createSequentialGroup()
                        .addComponent(jLabel148, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel147, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h30Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn30)))
                .addContainerGap())
        );

        h37.setBackground(new java.awt.Color(102, 102, 102));
        h37.setMinimumSize(new java.awt.Dimension(50, 100));
        h37.setPreferredSize(new java.awt.Dimension(150, 50));

        btn37.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn37.setForeground(new java.awt.Color(255, 255, 255));
        btn37.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn37.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel195.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel195.setForeground(new java.awt.Color(255, 255, 255));
        jLabel195.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel195.setText("Doble");
        jLabel195.setAlignmentY(0.0F);

        jLabel196.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel196.setForeground(new java.awt.Color(255, 255, 255));
        jLabel196.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel196.setText("37");
        jLabel196.setAlignmentY(0.1F);

        javax.swing.GroupLayout h37Layout = new javax.swing.GroupLayout(h37);
        h37.setLayout(h37Layout);
        h37Layout.setHorizontalGroup(
            h37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h37Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn37, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel196, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel195, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h37Layout.setVerticalGroup(
            h37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h37Layout.createSequentialGroup()
                .addGroup(h37Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h37Layout.createSequentialGroup()
                        .addComponent(jLabel196, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel195, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h37Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn37)))
                .addContainerGap())
        );

        h38.setBackground(new java.awt.Color(102, 102, 102));
        h38.setMinimumSize(new java.awt.Dimension(50, 100));
        h38.setPreferredSize(new java.awt.Dimension(150, 50));

        btn38.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn38.setForeground(new java.awt.Color(255, 255, 255));
        btn38.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn38.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel198.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel198.setForeground(new java.awt.Color(255, 255, 255));
        jLabel198.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel198.setText("Doble");
        jLabel198.setAlignmentY(0.0F);

        jLabel199.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel199.setForeground(new java.awt.Color(255, 255, 255));
        jLabel199.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel199.setText("38");
        jLabel199.setAlignmentY(0.1F);

        javax.swing.GroupLayout h38Layout = new javax.swing.GroupLayout(h38);
        h38.setLayout(h38Layout);
        h38Layout.setHorizontalGroup(
            h38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h38Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn38, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel199, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel198, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h38Layout.setVerticalGroup(
            h38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h38Layout.createSequentialGroup()
                .addGroup(h38Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h38Layout.createSequentialGroup()
                        .addComponent(jLabel199, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel198, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h38Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn38)))
                .addContainerGap())
        );

        h31.setBackground(new java.awt.Color(102, 102, 102));
        h31.setMinimumSize(new java.awt.Dimension(50, 100));
        h31.setPreferredSize(new java.awt.Dimension(150, 50));

        btn31.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn31.setForeground(new java.awt.Color(255, 255, 255));
        btn31.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn31.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel144.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel144.setForeground(new java.awt.Color(255, 255, 255));
        jLabel144.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel144.setText("Doble");
        jLabel144.setAlignmentY(0.0F);

        jLabel145.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel145.setForeground(new java.awt.Color(255, 255, 255));
        jLabel145.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel145.setText("31");
        jLabel145.setAlignmentY(0.1F);

        javax.swing.GroupLayout h31Layout = new javax.swing.GroupLayout(h31);
        h31.setLayout(h31Layout);
        h31Layout.setHorizontalGroup(
            h31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h31Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn31, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel145, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h31Layout.setVerticalGroup(
            h31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h31Layout.createSequentialGroup()
                .addGroup(h31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h31Layout.createSequentialGroup()
                        .addComponent(jLabel145, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel144, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h31Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn31)))
                .addContainerGap())
        );

        h24.setBackground(new java.awt.Color(102, 102, 102));
        h24.setMinimumSize(new java.awt.Dimension(50, 100));
        h24.setPreferredSize(new java.awt.Dimension(150, 50));

        btn24.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn24.setForeground(new java.awt.Color(255, 255, 255));
        btn24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel174.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel174.setForeground(new java.awt.Color(255, 255, 255));
        jLabel174.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel174.setText("Suite");
        jLabel174.setAlignmentY(0.0F);

        jLabel175.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel175.setForeground(new java.awt.Color(255, 255, 255));
        jLabel175.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel175.setText("24");
        jLabel175.setAlignmentY(0.1F);

        javax.swing.GroupLayout h24Layout = new javax.swing.GroupLayout(h24);
        h24.setLayout(h24Layout);
        h24Layout.setHorizontalGroup(
            h24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h24Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn24, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel175, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel174, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h24Layout.setVerticalGroup(
            h24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h24Layout.createSequentialGroup()
                .addGroup(h24Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h24Layout.createSequentialGroup()
                        .addComponent(jLabel175, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel174, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h24Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn24)))
                .addContainerGap())
        );

        h16.setBackground(new java.awt.Color(102, 102, 102));
        h16.setMinimumSize(new java.awt.Dimension(50, 100));
        h16.setPreferredSize(new java.awt.Dimension(150, 50));

        btn16.setBackground(new java.awt.Color(102, 102, 102));
        btn16.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn16.setForeground(new java.awt.Color(255, 255, 255));
        btn16.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn16.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel114.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel114.setForeground(new java.awt.Color(255, 255, 255));
        jLabel114.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel114.setText("Simple");
        jLabel114.setAlignmentY(0.0F);

        jLabel115.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel115.setForeground(new java.awt.Color(255, 255, 255));
        jLabel115.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel115.setText("16");
        jLabel115.setAlignmentY(0.1F);

        javax.swing.GroupLayout h16Layout = new javax.swing.GroupLayout(h16);
        h16.setLayout(h16Layout);
        h16Layout.setHorizontalGroup(
            h16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h16Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn16, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel115, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h16Layout.setVerticalGroup(
            h16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h16Layout.createSequentialGroup()
                .addGroup(h16Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h16Layout.createSequentialGroup()
                        .addComponent(jLabel115, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel114, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h16Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn16)))
                .addContainerGap())
        );

        h08.setBackground(new java.awt.Color(102, 102, 102));
        h08.setMinimumSize(new java.awt.Dimension(50, 100));
        h08.setPreferredSize(new java.awt.Dimension(150, 50));

        btn08.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        btn08.setForeground(new java.awt.Color(255, 255, 255));
        btn08.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btn08.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Habitacion_3.png"))); // NOI18N

        jLabel108.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        jLabel108.setForeground(new java.awt.Color(255, 255, 255));
        jLabel108.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel108.setText("Doble");
        jLabel108.setAlignmentY(0.0F);

        jLabel109.setFont(new java.awt.Font("Cleanvertising ", 0, 30));
        jLabel109.setForeground(new java.awt.Color(255, 255, 255));
        jLabel109.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel109.setText("08");
        jLabel109.setAlignmentY(0.1F);

        javax.swing.GroupLayout h08Layout = new javax.swing.GroupLayout(h08);
        h08.setLayout(h08Layout);
        h08Layout.setHorizontalGroup(
            h08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h08Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btn08, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(18, 18, 18)
                .addGroup(h08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel109, javax.swing.GroupLayout.DEFAULT_SIZE, 64, Short.MAX_VALUE)
                    .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        h08Layout.setVerticalGroup(
            h08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(h08Layout.createSequentialGroup()
                .addGroup(h08Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(h08Layout.createSequentialGroup()
                        .addComponent(jLabel109, javax.swing.GroupLayout.PREFERRED_SIZE, 31, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel108, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, h08Layout.createSequentialGroup()
                        .addContainerGap(14, Short.MAX_VALUE)
                        .addComponent(btn08)))
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(h02, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h03, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h04, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h05, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h06, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h07, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h08, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(h09, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h10, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h11, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h12, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h14, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h15, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h16, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(h17, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h18, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h19, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h20, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h22, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h23, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h24, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(h25, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h26, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h27, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h28, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h29, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h30, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h31, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(h32, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h33, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h34, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h35, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h36, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h37, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h38, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(h39, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h40, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(h41, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(86, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(h03, javax.swing.GroupLayout.PREFERRED_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(h04, javax.swing.GroupLayout.PREFERRED_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(h05, javax.swing.GroupLayout.PREFERRED_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(h06, javax.swing.GroupLayout.PREFERRED_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(h07, javax.swing.GroupLayout.PREFERRED_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(h08, javax.swing.GroupLayout.PREFERRED_SIZE, 54, Short.MAX_VALUE)
                    .addComponent(h02, 0, 54, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h09, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h10, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h11, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h14, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h15, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h16, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h17, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h18, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h19, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h20, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h22, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h23, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h24, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h25, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h26, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h27, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h28, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h29, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h30, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h31, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h32, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h33, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h34, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h35, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h36, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h37, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h38, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(h39, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h40, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(h41, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36))
        );

        Barra.setBackground(new java.awt.Color(180, 180, 180));
        Barra.setFont(new java.awt.Font("Cleanvertising ", 0, 18));
        Barra.setForeground(new java.awt.Color(0, 153, 51));
        Barra.setMaximum(38);
        Barra.setBorderPainted(false);

        ico_disponibles.setBackground(new java.awt.Color(0, 158, 56));
        ico_disponibles.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(180, 180, 180)));
        ico_disponibles.setPreferredSize(new java.awt.Dimension(15, 15));

        javax.swing.GroupLayout ico_disponiblesLayout = new javax.swing.GroupLayout(ico_disponibles);
        ico_disponibles.setLayout(ico_disponiblesLayout);
        ico_disponiblesLayout.setHorizontalGroup(
            ico_disponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        ico_disponiblesLayout.setVerticalGroup(
            ico_disponiblesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        lbl_disponibles.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lbl_disponibles.setForeground(new java.awt.Color(25, 25, 25));
        lbl_disponibles.setText("Disponibles");

        lbl_ocupadas.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lbl_ocupadas.setForeground(new java.awt.Color(25, 25, 25));
        lbl_ocupadas.setText("Ocupadas");

        ico_ocupadas.setBackground(new java.awt.Color(235, 0, 15));
        ico_ocupadas.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(180, 180, 180)));
        ico_ocupadas.setPreferredSize(new java.awt.Dimension(15, 15));

        javax.swing.GroupLayout ico_ocupadasLayout = new javax.swing.GroupLayout(ico_ocupadas);
        ico_ocupadas.setLayout(ico_ocupadasLayout);
        ico_ocupadasLayout.setHorizontalGroup(
            ico_ocupadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        ico_ocupadasLayout.setVerticalGroup(
            ico_ocupadasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        lbl_fueradeservicio.setFont(new java.awt.Font("Candara", 0, 18)); // NOI18N
        lbl_fueradeservicio.setForeground(new java.awt.Color(25, 25, 25));
        lbl_fueradeservicio.setText("Fuera de servicio");

        ico_fueradeservicio.setBackground(new java.awt.Color(102, 102, 102));
        ico_fueradeservicio.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(180, 180, 180)));
        ico_fueradeservicio.setPreferredSize(new java.awt.Dimension(15, 15));

        javax.swing.GroupLayout ico_fueradeservicioLayout = new javax.swing.GroupLayout(ico_fueradeservicio);
        ico_fueradeservicio.setLayout(ico_fueradeservicioLayout);
        ico_fueradeservicioLayout.setHorizontalGroup(
            ico_fueradeservicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );
        ico_fueradeservicioLayout.setVerticalGroup(
            ico_fueradeservicioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 13, Short.MAX_VALUE)
        );

        lbl_barra.setFont(new java.awt.Font("Cleanvertising ", 0, 40));
        lbl_barra.setForeground(new java.awt.Color(25, 25, 25));
        lbl_barra.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        lbl_barra.setText("75%");

        lbl_barra1.setFont(new java.awt.Font("Cleanvertising ", 0, 24));
        lbl_barra1.setForeground(new java.awt.Color(25, 25, 25));
        lbl_barra1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        lbl_barra1.setText(" del Hotel esta Ocupado");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Barra, javax.swing.GroupLayout.DEFAULT_SIZE, 1077, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(ico_disponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_disponibles)
                        .addGap(35, 35, 35)
                        .addComponent(ico_ocupadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_ocupadas)
                        .addGap(36, 36, 36)
                        .addComponent(ico_fueradeservicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_fueradeservicio)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 125, Short.MAX_VALUE)
                        .addComponent(lbl_barra, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_barra1, javax.swing.GroupLayout.PREFERRED_SIZE, 299, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(54, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ico_disponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ico_ocupadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ocupadas)
                    .addComponent(ico_fueradeservicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_disponibles)
                    .addComponent(lbl_fueradeservicio)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_barra1)
                        .addComponent(lbl_barra))))
        );
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Barra;
    private javax.swing.JLabel btn03;
    private javax.swing.JLabel btn04;
    private javax.swing.JLabel btn05;
    private javax.swing.JLabel btn06;
    private javax.swing.JLabel btn07;
    private javax.swing.JLabel btn08;
    private javax.swing.JLabel btn09;
    private javax.swing.JLabel btn10;
    private javax.swing.JLabel btn11;
    private javax.swing.JLabel btn12;
    private javax.swing.JLabel btn14;
    private javax.swing.JLabel btn15;
    private javax.swing.JLabel btn16;
    private javax.swing.JLabel btn17;
    private javax.swing.JLabel btn18;
    private javax.swing.JLabel btn19;
    private javax.swing.JLabel btn20;
    private javax.swing.JLabel btn22;
    private javax.swing.JLabel btn23;
    private javax.swing.JLabel btn24;
    private javax.swing.JLabel btn25;
    private javax.swing.JLabel btn26;
    private javax.swing.JLabel btn27;
    private javax.swing.JLabel btn28;
    private javax.swing.JLabel btn29;
    private javax.swing.JLabel btn30;
    private javax.swing.JLabel btn31;
    private javax.swing.JLabel btn32;
    private javax.swing.JLabel btn33;
    private javax.swing.JLabel btn34;
    private javax.swing.JLabel btn35;
    private javax.swing.JLabel btn36;
    private javax.swing.JLabel btn37;
    private javax.swing.JLabel btn38;
    private javax.swing.JLabel btn39;
    private javax.swing.JLabel btn4;
    private javax.swing.JLabel btn40;
    private javax.swing.JLabel btn41;
    private javax.swing.JPanel h02;
    private javax.swing.JPanel h03;
    private javax.swing.JPanel h04;
    private javax.swing.JPanel h05;
    private javax.swing.JPanel h06;
    private javax.swing.JPanel h07;
    private javax.swing.JPanel h08;
    private javax.swing.JPanel h09;
    private javax.swing.JPanel h10;
    private javax.swing.JPanel h11;
    private javax.swing.JPanel h12;
    private javax.swing.JPanel h14;
    private javax.swing.JPanel h15;
    private javax.swing.JPanel h16;
    private javax.swing.JPanel h17;
    private javax.swing.JPanel h18;
    private javax.swing.JPanel h19;
    private javax.swing.JPanel h20;
    private javax.swing.JPanel h22;
    private javax.swing.JPanel h23;
    private javax.swing.JPanel h24;
    private javax.swing.JPanel h25;
    private javax.swing.JPanel h26;
    private javax.swing.JPanel h27;
    private javax.swing.JPanel h28;
    private javax.swing.JPanel h29;
    private javax.swing.JPanel h30;
    private javax.swing.JPanel h31;
    private javax.swing.JPanel h32;
    private javax.swing.JPanel h33;
    private javax.swing.JPanel h34;
    private javax.swing.JPanel h35;
    private javax.swing.JPanel h36;
    private javax.swing.JPanel h37;
    private javax.swing.JPanel h38;
    private javax.swing.JPanel h39;
    private javax.swing.JPanel h40;
    private javax.swing.JPanel h41;
    private javax.swing.JPanel ico_disponibles;
    private javax.swing.JPanel ico_fueradeservicio;
    private javax.swing.JPanel ico_ocupadas;
    private javax.swing.JLabel jLabel100;
    private javax.swing.JLabel jLabel102;
    private javax.swing.JLabel jLabel103;
    private javax.swing.JLabel jLabel105;
    private javax.swing.JLabel jLabel106;
    private javax.swing.JLabel jLabel108;
    private javax.swing.JLabel jLabel109;
    private javax.swing.JLabel jLabel111;
    private javax.swing.JLabel jLabel112;
    private javax.swing.JLabel jLabel114;
    private javax.swing.JLabel jLabel115;
    private javax.swing.JLabel jLabel117;
    private javax.swing.JLabel jLabel118;
    private javax.swing.JLabel jLabel120;
    private javax.swing.JLabel jLabel121;
    private javax.swing.JLabel jLabel123;
    private javax.swing.JLabel jLabel124;
    private javax.swing.JLabel jLabel126;
    private javax.swing.JLabel jLabel127;
    private javax.swing.JLabel jLabel129;
    private javax.swing.JLabel jLabel130;
    private javax.swing.JLabel jLabel132;
    private javax.swing.JLabel jLabel133;
    private javax.swing.JLabel jLabel135;
    private javax.swing.JLabel jLabel136;
    private javax.swing.JLabel jLabel138;
    private javax.swing.JLabel jLabel139;
    private javax.swing.JLabel jLabel141;
    private javax.swing.JLabel jLabel142;
    private javax.swing.JLabel jLabel144;
    private javax.swing.JLabel jLabel145;
    private javax.swing.JLabel jLabel147;
    private javax.swing.JLabel jLabel148;
    private javax.swing.JLabel jLabel150;
    private javax.swing.JLabel jLabel151;
    private javax.swing.JLabel jLabel153;
    private javax.swing.JLabel jLabel154;
    private javax.swing.JLabel jLabel156;
    private javax.swing.JLabel jLabel157;
    private javax.swing.JLabel jLabel159;
    private javax.swing.JLabel jLabel160;
    private javax.swing.JLabel jLabel162;
    private javax.swing.JLabel jLabel163;
    private javax.swing.JLabel jLabel165;
    private javax.swing.JLabel jLabel166;
    private javax.swing.JLabel jLabel168;
    private javax.swing.JLabel jLabel169;
    private javax.swing.JLabel jLabel171;
    private javax.swing.JLabel jLabel172;
    private javax.swing.JLabel jLabel174;
    private javax.swing.JLabel jLabel175;
    private javax.swing.JLabel jLabel180;
    private javax.swing.JLabel jLabel181;
    private javax.swing.JLabel jLabel183;
    private javax.swing.JLabel jLabel184;
    private javax.swing.JLabel jLabel186;
    private javax.swing.JLabel jLabel187;
    private javax.swing.JLabel jLabel189;
    private javax.swing.JLabel jLabel190;
    private javax.swing.JLabel jLabel192;
    private javax.swing.JLabel jLabel193;
    private javax.swing.JLabel jLabel195;
    private javax.swing.JLabel jLabel196;
    private javax.swing.JLabel jLabel198;
    private javax.swing.JLabel jLabel199;
    private javax.swing.JLabel jLabel201;
    private javax.swing.JLabel jLabel202;
    private javax.swing.JLabel jLabel204;
    private javax.swing.JLabel jLabel205;
    private javax.swing.JLabel jLabel207;
    private javax.swing.JLabel jLabel208;
    private javax.swing.JLabel jLabel91;
    private javax.swing.JLabel jLabel92;
    private javax.swing.JLabel jLabel93;
    private javax.swing.JLabel jLabel94;
    private javax.swing.JLabel jLabel99;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel lbl_barra;
    private javax.swing.JLabel lbl_barra1;
    private javax.swing.JLabel lbl_disponibles;
    private javax.swing.JLabel lbl_fueradeservicio;
    private javax.swing.JLabel lbl_ocupadas;
    // End of variables declaration//GEN-END:variables
}
