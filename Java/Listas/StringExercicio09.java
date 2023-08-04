package aula04;

import java.util.Arrays;

public class StringExercicio09 {

	public static void main(String[] args) {
		String[] texto = {"a","vida","é","bela"};
		String contador = "";
		String texto1 = "";
		for(int x = (texto.length) -1;x>=0; x--) {
			texto1 += (texto[x] + " ");
		}
System.out.println(texto1);
	}

}
