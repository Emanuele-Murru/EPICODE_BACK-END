package firstExercise;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.println("Inserisci una frase");
		String phrase = input.nextLine();
		stringaPariDispari(phrase);

		System.out.println("Inserisci anno");
		int year = input.nextInt();
		input.nextLine();
		isAnnoBisestile(year);

		input.close();
	}

	public static void stringaPariDispari(String stringToCheck) {
		if (stringToCheck.length() % 2 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

	// Funzione fatta con ternario
//	public static void isAnnoBisestile(int year) {
//		boolean isBisestile = false;
//
//		if (year % 4 == 0) {
//			if (year % 100 != 0 || year % 400 == 0) {
//				isBisestile = true;
//			}
//		}
//		
//		 System.out.println(year + " è un anno bisestile? " + isBisestile);
//	}

	// Funzione fatta con if / else if
	public static void isAnnoBisestile(int year) {
	    if (year % 400 == 0) {
	        System.out.println(true);
	    } else if (year % 100 == 0) {
	        System.out.println(false);
	    } else if (year % 4 == 0) {
	        System.out.println(true);
	    } else {
	        System.out.println(false);
	    }
	}

}