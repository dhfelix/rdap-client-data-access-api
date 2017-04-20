package mx.nic.rdap.client.dao.exception;

/**
 * A checked exception implementations are free to extend from and throw when
 * there's a problem initializing themselves.
 */
public class InitializationException extends DataAccessException {

	private static final long serialVersionUID = -5857326719065271676L;

	public InitializationException(String message) {
		super(message);
	}

	public InitializationException(String msg, Throwable cause) {
		super(msg, cause);
	}

}
