package com.ems.test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.List;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.ems.bo.DisplayBO;
import com.ems.bo.DisplayBOImpl;
import com.ems.exceptions.EMSBusinessException;
import com.ems.exceptions.EMSException;
import com.ems.vo.EmployeeVO;

/**
 * @author Challa
 *
 */
public class DisplayBOImplTest {
	private static DisplayBO displayBO;

	/**
	 * 
	 */
	@BeforeClass
	public static void init() {
		System.out.println("I AM From init");
		displayBO = new DisplayBOImpl();
	}

	/**
	 * 
	 */
	@AfterClass
	public static void destroy() {
		System.out.println("I Am From destroy ");
		displayBO = null;
	}

	/**
	 * 
	 */
	@Test
	public void testGetDepartmentEmpList() {
		try {
			List<EmployeeVO> myDeptEmpList = displayBO.getDepartmentEmpList(40);
			assertEquals(myDeptEmpList.size(), 2);
		} catch (EMSException | EMSBusinessException e) {
			fail();
		}
	}

	/**
	 * 
	 */
	@Test
	public void testGetDepartmentEmpList1() {
		try {
			List<EmployeeVO> myDeptEmpList = displayBO
					.getDepartmentEmpList(100);
		} catch (EMSException | EMSBusinessException e) {
			// JDK 1.7 Version Updation
			System.err.println("Exception Caught" + e.getMessage());
		}
	}

	/**
	 * 
	 */
	@Test
	public void testGetDepartmentEmpList2() {
		try {
			List<EmployeeVO> myDeptEmpList = displayBO.getDepartmentEmpList(40);
			List<EmployeeVO> myActualEmpList = new ArrayList<EmployeeVO>();
			EmployeeVO valueObject = new EmployeeVO();
			valueObject.setEmpNumber(9231);
			valueObject.setEmpName("ADAMS");
			valueObject.setEmpJob("CLERK");
			valueObject.setEmpBossCode(7788);
			valueObject.setEmpBasic(1100);
			valueObject.setEmpCommission(0);
			valueObject.setEmpDeptNumber(40);
			EmployeeVO valueObject1 = new EmployeeVO();
			valueObject1.setEmpNumber(9232);
			valueObject1.setEmpName("MILLER");
			valueObject1.setEmpJob("SALESMAN");
			valueObject1.setEmpBossCode(7782);
			valueObject1.setEmpBasic(1300);
			valueObject1.setEmpCommission(0);
			valueObject1.setEmpDeptNumber(40);
			myActualEmpList.add(valueObject);
			myActualEmpList.add(valueObject1);
			assertEquals(myActualEmpList, myDeptEmpList);
		} catch (EMSException | EMSBusinessException e) {
			fail();
		}
	}
}
