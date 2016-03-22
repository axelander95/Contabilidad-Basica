package com.kimerasoftec.contabilidad.basica.views;

import com.kimerasoftec.contabilidad.basica.controllers.CuentaController;
import com.kimerasoftec.contabilidad.basica.controllers.TransaccionController;
import com.kimerasoftec.contabilidad.basica.models.Cuenta;
import com.kimerasoftec.contabilidad.basica.models.DetalleTransaccion;
import com.kimerasoftec.contabilidad.basica.models.Transaccion;
import java.util.List;
import javax.swing.table.DefaultTableModel;

public class MayorizacionDialog extends javax.swing.JDialog {
    private final int codigoCuenta, año;
    public MayorizacionDialog(java.awt.Frame parent, boolean modal, int codigoCuenta, int año) {
        super(parent, modal);
        initComponents();
        this.codigoCuenta = codigoCuenta;
        this.año = año;
        generar();
    }
    public int obtenerCodigoCuenta() {
        return codigoCuenta;
    }
    private void generar() {
        Cuenta cuenta = CuentaController.obtenerCuentaPorCodigo(codigoCuenta);
        setTitle("Mayorización - " + cuenta.obtenerDescripcion());
        List<Transaccion> transacciones = TransaccionController.obtenerTransaccionesPorAño(año);
        DefaultTableModel model = (DefaultTableModel) jtMayorizacion.getModel();
        double saldo = 0;
        for(Transaccion transaccion:transacciones){
            for(DetalleTransaccion detalle:transaccion.obtenerDetalle()){
                if (detalle.obtenerCodigoCuenta() == cuenta.obtenerCodigo()){
                    double valor = detalle.obtenerValor();
                    saldo += (detalle.obtenerTipo().equals(DetalleTransaccion.TIPO_DEBE))?valor:(valor * -1);
                    model.addRow(new Object [] { transaccion.obtenerCodigo(), 
                        (detalle.obtenerTipo().equals(DetalleTransaccion.TIPO_DEBE))?valor:null, 
                        (detalle.obtenerTipo().equals(DetalleTransaccion.TIPO_HABER))?valor:null,
                        (saldo < 0)?saldo * -1:saldo
                    });
                }
            }
        }
        lblSaldo.setText((saldo < 0)?"Acreedor":(saldo > 0)?"Deudor":"Mixto");
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTipoSaldo = new javax.swing.JLabel();
        lblSaldo = new javax.swing.JLabel();
        jspMayorizacion = new javax.swing.JScrollPane();
        jtMayorizacion = new javax.swing.JTable();
        btnExportar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Mayorización - ");

        lblTipoSaldo.setFont(new java.awt.Font("Noto Sans", 1, 12)); // NOI18N
        lblTipoSaldo.setText("Tipo de saldo:");

        lblSaldo.setText("Tipo de saldo");

        jtMayorizacion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "N° Trans.", "Debe", "Haber", "Saldo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Double.class, java.lang.Double.class, java.lang.Double.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspMayorizacion.setViewportView(jtMayorizacion);

        btnExportar.setText("Exportar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExportar))
                    .addComponent(jspMayorizacion, javax.swing.GroupLayout.DEFAULT_SIZE, 424, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTipoSaldo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblSaldo)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblTipoSaldo)
                    .addComponent(lblSaldo))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jspMayorizacion, javax.swing.GroupLayout.DEFAULT_SIZE, 254, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExportar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportar;
    private javax.swing.JScrollPane jspMayorizacion;
    private javax.swing.JTable jtMayorizacion;
    private javax.swing.JLabel lblSaldo;
    private javax.swing.JLabel lblTipoSaldo;
    // End of variables declaration//GEN-END:variables
}
