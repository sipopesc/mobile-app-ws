package ro.danisi.app.ws.exceptions;

public class UserServiceException extends RuntimeException{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1381366897577798670L;
	
	public UserServiceException(String message) {
		super(message);
	}
}
