package com.grafos.helpers;

import java.util.Comparator;

import com.grafos.grafo.Vertice;

public class VerticeComparadorCustomizado implements Comparator<Vertice>{

	@Override
	public int compare(Vertice o1, Vertice o2) {
		return o1.getEtiqueta().compareToIgnoreCase(o2.getEtiqueta());
	}
}
