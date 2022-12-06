package com.grafos.grafo;

public class Dijkstra {
	private int matriz_dij [];	
	
	public void dijk_MND (boolean matriz[][]) {
		for (int  i = 0; i < matriz.length; i++) {
			//Definindo 999 como infinito
			matriz_dij[i] = 999;
		}
		
		for (int  i = 0; i < matriz.length; i++)
			for (int j = 0; j < matriz.length; j++)
				if (matriz[i][j] == true) {
					matriz_dij[i] = 1;
				}
	}
}
