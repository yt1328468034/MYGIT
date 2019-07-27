package com.tianxing.springboot.biz;

import java.util.List;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.tianxing.springboot.dao.EmployeeDao;
import com.tianxing.springboot.pojo.Employee;
@Service
public class EmployeeBiz {
	@Resource
	private EmployeeDao dao;
	/*查询某部门的员工*/
	public List<Employee> getEmployee(@Param("dId")String dId){
		return dao.getEmployee(dId);
	}
	/*删除员工*/
	@Transactional(propagation = Propagation.REQUIRED, isolation = Isolation.READ_COMMITTED, readOnly = false)
    public Integer removeEmployee(@Param("eId")String eId) {
    	return dao.removeEmployee(eId);
    }

}
