
package Datos;

import java.io.File;
import java.sql.*;
import javax.swing.*;

public class Conexion {
    
    Connection conec=null;
    
    public Connection Conectar(String dbNombre, String dbPassword, String dbDireccion)
    {
        try 
        {
            Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
            String SConect="jdbc:odbc:Driver=Microsoft Access Driver (*.mdb);DBQ="+dbDireccion+File.separator+dbNombre+";PWD="+dbPassword;
            conec=DriverManager.getConnection(SConect,"","");
        } 
        catch (SQLException e) 
        {
            JOptionPane.showMessageDialog(null, "Error "+e, "SQLException", 0);
        }
        catch (ClassNotFoundException e) 
        {
            JOptionPane.showMessageDialog(null, "Error "+e, "ClassNotFoundException", 0);
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error "+e, "Exception", 0);
        }

        return conec;
    }
}
