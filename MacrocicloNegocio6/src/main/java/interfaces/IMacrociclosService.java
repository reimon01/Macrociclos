/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaces;

import entidades.Macrociclo;
import entidades.MedioFisico;
import java.util.List;

/**
 *
 * @author x11_r
 */
public interface IMacrociclosService {

    public boolean registrarMacrociclo(Macrociclo macrociclo);

    public List<Macrociclo> buscarMacrociclos();

    public boolean actualizarMacrociclo(Macrociclo macrociclo);

    public boolean actualizarMedioFisico(MedioFisico medioFisico);

}
