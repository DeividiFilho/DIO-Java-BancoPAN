import java.util.Stack;

public class pilha {

    public static void main(String[] args) {

        // Criando uma pilha vazia
        Stack<Integer> pilha = new Stack<>();


        // Empilhando elementos na pilha
        pilha.push(1);
        pilha.push(2);
        pilha.push(3);

        // Imprimindo os elementos da pilha
        System.out.println("Pilha: " + pilha);

        // Verificando se a pilha está vazia
        if (pilha.isEmpty()) {
            System.out.println("\nA pilha está vazia!");
        } else {
            System.out.println("\nA pilha não está vazia!");
        }

        // Verificando o tamanho da pilha
        System.out.println("\nTamanho da pilha: " + pilha.size());

        // Desempilhando elementos da pilha
        int elemento = pilha.pop();
        System.out.println("\nElemento desempilhado: " + elemento);

        // Imprimindo os elementos da pilha novamente
        System.out.println("\nPilha atualizada: " + pilha);

        // Obtendo o elemento no topo da pilha sem removê-lo
        elemento = pilha.peek();
        System.out.println("\nElemento no topo da pilha: " + elemento);
    }
}
