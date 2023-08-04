package Interfaces;

public class Triatleta implements Corredor,Nadador,Ciclista {

	@Override
	public void pedalar() {
		System.out.println("Pedalando...");
		
	}

	@Override
	public void nadar() {
		System.out.println("Nadando...");
		
	}

	@Override
	public void correr() {
		System.out.println("Correndo...");
		
	}

}

