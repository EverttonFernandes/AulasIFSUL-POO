package HerancaEPolimorfismoComOPrincipioLSP;

import java.util.List;

public class CursoTecnicoEmInformatica extends Curso {
    private final String areaDeAtuacao;
    // Sobrecarga de métodos: Dois construtores com assinaturas diferentes
    public CursoTecnicoEmInformatica(String areaDeAtuacao, boolean temTrabalhoDeConclusaoDeCurso) {
        super("Técnico em Informática", 1200, "Técnico", temTrabalhoDeConclusaoDeCurso);
        this.areaDeAtuacao = areaDeAtuacao;
    }

    // Polimorfismo: Implementação específica do método abstrato emitirDiploma
    @Override
    public String emitirDiploma() {
        return "Diploma de Técnico em Informática com ênfase em " + areaDeAtuacao;
    }
}
