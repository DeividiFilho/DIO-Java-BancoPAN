public class ArvoreBinaria {
    // classe interna que define a estrutura de um nó da árvore
    private class No {
        int valor; // valor armazenado no nó
        No esquerda; // referência ao nó filho à esquerda
        No direita; // referência ao nó filho à direita

        public No(int valor) {
            this.valor = valor;
            this.esquerda = null;
            this.direita = null;
        }
    }

    private No raiz; // referência ao nó raiz da árvore

    // construtor da árvore, inicialmente sem elementos
    public ArvoreBinaria() {
        this.raiz = null;
    }

    // método para adicionar um novo elemento na árvore
    public void adicionar(int valor) {
        No novoNo = new No(valor); // cria um novo nó com o valor informado

        if (this.raiz == null) { // caso a árvore esteja vazia
            this.raiz = novoNo; // o novo nó será a raiz da árvore
        } else { // caso contrário, busca o local adequado para inserir o novo nó
            No noAtual = this.raiz;
            while (true) {
                if (valor < noAtual.valor) { // se o valor for menor que o valor do nó atual
                    if (noAtual.esquerda == null) { // verifica se há espaço para inserir à esquerda
                        noAtual.esquerda = novoNo; // insere o novo nó à esquerda
                        break;
                    } else { // caso contrário, continua a busca à esquerda
                        noAtual = noAtual.esquerda;
                    }
                } else { // caso contrário, o valor é maior ou igual ao valor do nó atual
                    if (noAtual.direita == null) { // verifica se há espaço para inserir à direita
                        noAtual.direita = novoNo; // insere o novo nó à direita
                        break;
                    } else { // caso contrário, continua a busca à direita
                        noAtual = noAtual.direita;
                    }
                }
            }
        }
    }

    // método para buscar um elemento na árvore
    public boolean buscar(int valor) {
        No noAtual = this.raiz; // começa a busca pela raiz
        while (noAtual != null) {
            if (valor == noAtual.valor) { // se o valor for igual ao valor do nó atual
                return true; // retorna verdadeiro, pois o valor foi encontrado
            } else if (valor < noAtual.valor) { // se o valor for menor que o valor do nó atual
                noAtual = noAtual.esquerda; // continua a busca à esquerda
            } else { // caso contrário, o valor é maior que o valor do nó atual
                noAtual = noAtual.direita; // continua a busca à direita
            }
        }
        return false; // retorna falso, pois o valor não foi encontrado
    }

    // método para imprimir os elementos da árvore em ordem crescente
    public void imprimirEmOrdem(No raiz) {
        imprimirEmOrdem(this.raiz); // chama o método recursivo com o nó

    }
}
