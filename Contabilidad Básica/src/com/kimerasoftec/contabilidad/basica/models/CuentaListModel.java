package com.kimerasoftec.contabilidad.basica.models;

import java.util.ArrayList;
import java.util.List;
import javax.swing.AbstractListModel;

public class CuentaListModel extends AbstractListModel {
    private final List<Cuenta> listaCuentas;
    public CuentaListModel(List<Cuenta> listaCuentas) {
        this.listaCuentas = listaCuentas;
    }
    @Override
    public int getSize() {
        return listaCuentas.size();
    }

    @Override
    public Cuenta getElementAt(int index) {
        return listaCuentas.get(index);
    }
    
}
