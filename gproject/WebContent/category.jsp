<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Categories</title>
<script type="text/javascript" src=Controllers/jQuery.js></script>
<script type="text/javascript" src=Controllers/controllerMain.js></script>
</head>
<body>
	<form id="formCategories"action="category.jsp" method="post">
		<input id="hidMode" name="hidMode" type="hidden" value="save">
		<input id="hidID" name="hidID" type="hidden" value="0">
		Category Name :<input id="txtCategoryName" type="text" name="txtCategoryName"><br>
		Category Description :<input id="txtCategoryDesc" type="text" name="txtCategoryDesc"><br>
		<input id="btnSave" type="button"name="btnSave" value="Save"><br><br>
		<div id="divStsMsgCategory"><%out.println(rudFeedback);%></div>
		<%out.println(categoryGrid);%>
	</form>
</body>
</html>