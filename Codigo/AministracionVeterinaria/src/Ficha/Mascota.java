/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Ficha;

import java.util.Date;

/**
 *
 * @author Administrador
 */
public class Mascota {
    
    private String nombre;
    private String fechaNacimiento;
    private int edad;
    private String raza;
    private String sexo;
    
    public Mascota(String nombre, String fechaNacimiento, int edad, String raza, String sexo)
    {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.raza = raza;
        this.sexo = sexo;        
    }

   

    public String getRaza() {
        return raza;
    }

    public String getSexo() {
        return sexo;
    }

    public int getEdad() {
        return edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setRaza(String Raza) {
        this.raza = Raza;
    }

    public void setSexo(String Sexo) {
        this.sexo = Sexo;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
    
    
}
