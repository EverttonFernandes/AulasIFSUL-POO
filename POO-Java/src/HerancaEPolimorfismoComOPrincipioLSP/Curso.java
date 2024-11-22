package HerancaEPolimorfismoComOPrincipioLSP;

import java.util.ArrayList;
import java.util.List;

public abstract class Curso {
    protected String nome;
    protected int cargaHoraria;
    protected String grauDeEnsino;
    protected boolean temTrabalhoDeConclusaoDeCurso;
    protected List<String> disciplinas;

    // Herança: Construtores protegidos para serem usados pelas subclasses
    protected Curso(String nome, int cargaHoraria, String grauDeEnsino, boolean temTrabalhoDeConclusaoDeCurso) {
        this.nome = nome;
        this.cargaHoraria = cargaHoraria;
        this.grauDeEnsino = grauDeEnsino;
        this.temTrabalhoDeConclusaoDeCurso = temTrabalhoDeConclusaoDeCurso;
        this.disciplinas = new ArrayList<>();
    }

    // Herança: Método abstrato que deve ser implementado pelas subclasses
    protected abstract String emitirDiploma();

    // Herança: Método comum para adicionar disciplinas
    protected void adicionarDisciplina(String disciplina) {
        disciplinas.add(disciplina);
    }

    // Herança: Método comum para listar disciplinas
    protected List<String> listarDisciplinas() {
        return disciplinas;
    }

    // Herança: Método comum para exibir informações do curso
    protected void exibirInformacoes() {
        System.out.println("Curso: " + nome);
        System.out.println("Grau de Ensino: " + grauDeEnsino);
        System.out.println("Carga Horária: " + cargaHoraria + " horas");
        System.out.println("Disciplinas: " + String.join(", ", listarDisciplinas()));
        System.out.println("Diploma: " + emitirDiploma());
        System.out.println(this.temTrabalhoDeConclusaoDeCurso ? "Possui trabalho de conclusão de curso!" : "Não possui trabalho de conclusão de curso!");
        System.out.println();
    }
}
