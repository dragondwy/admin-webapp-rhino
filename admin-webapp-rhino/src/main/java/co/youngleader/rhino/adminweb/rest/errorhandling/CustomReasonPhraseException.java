package co.youngleader.rhino.adminweb.rest.errorhandling;

public class CustomReasonPhraseException extends Exception {
	

	private static final long serialVersionUID = 973353803605772467L;
	
	private final int businessCode;

	public CustomReasonPhraseException(int businessCode, String message) {
		super(message);
		this.businessCode = businessCode;
	}

	public int getBusinessCode() {
		return businessCode;
	}
		
}
