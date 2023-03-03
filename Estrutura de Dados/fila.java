import java.util.LinkedList;
import java.util.Queue;

public class fila {

    public static void main(String[] args) {

        // Cria uma fila vazia
        Queue<String> fila = new LinkedList<>();

        // Adiciona elementos à fila
        fila.add("Elemento 1");
        fila.add("Elemento 2");
        fila.add("Elemento 3");
        fila.add("Elemento 4");
        fila.add("Elemento 5");

        // Imprime a fila
        System.out.println("Fila: " + fila);

        // Remove o primeiro elemento da fila
        String elementoRemovido = fila.poll();

        // Imprime o elemento removido e a fila atualizada
        System.out.println("\nElemento removido: " + elementoRemovido);
        System.out.println("\nFila atualizada: " + fila);

        // Acessa o primeiro elemento da fila sem removê-lo
        String primeiroElemento = fila.peek();

        // Imprime o primeiro elemento da fila
        System.out.println("\nPrimeiro elemento: " + primeiroElemento);

        // Verifica se a fila está vazia
        boolean filaVazia = fila.isEmpty();

        // Imprime se a fila está vazia ou não
        System.out.println("\nA fila está vazia? " + filaVazia);

        // Retorna o tamanho da fila
        int tamanhoFila = fila.size();

        // Imprime o tamanho da fila
        System.out.println("\nTamanho da fila: " + tamanhoFila);
    }
}
