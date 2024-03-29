
package Paneles;

import Datos.Conexion;
import java.sql.*;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.table.DefaultTableModel;

public class Habitacion extends javax.swing.JPanel {
    JPanel Panel;
    String id="";
    String cuarto="";
    
    DefaultTableModel M;
    String Datos="dbRun", Pass="", Dir="C:";
    Conexion C=new Conexion();
    Connection Conect=null;
    Statement St=null;
    ResultSet Rs=null;
    String Query="";
    
    public Habitacion(JPanel P, String i) {
        initComponents();
        Panel=P;
        id=i;
        info();
        registros("");
    }
    
    public void Estadisticas(int D, int O, int F){
        if(O<15)
        {
            Barra.setForeground(new java.awt.Color(0,158,56)); //verde
        }
        else if(O>15&O<30)
        {
            Barra.setForeground(new java.awt.Color(255,51,0)); //naranja
        }
        else
        {
            Barra.setForeground(new java.awt.Color(235,0,15)); //rojo
        }
        
        Barra.setValue(O);
        lbl_ocupadas.setText(O+" Ocupadas");
        lbl_fueradeservicio.setText(F+" Fuera de servicio");
        lbl_disponibles.setText((38-O-F)+" Disponibles");
        lbl_barra.setText((O*100/38)+"%");
    }
    
