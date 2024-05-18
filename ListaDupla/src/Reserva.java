
public class Reserva {

	private String hospede;
	private String dataIni;
	
	
	public Reserva(String hospede, String dataIni) {
		this.hospede = hospede;
		this.dataIni = dataIni;
	}
	
	public Reserva(String hospede) {
		this.hospede = hospede;
	}


	

	@Override
	public String toString() {
		return "Reserva [hospede=" + hospede + ", dataIni=" + dataIni + "]"+"\n";
	}

	@Override
	public boolean equals(Object obj) {
		Reserva reserva = (Reserva) obj;
		return hospede.equalsIgnoreCase(reserva.hospede);
	}


	public String getHospede() {
		return hospede;
	}


	public void setHospede(String hospede) {
		this.hospede = hospede;
	}


	public String getDataIni() {
		return dataIni;
	}


	public void setDataIni(String dataIni) {
		this.dataIni = dataIni;
	}
	
	
	
	
}
