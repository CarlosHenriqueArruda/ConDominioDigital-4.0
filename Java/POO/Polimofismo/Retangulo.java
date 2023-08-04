package Exercicios;

public class Retangulo {
	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}
	public  double getarea() {
		double area = base*altura;
		return area;
	}
	public double getperimetro() {
		double perimetro = (base+altura)*2;
		return perimetro;
	}
}
