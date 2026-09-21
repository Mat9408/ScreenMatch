package com.mt9408.screenmatch.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.mt9408.screenmatch.excecao.ErroDeConversaoException;
import com.mt9408.screenmatch.modelos.Titulo;
import com.mt9408.screenmatch.modelos.TituloOMDB;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;

public class MainComBusca {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner leitura = new Scanner(System.in);
        System.out.println("Pesquisar: ");
        var pesquisa = leitura.nextLine();
        String apiKey = System.getenv("omdbApiKey");
        String endereco = "http://www.omdbapi.com/?t=" + pesquisa + "&apikey=" + apiKey;


        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endereco))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());


            String json = response.body();
            System.out.println(json);

            Gson gson = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE).create();
            //Titulo filme1 = gson.fromJson(json, Titulo.class);
            TituloOMDB filmeomdb = gson.fromJson(json, TituloOMDB.class);
            System.out.println(filmeomdb);


            Titulo filme1 = new Titulo(filmeomdb);
            System.out.println("Título já convertido");
            System.out.println(filme1);
        } catch (NumberFormatException erro) {
            System.out.println("Ocorreu um erro. ");
            System.out.println(erro.getMessage());
        } catch (IllegalArgumentException erro) {
            System.out.println("Erro de argumento na busca. Verifique possíveis espaços na busca.");
        } catch (ErroDeConversaoException erro) {
            System.out.println(erro.getMessage());
        }

        System.out.println("Programa executado com sucesso.");



    }
}
