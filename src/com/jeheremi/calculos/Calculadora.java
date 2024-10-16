package com.jeheremi.calculos;

import com.jeheremi.monedas.MonedaDto;
import com.jeheremi.principal.PrincipalBusqueda;
import com.jeheremi.util.ConsultaApi;

import java.util.List;
import java.util.Map;

public class Calculadora {
  //  private Double base = 1.0;
  public int opcion = 1;
  public List<Map.Entry<String, Double>> listaSeleccionada;

    public Calculadora(List<Map.Entry<String, Double>> listaSeleccionada, int opcion) {

        this.opcion = opcion;
        this.listaSeleccionada = listaSeleccionada;
        System.out.println(listaSeleccionada);

    }
}
