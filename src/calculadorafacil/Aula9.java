package com.calculadorafacil

import java.util.Scanner;

public class Aula9 {

	public static void main (String args []) {
		Scanner in = new Scanner(System.in);
		double num1, num2, soma, subtracao, multi, div;
		System.out.println("Insira o número 1");
		num1 = in.nextInt();
		System.out.println("Insira o número 2");
		num2 = in.nextInt();
		
		soma = num1 + num2;
		System.out.println("O resultado da soma é: "+ soma);
	
		subtracao = num1 - num2;
		System.out.println("O resultado da subtracao é: "+ subtracao);
	
		multi = num1 * num2;
		System.out.println("O resultado da multiplicação é: "+ multi);
		
		div = num1 / num2;
		System.out.println("O resultado da divisão é: "+ div);		
  }
}
