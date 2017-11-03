package com.ems.exceptions;

/**
 * @author Challa
 *
 */
@SuppressWarnings("serial")
public class EMSBusinessException extends Exception {

	/**
	 * 
	 */
	public EMSBusinessException() {
		super();

	}

	/**
	 * @param message
	 * @param cause
	 */
	public EMSBusinessException(final String message, final Throwable cause) {
		super(message, cause);

	}

	/**
	 * @param message
	 */
	public EMSBusinessException(final String message) {
		super(message);

	}

	/**
	 * @param cause
	 */
	public EMSBusinessException(final Throwable cause) {
		super(cause);

	}

}
