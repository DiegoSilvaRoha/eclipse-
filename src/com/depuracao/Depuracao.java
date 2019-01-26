package com.depuracao;

import java.util.Scanner;

public class Depuracao {

	public static void main (String args []) {

		double nota1;
		double nota2;
		double nota3;
		double nota4;
		double soma;

		//Recebendo a nota 1
		System.out.println("Digite a primeria nota");
		Scanner in = new Scanner(System.in);
		nota1 = in.nextDouble();

		//Recebendo a nota 2
		System.out.println("Digite a segunda nota");
		//Scanner in = new Scanner(System.in);
		nota2 = in.nextDouble();

		//Recebendo a nota 3
		System.out.println("Digite a terceira nota");;
		nota3 = in.nextDouble();

		//Recebendo a nota 4
		System.out.println("Digite a quarta nota");
		nota4 = in.nextDouble();	


		//Cálculo 
		soma = nota1 + nota2 + nota3 + nota4;
		soma = soma / 4;
       
		//Condicao
		if(soma >= 7) {
			System.out.println("O Aluno foi aprovado com: "+soma);
		}else {
			System.out.println("O Aluno foi reprovado com: "+soma);
		}	
	}

}
