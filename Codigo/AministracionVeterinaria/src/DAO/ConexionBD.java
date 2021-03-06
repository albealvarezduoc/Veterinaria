/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.*;
import java.sql.PreparedStatement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class ConexionBD {

    private String url;
    private Connection Conec;
    private Statement St;
    //utiliza conexion para consultas
    private ResultSet reg;
    private String HOST = "jdbc:mysql://localhost:3306/";
    private String ACCOUNT = "root";
    private String PASSWORD = "";
    private String DRIVER = "com.mysql.jdbc.Driver";
    protected PreparedStatement pstmt;

    public boolean iniciarConexion(String DB)//genera conexion con mysql
    {
        boolean verificar = false;
        try {
            Class.forName(DRIVER);
            setConec(DriverManager.getConnection(HOST + DB, ACCOUNT, PASSWORD));
            verificar = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        } // definir el problema que tengo Inodb
        return (verificar);
    }

    public boolean ejecutar(String sql) //permite insert, update and deletes en mysql
    {
        boolean verificar = false;
        try {
            St = getConec().createStatement();
            St.execute(sql);
            verificar = true;
        } catch (Exception ex) {
            ex.printStackTrace();
        }

        return (verificar);
    }

    public ResultSet consulta(String sql)//permite consultas a la base de datos
    {
        try {
            St = getConec().createStatement();
            reg = St.executeQuery(sql);
        } catch (Exception ex) {
            reg = null;
        }
        return (reg);
    }

    public boolean cerrarConexion() {
        boolean verificar = false;
        try {
            getConec().close();
            verificar = true;
            pstmt = null;
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return (verificar);
    }

    /**
     * @return the Conec
     */
    public Connection getConec() {
        return Conec;
    }

    /**
     * @param Conec the Conec to set
     */
    public void setConec(Connection Conec) {
        this.Conec = Conec;
    }

    public PreparedStatement createPrepareStatement(String q) {
        try {
            return getConec().prepareStatement(q);
        } catch (SQLException ex) {
            Logger.getLogger(ConexionBD.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
