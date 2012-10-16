/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Interfaces;

import Entidades.Ficha;

/**
 *
 * @author Administrador
 */
public interface InterfaceFicha {
        
     public void crearFicha(Ficha fichaMascota);
     
     public Ficha buscarFicha(int numFicha);
     
     public void eliminarFicha(Ficha eliminarFicha);
    
     public void modificarFicha(Ficha modificarFicha);
}
