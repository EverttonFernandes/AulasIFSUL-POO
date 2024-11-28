package InterfacesEOPrincipioISP.ExemploReal.abstracao;

public abstract class Veiculo {
    protected String modelo;

    protected Veiculo(String modelo) {
        this.modelo = modelo;
    }
}