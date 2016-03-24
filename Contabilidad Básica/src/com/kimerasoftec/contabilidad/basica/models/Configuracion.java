package com.kimerasoftec.contabilidad.basica.models;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class Configuracion implements Serializable {
    private static final long serialVersionUID = 1L;
    private boolean libroDiario, balanceSaldos, estadoResultados, balanceGeneral;
    private List<Integer> cuentasEstadoResultados, cuentasBalanceGeneral;
    public Configuracion() {
        libroDiario = balanceSaldos = estadoResultados = balanceGeneral = true;
        cuentasEstadoResultados = new ArrayList();
        cuentasBalanceGeneral = new ArrayList();
    }
    public boolean obtenerLibroDiario() {
        return libroDiario;
    }
    public boolean obtenerBalanceSaldos() {
        return balanceSaldos;
    }
    public boolean obtenerEstadoResultados(){
        return estadoResultados;
    }
    public boolean obtenerBalanceGeneral() {
        return balanceGeneral;
    }
    public List<Integer> obtenerCuentasEstadoResultados() {
        return cuentasEstadoResultados;
    }
    public List<Integer> obtenerCuentasBalanceGeneral() {
        return cuentasBalanceGeneral;
    }
    public void cambiarLibroDiario(boolean libroDiario){
        this.libroDiario = libroDiario;
    }
    public void cambiarBalanceSaldos(boolean balanceSaldos){
        this.balanceSaldos = balanceSaldos;
    }
    public void cambiarBalanceGeneral(boolean balanceGeneral){
        this.balanceGeneral = balanceGeneral;
    }
    public void cambiarEstadoResultados(boolean estadoResultados){
        this.estadoResultados = estadoResultados;
    }
    public void cambiarCuentasEstadoResultados(List<Integer> cuentasEstadoResultados){
        this.cuentasEstadoResultados = cuentasEstadoResultados;
    }
    public void cambiarCuentasBalanceGeneral(List<Integer> cuentasBalanceGeneral) {
        this.cuentasBalanceGeneral = cuentasBalanceGeneral;
    }
}
