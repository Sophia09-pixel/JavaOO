package pastinha;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

import br.com.alura.sreenmatch.modelos.Serie;
import br.com.alura.sreenmatch.modelos.Titulo;
import br.com.alura.sreenmatch.modelos.filme;

public class principalComListas {

	static Scanner entrada = new Scanner(System.in);
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		filme meuFilme = new filme("O poderoso chefão",1970);
		meuFilme.avalia(9);
		Serie lost = new Serie("Lost",2000);
		lost.avalia(6);
		filme outroFilme = new filme("Avatar",2022);
		outroFilme.avalia(8);
		var filmeDaSophia = new filme("Barbie",2023);
		filmeDaSophia.avalia(10);
		
		 List<Titulo> lista= new LinkedList<>();
	        lista.add(filmeDaSophia);
	        lista.add(meuFilme);
	        lista.add(outroFilme);
	        lista.add(lost);
	        
	        for(Titulo item: lista) {
	        	System.out.println(item.getNome());
	        	if(item instanceof filme filme && filme.getClassificacao()>2) {
		        	System.out.println("Classificação: "+filme.getClassificacao());
	        	}
	        	
	        	
	        }
	        
	        ArrayList<String> buscaPorArtista = new ArrayList<>();
	        buscaPorArtista.add("Zendaya");
	        buscaPorArtista.add("Margot Robbie");
	        buscaPorArtista.add("Robert Downey Jr");
	        System.out.println(buscaPorArtista);
	        
	        Collections.sort(buscaPorArtista);
	        System.out.println("-Ordem Alfabetica-");
	        System.out.println(buscaPorArtista);
	        System.out.println("-Ordem Alfabetica dos Titluos-");
	        Collections.sort(lista);
	        System.out.println(lista);
	        
	        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
	        System.out.println("Ordenando por ano");
	        System.out.println(lista);
	        
	        int qtdFilme = 3;
	        
	        for(int i =0;i<qtdFilme;i++) {
	        	filme meuFilme2 = new filme("Carros", 2002);
	        	
	        	System.out.println("Digite a nota do Filme: ");
	        	meuFilme2.avalia(entrada.nextInt());
	        	
	        }
	        
	}

}
