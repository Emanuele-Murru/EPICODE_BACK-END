package thridExercise;
import java.util.Scanner;

public class Main {


	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		String input;

		do {
			System.out.print("Scrivi una frase qui: ");
			input = scanner.nextLine();

			if (!input.equals(":q")) {
				suddividiInCaratteri(input);
			}
		} while (!input.equals(":q"));

		scanner.close();
	}

	public static void suddividiInCaratteri(String input) {
		
		String[] caratteri = input.split("");
		StringBuilder risultato = new StringBuilder();

		for (String carattere : caratteri) {
			risultato.append(carattere).append(",");
		}

		//Per rimuovere la virgola ⬇️
		if (risultato.length() > 0) {
			risultato.deleteCharAt(risultato.length() - 1);
		}

		System.out.println("Risultato: " + risultato.toString());
	}
}
