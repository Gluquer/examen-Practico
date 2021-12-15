<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>
SERIE POTENCIA DE CUBOS 
</h1>
<%
int num=7;
%>
<h2>
Se muestra los primeros <%out.print(num); %> elementos de la serie
</h2>
<h3>
<br>
Serie :
<%
String s ="";
int series = 0;
for (int i =1; i<= num;i++){
   series = i*i*i;
   s = series+ ",  ";
   out.println(s);
}    
%>
</h3>
</body>
</html>