/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.MySQL;

import DAO.ConexionBD;
import DAO.Interfaces.InterfaceReceta;
import Entidades.Mascota;
import Entidades.Receta;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class MySQLRecetaDAO extends ConexionBD implements InterfaceReceta{

    
    @Override
    public long generarReceta(Receta receta, long numero_ficha){
    
  
    //Date date = formatter.parse(receta.getFecha("fecha_emision"));
    
        long folio = 0;
        
        try {
         
         
            iniciarConexion("VETERINARIA");

            String query = "INSERT INTO RECETA (fecha_emision, rp , numero_ficha) value (?, ?, ? )"; 
            pstmt = createPrepareStatement(query);
            
           
               
            pstmt.setDate(1, new Date(receta.getFecha().getTime()));  
            pstmt.setString(2, receta.getRP());
            pstmt.setLong(3, numero_ficha);
            pstmt.executeUpdate();


            String query2 = "SELECT MAX(folio) as Folio from RECETA";
            pstmt = createPrepareStatement(query2);

            ResultSet rs = pstmt.executeQuery();
            
            if (rs.next()){
                folio = rs.getInt("Folio");   
            }
        }
        
        catch (SQLException ex) {
        
            Logger.getLogger(MySQLRecetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        
        } finally {
            
                cerrarConexion();
                
        }
        
        return folio;
    }
    
    @Override
    public List<Receta> buscarRecetas(){
    

        List<Receta> lm = new ArrayList<Receta>();
                   

        try {

        iniciarConexion("VETERINARIA");

        String query = "SELECT * FROM RECETA, MASCOTA WHERE Receta.numero_ficha = Mascota.numero_ficha ";
        pstmt = createPrepareStatement(query);
        
        
        ResultSet rs = pstmt.executeQuery();
        

        while (rs.next()){
            
                Receta receta = new Receta();
                Mascota mascota = new Mascota();
 
                receta.setFolio(rs.getInt("folio"));
                receta.setFecha(rs.getDate("fecha_emision"));
                receta.setRP(rs.getString("rp"));
                         
                mascota.setIdMascota(rs.getInt("numero_ficha"));
                mascota.setNombre(rs.getString("nombre"));
                mascota.setEdad(rs.getString("edad"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setTipo_mascota(rs.getString("tipo_mascota"));
                receta.setObjMasc(mascota);
   
                lm.add(receta);
            }

        } catch (SQLException ex) {
                Logger.getLogger(MySQLRecetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
                cerrarConexion();
        }

     return lm;    

     }
    
    
    @Override
    public List<Receta> FiltrarReceta(String fecha_emision){
    
        List<Receta> lm = new ArrayList<Receta>();
                   

        try {

        iniciarConexion("VETERINARIA");

        String query = "SELECT * FROM RECETA, MASCOTA WHERE Receta.numero_ficha = Mascota.numero_ficha and fecha_emision=?";
        pstmt = createPrepareStatement(query);

        pstmt.setString(1, fecha_emision);
        ResultSet rs = pstmt.executeQuery();
        

        while (rs.next()){
            
                Receta receta = new Receta();
                Mascota mascota = new Mascota();
 
                receta.setFolio(rs.getInt("folio"));
                receta.setFecha(rs.getDate("fecha_emision"));
                receta.setRP(rs.getString("rp"));
                         
                mascota.setIdMascota(rs.getInt("numero_ficha"));
                mascota.setNombre(rs.getString("nombre"));
                mascota.setEdad(rs.getString("edad"));
                mascota.setSexo(rs.getString("sexo"));
                mascota.setTipo_mascota(rs.getString("tipo_mascota"));
                receta.setObjMasc(mascota);
   
                lm.add(receta);
            }

        } catch (SQLException ex) {
                Logger.getLogger(MySQLRecetaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
                cerrarConexion();
        }

     return lm;    

     
    }
  
}

