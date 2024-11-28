package InterfacesEOPrincipioISP.ExemploReal;

import InterfacesEOPrincipioISP.ExemploReal.Enuns.TipoDispositivo;

public class Main {
    public static void main(String[] args) {
        Carro bmw = new Carro("BMW", false);
        bmw.ligar();
        bmw.ligarWifi();
        bmw.desligar();
        System.out.println("--------------------------------------------------");
        Carro citroen = new Carro("Citroen", true);
        citroen.ligar();
        citroen.ligarWifi();
        citroen.desligar();
        System.out.println("--------------------------------------------------");
        TelevisaoOLED televisaoOLED = new TelevisaoOLED(TipoDispositivo.TV);
        televisaoOLED.ligar();
        televisaoOLED.ligarWifi();
        televisaoOLED.desligar();
        System.out.println("--------------------------------------------------");
    }
}
