package br.com.alura;

import br.com.alura.service.Conversor;
import br.com.alura.view.View;

public class Main {
    public static void main(String[] args) {

        View view = new View();
        Conversor conversor = new Conversor();

        int option;
        Double convertedValue;


        do {
            view.showMenuInterface();
            option = view.readOption();

            if (option == 1) {
                Double value = view.readValue();
                convertedValue = conversor.converter("USD", "BRL", value);
                view.showConvertedValue(convertedValue);
            } else if (option == 2) {
                Double value = view.readValue();
                convertedValue = conversor.converter("BRL", "USD", value);
                view.showConvertedValue(convertedValue);
            } else if (option == 3) {
                view.showCurrencyOptions();
            }
        } while (option != 4);

        view.closeScanner();
    }
}