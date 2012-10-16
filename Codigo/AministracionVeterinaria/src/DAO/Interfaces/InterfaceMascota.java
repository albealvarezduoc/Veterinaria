/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO.Interfaces;

import Entidades.Consulta;
import Entidades.Mascota;
import java.util.List;

/**
 *
 * @author Administrador
 */
public interface InterfaceMascota {

    public long crearMascota(Mascota mascota);

    public List<Mascota> buscarMascota(String rut);

    public void eliminarMascota(Mascota mascota);

    public long HistorialClinico(Consulta consulta, Mascota mascota);
}
