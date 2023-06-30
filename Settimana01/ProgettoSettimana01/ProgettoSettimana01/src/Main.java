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
				
				System.out.println(" \n ------------------------------------------------------");

				break;
			}

		}

		input.close();
	}

}
