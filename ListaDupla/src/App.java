
public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Lista<Reserva> listaReserva = new Lista<>();
		
		Reserva reserva1 = new Reserva("Selmini", "10/05/204");
		Reserva reserva2 = new Reserva("Miguelito", "11/05/2024");
		Reserva reserva3 = new Reserva("Lili", "16/05/2024");
		Reserva reserva4 = new Reserva("Israel", "30/05/2024");
		
		listaReserva.inserirFim(reserva1);
		listaReserva.inserirFim(reserva2);
		listaReserva.inserirInicio(reserva3);
		listaReserva.inserirInicio(reserva4);
		
		System.out.println(listaReserva.listar());
		
		System.out.println(listaReserva.pesquisar(new Reserva("Selmini")));
	}

}
