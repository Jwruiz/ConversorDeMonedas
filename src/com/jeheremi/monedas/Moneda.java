package com.jeheremi.monedas;

import com.jeheremi.util.ConsultaApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class Moneda {

    public static List<Map.Entry<String, Double>> monedasFinal(){


        ConsultaApi misCalculos = new ConsultaApi();

        List<Map.Entry<String, Double>> listaConversiones = misCalculos.obtenerConversiones();
        // imprimo la lista como test
        //System.out.println(listaConversiones);
        List<Map.Entry<String, Double>> listaInmutable = Collections.unmodifiableList(listaConversiones);

        // return listaConversiones;
        System.out.println("******************");
        System.out.println(listaInmutable);
        return listaInmutable;

    }
}
