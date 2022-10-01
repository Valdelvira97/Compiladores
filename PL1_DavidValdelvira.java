/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pl1_davidvaldelvira;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author david
 */
public class PL1_DavidValdelvira {

    //generador de cadenas, de momento genera 100 validas de 11 caracteres como mucho
    //String alfabeto = "hjg";

    public static int numeroAleatorio(int minimo, int maximo) {

        return ThreadLocalRandom.current().nextInt(minimo, maximo + 1);

    }

    public static String cadenaAleatoria(int longitud) {
        //String primera = "h";
        String alfabeto[] = {"h","jg","gj"};
        // La cadena en donde iremos agregando un carácter aleatorio, empiza por h obligatoriamente
        String cadena = "h";
        for (int x = 0; x < longitud; x++) {
            int indiceAleatorio = numeroAleatorio(0, alfabeto.length-1);
            String caracterAleatorio = alfabeto[indiceAleatorio];
            cadena += caracterAleatorio;
        }
        return cadena;
    }
    
    
    //maquina de estados
    
    

    public static void main(String[] args) {

        for (int i = 0; i < 100; i++) {

            int longitud = 5;
            String cadena = cadenaAleatoria(longitud);
            System.out.printf("Cadena aleatoria caracteres: %s\n", cadena);

        }

    }

}
