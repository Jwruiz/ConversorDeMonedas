package com.jeheremi.monedas;

import java.util.*;
import java.util.stream.Collectors;

public class ServicioMoneda {

    // Método para procesar las conversiones
    public List<Map.Entry<String, Double>> procesarConversiones(List<Map.Entry<String, Double>> listaConversiones) {

        // Filtrar monedas con tasa de cambio mayor a un valor determinado (ej. 50)
        List<Map.Entry<String, Double>> filtradas = listaConversiones.stream()
                .filter(entry -> entry.getValue() > 50)
                .collect(Collectors.toList());

        // Ordenar las conversiones por valor (de mayor a menor)
        List<Map.Entry<String, Double>> ordenadas = listaConversiones.stream()
                .sorted((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()))
                .collect(Collectors.toList());

        // Calcular el promedio de las tasas de cambio
        double promedio = listaConversiones.stream()
                .mapToDouble(Map.Entry::getValue)
                .average()
                .orElse(0.0);

        // Imprimir el promedio
        System.out.println("Promedio de las tasas de conversión: " + promedio);

        // Devolver las conversiones ordenadas como ejemplo de operación
        System.out.println("Conversiones ordenadas por valor: ");
        ordenadas.forEach(entry -> System.out.println(entry.getKey() + ": " + entry.getValue()));

        return filtradas;  // Puedes retornar cualquiera de las listas modificadas o hacer lo que necesites.
    }
}
