import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Multimedia[] files = new Multimedia[5];

		for (int i = 0; i < files.length; i++) {
			System.out.println("Inserisci il titolo del file " + (i + 1) + ":");
			String title = input.nextLine();
			System.out.println("Inserisci il genere di file: \n 1)Audio; \n 2)Immagine; \n 3)Video;");
			int genre = Integer.parseInt(input.nextLine()); // Trasformo l'input da stringa a numero

			switch (genre) {

			case 1:

				System.out.println("Inserisci il volume (con un numero da 1 a 10): ");
				int volumeAudio = Integer.parseInt(input.nextLine());

				System.out.println("Inserisci la durata: ");
				int durataAudio = Integer.parseInt(input.nextLine());

				files[i] = new Audio(title, volumeAudio, durataAudio);

				System.out.println(" \n ------------------------------------------------------ \n");

				break;

			case 2:

				System.out.println("Inserisci la luminosita(con un numero da 1 a 10) : ");
				int luminosita = Integer.parseInt(input.nextLine());

				files[i] = new Immagini(title, luminosita);

				System.out.println(" \n ------------------------------------------------------ \n");

				break;

			case 3:

				System.out.println("Inserisci la luminosita(con un numero da 1 a 10) : ");
				int luminositaVideo = Integer.parseInt(input.nextLine());

				System.out.println("Inserisci il volume (con un numero da 1 a 10): ");
				int volumeVideo = Integer.parseInt(input.nextLine());

				System.out.println("Inserisci la durata: ");
				int durataVideo = Integer.parseInt(input.nextLine());

				files[i] = new Video(title, luminositaVideo, volumeVideo, durataVideo);

				System.out.println(" \n ------------------------------------------------------ \n");

				break;

			default:
				
				System.out.println("Genere non valido!! Scegli tra i generi 1 - 2 - 3.");
				i--;
				
				System.out.println(" \n ------------------------------------------------------ \n");

				break;
			}
				
		}
		
		int decisione;
		
		do {
			
			System.out.println("Decidi quale file multimediale eseguire (1- " + files.length + ")");
			
			decisione = Integer.parseInt(input.nextLine());
			
			if (decisione >= 1 && decisione <= files.length) {
				Multimedia file = files[decisione - 1];
				if (file instanceof Riproduci) {
					((Riproduci) file).play();
				} else if (file instanceof Immagini) {
					((Immagini) file).show();
				}

				System.out.println(
						"Vuoi aumentare o abbassare la luminosità o il volume? (1 = Aumenta luminosità, 2 = Abbassa luminosità, 3 = Aumenta volume, 4 = Abbassa volume, 5 = Esci)");
				int opzione = Integer.parseInt(input.nextLine());
				switch (opzione) {
				case 1:
					if (file instanceof Video) {
						((Video) file).aumentaLuminosita();
					} else if (file instanceof Immagini) {
						((Immagini) file).aumentaLuminosita();
					}
					break;
				case 2:
					if (file instanceof Video) {
						((Video) file).diminuisciLuminosita();
					} else if (file instanceof Immagini) {
						((Immagini) file).diminuisciLuminosita();
					}
					break;
				case 3:
					if (file instanceof Video) {
						((Video) file).alzaVolume();
					} else if (file instanceof Audio) {
						((Audio) file).alzaVolume();
					}
					break;
					
				case 4:
					
					if (file instanceof Video) {
						((Video) file).abbassaVolume();
					} else if (file instanceof Audio) {
						((Audio) file).abbassaVolume();
					}
					
					break;
					
				case 5:
					break;
					
				default:
					
					System.out.println("Opzione non valida. Riprova.");
					
					break;
				}
			
		} else if(decisione != 0) {
			
			System.out.println("Decisione non valida. Inserisci ");
			
		}
			
		} while (decisione != 0);

		input.close();

	}
}
