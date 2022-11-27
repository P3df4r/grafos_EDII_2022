package com.grafos.grafo;

import java.util.List;

import com.grafos.interfaces.IDirecionado;
import com.grafos.interfaces.INaoDirecionado;

public class GrafoListaAdjacenciasDirecionado extends Grafo implements IDirecionado {

	public GrafoListaAdjacenciasDirecionado(int quantidadeVertices) {
		this.setQuantidadeVertices(quantidadeVertices);
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
	public void inserirAresta(Aresta aresta) throws Exception {
		this.adicionaAdjacenteAoVertice(aresta);
		
		List<Aresta> arestasAtualizadas = this.getArestas();
		arestasAtualizadas.add(aresta);
		this.setArestas(arestasAtualizadas);
	}

	@Override
	public void inserirArestas(List<Aresta> arestas) throws Exception {
		this.adicionaAdjacenteAoVertice(arestas);
		
		List<Aresta> arestasAtualizadas = this.getArestas();
		arestasAtualizadas.addAll(arestas);
		this.setArestas(arestasAtualizadas);
	}

	@Override
	public void removerAresta(Aresta aresta) throws Exception {
		if (this.existeAresta(aresta)) {
			List<Aresta> novasArestas = this.getArestas();
			novasArestas.remove(aresta);
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
		List<Vertice> verticesNoGrafo = this.getVertices();
		
		for (int indexVertice = 0; indexVertice < verticesNoGrafo.size(); indexVertice++) {

			System.out.print(verticesNoGrafo.get(indexVertice).getEtiqueta() + ": ");
			
			List<Vertice> verticesAdjacentes = verticesNoGrafo.get(indexVertice).getAdjacencias();
			
			for (int indexAdjacente = 0; indexAdjacente < verticesAdjacentes.size(); indexAdjacente++)
	            System.out.print(verticesAdjacentes.get(indexAdjacente).getEtiqueta() + " ");
	        
	        System.out.println();
	    }
	}

	@Override
	public void imprimirQuantidadeVerticesEArestas() {
		System.out.println("Número de vétices: " + this.getVertices().size() + 
				"\nNúmero de arestas: " + this.getArestas().size());
	}

	@Override
	public String imprimirGrauEntradaSaidaDoVertice(Vertice vertice) {
		// TODO Auto-generated method stub
		return null;
	}
	
	private boolean existeVerticeNoGrafo(Vertice vertice) {
		return this.getVertices().contains(vertice);
	}

	private void adicionaAdjacenteAoVertice(List<Aresta> arestas) throws Exception {
		for (Aresta aresta : arestas) {
			this.adicionarAdjacente(aresta);
		}
	}

	private void adicionaAdjacenteAoVertice(Aresta aresta) throws Exception {
		this.adicionarAdjacente(aresta);
	}
	
	private void adicionarAdjacente(Aresta aresta) throws Exception {
		Vertice origem = aresta.getOrigem();
		Vertice destino = aresta.getDestino();
		
		if(!this.existeVerticeNoGrafo(origem) || !this.existeVerticeNoGrafo(destino))
			throw new Exception("Vértice não existe no grafo.");
		
		List<Vertice> listaVerticesAtualizada = this.getVertices();
		
		int indexOrigem = listaVerticesAtualizada .indexOf(origem);
		int indexDestino = listaVerticesAtualizada .indexOf(destino);
		
		// Adiciona um vertice como adjacente do outro
		origem.setAdjacencia(destino);
		destino.setAdjacencia(origem);
		
		listaVerticesAtualizada.set(indexOrigem, origem);
		listaVerticesAtualizada.set(indexDestino, destino);
		
		this.setVertices(listaVerticesAtualizada);
	}
	
}
