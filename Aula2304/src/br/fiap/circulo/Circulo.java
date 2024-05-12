package br.fiap.circulo;

import br.fiap.forma.Forma;

public class Circulo extends Forma {

	public Circulo(int cX, int cY, double raio) {
		super(cX, cY, raio);
		// TODO Auto-generated constructor stub
	}

	public double calcularArea() {
		return Math.PI * raio *raio;
	}

}