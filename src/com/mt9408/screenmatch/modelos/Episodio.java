package com.mt9408.screenmatch.modelos;

import com.mt9408.screenmatch.calculos.Classificavel;

public class Episodio implements Classificavel {

    private int numero;
    private String nome;
    private Serie serie;
    private int TotalDeVisualizacoes;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalDeVisualizacoes() {
        return getTotalDeVisualizacoes();
    }

    public void setTotalDeVisualizacoes(int TotalDeVisualizacoes) {
        this.TotalDeVisualizacoes = TotalDeVisualizacoes;
    };

    @Override
    public int getClassificacao() {
        if (TotalDeVisualizacoes > 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
