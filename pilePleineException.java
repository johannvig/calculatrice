package pile;

//message d'exception lorsque la pile est pleine
public class pilePleineException extends Exception{

	public String message;
	public pilePleineException() {
		message="la pile est pleine";
	}

}
