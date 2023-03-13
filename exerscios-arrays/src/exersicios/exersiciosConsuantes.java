package exersicios;

import java.util.Scanner;

public class exersiciosConsuantes {
/*
 * Faça um progama que leia seis variaveis.
 * E diga quantas consuantes ele leu.
 * E os imprima.
 */

 public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String[] consuantes = new String[6];
    int quantidadeConsuantes = 0;
    int count = 0;

    do{
       System.out.println("letras:");
       String letras = scan.next();
       if(!(letras.equalsIgnoreCase("a")));
       if(letras.equalsIgnoreCase("e"));
       if(letras.equalsIgnoreCase("i"));
       if(letras.equalsIgnoreCase("o"));
       if(letras.equalsIgnoreCase("u")) {
        consuantes[count] = letras;
        quantidadeConsuantes ++;
       }
       count ++;
    }while(count < consuantes.length);
    System.out.println("consuantes:");
    for(String consuante : consuantes){
        if(consuante != null);
        System.out.println(consuante + "");
    }
    System.out.println("quantidade de consuaantes" + quantidadeConsuantes);
 }
}
