package Aula01PrincipioDaResponsabilidadeUnicaERefatoracaoDaLojaOnlineSRP;

public class Pedido {
    private String identificadorPedido;
    private Cliente cliente;
    private Produto produto;
    private Pagamento pagamento;
    // Processamento de pedido
    public void processarPedido() {
        System.out.println("Processando pedido do cliente: " + cliente.getNome());
        System.out.println("Produto: " + produto.getNomeProduto() + ", Quantidade: " + produto.getQuantidade());
        System.out.println("Preço total: R$ " + this.obterPagamento());

        // Aplicar desconto se houver
        if (produto.isTemDesconto()) {
            System.out.println("Aplicando desconto de: R$ " + this.obterPagamento());
        }
    }

    public double obterPagamento(){
        return pagamento.calcularPrecoTotal(produto.getQuantidade(), produto.getPrecoUnitario(), produto.isTemDesconto());
    }
}
