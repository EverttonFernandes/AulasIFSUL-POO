package InterfacesEOPrincipioISP.ExemploCorreto;

public class TelevisaoDeTubo implements LigarDispositivo {
    @Override
    public void ligar() {
        System.out.println("A televisão está ligada.");
    }
}
