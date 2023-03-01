import java.util.Scanner;

public class consoantes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String[] letras = new String[6];
        int qntConsoante = 0;

        int cont = 0;
        do {
            System.out.println("\nDigite uma letra: ");
            String letra = scan.next();

            if (!(letra.equalsIgnoreCase("a") |
                    letra.equalsIgnoreCase("e") |
                    letra.equalsIgnoreCase("i") |
                    letra.equalsIgnoreCase("o") |
                    letra.equalsIgnoreCase("u"))) {
                letras[cont] = letra;
                qntConsoante++;
            }

            cont++;
        } while (cont < letras.length);

        System.out.println("Consoantes: ");
        for (String consoante : letras) {
            if (consoante != null)
                System.out.println(consoante + " ");
        }
        System.out.println("Quantidade de consoantes: " + qntConsoante);
        System.out.println(letras.length);
    }
}
