package ex3;

public class Professor {
	String Nome;
	int numAulaSemanal;
	double horaAula;
	double salarioBase;
	double adicionalHoraAtividade;
	double descansaSemanalRemunerado;
	
	public double calculaSalarioBase() {
		salarioBase = numAulaSemanal * 4.5 * horaAula;
		return salarioBase;
		
	}
	
	public double calculaAdicional() {
		double remuneracaoTotal =0;
		adicionalHoraAtividade = salarioBase * 0.5;
		remuneracaoTotal = salarioBase + adicionalHoraAtividade;
		return remuneracaoTotal;
	}
	
	public double calculaDescanso(double remuneracaoTotal) {
		descansaSemanalRemunerado = remuneracaoTotal / 6;
		return descansaSemanalRemunerado;
	}
	
	public double getSalarioBruto() {
		return salarioBase + adicionalHoraAtividade + descansaSemanalRemunerado;
	}
}
