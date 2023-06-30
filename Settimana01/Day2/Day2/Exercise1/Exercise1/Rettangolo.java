package Exercise1;

public class Rettangolo {
	int altezza;
	int larghezza;
	
	public Rettangolo(int altezza, int larghezza) {
		this.altezza = altezza;
		this.larghezza = larghezza;

	}
	
	public int calcolaPerimetro() {
		return 2 * (altezza + larghezza);
	}
	
	public int calcolaArea() {
		return altezza * larghezza;
	}
}
