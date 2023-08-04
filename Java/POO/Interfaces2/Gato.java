package Interfaces2;

public class Gato extends Animal implements Pet{
	String Nome;
	public Gato() {
	}
	public Gato(String Nome) {
		
	}
	@Override
	public void setNome(String Nome) {
		this.Nome=Nome;
		
	}
	@Override
	public void getNome() {
		System.out.println(Nome);
		
	}
	@Override
	public void Brincar() {
		System.out.println("Esta brincando...");
		
	}


}
