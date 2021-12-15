from django.http import HttpResponse


def Suma(x, y):
    return x + y
    
def Resta(x, y):
    return x - y

def Multiplicar(x, y):
    return x * y

def Dividir(x, y):
    return x / y
def CalcuSuma(x, y): return Suma(x, y)
def CalcuResta(x, y): return Resta(x, y)
def CalcuMul(x, y): return Multiplicar(x, y)
def CalcuDiv(x, y): return Dividir(x, y)

def calculadora(request):
	a = 10
	b = 5
	su = CalcuSuma(a,b)
	res = CalcuResta(a,b)
	mul = CalcuMul(a,b)
	div = CalcuDiv(a,b)
	doc = """<html>
	<body>
	<h1>
	Calculadora
	</h1>
	<h2>
	Operaciones de los numero %s y %s 
	</h2>
	<h3>
	Suma %s + %s = %s
	<br>
	Resta %s - %s = %s
	<br>
	Multiplicacion %s * %s = %s
	<br>
	Division %s / %s = %s
	</h3>
	</body>
	</html>
	""" %(a, b, a, b, su, a, b, res, a, b, mul, a, b, div)
	return HttpResponse(doc)