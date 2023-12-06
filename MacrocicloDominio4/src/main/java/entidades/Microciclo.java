/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import java.util.Date;
import java.util.List;

/**
 *
 * @author x11_r
 */
public class Microciclo {
    
     Date inicio;
     Date fin;
     int acento;
     List<VolumenMedioFisico> volumenesMediosFisicos;
     boolean competenciaPreparativa;

    public Microciclo() {
    }

    public Microciclo(Date inicio, Date fin, int acento, List<VolumenMedioFisico> volumenesMediosFisicos, boolean competenciaPreparativa) {
        this.inicio = inicio;
        this.fin = fin;
        this.acento = acento;
        this.volumenesMediosFisicos = volumenesMediosFisicos;
        this.competenciaPreparativa = competenciaPreparativa;
    }
    

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public int getAcento() {
        return acento;
    }

    public void setAcento(int acento) {
        this.acento = acento;
    }

    public List<VolumenMedioFisico> getVolumenesMediosFisicos() {
        return volumenesMediosFisicos;
    }

    public void setVolumenesMediosFisicos(List<VolumenMedioFisico> volumenesMediosFisicos) {
        this.volumenesMediosFisicos = volumenesMediosFisicos;
    }

    public boolean isCompetenciaPreparativa() {
        return competenciaPreparativa;
    }

    public void setCompetenciaPreparativa(boolean competenciaPreparativa) {
        this.competenciaPreparativa = competenciaPreparativa;
    }
    
    
}
