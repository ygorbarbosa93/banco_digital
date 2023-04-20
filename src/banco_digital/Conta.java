package banco_digital;

public abstract class Conta implements IConta {
	private static final int AGENCIA_PADRAO = 1;

	private static  int SEQUENCIAL = 1;
	
	protected int agencia;
	protected int conta;
	protected double saldo;
	protected Cliente cliente;

	public Conta(Cliente cliente ) {
		this.agencia = Conta.AGENCIA_PADRAO;
		this.conta = Conta.SEQUENCIAL++;
		this.cliente = cliente;
	}
	
	
	
	@Override
	public void sacar(double valor) {
		this.saldo -= valor;

	}

	@Override
	public void depositar(double valor) {
		this.saldo += valor;

	}

	public void transferir(double valor, Conta contadestino) {
		this.sacar(valor);
		contadestino.depositar(valor);

	}

	public int getAgencia() {
		return agencia;
	}

	public int getConta() {
		return conta;
	}

	public double getSaldo() {
		return saldo;
	}

	
	protected void imprimirDadosBancarios() {
		System.out.println(String.format("Títular: %s ", this.cliente.getNome()));
		System.out.println(String.format("Agência: %d", this.agencia));
		System.out.println(String.format("Conta: %d", this.conta));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
