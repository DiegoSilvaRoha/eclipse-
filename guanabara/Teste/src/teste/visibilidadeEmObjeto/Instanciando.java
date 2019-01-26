package teste.visibilidadeEmObjeto;

public class Instanciando {

	public static void main (String[] args) {
		//criando objeto c1
		Caneta c1 = new Caneta();
		c1.modelo = "BIC NOVA";
		c1.cor = "Vemelha";
		//c1.ponta = "0.5"; //DEU ERRO POIS ESTÁ COM O MODIFICADOR DE ACESSO PRIVATE(A PROPIA IDE AVISA)
	    c1.status();
	    c1.tampar(); // método tampar foi declarado como public  - lá na classe "Caneta" e o obejto é private (aqui nao posso mexer só dentro da classe)

	}
	
}

    



