package com.grafos.interfaces;

import java.util.List;

import com.grafos.grafo.Aresta;
import com.grafos.grafo.Vertice;

public interface IOperacoesBasicas {
	public abstract void inserirAresta(Aresta aresta);
	public abstract void inserirArestas(List<Aresta> arestas);
	public abstract void removerAresta(Aresta aresta);
	public abstract boolean existeAresta(Vertice origem, Vertice destino);
	public abstract void imprimirGrafo();
	public abstract String imprimirQuantidadeVerticesEArestas();
}
