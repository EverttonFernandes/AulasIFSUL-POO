package Aula01PrincipioDaResponsabilidadeUnicaERefatoracaoDaLojaOnlineSRP;

public class Produto {
    private int quantidade;
    private double precoUnitario;
    private boolean temDesconto;
    private String nomeProduto;

    public String getNomeProduto() {
        return this.nomeProduto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public boolean isTemDesconto() {
        return temDesconto;
    }
}
