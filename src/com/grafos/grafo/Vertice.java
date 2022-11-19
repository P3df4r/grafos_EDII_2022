package com.grafos.grafo;

import java.util.List;

import com.grafos.enums.*;

public class Vertice {
    private String etiqueta;
    private Cores cor = Cores.BRANCO;
    private List<Vertice> adjacencias;

    public Vertice(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public String getEtiqueta() {
        return etiqueta;
    }

    public void setEtiqueta(String etiqueta) {
        this.etiqueta = etiqueta;
    }

    public Cores getCor() {
        return cor;
    }

    public void setCor(Cores cor) {
        this.cor = cor;
    }

    public List<Vertice> getAdjacencias() {
        return adjacencias;
    }

    public void setAdjacencias(List<Vertice> adjacencias) {
        this.adjacencias = adjacencias;
    }
}
