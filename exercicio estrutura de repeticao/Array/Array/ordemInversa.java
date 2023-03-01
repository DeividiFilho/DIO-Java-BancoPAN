public class ordemInversa {
    public static void main(String[] args) {

        int[] vetor = {2, 7, 10, -6, 123, -11};

        System.out.println("Vetor: ");
        int cont = 0;

        while (cont < (vetor.length)) {
            System.out.println(vetor[cont] + " ");
            cont++;
        }

        System.out.print("\n Vetor: ");

        for (int i = (vetor.length - 1); i >= 0; i--){ // pq vetor tem 6 elementos,mas vai
            System.out.print(vetor[i] + " ");
        }
    }
}
