package com.hp.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hp.dao.EmpDao;
import com.hp.framework.PageBean;
import com.hp.pojo.Emp;

//声明此类为业务层
//相当于在spring容器托管了一个
//<bean id="empService" class="com.hp.service.EmpServiceImpl">
@Service("empService")
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	private EmpDao empDao;
	
	@Override
	public PageBean getEmpList(int currentPage, int pageSize, Emp emp) {  
		PageBean page = new PageBean(); 
		//分页条件  
		page.setStartIndex((currentPage - 1)*pageSize);//比如：前面查询5条，后面再从第六条查，故>5即可...
		page.setEndIndex(currentPage*pageSize + 1);    //+1与否取决于查询时是用的小于，还是小于等于
		//查询条件 
		Map<String, Object> params = new HashMap<String, Object>();  
		params.put("employee", emp); 
		page.setParams(params); 
		
		page.setTotal(empDao.getEmpCount());
		page.setRows(empDao.getEmpList(page));
		return page;
	}

}
