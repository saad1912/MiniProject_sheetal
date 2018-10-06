package com.cg.ems.dao;


import java.util.List;

import com.cg.ems.bean.EmployeeLeave;
import com.cg.ems.exception.EMSException;

public interface ILeaveApplicationDao {


	

	boolean applyLeave(EmployeeLeave data) throws EMSException;

	
	boolean rejectLeave(int leaveId) throws EMSException;
	List<EmployeeLeave> getAllAppliedLeaves() throws EMSException;

	boolean approveLeave(EmployeeLeave data) throws EMSException;
}
