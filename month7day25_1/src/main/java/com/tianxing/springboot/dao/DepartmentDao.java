package com.tianxing.springboot.dao;

import java.util.List;

import com.tianxing.springboot.pojo.Department;

public interface DepartmentDao {
	/*查询部门*/
	public List<Department> getDepartment();

}
