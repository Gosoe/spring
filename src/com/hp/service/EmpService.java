package com.hp.service;

import com.hp.framework.PageBean;
import com.hp.pojo.Emp;

public interface EmpService {

	public PageBean getEmpList(int currentPage, int pageSize, Emp emp);
}
