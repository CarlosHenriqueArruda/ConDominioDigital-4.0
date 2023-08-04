package ExerciciosFinais;

public class Corredor extends Atleta {
	public Corredor(String Nome, int Idade) {
		super(Nome,Idade);
		boolean Correrendo;
	}
	public void Correr() {
		if (Aquecido == true) {
			boolean Correrendo = true;
			System.out.println("Está Correndo!");
		}
		else System.out.println("Precisa Aquecer Antes...");
	}
}
