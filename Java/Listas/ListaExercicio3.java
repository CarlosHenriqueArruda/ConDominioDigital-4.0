package fundamentos;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
public class ListaExercicio3 {

	public static void main(String[] args) {
		Scanner dados = new Scanner (System.in);
		int[] ArrayUm = new int [10];
		int[] ArrayDois = new int [10];
		int[] ArrayTres = new int [11];
		int[] ArrayQuatro = new int [10];
		
		for (int x = 0; x<ArrayUm.length; x++) {
			System.out.println("Digite os valores para digitar no ArrayUm: ");
			ArrayUm[x] = dados.nextInt();			
		}
		for (int x = 0; x<ArrayDois.length; x++) {
			System.out.println("Digite os valores para digitar no ArrayDois: ");
			ArrayDois[x] = dados.nextInt();
		}
		for (int x = 0; x<ArrayTres.length; x++) {
			System.out.println("Digite os valores para digitar no ArrayTrês: ");
			ArrayTres[x] = dados.nextInt();
		}
	for (int x = 0; x<ArrayQuatro.length; x++) {
			System.out.println("Digite os valores para digitar no ArrayQuatro: ");
			ArrayQuatro[x] = dados.nextInt();
		}
for (int n:ArrayUm) {
	System.out.print(n+ "  ");
}
for (int n:ArrayDois) {
	System.out.print(n+ "  ");
}
for (int n:ArrayTres) {
	System.out.print(n+ "  ");
}
for (int n:ArrayQuatro) {
	System.out.print(n+ "  ");
}
	}

}
