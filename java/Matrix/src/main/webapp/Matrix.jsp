<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>OPERACIONES CON MATRICES 2x2
</h1>
<%
int[][] A = new int[2][2];
A[0][0] = 1;
A[0][1] = 2;
A[1][0] = 3;
A[1][1] = 4;

int[][] B = new int[2][2];
B[0][0] = 1;
B[0][1] = 2;
B[1][0] = 3;
B[1][1] = 4;

int[][] S = new int[2][2];
int[][] R = new int[2][2];
int[][] M = new int[2][2];
int[][] T = new int[2][2];
//suma
for(int i=0;i<2;i++){
    for(int j=0;j<2;j++){
        S[i][j] = A[i][j] + B[i][j];
    }
}
//resta
for(int i=0;i<2;i++){
    for(int j=0;j<2;j++){
        R[i][j] = A[i][j] - B[i][j];
    }
}
//multiplicacion
for(int i=0;i<2;i++){
    for(int j=0;j<2;j++){
    	int res =0;
	    	for(int k=0;k<2;k++){
	    		res += A[i][k] * B[k][j];
	    	}
	    M[i][j] = res;    
    }
}
//transpuesta
for(int i=0;i<2;i++){
    for(int j=0;j<2;j++){
        T[i][j] = A[j][i];
    }
}
%>
<h2>
<pre>
        <%out.print(A[0][0]); %> <%out.print(A[0][1]); %>             <%out.print(B[0][0]); %> <%out.print(B[0][1]); %>
    A =             B = 
        <%out.print(A[1][0]); %> <%out.print(A[1][1]); %>             <%out.print(B[1][0]); %> <%out.print(B[1][1]); %>

             <%out.print(S[0][0]); %> <%out.print(S[0][1]); %>
SUMA A + B =
             <%out.print(S[1][0]); %> <%out.print(S[1][1]); %>
                         
              <%out.print(R[0][0]); %> <%out.print(R[0][1]); %>
RESTA A - B =
              <%out.print(R[1][0]); %> <%out.print(R[1][1]); %>
             
                       <%out.print(M[0][0]); %> <%out.print(M[0][1]); %>
MULTIPLICACION A * B =
                       <%out.print(M[1][0]); %> <%out.print(M[1][1]); %>
             
                       <%out.print(T[0][0]); %> <%out.print(T[0][1]); %>
TRANSPUESTA DE A =
                       <%out.print(T[1][0]); %> <%out.print(T[1][1]); %>
</pre>

</h2>
<%!

%>
</body>
</html>