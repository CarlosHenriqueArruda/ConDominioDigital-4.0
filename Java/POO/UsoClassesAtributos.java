package POO;

public class UsoClassesAtributos {

	public static void main(String[] args) {
		AtributosClasses cliente01 = new AtributosClasses();
		System.out.println(cliente01.fNome);
		System.out.println(cliente01.lNome);
		System.out.println(cliente01.idade);
		System.out.printf("O Aluno %s %s tem %d anos", cliente01.fNome,cliente01.lNome,cliente01.idade);
	}
}
