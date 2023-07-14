package academy.devdojo.maratonajava.javacore.Gassociacao.domain;

public class Professor {
    private String nome;
    private String especialidade;
    private Seminario[] seminarios;

    public Professor(String nome, String especialidade, Seminario[] seminarios) {
        this.nome = nome;
        this.especialidade = especialidade;
        this.seminarios = seminarios;
    }

    public void imprime() {
        System.out.println("-----------------------------------");
        System.out.println("Professor: " + this.nome);
        System.out.println("Especialidade: " + this.especialidade);
        System.out.println();
        if (this.seminarios == null) return;
        System.out.println("-----Seminários Cadastrados-----");
        for (Seminario seminario : seminarios) {
            System.out.println("Seminário: " + seminario.getTitulo());
            System.out.println(seminario.getLocal().getEndereco());
            System.out.println();
            if(seminario.getAlunos() == null || seminario.getAlunos().length == 0) continue;
            System.out.println("-----Alunos-----");
            for (Aluno aluno : seminario.getAlunos()) {
                System.out.println( aluno.getNome());
            }
        }
        if(this.seminarios == null) return;

    }


    public Seminario[] getSeminarios() {
        return seminarios;
    }

    public void setSeminarios(Seminario[] seminarios) {
        this.seminarios = seminarios;
    }

    public String getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }

    public Professor(String nome, String especialidade) {
        this.nome = nome;
        this.especialidade = especialidade;
    }

    public Professor(String nome) {
        this.nome = nome;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}
