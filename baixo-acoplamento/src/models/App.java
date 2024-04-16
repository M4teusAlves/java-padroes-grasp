package models;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import interfaces.Pessoa;
import interfaces.Planta;

public class App {
    public static void main(String[] args) {
        List<Planta> estoque = new ArrayList<>();
        List<Pessoa> pessoas = new ArrayList<>();
        
        // Inicialização de objetos já cadastrados
        Administrativo administrador = new Administrativo("João", "Gerente", "Administração");
        Funcionario funcionario1 = new Funcionario("Maria", "Vendedor", 2000.0);
        Funcionario funcionario2 = new Funcionario("Pedro", "Jardineiro", 1500.0);
        Cliente cliente1 = new Cliente("Ana", "Rua A, 123", "ana@example.com", "123456789");
        Cliente cliente2 = new Cliente("Carlos", "Rua B, 456", "carlos@example.com", "987654321");

        Planta planta1 = new Cactos("Cacto Espinho de Peru", 15.99, "Cacto", 10);
        Planta planta2 = new Cactos("Cacto Rabo de Macaco", 19.99, "Cacto", 8);
        Planta planta3 = new Frutiferas("Limoeiro", 29.99, "Árvore Frutífera", 5);
        Planta planta4 = new Frutiferas("Laranjeira", 34.99, "Árvore Frutífera", 7);
        Planta planta5 = new Ornamentais("Samambaia", 12.50, "Ornamental", 15);
        Planta planta6 = new Ornamentais("Begônia", 8.99, "Ornamental", 12);
        Planta planta7 = new Aromaticas("Manjericão", 5.99, "Aromática", 20);
        Planta planta8 = new Aromaticas("Alecrim", 7.50, "Aromática", 18);

        estoque.add(planta1);
        estoque.add(planta2);
        estoque.add(planta3);
        estoque.add(planta4);
        estoque.add(planta5);
        estoque.add(planta6);
        estoque.add(planta7);
        estoque.add(planta8);

        pessoas.add(administrador);
        pessoas.add(funcionario1);
        pessoas.add(funcionario2);
        pessoas.add(cliente1);
        pessoas.add(cliente2);

        // Adicionando algumas vendas já inseridas nos clientes
        cliente1.adicionarCompra(planta1);
        cliente1.adicionarCompra(planta3);
        cliente2.adicionarCompra(planta2);
        cliente2.adicionarCompra(planta5);
        cliente2.adicionarCompra(planta7);

        Scanner scanner = new Scanner(System.in);
        int opcao;
        do {
            System.out.println("\n==== Menu Principal ====");
            System.out.println("1. Cadastrar nova planta");
            System.out.println("2. Listar plantas disponíveis");
            System.out.println("3. Registrar venda");
            System.out.println("4. Gerar relatório de vendas (administrativo)");
            System.out.println("5. Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine(); // Limpar o buffer

            switch (opcao) {
                case 1:
                    System.out.println("\n==== Cadastrar Nova Planta ====");
                    System.out.print("Nome: ");
                    String nome = scanner.nextLine();
                    System.out.print("Preço: ");
                    double preco = scanner.nextDouble();
                    scanner.nextLine(); // Limpar o buffer
                    System.out.print("Tipo: ");
                    String tipo = scanner.nextLine();
                    System.out.print("Quantidade em estoque: ");
                    int quantidade = scanner.nextInt();
                    scanner.nextLine(); 

                    Planta novaPlanta = null;
                    if (tipo.equalsIgnoreCase("Cacto")) {
                        novaPlanta = new Cactos(nome, preco, tipo, quantidade);
                    } else if (tipo.equalsIgnoreCase("Árvore Frutífera")) {
                        novaPlanta = new Frutiferas(nome, preco, tipo, quantidade);
                    } else if (tipo.equalsIgnoreCase("Ornamental")) {
                        novaPlanta = new Ornamentais(nome, preco, tipo, quantidade);
                    } else if (tipo.equalsIgnoreCase("Aromática")) {
                        novaPlanta = new Aromaticas(nome, preco, tipo, quantidade);
                    }

                    if (novaPlanta != null) {
                        estoque.add(novaPlanta);
                        System.out.println("Planta cadastrada com sucesso!");
                    } else {
                        System.out.println("Tipo de planta inválido!");
                    }
                    break;
                case 2:
                    System.out.println("\n==== Lista de Plantas Disponíveis ====");
                    for (Planta planta : estoque) {
                        System.out.println("Nome: " + planta.getNome() + ", Preço: R$" + planta.getPreco() +
                                ", Tipo: " + planta.getTipo() +
                                ", Quantidade em estoque: " + planta.getQuantidadeEstoque());
                    }
                    break;
                case 3:
                    System.out.println("\n==== Registrar Venda ====");
                    System.out.print("Cliente (Nome): ");
                    String nomeCliente = scanner.nextLine();
                    Pessoa cliente = null;
                    for (Pessoa p : pessoas) {
                        if (p instanceof Cliente && p.getNome().equalsIgnoreCase(nomeCliente)) {
                            cliente = p;
                            break;
                        }
                    }
                    if (cliente == null) {
                        System.out.println("Cliente não encontrado!");
                        break;
                    }

                    System.out.print("Planta (Nome): ");
                    String nomePlanta = scanner.nextLine();
                    Planta plantaVenda = null;
                    for (Planta p : estoque) {
                        if (p.getNome().equalsIgnoreCase(nomePlanta)) {
                            plantaVenda = p;
                            break;
                        }
                    }
                    if (plantaVenda == null) {
                        System.out.println("Planta não encontrada!");
                        break;
                    }

                    cliente.registrarVenda(plantaVenda);
                    int novaQuantidade = plantaVenda.getQuantidadeEstoque() - 1;
                    plantaVenda.setQuantidadeEstoque(novaQuantidade);
                    System.out.println("Venda registrada com sucesso!");
                    break;
                case 4:
                    System.out.println("\n==== Relatório de Vendas ====");
                    if (administrador != null) {
                        double vendas = administrador.gerarRelatorioVendas(pessoas);
                        System.out.println("Total de vendas: R$" + vendas);
                    } else {
                        System.out.println("Nenhum administrador cadastrado!");
                    }
                    break;
                case 5:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida. Por favor, escolha novamente.");
            }
        } while (opcao != 5);
        scanner.close();
    }
}