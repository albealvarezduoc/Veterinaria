/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.MySQL;

import DAO.ConexionBD;
import DAO.Interfaces.InterfacePropietario;
import Entidades.Propietario;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class MySQLPropietarioDAO extends ConexionBD implements InterfacePropietario {

    @Override
    
    public void crearPropietario(Propietario propietario) {
        
        iniciarConexion("VETERINARIA");
        
        
        String query = "INSERT INTO PROPIETARIO(rut, nombre, apellido, fono, direccion, email) values(?, ?, ?, ?, ?, ?)";
        pstmt = createPrepareStatement(query);
        try {
            pstmt.setString(1, propietario.getRut());
            pstmt.setString(2, propietario.getNombre());
            pstmt.setString(3, propietario.getApellido());
            pstmt.setInt(4, propietario.getFono());
            pstmt.setString(5, propietario.getDireccion());
            pstmt.setString(6, propietario.getEmail());            
            pstmt.executeUpdate();
        } catch (SQLException ex) {
            Logger.getLogger(MySQLPropietarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cerrarConexion();
        }
    }

   

    @Override
    public void eliminarPropietario(Propietario propietario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public void modificarPropietario(Propietario propietario) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public Propietario buscarPropietario(String rut) {
        iniciarConexion("VETERINARIA");
        Propietario objPropietario = null;
        
        String query="SELECT *FROM PROPIETARIO WHERE rut=?";
        pstmt = createPrepareStatement(query);
        
            try {
                
            pstmt.setString(1, rut);
            ResultSet rs = pstmt.executeQuery();
            
            if(rs.next()){
            
               objPropietario = new Propietario();
               objPropietario.setRut(rs.getString("rut"));
              
            }
                
            } catch (Exception ex) {
              Logger.getLogger(MySQLPropietarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
            
         return objPropietario;
    }
    
    
}
