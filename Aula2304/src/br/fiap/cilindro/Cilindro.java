package br.fiap.cilindro;

import br.fiap.forma.Forma;

public class Cilindro extends Forma{

	private double altura;
	
	public Cilindro(int cX, int cY, double raio,double altura) {
		super(cX, cY, raio);
		this.altura = altura;
	}

	@Override
	public double calcularArea() {
		double area;
		area= 2 * Math.PI * raio * (raio+ altura);
		return area;
	}
	
	public double calcularVolume() {
		return Math.PI * raio * raio * altura;
	}

	@Override
	public String toString() {
		return "[altura=" + altura + ", toString()=" + super.toString() + "]";
	}
	
	

}
