/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entidades;

import enums.Etapa;
import java.util.List;

/**
 *
 * @author x11_r
 */
public class Mesociclo {

    int numero;
//     Etapa etapa;
    List<VolumenMedioFisico> distribucionVolumen;
//     List<Microciclo> microciclos;

    public Mesociclo() {
    }

    public Mesociclo(int numero, List<VolumenMedioFisico> distribucionVolumen) {
        this.numero = numero;

        this.distribucionVolumen = distribucionVolumen;

    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public List<VolumenMedioFisico> getDistribucionVolumen() {
        return distribucionVolumen;
    }

    public void setDistribucionVolumen(List<VolumenMedioFisico> distribucionVolumen) {
        this.distribucionVolumen = distribucionVolumen;
    }

    @Override
    public String toString() {
        return "numero=" + numero
                + "\n  distribucionVolumen=" + distribucionVolumen;
    }

}
