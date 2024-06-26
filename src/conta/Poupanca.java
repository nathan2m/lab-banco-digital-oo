package conta;

import cliente.Cliente;

public class Poupanca extends Conta {

    public Poupanca(Cliente cliente) {
		super(cliente);
	}

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupança ===");
		super.imprimirInfosComuns();
	}
    
}
