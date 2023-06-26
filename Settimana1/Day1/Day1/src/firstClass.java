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
	    
	    //Esercizio 4
	    
	    //Parte 1
	    double lunghezzaLato1 = 5.2;
        double lunghezzaLato2 = 3.8;

        double perimetro = perimetroRettangolo(lunghezzaLato1, lunghezzaLato2);

        System.out.println("Il perimetro del rettangolo è: " + perimetro);
        
        //Parte 2
        int numero = 7;

        int risultato = pariDispari(numero);

        System.out.println("Il numero " + numero + " è " + (risultato == 0 ? "pari" : "dispari"));
        
        //Parte 3
        double lato1 = 3.4;
        double lato2 = 5.1;
        double lato3 = 4.2;

        double area = areaTriangolo(lato1, lato2, lato3);

        System.out.println("L'area del triangolo è: " + area);
	    
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
    
    //FUNZIONE PERIMETRO RETTANGOLO
        public static double perimetroRettangolo(double lato1, double lato2) {
            double perimetro = 2 * (lato1 + lato2);
            return perimetro;
        }
       
    //FUNZIONE PARI / DISPARI
        public static int pariDispari(int numero) {
            if (numero % 2 == 0) {
                return 0; // Il numero è pari
            } else {
                return 1; // Il numero è dispari
            }
    }
        
   //FUNZIONE PERIMETRO TRIANGOLO
        public static double areaTriangolo(double lato1, double lato2, double lato3) {
            double semiperimetro = (lato1 + lato2 + lato3) / 2;
            double area = Math.sqrt(semiperimetro * (semiperimetro - lato1) * (semiperimetro - lato2) * (semiperimetro - lato3));
            return area;
        }
}

