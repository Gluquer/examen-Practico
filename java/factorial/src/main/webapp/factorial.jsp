<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%!
private int factorial(int n){
	int res = 1;
	while (n > 1){
		res *= n;
		n -= 1;	
	}	
	return res;
}
%>
<h1>
FACTORIAL DE UN NUMERO
</h1>
<h2>
<%
int x = 7;
%>
<pre>
	El factorial de <%out.print(x); %> es = <%out.print(factorial(x)); %> 
</pre>
</h2>
</body>
</html>