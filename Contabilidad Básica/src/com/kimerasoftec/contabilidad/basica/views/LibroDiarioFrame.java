/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.kimerasoftec.contabilidad.basica.views;

import com.kimerasoftec.contabilidad.basica.controllers.CuentaController;
import com.kimerasoftec.contabilidad.basica.controllers.TransaccionController;
import com.kimerasoftec.contabilidad.basica.models.Cuenta;
import com.kimerasoftec.contabilidad.basica.models.DetalleTransaccion;
import com.kimerasoftec.contabilidad.basica.models.Transaccion;
import java.awt.HeadlessException;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
public class LibroDiarioFrame extends javax.swing.JInternalFrame {
    public LibroDiarioFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAño = new javax.swing.JLabel();
        txtAño = new javax.swing.JFormattedTextField();
        btnGenerar = new javax.swing.JButton();
        jspLibroDiario = new javax.swing.JScrollPane();
        jtLibroDiario = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Libro  Diario");

        lblAño.setText("Año");

        txtAño.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        jtLibroDiario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N°", "Fecha", "Cuenta/Detalle/GLosa", "Debe", "Haber"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspLibroDiario.setViewportView(jtLibroDiario);
        if (jtLibroDiario.getColumnModel().getColumnCount() > 0) {
            jtLibroDiario.getColumnModel().getColumn(0).setMinWidth(25);
            jtLibroDiario.getColumnModel().getColumn(0).setPreferredWidth(25);
            jtLibroDiario.getColumnModel().getColumn(1).setPreferredWidth(100);
            jtLibroDiario.getColumnModel().getColumn(2).setPreferredWidth(250);
        }

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnExportar.setText("Exportar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jspLibroDiario, javax.swing.GroupLayout.DEFAULT_SIZE, 528, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAño)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGenerar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExportar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblAño)
                    .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnGenerar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspLibroDiario, javax.swing.GroupLayout.DEFAULT_SIZE, 302, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnExportar)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        try {
            int año = Integer.parseInt(txtAño.getValue().toString());
            List<Transaccion> transacciones = TransaccionController.obtenerTransaccionesPorAño(año);
            DefaultTableModel model = (DefaultTableModel) jtLibroDiario.getModel();
            model.setRowCount(0);
            if (transacciones.size() > 0){
                double debe = 0, haber = 0;
                for(Transaccion transaccion:transacciones) {
                    model.addRow(new Object [] {transaccion.obtenerCodigo(), 
                        transaccion.obtenerFecha().toString(), null, null, null});
                    for (DetalleTransaccion detalle:transaccion.obtenerDetalle()) {
                        Cuenta cuenta = CuentaController.obtenerCuentaPorCodigo(detalle.obtenerCodigoCuenta());
                        model.addRow(new Object[] {null, null, cuenta.obtenerDescripcion(), 
                        (detalle.obtenerTipo().equals(DetalleTransaccion.TIPO_DEBE)?detalle.obtenerValor():null),
                        (detalle.obtenerTipo().equals(DetalleTransaccion.TIPO_HABER)?detalle.obtenerValor():null)});
                        debe += detalle.obtenerTipo().equals(DetalleTransaccion.TIPO_DEBE)?detalle.obtenerValor():0;
                        haber += detalle.obtenerTipo().equals(DetalleTransaccion.TIPO_HABER)?detalle.obtenerValor():0;
                    }
                    model.addRow(new Object[] {null, null, transaccion.obtenerGlosa(), null, null});
                }
                model.addRow(new Object[] {null, null, null, debe, haber});
            }
            else {
                JOptionPane.showMessageDialog(this, "No se encontraron transacciones para este año.", 
                        "Mensaje del sistema", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch(NumberFormatException | HeadlessException ex){
            JOptionPane.showMessageDialog(this, "Año inválido.", "Mensaje de validación", 
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnGenerarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JScrollPane jspLibroDiario;
    private javax.swing.JTable jtLibroDiario;
    private javax.swing.JLabel lblAño;
    private javax.swing.JFormattedTextField txtAño;
    // End of variables declaration//GEN-END:variables
}
