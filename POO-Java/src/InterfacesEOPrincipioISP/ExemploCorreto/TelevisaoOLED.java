package InterfacesEOPrincipioISP.ExemploCorreto;

public class TelevisaoOLED implements Bluetooth, Wifi{
    @Override
    public void conectarBluetooth() {
        System.out.println("A televisão está com a conexão bluetooth ligada.");
    }

    @Override
    public void conectarWiFi() {
        System.out.println("A televisão está conectada ao Wifi.");
    }
}
