
package Tienda.Dao;

import Tienda.Conexion.Conexion;
import Tienda.Modelo.Cliente;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;



public class ClienteDao 
{
    public static ArrayList<Cliente> listar()
    {   
       
        ArrayList<Cliente> lista= new ArrayList<Cliente>();
        //Intruccion sql para listar clientes con su distrito
        String sql = "SELECT idcliente,Nombre,Telefono,Distrito FROM cliente,distrito WHERE cliente.iddistrito=distrito.iddistrito"; 
        
        //Conexion
        Connection cn =Conexion.abrir();
        //variable tipo cliente 
        Cliente cli;
        //statement para ejecutar sql con su metodo exexuteQuery
        Statement stm;
        try {
            stm = cn.createStatement();
            ResultSet rs = stm.executeQuery(sql);
            //leer rs
            while(rs.next())
            {
                //objeto cliente
                cli= new Cliente();
                //Asignar valor4es a las propiedades del objeto cliente 
                cli.setIdcliente(rs.getInt(1));
                cli.setNombres(rs.getString(2));
                cli.setTelefono(rs.getString(3));
                cli.setDistrito(rs.getString(4));
                
                //Agregar objeto cliente hacia el arreglo
                lista.add(cli);
                
                
            }
        } 
        
        catch (SQLException ex) 
        
        {
            
        }
        
        return lista;
    }
    
    
}
