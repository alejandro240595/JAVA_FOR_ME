
package Tienda.Conexion;


import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion 

{ 
    //Variables 
    private static String url = "jdbc:mysql://localhost/Tienda";
    private static String usuario = "root";
    private static String clave = "root";
    private static Connection cn;
    
    //metodo para abrir la conexion
    public static   Connection abrir()
    {
        try 
        {
            //registrar driver
            Class.forName("com.mysql.jdbc.Driver");
            //abrir la conexion
            cn=DriverManager.getConnection(url,usuario,clave);
            return cn;
        } 
        
        catch (Exception ex) 
        {
             return null;
        }
       
    }
    
}
