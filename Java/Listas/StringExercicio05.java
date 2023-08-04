// esse codigo contará quantas palavras tem em um texto
package aula04;
import java.util.Scanner;
import java.util.StringTokenizer;

public class StringExercicio05 {

	public static void main(String[] args) {
		Scanner dados = new Scanner (System.in);
		System.out.println("Digite um texto:");
		String texto = dados.nextLine();
		StringTokenizer textoo = new StringTokenizer(texto);
		System.out.println(textoo.countTokens());

	}

}
