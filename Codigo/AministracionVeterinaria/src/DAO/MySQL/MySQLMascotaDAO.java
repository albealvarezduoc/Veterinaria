/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.MySQL;

import DAO.ConexionBD;
import DAO.Interfaces.InterfaceMascota;
import Entidades.Consulta;
import Entidades.Mascota;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Administrador
 */
public class MySQLMascotaDAO extends ConexionBD implements InterfaceMascota {

    private MySQLPropietarioDAO propietarioDAO = new MySQLPropietarioDAO();

    @Override
    public long crearMascota(Mascota mascota) {
        
        long idMascota = 0;
        
        try {
         
            if (propietarioDAO.buscarPropietario(mascota.getPropietario().getRut()) == null) {
                propietarioDAO.crearPropietario(mascota.getPropietario());
            }
              iniciarConexion("VETERINARIA");

            String query = "INSERT INTO MASCOTA (nombre, fecha_nacimiento, edad, raza, sexo, tipo_mascota, rut_propietario) value (?, ?, ?, ?, ?, ?, ?)";
            pstmt = createPrepareStatement(query);


            pstmt.setString(1, mascota.getNombre());
            pstmt.setString(2, mascota.getFechaNacimiento());
            pstmt.setString(3, mascota.getEdad());
            pstmt.setString(4, mascota.getRaza());
            pstmt.setString(5, mascota.getSexo());
            pstmt.setString(6, mascota.getTipo_mascota());
            pstmt.setString(7, mascota.getPropietario().getRut());
            pstmt.executeUpdate();


            String query2 = "SELECT MAX(numero_ficha) as num_ficha from MASCOTA";
            pstmt = createPrepareStatement(query2);

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()){
                idMascota = rs.getInt("num_ficha");   
            }
            
        }
            
        catch (SQLException ex) {
            Logger.getLogger(MySQLMascotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cerrarConexion();
      }
      
        return idMascota; //Cambiar por el id con el que se inserto la mascota
    } 
   
    @Override
    
    public List<Mascota> buscarMascota(String rut) {
    
    List<Mascota> lm = new ArrayList<Mascota>();  
        
    try {
                 
       iniciarConexion("VETERINARIA");
         
       String query = "SELECT numero_ficha, nombre, fecha_nacimiento, edad, raza, sexo, tipo_mascota FROM MASCOTA WHERE rut_propietario =?";
       pstmt = createPrepareStatement(query);
         
       pstmt.setString(1, rut);
         
       ResultSet rs = pstmt.executeQuery();
       
       
         while (rs.next()){
            Mascota mascota = new Mascota();
            mascota.setIdMascota(rs.getInt("numero_ficha"));
            mascota.setNombre(rs.getString("nombre"));
            mascota.setFechaNacimiento(rs.getString("fecha_nacimiento"));
            mascota.setEdad(rs.getString("edad"));
            mascota.setRaza(rs.getString("raza"));
            mascota.setSexo(rs.getString("sexo"));
            mascota.setTipo_mascota(rs.getString("tipo_mascota"));
            
            lm.add(mascota);
         }
        
    } catch (SQLException ex) {
            Logger.getLogger(MySQLMascotaDAO.class.getName()).log(Level.SEVERE, null, ex);
    } finally {
            cerrarConexion();
    }
        
      return lm;    
        
    }

    @Override
    public void eliminarMascota(Mascota mascota) {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    @Override
    public long HistorialClinico(Consulta consulta, Mascota mascota) {

       long idConsulta = 0;
        
        try {
         
          
            iniciarConexion("VETERINARIA");

            String query = "INSERT INTO CONSULTA_MASCOTA (fecha_consulta, hallazgosClinico, diagnostico, medicamento, examenesSolicitadosResultados, "
               + "tratamiento, indicacion, vacunaAdministrada, desparacitacion, fechaProximaVacuna, fechaProximaDesparasitacion, fechaProximoControl,"
               + " horaProximoControl, numero_ficha) value (?, ?, ?, ?, ? ,?, ?, ?, ?, ? ,?, ?, ?, ?)";
            pstmt = createPrepareStatement(query);


            pstmt.setDate(1, new Date(consulta.getFechaConsulta().getTime()));
            pstmt.setString(2, consulta.getHallazgosClinico());
            pstmt.setString(3, consulta.getDiagnostico());
            pstmt.setString(4, consulta.getMedicamentos());
            pstmt.setString(5, consulta.getExamenesSolicitadosResultados());
            pstmt.setString(6, consulta.getTratamiento());
            pstmt.setString(7, consulta.getIndicacion());
            pstmt.setString(8, consulta.getVacunaAdministrada());
            pstmt.setString(9, consulta.getDesparacitacion());
            pstmt.setString(10, consulta.getFechaProximaVacuna());
            pstmt.setString(11, consulta.getFechaProximaDesparasitacion());
            pstmt.setString(12, consulta.getFechaProximoControl());
            pstmt.setString(13, consulta.getHoraProximoControl());
            
            pstmt.setLong(14, mascota.getIdMascota());
            pstmt.executeUpdate();


            String query2 = "SELECT MAX(id_consulta) as num_consulta from CONSULTA_MASCOTA";
            pstmt = createPrepareStatement(query2);

            ResultSet rs = pstmt.executeQuery();
            if (rs.next()){
                idConsulta = rs.getInt("num_consulta");   
            }
            
        }
            
        catch (SQLException ex) {
            Logger.getLogger(MySQLMascotaDAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            cerrarConexion();
      }
      
        return idConsulta; 
    }
 }

   
