package com.calculadora3;

import java.util.Scanner;

public class Calculadora3 {


	public static void main (String args[]) {

		Scanner in = new Scanner (System.in);

		System.out.println("Digite a opção 1 para somar");
		System.out.println("Digite a opção 2 para subtrair");
		System.out.println("Digite a opção 3 para multiplicar");
		System.out.println("Digite a opção 4 para dividir"); 


		int i = in.nextInt();

		System.out.println("Digite o primeiro número:");
		double num1 = in.nextDouble();

		System.out.println("Digite o segundo número:");
		double num2 = in.nextDouble();

		if (i == 1) {
			System.out.println(num1 + num2);
		}else{
			System.out.println(num1 - num2);
			if (i == 2) {
				System.out.println(num1 - num2);
			}else {
				if(i == 3) {
					System.out.println(num1 * num2);
				}else {
					if (i == 4) {
						System.out.println(num1 / num2);  
					}else {
						System.out.println("Operação Inválida");
					}

				}

			}

		}
	
	}

}
