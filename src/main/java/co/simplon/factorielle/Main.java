package co.simplon.factorielle;

public class Main {

	public Main main;

	public static void main(String[] args) {
		long a = 0;
		
		try {
			a = calculerEtAfficher(args);
		} catch (NumberFormatException nfe) {
			System.out.println("Cas Erreur 1 : Necessite une valeur numérique. Votre valeur est : "+ args[0]);
			System.exit(1);
		} catch (ArrayIndexOutOfBoundsException AIOBE) {
			System.out.println("Cas erreur 4 : La valeur est vide");				
		} catch (IllegalArgumentException IAE) {
			System.out.println("Cas Erreur 2 : Attention nombre négatif. Votre valeur est : "+ a);
		} catch (Factorielleunvailableexception FUE) {
			System.out.println("Cas Erreur 3 : " + a + " est une valeur incoherente pour ce type de calcul");
		} 
	}

	private static long calculerEtAfficher(String[] args) {
		long a;
		long resultat;
		a = Long.parseLong(args[0]);
		resultat = Factorielle.calculer(a);
		System.out.println("Bravo ! La factorielle de " + a + " est : " + resultat);
		return a;
	}
}

