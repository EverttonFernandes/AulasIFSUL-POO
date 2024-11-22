package HerancaEPolimorfismoComOPrincipioLSP;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Curso Técnico
        List<String> disciplinas = new ArrayList<>();
        disciplinas.add("Historia");
        disciplinas.add("Matemática");
        // Sobrecarga de métodos: Uso do construtor sobrecarregado que aceita uma lista de disciplinas
        CursoTecnicoEmInformatica cursoTecnico = new CursoTecnicoEmInformatica("Tecnologia da Informação", false, disciplinas);

        // Adicionando disciplinas dinamicamente
        cursoTecnico.adicionarDisciplina("Segurança da Informação");
        cursoTecnico.adicionarDisciplina("POO");
        cursoTecnico.adicionarDisciplina("Lógica de Programação");
        cursoTecnico.adicionarDisciplina("Banco de Dados");

        // Curso Superior
        // Herança: Criando uma instância de uma subclasse (CursoSuperiorEmSistemasParaInternet) que herda de Curso
        CursoSuperiorEmSistemasParaInternet cursoSuperior = new CursoSuperiorEmSistemasParaInternet("Desenvolvimento de uma API RESTFul", true);

        // Adicionando disciplinas dinamicamente
        cursoSuperior.adicionarDisciplina("Arquitetura de Software");
        cursoSuperior.adicionarDisciplina("Tópicos avançados de Engenharia de Software");
        cursoSuperior.adicionarDisciplina("Desenvolvimento Mobile");
        cursoSuperior.adicionarDisciplina("Desenvolvimento Fron End III");
        cursoSuperior.adicionarDisciplina("Desenvolvimento Back End III");

        // Polimorfismo: Lista de cursos que contém objetos de diferentes subclasses tratados como a classe base (Curso)
        List<Curso> cursos = List.of(cursoTecnico, cursoSuperior);

        // Polimorfismo: O método exibirInformacoes() é chamado para cada objeto,
        // mas a implementação específica de cada subclasse é executada
        for (Curso curso : cursos) {
            curso.exibirInformacoes();
        }
    }
}
