package domain;

public class Produto {
    private String codigo;
    private String nome;
    private double precoFinal;
    private int quantidadeEstoque;
    private String fornecedor;
    private boolean disponivel;

    public Produto(String codigo, String nome, double precoFinal, int quantidadeEstoque, String fornecedor) {
        this.codigo = codigo;
        this.nome = nome;
        this.precoFinal = precoFinal;
        this.quantidadeEstoque = quantidadeEstoque;
        this.fornecedor = fornecedor;
        this.disponivel = quantidadeEstoque > 0;
    }

    public String getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public double getPrecoFinal() { return precoFinal; }
    public int getQuantidadeEstoque() { return quantidadeEstoque; }
    public String getFornecedor() { return fornecedor; }
    public boolean isDisponivel() { return disponivel; }

    @Override
    public String toString() {
        return "Produto{codigo='" + codigo + "', nome='" + nome + "', precoFinal=" + precoFinal +
                ", quantidadeEstoque=" + quantidadeEstoque + ", fornecedor='" + fornecedor +
                "', disponivel=" + disponivel + "}";
    }
}
