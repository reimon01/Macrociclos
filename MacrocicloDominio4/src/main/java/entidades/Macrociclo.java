/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import enums.Rama;
import java.util.Date;
import java.util.List;
import java.util.UUID;

/**
 *
 * @author x11_r
 */
public class Macrociclo {

    //String entrenador;
//     Rama rama;
//     String jefeRama;
//     String entrenadorAuxiliar;
//     String metodologo;
    String nombre;
    String deporte;


    Date fechaInicio;
    Date fechafin;
    int semanasTotalesMacrociclo;

//    int semanasEtapaGeneral;
//    int semanasEtapaEspecial;
//    int semanasPeriodoPrecompetitivo;
//    int semanasPeriodoCompetitivo;
    int semanasPeriodoPreparatorio;
    int semanasPeriodoCompetitivo;

    int semanasPeriodoPrepEtapaGeneral;
    int semanasPeriodoPrepEtapaEspecial;

    int semanasPeriodoCompPrecompetitivo;
    int semanasPeriodoCompCompetitivo;

    List<MedioFisico> mediosFisicos;
     List<Mesociclo> mesociclos;

    public Macrociclo() {

    }

    

    public Macrociclo(String nombre, String deporte, int semanasTotalesMacrociclo, int semanasPeriodoPreparatorio, int semanasPeriodoCompetitivo) {
        this.nombre = nombre;
        this.deporte = deporte;
        this.semanasTotalesMacrociclo = semanasTotalesMacrociclo;
        this.semanasPeriodoPreparatorio = semanasPeriodoPreparatorio;
        this.semanasPeriodoCompetitivo = semanasPeriodoCompetitivo;
    }

    
    
    public Macrociclo(String nombre, String deporte, Date fechaInicio, Date fechafin, int semanasTotalesMacrociclo, int semanasPeriodoPreparatorio, int semanasPeriodoCompetitivo) {
        this.nombre = nombre;
        this.deporte = deporte;
        this.fechaInicio = fechaInicio;
        this.fechafin = fechafin;
        this.semanasTotalesMacrociclo = semanasTotalesMacrociclo;
        this.semanasPeriodoPreparatorio = semanasPeriodoPreparatorio;
        this.semanasPeriodoCompetitivo = semanasPeriodoCompetitivo;
    }

    public Macrociclo(String nombre, String deporte, Date fechaInicio, Date fechafin, int semanasTotalesMacrociclo, int semanasPeriodoPreparatorio, int semanasPeriodoCompetitivo, int semanasPeriodoPrepEtapaGeneral, int semanasPeriodoPrepEtapaEspecial, int semanasPeriodoCompPrecompetitivo, int semanasPeriodoCompCompetitivo, List<MedioFisico> mediosFisicos, List<Mesociclo> mesociclos) {
        this.nombre = nombre;
        this.deporte = deporte;
        this.fechaInicio = fechaInicio;
        this.fechafin = fechafin;
        this.semanasTotalesMacrociclo = semanasTotalesMacrociclo;
        this.semanasPeriodoPreparatorio = semanasPeriodoPreparatorio;
        this.semanasPeriodoCompetitivo = semanasPeriodoCompetitivo;
        this.semanasPeriodoPrepEtapaGeneral = semanasPeriodoPrepEtapaGeneral;
        this.semanasPeriodoPrepEtapaEspecial = semanasPeriodoPrepEtapaEspecial;
        this.semanasPeriodoCompPrecompetitivo = semanasPeriodoCompPrecompetitivo;
        this.semanasPeriodoCompCompetitivo = semanasPeriodoCompCompetitivo;
        this.mediosFisicos = mediosFisicos;
        this.mesociclos = mesociclos;
    }
    
    
    

