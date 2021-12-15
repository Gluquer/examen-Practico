<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>CALCULADORA</h1>
  
<%!
private int suma(int a,int b){   return a + b;}
private int resta(int a,int b){   return a - b;}
private int mult(int a,int b){   return a * b;}
private int div(int a,int b){   return a / b;}

private int calcuSuma(int a,int b){   return suma(a,b);}
private int calcuResta(int a,int b){   return resta(a,b);}
private int calcuMul(int a,int b){   return mult(a,b);}
private int calcuDiv(int a,int b){   return div(a,b);}
%> 
<%
int x = 10,y =5;
%>
<h2>Operaciones aritemeticas con los numeros  <% out.println(x);%> y  <% out.println(y);%> </h2>
<h2>
SUMA: <% out.println(x);%> + <% out.println(y);%> = : <% out.println(calcuSuma(x, y));%>
<br>
RESTA: <% out.println(x);%> - <% out.println(y);%> = : <% out.println(calcuResta(x, y));%>
<br>
MULTIPLICACION: <% out.println(x);%> * <% out.println(y);%> = : <% out.println(calcuMul(x, y));%>
<br> 
DIVISION: <% out.println(x);%> / <% out.println(y);%> = : <% out.println(calcuDiv(x, y));%>
</h2>
</body>
</html>