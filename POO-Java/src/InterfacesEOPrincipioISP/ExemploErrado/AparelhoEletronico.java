package InterfacesEOPrincipioISP.ExemploErrado;

public interface AparelhoEletronico {
    void ligar();
    void conectarWiFi(); // Nem todos os aparelhos precisam de Wi-Fi
}
