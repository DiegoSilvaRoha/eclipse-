package run;

import java.util.Scanner;


public class Cahorro {
	// in -> vari�vel que j� existe - outra vari�vel nao funciona 
	public static void main (String[] args) {
		System.out.println("Idade do cahorro:");
		Scanner in = new Scanner (System.in);
		System.out.println(in.nextLine());
	   
		// Declarando vari�vel usado pelo usu�rio
		
	    int idade = in.nextInt();
	    idade = idade * 7;
		
		System.out.println(" O seu cachorro tem: "+idade+" anos.");
	}
}


