package exception;

import conta.Conta;

public class ValorInvalidoException extends Exception {
    public ValorInvalidoException(Conta conta, double valor){
        super("O valor (" + valor + ") é inválido! Precisa ser maior que 0.0");
        conta.imprimirExtrato();
    }
}
