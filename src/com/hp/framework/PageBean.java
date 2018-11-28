package com.hp.framework;

import java.util.List;
import java.util.Map;

public class PageBean {
	
	//分页查询条件
	private int startIndex;  
	private int endIndex;  
	private Map<String, Object> params;   //此参数用于多条件查询时封装类 #{params.object.attribute} 
	
	//分页返回值    
	private int total;  
	private List rows;  
	
	public int getStartIndex() {
		return startIndex;
	}
	public void setStartIndex(int startIndex) { 
		this.startIndex = startIndex; 
	}
	public int getEndIndex() {
		return endIndex;
	}
	public void setEndIndex(int endIndex) {
		this.endIndex = endIndex;
	}
	public int getTotal() {
		return total;
	}
	public void setTotal(int total) {
		this.total = total;
	}
	public List getRows() {
		return rows;
	}
	public void setRows(List rows) {
		this.rows = rows;
	}
	public Map<String, Object> getParams() {
		return params;
	}
	public void setParams(Map<String, Object> params) {
		this.params = params;
	}
}
