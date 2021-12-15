package com.example.app

import org.scalatra._

class MyScalatraServlet extends ScalatraServlet {
def sum(a: Int, b: Int): Int = a + b
def res(a: Int, b: Int): Int = a - b
def mult(a: Int, b: Int): Int = a * b
def divide(a: Int, b: Int): Int = a / b
def calcuSum(a: Int, b: Int)=sum(a, b)
def calcuRes(a: Int, b: Int)=res(a, b)
def calcuMul(a: Int, b: Int)=mult(a, b)
def calcuDiv(a: Int, b: Int)=divide(a, b)
var x= 5
var y= 9
  get("/") {
  	<html>
  	<body>
  	<h1>CALCULADORA</h1>
  	<h2>Las operaciones aritmeticas de los numeros {x} y {y} es:</h2>
  	<h3>Suma: {x} + {y} = {calcuSum(x,y)}
  	<br>
  	resta: {x} - {y} = {calcuRes(x,y)}
  	</br>
  	Multiplicacion: {x} * {y} {calcuMul(x,y)}
  	<br>
  	Division: {x} / {y} = {calcuDiv(x,y)}
  	</br>
  	</h3>
  	</body></html>
  }
}