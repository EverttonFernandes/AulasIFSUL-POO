package Aula01SegundoSemestre2024;

public class LojaOnline {

    // Atributos relacionados ao pedido
    private String cliente;
    private String produto;
    private int quantidade;
    private double precoUnitario;

    // Atributos relacionados ao pagamento
    private String metodoPagamento;

    // Atributos relacionados ao desconto
    private boolean temDesconto;
    private double valorDesconto;

    // Atributos relacionados ao relatório
    private String periodoRelatorio;

    public LojaOnline(String cliente, String produto, int quantidade, double precoUnitario) {
        this.cliente = cliente;
        this.produto = produto;
        this.quantidade = quantidade;
        this.precoUnitario = precoUnitario;
    }

    // Processamento de pedido
    public void processarPedido() {
        System.out.println("Processando pedido do cliente: " + cliente);
        System.out.println("Produto: " + produto + ", Quantidade: " + quantidade);
        System.out.println("Preço total: R$ " + calcularPrecoTotal());

        // Aplicar desconto se houver
        if (temDesconto) {
            System.out.println("Aplicando desconto de: R$ " + valorDesconto);
        }
    }

    // Cálculo do preço total do pedido
    public double calcularPrecoTotal() {
        double total = quantidade * precoUnitario;
        if (temDesconto) {
            total -= valorDesconto;
        }
        return total;
    }

    // Processamento de pagamento
    public void processarPagamento(String metodoPagamento) {
        this.metodoPagamento = metodoPagamento;
        System.out.println("Processando pagamento com o método: " + metodoPagamento);
    }

    // Envio de e-mail de confirmação
    public void enviarEmailConfirmacao() {
        System.out.println("Enviando e-mail de confirmação para o cliente: " + cliente);
    }

    // Geração de relatório de vendas
    public void gerarRelatorioVendas(String periodo) {
        this.periodoRelatorio = periodo;
        System.out.println("Gerando relatório de vendas para o período: " + periodo);
    }

    // Aplicação de desconto no pedido
    public void aplicarDesconto(double valorDesconto) {
        this.temDesconto = true;
        this.valorDesconto = valorDesconto;
        System.out.println("Desconto de R$ " + valorDesconto + " aplicado.");
    }
}
