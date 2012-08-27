/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package validacion;

import Ficha.Mascota;
import Ficha.Propietario;
import conexion.ConexionBD;
import java.sql.*;
import java.util.*;

public class Control {
    
    static ConexionBD conex = new ConexionBD();
    static Connection canal = null;
    static Statement stm = null;
    static ResultSet resul = null;
    
    public Control(){}
    
    public boolean verificarUsuario (String nombre, String clave) throws Exception
    {
       conex.iniciarConexion("VETERINARIA");
       String sql="SELECT * FROM Usuario WHERE nombre='"+nombre+"' and clave='"+clave+"'";
       resul=conex.consulta(sql);
       boolean res = resul.next();
       conex.cerrarConexion();
       return res;
    }
    
    public int crearFicha(Mascota mascota, Propietario propietario)
    {
        int num = -1;
        try
        {
            conex.iniciarConexion("VETERINARIA");
            String sql1="INSERT INTO PROPIETARIO VALUES('"+propietario.getRut()+"',"
                    + "      '"+propietario.getNombre()+"','"+propietario.getApellido()+"', "+propietario.getFono()+","
                    + "      '"+propietario.getDireccion()+"', '"+propietario.getEmail()+"')";
            String sql2="INSERT INTO MASCOTA (nombre,fecha_naciento,edad,raza,sexo,rut_propietario ) VALUES('"+mascota.getNombre()+"', "
                    + "      '"+mascota.getFechaNacimiento()+"', "+mascota.getEdad()+", "
                    + "      '"+mascota.getRaza()+"','"+mascota.getSexo()+"','"+propietario.getRut()+"')";
            String sql3="SELECT MAX(numero_ficha) FROM MASCOTA";
            conex.ejecutar(sql1);
            conex.ejecutar(sql2);
            resul=conex.consulta(sql3);
            
            if(resul.next()){
                num = resul.getInt(1);
            }
            
        }catch(Exception e){
            
        }finally{
            conex.cerrarConexion();
        }
        
        return num;
        
    }
    
    
    
 }