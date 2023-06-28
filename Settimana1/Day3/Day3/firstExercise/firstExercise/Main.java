package firstExercise;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci una frase");
		String phrase = input.nextLine();
		stringaPariDispari(phrase);
	}
	
	public static void stringaPariDispari(String stringToCheck) {
		if (stringToCheck.length() % 2 == 0 ) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}
}