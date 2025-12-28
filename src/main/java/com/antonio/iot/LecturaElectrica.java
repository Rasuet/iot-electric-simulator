package com.antonio.iot;

import java.time.LocalDateTime;

public class LecturaElectrica {
    private double voltaje;
    private double intensidad;
    private double potencia;
    private String timestamp;

    // Constructor que genera los datos usando lógica
    public LecturaElectrica() {
        // Lógica: 230V con variación de +-2V
        this.voltaje = 230 + (Math.random() * 4 - 2);

        // Lógica: Intensidad aleatoria hasta 15A
        this.intensidad = Math.random() * 15;

        // Lógica: Cálculo de potencia activa (P = V * I * cos phi)
        this.potencia = this.voltaje * this.intensidad * 0.9;

        this.timestamp = LocalDateTime.now().toString();
    }

    // --- GETTERS Y SETTERS (Dentro de la clase) ---

    public double getVoltaje() {
        return voltaje;
    }

    public void setVoltaje(double voltaje) {
        this.voltaje = voltaje;
    }

    public double getIntensidad() {
        return intensidad;
    }

    public void setIntensidad(double intensidad) {
        this.intensidad = intensidad;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }
} // <--- Esta llave cierra la clase y es fundamental