package conta;

import cliente.Cliente;
import exception.SaldoInsuficienteException;
import exception.ValorInvalidoException;

public abstract class Conta implements IConta {

	private static final int AGENCIA_PADRAO = 1;
	private static int SEQUENCIAL = 1;

	protected int agencia;
	protected int numero;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.numero = SEQUENCIAL++;
		this.cliente = cliente;
	}

	@Override
	public void sacar(double valor) throws SaldoInsuficienteException, ValorInvalidoException {
		if (valor <= 0.0) throw new ValorInvalidoException(this, valor);
		if (valor > saldo) throw new SaldoInsuficienteException(this, valor);
		saldo -= valor;
	}

	@Override
	public void depositar(double valor) throws ValorInvalidoException {
		if (valor <= 0.0) throw new ValorInvalidoException(this, valor);
		saldo += valor;
	}

	@Override
	public void transferir(double valor, IConta contaDestino) throws Exception {
		this.sacar(valor);
		contaDestino.depositar(valor);
	}

	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}

	protected void imprimirInfosComuns() {
		System.out.println("Titular: " + this.cliente.getNome());
		System.out.println("Agencia: " + this.agencia);
		System.out.println("Numero: " + this.numero);
		System.out.println("Saldo: " + this.saldo);
	}
}
