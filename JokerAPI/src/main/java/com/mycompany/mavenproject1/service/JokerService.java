/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1.service;

import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONObject;

/**
 *
 * @author guilh
 */
public class JokerService {
    
    // Método para buscar dados de endereço pelo CEP
    public static JSONObject buscarJoker() throws Exception{
        // Cria o cliente HTTP (OkHttpClient)
        OkHttpClient client = new OkHttpClient();

        // Cria a requisição GET com a URL montada com o CEP
        Request request = new Request.Builder()
            .url("https://v2.jokeapi.dev/joke/Any")
            .get()
            .build(); // .get() é opcional, pois GET é o método padrão

        // Executa a requisição e obtém a resposta
        try (Response response = client.newCall(request).execute()) {
            // Verifica se a requisição foi bem-sucedida (código 200)
            if (!response.isSuccessful()) {
                throw new Exception("Erro ao buscar CEP: " + response);
            }

            // Lê a resposta em formato de texto (JSON)
            String jsonData = response.body().string();

            // Converte a String em um objeto JSON para facilitar o acesso aos dados
            return new JSONObject(jsonData);
        }
    }
}
