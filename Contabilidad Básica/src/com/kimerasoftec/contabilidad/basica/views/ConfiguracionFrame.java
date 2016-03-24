package com.kimerasoftec.contabilidad.basica.views;

import com.kimerasoftec.contabilidad.basica.controllers.CuentaController;
import com.kimerasoftec.contabilidad.basica.models.Cuenta;
import com.kimerasoftec.contabilidad.basica.models.CuentaListModel;
import java.util.List;

public class ConfiguracionFrame extends javax.swing.JInternalFrame {
    public ConfiguracionFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpnVisibilidad = new javax.swing.JPanel();
        jcbLibroDiario = new javax.swing.JCheckBox();
        jcbBalanceSaldos = new javax.swing.JCheckBox();
        jcbBalanceSaldos1 = new javax.swing.JCheckBox();
        jcbBalanceSaldos2 = new javax.swing.JCheckBox();
        jpnEstadoResultados = new javax.swing.JPanel();
        jspEstadoResultados = new javax.swing.JScrollPane();
        jlEstadoResultados = new javax.swing.JList<>();
        jpnBalanceGeneral = new javax.swing.JPanel();
        jspBalanceGeneral = new javax.swing.JScrollPane();
        jlBalanceGeneral = new javax.swing.JList<>();
        btnCancelar = new javax.swing.JButton();
        btnAceptar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Configuración");
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameOpened(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        jpnVisibilidad.setBorder(javax.swing.BorderFactory.createTitledBorder("Visibilidad de items"));

        jcbLibroDiario.setText("Libro diario");

        jcbBalanceSaldos.setText("Balance de saldos");

        jcbBalanceSaldos1.setText("Estado de resultados (pérdidas y ganancias)");
        jcbBalanceSaldos1.setToolTipText("");

        jcbBalanceSaldos2.setText("Balance general");
        jcbBalanceSaldos2.setToolTipText("");

        javax.swing.GroupLayout jpnVisibilidadLayout = new javax.swing.GroupLayout(jpnVisibilidad);
        jpnVisibilidad.setLayout(jpnVisibilidadLayout);
        jpnVisibilidadLayout.setHorizontalGroup(
            jpnVisibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnVisibilidadLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jpnVisibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jpnVisibilidadLayout.createSequentialGroup()
                        .addComponent(jcbLibroDiario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbBalanceSaldos)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jcbBalanceSaldos1))
                    .addComponent(jcbBalanceSaldos2))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpnVisibilidadLayout.setVerticalGroup(
            jpnVisibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnVisibilidadLayout.createSequentialGroup()
                .addGroup(jpnVisibilidadLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbLibroDiario)
                    .addComponent(jcbBalanceSaldos)
                    .addComponent(jcbBalanceSaldos1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jcbBalanceSaldos2))
        );

        jpnEstadoResultados.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado de resultados"));

        jspEstadoResultados.setViewportView(jlEstadoResultados);

        javax.swing.GroupLayout jpnEstadoResultadosLayout = new javax.swing.GroupLayout(jpnEstadoResultados);
        jpnEstadoResultados.setLayout(jpnEstadoResultadosLayout);
        jpnEstadoResultadosLayout.setHorizontalGroup(
            jpnEstadoResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnEstadoResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspEstadoResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 229, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnEstadoResultadosLayout.setVerticalGroup(
            jpnEstadoResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnEstadoResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspEstadoResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jpnBalanceGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Balance general"));

        jspBalanceGeneral.setViewportView(jlBalanceGeneral);

        javax.swing.GroupLayout jpnBalanceGeneralLayout = new javax.swing.GroupLayout(jpnBalanceGeneral);
        jpnBalanceGeneral.setLayout(jpnBalanceGeneralLayout);
        jpnBalanceGeneralLayout.setHorizontalGroup(
            jpnBalanceGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBalanceGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspBalanceGeneral)
                .addContainerGap())
        );
        jpnBalanceGeneralLayout.setVerticalGroup(
            jpnBalanceGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpnBalanceGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspBalanceGeneral, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAceptar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnCancelar)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jpnVisibilidad, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpnEstadoResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpnBalanceGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jpnVisibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jpnEstadoResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnBalanceGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnAceptar))
                .addGap(0, 11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void formInternalFrameOpened(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameOpened
        cargarCuentasEstadoResultados();
        cargarCuentasBalanceGeneral();
    }//GEN-LAST:event_formInternalFrameOpened

    private void cargarCuentasEstadoResultados() {
        List<Cuenta> cuentas = CuentaController.obtenerCuentasSinPadre();
        CuentaListModel model = new CuentaListModel(cuentas);
        jlEstadoResultados.setModel(model);
    }
    private void cargarCuentasBalanceGeneral() {
        List<Cuenta> cuentas = CuentaController.obtenerCuentasSinPadre();
        CuentaListModel model = new CuentaListModel(cuentas);
        jlBalanceGeneral.setModel(model);
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JCheckBox jcbBalanceSaldos;
    private javax.swing.JCheckBox jcbBalanceSaldos1;
    private javax.swing.JCheckBox jcbBalanceSaldos2;
    private javax.swing.JCheckBox jcbLibroDiario;
    private javax.swing.JList<String> jlBalanceGeneral;
    private javax.swing.JList<String> jlEstadoResultados;
    private javax.swing.JPanel jpnBalanceGeneral;
    private javax.swing.JPanel jpnEstadoResultados;
    private javax.swing.JPanel jpnVisibilidad;
    private javax.swing.JScrollPane jspBalanceGeneral;
    private javax.swing.JScrollPane jspEstadoResultados;
    // End of variables declaration//GEN-END:variables
}
