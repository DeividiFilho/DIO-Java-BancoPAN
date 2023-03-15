import java.time.LocalTime;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\nEscolha uma das opções abaixo:");
            System.out.println("1 - Cálculo das quatro operações básicas");
            System.out.println("2 - Saudação de acordo com a hora do dia");
            System.out.println("3 - Cálculo do valor final de um empréstimo");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = input.nextInt();

            switch (opcao) {
                case 1:
                    calcularOperacoesBasicas();
                    break;
                case 2:
                    saudarDeAcordoComAHoraDoDia();
                    break;
                case 3:
                    calcularValorFinalDoEmprestimo();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        } while (opcao != 0);

        input.close();
    }

    public static void calcularOperacoesBasicas() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o primeiro valor: ");
        double valor1 = input.nextDouble();

        System.out.print("Digite o segundo valor: ");
        double valor2 = input.nextDouble();

        double soma = valor1 + valor2;
        double subtracao = valor1 - valor2;
        double multiplicacao = valor1 * valor2;
        double divisao = valor1 / valor2;

        System.out.printf("Soma: %.2f\n", soma);
        System.out.printf("Subtração: %.2f\n", subtracao);
        System.out.printf("Multiplicação: %.2f\n", multiplicacao);
        System.out.printf("Divisão: %.2f\n", divisao);

        input.close();
    }

    public static void saudarDeAcordoComAHoraDoDia() {
        LocalTime hora = LocalTime.now();

        if (hora.isBefore(LocalTime.NOON)) {
            System.out.println("Bom dia!");
        } else if (hora.isBefore(LocalTime.of(18, 0))) {
            System.out.println("Boa tarde!");
        } else {
            System.out.println("Boa noite!");
        }
    }

    public static void calcularValorFinalDoEmprestimo() {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite o valor solicitado: ");
        double valorSolicitado = input.nextDouble();

        double valorFinal = valorSolicitado;

        if (valorSolicitado <= 1000) {
            valorFinal *= 1.1;
        } else if (valorSolicitado <= 5000) {
            valorFinal *= 1.15;
        } else {
            valorFinal *= 1.2;
        }

        System.out.print("Digite o número de parcelas: ");
        int numParcelas = input.nextInt();

        double valorParcela = valorFinal / numParcelas;

        System.out.printf("Valor final: %.2f\n", valorFinal);
        System.out.printf("Valor da parcela: %.2f\n", valorParcela);

        input.close();
    }
}
