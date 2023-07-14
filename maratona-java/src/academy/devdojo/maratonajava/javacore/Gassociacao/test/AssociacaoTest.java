package academy.devdojo.maratonajava.javacore.Gassociacao.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Aluno;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Local;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Professor;
import academy.devdojo.maratonajava.javacore.Gassociacao.domain.Seminario;

public class AssociacaoTest {
    public static void main(String[] args) {
        Local local = new Local("Avenida Brasil");
        Aluno aluno = new Aluno("Edson", 23);
        Professor professor = new Professor("Marcelo D2", "Compositor");
        Aluno[] alunoParaSeminario = {aluno};

        Seminario seminario = new Seminario("A procura Da Batida Perfeita", alunoParaSeminario, local);

        Seminario[] seminariosDisponiveis = {seminario};
        professor.setSeminarios(seminariosDisponiveis);

        professor.imprime();

    }
}
