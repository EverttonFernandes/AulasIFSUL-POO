package ClassesAbstratas;

import ClassesAbstratas.abstracao.Pagamento;

public class Cheque extends Pagamento {

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via cheque");    }
}
