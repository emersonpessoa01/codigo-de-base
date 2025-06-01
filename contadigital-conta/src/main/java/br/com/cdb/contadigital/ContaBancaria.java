package br.com.cdb.contadigital;

// Interface ContaBancaria é uma classe toda abstrata que define os métodos que devem ser implementados por qualquer classe que represente uma conta bancária.
public interface ContaBancaria {
    public abstract double getSaldo();

    public abstract void depositar(double valor);

    public abstract boolean sacar(double valor);

    public abstract void transferir(double valor, ContaBancaria destino);

}
