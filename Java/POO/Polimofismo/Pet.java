package Exercicios;

public class Pet {
	String nome;
	String animal;
	int idade;
	
	public Pet(String nome, String animal, int idade) {
		this.nome = nome;
		this.animal = animal;
		this.idade = idade;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public void setanimal(String animal) {
		this.animal = animal;
	}
	public void setidade(int idade) {
		this.idade = idade;
	}
	public String getnome(String nome) {
		return nome;
	}
	public String getanimal(String animal) {
		return animal;
	}
	public int getidade(int idade) {
		return idade;
	}
}
