
<%@page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"  %>

<!DOCTYPE html>
<html>

<head>
<style>
.wrap {
width: 100%;
overflow:auo;
}
.fleft {
    float:left; 
    width: 10%;
background:blue;
    height: 500px;
}

.fright {
float: right;
    background:white;
    height: 100%;
    width: 85%;
}

</style>
<meta charset="ISO-8859-1">

<title>Home</title>

</head>

<body>



<div class="wrap">
	<div class="fleft"><h1>Mortgage Calculator</h1>
	<br>
	<label>Principal</label>
	<br>
	<textarea id="b1"></textarea>
	<form action="add" name="myForm" onsubmit="return validateForm()">
	<br>
	<label>interest rate</label>
	<br>
	<textarea id="b2"></textarea>
	<br>
	<label>monthly payment</label>
	<br>
	<textarea id="b3"></textarea>
	<br>
	<input type="submit">
	
	</form>
	<input type="button" value="clear" method="post" onclick="clear()">
	</div>
		<div class="fright">
		<table id="logTable" border="5px">
		  <tr>
		    <th>Principal</th>
		    <th>Interest Rate</th>
		    <th>Monthly Payment</th>
		    <th>Years</th>
		    <th>Months</th>
		    <th>$/Interest</th>
		    <th></th>
		  </tr>
		  <c:forEach items="${myList}" var="element"> 
			<tr>
			     <td>${element.Principal}</td>
			     <td>${element.InterestRate}</td>
			     <td>${element.MonthlyPayment}</td>
			     <td>${element.Year}</td>
			     <td>${element.Remainder}</td>
			     <td>${element.ICharged}</td>
			  </tr>
			</c:forEach>
		  <tbody>
		  
		  </tbody>
		  </table>
		  </div>
  
</div>

</body>
<script>
function validateForm() {
	let x = document.forms["myForm"]["b3"]
  let y = document.forms["myForm"]["b1"]
  let z = document.forms["myForm"]["b2"]

  if (y == "" || z == "") {
    alert("All fields must be filled out");
    return false;
  }
  if(document.write(number.isDecimal(y)) != true){
	  alert("First value is not an integer");
	    return false;
  }
  if(document.write(number.isDecimal(z)) != true){
	  alert("Second value is not an integer");
	    return false;
  }
  if(document.write(number.isDecimal(x)) != true){
	  alert("First value is not an integer");
	    return false;
  }
}
</script>
</html>