package com.example.classes;

public class Agencias {
    private final String numero;
    private final int id;
    private final int idBanco;

    public Agencias(int id, String numero, int idBanco){
        this.numero = numero;
        this.id = id;
        this.idBanco = idBanco;
    }
    public String getNumero() {
        return numero;
    }
    public int getId() {
        return id;
    }
    public int getIdBanco() {
        return idBanco;
    }

    @Override
    public String toString() {
        return "Agencia: "+numero;
    }
}
