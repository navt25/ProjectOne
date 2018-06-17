<!DOCTYPE html>
<%@ taglib prefix = "sql" uri = "http://java.sun.com/jsp/jstl/sql" %>
<html>
<head>

<title>Insert title here</title>
	<h1>Search Spring MVC check</h1>
	<h2>${searchMessage}</h2>
</head>
<body>
<form name="UpdateForm" id="Up" > 
<table>
 <tr>
    <td>Update NAME</td>
	<td><input type="text" placeholder="Enter NAME" id="nam" name="name_detail" value="${data[1]}"       /></td>
  </tr>
<tr>
    <td>Update GENDER</td>
	<td><input type="text" placeholder="Enter GENDER" id="gen" name="gender" value="${data[2]}" /></td>
</tr>
<tr>
    <td>Update DATE</td>
	<td><input type="text" placeholder="Enter DATE" id="dat" name="date" value="${data[3]}" /></td>
</tr>
<tr>
    <td>Update INTEREST</td>
	<td><input type="text" placeholder="Enter INTEREST" id="inte" name="interst" value="${data[4]}" /></td>
</tr>
<tr>
    <td>Update DETAILS</td>
	<td><input type="text" placeholder="Enter DETAILS" id="deta" name="details" value="${data[5]}" /></td>
</tr>  
<tr>
    <td>Update ID</td>
	<td><input type="text" placeholder="Enter ID" id="identity" name="idno" value="${data[0]}" readonly/></td>
 </tr>
  </table>
  <button type="button" id="btnup" >Click Me!</button>
  
</form>
            <script type="text/javascript" src="js/jquery-3.2.1.js"></script>
			<script type="text/javascript" src="js/search_2.js"> </script>      
</body>
</html>











































<%-- <%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<body>

<table align="center" style="width:50%">

	<form name="UpdateForm" onclick=" ">
		<table>
			<tr>
				<td>UPDATE NAME</td>
				<td><input type="text" placeholder="Enter NAME" id="nam"name="name_detail" value="${data[1]}" /></td>
			</tr>
			<tr>
				<td>UPDATE GENDER</td>
				<td>
					value="${data[2]}"
			<input type="radio"class="radioBtnClass" id="radioMale" name="gender" value="Male">Male<br> 
			<input type="radio" class="radioBtnClass"id="radioFemale" name="gender" value="Female"> Female<br>
			<input type="radio" class="radioBtnClass" id="radioOther"name="gender" value="Other"> Other
				</td>
			</tr>
			<tr>
				<td>UPDATE DATE</td>
				<td><input type="text" placeholder="Enter DATE" id="dat"name="date" value="${data[3]}" /></td>
			</tr>
			<tr>
				<td>UPDATE INTEREST</td>
				 value="${data[4]}"
				<td>
				<input type="checkbox" name="interests" id="chk1"class="int" value="music">Music<br>
				<input type="checkbox" name="interests" id="chk1" class="int"value="sports">Sports</input></td>
			</tr>
			<tr>
				<td>UPDATE DETAILS</td>
				value="${data[5]}"
				<td><select name="details" id="search">
						<option value="" disabled selected>--Please select--</option>
						<option value="lang">language</option>
						<option value="sub">subject</option>
				</select></td>
			</tr>
			<tr>
				<td>UPDATE ID</td>
				<td><input type="text" placeholder="Enter ID" id="identity"name="idno" value="${data[0]}" readonly /></td>
			</tr>
		</table>
		<button type="button" id="btnUp">Click Me!</button>
		<br>
	</form>
	<script type="text/javascript" src="js/jquery-3.2.1.js"></script>
	<script type="text/javascript" src="js/search_2.js">
		
	</script>
</body>
</html>
 --%>