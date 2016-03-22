package com.kimerasoftec.contabilidad.basica;
import com.kimerasoftec.contabilidad.basica.views.MainFrame;
import com.kimerasoftec.contabilidad.basica.controllers.CuentaController;
import com.kimerasoftec.contabilidad.basica.controllers.TransaccionController;
import javax.swing.JOptionPane;
public class MainClass {
    public static void main(String[] args) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        try {
            CuentaController.inicializar();
            TransaccionController.inicializar();
        }
        catch(Exception ex){
            JOptionPane.showMessageDialog(null, "Error al momento de cargar algunos archivos requeridos "
                    + "por la aplicación, imposible continuar." + ex.getMessage(), "Error del Sistema", JOptionPane.ERROR_MESSAGE);
        }
        finally {
            MainFrame mainFrame = new MainFrame();
            mainFrame.setVisible(true);
        }
        
    }
}
