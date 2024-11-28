package Aula02ClassesAbstratasEOPrincipioAbertoFechadoOCP;

import Aula02ClassesAbstratasEOPrincipioAbertoFechadoOCP.abstracao.Pagamento;

public class CartaoDeDebito extends Pagamento {

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via cartão de débito");    }
}
