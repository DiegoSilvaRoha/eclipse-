package teste;

public class Caneta {
	//String declarada com letra mai�scula 
	String modelo;
	String cor;
	float ponta;
	double carga;
	boolean tampada;
	
	//void - m�todo sem retorno	
	//print nao tem quebra de linha. println tem quebra de linha
	//Ex.: m�todo status - mostrar o status do objeto
	void status () {
		System.out.println("Modelo:" + this.modelo);
		System.out.println("Cor: " +  this.cor);
		System.out.println("Ponta: " +  this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Est� tampada ? " + this.tampada);
		
	}
	
	void rabiscar () {
	   if(this.tampada == true) {
	    System.out.println(">>>>>ERRO: N�O POSSO RABISCAR<<<<<");
		   
	   } else {
		  System.out.println(">>>>>OK! POSSO RABISCAR<<<<<<"); 
	   }
 }
	   
	//this: "No do  objeto que chamou". Modificar uma atributo dentro da classe
    void tampar () {
    	this.tampada = true;
    }
    
    void destampar () {
    	this.tampada = false;
    	
    }

}


