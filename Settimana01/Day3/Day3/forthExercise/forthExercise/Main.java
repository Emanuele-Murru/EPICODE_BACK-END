package forthExercise;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {

		System.out.println("Inserisci un numero intero 😎");
		Scanner input = new Scanner(System.in);
		int numero = input.nextInt();
		countdown(numero);
		
		input.close();
	}

	public static void countdown(int numero) {
		for (int i = numero; i >= 0; i--) {
			System.out.println(i);
		}
	}
}
