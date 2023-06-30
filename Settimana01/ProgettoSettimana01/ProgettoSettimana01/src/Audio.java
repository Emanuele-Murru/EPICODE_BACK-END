
public class Audio extends Multimedia implements Riproduci{
	
	private int volume = 1;
	private int durata = 1;
	
	public Audio(String titolo, int dur, int volume) {
		super(titolo);
		this.durata = dur;
		this.volume = volume;
	}

	@Override
	public void play() {
		for(int i = 1; i <= durata; i++) {
			String stampaVolume = "!".repeat(volume);
			System.out.println(this.titolo + stampaVolume);
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

}
