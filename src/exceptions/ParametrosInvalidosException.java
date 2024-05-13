package exceptions;

public class ParametrosInvalidosException extends Exception {

	public ParametrosInvalidosException(String errorMessage) {
		super(errorMessage);
	}

	public ParametrosInvalidosException(String errorMessage, Throwable cause) {
		super(errorMessage, cause);
	}

	public ParametrosInvalidosException(Throwable cause) {
		super(cause);
	}

}