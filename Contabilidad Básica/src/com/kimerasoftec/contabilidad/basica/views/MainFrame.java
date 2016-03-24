package com.kimerasoftec.contabilidad.basica.views;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;

public class MainFrame extends javax.swing.JFrame {
    private final CuentasFrame cuentasFrame;
    private final TransaccionesFrame transaccionesFrame;
    private final LibroDiarioFrame libroDiarioFrame;
    private final BalanceSaldosFrame mayorizacionFrame;
    private final ConfiguracionFrame configuracionFrame;
    private final BGERFrame bgerFrame;
    public MainFrame() {
        initComponents();
        cuentasFrame = new CuentasFrame();
        transaccionesFrame = new TransaccionesFrame();
        libroDiarioFrame = new LibroDiarioFrame();
        mayorizacionFrame = new BalanceSaldosFrame();
        configuracionFrame = new ConfiguracionFrame();
        bgerFrame = new BGERFrame();
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdpMain = new javax.swing.JDesktopPane();
        jmbMain = new javax.swing.JMenuBar();
        jmnArchivo = new javax.swing.JMenu();
        jmiSalir = new javax.swing.JMenuItem();
        jmnDatos = new javax.swing.JMenu();
        jmiCuentas = new javax.swing.JMenuItem();
        jMenuItem1 = new javax.swing.JMenuItem();
        jsConfiguracion = new javax.swing.JPopupMenu.Separator();
        jmnConfiguracion = new javax.swing.JMenuItem();
        jmnGenerar = new javax.swing.JMenu();
        jmnLibroDiario = new javax.swing.JMenuItem();
        jmnBalanceSaldos = new javax.swing.JMenuItem();
        jmnBGER = new javax.swing.JMenuItem();
        jmnAyuda = new javax.swing.JMenu();
        jmiAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contabilidad Básica - Por Andrés León Doylet");
        setExtendedState(MAXIMIZED_BOTH);

        jmnArchivo.setMnemonic('A');
        jmnArchivo.setText("Archivo");

        jmiSalir.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiSalir.setMnemonic('a');
        jmiSalir.setText("Salir");
        jmiSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiSalirActionPerformed(evt);
            }
        });
        jmnArchivo.add(jmiSalir);

        jmbMain.add(jmnArchivo);

        jmnDatos.setMnemonic('o');
        jmnDatos.setText("Datos");

        jmiCuentas.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_C, java.awt.event.InputEvent.ALT_MASK | java.awt.event.InputEvent.CTRL_MASK));
        jmiCuentas.setMnemonic('e');
        jmiCuentas.setText("Cuentas");
        jmiCuentas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiCuentasActionPerformed(evt);
            }
        });
        jmnDatos.add(jmiCuentas);

        jMenuItem1.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_T, java.awt.event.InputEvent.CTRL_MASK));
        jMenuItem1.setMnemonic('a');
        jMenuItem1.setText("Transacciones");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jmnDatos.add(jMenuItem1);
        jmnDatos.add(jsConfiguracion);

        jmnConfiguracion.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_S, java.awt.event.InputEvent.CTRL_MASK));
        jmnConfiguracion.setText("Configuración");
        jmnConfiguracion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnConfiguracionActionPerformed(evt);
            }
        });
        jmnDatos.add(jmnConfiguracion);

        jmbMain.add(jmnDatos);

        jmnGenerar.setMnemonic('e');
        jmnGenerar.setText("Generar");

        jmnLibroDiario.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_L, java.awt.event.InputEvent.CTRL_MASK));
        jmnLibroDiario.setMnemonic('i');
        jmnLibroDiario.setText("Libro Diario");
        jmnLibroDiario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnLibroDiarioActionPerformed(evt);
            }
        });
        jmnGenerar.add(jmnLibroDiario);

        jmnBalanceSaldos.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_B, java.awt.event.InputEvent.CTRL_MASK));
        jmnBalanceSaldos.setMnemonic('a');
        jmnBalanceSaldos.setText("Balance de Saldos");
        jmnBalanceSaldos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnBalanceSaldosActionPerformed(evt);
            }
        });
        jmnGenerar.add(jmnBalanceSaldos);

        jmnBGER.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_R, java.awt.event.InputEvent.CTRL_MASK));
        jmnBGER.setText("Estado de Resultados y Balance General");
        jmnBGER.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmnBGERActionPerformed(evt);
            }
        });
        jmnGenerar.add(jmnBGER);

        jmbMain.add(jmnGenerar);

        jmnAyuda.setMnemonic('u');
        jmnAyuda.setText("Ayuda");

        jmiAcercaDe.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_Y, java.awt.event.InputEvent.CTRL_MASK));
        jmiAcercaDe.setMnemonic('e');
        jmiAcercaDe.setText("Acerca de...");
        jmiAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiAcercaDeActionPerformed(evt);
            }
        });
        jmnAyuda.add(jmiAcercaDe);

        jmbMain.add(jmnAyuda);

        setJMenuBar(jmbMain);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpMain, javax.swing.GroupLayout.DEFAULT_SIZE, 589, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpMain, javax.swing.GroupLayout.DEFAULT_SIZE, 311, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmiCuentasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiCuentasActionPerformed
        mostrarFrameHijo(cuentasFrame);
    }//GEN-LAST:event_jmiCuentasActionPerformed

    private void jmiSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiSalirActionPerformed
        System.exit(0);
    }//GEN-LAST:event_jmiSalirActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        mostrarFrameHijo(transaccionesFrame);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void jmnLibroDiarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnLibroDiarioActionPerformed
        mostrarFrameHijo(libroDiarioFrame);
    }//GEN-LAST:event_jmnLibroDiarioActionPerformed

    private void jmnBalanceSaldosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnBalanceSaldosActionPerformed
        mostrarFrameHijo(mayorizacionFrame);
    }//GEN-LAST:event_jmnBalanceSaldosActionPerformed

    private void jmiAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiAcercaDeActionPerformed
        JOptionPane.showMessageDialog(this, "Versión 1.0 - Desarrollada por Andrés León Doylet", 
                "Acerca de Contabilidad Básica", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_jmiAcercaDeActionPerformed

    private void jmnConfiguracionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnConfiguracionActionPerformed
        mostrarFrameHijo(configuracionFrame);
    }//GEN-LAST:event_jmnConfiguracionActionPerformed

    private void jmnBGERActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmnBGERActionPerformed
        mostrarFrameHijo(bgerFrame);
    }//GEN-LAST:event_jmnBGERActionPerformed

    private void mostrarFrameHijo(JInternalFrame frame){
        if (!frame.isVisible()){
            jdpMain.add(frame);
            int x = (jdpMain.getWidth() - frame.getWidth()) / 2;
            int y = (jdpMain.getHeight() - frame.getHeight()) / 2;
            frame.setLocation(x, y);
            frame.show();
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JDesktopPane jdpMain;
    private javax.swing.JMenuBar jmbMain;
    private javax.swing.JMenuItem jmiAcercaDe;
    private javax.swing.JMenuItem jmiCuentas;
    private javax.swing.JMenuItem jmiSalir;
    private javax.swing.JMenu jmnArchivo;
    private javax.swing.JMenu jmnAyuda;
    private javax.swing.JMenuItem jmnBGER;
    private javax.swing.JMenuItem jmnBalanceSaldos;
    private javax.swing.JMenuItem jmnConfiguracion;
    private javax.swing.JMenu jmnDatos;
    private javax.swing.JMenu jmnGenerar;
    private javax.swing.JMenuItem jmnLibroDiario;
    private javax.swing.JPopupMenu.Separator jsConfiguracion;
    // End of variables declaration//GEN-END:variables
}
