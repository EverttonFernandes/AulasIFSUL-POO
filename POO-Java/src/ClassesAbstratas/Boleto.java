package ClassesAbstratas;

import ClassesAbstratas.abstracao.Pagamento;

public class Boleto extends Pagamento {

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via boleto");
    }
}
