package com.antonio.iot;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.stream.Collectors;

public class ContadorController {

    public void leerDatosDispositivo(String nombreArchivo) {
        try {
            // Intentamos cargar el archivo desde la raíz de resources
            InputStream is = getClass().getClassLoader().getResourceAsStream(nombreArchivo);

            if (is == null) {
                // Si falla el anterior, probamos con la barra inclinada
                is = getClass().getResourceAsStream("/" + nombreArchivo);
            }

            if (is != null) {
                BufferedReader reader = new BufferedReader(new InputStreamReader(is));
                System.out.println("--- DATOS DEL CONTADOR ---");
                reader.lines().forEach(System.out::println);
            } else {
                System.out.println("¡Error! No se encuentra " + nombreArchivo + " en la carpeta resources.");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
