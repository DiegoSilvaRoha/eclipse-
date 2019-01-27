package com.array.vetor;

public class Foreach {

	public static void main (String args []) {

		String[] nomes = {"DIEGO", "DANILO", "DANIEL"};

		//variável nome recebe os argumentos do array de string nomes
		for(String nome: nomes) {
			System.out.println(nome);
		}

/**		//usando array de inteiros

		int[] numeros = {1,5,10};
		int soma=0;

		for(int numero : numeros)
			soma+=numero; 

		System.out.println(soma);
*/
	}
}