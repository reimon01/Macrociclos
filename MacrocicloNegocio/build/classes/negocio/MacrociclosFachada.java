/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package negocio;

import entidades.Macrociclo;
import interfaces.*;
import java.util.List;

/**
 *
 * @author x11_r
 */
public class MacrociclosFachada implements IPersistenciaFachada {

    IMacrociclosService macrociclosBO;

    private static MacrociclosFachada persistencia;

    public MacrociclosFachada() {
        macrociclosBO = new  MacrociclosService();

    }

    public static MacrociclosFachada getInstance() {
        if (persistencia == null) {
            return new MacrociclosFachada();
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
}
