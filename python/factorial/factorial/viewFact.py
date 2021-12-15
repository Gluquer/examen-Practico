from django.http import HttpResponse

def fact(n):
    factorial_total = 1
    while n > 1:
        factorial_total *= n
        n -= 1
    return factorial_total

def factorial(request):
	n = 7
	res = fact(7)	
	doc = """
	<html>
	<body>
	<h1>
	FACTORIAL DE UN NUMERO
	</h1>
	<h3>
	<pre>
	El factorial de %s es: %s
	</pre>
	</h3>
	</body>
	</html>
	""" %(n,res)
	return HttpResponse(doc)