package com.grafos.grafo;

import java.util.Arrays;
import java.util.List;

import com.grafos.interfaces.INaoDirecionado;

public class GrafoMatriz extends Grafo implements INaoDirecionado{
	private boolean[][] matriz; 
	
	public GrafoMatriz(int quantidadeVertices) {
		setQuantidadeVertices(quantidadeVertices);
		this.matriz = new boolean[quantidadeVertices][quantidadeVertices];
	}
	
	
	@Override
	public void inserirAresta(Aresta aresta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void inserirArestas(List<Aresta> arestas) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void removerAresta(Aresta aresta) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public boolean existeAresta(Vertice origem, Vertice destino) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public void imprimirGrafo() {
		for (int linha = 0; linha < this.matriz.length; linha++) {
	        for (int coluna = 0; coluna < this.matriz[linha].length; coluna++) {
	            System.out.print(this.matriz[linha][coluna] + " ");
	        }
	        
	        System.out.println();
	    }
	}

	@Override
	public String imprimirQuantidadeVerticesEArestas() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int imprimirGrauDoVertice(Vertice vertice) {
		// TODO Auto-generated method stub
		return 0;
	}

}
