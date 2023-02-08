package apresentaçao.exersicios;

import java.io.Console;
import java.text.BreakIterator;
import java.util.Scanner;

public class exersicio1NomeIdade {
//Faça um progama que leia o conjunto de dois valores o primiero representando o nome do aluno e o segundo a sua idade
//(Pare o progama inserindo o valor 0  no vlaor nome)
 public static void main(String[] args) {
 Scanner scam = new Scanner(System.in);   
 String nome;
 int idade;
 while(true){
System.out.println("digite o seu nome");
 nome = scam.next();
 if(nome.equals("0")) break;
 System.out.println("digite o sua idade");
 idade = scam.nextInt();
 }
 System.out.println("continua aqui");
 }
}
