import java.util.Scanner;

public class parEImpar {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int qntdNum;
        int num;
        int qntPar = 0;
        int qntImpar = 0;

        System.out.println("\nDigite uma quantidade de número: ");
        qntdNum = scan.nextInt();

        int cont = 0;
        do {
            System.out.println("Digite um número: ");
            num = scan.nextInt();

            if (num % 2 == 0) qntPar++;
            else qntImpar++;
            cont++;
        }while (cont<qntdNum);

        System.out.println("O resultado é: \n");
        System.out.println("Quantidade de número PAR: " + qntPar);
        System.out.println("\nQuantidade de número ÍMPAR: " + qntImpar);
    }
}

