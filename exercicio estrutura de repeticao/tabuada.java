import java.util.Scanner;

public class tabuada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("\nBem-Vindo ao programa de tabuada!!\n");
        System.out.println("Insira um número para ver sua tabuada: ");
        int tabuada = scan.nextInt();

        System.out.println("EXIBINDO TABUADA DO: " + tabuada);
        for (int i=1; i<11; i++){
            System.out.println(tabuada + " X " + i + " = " + (tabuada*i));
        }
        System.out.println("F I M ");
    }
}
