package br.com.alura.service;

import br.com.alura.model.CurrencyConversor;
import com.google.gson.Gson;


import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Map;


public class ApiService {
    private final String BASE_API = "https://v6.exchangerate-api.com/v6/";
    private final String KEY = "0bb307ae16bc4cc01a37508c";

    public Map<String, Double> getAvailableCurrencies(String baseCode){
        String endpoint = BASE_API + KEY + "/latest/" + baseCode ;

        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endpoint))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();

            CurrencyConversor conversion = gson.fromJson(response.body(),CurrencyConversor.class);

            return conversion.getConversion_rates();

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }

    }

    public Double getExchangeRate(String baseCode, String targetCode){
        String endpoint = BASE_API + KEY + "/pair/" + baseCode + "/" + targetCode;

        try{
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(endpoint))
                    .build();
            HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());

            Gson gson = new Gson();

            CurrencyConversor conversion = gson.fromJson(response.body(),CurrencyConversor.class);

            return conversion.getConversion_rate();

        } catch (Exception e) {
            e.printStackTrace();
            return 0d;
        }
    }

}
