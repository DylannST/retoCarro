package com.sofka.prueba.retocarros.util;

import java.util.concurrent.ThreadLocalRandom;

public class GeneradorRamdon {
    public static String numeroAleatorio(int tamano) {
        return String.valueOf((int) (tamano * Math.random()));
    }


    public static String palabraAleatoria(int tamano) {
        String base = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String cadena = "";
        for (int x = 0; x < tamano; x++) {
            int indiceAleatorio = numeroAleatorioEnRango(0, base.length() - 1);
            char caracterAleatorio = base.charAt(indiceAleatorio);
            cadena += caracterAleatorio;
        }
        return cadena;
    }

    public static int numeroAleatorioEnRango(int minimo, int maximo) {
        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);
    }
}
