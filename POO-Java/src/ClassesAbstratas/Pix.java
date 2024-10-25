package ClassesAbstratas;

import ClassesAbstratas.abstracao.Pagamento;

import java.time.LocalDate;

public class Pix extends Pagamento {
    private final LocalDate dataDoPagamento;
    private final String chavePixDestinario;

    public Pix(LocalDate dataDoPagamento, String chavePixDestinario) {
        this.dataDoPagamento = dataDoPagamento;
        this.chavePixDestinario = chavePixDestinario;
    }

    @Override
    public void processarPagamento() {
        System.out.println("Pagamento via PIX na data "
                .concat(dataDoPagamento.toString())
                .concat(" para o destinario com a chave ")
                .concat(this.getChavePixDestinario()));
    }

    public LocalDate getDataDoPagamento() {
        return dataDoPagamento;
    }

    public String getChavePixDestinario() {
        return chavePixDestinario;
    }
}
