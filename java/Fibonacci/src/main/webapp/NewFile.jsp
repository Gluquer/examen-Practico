<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form method="get">
<h1>
SERIE FIBONACCI DE 4 DIGITOS 
</h1>
</form>
<%
int num=7;
%>
<h2>
Se muestra los primeros <%out.print(num); %> elementos de la serie
</h2>
<h3>
<%@ page import = "java.io.*" %>
<%@ page import = "java.lang.*" %>

<br>
Serie :
<%
String s ="";
	if (num < 5){
		s = "0, 0, 1, 1, ";	
	}
	else{
	    int num1 = 0;
	    int num2 = 0;
	    int num3 = 1; 
	    int num4 = 1;
	    int series = 2;
	    s = "0, 0, 1, 1,";
	    out.println(s);
	    for (int i =5; i<= num;i++){
	    	   num1 = num2;
		        num2 = num3;
		        num3 = num4;
		        num4 = series;
		        s = series+ ", ";
		        out.println(s);
		        series = num1 + num2 + num3 +num4;	
	    }	     
	}    
%>
</h3>
</body>
</html>