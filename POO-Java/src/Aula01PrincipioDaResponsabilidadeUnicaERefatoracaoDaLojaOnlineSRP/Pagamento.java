package Aula01PrincipioDaResponsabilidadeUnicaERefatoracaoDaLojaOnlineSRP;

public class Pagamento {
    private String metodoPagamento;
    private double valorDesconto;

    public double calcularPrecoTotal(int quantidade, double precoUnitario, boolean temDesconto) {
        double total = quantidade * precoUnitario;
        if (temDesconto) {
            total -= valorDesconto;
        }
        return total;
    }
}
