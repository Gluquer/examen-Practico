package com.example.app

import org.scalatra._

class MyScalatraServlet extends ScalatraServlet {
def fibonacci_iterative(n: Int): String = {
  var s: String = ""
  if( n < 5 ){
    s = "0, 0, 1, 1, "
  s  
  } else {
    var i = n
    var num1 = 0
    var num2 = 0
    var num3 = 1
    var num4 = 1
    var new_acc = 2
    s = "0, 0, 1, 1"
    while(i > 4) {
        i -= 1
        num1 = num2
	      num2 = num3
	      num3 = num4
	      num4 = new_acc
	      s = s + ", "+ new_acc.toString
        new_acc = num1 + num2 + num3 + num4
    }
    s
  }
  s
}
var x = 13
  get("/") {
  <html>
  	<body>
  	<h1>SERIE FIBONACCI DE CUATRO DIGITOS</h1>
  	<h2>Se muestra los primero {x} elementos de la serie</h2>
  	<br>
  	<h3>serie: {fibonacci_iterative(x)}</h3>
  	</br>
  	</body></html>
  }

}
