package com.estruturaControle;

import java.util.Scanner;

public class Aula10  {


	public static void main(String args []) {
		
		int num;

		  System.out.println("Digite o valor");
		 Scanner in = new Scanner(System.in);
		  num = in.nextInt(); 
		  
		  if(num==1) {
			  System.out.println("Valores Iguais");
			  
		  }else {
			  System.out.println("Não sao Iguais");
		  
		}
	}
}

