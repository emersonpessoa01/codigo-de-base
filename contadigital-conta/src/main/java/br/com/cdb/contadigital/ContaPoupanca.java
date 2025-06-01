package br.com.cdb.contadigital;

public class ContaPoupanca implements ContaBancaria {
    private double saldo;
    private double taxaRendimento;

    @Override
    public double getSaldo() {
        return saldo;
    }

    @Override
    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        } else {
            throw new IllegalArgumentException("Valor de depósito deve ser positivo.");
        }
    }

    @Override
    public boolean sacar(double valor) {
        valor = valor + 1; // Simulando uma taxa de saque de R$1,00
        if (valor > 0 && valor <= saldo) {
            saldo -= valor;
            return true;
        } else {
            throw new IllegalArgumentException("Valor de saque inválido ou saldo insuficiente.");
        }
    }

    @Override
    public void transferir(double valor, ContaBancaria destino) {
        if (valor > 0 && valor <= saldo) {
            sacar(valor);
            destino.depositar(valor);
        } else {
            throw new IllegalArgumentException("Valor de transferência inválido ou saldo insuficiente.");
        }
    }

}
