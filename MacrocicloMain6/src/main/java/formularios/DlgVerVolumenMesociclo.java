/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import entidades.Macrociclo;
import entidades.Mesociclo;
import interfaces.IPersistenciaFachada;
import java.awt.BorderLayout;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import negocio.PersistenciaFachada;

/**
 *
 * @author x11_r
 */
public class DlgVerVolumenMesociclo extends javax.swing.JFrame {

    DefaultComboBoxModel listaMesociclos;
    IPersistenciaFachada persistencia;
    Macrociclo macrociclo;

    /**
     * Creates new form DlgVerVolumenMesociclo
     */
    public DlgVerVolumenMesociclo(Macrociclo macrociclo) {
        initComponents();
        this.macrociclo = macrociclo;
        persistencia = PersistenciaFachada.getInstance();

        List<Mesociclo> mesociclo = macrociclo.getMesociclos();
 
        // Crea un DefaultComboBoxModel y asigna la lista de macrociclos
        listaMesociclos = new DefaultComboBoxModel(mesociclo.toArray());

        // Asigna el modelo al JComboBox (o a cualquier otro componente que estés utilizando)
        comboBoxMesociclos.setModel(listaMesociclos);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        comboBoxMesociclos = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Mesociclos del Macrociclo seleccionado");

        comboBoxMesociclos.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jButton1.setText("Ver detalles");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(202, 202, 202)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(comboBoxMesociclos, javax.swing.GroupLayout.PREFERRED_SIZE, 432, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(200, 200, 200)
                        .addComponent(jButton1)))
                .addContainerGap(98, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(37, 37, 37)
                .addComponent(comboBoxMesociclos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67)
                .addComponent(jButton1)
                .addContainerGap(213, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:

        Object selectedItem = comboBoxMesociclos.getSelectedItem();
// Verifica si el elemento seleccionado no es nulo
        if (selectedItem != null) {
            // Crea y configura el JTextArea
            JTextArea detallesTextArea = new JTextArea(selectedItem.toString());
            detallesTextArea.setEditable(false);

            // Crea el panel y agrega el JTextArea
            JPanel panel = new JPanel(new BorderLayout());
            panel.add(detallesTextArea, BorderLayout.CENTER);

            // Crea el JScrollPane y agrega el panel
            JScrollPane scrollPane = new JScrollPane(panel);

            // Muestra el JOptionPane con la información
            JOptionPane.showMessageDialog(this, scrollPane, "Detalles", JOptionPane.INFORMATION_MESSAGE);
        } else {
            // Si no hay elemento seleccionado, muestra un mensaje de error o realiza la acción correspondiente.
            JOptionPane.showMessageDialog(this, "Por favor, selecciona un elemento en el ComboBox", "Error", JOptionPane.ERROR_MESSAGE);
        }


    }//GEN-LAST:event_jButton1ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> comboBoxMesociclos;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}