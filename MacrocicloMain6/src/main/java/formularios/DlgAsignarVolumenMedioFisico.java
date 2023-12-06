/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import entidades.Macrociclo;
import entidades.Mesociclo;
import entidades.VolumenMedioFisico;
import interfaces.IPersistenciaFachada;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import negocio.PersistenciaFachada;

/**
 *
 * @author x11_r
 */
public class DlgAsignarVolumenMedioFisico extends javax.swing.JFrame {

    IPersistenciaFachada persistencia;
    Macrociclo macrociclo;
    Mesociclo mesociclo = new Mesociclo();
    List<VolumenMedioFisico> volumenes;
    List<Mesociclo> listaMesociclo;

    /**
     * Creates new form DlgAsignarVolumenMedioFisico
     */
    public DlgAsignarVolumenMedioFisico(Macrociclo macrociclo) {

        persistencia = PersistenciaFachada.getInstance();
        initComponents();
        this.volumenes = new ArrayList<>(); // Inicializa la lista aquí
        this.listaMesociclo = new ArrayList<>(); // Inicializa la lista aquí
        this.macrociclo = macrociclo;

        setLocationRelativeTo(null);
        setVisible(true);
        mostrarVolumenTotal();
//        int cantidadMesociclos = macrociclo.getMesociclos().size;
//        TextFielMesociclo.setText(String.valueOf(cantidadMesociclos));

    }

    public void mostrarVolumenTotal() {
        DefaultTableModel model = (DefaultTableModel) TablaVolumen.getModel();
        for (int i = 0; i < model.getRowCount(); i++) {
            float volTotal = macrociclo.getMediosFisicos().get(i).getVolumenTotal();
            model.setValueAt(volTotal, i, 1);

        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        TablaVolumen = new javax.swing.JTable();
        jToggleButton1 = new javax.swing.JToggleButton();
        TextFielMesociclo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        TablaVolumen.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {"RAG (KM)", null, null},
                {"RAE (MIN)", null, null},
                {"VEL.GENERAL(MTROS)", null, null},
                {"VEL.ESPECIAL(SEG)", null, null},
                {"RES.VELGEN(MTROS)", null, null},
                {"RES.VEL.ESP(MIN)", null, null},
                {"FUERZA.GEN(REP)", null, null},
                {"FUERZA.ESP(REP)", null, null},
                {"COORDINACION(REP)", null, null},
                {"FLEXIBILIDAD(MIN)", null, null}
            },
            new String [] {
                "Medios Físicos", "Volumen Total", "Volumen Mesociclo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Float.class, java.lang.Float.class
            };
            boolean[] canEdit = new boolean [] {
                true, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TablaVolumen);

        jToggleButton1.setText("jToggleButton1");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        TextFielMesociclo.setEditable(false);
        TextFielMesociclo.setText("  ");

        jLabel1.setText("Mesociclo Número:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFielMesociclo, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(39, 39, 39))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addGap(53, 53, 53))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(TextFielMesociclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(101, 101, 101)
                        .addComponent(jToggleButton1))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        // TODO add your handling code here:

        DefaultTableModel model = (DefaultTableModel) TablaVolumen.getModel();

        for (int i = 0; i < model.getRowCount(); i++) {
            // Obtener el valor de la columna 2
            Object valueColumn1 = model.getValueAt(i, 1);

            Object value = model.getValueAt(i, 2);

            // Verificar si el valor es nulo o está vacío
            if (value == null || value.toString().trim().isEmpty()) {
                // Mostrar un mensaje de error o realizar la acción correspondiente
                JOptionPane.showMessageDialog(this, "Por favor, completa todos los campos en Volumen Mesociclo", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Salir del método si hay un campo vacío
            }

            // Verificar si el valor es un número
            if (!esNumero(value.toString())) {
                // Mostrar un mensaje de error o realizar la acción correspondiente
                JOptionPane.showMessageDialog(this, "Por favor, ingresa solo números válidos en Volumen Mesociclo", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Salir del método si no es un número válido
            }

            // Convertir el valor a float
            float volumen = Float.parseFloat(value.toString());
            float volumenColumn1 = Float.parseFloat(valueColumn1.toString());

            // Verificar si el valor es negativo
            if (volumen < 0) {
                // Mostrar un mensaje de error o realizar la acción correspondiente
                JOptionPane.showMessageDialog(this, "Por favor, ingresa valores no negativos en Volumen Mesociclo", "Error", JOptionPane.ERROR_MESSAGE);
                return; // Salir del método si hay un valor negativo
            }

            // Verificar si el valor de la columna 2 es mayor que el de la columna 1
            if (volumen > volumenColumn1) {
                // Mostrar un mensaje de alerta
                JOptionPane.showMessageDialog(this, "El valor en Volumen Mesociclo no puede ser mayor que el Volumen Total", "Alerta", JOptionPane.WARNING_MESSAGE);
                return; // Salir del método si hay un problema
            }

            // Obtener otros valores necesarios
            String nombre = (String) model.getValueAt(i, 0);

            // Crear y agregar el objeto VolumenMedioFisico a la lista
            VolumenMedioFisico volumenMedioFisico = new VolumenMedioFisico(nombre, volumen);
            volumenes.add(volumenMedioFisico);
        }

// Crear un nuevo Mesociclo
        Mesociclo mesociclo = new Mesociclo();
        mesociclo.setNumero(1);
        mesociclo.setDistribucionVolumen(volumenes);

// Verificar si ya hay Mesociclos en la lista de mesociclos del Macrociclo
        List<Mesociclo> listaMesociclos = macrociclo.getMesociclos();
        if (listaMesociclos == null) {
            listaMesociclos = new ArrayList<>();
        }

// Agregar el nuevo Mesociclo a la lista de mesociclos del Macrociclo
        listaMesociclos.add(mesociclo);
        macrociclo.setMesociclos(listaMesociclos);
        persistencia.actualizarMacrociclo(macrociclo);


    }//GEN-LAST:event_jToggleButton1ActionPerformed

// Método auxiliar para verificar si una cadena es un número
    private boolean esNumero(String str) {
        try {
            Float.parseFloat(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable TablaVolumen;
    private javax.swing.JTextField TextFielMesociclo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    // End of variables declaration//GEN-END:variables
}
