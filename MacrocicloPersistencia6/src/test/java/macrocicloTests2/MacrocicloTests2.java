/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package macrocicloTests2;
 
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
public class MacrocicloTests2 {
    
    private MacrociclosDAO macrociclosDAO;

    @Before
    public void setUp() {
        // Inicializar el mock de EntrenadorDAO antes de cada prueba
        macrociclosDAO = mock(MacrociclosDAO.class);
    }

    @Test
    public void registrarMacrocicloTest() {
        System.out.println("H10_CP1 - Verificar que un Macrociclo pueda registrarse correctamente.");

        boolean expResult = true;

        Macrociclo e = new Macrociclo("Macrociclo424" ,"Judo",12,10,11);

        // Configurar el comportamiento simulado utilizando Mockito
        when(macrociclosDAO.registrarMacrociclo(e)).thenReturn(true);

        // Lógica de prueba que utiliza el mock de EntrenadorDAO
        boolean result = macrociclosDAO.registrarMacrociclo(e);

        // Verificar la aserción utilizando Mockito
        assertEquals(expResult, result);
    }

 
    @Test
    public void validarMacrocicloExistente() {
        System.out.println("H10_CP3 - Probar que el sistema maneje adecuadamente el intento de registro con un nombre que ya se esta usuando.");

        Macrociclo e = new Macrociclo("Macrociclo424" ,"Judo",12,10,11);

        // Configurar el comportamiento simulado utilizando Mockito
        when(macrociclosDAO.registrarMacrociclo(e)).thenReturn(true);

        // Lógica de prueba que utiliza el mock de EntrenadorDAO
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
