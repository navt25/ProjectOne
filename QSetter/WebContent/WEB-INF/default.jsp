<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
	<h1>First Spring MVC check</h1>
	<h2>${welcomeMessage}</h2>
</head>
<body>
<body>
  <form>
<table style="width:50%">
<p class="ex1">

<label id="firstnameErrMsg"></label>
<label id="genderErrMsg"></label>
<label id="telErrMsg"></label>
<label id="interestsErrMsg"></label>

  <tr>
    <td>name</td>
	<td><input type="text" id="fname" name="fname" /></td>
  </tr>

 <tr>
	    <td>gender</td>
        <td>
			<input type="radio" class="radioBtnClass" id="radioMale" name="gender" value="male" > Male<br>
		    <input type="radio" class="radioBtnClass" id="radioFemale" name="gender" value="female"> Female<br>
			<input type="radio" class="radioBtnClass" id="radioOther" name="gender" value="other"> Other  
	   </td>    </tr>
  
   	<tr>
	   <td>D.O.B.</td>
	   <td>
			 <input id = "demo" type="date" class="dateClass2" name="dob">
			 <input type="submit">
	   </td>
	</tr>
    <tr>
		<td>Interests</td>
	  <td>
			  <input type="checkbox" name="interests" id="chk1" class="int" value="music">Music<br>
			  <input type="checkbox" name="interests" id="chk1" class="int" value="sports">Sports</input> 
	  </td>    </tr> 
	  
	
   <tr>
  <td>DETAILS</td>
  <td><select name="details" id="search">
		  		<option value="lang">language</option>
				<option value="sub">subject</option>
      </td>   </tr>

  <tr>
  <td>Additional details</td>
  <td><select name="drop" id="drop1" value= "default" >
  </td> </tr>
		
</table>
			<button id = "btn" type="button">Login</button>
</form>
			<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
			<script type="text/javascript" src="js/default_.js"> </script>
</body>
</html>


