package com.tianxing.springboot.action;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.tianxing.springboot.biz.DepartmentBiz;
import com.tianxing.springboot.pojo.Department;

@Controller
@RequestMapping("/api/departments")
public class DepartmentAction {
	@Resource
	private DepartmentBiz biz;
	@GetMapping("/{p}")
	/*查询部门*/
	public String getDepartment(@PathVariable Integer p,HttpServletRequest req){
		p=p==null?1:p;
		PageHelper.startPage(p, 2);
		req.setAttribute("page",new PageInfo<Department>(biz.getDepartment()));
		return "index";
	}

}
