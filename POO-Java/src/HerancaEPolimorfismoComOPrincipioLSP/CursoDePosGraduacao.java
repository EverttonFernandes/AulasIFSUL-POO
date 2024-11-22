package HerancaEPolimorfismoComOPrincipioLSP;

public class CursoDePosGraduacao extends Curso {

    protected CursoDePosGraduacao(String nome, int cargaHoraria, String grauDeEnsino, boolean temTrabalhoDeConclusaoDeCurso) {
        super(nome, cargaHoraria, grauDeEnsino, temTrabalhoDeConclusaoDeCurso);
    }

    @Override
    protected String emitirDiploma() {
        return "Diploma de do curso de pós graduacão em Gestão de TI";
    }
}
