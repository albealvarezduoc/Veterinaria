/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

import java.util.Date;
import java.util.List;

/**
 *
 * @author Administrador
 */
public class Consulta {
    
    private long idConsulta;
    private Date fechaConsulta;
    private String hallazgosClinico;
    private String diagnostico;
    private String medicamentos;
    private String examenesSolicitadosResultados;
    private String tratamiento;
    private String indicacion;
    private String vacunaAdministrada;
    private String Desparacitacion;
    private String fechaProximaVacuna; 
    private String fechaProximaDesparasitacion;
    private String fechaProximoControl;
    private String horaProximoControl;
    
    private List<Insumo> listaImsumos;

    public long getIdConsulta() {
        return idConsulta;
    }

    public void setIdConsulta(long idConsulta) {
        this.idConsulta = idConsulta;
    }

    public String getDesparacitacion() {
        return Desparacitacion;
    }

    public void setDesparacitacion(String Desparacitacion) {
        this.Desparacitacion = Desparacitacion;
    }

    public String getDiagnostico() {
        return diagnostico;
    }

    public void setDiagnostico(String diagnostico) {
        this.diagnostico = diagnostico;
    }

    public String getExamenesSolicitadosResultados() {
        return examenesSolicitadosResultados;
    }

    public void setExamenesSolicitadosResultados(String examenesSolicitadosResultados) {
        this.examenesSolicitadosResultados = examenesSolicitadosResultados;
    }

    public Date getFechaConsulta() {
        return fechaConsulta;
    }

    public void setFechaConsulta(Date fechaConsulta) {
        this.fechaConsulta = fechaConsulta;
    }

    public String getFechaProximaDesparasitacion() {
        return fechaProximaDesparasitacion;
    }

    public void setFechaProximaDesparasitacion(String fechaProximaDesparasitacion) {
        this.fechaProximaDesparasitacion = fechaProximaDesparasitacion;
    }

    public String getFechaProximaVacuna() {
        return fechaProximaVacuna;
    }

    public void setFechaProximaVacuna(String fechaProximaVacuna) {
        this.fechaProximaVacuna = fechaProximaVacuna;
    }

    public String getFechaProximoControl() {
        return fechaProximoControl;
    }

    public void setFechaProximoControl(String fechaProximoControl) {
        this.fechaProximoControl = fechaProximoControl;
    }

    public String getHallazgosClinico() {
        return hallazgosClinico;
    }

    public void setHallazgosClinico(String hallazgosClinico) {
        this.hallazgosClinico = hallazgosClinico;
    }

    public String getHoraProximoControl() {
        return horaProximoControl;
    }

    public void setHoraProximoControl(String horaProximoControl) {
        this.horaProximoControl = horaProximoControl;
    }

    public String getIndicacion() {
        return indicacion;
    }

    public void setIndicacion(String indicacion) {
        this.indicacion = indicacion;
    }

    public List<Insumo> getListaImsumos() {
        return listaImsumos;
    }

    public void setListaImsumos(List<Insumo> listaImsumos) {
        this.listaImsumos = listaImsumos;
    }

    public String getMedicamentos() {
        return medicamentos;
    }

    public void setMedicamentos(String medicamentos) {
        this.medicamentos = medicamentos;
    }

    public String getTratamiento() {
        return tratamiento;
    }

    public void setTratamiento(String tratamiento) {
        this.tratamiento = tratamiento;
    }

    public String getVacunaAdministrada() {
        return vacunaAdministrada;
    }

    public void setVacunaAdministrada(String vacunaAdministrada) {
        this.vacunaAdministrada = vacunaAdministrada;
    }

    
}
