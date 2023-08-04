package Metodos;

//construtor padrão
public class Carro {
	private String cor;
	private double preco;
	private String modelo;


//construtor com 2 parametros
	public Carro(double preco, String modelo){
		//se for escolhido o construtor sem a COR do veiculo
		//definimos a cor padrão como sendo PRETA
		this.cor = "PRETA";
		this.modelo = modelo;
		this.preco = preco;
	}

//construtor com 3 parametros
	public Carro(String Cor,String Modelo,double preco) {
		this.cor = cor;
		this.modelo = modelo;
		this.preco = preco;
	}
//construtor vazio
	public Carro() {
		
	}
	
}