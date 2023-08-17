package Invalid;

@SuppressWarnings("serial")
public class InvalidSubspeciesException extends Exception {

	public InvalidSubspeciesException(String message) {
		
		super("Invalid species entered.");
		
	}//end constructor
	
}//end class
