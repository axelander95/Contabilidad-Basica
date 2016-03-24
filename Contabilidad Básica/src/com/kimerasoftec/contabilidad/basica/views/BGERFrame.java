package com.kimerasoftec.contabilidad.basica.views;
public class BGERFrame extends javax.swing.JInternalFrame {
    public BGERFrame() {
        initComponents();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblAño = new javax.swing.JLabel();
        txtAño = new javax.swing.JFormattedTextField();
        btnGenerar = new javax.swing.JButton();
        jpnEstadoResultados = new javax.swing.JPanel();
        jspEstadoResultados = new javax.swing.JScrollPane();
        jtEstadoResultados = new javax.swing.JTable();
        jpnBalanceGeneral = new javax.swing.JPanel();
        jspBalanceGeneral = new javax.swing.JScrollPane();
        jtBalanceGeneral = new javax.swing.JTable();
        btnExportar = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setTitle("Estado de resultados y balance general");

        lblAño.setText("Año:");

        txtAño.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        btnGenerar.setText("Generar");
        btnGenerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGenerarActionPerformed(evt);
            }
        });

        jpnEstadoResultados.setBorder(javax.swing.BorderFactory.createTitledBorder("Estado de Resultados"));

        jtEstadoResultados.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cuenta", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jspEstadoResultados.setViewportView(jtEstadoResultados);

        javax.swing.GroupLayout jpnEstadoResultadosLayout = new javax.swing.GroupLayout(jpnEstadoResultados);
        jpnEstadoResultados.setLayout(jpnEstadoResultadosLayout);
        jpnEstadoResultadosLayout.setHorizontalGroup(
            jpnEstadoResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnEstadoResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspEstadoResultados, javax.swing.GroupLayout.DEFAULT_SIZE, 428, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnEstadoResultadosLayout.setVerticalGroup(
            jpnEstadoResultadosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnEstadoResultadosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspEstadoResultados, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addContainerGap())
        );

        jpnBalanceGeneral.setBorder(javax.swing.BorderFactory.createTitledBorder("Balance General"));

        jtBalanceGeneral.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cuenta", "Valor"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.Double.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        jspBalanceGeneral.setViewportView(jtBalanceGeneral);

        javax.swing.GroupLayout jpnBalanceGeneralLayout = new javax.swing.GroupLayout(jpnBalanceGeneral);
        jpnBalanceGeneral.setLayout(jpnBalanceGeneralLayout);
        jpnBalanceGeneralLayout.setHorizontalGroup(
            jpnBalanceGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnBalanceGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspBalanceGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
                .addContainerGap())
        );
        jpnBalanceGeneralLayout.setVerticalGroup(
            jpnBalanceGeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpnBalanceGeneralLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspBalanceGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, 413, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnExportar.setText("Exportar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jpnEstadoResultados, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpnBalanceGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblAño)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAño, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnGenerar)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnExportar)))
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
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jpnEstadoResultados, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jpnBalanceGeneral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnExportar)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGenerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGenerarActionPerformed

    }//GEN-LAST:event_btnGenerarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExportar;
    private javax.swing.JButton btnGenerar;
    private javax.swing.JPanel jpnBalanceGeneral;
    private javax.swing.JPanel jpnEstadoResultados;
    private javax.swing.JScrollPane jspBalanceGeneral;
    private javax.swing.JScrollPane jspEstadoResultados;
    private javax.swing.JTable jtBalanceGeneral;
    private javax.swing.JTable jtEstadoResultados;
    private javax.swing.JLabel lblAño;
    private javax.swing.JFormattedTextField txtAño;
    // End of variables declaration//GEN-END:variables
}
