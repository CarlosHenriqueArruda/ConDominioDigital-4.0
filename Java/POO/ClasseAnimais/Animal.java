package Animais;

public class Animal {
	public String Nome;
	public String Cor;
	public String Pelagem;
	public double Peso;
	
	
	public Animal(String Nome, String Cor, String Pelagem, double Peso) {
		this.Nome = Nome;
		this.Cor = Cor;
		this.Pelagem = Pelagem;
		this.Peso = Peso;
	}
	public void Comer(){
		System.out.println(Nome + " está comendo!");
	}
	public void Som() {
		System.out.println(Nome + " emitindo Som!");
	}
}
