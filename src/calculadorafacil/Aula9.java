package com.calculadorafacil

import java.util.Scanner;

public class Aula9 {

	public static void main (String args []) {
		Scanner in = new Scanner(System.in);
		double num1, num2, soma, subtracao, multi, div;
		System.out.println("Insira o n�mero 1");
		num1 = in.nextInt();
		System.out.println("Insira o n�mero 2");
		num2 = in.nextInt();
		
		soma = num1 + num2;
		System.out.println("O resultado da soma �: "+ soma);
	
		subtracao = num1 - num2;
		System.out.println("O resultado da subtracao �: "+ subtracao);
	
		multi = num1 * num2;
		System.out.println("O resultado da multiplica��o �: "+ multi);
		
		div = num1 / num2;
		System.out.println("O resultado da divis�o �: "+ div);		
  }
}
