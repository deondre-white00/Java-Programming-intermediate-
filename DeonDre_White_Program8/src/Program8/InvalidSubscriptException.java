package Program8;

public class InvalidSubscriptException extends RuntimeException {
	
	

	public InvalidSubscriptException() {
		this("Invalid subscript.");
	}

	public InvalidSubscriptException(String error) {
		super(error);
	}

	public InvalidSubscriptException(String error, Throwable cause) {
		super(error, cause);
	} 

}
