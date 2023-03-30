import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descrição do Curso Java");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curso Python");
        curso2.setDescricao("Descrição do Curso Python");
        curso1.setCargaHoraria(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria de Java POO");
        mentoria.setDescricao("Descrição de Mentoria Java");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Banco PAN");
        bootcamp.setDescricao("Descrição Bootcamp DIO - Banco PAN");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devDeividi = new Dev();
        devDeividi.setNome("Deivid Filho");
        devDeividi.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscrito Deividi" + devDeividi.getConteudosInscritos());
        devDeividi.progredir();
        devDeividi.progredir();
        devDeividi.progredir();

        System.out.println("---");

        System.out.println("Conteúdos Inscrito Deividi" + devDeividi.getConteudosInscritos());
        System.out.println("Contéudos Concluídos Deividi" + devDeividi.getConteudosConcluidos());
        System.out.println("Experiência: " + devDeividi.calcularTotalXp());

        System.out.println("______________");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir();
        devJoao.progredir();

        System.out.println("---");

        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("Experiência:" + devJoao.calcularTotalXp());
    }

    // Falta uma formatação melhor para saída de dados. Ao longo do tempo corrigirei!
}
