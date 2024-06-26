package exception;

import conta.Conta;

public class SaldoInsuficienteException extends Exception {
    public SaldoInsuficienteException(Conta conta, double valor) {
        super("Saldo Insuficiente para sacar: " + valor);
        conta.imprimirExtrato();
    }
}
