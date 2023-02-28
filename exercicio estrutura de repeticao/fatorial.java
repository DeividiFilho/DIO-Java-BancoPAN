import java.util.Scanner;

public class fatorial {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Insira um número para calcular seu fatorial: ");
        double fatorial = scan.nextDouble();

        double mult = 1;

        System.out.println("\nCALCULANDO...\n");


        for (double i = fatorial; i>=1; i--){
            mult = mult * i;
        }

        System.out.println("O reultado do fatorial " + fatorial +  "!= : " + mult);

    }
}
