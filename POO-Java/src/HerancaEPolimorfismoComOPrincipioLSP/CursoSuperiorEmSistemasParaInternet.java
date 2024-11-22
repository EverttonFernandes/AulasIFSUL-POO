package HerancaEPolimorfismoComOPrincipioLSP;

public class CursoSuperiorEmSistemasParaInternet extends Curso {
    private final String tipoDeProjetoFinal;

    public CursoSuperiorEmSistemasParaInternet(String tipoDeProjetoFinal, boolean temTrabalhoDeConclusaoDeCurso) {
        super("Sistemas para Internet", 3200, "Superior", temTrabalhoDeConclusaoDeCurso);
        this.tipoDeProjetoFinal = tipoDeProjetoFinal;
    }

    @Override
    public String emitirDiploma() {
        return "Diploma de Técnologia em Sistemas para Internet com projeto final em " + tipoDeProjetoFinal;
    }
}
