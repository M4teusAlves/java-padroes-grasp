package models;

import java.util.ArrayList;
import java.util.List;

import interfaces.Pessoa;
import interfaces.Planta;

public class Cliente implements Pessoa {
    private String nome;
    private String endereco;
    private String email;
    private String telefone;
    private List<Planta> compras;

    public Cliente(String nome, String endereco, String email, String telefone) {
        this.nome = nome;
        this.endereco = endereco;
        this.email = email;
        this.telefone = telefone;
        this.compras = new ArrayList<>();
    }

    public void adicionarCompra(Planta planta) {
        compras.add(planta);
    }

    public List<Planta> getCompras() {
        return compras;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getInformacoes() {
        return "Nome: " + nome + ", Endereço: " + endereco + ", Email: " + email + ", Telefone: " + telefone;
    }

    @Override
    public void registrarVenda(Planta planta) {
        adicionarCompra(planta); // Adiciona a planta às compras do cliente
        // O cliente não precisa fazer nada aqui além de adicionar a planta à sua lista de compras
    }

    @Override
    public double calcularSalario() {
        // Método não implementado para Cliente
        return 0;
    }
}
