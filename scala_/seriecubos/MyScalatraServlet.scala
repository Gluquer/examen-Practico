package com.example.app

import org.scalatra._

class MyScalatraServlet extends ScalatraServlet {
    def serieCubos(n: Int): String = {
        var s: String = ""
        var num1 = 1
        var i = 1
        while(i <= n) {
            num1 = i*i*i    
            s = s + num1+ ", "
            i += 1
        }
        s
    }
    var x = 7
  get("/") {
	<html>
  	<body>
  	<h1>SERIE NUMEROS AL CUBO</h1>
  	<h2>Se muestra los primero {x} elementos de la serie</h2>
  	<br>
  	<h3>serie: {serieCubos(x)}</h3>
  	</br>
  	</body></html>
  }

}
