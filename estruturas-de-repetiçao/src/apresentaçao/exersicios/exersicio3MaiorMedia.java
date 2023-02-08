package apresentaçao.exersicios;

import java.util.Arrays;
import java.util.Scanner;

public class exersicio3MaiorMedia {
/*
 * Faça um progma que leia 5 numeros
 * Imforme o maior numero.
 * E a media destes numeros.
 */

 public static void main(String[] args) {
  Scanner scan = new Scanner(System.in);
  int numero;
  int count = 0;
  int maior = 0;
  int soma = 0;
  do{
    System.out.println("numero:");
    numero = scan.nextInt();
    if(numero > maior) maior = numero;
    count = count + 1;
    soma = soma + numero;
  } while(count < 5);
  System.out.println("maior" + maior);
  System.out.println("media" + soma/5);
 }
}