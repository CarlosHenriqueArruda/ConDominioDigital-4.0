package ExerciciosFinais;

public class Ciclista extends Atleta {
	public Ciclista(String Nome, int Idade) {
		super(Nome,Idade);
		boolean Pedalar;
	}
	public void Pedalar() {
		if (Aquecido == true) {
			boolean Pedalar = true;
			System.out.println("Está pedalando!");
		}
		else System.out.println("Precisa Aquecer antes...");
	}

}
