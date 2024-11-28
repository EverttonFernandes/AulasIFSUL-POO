package InterfacesEOPrincipioISP.ExemploReal;

import InterfacesEOPrincipioISP.ExemploReal.abstracao.Veiculo;
import InterfacesEOPrincipioISP.ExemploReal.interfaces.Desligavel;
import InterfacesEOPrincipioISP.ExemploReal.interfaces.Ligavel;
import InterfacesEOPrincipioISP.ExemploReal.interfaces.Wifi;

public class Carro extends Veiculo implements Ligavel, Desligavel, Wifi {
    private final boolean temCombustivel;
    private boolean ligado;

    public Carro(String modelo, boolean temCombustivel) {
        super(modelo);
        this.temCombustivel = temCombustivel;
        this.ligado = false; // Carro começa desligado
    }

    @Override
    public void ligar() {
        try {
            if (!temCombustivel) {
                throw new IllegalStateException("Erro: O carro " + modelo + " não pode ser ligado. Combustível insuficiente.");
            }
            if (ligado) {
                throw new IllegalStateException("Erro: O carro " + modelo + " já está ligado.");
            }
            ligado = true;
            System.out.println("O carro " + modelo + " está ligado!");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void ligarWifi() {
        try {
            if (!ligado) {
                throw new IllegalStateException("Erro: O carro " + modelo + " não pode se conectar ao Wi-Fi, pois está desligado.");
            }
            System.out.println("O carro " + modelo + " está conectado ao Wi-Fi para usar Spotify e Waze.");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }

    @Override
    public void desligar() {
        try {
            if (!ligado) {
                throw new IllegalStateException("Erro: O carro " + modelo + " já está desligado.");
            }
            ligado = false;
            System.out.println("O carro " + modelo + " está desligado!");
        } catch (IllegalStateException e) {
            System.out.println(e.getMessage());
        }
    }
}

