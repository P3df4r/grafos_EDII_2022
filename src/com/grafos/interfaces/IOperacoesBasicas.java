package com.grafos.interfaces;

import java.util.List;

import com.grafos.grafo.Aresta;
import com.grafos.grafo.Vertice;

public interface IOperacoesBasicas {
	public abstract void inserirVertice(Vertice vertice);
	public abstract void inserirVertices(List<Vertice> vertices);
	public abstract void inserirAresta(Aresta aresta) throws Exception;
	public abstract void inserirArestas(List<Aresta> arestas) throws Exception;
	public abstract void removerAresta(Aresta aresta) throws Exception;
	public abstract boolean existeAresta(Aresta aresta);
	public abstract void imprimirGrafo();
	public abstract void imprimirQuantidadeVerticesEArestas();
}
