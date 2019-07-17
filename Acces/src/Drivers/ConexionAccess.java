
package Drivers;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class ConexionAccess {
    
    
    Connection conec=null;
    
    public Connection conexion()
    {
        try {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String SConect="jdbc:odbc:Driver=Microsoft Access Driver (*.mdb);BQD=\\DataBase_Hotel.mdb";
            JOptionPane.showMessageDialog(null, "Conectado ");
        } 
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error Base "+ e);
        }
        return conec;
    }
}
