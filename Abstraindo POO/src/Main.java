import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {

    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso 1 java");
        curso1.setDescricao("Descrição curso 1 Java");
        curso1.setCargaHoraria(4);
        System.out.println(curso1);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso 2 java");
        curso2.setDescricao("Descrição curso 2 Java");
        curso2.setCargaHoraria(4);
        System.out.println(curso2);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("Mentoria do Curso");
        mentoria.setData(LocalDate.now());
        System.out.println(mentoria);

        Conteudo conteudo = new Conteudo();

    }

}
