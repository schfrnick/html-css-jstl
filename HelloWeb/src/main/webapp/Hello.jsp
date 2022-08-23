<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1 style="color:green">a)</h1>
<%int i =1;
while(i<+10)
{
	out.println(i);
	i ++;
}
%>

<h2 style="color:green">b)printing the square</h2>

<%i =1;
while(i<=10)
{
	int sqr = i;
	sqr = sqr * sqr;
	out.println(sqr);
	i++;
}
%>

<h3 style="color:green">c)</h3>

<%i =1;
while(i<=10)
{
	int sqr = i;
	sqr = sqr * sqr;
	out.println(i + "<sup>2</sup>=  "+ sqr );
	
	i++;
	
	if(i<10)
	{
		out.println(",");
	}
}
%>


</body>
</html>