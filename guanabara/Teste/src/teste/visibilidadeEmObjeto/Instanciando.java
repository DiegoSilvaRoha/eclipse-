package teste.visibilidadeEmObjeto;

public class Instanciando {

	public static void main (String[] args) {
		//criando objeto c1
		Caneta c1 = new Caneta();
		c1.modelo = "BIC NOVA";
		c1.cor = "Vemelha";
		//c1.ponta = "0.5"; //DEU ERRO POIS EST� COM O MODIFICADOR DE ACESSO PRIVATE(A PROPIA IDE AVISA)
	    c1.status();
	    c1.tampar(); // m�todo tampar foi declarado como public  - l� na classe "Caneta" e o obejto � private (aqui nao posso mexer s� dentro da classe)

	}
	
}

    



