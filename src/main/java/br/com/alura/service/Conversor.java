package br.com.alura.service;

import java.util.Map;

public class Conversor {

    ApiService apiService = new ApiService();

    public double converter(String baseCode, String targetCode, double value) {
        double exchangeRateate = apiService.getExchangeRate(baseCode, targetCode);

        return value * exchangeRateate;
    }

    public Map<String, Double> getAvailableCurrencies(String baseCode) {
        return apiService.getAvailableCurrencies(baseCode);
    }
}
