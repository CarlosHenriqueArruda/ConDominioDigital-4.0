package ExerciciosFinais;

public class Nadador extends Atleta{
	public Nadador(String Nome, int Idade) {
		super(Nome,Idade);
		boolean Nadando;
	}
	public void Nadar() {
		if (Aquecido == true) {
			boolean Nadando = true;
			System.out.println("Está Nadando!");
		}
		else System.out.println("Precisa Aquecer Antes...");
	}
}
