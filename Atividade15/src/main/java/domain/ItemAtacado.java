package domain;

public class ItemAtacado {
    private String codigo;
    private String nome;
    private double preco;
    private int estoque;

    public ItemAtacado(String codigo, String nome, double preco, int estoque) {
        this.codigo = codigo;
        this.nome = nome;
        this.preco = preco;
        this.estoque = estoque;
    }

    public String getCodigo() { return codigo; }
    public String getNome() { return nome; }
    public double getPreco() { return preco; }
    public int getEstoque() { return estoque; }
}
