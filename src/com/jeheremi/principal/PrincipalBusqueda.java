package com.jeheremi.principal;

import com.jeheremi.calculos.Calculadora;
import com.jeheremi.monedas.Moneda;
import com.jeheremi.util.ConsultaApi;

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class PrincipalBusqueda {
    public static void main(String[] args) {
        ConsultaApi consultaApi = new ConsultaApi();
        System.out.println(consultaApi.obtenerConversiones());
        Calculadora misCalulos2 = new Calculadora();

        Scanner lectura = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 6) { // El ciclo se ejecuta mientras la opción no sea 6 (salir)
            // Mostrar el menú de opciones
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Opción 1: USD a otra moneda");
            System.out.println("2. Opción 2: EUR a otra moneda");
            System.out.println("3. Opción 3: VES a otra moneda");
            System.out.println("4. Opción 4: ARS a otra moneda");
            System.out.println("5. Opción 5: CNY a otra moneda");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            // Leer la opción del usuario
            opcion = lectura.nextInt();

            // Ejecutar la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la Opción 1: Convertir de USD a otra moneda");

                    // Obtener la lista de conversiones
                    List<Map.Entry<String, Double>> conversiones = Moneda.monedasFinal();

                    // Imprimir las conversiones
                    misCalulos2.test(conversiones);

                    // Pedir al usuario la cantidad a convertir
                    System.out.print("Ingrese la cantidad de USD a convertir: ");
                    double cantidad = lectura.nextDouble();

                    // Solicitar al usuario la moneda de destino
                    System.out.print("Ingrese la moneda de destino (por ejemplo, EUR, VES, ARS, CNY): ");
                    String monedaDestino = lectura.next();

                    // Realizar la conversión
                    Double cantidadConvertida = misCalulos2.convertir(conversiones, cantidad, "USD", monedaDestino);

                    // Mostrar el resultado
                    if (cantidadConvertida != null) {
                        System.out.println("Cantidad convertida: " + cantidadConvertida + " " + monedaDestino);
                    }
                    break;

                case 2:
                    System.out.println("Has seleccionado la Opción 2: Convertir de EUR a otra moneda");

                    // Obtener la lista de conversiones
                    List<Map.Entry<String, Double>> conversionesEUR = Moneda.monedasFinal();

                    // Imprimir las conversiones
                    misCalulos2.test(conversionesEUR);

                    // Pedir al usuario la cantidad a convertir
                    System.out.print("Ingrese la cantidad de EUR a convertir: ");
                    cantidad = lectura.nextDouble();

                    // Solicitar al usuario la moneda de destino
                    System.out.print("Ingrese la moneda de destino (por ejemplo, USD, VES, ARS, CNY): ");
                    monedaDestino = lectura.next();

                    // Realizar la conversión
                    cantidadConvertida = misCalulos2.convertir(conversionesEUR, cantidad, "EUR", monedaDestino);

                    // Mostrar el resultado
                    if (cantidadConvertida != null) {
                        System.out.println("Cantidad convertida: " + cantidadConvertida + " " + monedaDestino);
                    }
                    break;

                case 3:
                    System.out.println("Has seleccionado la Opción 3: Convertir de VES a otra moneda");

                    // Obtener la lista de conversiones
                    List<Map.Entry<String, Double>> conversionesVES = Moneda.monedasFinal();

                    // Imprimir las conversiones
                    misCalulos2.test(conversionesVES);

                    // Pedir al usuario la cantidad a convertir
                    System.out.print("Ingrese la cantidad de VES a convertir: ");
                    cantidad = lectura.nextDouble();

                    // Solicitar al usuario la moneda de destino
                    System.out.print("Ingrese la moneda de destino (por ejemplo, USD, EUR, ARS, CNY): ");
                    monedaDestino = lectura.next();

                    // Realizar la conversión
                    cantidadConvertida = misCalulos2.convertir(conversionesVES, cantidad, "VES", monedaDestino);

                    // Mostrar el resultado
                    if (cantidadConvertida != null) {
                        System.out.println("Cantidad convertida: " + cantidadConvertida + " " + monedaDestino);
                    }
                    break;

                case 4:
                    System.out.println("Has seleccionado la Opción 4: Convertir de ARS a otra moneda");

                    // Obtener la lista de conversiones
                    List<Map.Entry<String, Double>> conversionesARS = Moneda.monedasFinal();

                    // Imprimir las conversiones
                    misCalulos2.test(conversionesARS);

                    // Pedir al usuario la cantidad a convertir
                    System.out.print("Ingrese la cantidad de ARS a convertir: ");
                    cantidad = lectura.nextDouble();

                    // Solicitar al usuario la moneda de destino
                    System.out.print("Ingrese la moneda de destino (por ejemplo, USD, EUR, VES, CNY): ");
                    monedaDestino = lectura.next();

                    // Realizar la conversión
                    cantidadConvertida = misCalulos2.convertir(conversionesARS, cantidad, "ARS", monedaDestino);

                    // Mostrar el resultado
                    if (cantidadConvertida != null) {
                        System.out.println("Cantidad convertida: " + cantidadConvertida + " " + monedaDestino);
                    }
                    break;

                case 5:
                    System.out.println("Has seleccionado la Opción 5: Convertir de CNY a otra moneda");

                    // Obtener la lista de conversiones
                    List<Map.Entry<String, Double>> conversionesCNY = Moneda.monedasFinal();

                    // Imprimir las conversiones
                    misCalulos2.test(conversionesCNY);

                    // Pedir al usuario la cantidad a convertir
                    System.out.print("Ingrese la cantidad de CNY a convertir: ");
                    cantidad = lectura.nextDouble();

                    // Solicitar al usuario la moneda de destino
                    System.out.print("Ingrese la moneda de destino (por ejemplo, USD, EUR, VES, ARS): ");
                    monedaDestino = lectura.next();

                    // Realizar la conversión
                    cantidadConvertida = misCalulos2.convertir(conversionesCNY, cantidad, "CNY", monedaDestino);

                    // Mostrar el resultado
                    if (cantidadConvertida != null) {
                        System.out.println("Cantidad convertida: " + cantidadConvertida + " " + monedaDestino);
                    }
                    break;

                case 6:
                    System.out.println("Saliendo del programa...");
                    break;

                default:
                    System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                    break;
            }
        }

        lectura.close(); // Cerrar el Scanner para evitar fugas de recursos
    }
}
