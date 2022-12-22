package pile;

//message d'exception lorsque la pile est vide
public class pileVideException extends Exception{

	public String message;
	public pileVideException() {
		message="la pile est vide";
	}

}
