import java.util.Scanner;

public class nota {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int nota;

        System.out.println("\nDigite uma nota entre 0 e 10: ");
        nota = scan.nextInt();

        while (nota < 0 | nota > 10) {
            System.out.println("\nNota invalida! Tente novamente...");
            nota = scan.nextInt();
        }
    }
}
