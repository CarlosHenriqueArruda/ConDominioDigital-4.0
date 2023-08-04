package ExerciciosFinais;

abstract class Atleta {
	boolean Aquecido;
	String Nome;
	int Idade;
	
	public  Atleta(String Nome, int Idade) {
		this.Nome = Nome;
		this.Idade = Idade;
	}
	public void Aquecer() {
		if (Aquecido ==  false){
			Aquecido = true;
			System.out.println(Nome + "está aquecido e pronto!");
		}
		else System.out.println("Já está Aquecido");
	}
	public void setNome(String Nome) {
		this.Nome = Nome;
	}
	public String getNome() {
		return Nome;
	}
}
