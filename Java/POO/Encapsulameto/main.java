package Encapsulameto;

public class main {

	public static void main(String[] args) {
		Numeros teste = new Numeros();
		System.out.println(teste.retornar());
		teste.modificar("TESTEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEEE");
		System.out.println(teste.retornar());
		System.out.println(teste.retornar());
		System.out.println(teste.retornar());
		teste.modificar("A");
		System.out.println(teste.retornar());
	}

}
