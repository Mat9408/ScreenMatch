package com.mt9408.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{

    private String nome;
    private int anoDeLancamento;
    private String genero;
    private boolean incluidoNoPlano;
    private double somaDeAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;


    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoDeLancamento);
        System.out.println("Gênero: " + genero);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getNome(){
        return nome;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public int getAnoDeLancamento(){
        return anoDeLancamento;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero(){
        return genero;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public boolean getIncluidoNoPlano(){
        return  incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getDuracaoEmMinutos(){
        return duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes(){
        return  totalDeAvaliacoes;
    }

    public double getSomaDeAvaliacoes(){
        return somaDeAvaliacoes;
    }

    public void avalia(double nota){
        somaDeAvaliacoes += nota;
        totalDeAvaliacoes ++;
    }

    public double mediaDeAvaliacoes(){
        return  somaDeAvaliacoes / totalDeAvaliacoes;
    }


    public double getMediaDeAvaliacoes() {
        return somaDeAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}


