from django.http import HttpResponse

A = [[1,2],[3,4]]
B = [[1,2],[3,4]]

S = [[0,0],[0,0]]
R = [[0,0],[0,0]]
M = [[0,0],[0,0]]
T = [[0,0],[0,0]]

res=0

def suma():
	for i in range(2):
	   	for j in range(2):
		    S[i][j] += A[i][j] + B[i][j]

def resta():
	for i in range(2):
	  	for j in range(2):
	  		R[i][j] += A[i][j] - B[i][j]

def multi():
	for i in range(2):
	   	for j in range(2):
	   		res=0
	   		for k in range(2):
	   			res += A[i][k] * B[k][j]
	   		M[i][j] = res
def trasp():
	for i in range(2):
		for j in range(2):
			T[i][j] = A[j][i]

def matrix(request):
	suma()
	resta()
	multi()
	trasp()
	doc = """
	<html>
	<body>
	<h1>
	OPERACIONES CON MATRICES 2x2
	</h1>
	<pre>
    %s %s        %s %s
A =          B = 
    %s %s        %s %s

                  %s %s
    SUMA  A + B = 
                  %s %s

                  %s %s
    RESTA A - B =
                  %s %s
                           %s %s
    MULTIPLICACION A * B =
                           %s %s
                       %s %s
    TRANSPUESTA DE A =
                       %s %s

	</pre>
	</body>
	</html>
	""" %(A[0][0], A[0][1], B[0][0], B[0][1], A[1][0], A[1][1], B[1][0],B[1][1], S[0][0], S[0][1], S[1][0], S[1][1], R[0][0], R[0][1], R[1][0], R[1][1], M[0][0], M[0][1], M[1][0], M[1][1], T[0][0], T[0][1], T[1][0], T[1][1])
	return HttpResponse(doc)