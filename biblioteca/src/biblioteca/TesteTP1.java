package biblioteca;

import java.io.IOException;

import tp1.Grafo;

public class TesteTP1 {
	public static void main(String args[]) throws IOException {
		int tam = 5;
		Grafo g = Grafo.CriaGrafo(tam);
		String nomeAresta1 = Grafo.InserirAresta(g, 0, 1, false, 0, false, false);
		String nomeAresta2 = Grafo.InserirAresta(g, 0, 2, false, 0, false, false);
		String nomeAresta3 = Grafo.InserirAresta(g, 0, 3, false, 0, false, false);
		String nomeAresta4 = Grafo.InserirAresta(g, 0, 4, false, 0, false, false);
		String nomeAresta5 = Grafo.InserirAresta(g, 0, 0, false, 0, false, false);
		
		System.out.println(Grafo.RemoverAresta(g, nomeAresta5) ? "Removido com sucesso" : "Falha na remocao");
		System.out.println("Grau do vertice " + Grafo.GrauVertice(g, 0)[0]);
		System.out.println("Grau do grafo " + Grafo.GrauGrafo(g));
		int[] vizinhos = Grafo.VizinhosVertice(g, 1);
		System.out.print("Vizinhos do vertice 1: ");
		for(int i = 0; i < vizinhos.length; i++)
			System.out.println(vizinhos[i]);
		System.out.println(Grafo.Conexo(g) ? "O grafo e conexo" : "Nao e conexo");
		int regular = Grafo.Regular(g);
		System.out.println(regular != -1? ("O grafo e " + regular + " - regular") : "Nao e regular");
		System.out.println(Grafo.Completo(g) ? "O grafo e  completo" : "Nao e completo");
		
		System.out.println();
		Grafo.BuscaEmProfundidade(g); //Possui retorno de uma matriz, mas exibe por si
		System.out.println();
		Grafo.BuscaEmLargura(g); //Possui retorno de uma matriz, mas exibe por si
		System.out.println();
		
		int[] caminho = Grafo.CaminhoEntreVertices(g, 4, 3);
		System.out.println("O caminho entre 4 e 3 e: ");
		for(int i = 0; i < caminho.length; i++)
			System.out.print(caminho[i] + " ");
			
		
		System.out.println();
		System.out.println();
		Grafo.ExibeMatrizAdjacencia(g);
		System.out.println();
		Grafo.ExibeListaAdjacencia(g);
		//System.out.println("Arquivo .net criado: " + Grafo.GeraGephi(g));
	}
}
