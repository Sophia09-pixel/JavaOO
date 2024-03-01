package pastinha;
import java.util.ArrayList;

import br.com.alura.sreenmatch.modelos.CalculadoraDeTempo;
import br.com.alura.sreenmatch.modelos.Episodio;
import br.com.alura.sreenmatch.modelos.FiltroRecomendacao;
import br.com.alura.sreenmatch.modelos.Serie;
import br.com.alura.sreenmatch.modelos.filme;



public class screenmatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 	filme meuFilme = new filme("O poderoso chefão",1970);
	        meuFilme.setDuracaoMinutos(180);
	        System.out.println("Duração do filme: " + meuFilme.getDuracaoMinutos());

	        meuFilme.exibeFichaTecnica();
	        meuFilme.avalia(8);
	        meuFilme.avalia(5);
	        meuFilme.avalia(10);
	        System.out.println("Total de avaliações: " + meuFilme.getTotalDeAvaliacoes());
	        System.out.println(meuFilme.pegaMedia());
	        //meuFilme.somaDasAvaliacoes = 10;
	        //meuFilme.totalDeAvaliacoes = 1;
	        //System.out.println(meuFilme.pegaMedia());

	        Serie lost = new Serie("Lost",2000);
	        lost.exibeFichaTecnica();
	        lost.setTemporadas(10);
	        lost.setEpisodiosPorTemporada(10);
	        lost.setMinutosPorEp(50);
	        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoMinutos());

	        filme outroFilme = new filme("Avatar",2023);
	        outroFilme.setDuracaoMinutos(200);
	        System.out.println("Duração do filme: " + outroFilme.getDuracaoMinutos());
	        outroFilme.exibeFichaTecnica();


	        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
	        calculadora.inclui(meuFilme);
	        calculadora.inclui(outroFilme);
	        calculadora.inclui(lost);
	        System.out.println(calculadora.getTempoTotal());

	        FiltroRecomendacao filtro = new FiltroRecomendacao();
	       

	        Episodio episodio = new Episodio();
	        episodio.setNumero(1);
	        episodio.setSerie(lost);
	        episodio.setTotalVisualizacoes(300);
	        
	        
	        var filmeDaSophia = new filme("Barbie",2023);
	        filmeDaSophia.setDuracaoMinutos(200);
	        filmeDaSophia.setAnoDeLancamento(2023);
	        filmeDaSophia.avalia(100);
	        
	        ArrayList<filme> listaDeFilmes = new ArrayList<>();
	        listaDeFilmes.add(filmeDaSophia);
	        listaDeFilmes.add(meuFilme);
	        listaDeFilmes.add(outroFilme);
	        
	        System.out.println("Tamanho da lista: "+ listaDeFilmes.size());
	        System.out.println("Primeiro filme: "+listaDeFilmes.get(0).getNome() );
	        System.out.println(listaDeFilmes);
	        
	        System.out.println("Primeiro filme: "+listaDeFilmes.get(0).toString() ); 
	       
	        
	        
	    }
	
	
		
	
	

}
