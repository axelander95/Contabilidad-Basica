package com.kimerasoftec.contabilidad.basica.models;
import java.io.Serializable;
public class DetalleTransaccion implements Serializable {
    private static final long serialVersionUID = 1L;
    private final int codigoTransaccion;
    private int codigoCuenta;
    private String tipo;
    private double valor;
    public static String TIPO_DEBE = "Debe";
    public static String TIPO_HABER = "Haber";
    public DetalleTransaccion(int codigoTransaccion, int codigoCuenta, String tipo, double valor) {
        this.codigoTransaccion = codigoTransaccion;
        this.codigoCuenta = codigoCuenta;
        this.tipo = tipo;
        this.valor = valor;
    }
    public int obtenerCodigoTransaccion() {
        return codigoTransaccion;
    }
    public int obtenerCodigoCuenta () {
        return codigoCuenta;
    }
    public String obtenerTipo() {
        return tipo;
    }
    public double obtenerValor() {
        return valor;
    }
    public void cambiarCodigoCuenta(int codigoCuenta) {
        this.codigoCuenta = codigoCuenta;
    }
    public void cambiarTipo(String tipo) {
        this.tipo = tipo;
    }
    public void cambiarValor(double valor) {
        this.valor = valor;
    }
}
