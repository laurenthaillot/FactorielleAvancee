package co.simplon.factorielle;

/**
 * Factorielle
 */

public class Factorielle  {
	 public Factorielle()  {
		
	}

	public long calculer(long n)  {

		if (n > 1) {
			long fact = calculer(n - 1);
			long factn = n * fact;

			if (factn <= fact) {
				
				throw new Factorielleunvailableexception("ATTENTION NOMBRE NEGATIF");
			}
			return factn;
		}

		else if (n < 0) {
			throw new IllegalArgumentException();
		}
		return 1;
	
	}

	

}
