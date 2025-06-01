package br.com.cdb.contadigital;

public class Main {
    public static void main(String[] args) {
        ContaBancaria cc = new ContaCorrente();
        cc.depositar(1000.0);

        ContaPoupanca cp = new ContaPoupanca();
        cp.depositar(500.0);

        cc.depositar(500.0);
        cp.sacar(200.0);
        cc.transferir(300.0, cp);
        System.out.println("Saldo da Conta Corrente: " + cc.getSaldo());
        System.out.println("Saldo da Conta Poupança: " + cp.getSaldo());

    }
}