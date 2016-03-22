package com.kimerasoftec.contabilidad.basica.views;
import com.kimerasoftec.contabilidad.basica.models.Cuenta;
import com.kimerasoftec.contabilidad.basica.controllers.CuentaController;
import com.kimerasoftec.contabilidad.basica.models.CuentaListModel;
import javax.swing.JOptionPane;
public class BusquedaDialog extends javax.swing.JDialog {
    private final int codigoCuenta;
    private Cuenta cuentaSeleccionada;
    public BusquedaDialog(java.awt.Frame parent, boolean modal, int codigoCuenta) {
        super(parent, modal);
        initComponents();
        this.codigoCuenta = codigoCuenta;
        cuentaSeleccionada = null;
        buscar("");
    }
    public int obtenerCodigoCuenta() {
        return codigoCuenta;
    }
    public Cuenta obtenerCuentaSeleccionada() {
        return cuentaSeleccionada;
    }
    private void buscar(String busqueda){
        CuentaListModel modeloCuentas = new CuentaListModel(
                (txtBusqueda.getText().equals(""))?CuentaController.obtenerCuentasPadresPosibles(codigoCuenta):CuentaController.buscarCuentasPadres(codigoCuenta, busqueda));
        jlBusqueda.setModel(modeloCuentas);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtBusqueda = new javax.swing.JTextField();
        btnBuscar = new javax.swing.JButton();
        jspBusqueda = new javax.swing.JScrollPane();
        jlBusqueda = new javax.swing.JList<>();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        txtBusqueda.setText("Escribe tu consulta...");
        txtBusqueda.setSelectionStart(0);

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jlBusqueda.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jlBusqueda.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlBusquedaMouseClicked(evt);
            }
        });
        jspBusqueda.setViewportView(jlBusqueda);

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.setToolTipText("");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jspBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 376, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnAceptar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtBusqueda)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtBusqueda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspBusqueda, javax.swing.GroupLayout.DEFAULT_SIZE, 209, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addGap(5, 5, 5))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        buscar(txtBusqueda.getText());
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        aceptar();
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void aceptar() {
        if (jlBusqueda.getModel().getSize() > 0){
            cuentaSeleccionada = ((CuentaListModel) jlBusqueda.getModel()).getElementAt(jlBusqueda.getSelectedIndex());
            dispose();
        }
        else
            JOptionPane.showMessageDialog(this, "Debe seleccionar una cuenta.", "Mensaje del Sistema", 
                    JOptionPane.WARNING_MESSAGE);
    }
    private void jlBusquedaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlBusquedaMouseClicked
        if (evt.getClickCount() == 2)
            aceptar();
    }//GEN-LAST:event_jlBusquedaMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JList<String> jlBusqueda;
    private javax.swing.JScrollPane jspBusqueda;
    private javax.swing.JTextField txtBusqueda;
    // End of variables declaration//GEN-END:variables
}
