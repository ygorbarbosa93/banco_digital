package banco_digital;

public class CDB implements TipoInvestimento {
    private double valorInvestido;
    private double taxaJuros;
    private int prazoVencimento;
    
    public CDB(double valorInvestido, double taxaJuros, int prazoVencimento) {
        this.valorInvestido = valorInvestido;
        this.taxaJuros = taxaJuros;
        this.prazoVencimento = prazoVencimento;
    }
    
    public double calcularRendimento() {
        double juros = valorInvestido * (taxaJuros / 100) * (prazoVencimento / 365.0);
        double valorTotal = valorInvestido + juros;
        return valorTotal - valorInvestido;
    }
    
    public String getDescricao() {
        return "CDB - Valor investido: " + valorInvestido + ", Taxa de juros: " + taxaJuros + ", Prazo de vencimento: " + prazoVencimento;
    }
}


