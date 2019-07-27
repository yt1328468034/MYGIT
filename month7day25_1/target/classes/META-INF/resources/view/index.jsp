<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>部门</title>
<link rel="stylesheet" href="/static/css/bootstrap.min.css" />
<style type="text/css">
thead th{
text-align: center;
}
</style>
</head>
<body>
<div id="center">
<table class="table table-hover table-striped  text-center">
      <thead>
      <tr>
      <th>部门编号</th>
       <th>部门名称</th>
        <th>部门地址</th>
      </tr>
      </thead>
      <tbody>
      <c:forEach items="${page.list }" var="d">
      <tr>
      <td>${d.dId }</td>
       <td><a onclick="show('${d.dId}')" title="查看所有员工">${d.dName }</a></td>
        <td>${d.dAddress}</td>
      </tr>
      </c:forEach>
      </tbody>
      <tfoot>
				<tr>
					<td colspan="3" class="text-center">
						<a class="btn btn-default" href="/api/departments/1">首页</a> 
						<a class="btn btn-default" href="/api/departments/${page.hasPreviousPage?page.prePage:1 } ">上一页</a>
						<a class="btn btn-default" href= "/api/departments/${ page.hasNextPage?page.nextPage:page.pages} ">下一页</a>
						<a class="btn btn-default" href="/api/departments/${page.pageSize }">末页</a>
					</td>
				</tr>
			</tfoot>
</table>
</div>
</body>
 <script src="/static/js/jquery-1.12.4.js"></script>
  <script src="/static/js/bootstrap.min.js"></script>
  <script src="/static/js/vue.js"></script>
  <script src="/static/js/dialog.js"></script>
  <script type="text/javascript" src="/static/js/mytable.js"></script>
  <script>
		function show(dId){
			window.sessionStorage.setItem("dId",dId);
			showWindowDialog('/view/emp.html','员工');
		};
		
	</script>
</html>