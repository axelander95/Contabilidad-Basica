package com.kimerasoftec.contabilidad.basica.controllers;
import java.util.List;
import java.util.ArrayList;
import com.kimerasoftec.contabilidad.basica.models.Cuenta;
import java.io.IOException;
import java.util.Iterator;
public class CuentaController {
    public static List<Cuenta> cuentas;
    public static final String NOMBRE_DE_ARCHIVO = "cuentas.bin";
    public static void agregar(int codigoPadre, String descripcion, boolean negatividad) 
    {
        cuentas.add(new Cuenta(generarCodigo(), codigoPadre, descripcion, negatividad));
    }
    public static List<Cuenta> obtenerCuentasNoPadres() {
        List<Cuenta> cuentasNoPadres = new ArrayList();
        cuentas.stream().filter((cuenta) -> (!esCuentaPadre(cuenta.obtenerCodigo()))).forEach((cuenta) -> {
            cuentasNoPadres.add(cuenta);
        });
        return cuentasNoPadres;
    }
    public static boolean esCuentaPadre(int codigo){
        return cuentas.stream().anyMatch((cuenta) -> (cuenta.obtenerCodigoPadre() == codigo));
    }
    public static void modificar(int codigo, int codigoPadre, String descripcion, boolean negatividad){
        Cuenta cuenta = obtenerCuentaPorCodigo(codigo);
        cuenta.cambiarCodigoPadre(codigoPadre);
        cuenta.cambiarDescripcion(descripcion);
        cuenta.cambiarNegatividad(negatividad);
    }
    public static List<Cuenta> obtenerCuentasSinPadre() {
        List<Cuenta> cuentasSinPadre = new ArrayList();
        cuentas.stream().filter((cuenta) -> (cuenta.obtenerCodigoPadre() == 0)).forEach((cuenta) -> {
            cuentasSinPadre.add(cuenta);
        });
        return cuentasSinPadre;
    }
    public static List<Cuenta> obtenerListaDeHijos(int codigoPadre) {
        List<Cuenta> listaHijos = new ArrayList();
        cuentas.stream().filter((cuenta) -> (cuenta.obtenerCodigoPadre() == codigoPadre)).forEach((cuenta) -> {
            listaHijos.add(cuenta);
        });
        return listaHijos;
    }
    public static Cuenta obtenerCuentaPorCodigo(int codigo){
        for(Cuenta cuenta:cuentas)
            if (cuenta.obtenerCodigo() == codigo)
                return cuenta;
        return null;
    }
    public static List<Cuenta> obtenerCuentasPadresPosibles(int codigo){
        List<Cuenta> cuentasPadres = new ArrayList();
        cuentas.stream().filter((cuenta) -> (cuenta.obtenerCodigo() != codigo)).forEach((cuenta) -> {
            cuentasPadres.add(cuenta);
        });
        return cuentasPadres;
    }
    public static List<Cuenta> buscarCuentasPadres(int codigo, String consulta){
        List<Cuenta> cuentasPadres = new ArrayList();
        cuentas.stream().filter((cuenta) -> (consulta.length() <= cuenta.obtenerDescripcion().length() 
                && cuenta.obtenerCodigo() != codigo)).filter((cuenta) -> 
                        (cuenta.obtenerDescripcion().contains(consulta))).forEach((cuenta) -> {
            cuentasPadres.add(cuenta);
        });
        return cuentasPadres;
    }
    public static List<Cuenta> buscarCuentas(String consulta){
        List<Cuenta> cuentasConsultadas = new ArrayList();
        cuentas.stream().filter((cuenta) -> (consulta.length() <= cuenta.obtenerDescripcion().length()
                )).filter((cuenta) -> 
                        (cuenta.obtenerDescripcion().contains(consulta))).forEach((cuenta) -> {
            cuentasConsultadas.add(cuenta);
        });
        return cuentasConsultadas;
    }
    public static void eliminar(int codigo){
        cuentas.stream().filter((cuenta) -> (cuenta.obtenerCodigoPadre() == codigo)).forEach((cuenta) -> {
            cuenta.cambiarCodigoPadre(0);
        });
        for (Iterator<Cuenta> it = cuentas.iterator(); it.hasNext();) {
            Cuenta cuenta = it.next();
            if (cuenta.obtenerCodigo() == codigo)
            {
                cuentas.remove(cuenta);
                return;
            }
        }
    }
    private static int generarCodigo() {
        try
        {
            return cuentas.get(cuentas.size()-1).obtenerCodigo() + 1;
        }
        catch (Exception ex){
            return 1;
        }
    }
    public static void inicializar()
    {
        try
        {
            cuentas = (List<Cuenta>) ArchivoController.obtenerDatos(NOMBRE_DE_ARCHIVO);
        }
        catch (IOException | ClassNotFoundException ex)
        {
            cuentas = new ArrayList();
        }
    }
}
