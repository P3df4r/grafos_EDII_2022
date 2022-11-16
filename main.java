//Implementar visualização aqui

import java.util.Scanner;

public class grafo {
        public int matriz_VA[][];
	public static void main(String args[]){
	//V = vertice
	//A = Aresta
	Scanner teclado = new Scanner(System.in);
	Grafo_manual grafo = new Grafo_manual();
	System.out.println("Insira a quantidade de vértices existentes no grafo: ");
	int Ve = teclado.nextInt();
	grafo.matriz_VA = new int[Ve][Ve];
	}
	

	public void data_grafo() {
	System.out.println("Quantidade de vértices: " + grafo.matriz_VA.length)
	
	}

	public void insert_A() {
	

	
	}

	public void verifica_A() {
	
	
	
	} 

	public void print_grafo_listAdj() {
	


	}

	public void print_grafo_matriz() {
	


	}
}
