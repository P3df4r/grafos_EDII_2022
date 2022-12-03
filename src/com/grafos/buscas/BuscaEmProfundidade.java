package com.grafos.buscas;

import java.util.Stack;

import com.grafos.enums.Cores;
import com.grafos.grafo.Grafo;
import com.grafos.grafo.Vertice;

public class BuscaEmProfundidade {
	private Grafo grafo;
	
	public BuscaEmProfundidade(Grafo grafo) {
		this.grafo = grafo;
	}
	
	public void executar(Vertice vertice) {
		Stack<Vertice> pilhaDeExecucao = new Stack<Vertice>();
		pilhaDeExecucao.push(vertice);
		
		while(!pilhaDeExecucao.isEmpty()) {
			Vertice verticeAtual = pilhaDeExecucao.pop();

			// Continua apenas se o vertvértice não estiver sido visitado
			if(verticeAtual.getCor() == Cores.BRANCO) {
				// Vértice visitado
				verticeAtual.setCor(Cores.CINZA);
				
				System.out.println(vertice.getEtiqueta());
				
				verticeAtual.getAdjacencias().forEach(verticeAdjacente -> pilhaDeExecucao.push(verticeAdjacente));				
			}
		}
		
		// Certifica de que todos os vértices do grafos sejam analisados
		this.grafo.getVertices().forEach(vetice -> {
			if(vertice.getCor() == Cores.BRANCO)
				this.executar(vertice);
		});
	}
}
