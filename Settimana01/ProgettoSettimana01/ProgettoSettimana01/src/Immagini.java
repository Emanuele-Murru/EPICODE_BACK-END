
public class Immagini extends Multimedia implements Luminosita {

	private int luminosita;
	
	public Immagini(String titolo, int luminosita) {
		super(titolo);
		this.setLuminosita(luminosita);
	}

	public void aumentaLuminosita() {
		this.luminosita = luminosita++;
	}

	public void diminuisciLuminosita() {
		this.luminosita = luminosita--;
	}
	
	public void show() {
		String lumos = "*".repeat(luminosita);
		System.out.println(titolo + " luminosità: " + lumos);
	}
	
	public int setLuminosita(int lumos) {
		return this.luminosita = lumos;
	}
	
	public String titolo(String tit) {
		return this.titolo = tit;
	}
	
}
