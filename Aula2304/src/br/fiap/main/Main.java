package br.fiap.main;

import java.util.ArrayList;
import java.util.List;

import br.fiap.cilindro.Cilindro;
import br.fiap.circulo.Circulo;
import br.fiap.forma.Forma;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Forma> lista = new ArrayList();
		
		lista.add(new Circulo(1,1,10));
		
		lista.add(new Cilindro(2,3,5,15));
		
		for (Forma forma : lista) {
			System.out.println(forma);
			System.out.println("área = "+forma.calcularArea());
			if(forma instanceof Cilindro){
				//conversao do tipo forma para cilindro
				Cilindro aux = (Cilindro)forma;
				System.out.println("Volume = "+aux.calcularVolume());
			}
		}
	}

}
