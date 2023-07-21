package br.com.alura.minhasmusicas.principal;

import br.com.alura.minhasmusicas.modelos.MinhasPreferidas;
import br.com.alura.minhasmusicas.modelos.Musica;
import br.com.alura.minhasmusicas.modelos.Podcast;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Musica minhaMusica = new Musica();
		minhaMusica.setTitulo("New Romantics");
		minhaMusica.setCantor("Taylor Swift");
		
		for(int i =0; i<5000;i++) {
			minhaMusica.reproduz();
		}
		for(int i = 0; i<500;i++) {
			minhaMusica.curte();
		}
		
		
		Podcast meuPodcast = new Podcast();
		meuPodcast.setTitulo("BolhaDev");
		meuPodcast.setApresentador("Marcos Mendes");
		
		for(int i =0; i<5000;i++) {
			meuPodcast.reproduz();
		}
		for(int i =0; i<1000;i++) {
			meuPodcast.curte();
		}
		
		MinhasPreferidas preferidas = new MinhasPreferidas();
		preferidas.inclui(meuPodcast);
		preferidas.inclui(minhaMusica);
	}

}
