<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<html>
<head>
<title>Spring MVC Form Handling...</title>
<style type="text/css">
.error {
	color: #ff0000;
}
.errorblock{
	color: #000;
	background-color: #ffEEEE;
	border: 3px solid #ff0000;
	padding:8px;
	margin:16px;
}
</style>
</head>
<jsp:setProperty property="hiddenVar" name="jaiHo" value="test var"/>
<body>
<h2>Spring's form textbox example</h2>

<form:form method="POST"  action="mvcForm" modelAttribute="jaiHo" >
<form:errors path="*" cssClass="errorblock" element="div"/>

<table>
	<tr>
		<td>Username :</td>
		<td><form:input path="userName" /></td>
		<td><form:errors path="userName" cssClass="error" /></td>
	</tr>
	
	password:<form:password path="password"/>
	City:<br>
	<form:checkbox path="city" value="Bhuvaneshwar"/>Bhuvaneshwar<br>
	<form:checkbox path="city" value="Hyderabad"/>Hyderabad<br>
	<form:checkbox path="city" value="Banglore"/>Banglore<br>
	PickOne:<br>
	<form:radiobutton path="pickOne" value="patna"/>1<br>
	<form:radiobutton path="pickOne" value="bhuvaneshwar"/>2<br>
	<form:radiobutton path="pickOne" value="coimbatore"/>3<br>
	
	<form:hidden path="hiddenVar" />
	<tr>
		<td colspan="3"><input type="submit" /></td>
	</tr>
</table>
</form:form>

</body>
</html>