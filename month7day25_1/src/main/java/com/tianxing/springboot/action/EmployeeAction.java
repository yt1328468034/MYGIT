package com.tianxing.springboot.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.annotation.Resource;

import org.apache.ibatis.annotations.Param;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tianxing.springboot.biz.EmployeeBiz;
import com.tianxing.springboot.pojo.Employee;

@RestController
@RequestMapping("/api/employees")
public class EmployeeAction {
	@Resource
	private EmployeeBiz biz;
	
	@GetMapping("/{dId}")
	/*查询某部门的员工*/
	public List<Employee> getEmployee(@PathVariable("dId") String dId){
		return biz.getEmployee(dId);
	}
	/*删除员工*/
	@DeleteMapping("/{eId}")
	public Map<String, String> removeEmployee(@PathVariable("eId")String eId) {
    	Map<String, String> map=new HashMap<String, String>();
		try {
			if(biz.removeEmployee(eId)>0) {
				map.put("code", "200");
				map.put("msg", "删除成功");
			}else {
				map.put("code", "101");
				map.put("msg", "删除失败");
			}
		} catch (Exception e) {
			// TODO: handle exception
			map.put("code", "500");
			map.put("msg", "删除失败");
		}
    	return map;
    }

}
