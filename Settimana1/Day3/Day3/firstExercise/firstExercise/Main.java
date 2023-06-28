package firstExercise;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		System.out.println("Inserisci una frase");
		String phrase = input.nextLine();
		stringaPariDispari(phrase);
		input.close();
	}

	public static void stringaPariDispari(String stringToCheck) {
		if (stringToCheck.length() % 2 == 0) {
			System.out.println(true);
		} else {
			System.out.println(false);
		}
	}

//	public static boolean isAnnoBisestile(int anno) {
//	    return anno % 400 == 0 ? true : (anno % 100 == 0 ? false : (anno % 4 == 0 ? true : false));
//	}

	public static boolean isAnnoBisestile(int anno) {
	    if (anno % 400 == 0) {
	        return true;
	    } else if (anno % 100 == 0) {
	        return false;
	    } else if (anno % 4 == 0) {
	        return true;
	    } else {
	        return false;
	    }
	}

}