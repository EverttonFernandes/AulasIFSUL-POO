package Aula02ClassesAbstratasEOPrincipioAbertoFechadoOCP;

import Aula02ClassesAbstratasEOPrincipioAbertoFechadoOCP.abstracao.Pagamento;

public class Cheque extends Pagamento {

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via cheque");    }
}
