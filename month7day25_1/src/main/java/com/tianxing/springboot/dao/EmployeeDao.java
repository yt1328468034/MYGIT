package com.tianxing.springboot.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.tianxing.springboot.pojo.Employee;

public interface EmployeeDao {
	/*查询某部门的员工*/
	public List<Employee> getEmployee(@Param("dId")String dId);
	/*删除员工*/
    public Integer removeEmployee(@Param("eId")String eId);

}
