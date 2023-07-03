
public class Video extends Multimedia implements ImageInterface, Riproduci {

	private int volume = 1;
	private int durata = 1;
	private int luminosita;

	public Video(String titolo, int dur, int luminosita, int volume) {
		super(titolo);
		this.setDurata(dur);
		this.volume = volume;
		this.setLuminosita(luminosita);
	}

	@Override
	public void play() {
		
		for (int i = 1; i <= durata; i++) {
			
			String stampaVolume = "!".repeat(volume);
			
			String stampaLuminosita = "*".repeat(luminosita);
			
			System.out.println(titolo + stampaVolume + " " + stampaLuminosita);
			
		}
	}

	@Override
	
	public void alzaVolume() {
		
		if (volume == 10) {
			
			System.out.println("Il volume e' gia' al massimo");
			
		} else {
			
			volume++;
		}

	}

	@Override
	
	public void abbassaVolume() {
		
		if (volume == 0) {
			
			System.out.println("Il  volume e' gia' al minimo");
			
		} else {
			
			volume--;
			
		}

	}

	public int setDurata(int dur) {
		return this.durata = dur;
	}

	public void aumentaLuminosita() {
		this.luminosita = luminosita++;
	}

	public void diminuisciLuminosita() {
		this.luminosita = luminosita--;
	}

	public void show() {
		String lumos = "*".repeat(luminosita);
		System.out.println(titolo + " " + lumos);
	}

	public int setLuminosita(int lumos) {
		return this.luminosita = lumos;
	}
}
