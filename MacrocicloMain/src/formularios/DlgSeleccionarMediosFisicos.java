/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import entidades.Macrociclo;
import entidades.MedioFisico;
import interfaces.IPersistenciaFachada;
import java.util.ArrayList;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.ListModel;
import negocio.PersistenciaFachada;

/**
 *
 * @author x11_r
 */
public class DlgSeleccionarMediosFisicos extends javax.swing.JFrame {

    IPersistenciaFachada persistencia;
    Macrociclo macrociclo;
    List<MedioFisico> mediosFisicos;
    String[] medios = new String[]{"RAG (KM)", "RAE (MIN)", "VEL.GENERAL(MTROS)", "VEL. ESPECIAL(SEG)", "RES. VEL.GEN(MTROS)", "RES.VEL.ESP(MIN)", "FUERZA. GEN(REP)", "FUERZA.ESP(REP)", "COORDINACION tecnica(REP)", "FLEXIBILIDAD(MIN)"};

    /**
     * Creates new form DlgSeleccionarMediosFisicos
     */
    public DlgSeleccionarMediosFisicos() {
        persistencia = PersistenciaFachada.getInstance();
        initComponents();

    }

    public DlgSeleccionarMediosFisicos(Macrociclo macrociclo) {
        persistencia = PersistenciaFachada.getInstance();
        this.mediosFisicos = new ArrayList<>(); // Inicializa la lista aquí

        initComponents();
        this.macrociclo = macrociclo;
        setLocationRelativeTo(null);
        setVisible(true);
        TextFieldNombreMacro.setText(macrociclo.getNombre());
        ListMediosFisicos.setListData(medios);
        ListMediosFisicos.setEnabled(false);
        TextFieldDeporte.setText(macrociclo.getDeporte());

    }

    private void guardarTodosLosMediosFisicos() {
        // Limpia la lista de mediosFisicos si ya contiene elementos
        mediosFisicos.clear();

        ListModel<String> listModel = ListMediosFisicos.getModel();

        for (int i = 0; i < listModel.getSize(); i++) {
            String medioSeleccionado = listModel.getElementAt(i);

            MedioFisico medioFisico = new MedioFisico();
            medioFisico.setNombre(medioSeleccionado);
            mediosFisicos.add(medioFisico);
        }
        macrociclo.setMediosFisicos(mediosFisicos);
        persistencia.registrarMacrociclo(macrociclo);
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
        jLabel2 = new javax.swing.JLabel();
        TextFieldNombreMacro = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        ListMediosFisicos = new javax.swing.JList<>();
        TextFieldDeporte = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setText("Medios Físicos para el deporte:");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Identificador del Macrociclo");

        TextFieldNombreMacro.setEditable(false);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/BTN.CALCULARV.png"))); // NOI18N
        jButton2.setBorder(null);
        jButton2.setBorderPainted(false);
        jButton2.setContentAreaFilled(false);
        jButton2.setFocusPainted(false);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ListMediosFisicos.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(ListMediosFisicos);

        TextFieldDeporte.setEditable(false);
        TextFieldDeporte.setText(" ");
        TextFieldDeporte.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldDeporteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TextFieldDeporte, javax.swing.GroupLayout.DEFAULT_SIZE, 91, Short.MAX_VALUE)
                            .addComponent(TextFieldNombreMacro)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(130, 130, 130)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jButton2)))
                .addContainerGap(234, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(TextFieldNombreMacro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(TextFieldDeporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addGap(43, 43, 43)
                .addComponent(jButton2)
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        guardarTodosLosMediosFisicos();

        new DlgCalcularVolumenMacroEtapa(macrociclo);

        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void TextFieldDeporteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldDeporteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldDeporteActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> ListMediosFisicos;
    private javax.swing.JTextField TextFieldDeporte;
    private javax.swing.JTextField TextFieldNombreMacro;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
