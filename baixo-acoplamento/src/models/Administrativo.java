package models;

import java.util.List;

import interfaces.Pessoa;
import interfaces.Planta;

public class Administrativo implements Pessoa {
    private String nome;
    private String cargo;
    private String departamento;

    public Administrativo(String nome, String cargo, String departamento) {
        this.nome = nome;
        this.cargo = cargo;
        this.departamento = departamento;
    }

    public double gerarRelatorioVendas(List<Pessoa> pessoas) {
        double totalVendas = 0;

        for (Pessoa pessoa : pessoas) {
            if (pessoa instanceof Cliente) {
                Cliente cliente = (Cliente) pessoa;
                List<Planta> compras = cliente.getCompras();
                for (Planta planta : compras) {
                    totalVendas += planta.getPreco();
                }
            }
        }

        return totalVendas;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getInformacoes() {
        return "Nome: " + nome + ", Cargo: " + cargo + ", Departamento: " + departamento;
    }

    @Override
    public void registrarVenda(Planta planta) {
        // Método não implementado para Administrativo
    }

    @Override
    public double calcularSalario() {
        // Método não implementado para Administrativo
        return 0;
    }
}
