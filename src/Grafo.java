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
        if (!ehDigrafo) {
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

    public void imprimiGrau() {
        System.out.println("Grau dos vertice:\n");
        if (!ehDigrafo) {
            for (int i = 0; i < nodos; i++) {
                int grau = 0;
                for(int j = 0; j < nodos; j++){
                    if (matriz[i][j] == 1) {
                        grau++;
                    }
                }
                System.out.println("Grau do " + i + "° vertice informado:\n" + "Grau: " + grau);
                System.out.println();
            }
        } else {
            for (int i = 0; i < nodos; i++) {
                int entrada = 0;
                int saida = 0;
                for (int j = 0; j < nodos; j++) {
                    if (matriz[i][j] == 1) {
                        saida++;
                    }
                    if (matriz[j][i] == 1) {
                        entrada++;
                    }
                }
                System.out.println("Grau do " + i + "° vertice informado:\n" + "Entrada: " + entrada + "  Saída: " + saida);
                System.out.println();
            }
        }
    }

}
