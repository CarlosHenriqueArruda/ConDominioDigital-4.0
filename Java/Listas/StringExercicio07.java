package aula04;
//esse codigo pega todo o texto digitado e deixa tudo em letra maiuscula
import java.util.Scanner;

public class StringExercicio07 {

	public static void main(String[] args) {
		Scanner dados = new Scanner(System.in);
		System.out.println("Digite um texto: ");
		String texto = dados.nextLine();
		System.out.println(texto.toUpperCase());

	}

}
