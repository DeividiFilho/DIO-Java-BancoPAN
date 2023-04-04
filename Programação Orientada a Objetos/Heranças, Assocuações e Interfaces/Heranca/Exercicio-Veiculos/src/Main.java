public class Main {
    public static void main(String[] args) {

        Carro carro1 = new Carro("Toyota", "Corolla", 2021, "Preto", 100000.0, 4, true);
        Carro carro2 = new Carro("Chevrolet", "Camaro", 2023, "Branco", 350000, 4, true);

        System.out.println("\nINFORMAÇÕES DO 1° CARRO: ");
        System.out.println("Marca: " + carro1.getMarca());
        System.out.println("Modelo: " + carro1.getModelo());
        System.out.println("Ano: " + carro1.getAno());
        System.out.println("Cor: " + carro1.getCor());
        System.out.println("Preço: " + carro1.getPreco());
        System.out.println("Número de portas: " + carro1.getNumPortas());
        System.out.println("Câmbio automático: " + (carro1.isCambioAutomatico() ? "Sim" : "Não"));


        System.out.println("\n\nINFORMAÇÕES DO 2° CARRO: ");
        System.out.println("Marca: " + carro2.getMarca());
        System.out.println("Modelo: " + carro2.getModelo());
        System.out.println("Ano: " + carro2.getAno());
        System.out.println("Cor: " + carro2.getCor());
        System.out.println("Preço: " + carro2.getPreco());
        System.out.println("Número de portas: " + carro2.getNumPortas());
        System.out.println("Câmbio automático: " + (carro2.isCambioAutomatico() ? "Sim" : "Não"));
    }
}
