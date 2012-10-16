/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;

/**
 *
 * @author Administrador
 */
public class Receta {
    
    private long folio;
    private Date fecha;
    private String  RP;
    
    private Mascota objMasc;

    public Mascota getObjMasc() {
        return objMasc;
    }

    public void setObjMasc(Mascota objMasc) {
        this.objMasc = objMasc;
    }
        
    public String getRP() {
        return RP;
    }

    public void setRP(String RP) {
        this.RP = RP;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public long getFolio() {
        return folio;
    }

    public void setFolio(long folio) {
        this.folio = folio;
    }
   

    
}
