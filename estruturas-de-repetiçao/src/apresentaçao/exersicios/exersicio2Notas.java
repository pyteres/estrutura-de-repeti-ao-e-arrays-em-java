package apresentaçao.exersicios;

import java.util.Scanner;

public class exersicio2Notas {
/*
 * Faça um progama que peça uma nota entre zero e dez
 * Mostre uma mensagem caso o valor seja invalido
 * E continue pedindo
 * Ate que o usuario ensira um valor valido
 */
public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    int nota;
    System.out.println("nota");
    nota = scan.nextInt();
    while(nota < 0 || nota > 10){
    System.out.println("nota invalida digite novamente");
    nota = scan.nextInt();
    }
}
}
