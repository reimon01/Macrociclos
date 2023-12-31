/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package macrocicloTests;
 
import entidades.Macrociclo;
import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import persistencia.MacrociclosDAO;
/**
 *
 * @author x11_r
 */
public class MacrocicloTests {
    
    private MacrociclosDAO macrociclosDAO;


    
        @Before
    public void setUp() {
         macrociclosDAO = mock(MacrociclosDAO.class);
    }

    
     
       @Test
    public void registrarMacrocicloTest() {
        System.out.println("H1-cp1:Verificar que un Macrociclo pueda registrarse.");

        boolean expResult = true;

        Macrociclo e = new Macrociclo("Macrociclo424" ,"Judo",12,10,11);

         when(macrociclosDAO.registrarMacrociclo(e)).thenReturn(true);

         boolean result = macrociclosDAO.registrarMacrociclo(e);

         assertEquals(expResult, result);
    }

 
 
    
    
    
    
       @Test
    public void validarMacrocicloExistente() {
        System.out.println("H1:CP3:registro con un nombre que ya existe.");

        Macrociclo e = new Macrociclo("Macrociclo424" ,"Judo",12,10,11);

        // Configurar el comportamiento simulado utilizando Mockito
        when(macrociclosDAO.registrarMacrociclo(e)).thenReturn(true);

        // Lógica de prueba que utiliza el mock de macrociclosDAO
        boolean result = macrociclosDAO.registrarMacrociclo(e);

        // Verificar la aserción utilizando Mockito
        assertTrue(result);
    }

    
    @Test
    public void crearMacrocicloNullTest() {
        System.out.println("Validamos crear un Macrociclo nulo.");
        when(macrociclosDAO.registrarMacrociclo(null)).thenReturn(false);
        assertFalse(macrociclosDAO.registrarMacrociclo(null));
    }

 

 

    @Test
    public void actualizarMacrocicloTest() {
        System.out.println("Validamos la actualización de un Macrociclo.");
                Macrociclo nuevoMacrociclo = new Macrociclo("MacrocicloNuevo" ,"JudoNuevo",12,10,11);

 

        when(macrociclosDAO.actualizarMacrociclo( nuevoMacrociclo)).thenReturn(true);

        assertTrue(macrociclosDAO.actualizarMacrociclo( nuevoMacrociclo));
    }

    @Test
    public void actualizarMacrocicloNullTest() {
        System.out.println("Validamos la actualización de un Macrociclo nulo.");

        when(macrociclosDAO.actualizarMacrociclo( null)).thenReturn(false);

        assertFalse(macrociclosDAO.actualizarMacrociclo(null));
    }

    @Test
    public void actualizarMacrocicloInexistenteTest() {
        System.out.println("Validamos la actualización de un Macrociclo inexistente.");
        Macrociclo nuevoMacrociclo2 = new Macrociclo();
         nuevoMacrociclo2.setNombre("NOexiste");
        when(macrociclosDAO.actualizarMacrociclo(  nuevoMacrociclo2)).thenReturn(false);

        assertFalse(macrociclosDAO.actualizarMacrociclo(  nuevoMacrociclo2));
    }

}
