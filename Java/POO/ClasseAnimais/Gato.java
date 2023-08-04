package Animais;

public class Gato extends Animal{
	public Gato (String nome, String cor, String pelagem, double peso) {
		super(nome,cor,pelagem,peso);
	}
	public void Som() {
		System.out.println(Nome + " está Miando!");
	}
}
