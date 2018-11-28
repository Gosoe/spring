package com.hp.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.hp.framework.PageBean;
import com.hp.pojo.Emp;
import com.hp.service.EmpService;

@Controller
public class EmpController {

	@Autowired
	private EmpService empService;
	
	@RequestMapping("/getEmpList")
	@ResponseBody
	public String getEmpList(@RequestParam("page") int currentPage, @RequestParam("rows") int pageSize,
			Emp emp) throws JsonProcessingException{
		emp = new Emp();
		//emp.setEmpName("aaa");
		//emp.setEmpAge(44);
		
		PageBean pageBean = empService.getEmpList(currentPage, pageSize, emp);
		ObjectMapper om = new ObjectMapper();
		String json = om.writeValueAsString(pageBean);		
		return json;
	}
	
}