    public Macrociclo(Date fechaInicio, Date fechafin, int semanasTotalesMacrociclo, int semanasPeriodoPreparatorio, int semanasPeriodoCompetitivo, int semanasPeriodoPrepEtapaGeneral, int semanasPeriodoPrepEtapaEspecial, int semanasPeriodoCompPrecompetitivo, int semanasPeriodoCompCompetitivo) {
        this.fechaInicio = fechaInicio;
        this.fechafin = fechafin;
        this.semanasTotalesMacrociclo = semanasTotalesMacrociclo;
        this.semanasPeriodoPreparatorio = semanasPeriodoPreparatorio;
        this.semanasPeriodoCompetitivo = semanasPeriodoCompetitivo;
        this.semanasPeriodoPrepEtapaGeneral = semanasPeriodoPrepEtapaGeneral;
        this.semanasPeriodoPrepEtapaEspecial = semanasPeriodoPrepEtapaEspecial;
        this.semanasPeriodoCompPrecompetitivo = semanasPeriodoCompPrecompetitivo;
        this.semanasPeriodoCompCompetitivo = semanasPeriodoCompCompetitivo;
    }

 

    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    public Macrociclo(String nombre, Date fechaInicio, Date fechafin, int semanasTotalesMacrociclo, int semanasPeriodoPreparatorio, int semanasPeriodoCompetitivo, int semanasPeriodoPrepEtapaGeneral, int semanasPeriodoPrepEtapaEspecial, int semanasPeriodoCompPrecompetitivo, int semanasPeriodoCompCompetitivo) {
        this.nombre = nombre;
        this.fechaInicio = fechaInicio;
        this.fechafin = fechafin;
        this.semanasTotalesMacrociclo = semanasTotalesMacrociclo;
        this.semanasPeriodoPreparatorio = semanasPeriodoPreparatorio;
        this.semanasPeriodoCompetitivo = semanasPeriodoCompetitivo;
        this.semanasPeriodoPrepEtapaGeneral = semanasPeriodoPrepEtapaGeneral;
        this.semanasPeriodoPrepEtapaEspecial = semanasPeriodoPrepEtapaEspecial;
        this.semanasPeriodoCompPrecompetitivo = semanasPeriodoCompPrecompetitivo;
        this.semanasPeriodoCompCompetitivo = semanasPeriodoCompCompetitivo;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

    public int getSemanasTotalesMacrociclo() {
        return semanasTotalesMacrociclo;
    }

    public void setSemanasTotalesMacrociclo(int semanasTotalesMacrociclo) {
        this.semanasTotalesMacrociclo = semanasTotalesMacrociclo;
    }

    public int getSemanasPeriodoPreparatorio() {
        return semanasPeriodoPreparatorio;
    }

    public void setSemanasPeriodoPreparatorio(int semanasPeriodoPreparatorio) {
        this.semanasPeriodoPreparatorio = semanasPeriodoPreparatorio;
    }

    public int getSemanasPeriodoCompetitivo() {
        return semanasPeriodoCompetitivo;
    }

    public void setSemanasPeriodoCompetitivo(int semanasPeriodoCompetitivo) {
        this.semanasPeriodoCompetitivo = semanasPeriodoCompetitivo;
    }

    public int getSemanasPeriodoPrepEtapaGeneral() {
        return semanasPeriodoPrepEtapaGeneral;
    }

    public void setSemanasPeriodoPrepEtapaGeneral(int semanasPeriodoPrepEtapaGeneral) {
        this.semanasPeriodoPrepEtapaGeneral = semanasPeriodoPrepEtapaGeneral;
    }

    public int getSemanasPeriodoPrepEtapaEspecial() {
        return semanasPeriodoPrepEtapaEspecial;
    }

    public void setSemanasPeriodoPrepEtapaEspecial(int semanasPeriodoPrepEtapaEspecial) {
        this.semanasPeriodoPrepEtapaEspecial = semanasPeriodoPrepEtapaEspecial;
    }

    public int getSemanasPeriodoCompPrecompetitivo() {
        return semanasPeriodoCompPrecompetitivo;
    }

    public void setSemanasPeriodoCompPrecompetitivo(int semanasPeriodoCompPrecompetitivo) {
        this.semanasPeriodoCompPrecompetitivo = semanasPeriodoCompPrecompetitivo;
    }

    public int getSemanasPeriodoCompCompetitivo() {
        return semanasPeriodoCompCompetitivo;
    }

    public void setSemanasPeriodoCompCompetitivo(int semanasPeriodoCompCompetitivo) {
        this.semanasPeriodoCompCompetitivo = semanasPeriodoCompCompetitivo;
    }

    @Override
    public String toString() {
        return   "Nombre= " + nombre
                + "\nFechaInicio= " + fechaInicio
                + "\nFechafin= " + fechafin
                + "\nSemanasTotalesMacrociclo= " + semanasTotalesMacrociclo
                + "\nSemanasPeriodoPreparatorio= " + semanasPeriodoPreparatorio
                + "\nSemanasPeriodoCompetitivo= " + semanasPeriodoCompetitivo
                + "\nSemanasPeriodoPrepEtapaGeneral= " + semanasPeriodoPrepEtapaGeneral
                + "\nSemanasPeriodoPrepEtapaEspecial= " + semanasPeriodoPrepEtapaEspecial
                + "\nSemanasPeriodoCompPrecompetitivo= " + semanasPeriodoCompPrecompetitivo
                + "\nSemanasPeriodoCompCompetitivo= " + semanasPeriodoCompCompetitivo;
    }

    public List<MedioFisico> getMediosFisicos() {
        return mediosFisicos;
    }

    public void setMediosFisicos(List<MedioFisico> mediosFisicos) {
        this.mediosFisicos = mediosFisicos;
    }

    public List<Mesociclo> getMesociclos() {
        return mesociclos;
    }

    public void setMesociclos(List<Mesociclo> mesociclos) {
        this.mesociclos = mesociclos;
    }
    
    

}
