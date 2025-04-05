import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Digite o número de nodos: ");
        Scanner scanner = new Scanner(System.in);
        int nodos = scanner.nextInt();
        System.out.println("Digite o número de arestas: ");
        int aresta = scanner.nextInt();
        System.out.println("O grafo é direcionado? (true/false): ");
        boolean ehDigrafo = scanner.nextBoolean();
        Grafo grafo = new Grafo(nodos, aresta, ehDigrafo);
        grafo.imprimirMatriz();
        System.out.println();
        grafo.imprimiGrau();
    }
}