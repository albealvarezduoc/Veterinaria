package Entidades;

/*
 * To change this template, choose Tools | Templates and open the template in
 * the editor.
 */
import java.util.Date;

/**
 *
 * @author Administrador
 */
public class Mascota {

    public Mascota() {
        
    }

      private long idMascota;
      private String nombre;
      private String fechaNacimiento;
      private String edad;
      private String raza;
      private String sexo;
      private String tipo_mascota;
      private String rut_propietario;
      private Propietario propietario;

    public Mascota(String nombre, String fechaNacimiento, String edad, String raza, String sexo, String tipo_mascota, String  rut_propietario) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
        this.edad = edad;
        this.raza = raza;
        this.sexo = sexo;
        this.tipo_mascota= tipo_mascota;
        this.rut_propietario = rut_propietario;
    }

    public long getIdMascota() {
        return idMascota;
    }

    public void setIdMascota(long idMascota) {
        this.idMascota = idMascota;
    }

    public String getRaza() {
        return raza;
    }

    public String getSexo() {
        return sexo;
    }

    public String getEdad() {
        return edad;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public String getNombre() {
        return nombre;
    }
    
    public String getTipo_mascota() {
        return tipo_mascota;
    }
    public String getRut_propietario(){
        return rut_propietario;
    }
        
    public void setRaza(String Raza) {
        this.raza = Raza;
    }

    public void setSexo(String Sexo) {
        this.sexo = Sexo;
    }

    public void setEdad(String edad) {
        this.edad = edad;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public void setTipo_mascota(String tipo_mascota) {
         this.tipo_mascota = tipo_mascota;
    }
    public void setRut_propietario(String rut_propietario){
        this.rut_propietario = rut_propietario;
    }

    public Propietario getPropietario() {
        return propietario;
    }

    public void setPropietario(Propietario propietario) {
        this.propietario = propietario;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
