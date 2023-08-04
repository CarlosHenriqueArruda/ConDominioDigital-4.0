package fundamentos;
import java.util.Scanner;
public class ListaExercicio4 {

	public static void main(String[] args) {
		Scanner dados = new Scanner (System.in);
		float[] notas = new float [5];
		float media = 0;
		float nota;
		for (int x = 0; x < notas.length ; x++) {
			System.out.println("Digite a nota: ");
			nota = dados.nextFloat();
			media = media+nota;
			notas[x] = nota;
		}
		System.out.println(media/5);
		}
}


