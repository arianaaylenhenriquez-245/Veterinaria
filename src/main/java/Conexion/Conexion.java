package Conexion;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class Conexion {

    Connection conectar = null;

    String usuario = ""; // Nombre de usuario de la base de datos
    String contrasenia = ""; // Contraseña
    String bd = ""; // Nombre de la base de datos
    String ip = "localhost";
    String puerto = "3306";

        String cadena = "jdbc:mysql://" + ip + ":" + puerto + "/" + bd + "?useSSL=false&serverTimezone=UTC";
    public Connection estableceConexion() {
        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            conectar = DriverManager.getConnection(cadena, usuario, contrasenia);
            // JOptionPane.showMessageDialog(null, "La conexion se ha realizado con Exito");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error al conectar a la base de datos, error" + e.toString());
        }
        return conectar;
    }

}
