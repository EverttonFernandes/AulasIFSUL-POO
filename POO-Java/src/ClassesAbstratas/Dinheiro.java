package ClassesAbstratas;

import ClassesAbstratas.abstracao.Pagamento;

public class Dinheiro extends Pagamento {

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via dinheiro");    }
}
