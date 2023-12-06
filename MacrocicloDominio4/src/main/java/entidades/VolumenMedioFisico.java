/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

/**
 *
 * @author x11_r
 */
public class VolumenMedioFisico {

    String medioFisico;
    float volumen;
//     float porcentaje;

    public VolumenMedioFisico(String medioFisico, float volumen) {
        this.medioFisico = medioFisico;
        this.volumen = volumen;

    }

    public VolumenMedioFisico(float volumen) {
        this.volumen = volumen;

    }

    public VolumenMedioFisico() {
    }

    public String getMedioFisico() {
        return medioFisico;
    }

    public void setMedioFisico(String medioFisico) {
        this.medioFisico = medioFisico;
    }

    public float getVolumen() {
        return volumen;
    }

    public void setVolumen(float volumen) {
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        return "medioFisico=" + medioFisico
                + "\n  volumen=" + volumen
                + "\n}";
    }

}
