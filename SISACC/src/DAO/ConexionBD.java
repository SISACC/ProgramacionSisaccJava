/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package DAO;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;
/**
 *
 * @author PC2
 */
public class ConexionBD {
   
    public void Conexion(){
    Connection conect;
        try {
String connectionUrl = "jdbc:sqlserver://;database=SISACC;integratedSecurity=true;";
conect = DriverManager.getConnection(connectionUrl);
System.out.println("Conectado.");
}
catch (SQLException ex)
{
System.out.println("Error.");
}
    }
    
}
