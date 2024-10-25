package ClassesAbstratas;

import ClassesAbstratas.abstracao.Pagamento;

public class CartaoDeCredito extends Pagamento {
    private final Float limiteDoCartao;

    public CartaoDeCredito(Float limiteDoCartao) {
        this.limiteDoCartao = limiteDoCartao;
    }

    @Override
    public void processarPagamento() {
        if (this.getLimiteDoCartao() <= 0) {
            System.out.println("Nao foi possivel efetuar pagamento!");
        } else {
            System.out.println("Pagamento efetuado com o cartao de credito!");
        }
    }

    public Float getLimiteDoCartao() {
        return limiteDoCartao;
    }
}
