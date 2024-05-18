
public class Lista<T> {

	No<T> inicio;
	No<T> fim;

	// método para inserir no inicio da lista

	public void inserirInicio(T dado) {
		No<T> aux = new No<>(dado);

		if (inicio == null) {
			fim = aux;
		} else {
			aux.dir = inicio;
			inicio.esq = aux;
		}
		inicio = aux;
	}

	public void inserirFim(T dado) {
		No<T> aux = new No<>(dado);
		
		if (inicio == null) {
			inicio = aux;
		} else {
			aux.esq = fim;
			fim.dir = aux;
		}
		fim = aux;
	}
	
	public T pesquisar(T dado) {
		No<T> aux =inicio;
		
		while(aux != null) {
			if(aux.dado.equals(dado)) {
				return aux.dado;
			}
			aux = aux.dir;
		}
		return null;
	}
	
	public String listar() {
		No<T> aux = inicio;
		String dados = "";
		while (aux!=null) {
			dados += aux.dado;
			aux = aux.dir;
		}
		return dados;
	}

}
