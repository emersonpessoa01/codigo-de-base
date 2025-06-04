public enum FormaDePagamento {
    // Enum associado aos atributos de pagamento
    DINHEIRO("DIN","Dinheiro"),
    CARTAO_CREDITO("CCR","Cartão de Crédito"),
    CARTAO_DEBITO("CDB","Cartão de Débito"),
    PIX("PIX","Pix"),
    TRANSFERENCIA("TRF","Transferência");


    private final String codigo;
    private final String descricao;
    FormaDePagamento(String codigo, String descricao) {
        this.codigo = codigo;
        this.descricao = descricao;
    }

    public String getCodigo() {
        return codigo;
    }

    public String getDescricao() {
        return descricao;
    }
}
