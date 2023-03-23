public class Main {
    public static void main(String[] args) {

        ClasseMae[] classes = new ClasseMae[]{new ClasseFilhaI(), new ClasseFilhaII(), new ClasseMae()};

        for (ClasseMae classe: classes) {
            classe.metodo1();
        }

        System.out.println("");

        for (ClasseMae classe: classes) {
            classe.metodo2();
        }

        System.out.println("");

        ClasseFilhaII classeFilha2 = new ClasseFilhaII();
        classeFilha2.metodo2();
    }
}
