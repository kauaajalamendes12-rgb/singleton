package com.senai.singleton.entidades;

public class Carro {
    private String cor;
    private String modelo;
    private String marca;
    private Integer ano;

    public Carro(Integer ano, String cor, String marca, String modelo) {
        this.ano = ano;
        this.cor = cor;
        this.marca = marca;
        this.modelo = modelo;
    }

    public Integer getAno() {
        return ano;
    }

    public void setAno(Integer ano) {
        this.ano = ano;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }
}
