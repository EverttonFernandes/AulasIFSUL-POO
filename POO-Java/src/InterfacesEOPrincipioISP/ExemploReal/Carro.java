package InterfacesEOPrincipioISP.ExemploReal;

import InterfacesEOPrincipioISP.ExemploReal.abstracao.Veiculo;
import InterfacesEOPrincipioISP.ExemploReal.interfaces.Desligavel;
import InterfacesEOPrincipioISP.ExemploReal.interfaces.Ligavel;
import InterfacesEOPrincipioISP.ExemploReal.interfaces.Wifi;

public class Carro extends Veiculo implements Ligavel, Desligavel, Wifi {
    public Carro(String modelo) {
        super(modelo);
    }

    @Override
    public void ligar() {
        System.out.println("O carro " + modelo + " está se ligado!");
    }

    @Override
    public void ligarWifi() {
        System.out.println("O carro " + modelo + " está conectado ao Wi-Fi para usar Spotify e Waze.");
    }

    @Override
    public void desligar() {
        System.out.println("O carro " + modelo + " está desligado!");
    }
}