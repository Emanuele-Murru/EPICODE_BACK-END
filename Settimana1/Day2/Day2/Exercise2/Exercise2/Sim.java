package Exercise2;

public class Sim {

	int numeroCell;
	double credito;
	String[] listaChiamate;

	public Sim(int _numeroCell) {
		this.numeroCell = _numeroCell;
		this.numeroCell = 0;
		this.listaChiamate = new String[5];
	}
	
	public void stampaDatiSim() {
		System.out.println("Numero di telefono: " + numeroCell);
		System.out.println("Credito disponibile: " + credito);
		System.out.println("Chiamate effettuate di recente: ");
	}
	
	}
