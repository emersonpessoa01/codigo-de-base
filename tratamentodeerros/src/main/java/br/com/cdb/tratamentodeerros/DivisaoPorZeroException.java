package br.com.cdb.tratamentodeerros;

/**
 * Exceção personalizada para tratar casos de divisão por zero.
 * Esta classe estende a classe Exception e inclui um valor padrão.
 */
public class DivisaoPorZeroException extends Exception {
    private static final long serialVersionUID = 1L;
    private int valorPadrao;

    public DivisaoPorZeroException(String message) {
        super(message);
        valorPadrao = 1;
    }

    public int getValorPadrao() {
        return valorPadrao;
    }

}
