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

public class BalanceSaldosFrame extends javax.swing.JInternalFrame {
    public BalanceSaldosFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAño = new javax.swing.JLabel();
        txtAño = new javax.swing.JFormattedTextField();
        btnGenerar = new javax.swing.JButton();
        jspBalanceSaldos = new javax.swing.JScrollPane();
        jtBalanceSaldos = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnExportar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Balance de Saldos");

        lblAño.setText("Año");

        txtAño.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        jtBalanceSaldos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cod.", "Cuenta", "Debe", "Haber", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
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
        jtBalanceSaldos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtBalanceSaldosMouseClicked(evt);
            }
        });
        jspBalanceSaldos.setViewportView(jtBalanceSaldos);
        if (jtBalanceSaldos.getColumnModel().getColumnCount() > 0) {
            jtBalanceSaldos.getColumnModel().getColumn(1).setMinWidth(150);
            jtBalanceSaldos.getColumnModel().getColumn(1).setPreferredWidth(250);
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
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAño)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGenerar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jspBalanceSaldos, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
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
                .addComponent(jspBalanceSaldos, javax.swing.GroupLayout.DEFAULT_SIZE, 247, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnExportar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed
        try {
            int año = Integer.parseInt(txtAño.getValue().toString());
            List<Cuenta> cuentas = CuentaController.obtenerCuentasNoPadres();
            List<Transaccion> transacciones = TransaccionController.obtenerTransaccionesPorAño(año);
            DefaultTableModel model = (DefaultTableModel) jtBalanceSaldos.getModel();
            model.setRowCount(0);
            if (cuentas.size() > 0 && transacciones.size() > 0){
                cuentas.stream().forEach((cuenta) -> {
                    double debe = 0, haber = 0;
                    for(Transaccion transaccion:transacciones){
                        for(DetalleTransaccion detalle:transaccion.obtenerDetalle()){
                            if (detalle.obtenerCodigoCuenta() == cuenta.obtenerCodigo()){
                                debe += (detalle.obtenerTipo().equals(DetalleTransaccion.TIPO_DEBE))?detalle.obtenerValor():0;
                                haber += (detalle.obtenerTipo().equals(DetalleTransaccion.TIPO_HABER))?detalle.obtenerValor():0;
                            }
                        }
                    }
                    if (debe > 0 || haber > 0) {
                        double saldo = (debe > haber)? debe - haber: haber-debe;
                        model.addRow(new Object[] { cuenta.obtenerCodigo(), cuenta.obtenerDescripcion(), debe, haber, saldo });
                    }
                });
            }
            else
            {
                JOptionPane.showMessageDialog(this, "No se encontró resultados para el año " + año + ".",
                        "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        catch (NumberFormatException | HeadlessException ex){
            JOptionPane.showMessageDialog(this, "Año inválido.", "Mensaje de validación", 
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnGenerarActionPerformed

    private void jtBalanceSaldosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtBalanceSaldosMouseClicked
        if (evt.getClickCount() == 2){
            int fila = jtBalanceSaldos.getSelectedRow();
            int año = Integer.parseInt(txtAño.getValue().toString());
            int codigoCuenta = Integer.parseInt(((DefaultTableModel) jtBalanceSaldos.getModel()).getValueAt(fila, 
                    0).toString());
            MayorizacionDialog mayorizacion = new MayorizacionDialog(null, true, codigoCuenta, año);
            mayorizacion.setLocation(getLocation());
            mayorizacion.setVisible(true);
        }
    }//GEN-LAST:event_jtBalanceSaldosMouseClicked

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JScrollPane jspBalanceSaldos;
    private javax.swing.JTable jtBalanceSaldos;
    private javax.swing.JLabel lblAño;
    private javax.swing.JFormattedTextField txtAño;
    // End of variables declaration//GEN-END:variables
}
