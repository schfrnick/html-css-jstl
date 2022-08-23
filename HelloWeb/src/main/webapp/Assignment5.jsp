<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<script>type="text/javascript"</script>
<meta charset="ISO-8859-1">
<title> Calculator 1.0</title>
</head>
<body>

<label for="b1">Enter what you would like to calculate.</label>
<br><br>
<form action="add" name="myForm" onsubmit="return validateForm()">
	<textarea id="b1" name="b1" rows="4" cols="5"></textarea>
  
 	 <textarea id="b2" name="b2" rows="4" cols="5"></textarea>
 		<br>
  	 <input type= "radio" name="arithmetic"value="+" checked/> +
  	 <br>
  	 <input type= "radio" name="arithmetic"value="-" checked/> -
  	 <br>
  	 <input type= "radio" name="arithmetic"value="*" checked/> *
  	 <br>
  	 <input type= "radio" name="arithmetic"value="/" checked/> /
  	 <br>
  	 <input type= "radio" name="arithmetic"value="NULL" checked/> NULL
  <br><br>
 		<input type="submit">
 </form>
 		
<h1> Results </H1>

<br>
<form action="Remove" method="post">
<button onClick="Clear()">Clear Data</button>
</form>


</body>
<script>
function validateForm() {
  let x = document.forms["myForm"]["arithmetic"].value;
  let y = document.forms["myForm"]["b1"]
  let z = document.forms["myForm"]["b2"]
  if (x == "NULL") {
	    alert("All fields must be filled out");
	    return false;
	  }
  if (y == "" || z == "") {
    alert("All fields must be filled out");
    return false;
  }
  if(document.write(number.isInteger(y)) != true){
	  alert("First value is not an integer");
	    return false;
  }
  if(document.write(number.isInteger(z)) != true){
	  alert("Second value is not an integer");
	    return false;
  }
}
</script>
</html>



