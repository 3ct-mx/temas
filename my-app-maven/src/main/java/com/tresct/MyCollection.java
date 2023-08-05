package com.tresct;

import java.util.ArrayList;
import java.util.List;

public class MyCollection<Tipo> {
    ArrayList<Tipo> lista;

    public MyCollection() {
        this.lista = new ArrayList<>();
    }

    public void add(Tipo argumento){
        lista.add(argumento);
    }

    @Override
    public String toString() {
        return "MyCollection{" +
                "lista=" + lista +
                '}';
    }
}
