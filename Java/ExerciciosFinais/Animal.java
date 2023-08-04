package ExerciciosFinais;

public class Animal {
	String nome;
	String tipo;
	String cor;
	
	public Animal(String nome){}
		
	public Animal(String nome, String tipo){
		this.nome = nome;
		this.tipo = tipo;}
	
	public Animal(String nome, String tipo, String cor){
		this.nome = nome;
		this.tipo = tipo;
		this.cor = cor;}
	

	public void comer() {
		System.out.println(nome + "Está comendo");
	}
	public void som() {
		System.out.println(nome + "Está emitindo som");
	}
}
