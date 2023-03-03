public class ListaDuplamenteEncadeada {

    private Nodo primeiro;
    private Nodo ultimo;

    // Construtor que inicializa a lista vazia
    public ListaDuplamenteEncadeada() {
        this.primeiro = null;
        this.ultimo = null;
    }

    // Classe interna que representa cada elemento (nodo) da lista
    private class Nodo {
        private int valor;
        private Nodo proximo;
        private Nodo anterior;

        public Nodo(int valor) {
            this.valor = valor;
            this.proximo = null;
            this.anterior = null;
        }
    }

    // Método que adiciona um elemento no final da lista
    public void adicionar(int valor) {
        Nodo novoNodo = new Nodo(valor);
        if (this.primeiro == null) {
            this.primeiro = novoNodo;
            this.ultimo = novoNodo;
        } else {
            this.ultimo.proximo = novoNodo;
            novoNodo.anterior = this.ultimo;
            this.ultimo = novoNodo;
        }
    }

    // Método que remove um elemento da lista a partir de seu valor
    public void remover(int valor) {
        Nodo atual = this.primeiro;
        while (atual != null) {
            if (atual.valor == valor) {
                if (atual == this.primeiro) {
                    this.primeiro = atual.proximo;
                    if (this.primeiro != null) {
                        this.primeiro.anterior = null;
                    }
                } else if (atual == this.ultimo) {
                    this.ultimo = atual.anterior;
                    this.ultimo.proximo = null;
                } else {
                    atual.anterior.proximo = atual.proximo;
                    atual.proximo.anterior = atual.anterior;
                }
                return;
            }
            atual = atual.proximo;
        }
    }

    // Método que imprime todos os elementos da lista
    public void imprimir() {
        Nodo atual = this.primeiro;
        while (atual != null) {
            System.out.print(atual.valor + " ");
            atual = atual.proximo;
        }
        System.out.println();
    }

}
