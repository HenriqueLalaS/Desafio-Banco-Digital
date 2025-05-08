package com.example.classes;

public class Conta{
    private String numeroConta;
    private double saldo;
    private double credito;
    private double saldoGuardado;

    private String agencia;
    private String usuario;

    Conta(String numeroConta, String agencia, String usuario){
        this.numeroConta = numeroConta;
        this.agencia = agencia;
        this.usuario = usuario;
    }

    public double getCredito() {
        return credito;
    }

    public double getSaldo() {
        return saldo;
    }

    void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldoGuardado() {
        return saldoGuardado;
    }

    public String getNumeroConta() {
        return numeroConta;
    }

    public String getAgencia() {
        return agencia;
    }

    public String getUsuario() {
        return usuario;
    }


    @Override
    public String toString() {
        return numeroConta;
    }
}
