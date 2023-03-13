package exersicios;

import java.util.Random;

public class exersiciosNumerosAleatorios {
    /*
     * Faça um progama que leia 20 numeros inteiros aleatorios(entre 8 a 100) e os armazene em um vetor.
     * E no final mostre eles e seus sucesores.
     * */

     public static void main(String[] args) {
        Random random = new Random();
        int[] numerosAleatoriso = new int[20];
        for(int i = 0; i < numerosAleatoriso.length; i++){
            int numero = random.nextInt(100);
            numerosAleatoriso[i] = numero;
        }
        System.out.println("numeros aleatorios:");
        for(int numero : numerosAleatoriso){
            System.out.println(numero + "");
        }
        System.out.println("sucesores dos numeros aleatorios");
        for(int numero : numerosAleatoriso){
            System.out.println((numero +1) + "");
        }
        System.out.println("antecesores dos numeros aleatoriso");
        for(int numero : numerosAleatoriso){
            System.out.println((numero-1) + "");
        }
     }
}
