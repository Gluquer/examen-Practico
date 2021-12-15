from django.http import HttpResponse

def fibonacci(num):
    if num < 5:
    	s = "0 0 1 1 "
    else:
	    num1 = 0
	    num2 = 0
	    num3 = 1
	    num4 = 1
	    series = 2
	    s = "0 0 1 1"
	    for i in range(4,num):
	        num1 = num2;
	        num2 = num3;
	        num3 = num4;
	        num4 = series;
	        s = s + ' '+str(series);
	        series = num1 + num2 + num3 +num4;
    return s
def fibo(request):
	x = 14
	b = fibonacci(x)
	doc = """<html>
	<body>
	<h1>
	SERIE FIBONACCI DE CUATRO DIGITOS
	</h1>
	<h2>
	Se muestra los primeros %s elementos de la serie
	</h2>
	<h3>
	Serie : %s
	</h3>
	</body>
	</html>
	""" %(x, b)
	return HttpResponse(doc)