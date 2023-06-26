import java.util.Arrays;
import java.util.Scanner;

public class firstClass {
	
	public static void main(String[] args) {
		//Esercizio 1
		System.out.println("First day of JAVA");
		
		//Esercizio 2
		int a = 5;
		int b = 3;
		int prodotto = moltiplica(a,b);
		System.out.println("Il prodottto di " + a + " e "  + b + " è: " + prodotto);;
		
		
		String stringa = "Il mio numero preferito e ";
		System.out.println(concatena(stringa, a));
		
		
		String[] arrayOriginale = {"elemento1", "elemento2", "elemento3", "elemento4", "elemento5"};
		String nuovaStringa = "nuovaStringa";
		
		String[] arrayManipolato = inserisciInArray(arrayOriginale, nuovaStringa);
		System.out.println("Array originale: " + Arrays.toString(arrayOriginale));
	    System.out.println("Array manipolato: " + Arrays.toString(arrayManipolato));
	    
	    //Esercizio 3
	    concatenazioneStringhe();
	}
	
	//FUNZIONI
	
	//FUNZIONE PER MOLTIPLICARE
	public static int moltiplica(int n1, int n2) {
		int prodotto = n1 * n2;
		return prodotto;
	}
	
	//FUNZIONE PER CONCATENARE
	public static String concatena(String stringa, int numero) {
		String stringhizza = stringa + numero;
		return stringhizza;
		}
	
	//FUNZIONE PER ARRAY
	public static String[] inserisciInArray(String[] array, String nuovaStringa) {
		
		String[] nuovoArray = new String[6];
		
			nuovoArray[0] = array[0];
	        nuovoArray[1] = array[1];
	        nuovoArray[2] = nuovaStringa;
	        nuovoArray[3] = array[2];
	        nuovoArray[4] = array[3];
	        nuovoArray[5] = array[4];

	        return nuovoArray;
	}
	
	//FUNZIONE PER LA CONCATENZAZIONE DELLE STRINGHE CON SCANNER
    public static void concatenazioneStringhe() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Inserisci la prima stringa: ");
        String stringa1 = scanner.nextLine();

        System.out.print("Inserisci la seconda stringa: ");
        String stringa2 = scanner.nextLine();

        System.out.print("Inserisci la terza stringa: ");
        String stringa3 = scanner.nextLine();

        // Concatenazione in ordine di inserimento
        String concatenazioneOrdineInserimento = stringa1 + stringa2 + stringa3;

        // Concatenazione in ordine di inserimento inverso
        String concatenazioneOrdineInserimentoInverso = stringa3 + stringa2 + stringa1;

        System.out.println("Concatenazione in ordine di inserimento: " + concatenazioneOrdineInserimento);
        System.out.println("Concatenazione in ordine di inserimento inverso: " + concatenazioneOrdineInserimentoInverso);

        scanner.close();
    }
		
}
