package InterfacesEOPrincipioISP.ExemploReal;

import InterfacesEOPrincipioISP.ExemploReal.Enuns.TipoDispositivo;

public class Main {
    public static void main(String[] args) {
        Carro carro = new Carro("BMW");
        carro.ligar();
        carro.ligarWifi();
        carro.desligar();
        System.out.println("--------------------------------------------------");
        TelevisaoOLED televisaoOLED = new TelevisaoOLED(TipoDispositivo.TV);
        televisaoOLED.ligar();
        televisaoOLED.ligarWifi();
        televisaoOLED.desligar();
    }
}