    public void info(){

        String Habitacion="", Tipo="", Ubicacion="";
        Query="SELECT Id,Cuarto,Tipo,Ubicacion FROM Habitaciones WHERE Id="+id;
        Conect=C.Conectar(Datos, Pass, Dir);
        
            try 
            {
                St=Conect.createStatement();
                Rs=St.executeQuery(Query);
            
                int i=0;
                while(Rs.next())
                {
                    Habitacion=Rs.getString("Cuarto");
                    Tipo=Rs.getString("Tipo");
                    Ubicacion=Rs.getString("Ubicacion");
                }     
            } 
            catch (SQLException e) 
            {
                JOptionPane.showMessageDialog(null, "Error "+e, "SQLException - InfoHabitacion", 0);
            }
            catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, "Error "+e, "Exception - InfoHabitacion", 0);
            }
            
            lbl_habitacion.setText("HABITACION "+Tipo+" "+Habitacion);
            lbl_lugar.setText(Ubicacion);  
            cuarto=Habitacion;
            
    }
    
    public void registros(String busqueda){
        String[] Titulos={"Fecha","Nombre","Apellido","Telefono","Pago","Empleado"};
        String[] Campo=new String[Titulos.length];
        M=new DefaultTableModel(null, Titulos);
        
        Query="SELECT Fecha,Cuarto,Nombre,Apellido,Telefono,Pago,Empleado FROM Clientes WHERE Cuarto="+cuarto+" AND Fecha LIKE '%"+busqueda+"%' OR "+"Cuarto="+cuarto+" AND Nombre LIKE '%"+busqueda+"%' OR "+"Cuarto="+cuarto+" AND Apellido LIKE '%"+busqueda+"%'";
        Conect=C.Conectar(Datos, Pass, Dir);
        
            try 
            {
                St=Conect.createStatement();
                Rs=St.executeQuery(Query);
            
                int i=0;
                while(Rs.next())
                {
                    Campo[0]=Rs.getString("Fecha");
                    Campo[1]=Rs.getString("Nombre");
                    Campo[2]=Rs.getString("Apellido");
                    Campo[3]=Rs.getString("Telefono");
                    Campo[4]=Rs.getString("Pago");
                    Campo[5]=Rs.getString("Empleado");
                    M.addRow(Campo);
                }
                tabla_habitacion.setModel(M);
            } 
            catch (SQLException e) 
            {
                JOptionPane.showMessageDialog(null, "Error "+e, "SQLException - TablaHabitacion", 0);
            }
            catch (Exception e) 
            {
                JOptionPane.showMessageDialog(null, "Error "+e, "Exception - TablaHabitacion", 0);
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
        jPanel3 = new javax.swing.JPanel();
        lbl_habitacion = new javax.swing.JLabel();
        lbl_lugar = new javax.swing.JLabel();
        btn_rentar = new javax.swing.JPanel();
        lbl_rentar = new javax.swing.JLabel();
        Rentar = new javax.swing.JLabel();
        btn_reservar = new javax.swing.JPanel();
        lbl_reservar = new javax.swing.JLabel();
        Reservar = new javax.swing.JLabel();
        btn_regresar = new javax.swing.JLabel();
        jPanel5 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabla_habitacion = new javax.swing.JTable();
        jTextField1 = new javax.swing.JTextField();
        btn_buscar = new javax.swing.JLabel();
        Barra = new javax.swing.JProgressBar();
        ico_disponibles = new javax.swing.JPanel();
        lbl_disponibles = new javax.swing.JLabel();
        lbl_ocupadas = new javax.swing.JLabel();
        ico_ocupadas = new javax.swing.JPanel();
        lbl_fueradeservicio = new javax.swing.JLabel();
        ico_fueradeservicio = new javax.swing.JPanel();
        lbl_barra = new javax.swing.JLabel();
        lbl_barra1 = new javax.swing.JLabel();

        jPanel1.setBackground(new java.awt.Color(153, 153, 153));
        jPanel1.setPreferredSize(new java.awt.Dimension(1097, 562));

        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder(javax.swing.border.EtchedBorder.RAISED, new java.awt.Color(102, 102, 102), new java.awt.Color(153, 153, 153)));

        jPanel3.setBackground(new java.awt.Color(51, 51, 51));
        jPanel3.setForeground(new java.awt.Color(255, 255, 255));

        lbl_habitacion.setFont(new java.awt.Font("Cleanvertising ", 0, 36));
        lbl_habitacion.setForeground(new java.awt.Color(255, 153, 0));
        lbl_habitacion.setText("HABITACION SUITE 02");
        lbl_habitacion.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lbl_habitacion.setAlignmentY(0.0F);

        lbl_lugar.setFont(new java.awt.Font("Cleanvertising ", 0, 25));
        lbl_lugar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_lugar.setText("HOTEL SAN JUAN");
        lbl_lugar.setAlignmentY(0.0F);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lbl_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, 354, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lbl_habitacion, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lbl_lugar, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(73, Short.MAX_VALUE))
        );

        btn_rentar.setBackground(new java.awt.Color(38, 38, 38));
        btn_rentar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RentarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RentarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RentarMouseExited(evt);
            }
        });

        lbl_rentar.setFont(new java.awt.Font("Cleanvertising ", 0, 22));
        lbl_rentar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_rentar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_rentar.setText("RENTAR");
        lbl_rentar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RentarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RentarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RentarMouseExited(evt);
            }
        });

        Rentar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Rentar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Oficina_i.png"))); // NOI18N
        Rentar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                RentarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                RentarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                RentarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_rentarLayout = new javax.swing.GroupLayout(btn_rentar);
        btn_rentar.setLayout(btn_rentarLayout);
        btn_rentarLayout.setHorizontalGroup(
            btn_rentarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Rentar, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
            .addComponent(lbl_rentar, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
        );
        btn_rentarLayout.setVerticalGroup(
            btn_rentarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_rentarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Rentar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_rentar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btn_reservar.setBackground(new java.awt.Color(38, 38, 38));
        btn_reservar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_reservarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_reservarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_reservarMouseExited(evt);
            }
        });

        lbl_reservar.setFont(new java.awt.Font("Cleanvertising ", 0, 22));
        lbl_reservar.setForeground(new java.awt.Color(255, 255, 255));
        lbl_reservar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lbl_reservar.setText("RESERVAR");
        lbl_reservar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_reservarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_reservarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_reservarMouseExited(evt);
            }
        });

        Reservar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Reservar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Registrar_i.png"))); // NOI18N
        Reservar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lbl_reservarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                lbl_reservarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                lbl_reservarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout btn_reservarLayout = new javax.swing.GroupLayout(btn_reservar);
        btn_reservar.setLayout(btn_reservarLayout);
        btn_reservarLayout.setHorizontalGroup(
            btn_reservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Reservar, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
            .addComponent(lbl_reservar, javax.swing.GroupLayout.DEFAULT_SIZE, 153, Short.MAX_VALUE)
        );
        btn_reservarLayout.setVerticalGroup(
            btn_reservarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(btn_reservarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Reservar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lbl_reservar)
                .addContainerGap(17, Short.MAX_VALUE))
        );

        btn_regresar.setFont(new java.awt.Font("Cleanvertising ", 0, 26));
        btn_regresar.setForeground(new java.awt.Color(38, 38, 38));
        btn_regresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Anterior.png"))); // NOI18N
        btn_regresar.setText("REGRESAR");
        btn_regresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_regresarMouseClicked(evt);
            }
        });

        tabla_habitacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(tabla_habitacion);

        btn_buscar.setFont(new java.awt.Font("Cleanvertising ", 0, 20));
        btn_buscar.setForeground(new java.awt.Color(38, 38, 38));
        btn_buscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Busqueda_black.png"))); // NOI18N
        btn_buscar.setText("BUSCAR");
        btn_buscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btn_buscarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 474, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addComponent(btn_buscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 226, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btn_buscar)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(139, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap(240, Short.MAX_VALUE)
                        .addComponent(btn_regresar)
                        .addGap(81, 81, 81))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(btn_rentar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btn_reservar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jPanel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btn_reservar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btn_rentar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(51, 51, 51)
                .addComponent(btn_regresar)
                .addContainerGap(51, Short.MAX_VALUE))
            .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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

        lbl_disponibles.setFont(new java.awt.Font("Leelawadee", 0, 18));
        lbl_disponibles.setForeground(new java.awt.Color(25, 25, 25));
        lbl_disponibles.setText("Disponibles");

        lbl_ocupadas.setFont(new java.awt.Font("Leelawadee", 0, 18));
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

        lbl_fueradeservicio.setFont(new java.awt.Font("Leelawadee", 0, 18));
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 217, Short.MAX_VALUE)
                        .addComponent(lbl_barra, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lbl_barra1, javax.swing.GroupLayout.PREFERRED_SIZE, 237, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Barra, javax.swing.GroupLayout.DEFAULT_SIZE, 1026, Short.MAX_VALUE)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Barra, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ico_disponibles, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ico_ocupadas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_ocupadas)
                    .addComponent(ico_fueradeservicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_disponibles)
                    .addComponent(lbl_fueradeservicio)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lbl_barra1)
                        .addComponent(lbl_barra)))
                .addGap(135, 135, 135))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1046, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

