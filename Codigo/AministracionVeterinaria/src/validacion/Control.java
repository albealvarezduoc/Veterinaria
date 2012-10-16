/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package validacion;

import Entidades.Mascota;
import Entidades.Propietario;
import DAO.ConexionBD;
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
              
 }