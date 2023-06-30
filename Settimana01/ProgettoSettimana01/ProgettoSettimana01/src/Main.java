import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Prova file audio
		System.out.println("Inserisci il titolo della traccia");
		String titoloTrack = input.nextLine();
		
		System.out.println("inserisci la durata della traccia");
		int durata = input.nextInt();
		input.nextLine();
		
		System.out.println("inserisci il volume");
		int volume = input.nextInt();
		
		Audio firstTrack = new Audio(titoloTrack, durata, volume);
		firstTrack.play();
		input.nextLine();
		
		System.out.println("-------------------------------------");
		
		//Prova file immagini
		System.out.println("Inserisci il nome dell'immagine");
		String titoloImage = input.nextLine();
		
		System.out.println("Inserisci la luminosita che preferisci da 1 a 10");
		int luminosita = input.nextInt();
		input.nextLine();
		
		Immagini firstImage = new Immagini(titoloImage, luminosita);
		firstImage.aumentaLuminosita();
		firstImage.aumentaLuminosita();
		firstImage.aumentaLuminosita();
		firstImage.aumentaLuminosita();
		firstImage.diminuisciLuminosita();
		firstImage.show();
		
		System.out.println("-------------------------------------");

		
		//Prova file video
		System.out.println("Inserisci il nome del video");
		String titoloVideo = input.nextLine();
		
		System.out.println("Inserisci la luminosita che preferisci da 1 a 10");
		int lumos = input.nextInt();
		
		System.out.println("inserisci il volume");
		int volumeVideo = input.nextInt();
		
		Video firstVideo = new Video(titoloVideo, durata, lumos, volumeVideo);
		firstVideo.aumentaLuminosita();
		firstVideo.alzaVolume();
		firstVideo.play();
		
		input.close();
		
		
	}

}
