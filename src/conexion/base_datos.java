package conexion;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class base_datos {
    public Connection conex = null;
    Statement st;
    String DB = "basedatos_proyecto";
    String URL = "jdbc:mysql://localhost:3307/" + DB;
    String USER = "root";
    String PASS = "";

    public void Establece_Conexion() {
        try {
            //DriverManager.registerDriver(new com.mysql.cj.jdbc.Driver());
            conex = (Connection) DriverManager.getConnection(URL, USER, PASS);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void cierra_conexion() {
        try {
            conex.close();
        } catch (Exception e) {
            e.printStackTrace();
            System.out.println("Error al cerrar la conexion de la base de datos");
        }
    }
}
