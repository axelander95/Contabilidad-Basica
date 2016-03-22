package com.kimerasoftec.contabilidad.basica.models;
import java.io.Serializable;
public class Cuenta implements Serializable {
    private static final long serialVersionUID = 1L;
    private int codigoPadre;
    private final int codigo;
    private String descripcion;
    private boolean negatividad;
    public Cuenta(int codigo, int codigoPadre, String descripcion, boolean negatividad) 
    {
        this.codigo = codigo;
        this.codigoPadre = codigoPadre;
        this.descripcion = descripcion;
        this.negatividad = negatividad;
    }
    public int obtenerCodigo()
    {
        return codigo;
    }
    public int obtenerCodigoPadre()
    {
        return codigoPadre;
    }
    public String obtenerDescripcion() 
    {
        return descripcion;
    }
    public boolean obtenerNegatividad()
    {
        return negatividad;
    }
    public void cambiarCodigoPadre(int codigoPadre)
    {
        this.codigoPadre = codigoPadre;
    }
    public void cambiarDescripcion(String descripcion)
    {
        this.descripcion = descripcion;
    }
    public void cambiarNegatividad(boolean negatividad)
    {
        this.negatividad = negatividad;
    }
    @Override
    public String toString() {
        return descripcion;
    }
}
