package Controlador;
import java.sql.*;
public class Conexion {
public static Connection Conecta(){
   
     String Driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
     // String URL = "jdbc:sqlserver://JEAN:1433;databaseName=bdBiblioteca"; // URL Jean
     String URL = "jdbc:sqlserver://JEAN:1433;databaseName=bdBiblioteca"; // URL Jhonatan
     String user = "sa";
     String password = "alumno";

     Connection cn=null;   
     try{
        Class.forName(Driver);
        cn = DriverManager.getConnection(URL,user,password);
        System.out.print("ok");
        
     }catch(Exception ex){
        System.out.print(ex.getMessage());
     }
      return cn;     
    }
}
