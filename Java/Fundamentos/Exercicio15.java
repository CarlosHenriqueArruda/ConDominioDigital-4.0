package fundamentos;

import java.util.Scanner;

public class Exercicio15 {

	public static void main(String[] args) {
		int Alunos, cont = 0;
		double medias, notas =0, Resultado; 
		Scanner Dados = new Scanner(System.in);
		
		System.out.println("Digite quantos alunos tem na sala:");
		Alunos = Dados.nextInt();
		
		while (cont<Alunos){
		cont++;
		System.out.println("Digite a nota do aluno "+cont +":");
		medias = Dados.nextDouble();
		notas = notas + medias;
		}
		System.out.println(notas/Alunos);
	}

}
