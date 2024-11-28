package InterfacesEOPrincipioISP.ExemploReal;

import InterfacesEOPrincipioISP.ExemploReal.Enuns.TipoDispositivo;
import InterfacesEOPrincipioISP.ExemploReal.abstracao.DispositivoEletronico;
import InterfacesEOPrincipioISP.ExemploReal.interfaces.Desligavel;
import InterfacesEOPrincipioISP.ExemploReal.interfaces.Ligavel;
import InterfacesEOPrincipioISP.ExemploReal.interfaces.Wifi;

public class TelevisaoOLED extends DispositivoEletronico implements Ligavel, Desligavel, Wifi {
    protected TelevisaoOLED(TipoDispositivo tipo) {
        super(tipo);
    }

    @Override
    public void ligar() {
        System.out.println("O dispositivo eletrônico do tipo " + tipo.name() + " está ligado!");
    }

    @Override
    public void ligarWifi() {
        System.out.println("O dispositivo eletrônico do tipo " + tipo.name() + " está conectado ao Wi-Fi para usar a Netflix.");
    }

    @Override
    public void desligar() {
        System.out.println("O dispositivo eletrônico do tipo " + tipo.name() + " está desligado!");
    }
}
