package org.durga.cmdpattern.exception;

/**
 * 
 * @Author	    : Durga Prasad Narikalapa
 * @Created On  : 24-May-2017 02:30:17 PM
 * @Version	    : 1.0 
 * @Description : "CommandNotAvailableException" is used for
 * 
 **/

public class CommandNotAvailableException extends Exception {

	private static final long serialVersionUID = 1L;

	private String errorCode;

	public CommandNotAvailableException(String message, Exception e) {
		super(message, e);
	}

	public CommandNotAvailableException(String errCode, String message) {
		super(message);
		errorCode = errCode;
	}

	public CommandNotAvailableException(String errCode, String message, Exception e) {
		super(message, e);
		errorCode = errCode;
	}

	public CommandNotAvailableException(String message) {
		super(message);
	}

	public String getErrorCode() {
		return errorCode;
	}

	public void setErrorCode(String errorCode) {
		this.errorCode = errorCode;
	}

}
