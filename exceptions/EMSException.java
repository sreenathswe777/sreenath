package com.ems.exceptions;

/**
 * @author Challa
 *
 */
@SuppressWarnings("serial")
public class EMSException extends Exception {

	/**
	 * 
	 */
	public EMSException() {
		super();

	}

	/**
	 * @param message
	 */
	public EMSException(final String message) {
		super(message);

	}

	/**
	 * @param cause
	 */
	public EMSException(final Throwable cause) {
		super(cause);

	}

}
