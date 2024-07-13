package br.com.alura.view;

import br.com.alura.service.Conversor;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class View {
    private Scanner scanner = new Scanner(System.in);
    private Conversor conversor = new Conversor();

    private void showMessage(String message){
        System.out.printf(message + "\n");
    }
    public void showMenuInterface(){
        showMessage("Selecione o número opção de conversão:\n" +
                "1. Dólar para Real\n" +
                "2. Real para Dólar\n" +
                "3. Escolher outras moedas\n" +
                "4. Sair");
    }
    public int readOption(){
        return scanner.nextInt();
    }

    public Double readValue(){
        showMessage("Insira o valor que deseja converter:");
        return scanner.nextDouble();
    }

    public void showCurrencyOptions() {
        Map<String, Double> baseCurrencies = conversor.getAvailableCurrencies("USD");

        if (baseCurrencies != null && !baseCurrencies.isEmpty()) {
            String baseCode = paginateAndSelectCurrency(baseCurrencies);

            if (baseCode != null) {
                Map<String, Double> conversionRates = conversor.getAvailableCurrencies(baseCode);

                if (conversionRates != null && !conversionRates.isEmpty()) {
                    String targetCode = paginateAndSelectCurrency(conversionRates);

                    if (targetCode != null) {
                        showMessage("Você escolheu " + baseCode + " para " + targetCode);
                        showMessage("Insira o valor que deseja converter:");
                        double value = scanner.nextDouble();
                        double convertedValue = conversor.converter(baseCode, targetCode, value);
                        showConvertedValue(convertedValue);
                    }
                } else {
                    showMessage("Nenhuma taxa de conversão encontrada para " + baseCode);
                }
            }
        } else {
            showMessage("Nenhuma taxa de conversão encontrada para USD.");
        }
    }

    private String paginateAndSelectCurrency(Map<String, Double> currencies) {
        List<String> currencyCodes = new ArrayList<>(currencies.keySet());
        int totalCurrencies = currencyCodes.size();
        int currentIndex = 0;

        while (true) {
            showMessage("Escolha uma das seguintes moedas:");
            for (int i = 0; i < 10 && currentIndex + i < totalCurrencies; i++) {
                showMessage((i + 1) + ". " + currencyCodes.get(currentIndex + i));
            }

            if (currentIndex + 10 < totalCurrencies) {
                showMessage("11. Mostrar mais moedas");
            }

            if (currentIndex > 0) {
                showMessage("12. Voltar");
            }

            int choice = scanner.nextInt();

            if (choice == 11 && currentIndex + 10 < totalCurrencies) {
                currentIndex += 10;
            } else if (choice == 12 && currentIndex > 0) {
                currentIndex -= 10;
            } else if (choice > 0 && choice <= Math.min(10, totalCurrencies - currentIndex)) {
                return currencyCodes.get(currentIndex + choice - 1);
            } else {
                showMessage("Opção inválida. Tente uma opção entre 1 e " + Math.min(10, totalCurrencies - currentIndex) + ".");
            }
        }
    }

    public void showConvertedValue(Double value){
        System.out.printf("Valor convertido: %.2f%n", value);
    }

    public void closeScanner(){
        scanner.close();
    }

}
