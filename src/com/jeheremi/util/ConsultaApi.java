package com.jeheremi.util;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jeheremi.monedas.MonedaDto;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ConsultaApi {

    String direccion = "https://v6.exchangerate-api.com/v6/2a657fdaa2391a29aed84189/latest/USD";

    public List<Map.Entry<String, Double>> obtenerConversiones() {
        List<Map.Entry<String, Double>> listaSeleccionada = new ArrayList<>();

        try {
            HttpClient client = HttpClient.newHttpClient();
            HttpRequest request = HttpRequest.newBuilder()
                    .uri(URI.create(direccion))
                    .build();

            HttpResponse<String> response = client
                    .send(request, HttpResponse.BodyHandlers.ofString());

            String json = response.body();

            Gson gson = new GsonBuilder()
                    .setPrettyPrinting()
                    .create();
            MonedaDto miMonedaDto = gson.fromJson(json, MonedaDto.class);
            Map<String, Double> conversionRates = miMonedaDto.conversion_rates();

            String[] monedasASeleccionar = {"USD", "EUR", "VES", "ARS", "CNY"};
            for (String moneda : monedasASeleccionar) {
                if (conversionRates.containsKey(moneda)) {
                    listaSeleccionada.add(Map.entry(moneda, conversionRates.get(moneda)));
                }
            }

            System.out.println("Estás consultando la API: Exchangerate");

        } catch (IOException e) {
            System.out.println("Error de red: " + e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("La solicitud fue interrumpida: " + e.getMessage());
            Thread.currentThread().interrupt();  // Restablecer estado de interrupción
        } catch (Exception e) {
            System.out.println("Ocurrió un error inesperado: " + e.getMessage());
        }

        return listaSeleccionada;
    }
}
