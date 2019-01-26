package run;

import java.util.Scanner;


public class Cahorro {
	// in -> variável que já existe - outra variável nao funciona 
	public static void main (String[] args) {
		System.out.println("Idade do cahorro:");
		Scanner in = new Scanner (System.in);
		System.out.println(in.nextLine());
	   
		// Declarando variável usado pelo usuário
		
	    int idade = in.nextInt();
	    idade = idade * 7;
		
		System.out.println(" O seu cachorro tem: "+idade+" anos.");
	}
}


