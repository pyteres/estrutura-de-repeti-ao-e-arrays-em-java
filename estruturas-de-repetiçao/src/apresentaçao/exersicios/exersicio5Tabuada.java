package apresentaçao.exersicios;

import java.util.Scanner;

public class exersicio5Tabuada {
    /*
     * Desenvolva um operador de tabuada;
     * Capaz de gerar qual quer tabuada de numero inteiro de numero 1 a 10.
     * O usuario deve imformar de qual numero ele deseja ver a tabuada.
     * A saida deve ser como o exemplo abaixo.
     * Tabuada de 5:
     * 5 * 1 = 5
     * 5 * 2 = 10
     * 5 * 3 = 15 
     */
   public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("tabuada");
    int tabuada = scan.nextInt();

    System.err.println("tabuada de" + tabuada);
    
    for(int i = 1; i <= 10; i = i + 1){
      System.out.println(tabuada +  "x" + i + "=" + (tabuada*i));
    }
}
}
