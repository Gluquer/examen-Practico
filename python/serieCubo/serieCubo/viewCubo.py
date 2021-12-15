from django.http import HttpResponse

def serieC(num):
    j = 1
    s = ""
    for i in range(1, num+1):
	    j = i*i*i
	    s = s +str(j)+ ", ";
    return s
def sCubo(request):
	x = 7
	b = serieC(x)
	doc = """<html>
	<body>
	<h1>
	SERIRE DE POTENCIA DE CUBOS
	</h1>
	<h2> 
	Se muestra los primeros %s elementos de la serie
	</h2>
	<br>
	Serie : %s
	</body>
	</html>
	""" %(x, b)
	return HttpResponse(doc)