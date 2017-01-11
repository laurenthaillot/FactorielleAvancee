package co.simplon.factorielle;

/**
 * Factorielle
 */
public class Factorielle {
	public Factorielle() {
		super();
	}

	public long calculer(long n) {

		if (n > 1) {
			long fact = calculer(n - 1);
			long factn = n * fact;

			if (factn <= fact) {
				throw new UnsupportedOperationException();
			}
			return factn;
		}

		else if (n < 0) {
			throw new IllegalArgumentException();
		}
		return 1;

		/*
		 * if (n > 1) { return n * calculer(-1); }
		 * 
		 * else if (n < 0) {
		 * 
		 * throw newIllegalArgumentException(); } return 1;
		 */
	}

}
