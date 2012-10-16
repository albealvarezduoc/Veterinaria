/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Interfaces;

import Entidades.Receta;
import java.sql.Date;
import java.util.List;

/**
 *
 * @author Administrador
 */
public interface InterfaceReceta {
    
    public long generarReceta(Receta receta, long numero_ficha);
    
    public List<Receta> buscarRecetas();
    
    public List<Receta> FiltrarReceta(String fecha_emision);
        
}
