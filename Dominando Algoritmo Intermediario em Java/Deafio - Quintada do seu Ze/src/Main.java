// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Saída (Output) e pulando uma linha.

import java.util.*;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int morangos = input.nextInt();
        int macas = input.nextInt();

//TODO: Implemente as condições necessárias para retornar o preço a ser pago pelo cliente, conforme a tabela de preços do seu Zé:

        double precoMorango = 2.50;
        double precoMaca = 1.80;


        if (morangos > 5) {
            precoMorango = 2.20;
        }
        if (macas > 5) {
            precoMaca = 1.50;
        }

        double precoTotal = (morangos * precoMorango) + (macas * precoMaca);

        if ((morangos + macas) > 8 || precoTotal > 25.0) {
            precoTotal -= precoTotal * 0.1;
        }

        System.out.println(precoTotal);
    }
}