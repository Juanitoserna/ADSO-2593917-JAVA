package Principal;

import java.sql.*;

public class Principal {

    public static void main(String[] args) {
        Connection conexion;
        Statement manipularDB;
        
        String hostname = "localhost";
        String puerto = "3306";
        String database_name = "app_java";
        String database_user = "root";
        String database_pasword = "";
        
        String url = "jdbc:mysql://"+hostname+":"+puerto+"/"+database_name;
        
        try{
            conexion = DriverManager.getConnection(url , database_user , database_pasword);
            manipularDB = conexion.createStatement();
            System.out.println("Conexion Exitosa a Base de Datos "+database_name);
        }catch(SQLException e ){
            System.out.println("Mensaje de error: " + e.getMessage());
	    conexion = null;
	    manipularDB = null;
        }
        
        if (conexion != null) {
            //extrallendo de la base de datos
            try{
                String consulta = "SELECT * FROM personas";
                ResultSet registros = manipularDB.executeQuery(consulta);
                registros.next();
                if(registros.getRow() == 1){
                    do {  
                        System.out.println("-------------------------------------------------");
                        System.out.println("--> Fila"+registros.getRow());
                        System.out.println("Cedula: "+registros.getString("cedula"));
                        System.out.println("Nombre: "+registros.getString("nombres"));
                        System.out.println("Apellido: "+registros.getString("apellidos"));
                        System.out.println("Telelfono: "+registros.getString("telefono"));
                        System.out.println("Direccion: "+registros.getString("direccion"));
                        System.out.println("Email: "+registros.getString("email"));
                        System.out.println("-------------------------------------------------");
                    } while (registros.next());
                }else{
                    System.out.println("No hay personas registradas");
                }
            }catch(SQLException e){
                System.out.println("Error en SELECT: "+e.getMessage());
            }
            //insertar una persona o un dato
            String cedula = "108806";
            String nombres = "Fancisco";
            String apellidos = "Ochoa";
            String telefono = "300006";
            String direccion = "calle 06";
            String email = "fancisco@mail.com";
            
            String consulta = "INSERT INTO personas (cedula,nombres,apellidos,telefono,direccion,email) VALUES ('"+cedula+"','"+nombres+"','"+apellidos+"','"+telefono+"','"+direccion+"','"+email+"')";
            
            try {
                int respuesta = manipularDB.executeUpdate(consulta);
                if(respuesta > 0){
                    System.out.println("REGISTRO INSERTADO CON EXITO");
                }
            } catch (SQLException e) {
                System.out.println("Error al insertar: "+e.getMessage());
            }
            
            
        }
        
        
    }
    
}
