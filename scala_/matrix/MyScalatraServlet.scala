package com.example.app

import org.scalatra._

class MyScalatraServlet extends ScalatraServlet {
	var Matrix1 = Array.ofDim[Int](2, 2)
    var Matrix2 = Array.ofDim[Int](2, 2)
    var MatrixS = Array.ofDim[Int](2, 2)
    var MatrixR = Array.ofDim[Int](2, 2)
    var MatrixM = Array.ofDim[Int](2, 2)
    var MatrixT = Array.ofDim[Int](2, 2)

    var i: Int = 0
    var j: Int = 0
    var k: Int = 0

    var res: Int = 0
    
    Matrix1(0)(0)=1
    Matrix1(0)(1)=2
    Matrix1(1)(0)=3
    Matrix1(1)(1)=4
    
    Matrix2(0)(0)=1
    Matrix2(0)(1)=2
    Matrix2(1)(0)=3
    Matrix2(1)(1)=4

    def sumaM=()=>{
        i = 0;
        while (i < 2) {
          j = 0;
          while (j < 2) {
            MatrixS(i)(j) = Matrix1(i)(j) + Matrix2(i)(j)
            j = j + 1;
          }
          i = i + 1;
        }
    }
    sumaM()
    def restM=()=>{
        i = 0;
        while (i < 2) {
          j = 0;
          while (j < 2) {
            MatrixR(i)(j) = Matrix1(i)(j) - Matrix2(i)(j)
            j = j + 1;
          }
          i = i + 1;
        }
    }
    restM()
    
    def mulM=()=>{
        i = 0;
        while (i < 2) {
          j = 0;
          while (j < 2) {
            res = 0;
            k = 0;
            while (k < 2) {
              res = res + (Matrix1(i)(k) * Matrix2(k)(j));
              k = k + 1;
            }
            MatrixM(i)(j) = res;
            j = j + 1;
          }
          i = i + 1;
        }
    }
    mulM()
    MatrixT = Matrix1; 
    def traspM=()=>{
        i = 0;
        while (i < 2) {
          j = 0;
          while (j < 2) {
            MatrixT(i)(j)=Matrix1(j)(i);
            j = j + 1;
          }
          i = i + 1;
        }
    }
    traspM()
  get("/") {
    <html>
  	<body>
  	<h1>Operaciones con Matrices</h1>
  	
  	<h3>
  	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{Matrix1(0)(0)}&nbsp;  {Matrix1(0)(1)}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{Matrix2(0)(0)}&nbsp;  {Matrix2(0)(1)}
  	<br>
  	A = &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;B=
  	</br>
  	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{Matrix1(1)(0)}&nbsp;  {Matrix1(1)(1)}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{Matrix2(1)(0)}&nbsp;  {Matrix2(1)(1)}
  	<br>
  	</br>
  	<br>
  	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{MatrixS(0)(0)}&nbsp;  {MatrixS(0)(1)}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{MatrixR(0)(0)}&nbsp;  {MatrixR(0)(1)}
  	<br>
  	A + B = &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;   A - B = 
  	</br>
  	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{MatrixS(1)(0)}&nbsp;  {MatrixS(1)(1)}&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{MatrixR(1)(0)}&nbsp;  {MatrixR(1)(1)}	
  	</br>
  	<br>
  	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{MatrixM(0)(0)}&nbsp;  {MatrixM(0)(1)}
  	<br>
  	A * B = &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
  	</br>
  	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{MatrixM(1)(0)}&nbsp;  {MatrixM(1)(1)}
  	</br>
  	<br>
  	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{MatrixT(0)(0)}&nbsp;  {MatrixT(0)(1)}
  	<br>
  	Transpuesta de A = 
  	</br>
  	&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;{MatrixT(1)(0)}&nbsp;  {MatrixT(1)(1)}
  	</br>
  	</h3>
  	</body></html>
  }

}