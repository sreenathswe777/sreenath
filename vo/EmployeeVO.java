package com.ems.vo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Challa
 *
 */
public class EmployeeVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private int empNumber;
	private String empName;
	private String empJob;
	private int empBossCode;
	private Date empDateOfJoin;
	private double empBasic;
	private double empCommission;
	private int empDeptNumber;

	/**
	 * @return empNumber
	 */
	public int getEmpNumber() {
		return empNumber;
	}

	/**
	 * @param empNumber
	 */
	public void setEmpNumber(final int empNumber) {
		this.empNumber = empNumber;
	}

	/**
	 * @return empName
	 */
	public String getEmpName() {
		return empName;
	}

	/**
	 * @param empName
	 */
	public void setEmpName(final String empName) {
		this.empName = empName;
	}

	/**
	 * @return empJob
	 */
	public String getEmpJob() {
		return empJob;
	}

	/**
	 * @param empJob
	 */
	public void setEmpJob(final String empJob) {
		this.empJob = empJob;
	}

	/**
	 * @return empBossCode
	 */
	public int getEmpBossCode() {
		return empBossCode;
	}

	/**
	 * @param empBossCode
	 */
	public void setEmpBossCode(final int empBossCode) {
		this.empBossCode = empBossCode;
	}

	/**
	 * @return empDateOfJoin
	 */
	public Date getEmpDateOfJoin() {
		return empDateOfJoin;
	}

	/**
	 * @param empDateOfJoin
	 */
	public void setEmpDateOfJoin(final Date empDateOfJoin) {
		this.empDateOfJoin = empDateOfJoin;
	}

	/**
	 * @return empBasic
	 */
	public double getEmpBasic() {
		return empBasic;
	}

	/**
	 * @param empBasic
	 */
	public void setEmpBasic(final double empBasic) {
		this.empBasic = empBasic;
	}

	/**
	 * @return empCommission
	 */
	public double getEmpCommission() {
		return empCommission;
	}

	/**
	 * @param empCommission
	 */
	public void setEmpCommission(final double empCommission) {
		this.empCommission = empCommission;
	}

	/**
	 * @return empDeptNumber
	 */
	public int getEmpDeptNumber() {
		return empDeptNumber;
	}

	/**
	 * @param empDeptNumber
	 */
	public void setEmpDeptNumber(final int empDeptNumber) {
		this.empDeptNumber = empDeptNumber;
	}

	@Override
	public String toString() {
		return "EmployeeVO [empNumber=" + empNumber + ", empName=" + empName
				+ ", empJob=" + empJob + ", empBossCode=" + empBossCode
				+ ", empDateOfJoin=" + empDateOfJoin + ", empBasic=" + empBasic
				+ ", empCommission=" + empCommission + ", empDeptNumber="
				+ empDeptNumber + "]";
	}

}
