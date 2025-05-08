package com.example.classes;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private final int id;
    private String nome;
    private List<Agencias> agencias;
    private List<Conta> contas;

    public Banco(int id, String nome){
        this.id = id;
        this.nome = nome;
        this.agencias = new ArrayList<>();
        this.contas = new ArrayList<>();
    }

    public void adicionarAgencia(int idAgencia, String numero){
        agencias.add(new Agencias(idAgencia, numero, id));
    }

    public void adicionarConta(){

    }
    
    public int getId() {
        return id;
    }

    public String getNome() {
        return nome;
    }

    public List<Agencias> getAgencias() {
        return agencias;
    }

    public List<Conta> getContas() {
        return contas;
    }
}
