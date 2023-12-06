/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import entidades.Macrociclo;
import entidades.MedioFisico;
 import interfaces.IConexionBD;
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
    private static final IConexionBD conexionBD = ConexionBD.getInstance();

    public Persistencia() {
         macrociclosDAO = new MacrociclosDAO(conexionBD);
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

    @Override
    public boolean actualizarMacrociclo(Macrociclo macrociclo) {
        return macrociclosDAO.actualizarMacrociclo(macrociclo);
    }

    @Override
    public boolean actualizarMedioFisico(MedioFisico medioFisico) {
        return macrociclosDAO.actualizarMedioFisico(medioFisico);
    }

}
