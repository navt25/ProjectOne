<!DOCTYPE html>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags"%>
<head>
<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
<script type="text/javascript" src="js/applicationFormScript.js"> </script>
<script type="text/javascript" src="js/create.js"> </script> 

<link rel="stylesheet" type="text/css" href="css/applicationFormStyle.css" />
<title>Home page</title>
</head>
<body>
	<form name="EnrollmentForm" onclick=" ">
		<table align="center" style="width: 50%">
			<p class="ex1">
			<div class="intro">
				<label id="nameErrMsg"></label> 
				<label id="genderErrMsg"></label> 
				<label id="dobErrMsg"></label>
				<label id="interestsErrMsg"></label> 
				<label id="detailsErrMsg"></label>
			</div>
			<tr>
				<td><spring:message code="label.fname" /></td>
				<td><input type="text" id="fname" name="fname" /></td>
			</tr>
			<tr>
				<td>gender</td>
				<td><input type="radio" class="radioBtnClass" id="radioMale"
					name="gender" value="Male"> Male<br> <input
					type="radio" class="radioBtnClass" id="radioFemale" name="gender"
					value="Female"> Female<br> <input type="radio"
					class="radioBtnClass" id="radioOther" name="gender" value="Other">
					Other</td>
			</tr>
			<tr>
				<td>D.O.B.</td>
				<td><input id="demo" type="date" class="dateClass2" name="dob">
				</td>
			</tr>
			<tr>
				<td>Interests</td>
				<td><input type="checkbox" name="interests" id="chk1"
					class="int" value="music">Music<br> <input
					type="checkbox" name="interests" id="chk1" class="int"
					value="sports">Sports</input></td>
			</tr>
			<tr>
				<td>DETAILS</td>
				<td><select name="details" id="select_detail">
						<option value="" disabled selected>--Please select--</option>
						<option value="lang">language</option>
						<option value="sub">subject</option>
				</select></td>
			</tr>
			<tr>
				<td>Additional details</td>
				<td><select name="drop" id="drop1" value="default"></td>
			</tr>
		</table>
		<button id="btnCreate" type="button">Login</button>
	</form>
</body>
</html>


