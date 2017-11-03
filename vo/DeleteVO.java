package com.ems.vo;

import java.io.Serializable;

/**
 * @author Challa
 *
 */
public class DeleteVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int empNum;

	/**
	 * @return empName
	 */
	public int getEmpNumber() {
		return empNum;
	}

	/**
	 * @param empNumber
	 * @param empName
	 */
	public void setEmpNumber(final int empNumber) {
		this.empNum = empNumber;
	}

	@Override
	public String toString() {
		return "SearchVO [empNum=" + empNum + "]";
	}

}
