package ExerciciosFinais;

public class AtletaTeste {

	public static void main(String[] args) {
		Corredor Corredor = new Corredor("João",58);
		
		Corredor.Correr();
		Corredor.Aquecer();
		Corredor.Correr();
		System.out.println(Corredor.getNome());;
		Corredor.setNome("Pedro");
		System.out.println(Corredor.getNome());
		}

}
