package co.simplon.factorielle;

public class Main {

	public Main main;

	public static void main(String[] args) {
		long a = 0;
		long resultat;
		String str = args[0];

		try {
			a = Long.parseLong(str);
		} catch (NumberFormatException nfe) {
			System.out.println("Necessite une valeur numérique (Main)");
			System.exit(10);
		}
		try {
			resultat = Factorielle.calculer(a);
			System.out.println("Bravo ! Le resultat est : " + resultat);
		} catch (IllegalArgumentException IAE) {
			System.out.println("Attention nombre négatif");
		} catch (Factorielleunvailableexception FUE) {
			System.out.println("Resultat incohérent");
		}
	}
}
