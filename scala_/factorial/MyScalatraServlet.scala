package com.example.app

import org.scalatra._

class MyScalatraServlet extends ScalatraServlet {
	var j: Int = 0
    var res: Int = 0   
    def factorial=(n: Int)=>{
        res=1
        j = n
        while (j > 0) {
          res = res*(j)
          j = j - 1
        }
        res
    }
  var x = 7
  get("/") {
    <html>
  	<body>
  	<h1>FACTORIAL</h1>
  	<h2>Halla el factorial de {x} </h2>
  	<br>
  	<h3>El factorial de {x}! es: {factorial(x)}</h3>
  	</br>
  	</body></html>
  }
  
}
