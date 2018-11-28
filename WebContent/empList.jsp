<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" type="text/css" href="easyUI/themes/default/easyui.css">
<link rel="stylesheet" type="text/css" href="easyUI/themes/icon.css">
<link rel="stylesheet" type="text/css" href="easyUI/demo.css">
<script type="text/javascript" src="easyUI/js/jquery.min.js"></script>
<script type="text/javascript" src="easyUI/js/jquery.easyui.min.js"></script>
<title>Insert title here</title>
</head>
<body>
<table id="userDataGrid" class="easyui-datagrid" title="用户信息列表" style="width:1000px;height:250px"
		data-options="
			fit:true,
			rownumbers:true,
			singleSelect:false,
			url:'getEmpList',
			method:'get',
			pagination:true,
			pageSize:5,
			pageList:[2,3,4,5,10],
			remoteSort:false,
			multiSort:true
			">
	<thead>
		<tr>
			<th data-options="field:'ck',checkbox:true"></th>
			<th data-options="field:'empId',width:180,hidden:true">ID</th>
			<th data-options="field:'empName',width:100,align:'center'">姓名</th>
			<th data-options="field:'empAge',width:180,align:'center',sortable:true">年龄</th>
		</tr>
	</thead>
</table>


</body>
</html>