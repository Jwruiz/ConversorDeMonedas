package com.jeheremi.principal;

import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class PrincipalBusqueda {
    public static void main(String[] args) {


    //    Scanner lectura = new Scanner(System.in);
        // List<Titulo> titulos = new ArrayList<>();

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                .setPrettyPrinting()
                .create(); // ubicado en Gson user guide, permite transformar las letras mayusculas de json a minusculas en mi clase java y asi mantener buenas practicas
        // Titulo miTitulo = gson.fromJson(json, Titulo.class);

    //    while (true){

    //        System.out.println("escribe la opcion de la moneda que deseas conocer: ");
      //      var busqueda = lectura.nextLine();

      //      if (busqueda.equalsIgnoreCase("salir")){
     //           break;
      //      }

            String direccion = "https://v6.exchangerate-api.com/v6/2a657fdaa2391a29aed84189/latest/USD";

            try {

                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direccion))
                        .build();

                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

                String json = response.body();
                System.out.println(json);


               // TituloOmdb miTituloOmdb = gson.fromJson(json, TituloOmdb.class);
              //  System.out.println(miTituloOmdb);


               // Titulo miTitulo = new Titulo(miTituloOmdb);
              //  System.out.println("titulo convertido: " + miTitulo);

                // titulos.add(miTitulo);


           // }//catch (NumberFormatException e){
              //  System.out.println("Ocurrio un error: ");
             //   System.out.println(e.getMessage());
            }catch (IllegalArgumentException | IOException | InterruptedException e){
                System.out.println("Error en la URI, verifique la direccion.");
            }//catch (ErrorEnDuracionException e){
               // System.out.println(e.getMessage());
            }
        }

 //   }

