// Lista encadeada
public class Node {
    int data; // dado armazenado no nó
    Node next; // referência para o próximo nó

    public Node(int data) {
        this.data = data;
        this.next = null;
    }


    public class LinkedList {
        Node head; // referência para o primeiro nó da lista

        public LinkedList() {
            this.head = null;
        }

        // método para adicionar um novo nó ao final da lista
        public void add(int data) {
            Node newNode = new Node(data); // criação do novo nó com o dado fornecido
            if (head == null) { // caso a lista esteja vazia, o novo nó é o primeiro
                head = newNode;
            } else {
                Node current = head;
                while (current.next != null) { // percorre a lista até chegar ao último nó
                    current = current.next;
                }
                current.next = newNode; // adiciona o novo nó ao final da lista
            }
        }

        // método para remover um nó da lista pelo seu valor
        public void remove(int data) {
            if (head == null) { // caso a lista esteja vazia, não há nada a remover
                return;
            }
            if (head.data == data) { // caso o primeiro nó contenha o valor a ser removido
                head = head.next; // atualiza a referência do primeiro nó para o próximo
                return;
            }
            Node current = head;
            while (current.next != null && current.next.data != data) { // percorre a lista até encontrar o valor
                current = current.next;
            }
            if (current.next != null) { // caso o valor tenha sido encontrado, remove o nó correspondente
                current.next = current.next.next;
            }
        }

        // método para imprimir os valores armazenados na lista
        public void print() {
            Node current = head;
            while (current != null) { // percorre a lista até o final
                System.out.print(current.data + " "); // imprime o valor do nó atual
                current = current.next; // atualiza a referência para o próximo nó
            }
            System.out.println();
        }
    }
}

