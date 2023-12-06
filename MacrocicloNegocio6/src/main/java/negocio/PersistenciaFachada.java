/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

 import entidades.Macrociclo;
import entidades.MedioFisico;
import interfaces.*;
import java.util.List;

/**
 *
 * @author x11_r
 */
public class PersistenciaFachada implements IPersistenciaFachada {

    IMacrociclosService macrociclosBO;

    private static PersistenciaFachada persistencia;

    public PersistenciaFachada() {
        macrociclosBO = new MacrociclosService();

    }

    public static PersistenciaFachada getInstance() {
        if (persistencia == null) {
            return new PersistenciaFachada();
        }
        return persistencia;
    }

    @Override
    public boolean registrarMacrociclo(Macrociclo macrociclo) {
        return macrociclosBO.registrarMacrociclo(macrociclo);
    }

    @Override
    public List<Macrociclo> buscarMacrociclos() {
        return macrociclosBO.buscarMacrociclos();
    }
    
        @Override
    public boolean actualizarMacrociclo(Macrociclo macrociclo) {
        return macrociclosBO.actualizarMacrociclo(macrociclo);
    }
    
        @Override
    public boolean actualizarMedioFisico(MedioFisico medioFisico) {
        return macrociclosBO.actualizarMedioFisico(medioFisico);
    }
}
