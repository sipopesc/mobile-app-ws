package ro.danisi.app.ws.exceptions;

//import java.io.Serial;

public class UserServiceException extends RuntimeException {

//	@Serial
	private static final long serialVersionUID = 1348771109171435607L;

	public UserServiceException(String message) {
		super(message);
	}
}