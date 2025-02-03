package com.jeheremi.calculos;

import com.jeheremi.monedas.Moneda;
import java.util.List;
import java.util.Map;

public class Calculadora {

    // Método para convertir una cantidad de una moneda a otra
    public Double convertir(List<Map.Entry<String, Double>> conversiones, double cantidad, String monedaOrigen, String monedaDestino) {
        // Obtener las tasas de conversión para las monedas origen y destino
        Double tasaOrigen = obtenerTasaDeConversion(monedaOrigen, conversiones);
        Double tasaDestino = obtenerTasaDeConversion(monedaDestino, conversiones);

        if (tasaOrigen != null && tasaDestino != null) {
            // Realizamos la conversión
            return (cantidad / tasaOrigen) * tasaDestino;
        } else {
            System.out.println("Una de las monedas no está disponible en la lista.");
            return null;
        }
    }

    // Método para obtener la tasa de conversión de una moneda en la lista
    private Double obtenerTasaDeConversion(String moneda, List<Map.Entry<String, Double>> conversiones) {
        for (Map.Entry<String, Double> entry : conversiones) {
            if (entry.getKey().equals(moneda)) {
                return entry.getValue();
            }
        }
        return null; // Si la moneda no está en la lista, devuelve null
    }

    // Método para probar la lista de conversiones
    public void test(List<Map.Entry<String, Double>> conversiones) {
        // Imprime cada moneda con su valor en la lista de conversiones
        conversiones.forEach(entry -> {
            String moneda = entry.getKey();
            Double valor = entry.getValue();
            System.out.println("Moneda: " + moneda + ", Valor: " + valor);
        });
    }

    // Método principal para realizar la conversión
    public static void main(String[] args) {
        // Crear la instancia de la calculadora
        Calculadora calculadora = new Calculadora();

        // Obtener la lista de conversiones
        List<Map.Entry<String, Double>> conversiones = Moneda.monedasFinal(); // Obtenemos la lista de conversiones

        // Llamar al método test para imprimir las conversiones
        calculadora.test(conversiones);

        // Realizar una conversión de 100 USD a EUR
        Double cantidadConvertida = calculadora.convertir(conversiones, 100, "USD", "EUR");

        if (cantidadConvertida != null) {
            System.out.println("100 USD a EUR: " + cantidadConvertida);
        }
    }
}
