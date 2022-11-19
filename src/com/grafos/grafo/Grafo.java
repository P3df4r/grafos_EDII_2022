package com.grafos.grafo;

import java.util.List;

public abstract class Grafo {
	private List<Vertice> vertices;
	private List<Aresta> arestas;
	private int quantidadeVertices;

    public List<Vertice> getVertices() {
        return vertices;
    }

    public void setVertices(List<Vertice> vertices) {
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
