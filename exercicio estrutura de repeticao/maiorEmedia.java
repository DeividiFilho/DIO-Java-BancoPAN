import java.util.Scanner;

public class maiorEmedia {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num;
        int maior = 0;
        int soma = 0;

        int cont = 0;
        do {
            System.out.println("Insira o número: ");
            num = scan.nextInt();

            soma = soma + num;
            if (num > maior) maior = num;

            cont = cont + 1;
        }while (cont < 5);

        System.out.println("O maior número é: " + maior);
        System.out.println("A média é: " + (soma/5));
    }
}