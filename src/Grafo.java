import java.util.Scanner;

public class Grafo {

    private int aresta;
    private int nodos;
    private int[][] matriz;
    private boolean ehDigrafo;

    public Grafo(int nodos, int aresta, boolean ehDigrafo) {

        Scanner scanner = new Scanner(System.in);
        this.nodos = nodos;
        this.aresta = aresta;
        this.ehDigrafo = ehDigrafo;
        this.matriz = new int[nodos][nodos];

        for (int i = 0; i < aresta; i++) {
            System.out.println("Digite o primeiro nodo da aresta " + (i + 1) + ": ");
            int nodo1 = scanner.nextInt();
            System.out.println("Digite o segundo nodo da aresta " + (i + 1) + ": ");
            int nodo2 = scanner.nextInt();
            adicionarAresta(nodo1, nodo2);
        }
    }

    public void adicionarAresta(int nodo1, int nodo2) {
        matriz[nodo1][nodo2] = 1;
        if (!ehDigrafo){
            matriz[nodo2][nodo1] = 1;
        }
    }

    public void imprimirMatriz() {
        System.out.println("Matriz de Adjacência:");
        for (int i = 0; i < this.nodos; i++) {
            for (int j = 0; j < this.nodos; j++) {
                System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

}
