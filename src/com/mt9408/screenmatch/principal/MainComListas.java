package com.mt9408.screenmatch.principal;

import com.mt9408.screenmatch.modelos.Filme;
import com.mt9408.screenmatch.modelos.Serie;
import com.mt9408.screenmatch.modelos.Titulo;

import java.util.*;

public class MainComListas {
    public static void main(String[] args) {
        Filme filme1 = new Filme("O Poderoso Chefão", 1972);
        filme1.avalia(9);
        Filme filme2 = new Filme("Harry Potter",2001);
        filme2.avalia(5);
        Filme filme3 = new Filme("Três homens em conflito",1966);
        filme3.avalia(10);
        Serie serie1 = new Serie("The Chosen", 2019);

        List<Titulo> lista = new LinkedList<>();
        lista.add(filme1);
        lista.add(filme2);
        lista.add(filme3);
        lista.add(serie1);

        for(Titulo item : lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Will Smith");
        buscaPorArtista.add("Eddie Murphy");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);
        System.out.println("Depois da ordenação");
        System.out.println(buscaPorArtista);

        Collections.sort(lista);
        System.out.println(lista);

        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println("Ordenação por ano");
        System.out.println(lista);




    }
}
