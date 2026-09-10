package com.mt9408.screenmatch.principal;

import com.mt9408.screenmatch.calculos.FiltroRecomendacao;
import com.mt9408.screenmatch.modelos.Filme;
import com.mt9408.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args){
        Filme filme1 = new Filme("O Poderoso Chefão", 1972);
        filme1.setDuracaoEmMinutos(175);
        filme1.setGenero("Ação");
        filme1.setIncluidoNoPlano(true);

        filme1.exibeFichaTecnica();
        filme1.avalia(8);
        filme1.avalia(6);
        filme1.avalia(10);
        filme1.avalia(8.5);
        filme1.avalia(6.5);

        System.out.println("Nome: " + filme1.getNome());
        System.out.println(filme1.getAnoDeLancamento());
        System.out.println(filme1.getDuracaoEmMinutos());
        System.out.println(filme1.getGenero());
        System.out.println(filme1.getIncluidoNoPlano());

        System.out.println(filme1.getTotalDeAvaliacoes());
        System.out.println(filme1.getMediaDeAvaliacoes());

        Serie serie1 = new Serie("The Chosen", 2019);
        serie1.setTemporadas(5);
        serie1.setEpisodioPorTemporada(6);
        serie1.setMinutosPorEpisodio(50);
        serie1.setAtiva(true);

        System.out.println(serie1.getNome());
        System.out.println(serie1.getTemporadas());
        System.out.println(serie1.getAtiva());
        System.out.println("Minutos para maratonar: " + serie1.getDuracaoEmMinutos());

        Filme filme2 = new Filme("Harry Potter",2001);
        filme2.setDuracaoEmMinutos(125);
        filme2.avalia(10.00);
        filme2.avalia(10.00);
        filme2.avalia(10.00);
        filme2.avalia(9.00);
        filme2.avalia(9.5);


        /*CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(filme1);
        calculadora.inclui(filme2);
        calculadora.inclui(serie1);
        System.out.println("Tempo total a assistir: " + calculadora.getTempoTotal());*/


        System.out.println(filme2.getSomaDeAvaliacoes());
        System.out.println(filme2.getTotalDeAvaliacoes());
        System.out.println(filme2.mediaDeAvaliacoes());

        /*Episodio ep1 = new Episodio();
        ep1.setNumero(1);
        ep1.setSerie(serie1);
        ep1.setTotalDeVisualizacoes(300);*/

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(filme2);

        var filme3 = new Filme("Três homens em conflito.",1966);
        filme3.setDiretor("Sergio Leone");
        filme3.setGenero("Faroeste");

        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filme1);
        listaDeFilmes.add(filme2);
        listaDeFilmes.add(filme3);
        System.out.println("Tamanho da lista de filmes: " + listaDeFilmes.size());
        System.out.println("Primeiro filme da lista: " + listaDeFilmes.getFirst().getNome());
        System.out.println(listaDeFilmes);






    }

}