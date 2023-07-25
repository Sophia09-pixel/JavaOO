package Compras;

public class Compra implements Comparable<Compra>{

	private String descricao;
	private double valor;
	
	public Compra(String descricao, double valor) {
		super();
		this.descricao = descricao;
		this.valor = valor;
	}

	public String getDescricao() {
		return descricao;
	}

	
	public double getValor() {
		return valor;
	}

	public String toString() {
		return "Compra: {descrição = " + descricao + ", valor R$ = }"+valor;
	}

	@Override
	public int compareTo(Compra outraCompra) {
		
		return Double.valueOf(this.valor).compareTo(Double.valueOf(outraCompra.valor));
	}
	
	
}
