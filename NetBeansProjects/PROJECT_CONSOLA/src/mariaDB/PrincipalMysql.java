package mariaDB;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Date;
import javax.swing.JTextArea;
import java.text.SimpleDateFormat;

public class PrincipalMysql {

    public static void main(String[] args) {
        
        VentanaSalida vs = new VentanaSalida("MySql");
        JTextArea txaContenido = vs.getTextArea();
        String s, query;
        //String url = "jdbc:mysql://localhost:3306/CAMPUSFP1"; es lo mismo localhost = 127.0.0.1 la ip de prueba;
        String url = "jdbc:mysql://127.0.0.1:3306/CAMPUSFP1"; // Protocolo, IP o nombre del servidor, puerto, nombre de la base de datos
        String usuario = "root";
        String clave = "";
        
        Connection conexion = null;
        
        try {
            // Establecer la conexión
            conexion = DriverManager.getConnection(url, usuario, clave);
            
            // Si la conexión se establece correctamente
            if (conexion != null) {
                System.out.println("Conexión exitosa a la base de datos.");
                s = String.format("Conexión exitosa a la base de datos." + "\n" + "\n");
                txaContenido.append(s);
                
                query = "SELECT * FROM Alumno"; //Esto es un texto para JAVA pero para el servidor si es importante
                PreparedStatement ps = conexion.prepareStatement(query);
                ResultSet rs = ps.executeQuery();
                
                System.out.printf("%2s %-10s %-20s %-5s %10s\n","id","Nombre","Apellidos","Grupo","Nacimiento");
                System.out.printf("%2s %-10s %-20s %-5s %10s\n","--","------","---------","-----","----------");
                
                s = String.format("%2s %-10s %-20s %-5s %10s\n","id","Nombre","Apellidos","Grupo","Nacimiento");
                txaContenido.append(s);
                
                s = String.format("%2s %-10s %-20s %-5s %10s\n","--","------","---------","-----","----------");
                txaContenido.append(s);
                
                while(rs.next()){
                    int idAlumno = rs.getInt(1);
                    String nombre = rs.getString(2);
                    String apellidos = rs.getString(3);
                    String grupo = rs.getString(4);
                    Date fechaNacimiento = rs.getDate(5); 
                    
                    System.out.printf("%2d %-10s %-20s %-5s %10s\n",idAlumno,nombre,apellidos,grupo,cambiarFormatoFecha(fechaNacimiento));
                    
                    
                    
                    s = String.format("%2d %-10s %-20s %-5s %10s\n",idAlumno,nombre,apellidos,grupo,cambiarFormatoFecha(fechaNacimiento));
                    txaContenido.append(s);
                }
                
                
            }else {
                System.out.println("Error: Conexion.");
                s = String.format("Error: Conexion.");
                txaContenido.append(s);
            }
            
        } catch (SQLException e) {
            
            System.out.println(e.getMessage());

        } 
    }
    
    public static String cambiarFormatoFecha(Date fechaNacimiento){ //entra asi: 2024-06-21
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaMiFormato = sdf.format(fechaNacimiento);
        return fechaMiFormato; //y sale asi: 21/06/2024
    }
    
    
}
