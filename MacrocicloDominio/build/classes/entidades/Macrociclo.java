/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import enums.Rama;
import java.util.Date;
import java.util.List;

/**
 *
 * @author x11_r
 */
public class Macrociclo {

 
    Date fechaInicio;
    Date fechafin;
    int semanasTotalesMacrociclo;
    int semanasEtapaGeneral;
    int semanasEtapaEspecial;
    int semanasPeriodoPrecompetitivo;
    int semanasPeriodoCompetitivo;

 
    public Macrociclo() {
    }

 
    public Macrociclo(Date fechaInicio, Date fechafin, int semanasTotalesMacrociclo) {
        this.fechaInicio = fechaInicio;
        this.fechafin = fechafin;
        this.semanasTotalesMacrociclo = semanasTotalesMacrociclo;
    }

    public Macrociclo(Date fechaInicio, Date fechafin, int semanasTotalesMacrociclo, int semanasEtapaGeneral, int semanasEtapaEspecial, int semanasPeriodoPrecompetitivo, int semanasPeriodoCompetitivo) {
        this.fechaInicio = fechaInicio;
        this.fechafin = fechafin;
        this.semanasTotalesMacrociclo = semanasTotalesMacrociclo;
        this.semanasEtapaGeneral = semanasEtapaGeneral;
        this.semanasEtapaEspecial = semanasEtapaEspecial;
        this.semanasPeriodoPrecompetitivo = semanasPeriodoPrecompetitivo;
        this.semanasPeriodoCompetitivo = semanasPeriodoCompetitivo;
    }

    
    public int getSemanasTotalesMacrociclo() {
        return semanasTotalesMacrociclo;
    }

    public void setSemanasTotalesMacrociclo(int semanasTotalesMacrociclo) {
        this.semanasTotalesMacrociclo = semanasTotalesMacrociclo;
    }

    public int getSemanasEtapaGeneral() {
        return semanasEtapaGeneral;
    }

    public void setSemanasEtapaGeneral(int semanasEtapaGeneral) {
        this.semanasEtapaGeneral = semanasEtapaGeneral;
    }

    public int getSemanasEtapaEspecial() {
        return semanasEtapaEspecial;
    }

    public void setSemanasEtapaEspecial(int semanasEtapaEspecial) {
        this.semanasEtapaEspecial = semanasEtapaEspecial;
    }

    public int getSemanasPeriodoPrecompetitivo() {
        return semanasPeriodoPrecompetitivo;
    }

    public void setSemanasPeriodoPrecompetitivo(int semanasPeriodoPrecompetitivo) {
        this.semanasPeriodoPrecompetitivo = semanasPeriodoPrecompetitivo;
    }

    public int getSemanasPeriodoCompetitivo() {
        return semanasPeriodoCompetitivo;
    }

    public void setSemanasPeriodoCompetitivo(int semanasPeriodoCompetitivo) {
        this.semanasPeriodoCompetitivo = semanasPeriodoCompetitivo;
    }



  
    public Macrociclo(Date fechaInicio, Date fechafin) {
        this.fechaInicio = fechaInicio;
        this.fechafin = fechafin;
    }



    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechafin() {
        return fechafin;
    }

    public void setFechafin(Date fechafin) {
        this.fechafin = fechafin;
    }

}
