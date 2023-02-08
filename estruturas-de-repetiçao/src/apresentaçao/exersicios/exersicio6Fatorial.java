package apresentaçao.exersicios;

import java.util.Scanner;

public class exersicio6Fatorial {
   //Faça um progama que calcule o fatorial de um numero inteiro solicitado pelo usuario.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("fatorial");
        int fatorial = scan.nextInt();
        int multiplicaçao = 1;
     System.out.println(fatorial + "! =");
     for(int i = fatorial; i >= 1; i--){
        multiplicaçao = multiplicaçao + 1;
     }   
     System.out.println(multiplicaçao);
    }
}
