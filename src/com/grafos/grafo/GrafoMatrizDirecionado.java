package com.grafos.grafo;

import java.util.List;

import com.grafos.interfaces.IDirecionado;

public class GrafoMatrizDirecionado extends Grafo implements IDirecionado{
	private float[][] matriz; 
	
	public GrafoMatrizDirecionado(int quantidadeVertices) {
		setQuantidadeVertices(quantidadeVertices);
		this.matriz = new float[quantidadeVertices][quantidadeVertices];
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
		Vertice origem = aresta.getOrigem();
		Vertice destino = aresta.getOrigem();
		float peso = aresta.getPeso();
		
		if(!this.existeVerticeNoGrafo(origem) || !this.existeVerticeNoGrafo(destino))
			throw new Exception("Não é possível criar uma aresta com vértice(s) não existe(m) no grafo.");
		
		this.adicionaAdjacenteAoVertice(aresta);

		List<Aresta> arestasAtualizadas = this.getArestas();
		arestasAtualizadas.add(aresta);
		this.setArestas(arestasAtualizadas);
		
		int indexOrigem = this.getVertices().indexOf(origem);
		int indexDestino = this.getVertices().indexOf(destino);
		
		matriz[indexOrigem][indexDestino] = peso;
		
	}

	@Override
	public void inserirArestas(List<Aresta> arestas) throws Exception {
		// Verifica existência dos vértices no grafo
		for (Aresta aresta : arestas) {
			Vertice origem = aresta.getOrigem();
			Vertice destino = aresta.getOrigem();
			
			if(!this.existeVerticeNoGrafo(origem) || !this.existeVerticeNoGrafo(destino))
				throw new Exception("Não é possível criar uma aresta com vértice(s) não existe(m) no grafo.");
		}
		
		this.adicionaAdjacenteAoVertice(arestas);
		
		List<Aresta> arestasAtualizadas = this.getArestas();
		arestasAtualizadas.addAll(arestas);
		this.setArestas(arestasAtualizadas);
		
		for (Aresta aresta : arestas) {
			Vertice origem = aresta.getOrigem();
			Vertice destino = aresta.getDestino();
			float peso = aresta.getPeso();
			
			int indexOrigem = this.getVertices().indexOf(origem);
			int indexDestino = this.getVertices().indexOf(destino);
			
			matriz[indexOrigem][indexDestino] = peso;
			
			
			
			// matriz[Integer.parseInt(origem.getEtiqueta())][Integer.parseInt(destino.getEtiqueta())] = peso;
		
			// System.out.println(Integer.parseInt(origem.getEtiqueta()) + "-" + Integer.parseInt(destino.getEtiqueta()));
		}
	}

	@Override
	public void removerAresta(Aresta aresta) throws Exception {
		if (!this.existeAresta(aresta))
			throw new Exception("Não é possível remover aresta que não existe no grafo.");
		
		Vertice origem = aresta.getOrigem();
		Vertice destino = aresta.getOrigem();
		float peso = aresta.getPeso();
		
		origem.removerAdjacencia(destino);
		destino.removerAdjacencia(origem);
		
		List<Aresta> novasArestas = this.getArestas();
		novasArestas.remove(aresta);
		this.setArestas(novasArestas);
		
		int indexOrigem = this.getVertices().indexOf(origem);
		int indexDestino = this.getVertices().indexOf(destino);
		
		matriz[indexOrigem][indexDestino] = peso;
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
	public void imprimirGrauEntradaSaidaDoVertice(Vertice vertice) {
		List<Vertice> verticesNoGrafo = this.getVertices();
		
		int grauSaida = vertice.getAdjacencias().size();
		int grauEntrada = vertice.getAdjacencias().size();
		
		for (Vertice verticeNoGrafo : verticesNoGrafo) {
			if(verticeNoGrafo.getAdjacencias().contains(vertice))
				grauEntrada++;
		}
		
		
		System.out.println("Grau de entrada: " + grauEntrada +  
				"\nGrau de saída: " + grauSaida);		
	}
	
	private boolean existeVerticeNoGrafo(Vertice vertice) {
		return this.getVertices().contains(vertice);
	}
	
	private void adicionaAdjacenteAoVertice(Aresta aresta) throws Exception {
		this.adicionarAdjacente(aresta);
	}
	
	private void adicionaAdjacenteAoVertice(List<Aresta> arestas) throws Exception {
		for (Aresta aresta : arestas)
			this.adicionarAdjacente(aresta);
	}
	
	private void adicionarAdjacente(Aresta aresta) throws Exception {
		Vertice origem = aresta.getOrigem();
		Vertice destino = aresta.getDestino();
		
		if(!this.existeVerticeNoGrafo(origem) || !this.existeVerticeNoGrafo(destino))
			throw new Exception("Vértice não existe no grafo.");
		
		List<Vertice> listaVerticesAtualizada = this.getVertices();
		
		int indexOrigem = listaVerticesAtualizada .indexOf(origem);
		
		// Adiciona o vértice de destino como adjacente do origem
		origem.setAdjacencia(destino);
		
		listaVerticesAtualizada.set(indexOrigem, origem);
		
		this.setVertices(listaVerticesAtualizada);
	}
}
