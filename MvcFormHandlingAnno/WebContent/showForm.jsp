<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Spring MVC Form Handling...</title>
</head>

<body>
<h2>Spring's form textbox example</h2>

<form:form method="POST"  action="mvcForm.html" modelAttribute="jaiHo" >

<table>
	<tr>
		<td>Username :</td>
		<td><form:input path="userName" /></td>
	</tr>
	<tr>
		<td colspan="3"><input type="submit" /></td>
	</tr>
</table>
</form:form>

</body>
</html>