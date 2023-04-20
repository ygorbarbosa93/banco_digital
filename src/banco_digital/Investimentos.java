package banco_digital;

import java.util.Date;

public class Investimentos {
	private Banco banco;
	private TipoInvestimento tipo;
	private double valorMin;
	private int prazoMinimo;
	private int prazoMaximo;
	private  double taxaJuros;
	private double rentabilidade;
	private Date dataInicio;
	private Date dataVencimento;
	private String status;
	public Investimentos(Banco banco, TipoInvestimento tipo, double valorMin, int prazoMinimo, int prazoMaximo,
			double taxaJuros, double rentabilidade, Date dataInicio, Date dataVencimento, String status) {
		super();
		this.banco = banco;
		this.tipo = tipo;
		this.valorMin = valorMin;
		this.prazoMinimo = prazoMinimo;
		this.prazoMaximo = prazoMaximo;
		this.taxaJuros = taxaJuros;
		this.rentabilidade = rentabilidade;
		this.dataInicio = dataInicio;
		this.dataVencimento = dataVencimento;
		this.status = status;
	}
	public Banco getBanco() {
		return banco;
	}
	public void setBanco(Banco banco) {
		this.banco = banco;
	}
	public TipoInvestimento getTipo() {
		return tipo;
	}
	public void setTipo(TipoInvestimento tipo) {
		this.tipo = tipo;
	}
	public double getValorMin() {
		return valorMin;
	}
	public void setValorMin(double valorMin) {
		this.valorMin = valorMin;
	}
	public int getPrazoMinimo() {
		return prazoMinimo;
	}
	public void setPrazoMinimo(int prazoMinimo) {
		this.prazoMinimo = prazoMinimo;
	}
	public int getPrazoMaximo() {
		return prazoMaximo;
	}
	public void setPrazoMaximo(int prazoMaximo) {
		this.prazoMaximo = prazoMaximo;
	}
	public double getTaxaJuros() {
		return taxaJuros;
	}
	public void setTaxaJuros(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}
	public double getRentabilidade() {
		return rentabilidade;
	}
	public void setRentabilidade(double rentabilidade) {
		this.rentabilidade = rentabilidade;
	}
	public Date getDataInicio() {
		return dataInicio;
	}
	public void setDataInicio(Date dataInicio) {
		this.dataInicio = dataInicio;
	}
	public Date getDataVencimento() {
		return dataVencimento;
	}
	public void setDataVencimento(Date dataVencimento) {
		this.dataVencimento = dataVencimento;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	
	
	
	

}
