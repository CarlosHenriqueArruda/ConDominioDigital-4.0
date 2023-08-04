package Metodos;

public class CarroHonda extends Carro{
	private String motor;
	public CarroHonda() {
	}
	
		public CarroHonda(String motor,String modelo, double preco) {
			super(preco,modelo);
			this.motor = motor;
	}
	
}
