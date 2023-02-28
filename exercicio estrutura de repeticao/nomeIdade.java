import java.util.Scanner;

public class nomeIdade {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String nome;
        int idade;

        System.out.println("\nBem vindo a esse programa. Para encerrar, digite 0");

        while (true) {
            System.out.println("Insira o nome: ");
            nome = scan.next();
            if (nome.equals("0")) break;

            System.out.println("Insira a idade: ");
            idade = scan.nextInt();
            if (idade == 0) break;

        }
    }
}
