package Exercicios;

public class FaturaTeste {

	public static void main(String[] args) {
		Fatura Teste = new Fatura("10","teste",15,10);
		System.out.println(Teste.getNumero());
		System.out.println(Teste.getDescricao());
		System.out.println(Teste.setTotalFatura(15, 10));
	}

}
