/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package formularios;

import entidades.Macrociclo;
import interfaces.IPersistenciaFachada;
import javax.swing.JOptionPane;
import negocio.PersistenciaFachada;

/**
 *
 * @author x11_r
 */
public class DlgDistribuirSemanasPeriodos extends javax.swing.JFrame {

    IPersistenciaFachada persistencia;
    Macrociclo macrociclo;

    /**
     * Creates new form DlgDistribuirSemanasPeriodos
     */
    public DlgDistribuirSemanasPeriodos() {
        persistencia = PersistenciaFachada.getInstance();
        initComponents();
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public DlgDistribuirSemanasPeriodos(Macrociclo macrociclo) {
        persistencia = PersistenciaFachada.getInstance();

        initComponents();
        this.macrociclo = macrociclo;
        setLocationRelativeTo(null);
        setVisible(true);
        TextFieldSemanasMacrociclo.setText(String.valueOf(macrociclo.getSemanasTotalesMacrociclo()));
        TextFieldSemanasPreparatorio.setText(String.valueOf(macrociclo.getSemanasPeriodoPreparatorio()));
        TextFieldSemanasCompetitivo.setText(String.valueOf(macrociclo.getSemanasPeriodoCompetitivo()));

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField6 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        TextFieldPreparativo = new javax.swing.JTextField();
        TextFieldEtapaEspecial = new javax.swing.JTextField();
        TextFieldSemanasMacrociclo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        TextFieldPrecompetitivo = new javax.swing.JTextField();
        TextFieldCompetitivo = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        TextFieldSemanasPreparatorio = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        TextFieldSemanasCompetitivo = new javax.swing.JTextField();
        jToggleButton2 = new javax.swing.JToggleButton();

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        jLabel1.setText("%");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setText("Semanas");

        TextFieldEtapaEspecial.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldEtapaEspecialActionPerformed(evt);
            }
        });

        TextFieldSemanasMacrociclo.setEditable(false);
        TextFieldSemanasMacrociclo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldSemanasMacrocicloActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel5.setText("Semanas total del Macrociclo");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel6.setText("Etapa General");

        jLabel7.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel7.setText("Etapa Especial");

        jLabel8.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel8.setText("Precompetitivo");

        jLabel9.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel9.setText("Competitivo");

        jLabel10.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel10.setText("Semanas asignadas a periodo preparatorio:");

        TextFieldSemanasPreparatorio.setEditable(false);
        TextFieldSemanasPreparatorio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TextFieldSemanasPreparatorioActionPerformed(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel11.setText("Semanas asignadas a periodo competitivo:");

        TextFieldSemanasCompetitivo.setEditable(false);

        jToggleButton2.setText("jToggleButton2");
        jToggleButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(48, 48, 48)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(TextFieldPreparativo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TextFieldEtapaEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextFieldSemanasMacrociclo, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel10)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(TextFieldSemanasPreparatorio, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel11)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(TextFieldSemanasCompetitivo, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(TextFieldCompetitivo, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addComponent(TextFieldPrecompetitivo, javax.swing.GroupLayout.PREFERRED_SIZE, 52, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jToggleButton2)
                        .addGap(175, 175, 175)))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(TextFieldSemanasMacrociclo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(TextFieldSemanasPreparatorio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(2, 2, 2)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(TextFieldPreparativo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TextFieldEtapaEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7))
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(TextFieldSemanasCompetitivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(TextFieldPrecompetitivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(TextFieldCompetitivo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34))
                    .addComponent(jToggleButton2))
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void TextFieldSemanasPreparatorioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldSemanasPreparatorioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldSemanasPreparatorioActionPerformed

    private void TextFieldSemanasMacrocicloActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldSemanasMacrocicloActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldSemanasMacrocicloActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void TextFieldEtapaEspecialActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TextFieldEtapaEspecialActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TextFieldEtapaEspecialActionPerformed

    private void jToggleButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton2ActionPerformed
        // TODO add your handling code here:
           try {
            String preparativoText = TextFieldPreparativo.getText().trim();
            String etapaEspecialText = TextFieldEtapaEspecial.getText().trim();
            String precompetitivoText = TextFieldPrecompetitivo.getText().trim();
            String competitivoText = TextFieldCompetitivo.getText().trim();

            // Verificar que los campos no estén vacíos
            if (preparativoText.isEmpty() || etapaEspecialText.isEmpty() || precompetitivoText.isEmpty() || competitivoText.isEmpty()) {
                JOptionPane.showMessageDialog(this, "Ninguno de los campos puede estar vacío.", "Error", JOptionPane.ERROR_MESSAGE);
            } else {
                // Verificar que los campos solo contengan números válidos
                if (preparativoText.matches("\\d+") && etapaEspecialText.matches("\\d+") && precompetitivoText.matches("\\d+") && competitivoText.matches("\\d+")) {
                    int etapaGeneral = Integer.parseInt(preparativoText);
                    int etapaEspecial = Integer.parseInt(etapaEspecialText);
                    int precompetitivo = Integer.parseInt(precompetitivoText);
                    int competitivo = Integer.parseInt(competitivoText);

                    int semanasPreparatorio = Integer.parseInt(TextFieldSemanasPreparatorio.getText());
                    int semanasCompetitivo = Integer.parseInt(TextFieldSemanasCompetitivo.getText());

                    // Verificar que la suma de etapaGeneral y etapaEspecial sea igual a semanasPreparatorio
                    if (etapaGeneral + etapaEspecial == semanasPreparatorio) {
                        // Verificar que la suma de precompetitivo y competitivo sea igual a semanasCompetitivo
                        if (precompetitivo + competitivo == semanasCompetitivo) {
                            macrociclo.setSemanasPeriodoPrepEtapaGeneral(etapaGeneral);
                            macrociclo.setSemanasPeriodoPrepEtapaEspecial(etapaEspecial);
                            macrociclo.setSemanasPeriodoCompPrecompetitivo(precompetitivo);
                            macrociclo.setSemanasPeriodoCompCompetitivo(competitivo);

                            // Actualizar el objeto macrociclo en la base de datos
                            // persistencia.actualizarMacrociclo(macrociclo);
                            new DlgSeleccionarMediosFisicos(macrociclo);
                            dispose();
                        } else {
                            JOptionPane.showMessageDialog(this, "La suma de Precompetitivo y Competitivo debe ser igual a " + semanasCompetitivo + ".", "Error", JOptionPane.ERROR_MESSAGE);
                        }
                    } else {
                        JOptionPane.showMessageDialog(this, "La suma de Etapa General y Etapa Especial debe ser igual a " + semanasPreparatorio + ".", "Error", JOptionPane.ERROR_MESSAGE);
                    }
                } else {
                    JOptionPane.showMessageDialog(this, "Todos los campos deben contener valores numéricos válidos.", "Error", JOptionPane.ERROR_MESSAGE);
                }
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, "Todos los campos deben contener solo números enteros.", "Error", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jToggleButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(DlgConsultarMacrociclos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(DlgConsultarMacrociclos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(DlgConsultarMacrociclos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(DlgConsultarMacrociclos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new DlgDistribuirSemanasPeriodos().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField TextFieldCompetitivo;
    private javax.swing.JTextField TextFieldEtapaEspecial;
    private javax.swing.JTextField TextFieldPrecompetitivo;
    private javax.swing.JTextField TextFieldPreparativo;
    private javax.swing.JTextField TextFieldSemanasCompetitivo;
    private javax.swing.JTextField TextFieldSemanasMacrociclo;
    private javax.swing.JTextField TextFieldSemanasPreparatorio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JToggleButton jToggleButton2;
    // End of variables declaration//GEN-END:variables
}