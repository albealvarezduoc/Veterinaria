/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.MySQL;

import DAO.DAOFactory;
import DAO.Interfaces.InterfaceMascota;
import DAO.Interfaces.InterfacePropietario;
import DAO.Interfaces.InterfaceReceta;

/**
 *
 * @author Administrador
 */
 public abstract class MySQLFactory extends DAOFactory {

    public MySQLFactory() {
    }

    @Override
    public InterfacePropietario getPropietarioDAO() {
        return new MySQLPropietarioDAO();
    }

    @Override
    public InterfaceMascota getMascotaDAO() {
        return new MySQLMascotaDAO();
    }
    
    @Override
    public InterfaceReceta getRecetaDAO() {
        return new MySQLRecetaDAO();
    } 
    
    
}
