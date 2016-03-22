package com.kimerasoftec.contabilidad.basica.models;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
public class Transaccion implements Serializable {
    private static final long serialVersionUID = 1L;
    private final int codigo;
    private Date fecha;
    private String glosa;
    private final List<DetalleTransaccion> detalle;
    public Transaccion(int codigo, Date fecha, String glosa)
    {
        this.codigo = codigo;
        this.fecha = fecha;
        this.glosa = glosa;
        this.detalle = new ArrayList();
    }
    public int obtenerCodigo() {
        return codigo;
    }
    public Date obtenerFecha() {
        return fecha;
    }
    public String obtenerGlosa() {
        return glosa;
    }
    public List<DetalleTransaccion> obtenerDetalle() {
        return detalle;
    }
    public void cambiarFecha(Date fecha){
        this.fecha = fecha;
    }
    public void cambiarGlosa(String glosa){
        this.glosa = glosa;
    }
}
