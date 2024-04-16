package models;
import interfaces.Planta;

public class Cactos implements Planta {
    private String nome;
    private double preco;
    private String tipo;
    private String descricao;
    private int quantidadeEstoque;

    public Cactos(String nome, double preco, String tipo, int quantidadeEstoque) {
        this.nome = nome;
        this.preco = preco;
        this.tipo = tipo;
        this.quantidadeEstoque = quantidadeEstoque;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String getTipo() {
        return tipo;
    }

    @Override
    public String getDescricao() {
        return descricao;
    }

    @Override
    public int getQuantidadeEstoque() {
        return quantidadeEstoque;
    }

    @Override
    public void setQuantidadeEstoque(int quantidade) {
        this.quantidadeEstoque = quantidade;
    }
}
