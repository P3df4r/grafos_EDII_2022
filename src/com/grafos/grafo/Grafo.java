package com.grafos.grafo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.grafos.helpers.VerticeComparadorCustomizado;

public abstract class Grafo {
	private List<Vertice> vertices = new ArrayList<Vertice>();
	private List<Aresta> arestas = new ArrayList<Aresta>();
	private int quantidadeVertices;

    public List<Vertice> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertice> vertices) {
    	Collections.sort(vertices, new VerticeComparadorCustomizado());
    	this.vertices = vertices;
    }

    public List<Aresta> getArestas() {
		return arestas;
	}

	public void setArestas(List<Aresta> arestas) {
		this.arestas = arestas;
	}

	public int getQuantidadeVertices() {
		return quantidadeVertices;
	}

	public void setQuantidadeVertices(int quantidadeVertices) {
		this.quantidadeVertices = quantidadeVertices;
	}
}
