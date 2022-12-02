package com.grafos.grafo;

import java.util.List;

import com.grafos.interfaces.IDirecionado;
import com.grafos.interfaces.INaoDirecionado;

public class GrafoListaAdjacenciasNaoDirecionado extends Grafo implements INaoDirecionado {

	public GrafoListaAdjacenciasNaoDirecionado(int quantidadeVertices) {
		this.setQuantidadeVertices(quantidadeVertices);
	}

	@Override
	public void inserirVertice(Vertice vertice) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inserirVertices(List<Vertice> vertices) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inserirAresta(Aresta aresta) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inserirArestas(List<Aresta> arestas) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerAresta(Aresta aresta) throws Exception {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean existeAresta(Aresta aresta) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void imprimirGrafo() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void imprimirQuantidadeVerticesEArestas() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public int imprimirGrauDoVertice(Vertice vertice) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	
}
