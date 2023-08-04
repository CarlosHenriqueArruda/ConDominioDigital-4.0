//Calcula a soma dos multiplos de 3 e 5 entre 1 e 20 e mostra a soma dos multiplos e a soma total
package fundamentos;

public class ForExercicio6 {

	public static void main(String[] args) {
		int multiplos3 = 0, multiplos5 = 0;
		for (int x=1; x <=20; x++) {
			if (x%3==0) {
				multiplos3 = multiplos3+x;
			}if (x%5==0) {
				multiplos5 = multiplos5+x;
			}
		}System.out.println(multiplos3);
		System.out.println(multiplos5);
		System.out.println(multiplos3+multiplos5);
	}

}