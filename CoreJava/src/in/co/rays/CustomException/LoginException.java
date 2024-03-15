package in.co.rays.CustomException;

public class LoginException extends RuntimeException {

	public LoginException() {
		super("Invalid user id..");
	
	}
}
