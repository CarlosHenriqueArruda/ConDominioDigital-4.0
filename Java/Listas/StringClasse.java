package fundamentos;

public class StringClasse {

	public static void main(String[] args) {
		String Str = "Hello";
		String Resultado = Str.replace ("l","w"); // substitue caracteres
		System.out.println(Str+ " " + Resultado);
		String str = "Hello World";
		String resultado = str.substring(6); // pega de uma posição em diante
		System.out.println(resultado);
		String resultadoo = str.substring(6,8); //Pega de uma posição até outr
		System.out.println(resultadoo);
		String strg = " HELLO ";
		String Resultadoo = strg.trim(); //Tirar espaços do começo e fim
		System.out.println(Resultadoo);
		char c = str.charAt(1);
		String s1 = "HELLO";
		String s2 = "hello";
		boolean b1 = s1.equals("hello");
		boolean b2 = s1.equals(s2);
		boolean b3 = s1.equalsIgnoreCase(s2);
		boolean b4 = s1.equalsIgnoreCase("azul");
		System.out.println(" ");
		System.out.println(b1);
		System.out.println(b2);
		System.out.println(b3);
		System.out.println(b4);
		int tam = s1.length();
		System.out.println(tam);
		int tam2 = s1.lastIndexOf("H");
		System.out.println(tam2);
	}

}
