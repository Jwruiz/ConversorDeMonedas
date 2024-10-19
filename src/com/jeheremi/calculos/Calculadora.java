package com.jeheremi.calculos;

import com.jeheremi.monedas.MonedaDto;
import com.jeheremi.principal.PrincipalBusqueda;
import com.jeheremi.util.ConsultaApi;

import java.util.List;
import java.util.Map;

public class Calculadora {




    public List<Map.Entry<String, Double>> Calculos() {

        ConsultaApi misCalculos = new ConsultaApi();

        List<Map.Entry<String, Double>> listaConversiones = misCalculos.obtenerConversiones();
        // imprimo la lista como test
        //System.out.println(listaConversiones);

        return listaConversiones;

    }




}