private void RentarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RentarMouseEntered
    btn_rentar.setBackground(Panel.getBackground());
}//GEN-LAST:event_RentarMouseEntered

private void RentarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RentarMouseExited
    btn_rentar.setBackground(new java.awt.Color(38,38,38));
}//GEN-LAST:event_RentarMouseExited

private void RentarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_RentarMouseClicked
// TODO add your handling code here:
}//GEN-LAST:event_RentarMouseClicked

private void lbl_reservarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_reservarMouseEntered
    btn_reservar.setBackground(new java.awt.Color(255,51,0));
}//GEN-LAST:event_lbl_reservarMouseEntered

private void lbl_reservarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_reservarMouseExited
    btn_reservar.setBackground(new java.awt.Color(38,38,38));
}//GEN-LAST:event_lbl_reservarMouseExited

private void lbl_reservarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lbl_reservarMouseClicked
// TODO add your handling code here:
}//GEN-LAST:event_lbl_reservarMouseClicked

private void btn_regresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_regresarMouseClicked
// TODO add your handling code here:
}//GEN-LAST:event_btn_regresarMouseClicked

private void btn_buscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_buscarMouseClicked
// TODO add your handling code here:
}//GEN-LAST:event_btn_buscarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JProgressBar Barra;
    private javax.swing.JLabel Rentar;
    private javax.swing.JLabel Reservar;
    private javax.swing.JLabel btn_buscar;
    private javax.swing.JLabel btn_regresar;
    private javax.swing.JPanel btn_rentar;
    private javax.swing.JPanel btn_reservar;
    private javax.swing.JPanel ico_disponibles;
    private javax.swing.JPanel ico_fueradeservicio;
    private javax.swing.JPanel ico_ocupadas;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JLabel lbl_barra;
    private javax.swing.JLabel lbl_barra1;
    private javax.swing.JLabel lbl_disponibles;
    private javax.swing.JLabel lbl_fueradeservicio;
    private javax.swing.JLabel lbl_habitacion;
    private javax.swing.JLabel lbl_lugar;
    private javax.swing.JLabel lbl_ocupadas;
    private javax.swing.JLabel lbl_rentar;
    private javax.swing.JLabel lbl_reservar;
    private javax.swing.JTable tabla_habitacion;
    // End of variables declaration//GEN-END:variables
}
