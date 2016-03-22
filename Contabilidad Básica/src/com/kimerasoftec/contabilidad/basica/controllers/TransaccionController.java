package com.kimerasoftec.contabilidad.basica.controllers;
import com.kimerasoftec.contabilidad.basica.models.Transaccion;
import com.kimerasoftec.contabilidad.basica.models.DetalleTransaccion;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
public class TransaccionController {
    public static List<Transaccion> transacciones;
    public static final String NOMBRE_DE_ARCHIVO = "transacciones.bin";
    public static Transaccion agregar(Date fecha, String glosa){
        Transaccion transaccion = new Transaccion(generarCodigo(), fecha, glosa);
        transacciones.add(transaccion);
        return transaccion;
    }
    public static Transaccion obtenerTransaccion(int codigoTransaccion) {
        for (Transaccion transaccion : transacciones) {
            if (transaccion.obtenerCodigo() == codigoTransaccion)
                return transaccion;
        }
        return null;
    }
    public static List<Transaccion> obtenerTransaccionesPorAño(int año) {
        List<Transaccion> transaccionesPorAño = new ArrayList();
        Calendar calendario = Calendar.getInstance();
        transacciones.stream().map((transaccion) -> {
            calendario.setTime(transaccion.obtenerFecha());
            return transaccion;
        }).filter((transaccion) -> (año == calendario.getWeekYear())).forEach((transaccion) -> {
            transaccionesPorAño.add(transaccion);
        });
        return transaccionesPorAño;
    }
    public static Transaccion obtenerTransaccion(Date fecha){
        for(Transaccion transaccion:transacciones)
            if (transaccion.obtenerFecha().equals(fecha))
                return transaccion;
        return null;
    }
    public static void eliminarDetalle(int codigoTransaccion){
        Transaccion transaccion = obtenerTransaccion(codigoTransaccion);
        transaccion.obtenerDetalle().clear();
    }
    private static int generarCodigo() {
        try
        {
            return transacciones.get(transacciones.size()-1).obtenerCodigo() + 1;
        }
        catch (Exception ex){
            return 1;
        }
    }
    public static void agregarDetalle(int codigoTransaccion, int codigoCuenta, String tipo, double valor){
        Transaccion transaccion = obtenerTransaccion(codigoTransaccion);
        if (transaccion!=null){
            List<DetalleTransaccion> detalle = transaccion.obtenerDetalle();
            DetalleTransaccion detalleTransaccion = new DetalleTransaccion(codigoTransaccion, codigoCuenta, 
            tipo, valor);
            detalle.add(detalleTransaccion);
        }
    }
    public static void inicializar() {
        try
        {
            transacciones = (List<Transaccion>) ArchivoController.obtenerDatos(NOMBRE_DE_ARCHIVO);
        }
        catch (IOException | ClassNotFoundException ex)
        {
            transacciones = new ArrayList();
        }
    }
}
