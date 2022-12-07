package com.grafos.programa;

import java.util.ArrayList;

import com.grafos.buscas.BuscaEmProfundidade;
import com.grafos.grafo.Aresta;
import com.grafos.grafo.GrafoListaAdjacenciasDirecionado;
import com.grafos.grafo.Vertice;

public class Main {
    public static void main(String[] args) throws Exception {
    	GrafoListaAdjacenciasDirecionado grafoListaDirecionado = new GrafoListaAdjacenciasDirecionado(7);
    	
    	// Vertices
    	Vertice _0 = new Vertice("0");
    	Vertice _1 = new Vertice("1");
    	Vertice _2 = new Vertice("2");
    	Vertice _3 = new Vertice("3");
    	Vertice _4 = new Vertice("4");
    	Vertice _5 = new Vertice("5");
    	Vertice _6 = new Vertice("6");
    	Vertice _7 = new Vertice("7");
    	Vertice _8 = new Vertice("8");
    	
    	// Arestas
    	Aresta _01 = new Aresta(_0, _1);
    	Aresta _03 = new Aresta(_0, _3);
    	Aresta _04 = new Aresta(_0, _4);
    	Aresta _60 = new Aresta(_1, _2);
    	Aresta _05 = new Aresta(_1, _3);
    	Aresta _14 = new Aresta(_1, _4);
    	Aresta _42 = new Aresta(_2, _4);
    	Aresta _15 = new Aresta(_3, _2);
    	Aresta _36 = new Aresta(_3, _6);
    	Aresta _13 = new Aresta(_4, _8);
    	Aresta _46 = new Aresta(_4, _6);
    	Aresta _52 = new Aresta(_5, _2);
    	Aresta _58 = new Aresta(_5, _8);
    	Aresta _57 = new Aresta(_5, _7);
    	Aresta _65 = new Aresta(_6, _5);
    	Aresta _67 = new Aresta(_6, _7);  	
    	Aresta _82 = new Aresta(_8, _2);
    	Aresta _87 = new Aresta(_8, _7);
    	
    	// Adicionando vértices
    	grafoListaDirecionado.inserirVertices(new ArrayList<Vertice>() {
    		{
    			add(_0);
    			add(_1);
    			add(_2);
    			add(_3);
    			add(_4);
    			add(_5);
    			add(_6);
    			add(_7);
    			add(_8);
    		}
    	});
    	
    	// Adicionando arestas
    	grafoListaDirecionado.inserirArestas(new ArrayList<Aresta>() {
    		{
    			add(_01);
    			add(_03);
    			add(_04);
    			add(_60);
    			add(_05);
    			add(_14);
    			add(_42);
    			add(_15);
    			add(_36);
    			add(_13);
    			add(_46);
    			add(_52);
    			add(_58);
    			add(_57);
		    	add(_65);
				add(_67);
				add(_82);
				add(_87); 			
    		}
    		
    	});
    	
    	
    	grafoListaDirecionado.imprimirGrafo();
    	
    	
//    	// Inicio das busca em profundidade
    	// BuscaEmProfundidade buscaEmProfundidade = new BuscaEmProfundidade(grafoListaDirecionado);
    	// buscaEmProfundidade.executar(_1);
    }
}