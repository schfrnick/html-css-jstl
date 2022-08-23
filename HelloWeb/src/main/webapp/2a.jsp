<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" %>
<html>
<head>
<title>Exercise 2a</title>
<style>
table, th, td {
    border: 1px solid black;
}
</style>
</head>
<body>
	<table bgcolor="#fdddff">
	  <tr style="font-weight:bold">
	    <th>Trial 1</th>
	    <th>Trial 2</th>
	    <th>Trial 3</th>
	    <th>Horizontal sum</th>
	    <th>Horizontal avg</th>
	  </tr>
	  	<% int x,y,z;
				int table[][] = new int[28][3];
				int sum[] = new int[28];
				double average[] = new double[28];
				String avgStr[] = new String[28];
				
				int colSum[] = new int[3];
				double colAverage[] = new double[3];
				String colAvgStr[] = new String[3];
		
		       for (int i = 0; i < 28; i++) {
			 
				table[i][0] = (int) (Math.random() * 10);
				table[i][1] = (int) (Math.random() * 10);
				table[i][2] = (int) (Math.random() * 10);
				
				sum[i] = table[i][0] + table[i][1] + table[i][2]; 
				average[i] = sum[i]/3.0; 
				avgStr[i] = String.format("%.2f", average[i]);
				
				colSum[0] += table[i][0];
				colSum[1] += table[i][1];
				colSum[2] += table[i][2];
			 %>
		  <tr style="font-weight:bold">
		    <td> <%= table[i][0]%> </td>
		    <td> <%= table[i][1]%> </td>
		    <td> <%= table[i][2]%> </td>
		    <td> <%= sum[i]%> </td>
		    <td> <%= avgStr[i]%> </td>
		  </tr>
		<% } %>
		  <% 
		  	colAverage[0] = colSum[0]/28.0;
		  	colAverage[1] = colSum[1]/28.0;
		  	colAverage[2] = colSum[2]/28.0;
		  	
		  	colAvgStr[0] = String.format("%.2f", colAverage[0]);
		  	colAvgStr[1] = String.format("%.2f", colAverage[1]);
		  	colAvgStr[2] = String.format("%.2f", colAverage[2]);
		  %>
		  <tr>
			<td> <%= colSum[0]%> </td>
		    <td> <%= colSum[1]%> </td>
		    <td> <%= colSum[2]%> </td>
		    <td><b>Vertical sum</b></td>
		  </tr>
		  <tr>
			<td> <%= colAvgStr[0]%> </td>
		    <td> <%= colAvgStr[1]%> </td>
		    <td> <%= colAvgStr[2]%> </td>
		    <td><b>Vertical avg</b></td>
		  </tr>	
	</table>
</body>
</html>