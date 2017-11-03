package com.ems.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.text.ParseException;
import java.util.Date;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ems.bo.RegistrationBO;
import com.ems.bo.RegistrationBOImpl;
import com.ems.exceptions.EMSBusinessException;
import com.ems.exceptions.EMSException;
import com.ems.vo.EmployeeVO;

/**
 * @author Srinath
 *
 */
public class RegistrationBOImplTest {

	private static RegistrationBO registrationBO;
	private EmployeeVO valueObject;

	/**
		 * 
		 */
	@BeforeClass
	public static void init() {
		System.out.println("I AM From init");
		registrationBO = new RegistrationBOImpl();
	}

	/**
		 * 
		 */
	@AfterClass
	public static void destroy() {
		System.out.println("I Am From destroy ");
		registrationBO = null;
	}

	/**
	 * @throws ParseException
	 * 
	 */
	@Test
	public void test1registerEmployee() {

		String methodName = "readEmployeeDetails()";
		System.out.println("Method Invoked:" + methodName);

		int empNumber = 41;
		String empName = "sri";
		String empJob = "snr.java developer";
		int empBossCode = 1111;
		String empDoj = "02-12-1998";

		double empBasic = 1800;

		double empCommission = 2.50;
		int empDeptNumber = 10;
		EmployeeVO valueObject = new EmployeeVO();
		valueObject.setEmpNumber(empNumber);
		valueObject.setEmpName(empName);
		valueObject.setEmpBasic(empBasic);
		valueObject.setEmpBossCode(empBossCode);
		valueObject.setEmpCommission(empCommission);
		valueObject.setEmpDeptNumber(empDeptNumber);
		valueObject.setEmpJob(empJob);
		@SuppressWarnings("deprecation")
		Date dateFormat = new Date("dd-MM-yyyy");
		// Date dateOfJoin = dateFormat.parse(empDoj);
		valueObject.setEmpDateOfJoin(dateFormat);

		try {

			boolean req = registrationBO.registerEmployee(valueObject);

		} catch (EMSException | EMSBusinessException e) {
			fail();
		}
	}

	/**
	 * same emp number
	 */
	@Test
	public void test2registerEmployee() {

		String methodName = "readEmployeeDetails()";
		System.out.println("Method Invoked:" + methodName);

		int empNumber = 41;
		String empName = "srinath";
		String empJob = "snr.java developer";
		int empBossCode = 11;
		String empDoj = "1998-02-02";

		double empBasic = 1800;

		double empCommission = 2.50;
		int empDeptNumber = 10;
		EmployeeVO valueObject = new EmployeeVO();
		valueObject.setEmpNumber(empNumber);
		valueObject.setEmpName(empName);
		valueObject.setEmpBasic(empBasic);
		valueObject.setEmpBossCode(empBossCode);
		valueObject.setEmpCommission(empCommission);
		valueObject.setEmpDeptNumber(empDeptNumber);
		valueObject.setEmpJob(empJob);
		@SuppressWarnings("deprecation")
		Date dateFormat = new Date("dd-MM-yyyy");
		// Date dateOfJoin = dateFormat.parse(empDoj);
		valueObject.setEmpDateOfJoin(dateFormat);

		try {

			boolean req = registrationBO.registerEmployee(valueObject);
			assertEquals(req, false);

		} catch (EMSException | EMSBusinessException e) {
			fail();
		}
	}

	/**
	 * too long emp name
	 */
	@Test
	public void test3registerEmployee() {

		String methodName = "readEmployeeDetails()";
		System.out.println("Method Invoked:" + methodName);

		int empNumber = 41;
		String empName = "srinathhhhhhhhhhhhhhhhhhhh";
		String empJob = "snr.java developer";
		int empBossCode = 11;
		String empDoj = "02-12-1998";

		double empBasic = 1800;

		double empCommission = 2.50;
		int empDeptNumber = 10;
		EmployeeVO valueObject = new EmployeeVO();
		valueObject.setEmpNumber(empNumber);
		valueObject.setEmpName(empName);
		valueObject.setEmpBasic(empBasic);
		valueObject.setEmpBossCode(empBossCode);
		valueObject.setEmpCommission(empCommission);
		valueObject.setEmpDeptNumber(empDeptNumber);
		valueObject.setEmpJob(empJob);
		Date dateFormat = new Date("dd-MM-yyyy");
		// Date dateOfJoin = dateFormat.parse(empDoj);
		valueObject.setEmpDateOfJoin(dateFormat);

		try {

			boolean req = registrationBO.registerEmployee(valueObject);

		} catch (EMSException | EMSBusinessException e) {
			fail();
		}
	}

	/**
	 * spl character in emp job
	 */
	@Test
	public void test4registerEmployee() {

		String methodName = "readEmployeeDetails()";
		System.out.println("Method Invoked:" + methodName);

		int empNumber = 41;
		String empName = "srinath";
		String empJob = "snr.java@developer";
		int empBossCode = 11;
		String empDoj = "1998-02-02";

		double empBasic = 1800;

		double empCommission = 2.50;
		int empDeptNumber = 10;
		EmployeeVO valueObject = new EmployeeVO();
		valueObject.setEmpNumber(empNumber);
		valueObject.setEmpName(empName);
		valueObject.setEmpBasic(empBasic);
		valueObject.setEmpBossCode(empBossCode);
		valueObject.setEmpCommission(empCommission);
		valueObject.setEmpDeptNumber(empDeptNumber);
		valueObject.setEmpJob(empJob);
		Date dateFormat = new Date("dd-MM-yyyy");
		// Date dateOfJoin = dateFormat.parse(empDoj);
		valueObject.setEmpDateOfJoin(dateFormat);

		try {

			boolean req = registrationBO.registerEmployee(valueObject);

		} catch (EMSException | EMSBusinessException e) {
			fail();
		}
	}

	/**
	 * @throws NullPointerException
	 * @throws EMSException
	 * @throws EMSBusinessException
	 */
	@Test
	public void test5registerEmployee() throws NullPointerException,
			EMSBusinessException, EMSException {

		String methodName = "readEmployeeDetails()";
		System.out.println("Method Invoked:" + methodName);

		try {

			boolean req = registrationBO.registerEmployee(valueObject);

		} catch (NullPointerException e) {
			System.out.println(e);
			fail();
		}
	}

}
