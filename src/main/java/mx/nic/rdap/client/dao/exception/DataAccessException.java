package mx.nic.rdap.client.dao.exception;

/**
 * A checked exception implementations are free to extend from and throw when
 * there's a problem accessing data.
 */
public class DataAccessException extends Exception {

	private static final long serialVersionUID = 3344319049605710358L;

	public DataAccessException() {
		super();
	}

	public DataAccessException(String message) {
		super(message);
	}

	public DataAccessException(Throwable cause) {
		super(cause);
	}

	public DataAccessException(String message, Throwable cause) {
		super(message, cause);
	}

}
