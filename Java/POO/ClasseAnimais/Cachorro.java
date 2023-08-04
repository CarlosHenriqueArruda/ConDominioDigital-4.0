package Animais;

public class Cachorro extends Animal{
	public Cachorro (String nome, String cor, String pelagem, double peso) {
		super(nome,cor,pelagem,peso);
		
	}
	public void Som() {
		System.out.println(Nome + " está Latindo!");
	}
}