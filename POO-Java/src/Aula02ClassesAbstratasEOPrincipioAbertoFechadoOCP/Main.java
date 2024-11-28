package Aula02ClassesAbstratasEOPrincipioAbertoFechadoOCP;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        var pix = new Pix(LocalDate.now(), "5198755331");
        pix.processarPagamento();

        var cartaoDeCredito = new CartaoDeCredito(2000.00F);
        cartaoDeCredito.processarPagamento();
    }
}
