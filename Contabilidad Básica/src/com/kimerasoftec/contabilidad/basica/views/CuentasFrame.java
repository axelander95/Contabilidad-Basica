package com.kimerasoftec.contabilidad.basica.views;
import com.kimerasoftec.contabilidad.basica.controllers.CuentaController;
import javax.swing.JOptionPane;
import com.kimerasoftec.contabilidad.basica.controllers.ArchivoController;
import com.kimerasoftec.contabilidad.basica.models.Cuenta;
import java.util.List;
import javax.swing.SwingUtilities;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;
public class CuentasFrame extends javax.swing.JInternalFrame {
    private int codigoCuentaActual;
    private int codigoPadreActual;
    public CuentasFrame() {
        initComponents();
        codigoCuentaActual = 0;
        codigoPadreActual = 0;
        cargarListaCuentas();
        cambiarEstadosPopUp(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jpmCuentas = new javax.swing.JPopupMenu();
        jmiNueva = new javax.swing.JMenuItem();
        jmiModificar = new javax.swing.JMenuItem();
        jmiEliminar = new javax.swing.JMenuItem();
        jspCuentas = new javax.swing.JScrollPane();
        jtCuentas = new javax.swing.JTree();
        lblDescripcion = new javax.swing.JLabel();
        txtDescripcion = new javax.swing.JTextField();
        lblDescripcion1 = new javax.swing.JLabel();
        txtCuentaPadre = new javax.swing.JTextField();
        btnBuscarCuenta = new javax.swing.JButton();
        chkNegatividad = new javax.swing.JCheckBox();
        btnCancelar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();

        jpmCuentas.addPopupMenuListener(new javax.swing.event.PopupMenuListener() {
            public void popupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {
                jpmCuentasPopupMenuWillBecomeVisible(evt);
            }
            public void popupMenuWillBecomeInvisible(javax.swing.event.PopupMenuEvent evt) {
            }
            public void popupMenuCanceled(javax.swing.event.PopupMenuEvent evt) {
            }
        });

        jmiNueva.setText("Nueva cuenta");
        jmiNueva.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNuevaActionPerformed(evt);
            }
        });
        jpmCuentas.add(jmiNueva);

        jmiModificar.setText("Modificar");
        jmiModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiModificarActionPerformed(evt);
            }
        });
        jpmCuentas.add(jmiModificar);

        jmiEliminar.setText("Eliminar");
        jmiEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiEliminarActionPerformed(evt);
            }
        });
        jpmCuentas.add(jmiEliminar);

        setClosable(true);
        setIconifiable(true);

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("Cuentas");
        jtCuentas.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        jtCuentas.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jtCuentasMousePressed(evt);
            }
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtCuentasMouseClicked(evt);
            }
        });
        jspCuentas.setViewportView(jtCuentas);

        lblDescripcion.setText("Descripción");

        txtDescripcion.setText("Descripción de la cuenta");

        lblDescripcion1.setText("Padre");

        txtCuentaPadre.setEditable(false);
        txtCuentaPadre.setText("No ha seleccionado una cuenta padre");

        btnBuscarCuenta.setText("...");
        btnBuscarCuenta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarCuentaActionPerformed(evt);
            }
        });

        chkNegatividad.setMnemonic('o');
        chkNegatividad.setText("Posee negatividad");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnGuardar.setText("Guardar");
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblDescripcion1)
                            .addComponent(lblDescripcion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDescripcion)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtCuentaPadre, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnBuscarCuenta, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(chkNegatividad)
                                .addGap(0, 0, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnGuardar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnCancelar)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblDescripcion))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblDescripcion1)
                            .addComponent(txtCuentaPadre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnBuscarCuenta, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(chkNegatividad)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCancelar)
                            .addComponent(btnGuardar))
                        .addGap(156, 156, 156))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jspCuentas, javax.swing.GroupLayout.PREFERRED_SIZE, 269, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarCuentaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarCuentaActionPerformed

        BusquedaDialog busquedaDialog = new BusquedaDialog(null, true, 
                codigoCuentaActual);
        busquedaDialog.setLocation(getLocation());
        busquedaDialog.setVisible(true);
        Cuenta cuenta = busquedaDialog.obtenerCuentaSeleccionada();
        if (cuenta != null){
            codigoPadreActual = cuenta.obtenerCodigo();
            txtCuentaPadre.setText(cuenta.obtenerDescripcion());
        }
    }//GEN-LAST:event_btnBuscarCuentaActionPerformed

    private void guardarCuentas() {
        try {
                ArchivoController.guardarDatos(CuentaController.cuentas, CuentaController.NOMBRE_DE_ARCHIVO);
            }
            catch (Exception ex){
                JOptionPane.showMessageDialog(this, "Hubo un error al momento de ejecutar la operación.", 
                    "Mensaje del Sistema", JOptionPane.WARNING_MESSAGE);
            }
        finally {
            JOptionPane.showMessageDialog(this, "Los cambios fueron realizados con éxito.", 
                    "Mensaje del Sistema", JOptionPane.INFORMATION_MESSAGE);
            cargarListaCuentas();
            restablecer();
        }
    }
    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        if (formularioValido()){
            if (codigoCuentaActual == 0)
                CuentaController.agregar(codigoPadreActual, txtDescripcion.getText(), 
                        chkNegatividad.isSelected());
            else
                CuentaController.modificar(codigoCuentaActual, codigoPadreActual, 
                        txtDescripcion.getText(), chkNegatividad.isSelected());
            
            guardarCuentas();
        }
        else
            JOptionPane.showMessageDialog(this, "El campo de descripción no puede estar vacío.", 
                    "Mensaje del Sistema", JOptionPane.WARNING_MESSAGE);
    }//GEN-LAST:event_btnGuardarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        restablecer();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void jpmCuentasPopupMenuWillBecomeVisible(javax.swing.event.PopupMenuEvent evt) {//GEN-FIRST:event_jpmCuentasPopupMenuWillBecomeVisible

        DefaultMutableTreeNode nodo = (DefaultMutableTreeNode) jtCuentas.getLastSelectedPathComponent();
        if (nodo != null){
            if (!nodo.isRoot())
                cambiarEstadosPopUp(true);
            else
                cambiarEstadosPopUp(false);
        }
    }//GEN-LAST:event_jpmCuentasPopupMenuWillBecomeVisible

    private void jtCuentasMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCuentasMousePressed
        if ( SwingUtilities.isRightMouseButton ( evt ) )
            {
                TreePath path = jtCuentas.getPathForLocation ( evt.getX (), evt.getY () );
                jtCuentas.setSelectionPath(path);
                jpmCuentas.show(jtCuentas, evt.getX(), evt.getY());
            }
    }//GEN-LAST:event_jtCuentasMousePressed

    private void jmiNuevaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNuevaActionPerformed
        restablecer();
    }//GEN-LAST:event_jmiNuevaActionPerformed

    private void jmiModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiModificarActionPerformed
        modificar();
    }//GEN-LAST:event_jmiModificarActionPerformed

    private void jtCuentasMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtCuentasMouseClicked
        if (!jtCuentas.isSelectionEmpty() && evt.getClickCount() == 2)
            if (!((DefaultMutableTreeNode)jtCuentas.getLastSelectedPathComponent()).isRoot())
            modificar();
    }//GEN-LAST:event_jtCuentasMouseClicked

    private void jmiEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiEliminarActionPerformed
        int respuesta = JOptionPane.showConfirmDialog(this, "¿Estás seguro que deseas eliminar esta cuenta? "
                + "todas las transacciones relacionadas a la misma serán afectadas por esta acción.", 
                "Pregunta de seguridad", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (respuesta == JOptionPane.YES_OPTION){
            Cuenta nodo = (Cuenta) ((DefaultMutableTreeNode) jtCuentas.getLastSelectedPathComponent()).getUserObject();
            codigoCuentaActual = nodo.obtenerCodigo();
            CuentaController.eliminar(codigoCuentaActual);
            guardarCuentas();
        }
    }//GEN-LAST:event_jmiEliminarActionPerformed

    private void modificar() {
        Cuenta nodo = (Cuenta) ((DefaultMutableTreeNode) jtCuentas.getLastSelectedPathComponent()).getUserObject();
        codigoCuentaActual = nodo.obtenerCodigo();
        txtDescripcion.setText(nodo.obtenerDescripcion());
        codigoPadreActual = nodo.obtenerCodigoPadre();
        Cuenta cuentaPadre = CuentaController.obtenerCuentaPorCodigo(codigoPadreActual);
        txtCuentaPadre.setText((cuentaPadre == null)?"No ha seleccionado una cuenta padre":cuentaPadre.obtenerDescripcion());
        chkNegatividad.setSelected(nodo.obtenerNegatividad());
    }
    private void cambiarEstadosPopUp(boolean habilitar){
        jmiModificar.setEnabled(habilitar);
        jmiEliminar.setEnabled(habilitar);
    }
    private DefaultMutableTreeNode agregarHijos(int codigoPadre){
        Cuenta cuenta = CuentaController.obtenerCuentaPorCodigo(codigoPadre);
        DefaultMutableTreeNode padre = new DefaultMutableTreeNode(cuenta);
        List<Cuenta> hijos = CuentaController.obtenerListaDeHijos(codigoPadre);
        hijos.stream().forEach((hijo) -> {
            padre.add(agregarHijos(hijo.obtenerCodigo()));
        });
        return padre;
    }
    private void cargarListaCuentas() {
        List<Cuenta> cuentasPadres = CuentaController.obtenerCuentasSinPadre();
        DefaultMutableTreeNode rootNodo = (DefaultMutableTreeNode) jtCuentas.getModel().getRoot();
        rootNodo.removeAllChildren();
        cuentasPadres.stream().forEach((cuenta) -> {
            rootNodo.add(agregarHijos(cuenta.obtenerCodigo()));
        });
        jtCuentas.updateUI();
    }
    private void restablecer() {
        codigoCuentaActual = codigoPadreActual = 0;
        txtDescripcion.setText("Descripción de la cuenta");
        txtCuentaPadre.setText("No ha seleccionado una cuenta padre");
        chkNegatividad.setSelected(false);
    }
    private boolean formularioValido() {
        return !"".equals(txtDescripcion.getText());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscarCuenta;
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JCheckBox chkNegatividad;
    private javax.swing.JMenuItem jmiEliminar;
    private javax.swing.JMenuItem jmiModificar;
    private javax.swing.JMenuItem jmiNueva;
    private javax.swing.JPopupMenu jpmCuentas;
    private javax.swing.JScrollPane jspCuentas;
    private javax.swing.JTree jtCuentas;
    private javax.swing.JLabel lblDescripcion;
    private javax.swing.JLabel lblDescripcion1;
    private javax.swing.JTextField txtCuentaPadre;
    private javax.swing.JTextField txtDescripcion;
    // End of variables declaration//GEN-END:variables
}
