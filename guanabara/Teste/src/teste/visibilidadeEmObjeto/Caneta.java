package teste.visibilidadeEmObjeto;

public class Caneta {
	//String declarada com letra maiúscula 
  public String modelo;
  public String cor;
  private float ponta;
  protected  double carga;
  private  boolean tampada;
	
	//void - método sem retorno	
	//print nao tem quebra de linha. println tem quebra de linha
	public void status () {
		System.out.println("Modelo:" + this.modelo);
		System.out.println("Cor: " +  this.cor);
		System.out.println("Ponta: " +  this.ponta);
		System.out.println("Carga: " + this.carga);
		System.out.println("Está tampada ? " + this.tampada);
		}
	
	public void rabiscar () {  //private, ou seja, eu nao posso rabiscar se nao for dentro da classe
	   if(this.tampada == true) {
	    System.out.println(">>>>>ERRO: NÃO POSSO RABISCAR<<<<<");
		   
	   } else {
		  System.out.println(">>>>>OK! POSSO RABISCAR<<<<<<"); 
	   }
 }
	   
	//this: "No do  objeto que chamou". Modificar uma atributo dentro da classe
   public void tampar () {
	   // estou mexendo no atributo que é privado, ou seja só clase pode acessar, fora não(" na classe instanciando")
    	this.tampada = true;
    }
    
   protected void destampar () {
    	this.tampada = false;
    	
    }

}


