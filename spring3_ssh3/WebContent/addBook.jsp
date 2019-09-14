<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags"  prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>添加图书</h1>
<s:form action="book_add" namespace="/" method="post" theme="simple">
	图书名称:<s:textfield name="name"/><br/>
	图书价格:<s:textfield name="price"/><br/>
	<s:submit value="添加图书"/>
</s:form>
</body>
</html>