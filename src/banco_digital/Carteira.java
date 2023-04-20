package banco_digital;

public class Carteira {

	public static void main(String[] args) {
		Cliente novo = new Cliente();
		novo.setNome("Ygor Barbosa");
		
		Conta cc = new ContaCorrente(novo);
		cc.depositar(250);
		Conta cp = new ContaPoupanca(novo);
		cc.transferir(150, cp);
		cc.imprimirExtrato();
		
		cp.imprimirExtrato();
		
		CDB cdb = new CDB(500, 3.5, 90);
		System.out.println(cdb.getDescricao() + "- Rendimento: " + cdb.calcularRendimento());
		
		Acoes acoes = new Acoes("Empresa YSB", 100, 50.0, 60.0);
		System.out.println(acoes.getDescricao() + " - Rendimento: " + acoes.calcularRendimento());

	}

}
