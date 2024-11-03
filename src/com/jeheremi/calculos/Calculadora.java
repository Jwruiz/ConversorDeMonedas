package com.jeheremi.calculos;

import com.jeheremi.monedas.Moneda;
import com.jeheremi.monedas.MonedaDto;
import com.jeheremi.principal.PrincipalBusqueda;
import com.jeheremi.util.ConsultaApi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.DoubleBinaryOperator;
import java.util.stream.Collectors;

public class Calculadora {



    Moneda monedaService = new Moneda();

    // Llamar al método monedasFinal y almacenar el resultado
    List<Map.Entry<String, Double>> nuevaListaConversiones = Moneda.monedasFinal();

    public void test(List<Map.Entry<String, Double>>conversiones){
      //  System.out.println(nuevaListaConversiones);
       conversiones.forEach(e->{
           String moneda = e.getKey();
           Double valorOriginal = e.getValue();
           Double valorMultiplicado = valorOriginal * 1.0;
           System.out.println(moneda + ":" + valorMultiplicado);
       });

       // return nuevaListaConversiones;
    }



}


