package Exercise1;

public class Main {

	public static void main(String[] args) {
		
	//Rettangoli creati usando la classe Rettangolo come stampino con i vari metodi per calcolare area e perimetro del rettangolo
	Rettangolo rettangolo1 = new Rettangolo(5, 3);
	Rettangolo rettangolo2 = new Rettangolo(10, 15);
	
	//Stampe in console
	System.out.println("Rettangolo 1");
	stampaArea(rettangolo1);
	stampaPerimetro(rettangolo1);
	
	System.out.println("\n");
	
	System.out.println("Rettangolo 2");
	stampaArea(rettangolo2);
	stampaPerimetro(rettangolo2);
	
	}
	
	//FUNZIONI 
	
	//Funzione per stampare in console l'area dei rettangoli
	public static void stampaArea(Rettangolo rettangolo) {
		int area = rettangolo.calcolaArea();
		System.out.println("L'area del rettangolo è: " + area);
	}
	
	//Funzione per stampare in console il perimetro dei rettangoli
	public static void stampaPerimetro(Rettangolo rettangolo) {
		int perimetro = rettangolo.calcolaPerimetro();
		System.out.println("Il perimetro del rettangolo è: " + perimetro);
	}	
}
