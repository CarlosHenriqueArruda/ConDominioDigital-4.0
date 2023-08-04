package Exercicios;

public class Polimofismo {
	String nome;
	int numero1;
	int numero2;
	int numero3;
	public Polimofismo(String nome, int numero1, int numero2, int numero3) {
		this.nome = nome;
		this.numero1 = numero1;
		this.numero2 = numero2;
		this.numero3 = numero3;
	}
	
	public void som() {
		System.out.println("Emitiu som!");
	}
	public int soma(int numero1,int numero2) {
		return numero1+numero2;
	}
	public int soma(int numero1,int numero2,int numero3) {
		return numero1+numero2+numero3;
	}
}
