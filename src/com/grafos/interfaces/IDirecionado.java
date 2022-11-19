package com.grafos.interfaces;

import com.grafos.grafo.Vertice;

interface IDirecionado extends IOperacoesBasicas {
	public abstract String imprimirGrauEntradaSaidaDoVertice(Vertice vertice);
}
