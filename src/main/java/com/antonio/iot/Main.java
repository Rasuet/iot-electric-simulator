package com.antonio.iot;

public class Main {
    public static void main(String[] args) {
        ContadorController controller = new ContadorController();
        controller.leerDatosDispositivo("lectura.txt");

        System.out.println("Simulador de Antonio en marcha...");
    }
}
