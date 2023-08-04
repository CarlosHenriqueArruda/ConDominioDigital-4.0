package Interfaces2;

abstract class Animal {
	int Patas;
	
	public Animal(int Patas) {
		this.Patas = Patas;
	}
	public Animal() {
		
	}
	public void Andar() {
		System.out.println("Esta andando...");
	}
	
	public void Comer() {
		System.out.println("Esta comendo...");
	}
}

