package com.cg.ems.dao;

public interface IQueryMapper {

	public static final String APPLY_LEAVE = "INSERT INTO Leave_History VALUES(seq.nextval,?,SYSDATE,?,?,?,?)";
	public static final String UPDATE_BALANCE = "UPDATE Employee SET Emp_Leave_Bal=? WHERE Emp_ID=?";
	public static final String GET_BALANCE = "SELECT Emp_Leave_Bal FROM Employee WHERE Emp_ID=?";
	public static final String REJECT_LEAVE = "UPDATE Leave_History SET status=? WHERE Leave_Id=?";
	public static final String APPROVE_LEAVE = "UPDATE Leave_History SET status=? WHERE Leave_Id=?";
	public static final String GET_ALL_LEAVE = "SELECT * FROM Leave_History WHERE status=? ";
	public static final String ADD_EMPLOYEE = "INSERT INTO Employee VALUES(?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
	public static final String LIST_EMPLOYEE = "SELECT * FROM Employee";
	public static final String FIND_BY_ID = "SELECT * FROM Employee WHERE Emp_ID=?";
	public static final String UPDATE_EMPLOYEE = "UPDATE Employee SET Emp_First_Name=?, Emp_Last_Name=?, Emp_Date_of_Birth=?, Emp_Date_of_Joining=?, Emp_Dept_ID=?, Emp_Grade=?, Emp_Designation=?, Emp_Basic=?, Emp_Gender=?, Emp_Marital_Status=?, Emp_Home_Address=? WHERE Emp_Id=? ";
	public static final String SEARCH_BY_ID = "SELECT * FROM Employee WHERE Emp_ID LIKE ?";

	public static final String SEARCH_BY_FIRST_NAME = "SELECT * FROM Employee WHERE Emp_First_Name LIKE ?";

	public static final String SEARCH_BY_LAST_NAME = "SELECT * FROM Employee WHERE Emp_Last_Name LIKE ?";

	public static final String SEARCH_BY_DEPARTMENT = "SELECT * FROM Employee WHERE Emp_Dept_Id IN (SELECT DISTINCT Dept_Id FROM Department WHERE Dept_Name IN ?)";

	public static final String SEARCH_BY_GRADES = "SELECT * FROM Employee WHERE Emp_Grade IN ?";

	public static final String SEARCH_BY_MARITAL = "SELECT * FROM Employee WHERE Emp_Marital_Status IN ?)";
}
