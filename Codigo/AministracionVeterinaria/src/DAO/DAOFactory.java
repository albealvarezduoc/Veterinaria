/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import DAO.Interfaces.InterfaceMascota;
import DAO.Interfaces.InterfacePropietario;
import DAO.Interfaces.InterfaceReceta;
import DAO.MySQL.MySQLFactory;

/**
 *
 * @author Administrador
 */
public abstract class DAOFactory {
    
    
    public static final int MYSQL = 1;
    
    public abstract InterfacePropietario getPropietarioDAO();   
    public abstract InterfaceMascota getMascotaDAO();
    public abstract InterfaceReceta getRecetaDAO();

    
    public static DAOFactory getDAOFactory(int type){
        DAOFactory factory;
        switch (type) {
            case MYSQL:
                factory = new MySQLFactory() {
             };
                break;
            default:
                return null;
        }
        
        return factory;
    }
}
