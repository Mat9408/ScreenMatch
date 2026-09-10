package com.mt9408.screenmatch.calculos;

public class FiltroRecomendacao {

    public void filtrar(Classificavel classificavel) {
        if (classificavel.getClassificacao() >=4) {
            System.out.println("Está entre os preferidos no momento.");
        } else if (classificavel.getClassificacao() >=2) {
            System.out.println("Muito bem avaliado no momento.");
        } else  {
            System.out.println("Adicione na sua lista de preferência para assistir depois.");
        }

    }
}
