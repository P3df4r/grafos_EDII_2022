package com.grafos.grafo;

public class Aresta {
    private float peso;
    private Vertice origem;
    private Vertice destino;
    
	public float getPeso() {
		return peso;
	}
	
	public void setPeso(float peso) {
		this.peso = peso;
	}
	
	public Vertice getOrigem() {
		return origem;
	}
	
	public void setOrigem(Vertice origem) {
		this.origem = origem;
	}
	
	public Vertice getDestino() {
		return destino;
	}
	
	public void setDestino(Vertice destino) {
		this.destino = destino;
	}
    
}
