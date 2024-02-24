
public class Conta {
	private int agencia;
	double saldo;
	int numConta;
	
	public void deposita(double valor) {
		this.saldo += valor;
	}
	
	public boolean saca(double valor) {
		if (this.saldo >= valor) {
			this.saldo -= valor;
			return true;
		} else {
			System.out.println("Não é possivel sacar");
			return false;
		}
	}
	
	public void consulta() {
		System.out.println("Saldo Atual: "+this.saldo);
	}
	
	// Privates Getters e Setters
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	
	public int getAgencia() {
		return this.agencia;
	}
}
