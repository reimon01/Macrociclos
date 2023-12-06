package mainTests;

import java.util.Date;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;
import org.junit.Test;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author x11_r
 */
public class MainTests {
 
    public MainTests() {
    }

   
    
    
    
    
    
    
    
    
    
    @Test
    public void calcularSemanasTest() {
        System.out.println("H5-CP1:Calculo de semanas de las fechas de inicio y final válidas.");

        Date fechaInicio = new Date(2024, 10, 28);
        Date fechaFin = new Date(2024, 11, 19);

        assertTrue(validacionesSemanas(fechaInicio, fechaFin));

    }

  
    
    
    
    
    
      @Test
    public void calcularSemanasConFormatoInvalidoTest() {
        System.out.println("H5-CP2:Fechas con un formato no válido.");

        Date fechaInicio = new Date(12, 2003, 4);
        Date fechaFin = new Date(2, 6, 20);

        assertFalse(validacionesSemanas(fechaInicio, fechaFin));
    }


    
    
    
    
    
    
        @Test
    public void calcularSemanasIncorrectasTest() {
        System.out.println("H5-CP3:Fecha de inicio que es mayor a la fecha final.");

        Date fechaInicio = new Date(2027, 12, 28);
        Date fechaFin = new Date(2024, 11, 20);

        assertFalse(validacionesSemanas(fechaInicio, fechaFin));

    }


    

    
    
    
        @Test
    public void calcularSemanasSinFechaFinalTest() {
        System.out.println("H5-CP4:Fecha de inicio sin una fecha final para calcular las semanas.");

        Date fechaInicio = new Date(2025, 11, 28);

        assertFalse(validacionesSemanas(fechaInicio, null));
    }

    
    
    
    
    
    
    
        @Test
    public void calcularSemanasFechaInicioIgualFinal() {
        System.out.println("H5-CP5:Fecha de inicio igual a la fecha final.");

        Date fechaInicio = new Date(2027, 12, 18);
        Date fechaFin = new Date(2027, 12, 18);

        assertFalse(validacionesSemanas(fechaInicio, fechaFin));
    }

 
    
    
    
    
    
    
    
    
    private boolean validacionesSemanas(Date inicio, Date fin) {

        try {
            if (inicio == null || fin == null) {
                return false;
            }
             if (inicio.after(fin)) {
                return false;
            }

             long diferenciaEnMillis = fin.getTime() - inicio.getTime();
            long diferenciaEnDias = diferenciaEnMillis / (24 * 60 * 60 * 1000);
            if (diferenciaEnDias < 7) {
                return false;
            }
        } catch (Exception e) {
            System.out.println("Error al validar semanas: " + e);
            return false;
        }

        return true;
    }

}
