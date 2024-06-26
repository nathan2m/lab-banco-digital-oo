import cliente.Cliente;
import conta.Conta;
import conta.Corrente;
import conta.Poupanca;

public class Main {
    public static void main(String[] args) throws Exception {
        final Cliente nathan = new Cliente();
		nathan.setNome("Nathan");
		
		final Conta cc = new Corrente(nathan);
		final Conta poupanca = new Poupanca(nathan);

		cc.depositar(100);
		cc.transferir(100, poupanca);
		
		cc.imprimirExtrato();
        System.out.println();
		poupanca.imprimirExtrato();
    }
}
