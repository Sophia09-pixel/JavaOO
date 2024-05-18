package br.fiap.cargo;

import br.fiap.comissao.Comissao;

public enum Cargo implements Comissao{
	ATENDENTE{
		public double calcularComissao(double valor) {
			return valor * 0.10;
		}
	},
	
	VENDEDOR{
		public double calcularComissao(double valor) {
			return (valor * 0.15) + 5;
		}
	},
	GERENTE{
		public double calcularComissao(double valor) {
			return (valor * 0.20) + 10;
		}
	};
	
	public String toString() {
		return name().charAt(0) + name().substring(1).toLowerCase();
	}
}
