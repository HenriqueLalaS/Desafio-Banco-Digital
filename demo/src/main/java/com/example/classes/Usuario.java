package com.example.classes;

public class Usuario {
    private String nome;
    private Conta conta;
    private String senhaApp;
    private String senhaTrans;

    public Usuario(String nome, String senhaApp, String senhaTrans, String numeroConta, String agencia){
        this.nome = nome;
        this.senhaApp = senhaApp;
        this.senhaTrans = senhaTrans;

        this.conta = new Conta(numeroConta, agencia, nome);
    }

    public void depositarDinheiro(double valor){
        double saldo = conta.getSaldo();
        saldo +=valor;
        conta.setSaldo(saldo);
    }

    public String getNome() {
        return nome;
    }

    public Conta getConta() {
        return conta;
    }

    public String getSenhaApp() {
        return senhaApp;
    }

    public String getSenhaTrans() {
        return senhaTrans;
    }

    @Override
    public String toString() {
        return "nome: "+nome+
               "conta: "+conta;
    }
}
