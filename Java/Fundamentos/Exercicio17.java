//Digite um numero para saber uma lista de pares e impares do zero até ele
package fundamentos;
import java.util.Scanner;
public class Exercicio17 {

	public static void main(String[] args) {
		int Numero, cont = 0, cont2 =0;
		Scanner dados = new Scanner(System.in);
		System.out.println("Digite um numero para saber os numeros pares e impares: ");
		Numero = dados.nextInt();
		System.out.println("Numeros Pares:");
		while (cont<Numero) {
		cont++;
			if (cont %2==0) {
				System.out.println(cont);
			}
		}
		System.out.println("Numeros Impares:");
		while (cont2<Numero) {
		cont2++;
			if (cont2%2==1) {
				System.out.println(cont2);
			}
		}
	}

}