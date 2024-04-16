package models;
import interfaces.Pessoa;
import interfaces.Planta;

public class Funcionario implements Pessoa {
    private String nome;
    private String cargo;
    private double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public String getInformacoes() {
        return "Cargo: " + cargo + ", Salário: R$" + salario;
    }

    @Override
    public void registrarVenda(Planta planta) {
        // Funcionário não realiza vendas
        System.out.println("Funcionário " + nome + " não tem permissão para registrar vendas.");
    }

    @Override
    public double calcularSalario() {
        return salario;
    }

    public void atenderCliente(String nomeCliente) {
        // Método para atender um cliente específico
        System.out.println("Funcionário " + nome + " está atendendo o cliente " + nomeCliente);
    }
}
