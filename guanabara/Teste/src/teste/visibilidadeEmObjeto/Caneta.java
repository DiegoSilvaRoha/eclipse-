package teste.visibilidadeEmObjeto;

public class Caneta {
	//String declarada com letra mai�scula 
  public String modelo;
  public String cor;
  private float ponta;
  protected  double carga;
  private  boolean tampada;
	
	//void - m�todo sem retorno	
	//print nao tem quebra de linha. println tem quebra de linha
	public void status () {
		System.out.println("Modelo:" + this.modelo);
		System.out.println("Cor: " +  this.cor);
		System.out.println("Ponta: " +  this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Est� tampada ? " + this.tampada);
		}
	
	public void rabiscar () {  //private, ou seja, eu nao posso rabiscar se nao for dentro da classe
	   if(this.tampada == true) {
	    System.out.println(">>>>>ERRO: N�O POSSO RABISCAR<<<<<");
		   
	   } else {
		  System.out.println(">>>>>OK! POSSO RABISCAR<<<<<<"); 
	   }
 }
	   
	//this: "No do  objeto que chamou". Modificar uma atributo dentro da classe
   public void tampar () {
	   // estou mexendo no atributo que � privado, ou seja s� clase pode acessar, fora n�o(" na classe instanciando")
    	this.tampada = true;
    }
    
   protected void destampar () {
    	this.tampada = false;
    	
    }

}


