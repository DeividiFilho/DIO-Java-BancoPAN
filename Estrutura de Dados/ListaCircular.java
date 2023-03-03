import java.util.NoSuchElementException;

public class ListaCircular {

    // Classe interna para representar cada nó da lista
    private class No {
        int dado;
        No proximo;

        public No(int dado) {
            this.dado = dado;
            this.proximo = null;
        }
    }

    // Atributos da lista circular
    private No inicio;
    private No fim;
    private int tamanho;

    // Método para verificar se a lista está vazia
    public boolean estaVazia() {
        return tamanho == 0;
    }

    // Método para obter o tamanho da lista
    public int tamanho() {
        return tamanho;
    }

    // Método para adicionar um elemento no fim da lista
    public void adicionarFim(int dado) {
        No novoNo = new No(dado);

        if (estaVazia()) {
            inicio = novoNo;
        } else {
            fim.proximo = novoNo;
        }

        novoNo.proximo = inicio;
        fim = novoNo;
        tamanho++;
    }

    // Método para remover o elemento do início da lista
    public int removerInicio() {
        if (estaVazia()) {
            throw new NoSuchElementException("A lista está vazia!");
        }

        int dadoRemovido = inicio.dado;

        if (inicio == fim) {
            inicio = null;
            fim = null;
        } else {
            fim.proximo = inicio.proximo;
            inicio = inicio.proximo;
        }

        tamanho--;
        return dadoRemovido;
    }

    // Método para exibir os elementos da lista
    public void exibir() {
        if (estaVazia()) {
            System.out.println("A lista está vazia!");
        } else {
            No noAtual = inicio;
            do {
                System.out.print(noAtual.dado + " ");
                noAtual = noAtual.proximo;
            } while (noAtual != inicio);
            System.out.println();
        }
    }
}
