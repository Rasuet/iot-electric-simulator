package com.antonio.iot;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class ContadorController {

    public void leerDatosDispositivo(String nombreArchivo) {
        try {
            // La barra "/" al principio es clave: busca en la raíz de 'resources'
            InputStream is = getClass().getResourceAsStream("/" + nombreArchivo);

            if (is == null) {
                System.out.println("¡Error! No encuentro el archivo: " + nombreArchivo);
                return;
            }

            BufferedReader reader = new BufferedReader(new InputStreamReader(is));
            String linea;
            System.out.println("--- Iniciando Lectura del Contador ---");
            while ((linea = reader.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (Exception e) {
            System.out.println("Ocurrió un error: " + e.getMessage());
        }
    }
}
