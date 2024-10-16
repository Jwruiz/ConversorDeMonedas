package com.jeheremi.principal;

import com.jeheremi.calculos.Calculadora;
import com.jeheremi.util.ConsultaApi;

import java.util.Map;
import java.util.Scanner;

public class PrincipalBusqueda {
    public static void main(String[] args) {
        ConsultaApi consultaApi = new ConsultaApi();


        Scanner lectura = new Scanner(System.in);

        int opcion = 0;

        while (opcion != 6) { // El ciclo se ejecuta mientras la opción no sea 5 (salir)
            // Mostrar el menú de opciones
            System.out.println("\n--- Menú de Opciones ---");
            System.out.println("1. Opción 1: USD dolar");
            System.out.println("2. Opción 2: EUR Euro");
            System.out.println("3. Opción 3: Bolivar Venezuela");
            System.out.println("4. Opción 4: Peso Argentino");
            System.out.println("5. Opción 5: Peso Chino");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");

            // Leer la opción del usuario
            opcion = lectura.nextInt();

            // Ejecutar la opción seleccionada
            switch (opcion) {
                case 1:
                    System.out.println("Has seleccionado la Opción 1");
                    // Aquí iría el código para la opción 1
                    //Calculadora calculo = new Calculadora(<listaSeleccionada>, opcion)
                    System.out.println();
                    break;
                case 2:
                    System.out.println("Has seleccionado la Opción 2");
                    // Aquí iría el código para la opción 2
                    break;
                case 3:
                    System.out.println("Has seleccionado la Opción 3");
                    // Aquí iría el código para la opción 3
                    break;
                case 4:
                    System.out.println("Has seleccionado la Opción 4");
                    // Aquí iría el código para la opción 4
                    break;
                case 5:
                    System.out.println("Has seleccionado la Opción 5");
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



    }}






