/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidades.Macrociclo;
import entidades.MedioFisico;
import interfaces.IMacrociclosDAO;
import interfaces.IMacrociclosService;
import interfaces.IPersistencia;
import java.util.List;
import persistencia.Persistencia;

/**
 *
 * @author x11_r
 */
public class MacrociclosService implements IMacrociclosService {

    IPersistencia persistencia = Persistencia.getInstance();

    @Override
    public boolean registrarMacrociclo(Macrociclo macrociclo) {

        persistencia.registrarMacrociclo(macrociclo);
        return true;

    }

    @Override
    public List<Macrociclo> buscarMacrociclos() {
        return persistencia.buscarMacrociclos();
    }

    @Override
    public boolean actualizarMacrociclo(Macrociclo macrociclo) {
        return persistencia.actualizarMacrociclo(macrociclo);
    }
    
    
    @Override
    public boolean actualizarMedioFisico(MedioFisico medioFisico) {
        return persistencia.actualizarMedioFisico(medioFisico);
    }
    
}

