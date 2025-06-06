package br.com.cdb.bancodigital.view;

import br.com.cdb.bancodigital.entity.Cliente;
import br.com.cdb.bancodigital.service.ClienteService;

public class Main {
    public static void main(String[] args) {
        ClienteService clienteService = new ClienteService();

        Cliente cliente1 = clienteService.addCliente("João da Silva", "12345678901");
        Cliente cliente2 = clienteService.addCliente("Maria Oliveira", "98765432100");

        if (cliente1 != null) {
            System.out.println("Cliente 1 adicionado com sucesso!");
            System.out.println("ID: " + cliente1.getId());
            System.out.println("Nome: " + cliente1.getNome());
            System.out.println("CPF: " + cliente1.getCpf());
        } else {
            System.out.println("Erro ao adicionar Cliente 1.");
        }

        if (cliente2 != null) {
            System.out.println("Cliente 2 adicionado com sucesso!");
            System.out.println("ID: " + cliente2.getId());
            System.out.println("Nome: " + cliente2.getNome());
            System.out.println("CPF: " + cliente2.getCpf());
        } else {
            System.out.println("Erro ao adicionar Cliente 2.");
        }

        // Buscar cliente por ID
        String idBusca = "2"; // Altere para testar outros IDs
        Cliente clienteEncontrado = clienteService.buscarClientePorId(idBusca);
        if (clienteEncontrado != null) {
            System.out.println("\n--- Cliente encontrado pelo ID " + idBusca + " ---");
            System.out.println("ID: " + clienteEncontrado.getId());
            System.out.println("Nome: " + clienteEncontrado.getNome());
            System.out.println("CPF: " + clienteEncontrado.getCpf());
        } else {
            System.out.println("Nenhum cliente encontrado com o ID: " + idBusca);
        }
    }
}
