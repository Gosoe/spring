package com.hp.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.hp.framework.PageBean;
import com.hp.pojo.Emp;

//声明接口为dao层
@Repository("empDao")
public interface EmpDao {
	
	public int getEmpCount();
	
	public List<Emp> getEmpList(PageBean page);
}
