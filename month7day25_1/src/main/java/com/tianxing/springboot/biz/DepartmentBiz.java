package com.tianxing.springboot.biz;

import java.util.List;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.tianxing.springboot.dao.DepartmentDao;
import com.tianxing.springboot.pojo.Department;
@Service
public class DepartmentBiz {
	@Resource
	private DepartmentDao dao;
	/*查询部门*/
	public List<Department> getDepartment(){
		return dao.getDepartment();
	}

}
