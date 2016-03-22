package com.kimerasoftec.contabilidad.basica.views;
import com.kimerasoftec.contabilidad.basica.controllers.ArchivoController;
import com.kimerasoftec.contabilidad.basica.controllers.CuentaController;
import com.kimerasoftec.contabilidad.basica.controllers.TransaccionController;
import com.kimerasoftec.contabilidad.basica.models.Cuenta;
import com.kimerasoftec.contabilidad.basica.models.DetalleTransaccion;
import com.kimerasoftec.contabilidad.basica.models.Transaccion;
import java.io.IOException;
import java.sql.Date;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
import javax.swing.SwingUtilities;
import javax.swing.table.DefaultTableModel;

public class TransaccionesFrame extends javax.swing.JInternalFrame {
    public TransaccionesFrame() {
        initComponents();
        habilitar(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpmTipo = new javax.swing.JPopupMenu();
        jmiDebe = new javax.swing.JMenuItem();
        jmiHaber = new javax.swing.JMenuItem();
        jpmTransacciones = new javax.swing.JPopupMenu();
        jmiNueva = new javax.swing.JMenuItem();
        jmiEliminar = new javax.swing.JMenuItem();
        lblFecha = new javax.swing.JLabel();
        txtFecha = new javax.swing.JFormattedTextField();
        btnSeleccionar = new javax.swing.JButton();
        lblGlosa = new javax.swing.JLabel();
        jspGlosa = new javax.swing.JScrollPane();
        txtGlosa = new javax.swing.JTextArea();
        jspTablaTransacciones = new javax.swing.JScrollPane();
        jtTransacciones = new javax.swing.JTable();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();
        btnCambiarFecha = new javax.swing.JButton();

        jmiDebe.setText("Debe");
        jmiDebe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiDebeActionPerformed(evt);
            }
        });
        jpmTipo.add(jmiDebe);

        jmiHaber.setText("Haber");
        jmiHaber.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiHaberActionPerformed(evt);
            }
        });
        jpmTipo.add(jmiHaber);

        jmiNueva.setText("Nueva fila");
        jmiNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNuevaActionPerformed(evt);
            }
        });
        jpmTransacciones.add(jmiNueva);

        jmiEliminar.setText("Eliminar fila");
        jmiEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEliminarActionPerformed(evt);
            }
        });
        jpmTransacciones.add(jmiEliminar);

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Transacciones");

        lblFecha.setText("Seleccione la fecha");

        try {
            txtFecha.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-##-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        btnSeleccionar.setText("Seleccionar");
        btnSeleccionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSeleccionarActionPerformed(evt);
            }
        });

        lblGlosa.setText("Glosa");

        txtGlosa.setColumns(20);
        txtGlosa.setRows(5);
        jspGlosa.setViewportView(txtGlosa);

        jtTransacciones.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null}
            },
            new String [] {
                "Código", "Cuenta", "Tipo", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtTransacciones.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtTransaccionesMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTransaccionesMouseClicked(evt);
            }
        });
        jspTablaTransacciones.setViewportView(jtTransacciones);
        if (jtTransacciones.getColumnModel().getColumnCount() > 0) {
            jtTransacciones.getColumnModel().getColumn(0).setMinWidth(25);
            jtTransacciones.getColumnModel().getColumn(0).setPreferredWidth(25);
            jtTransacciones.getColumnModel().getColumn(1).setMinWidth(150);
            jtTransacciones.getColumnModel().getColumn(1).setPreferredWidth(250);
        }

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCambiarFecha.setText("Cambiar");
        btnCambiarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCambiarFechaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblGlosa)
                            .addComponent(lblFecha))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnSeleccionar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnCambiarFecha)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jspGlosa)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addComponent(jspTablaTransacciones, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 567, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFecha)
                    .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnSeleccionar)
                    .addComponent(btnCambiarFecha))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGlosa)
                    .addComponent(jspGlosa, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspTablaTransacciones, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void habilitar(boolean band){
        txtGlosa.setEditable(band);
        btnAceptar.setEnabled(band);
        jtTransacciones.setEnabled(band);
        btnCambiarFecha.setEnabled(band);
        txtFecha.setEditable(!band);
        btnSeleccionar.setEnabled(!band);
    } 
    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jtTransaccionesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTransaccionesMouseClicked
        if (evt.getClickCount() == 2){
            int columna = jtTransacciones.getSelectedColumn();
            int fila = jtTransacciones.getSelectedRow();
            if (fila >= 0){
                if ((columna == 0 || columna == 1)){
                    BusquedaDialog cuentaDialog = new BusquedaDialog(null, true, 0);
                    cuentaDialog.setLocation(getLocation());
                    cuentaDialog.setVisible(true);
                    Cuenta cuentaSeleccionada = cuentaDialog.obtenerCuentaSeleccionada();
                    if (cuentaSeleccionada != null){
                        if (!CuentaController.esCuentaPadre(cuentaSeleccionada.obtenerCodigo()))
                        {
                            jtTransacciones.setValueAt(cuentaSeleccionada.obtenerCodigo(), fila, 0);
                            jtTransacciones.setValueAt(cuentaSeleccionada.obtenerDescripcion(), fila, 1);
                        }
                        else
                            JOptionPane.showMessageDialog(this, "No puede seleccionar una cuenta padre.", 
                                    "Mensaje de Prohibición", JOptionPane.WARNING_MESSAGE);
                    }
                }
                else if (columna == 2){
                    jpmTipo.show(jtTransacciones, evt.getX(), evt.getY());
                }
            }
        }
    }//GEN-LAST:event_jtTransaccionesMouseClicked

    private void jmiDebeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiDebeActionPerformed
        JMenuItem item = (JMenuItem) evt.getSource();
        int columna = jtTransacciones.getSelectedColumn();
        int fila = jtTransacciones.getSelectedRow();
        jtTransacciones.setValueAt(item.getText(), fila, columna);
    }//GEN-LAST:event_jmiDebeActionPerformed

    private void jtTransaccionesMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTransaccionesMousePressed
        if ( SwingUtilities.isRightMouseButton ( evt ) )
            {
                int fila = jtTransacciones.rowAtPoint(evt.getPoint());
                if (fila >= 0){
                    int x = evt.getX();
                    int y = evt.getY();
                    jtTransacciones.setRowSelectionInterval(fila, fila);
                    jpmTransacciones.show(jtTransacciones, x, y);
                }
            }
    }//GEN-LAST:event_jtTransaccionesMousePressed

    private void jmiNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNuevaActionPerformed
        ((DefaultTableModel)jtTransacciones.getModel()).addRow(new Object[] {});
    }//GEN-LAST:event_jmiNuevaActionPerformed

    private void jmiHaberActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiHaberActionPerformed
        JMenuItem item = (JMenuItem) evt.getSource();
        int columna = jtTransacciones.getSelectedColumn();
        int fila = jtTransacciones.getSelectedRow();
        jtTransacciones.setValueAt(item.getText(), fila, columna);
    }//GEN-LAST:event_jmiHaberActionPerformed

    private void jmiEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEliminarActionPerformed
        int fila = jtTransacciones.getSelectedRow();
        if (fila > 0)
            ((DefaultTableModel)jtTransacciones.getModel()).removeRow(fila);
    }//GEN-LAST:event_jmiEliminarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        if (esValido()){
            Date fecha = Date.valueOf(txtFecha.getValue().toString());
            String glosa = txtGlosa.getText();
            Transaccion transaccion = TransaccionController.obtenerTransaccion(fecha);
            if (transaccion == null)
                transaccion = TransaccionController.agregar(fecha, glosa);
            TransaccionController.eliminarDetalle(transaccion.obtenerCodigo());
            for (int i = 0; i<jtTransacciones.getRowCount(); i++){
                int codigoTransaccion = transaccion.obtenerCodigo();
                int codigoCuenta = Integer.parseInt(jtTransacciones.getValueAt(i, 0).toString());
                String tipo = jtTransacciones.getValueAt(i, 2).toString();
                double valor = Double.parseDouble(jtTransacciones.getValueAt(i, 3).toString());
                TransaccionController.agregarDetalle(codigoTransaccion, codigoCuenta, tipo, valor);
            }
            try {
                ArchivoController.guardarDatos(TransaccionController.transacciones, 
                        TransaccionController.NOMBRE_DE_ARCHIVO);
                JOptionPane.showMessageDialog(this, "La transacción fue almacenada con éxito.", 
                        "Mensaje del Sistema", JOptionPane.INFORMATION_MESSAGE);
            }
            catch (IOException ex){
                JOptionPane.showMessageDialog(this, "Error al momento de realizar la operación. " + ex.getMessage(), 
                        "Mensaje de Error", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void btnSeleccionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSeleccionarActionPerformed
        try {
            Date fecha = Date.valueOf(txtFecha.getValue().toString());
            Transaccion transaccion = TransaccionController.obtenerTransaccion(fecha);
            if (transaccion != null){
                txtGlosa.setText(transaccion.obtenerGlosa());
                DefaultTableModel model = (DefaultTableModel) jtTransacciones.getModel();
                if (transaccion.obtenerDetalle().size() > 0)
                    model.setRowCount(0);
                transaccion.obtenerDetalle().stream().forEach((detalle) -> {
                    Cuenta cuenta = CuentaController.obtenerCuentaPorCodigo(detalle.obtenerCodigoCuenta());
                    model.addRow(new Object[] {cuenta.obtenerCodigo(), cuenta.obtenerDescripcion(),
                        detalle.obtenerTipo(), detalle.obtenerValor()});
                });
                JOptionPane.showMessageDialog(this, "Ya existen transacciones en la fecha seleccionada, "
                        + "serán modificadas.", "Mensaje de información", JOptionPane.INFORMATION_MESSAGE);
            }
            habilitar(true);
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(this, "La fecha no es válida.", "Error de validación",
                    JOptionPane.WARNING_MESSAGE);
        }
    }//GEN-LAST:event_btnSeleccionarActionPerformed

    private void limpiar() {
        txtGlosa.setText("");
        DefaultTableModel model = (DefaultTableModel) jtTransacciones.getModel();
        model.setRowCount(0);
        model.addRow(new Object[] {});
    }
    private void btnCambiarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCambiarFechaActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Desea conservar cualquier cambio en el "
                + "formulario?", "Mensaje de confirmación", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (respuesta != JOptionPane.YES_OPTION)
            limpiar();
        habilitar(false);
    }//GEN-LAST:event_btnCambiarFechaActionPerformed
    private boolean esValido() {
        try {
            Date.valueOf(txtFecha.getValue().toString());
        }
        catch (Exception ex){
            JOptionPane.showMessageDialog(this, "La fecha no es válida.", "Error de validación", 
                    JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (txtGlosa.getText().equals("")){
            JOptionPane.showMessageDialog(this, "La glosa de la transacción no puede estar vacía.", 
                    "Error de validación", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (transaccionesValidas()){
            double debe = calcularColumnaPorTipo(DetalleTransaccion.TIPO_DEBE);
            double haber = calcularColumnaPorTipo(DetalleTransaccion.TIPO_HABER);
            if (debe != haber) {
                JOptionPane.showMessageDialog(this, "No se cumple la partida doble, el debe y el haber no "
                        + "son iguales.", "Error de validación", JOptionPane.WARNING_MESSAGE);
                return false;
            }
        }
        else
        {
            JOptionPane.showMessageDialog(this, "La tabla de transacciones tiene campos vacíos.", 
                    "Error de validación", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }
    private boolean transaccionesValidas() {
        for (int i = 0; i<jtTransacciones.getRowCount(); i++){
            if (jtTransacciones.getValueAt(i, 0) == null || jtTransacciones.getValueAt(i, 2) == null
                    || jtTransacciones.getValueAt(i, 3) == null)
                return false;
        }
        return true;
    }
    private double calcularColumnaPorTipo(String tipo) {
        double valor = 0;
        for (int i = 0; i<jtTransacciones.getRowCount(); i++)
            if (jtTransacciones.getValueAt(i, 2).toString().equals(tipo))
                valor += Double.parseDouble(jtTransacciones.getValueAt(i, 3).toString());
        return valor;
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCambiarFecha;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSeleccionar;
    private javax.swing.JMenuItem jmiDebe;
    private javax.swing.JMenuItem jmiEliminar;
    private javax.swing.JMenuItem jmiHaber;
    private javax.swing.JMenuItem jmiNueva;
    private javax.swing.JPopupMenu jpmTipo;
    private javax.swing.JPopupMenu jpmTransacciones;
    private javax.swing.JScrollPane jspGlosa;
    private javax.swing.JScrollPane jspTablaTransacciones;
    private javax.swing.JTable jtTransacciones;
    private javax.swing.JLabel lblFecha;
    private javax.swing.JLabel lblGlosa;
    private javax.swing.JFormattedTextField txtFecha;
    private javax.swing.JTextArea txtGlosa;
    // End of variables declaration//GEN-END:variables
}
