package apresentaçao.exersicios;

import java.util.Scanner;

public class exersicio4ParEImpar {
    /*
     * Faça um progama que mostre N numeros inteiros.
     * E calcule e  mostre os numeros pares.
     * E calcule e mostre tambem os numeros impares.
     */
      
     public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      int quantNumeros;
      System.out.println("quantidade de numeros");
      quantNumeros = scan.nextInt();
      int count = 0;
      int numero;
      int quatPares = 0;
      int quantImpares = 0;

      do{
        System.out.println("numero");
        numero = scan.nextInt();
        if(numero % 2 == 0) quatPares ++;
        else quantImpares ++;
        count ++;
      }while(count < quantNumeros);

      System.out.println("Quantidade Par" + quatPares);
      System.out.println("Quantidade Impares" + quantImpares);
     }
}
