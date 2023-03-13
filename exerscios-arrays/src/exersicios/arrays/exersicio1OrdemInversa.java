package exersicios.arrays;

public class exersicio1OrdemInversa {
    /*
     * Crie um vetor de seis numeros inteiros.
     * E mostre eles na ordem inversa.
     */

     public static void main(String[] args) {
        int[] vetor  = {6, 5, 4, 3, 2, 1};

        System.out.println("vetor;");
        int count = 0;
        while(count < (vetor.length)){
            System.out.println(vetor[count] + "");
            count ++;
        }
        System.out.println("\nvetor");
        for(int i = (vetor.length -1); i <= 0; i --){
        System.out.println(vetor[i] + "");    
        }
     }
}
