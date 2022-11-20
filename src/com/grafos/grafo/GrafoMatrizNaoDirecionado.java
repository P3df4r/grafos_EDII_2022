package com.grafos.grafo;

import java.util.List;

import com.grafos.interfaces.INaoDirecionado;

public class GrafoMatrizNaoDirecionado extends Grafo implements INaoDirecionado{
	private boolean[][] matriz; 
	
	public GrafoMatrizNaoDirecionado(int quantidadeVertices) {
		setQuantidadeVertices(quantidadeVertices);
		this.matriz = new boolean[quantidadeVertices][quantidadeVertices];
	}
	
	@Override
	public void inserirVertice(Vertice vertice) {
		List<Vertice> verticesAtualizado = this.getVertices();
		verticesAtualizado.add(vertice);
		this.setVertices(verticesAtualizado);
	}

	@Override
	public void inserirVertices(List<Vertice> vertices) {
		this.setVertices(vertices);
	}

	@Override
	public void inserirAresta(Aresta aresta) {
		List<Aresta> arestasAtualizadas = this.getArestas();
		arestasAtualizadas.add(aresta);
		this.setArestas(arestasAtualizadas);
	}

	@Override
	public void inserirArestas(List<Aresta> arestas) {
		List<Aresta> arestasAtualizadas = this.getArestas();
		arestasAtualizadas.addAll(arestas);
		this.setArestas(arestasAtualizadas);
	}

	@Override
	public void removerAresta(Aresta aresta) throws Exception {
		if (this.existeAresta(aresta)) {
			List<Aresta> novasArestas = this.getArestas();
			novasArestas.remove(novasArestas);
			this.setArestas(novasArestas);
		} else {
			throw new Exception("Não é possível remover aresta que não existe no grafo.");
		}
	}

	@Override
	public boolean existeAresta(Aresta aresta) {
		return this.getArestas().contains(aresta);
	}

	@Override
	public void imprimirGrafo() {
		// Imprime valores da matriz
		for (int linha = 0; linha < this.matriz.length; linha++) {
	        for (int coluna = 0; coluna < this.matriz[linha].length; coluna++) {
	            System.out.print(this.matriz[linha][coluna] + " ");
	        }
	        
	        System.out.println();
	    }
	}

	@Override
	public void imprimirQuantidadeVerticesEArestas() {
		System.out.println("Número de vétices: " + this.getVertices().size() + 
				"\nNúmero de arestas: " + this.getArestas().size());
	}

	@Override
	public int imprimirGrauDoVertice(Vertice vertice) {
		return vertice.getAdjacencias().size();
	}

}
