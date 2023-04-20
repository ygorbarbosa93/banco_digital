package banco_digital;

public class Acoes implements TipoInvestimento {
    private String nomeEmpresa;
    private int quantidadeAcoes;
    private double precoAcao;
    private double precoVenda;
    
    public Acoes(String nomeEmpresa, int quantidadeAcoes, double precoAcao, double precoVenda) {
        this.nomeEmpresa = nomeEmpresa;
        this.quantidadeAcoes = quantidadeAcoes;
        this.precoAcao = precoAcao;
        this.precoVenda = precoVenda;
    }
    
    public double calcularRendimento() {
        return quantidadeAcoes * (precoVenda - precoAcao);
    }
    
    public String getDescricao() {
        return "Ações da empresa " + nomeEmpresa;
    }
}

