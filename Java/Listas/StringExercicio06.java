package aula04;
// esse codigo pega dois textos e vê se são iguais ou diferentes
public class StringExercicio06 {

	public static void main(String[] args) {
		String texto1 = "Será que são iguais";
		String texto2 = "Será que são iguais";
		System.out.println(texto1.compareTo(texto2) == 0 	? "Iguais":"Diferentes");

	}

}
