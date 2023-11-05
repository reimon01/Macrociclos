/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Macrociclo;
import interfaces.IMacrociclosDAO;
import interfaces.IPersistencia;
import java.util.List;

/**
 *
 * @author x11_r
 */
public class Persistencia implements IPersistencia {

    IMacrociclosDAO macrociclosDAO;

    private static Persistencia persistencia;

    public Persistencia() {
        macrociclosDAO = new MacrociclosDAO();
    }

    public static Persistencia getInstance() {
        if (persistencia == null) {
            return new Persistencia();
        }
        return persistencia;
    }
    
        @Override
    public boolean registrarMacrociclo(Macrociclo macrociclo) {
        return macrociclosDAO.registrarMacrociclo(macrociclo);
         
    }

    
        @Override
    public List<Macrociclo> buscarMacrociclos() {
        return macrociclosDAO.buscarMacrociclos();
    }

}
