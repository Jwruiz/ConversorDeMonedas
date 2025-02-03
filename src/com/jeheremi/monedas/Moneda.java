package com.jeheremi.monedas;

import com.jeheremi.util.ConsultaApi;

import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Moneda {

    public static List<Map.Entry<String, Double>> monedasFinal() {

        // Crear una instancia de ConsultaApi
        ConsultaApi misCalculos = new ConsultaApi();
        List<Map.Entry<String, Double>> listaConversiones;

        try {
            // Obtener las conversiones desde la API
            listaConversiones = misCalculos.obtenerConversiones();

            // Hacer que la lista sea inmutable
            List<Map.Entry<String, Double>> listaInmutable = Collections.unmodifiableList(listaConversiones);

            // Opcional: Puedes imprimir la lista si lo necesitas solo para prueba
            System.out.println("******************");
            // System.out.println(listaInmutable);

            // Devolver la lista inmutable
            return listaInmutable;

        } catch (Exception e) {
            // Manejo de excepciones: Si ocurre un error, mostramos un mensaje y devolvemos una lista vacía
            System.err.println("Error al obtener las conversiones: " + e.getMessage());
            return Collections.emptyList();
        }
    }
}
