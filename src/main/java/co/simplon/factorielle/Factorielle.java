package co.simplon.factorielle;


public class Factorielle  {
	 public Factorielle() {
		
	}

	public static long calculer(long n)  {

		if (n > 1) {
			long fact = calculer(n - 1);
			long factn = n * fact;

			 if (factn < fact) {
	                throw new Factorielleunvailableexception("La limite de calcul factoriel atteinte");
	            }
	            return factn;
	            
	        } else if (n < 0) {
	            throw new IllegalArgumentException();
	        }
		return 1;
		}
	}


