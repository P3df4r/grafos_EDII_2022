package com.grafos.programa;

import java.util.ArrayList;

import com.grafos.grafo.Aresta;
import com.grafos.grafo.Grafo;
import com.grafos.grafo.GrafoListaAdjacenciasDirecionado;
import com.grafos.grafo.Vertice;

public class Main {
    public static void main(String[] args) {
    	Grafo grafoListaDirecionado = new GrafoListaAdjacenciasDirecionado(7);
    	
    	// Vertices
    	Vertice _0 = new Vertice("0");
    	Vertice _1 = new Vertice("1");
    	Vertice _2 = new Vertice("2");
    	Vertice _3 = new Vertice("3");
    	Vertice _4 = new Vertice("4");
    	Vertice _5 = new Vertice("5");
    	Vertice _6 = new Vertice("6");
    	
    	// Arestas
    	Aresta _06 = new Aresta(_0, _6);
    	Aresta _60 = new Aresta(_6, _0);
    	Aresta _05 = new Aresta(_0, _5);
    	Aresta _01 = new Aresta(_0, _1);
    	Aresta _15 = new Aresta(_1, _5);
    	Aresta _14 = new Aresta(_1, _4);
    	Aresta _13 = new Aresta(_1, _3);
    	Aresta _46 = new Aresta(_4, _6);
    	Aresta _42 = new Aresta(_4, _2);
    	
    	// Adicionando vértices
    	grafoListaDirecionado.setVertices(new ArrayList<Vertice>() {
    		{
    			add(_0);
    			add(_1);
    			add(_2);
    			add(_3);
    			add(_4);
    			add(_5);
    			add(_6);
    		}
    	});
    	
    	// Adicionando arestas
    	grafoListaDirecionado.setArestas(new ArrayList<Aresta>() {
    		{
    			add(_06);
    			add(_60);
    			add(_05);
    			add(_01);
    			add(_15);
    			add(_14);
    			add(_13);
    			add(_46);
    			add(_42);		
    		}
    	});
    }
}