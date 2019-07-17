
package Adds;

import Datos.Conexion;
import Librerias.Habitacion;
import java.awt.Color;
import java.sql.*;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Control extends javax.swing.JDialog {

    Color azul = new java.awt.Color(0,95,173);
    Color rojo = new java.awt.Color(235,0,15);        
    Color naranja = new java.awt.Color(255,51,0);        
    Color verde = new java.awt.Color(0,158,56);
    Color gris = new java.awt.Color(100,100,100);
    //Color gris = new java.awt.Color(51,51,51);
    
    String Hoy;
    String[] ID_cuarto;
    String[] Servicio;
    String[] Tipo;
    
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
        
    
    
    public Control(java.awt.Frame parent, boolean modal,String fecha) {
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        this.setIconImage (new ImageIcon(getClass().getResource("/Iconos/Panel.png")).getImage());
        this.setTitle("Control");
        Hoy=fecha;
        Habitaciones();
        
    }
    
    public void Servicio(){
        ID_cuarto=new String[38]; Servicio=new String[38]; Tipo=new String[38];
        for (int i = 0; i < 38; i++)
        {
            Servicio[i]=null;
            ID_cuarto[i]=null;
            Tipo[i]=null;
        }
        Query="SELECT Cuarto,Servicio,Tipo FROM Habitaciones";
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
                    Tipo[i]=Rs.getString("Tipo");
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
    }
        
    public void Rentas(){
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
        
    public void botones(){

        Servicio();

        //Inicializar botones de habitacion
         H1.setText(ID_cuarto[0], Tipo[0]); 
         if(Servicio[0].equals("1"))
         {
             H1.setPanel(verde);
         }
         else
         {
             H1.setPanel(gris);
             Inutiles++;
         }
         H2.setText(ID_cuarto[1], Tipo[1]); 
         if(Servicio[1].equals("1"))
         {
             H2.setPanel(verde);

         }
         else
         {
             H2.setPanel(gris);
             Inutiles++;
         }
         H3.setText(ID_cuarto[2], Tipo[2]); 
         if(Servicio[2].equals("1"))
         {
             H3.setPanel(verde);
         }
         else
         {
             H3.setPanel(gris);
             Inutiles++;
         }
         H4.setText(ID_cuarto[3], Tipo[3]); 
         if(Servicio[3].equals("1"))
         {
             H4.setPanel(verde);
         }
         else
         {
             H4.setPanel(gris);
             Inutiles++;
         }
         H5.setText(ID_cuarto[4], Tipo[4]); 
         if(Servicio[4].equals("1"))
         {
             H5.setPanel(verde);
         }
         else
         {
             H5.setPanel(gris);
             Inutiles++;
         }
         H6.setText(ID_cuarto[5], Tipo[5]); 
         if(Servicio[5].equals("1"))
         {
             H6.setPanel(verde);
         }
         else
         {
             H6.setPanel(gris);
             Inutiles++;
         }
         H7.setText(ID_cuarto[6], Tipo[6]); 
         if(Servicio[6].equals("1"))
         {
             H7.setPanel(verde);
         }
         else
         {
             H7.setPanel(gris);
             Inutiles++;
         }
         H8.setText(ID_cuarto[7], Tipo[7]); 
         if(Servicio[7].equals("1"))
         {
             H8.setPanel(verde);
         }
         else
         {
             H8.setPanel(gris);
             Inutiles++;
         }
         H9.setText(ID_cuarto[8], Tipo[8]); 
         if(Servicio[8].equals("1"))
         {
             H9.setPanel(verde);
         }
         else
         {
             H9.setPanel(gris);
             Inutiles++;
         }
         H10.setText(ID_cuarto[9], Tipo[9]); 
         if(Servicio[9].equals("1"))
         {
             H10.setPanel(verde);
         }
         else
         {
             H10.setPanel(gris);
             Inutiles++;
         }
         H11.setText(ID_cuarto[10], Tipo[10]); 
         if(Servicio[10].equals("1"))
         {
             H11.setPanel(verde);
         }
         else
         {
             H11.setPanel(gris);
             Inutiles++;
         }
         H12.setText(ID_cuarto[11], Tipo[11]); 
         if(Servicio[11].equals("1"))
         {
             H12.setPanel(verde);
         }
         else
         {
             H12.setPanel(gris);
             Inutiles++;
         }
         H13.setText(ID_cuarto[12], Tipo[12]); 
         if(Servicio[12].equals("1"))
         {
             H13.setPanel(verde);
         }
         else
         {
             H13.setPanel(gris);
             Inutiles++;
         }
         H14.setText(ID_cuarto[13], Tipo[13]); 
         if(Servicio[13].equals("1"))
         {
             H14.setPanel(verde);
         }
         else
         {
             H14.setPanel(gris);
             Inutiles++;
         }
         H15.setText(ID_cuarto[14], Tipo[14]); 
         if(Servicio[14].equals("1"))
         {
             H15.setPanel(verde);
         }
         else
         {
             H15.setPanel(gris);
             Inutiles++;
         }
         H16.setText(ID_cuarto[15], Tipo[15]); 
         if(Servicio[15].equals("1"))
         {
             H16.setPanel(verde);
         }
         else
         {
             H16.setPanel(gris);
             Inutiles++;
         }
         H17.setText(ID_cuarto[16], Tipo[16]); 
         if(Servicio[16].equals("1"))
         {
             H17.setPanel(verde);
         }
         else
         {
             H17.setPanel(gris);
             Inutiles++;
         }
         H18.setText(ID_cuarto[17], Tipo[17]); 
         if(Servicio[17].equals("1"))
         {
             H18.setPanel(verde);
         }
         else
         {
             H18.setPanel(gris);
             Inutiles++;
         }
         H19.setText(ID_cuarto[18], Tipo[18]); 
         if(Servicio[18].equals("1"))
         {
             H19.setPanel(verde);
         }
         else
         {
             H19.setPanel(gris);
             Inutiles++;
         }
         H20.setText(ID_cuarto[19], Tipo[19]); 
         if(Servicio[19].equals("1"))
         {
             H20.setPanel(verde);
         }
         else
         {
             H20.setPanel(gris);
             Inutiles++;
         }
         H21.setText(ID_cuarto[20], Tipo[20]); 
         if(Servicio[20].equals("1"))
         {
             H21.setPanel(verde);
         }
         else
         {
             H21.setPanel(gris);
             Inutiles++;
         }
         H22.setText(ID_cuarto[21], Tipo[21]); 
         if(Servicio[21].equals("1"))
         {
             H22.setPanel(verde);
         }
         else
         {
             H22.setPanel(gris);
             Inutiles++;
         }
         H23.setText(ID_cuarto[22], Tipo[22]); 
         if(Servicio[22].equals("1"))
         {
             H23.setPanel(verde);
         }
         else
         {
             H23.setPanel(gris);
             Inutiles++;
         }
         H24.setText(ID_cuarto[23], Tipo[23]); 
         if(Servicio[23].equals("1"))
         {
             H24.setPanel(verde);
         }
         else
         {
             H24.setPanel(gris);
             Inutiles++;
         }
         H25.setText(ID_cuarto[24], Tipo[24]); 
         if(Servicio[24].equals("1"))
         {
             H25.setPanel(verde);
         }
         else
         {
             H25.setPanel(gris);
             Inutiles++;
         }
         H26.setText(ID_cuarto[25], Tipo[25]); 
         if(Servicio[25].equals("1"))
         {
             H26.setPanel(verde);
         }
         else
         {
             H26.setPanel(gris);
             Inutiles++;
         }
         H27.setText(ID_cuarto[26], Tipo[26]); 
         if(Servicio[26].equals("1"))
         {
             H27.setPanel(verde);
         }
         else
         {
             H27.setPanel(gris);
             Inutiles++;
         }
         H28.setText(ID_cuarto[27], Tipo[27]); 
         if(Servicio[27].equals("1"))
         {
             H28.setPanel(verde);
         }
         else
         {
             H28.setPanel(gris);
             Inutiles++;
         }
         H29.setText(ID_cuarto[28], Tipo[28]); 
         if(Servicio[28].equals("1"))
         {
             H29.setPanel(verde);
         }
         else
         {
             H29.setPanel(gris);
             Inutiles++;
         }
         H30.setText(ID_cuarto[29], Tipo[29]); 
         if(Servicio[29].equals("1"))
         {
             H30.setPanel(verde);
         }
         else
         {
             H30.setPanel(gris);
             Inutiles++;
         }
         H31.setText(ID_cuarto[30], Tipo[30]); 
         if(Servicio[30].equals("1"))
         {
             H31.setPanel(verde);
         }
         else
         {
             H31.setPanel(gris);
             Inutiles++;
         }
         H32.setText(ID_cuarto[31], Tipo[31]); 
         if(Servicio[31].equals("1"))
         {
             H32.setPanel(verde);
         }
         else
         {
             H32.setPanel(gris);
             Inutiles++;
         }
         H33.setText(ID_cuarto[32], Tipo[32]); 
         if(Servicio[32].equals("1"))
         {
             H33.setPanel(verde);
         }
         else
         {
             H33.setPanel(gris);
             Inutiles++;
         }
         H34.setText(ID_cuarto[33], Tipo[33]); 
         if(Servicio[33].equals("1"))
         {
             H34.setPanel(verde);
         }
         else
         {
             H34.setPanel(gris);
             Inutiles++;
         }
         H35.setText(ID_cuarto[34], Tipo[34]); 
         if(Servicio[34].equals("1"))
         {
             H35.setPanel(verde);
         }
         else
         {
             H35.setPanel(gris);
             Inutiles++;
         }
         H36.setText(ID_cuarto[35], Tipo[35]); 
         if(Servicio[35].equals("1"))
         {
             H36.setPanel(verde);
         }
         else
         {
             H36.setPanel(gris);
             Inutiles++;
         }
         H37.setText(ID_cuarto[36], Tipo[36]); 
         if(Servicio[36].equals("1"))
         {
             H37.setPanel(verde);
         }
         else
         {
             H37.setPanel(gris);
             Inutiles++;
         }
         H38.setText(ID_cuarto[37], Tipo[37]); 
         if(Servicio[37].equals("1"))
         {
             H38.setPanel(verde);
         }
         else
         {
             H38.setPanel(gris);
             Inutiles++;
         }  
    }
    
    public void Habitaciones(){
        botones();
        status("2", H1);
        status("3", H2);
        status("4", H3);
        status("5", H4);
        status("6", H5);
        status("7", H6);
        status("8", H7);
        status("9", H8);
        status("10", H9);
        status("11", H10);
        status("12", H11);
        status("14", H12);
        status("15", H13);
        status("16", H14);
        status("17", H15);
        status("18", H16);
        status("19", H17);
        status("20", H18);
        status("22", H19);
        status("23", H20);
        status("24", H21);
        status("25", H22);
        status("26", H23);
        status("27", H24);
        status("28", H25);
        status("29", H26);
        status("30", H27);
        status("31", H28);
        status("32", H29);
        status("33", H30);
        status("34", H31);
        status("35", H32);
        status("36", H33);
        status("37", H34);
        status("38", H35);
        status("39", H36);
        status("40", H37);
        status("41", H38);
        
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
        ocupadas.setText(Rentas+" Ocupadas");
        fueraservicio.setText(Inutiles+" Fuera de servicio");
        disponibles.setText((38-Rentas-Inutiles)+" Disponibles");
        
        
    }
            
    public void status(String cuarto, Habitacion H){
        Rentas();
        if(Ocupadas.contains(cuarto))
        {
            H.setPanel(rojo);
            Rentas++;
            
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
        jPanel2 = new javax.swing.JPanel();
        H1 = new Librerias.Habitacion();
        H2 = new Librerias.Habitacion();
        H4 = new Librerias.Habitacion();
        H3 = new Librerias.Habitacion();
        H6 = new Librerias.Habitacion();
        H5 = new Librerias.Habitacion();
        H7 = new Librerias.Habitacion();
        H8 = new Librerias.Habitacion();
        H9 = new Librerias.Habitacion();
        H10 = new Librerias.Habitacion();
        H11 = new Librerias.Habitacion();
        H12 = new Librerias.Habitacion();
        H15 = new Librerias.Habitacion();
        H13 = new Librerias.Habitacion();
        H17 = new Librerias.Habitacion();
        H18 = new Librerias.Habitacion();
        H14 = new Librerias.Habitacion();
        H16 = new Librerias.Habitacion();
        H22 = new Librerias.Habitacion();
        H24 = new Librerias.Habitacion();
        H19 = new Librerias.Habitacion();
        H20 = new Librerias.Habitacion();
        H23 = new Librerias.Habitacion();
        H21 = new Librerias.Habitacion();
        H28 = new Librerias.Habitacion();
        H30 = new Librerias.Habitacion();
        H25 = new Librerias.Habitacion();
        H26 = new Librerias.Habitacion();
        H29 = new Librerias.Habitacion();
        H27 = new Librerias.Habitacion();
        H35 = new Librerias.Habitacion();
        H34 = new Librerias.Habitacion();
        H36 = new Librerias.Habitacion();
        H32 = new Librerias.Habitacion();
        H33 = new Librerias.Habitacion();
        H31 = new Librerias.Habitacion();
        H38 = new Librerias.Habitacion();
        H37 = new Librerias.Habitacion();
        disponibles = new javax.swing.JLabel();
        ocupadas = new javax.swing.JLabel();
        fueraservicio = new javax.swing.JLabel();
        Barra = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.setPreferredSize(new java.awt.Dimension(962, 505));

        jPanel2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(153, 153, 153)));

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(H25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(H19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(H20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(H21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(H22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(H23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(H24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(H13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(H14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(H15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(H16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(H17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(H18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(H7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(H1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(H31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(H37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(H38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(H36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(H1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(H7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(H13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(H19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(H25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(H31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(H38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(H37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        disponibles.setFont(new java.awt.Font("Leelawadee", 0, 14));
        disponibles.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/D.png"))); // NOI18N
        disponibles.setText("Disponibles");

        ocupadas.setFont(new java.awt.Font("Leelawadee", 0, 14));
        ocupadas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/O.png"))); // NOI18N
        ocupadas.setText("Ocupadas");

        fueraservicio.setFont(new java.awt.Font("Leelawadee", 0, 14));
        fueraservicio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Iconos/F.png"))); // NOI18N
        fueraservicio.setText("Fuera de servicio");

        Barra.setMaximum(38);
        Barra.setBorderPainted(false);
        Barra.setFocusable(false);
        Barra.setPreferredSize(new java.awt.Dimension(146, 12));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(disponibles)
                .addGap(52, 52, 52)
                .addComponent(ocupadas)
                .addGap(57, 57, 57)
                .addComponent(fueraservicio))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(Barra, javax.swing.GroupLayout.PREFERRED_SIZE, 931, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(4, 4, 4)
                .addComponent(Barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(disponibles)
                    .addComponent(ocupadas)
                    .addComponent(fueraservicio))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 972, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 972, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 536, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 536, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
            java.util.logging.Logger.getLogger(Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Control.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                Control dialog = new Control(new javax.swing.JFrame(), true, "");
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {

                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Barra;
    private Librerias.Habitacion H1;
    private Librerias.Habitacion H10;
    private Librerias.Habitacion H11;
    private Librerias.Habitacion H12;
    private Librerias.Habitacion H13;
    private Librerias.Habitacion H14;
    private Librerias.Habitacion H15;
    private Librerias.Habitacion H16;
    private Librerias.Habitacion H17;
    private Librerias.Habitacion H18;
    private Librerias.Habitacion H19;
    private Librerias.Habitacion H2;
    private Librerias.Habitacion H20;
    private Librerias.Habitacion H21;
    private Librerias.Habitacion H22;
    private Librerias.Habitacion H23;
    private Librerias.Habitacion H24;
    private Librerias.Habitacion H25;
    private Librerias.Habitacion H26;
    private Librerias.Habitacion H27;
    private Librerias.Habitacion H28;
    private Librerias.Habitacion H29;
    private Librerias.Habitacion H3;
    private Librerias.Habitacion H30;
    private Librerias.Habitacion H31;
    private Librerias.Habitacion H32;
    private Librerias.Habitacion H33;
    private Librerias.Habitacion H34;
    private Librerias.Habitacion H35;
    private Librerias.Habitacion H36;
    private Librerias.Habitacion H37;
    private Librerias.Habitacion H38;
    private Librerias.Habitacion H4;
    private Librerias.Habitacion H5;
    private Librerias.Habitacion H6;
    private Librerias.Habitacion H7;
    private Librerias.Habitacion H8;
    private Librerias.Habitacion H9;
    private javax.swing.JLabel disponibles;
    private javax.swing.JLabel fueraservicio;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JLabel ocupadas;
    // End of variables declaration//GEN-END:variables
}
