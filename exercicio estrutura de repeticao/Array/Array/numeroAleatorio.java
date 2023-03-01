import java.awt.desktop.AboutEvent;
import java.util.Random;
import java.util.Scanner;

public class numeroAleatorio {
    public static void main(String[] args) {
        Random random = new Random();

        int[] numAleatorio = new int[20];

        for( int i = 0; i < numAleatorio.length; i++){
            int num = random.nextInt(100);
            numAleatorio[i] = num;
        }

        System.out.print("\nNúmero aleatorios: ");
        for(int num : numAleatorio) {
            System.out.print(num + "  ");
        }

        System.out.print("\nSucessores dos números aleatorios: ");
        for(int num : numAleatorio) {
            System.out.print((num+1) + "  ");
        }
        System.out.print("\nAntecessor dos números aleatorios: ");
        for(int num : numAleatorio) {
            System.out.print((num-1) + "   ");
        }
    }
}
