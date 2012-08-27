/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficha;

/**
 *
 * @author Administrador
 */
public class Propietario {
     private String rut;
    private String nombre;
    private String apellido;
    private int fono;
    private String direccion;
    private String email;
    
    public Propietario(String rut, String nombre, String apellido, int fono, String direccion, String email)
    {
         this.rut = rut;
         this.nombre = nombre;
         this.apellido = apellido;
         this.fono = fono;
         this.direccion = direccion;
         this.email = email;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public int getFono() {
        return fono;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRut() {
        return rut;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setFono(int fono) {
        this.fono = fono;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }
       

    
}
