package co.simplon.factorielle;

public class Main {

	public Main main;

	public static void main(String[] args) {
		long a = 0;
		long resultat;
		
		try {
			a = Long.parseLong(args[0]);
		} catch (NumberFormatException nfe) {
			System.out.println("Cas Erreur 1 : Necessite une valeur numérique. Votre valeur est : "+ args[0]);
			System.exit(10);
		} catch (ArrayIndexOutOfBoundsException AIOBE) {
			System.out.println("Cas erreur 4 : La valeur est vide");
			System.exit(5);
		}
		
		try {
			resultat = Factorielle.calculer(a);
			System.out.println("Bravo ! La factorielle de " + a + " est : " + resultat);
		} catch (IllegalArgumentException IAE) {
			System.out.println("Cas Erreur 2 : Attention nombre négatif. Votre valeur est : "+ a);
		} catch (Factorielleunvailableexception FUE) {
			System.out.println("Cas Erreur 3 : " + a + " est une valeur incoherente pour ce type de calcul");
		} 
	}
}

