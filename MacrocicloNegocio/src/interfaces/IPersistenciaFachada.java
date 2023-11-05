package interfaces;

import entidades.Macrociclo;
import java.util.List;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author x11_r
 */
public interface IPersistenciaFachada {
    
    public boolean registrarMacrociclo(Macrociclo macrociclo);
    public List<Macrociclo> buscarMacrociclos();
    
}
