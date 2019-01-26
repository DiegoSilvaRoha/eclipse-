package teste;

public class Instanciando {

	public static void main (String[] args) {
		//criando objeto c1
		Caneta c1 = new Caneta();
		c1.carga = 10;
		c1.cor = "Azul";
		c1.modelo = "BIC";
		c1.ponta = 0.5f;
		//ou: c1.ponta = (float) 0,5;
    	c1.destampar();
	    c1.status();
	    c1.rabiscar();
	    
	    
	    Caneta c2 = new Caneta();
	    //criando objeto c2

	    c2.modelo = "COMPACTO";
	    c2.carga = 80;
	    c2.cor = "VERMELHO";
	    c2.ponta = (float) 0.9;
	    
	    //Métodos
	    c2.tampar();
	    c2.status();
	    c2.rabiscar();
	    
	    
	   //iNSTANCIANDO DOIS OBJETOS.CONTUDO, ESTE PROGRAMA TEM OS MESMOS ATRIBUTOS E METODOS. O QUE MUDA É O "ESTADO" DOS OBJETOS  
	    
	}
	
}

    



