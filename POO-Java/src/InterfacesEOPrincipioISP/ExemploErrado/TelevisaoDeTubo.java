package InterfacesEOPrincipioISP.ExemploErrado;

public class TelevisaoDeTubo implements AparelhoEletronico {
    @Override
    public void ligar() {
        System.out.println("A televisão está ligada.");
    }

    @Override
    public void conectarWiFi() {
        throw new UnsupportedOperationException("TV não possui Wi-Fi.");
    }
}
