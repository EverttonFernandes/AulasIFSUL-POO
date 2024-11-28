package Aula02ClassesAbstratasEOPrincipioAbertoFechadoOCP.abstracao;

import java.time.LocalDate;

public abstract class Pagamento {
    protected LocalDate dataDoPagamento;

    public abstract void processarPagamento();
}
