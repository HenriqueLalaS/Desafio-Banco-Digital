package com.example;

import java.util.Random;

import com.example.classes.Agencias;
import com.example.classes.Banco;
import com.example.classes.Conta;
import com.example.classes.Usuario;

public class App {
    public static void main(String[] args) {
        Banco banco = new Banco(1, "Banco Exemplo");

        // Adicionar agências
        banco.adicionarAgencia(1, "001-A");
        banco.adicionarAgencia(2, "002-B");
        banco.adicionarAgencia(3, "003-C");

        // Mostrar agências disponíveis
        System.out.println("Agências disponíveis:");
        for (Agencias agencia : banco.getAgencias()) {
            System.out.println("- " + agencia);
        }

        // Escolher agência aleatória
        Random random = new Random();
        Agencias agenciaAleatoria = banco.getAgencias().get(random.nextInt(banco.getAgencias().size()));
        System.out.println("\nAgência escolhida aleatoriamente: " + agenciaAleatoria);

        // Criar usuário
        Usuario usuario = new Usuario(
                "Maria Oliveira",
                "senhaApp123",
                "senhaTrans456",
                "123456-7",
                agenciaAleatoria.getNumero()
        );

        // Depositar dinheiro
        usuario.depositarDinheiro(500.0);

        // Adicionar conta no banco
        banco.getContas().add(usuario.getConta());

        // Exibir informações do banco
        System.out.println("\n--- Informações do banco ---");
        System.out.println("Banco: " + banco.getNome());
        System.out.println("Total de contas: " + banco.getContas().size());

        for (Conta conta : banco.getContas()) {
            System.out.println("Conta: " + conta.getNumeroConta());
            System.out.println("Agência: " + conta.getAgencia());
            System.out.println("Usuário: " + conta.getUsuario());
            System.out.println("Saldo: R$ " + conta.getSaldo());
        }
    }
}