
import DAO.ConexionBD;
import java.sql.Connection;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author PC2
 */
public class PruebaBD {

    /**
     * @param args the command line arguments
     */
    ConexionBD con=new ConexionBD();
    
    public static void main(String[] args) {
        // TODO code application logic here
     ConexionBD con=new ConexionBD();
     con.Conexion();
}
}
