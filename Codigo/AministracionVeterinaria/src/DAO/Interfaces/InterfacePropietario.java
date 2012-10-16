/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Interfaces;

import Entidades.Propietario;

/**
 *
 * @author Administrador
 */
public interface InterfacePropietario {

    public void crearPropietario(Propietario propietario);

    public Propietario buscarPropietario(String rut);

    public void eliminarPropietario(Propietario propietario);

    public void modificarPropietario(Propietario propietario);
}
