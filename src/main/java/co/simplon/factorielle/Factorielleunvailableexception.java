package co.simplon.factorielle;

public  class Factorielleunvailableexception  extends RuntimeException {
	

	private static final long serialVersionUID = 1L;

	public Factorielleunvailableexception(String message) {
		super("ATTENTION NOMBRE NEGATIF");
	}

}
