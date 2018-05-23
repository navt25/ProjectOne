<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

	<h1></h1>
	
	<h2>${welcomeMessage}</h2>
<style>
#welcmPageMsg {
		margin: auto;
	    width: 20%;
	    padding-top: 3cm;
	    color:blue;
	}
table {
	    border: 1px solid red;
		margin: auto;
	    width: 20%;
	    padding-top: 1cm;
	}
	td {
	border: 1px solid red;
	margin: auto;
    width: 20%;
	padding-top: 1cm;
    text-align: center;
    vertical-align: middle;
}
#create{color:black;}
#update{color:violet;}
#search{color:pink;}
#delete{color:blue;}                  
                                        
</style>
</head>
<body>
<p id="welcmPageMsg">Welcome to my university page </p>

<table align="center" style="width:50%">
	  <tr>
	   <td><a id="create" href="default">(1.) Create Student Record</a></td>
	  </tr>
	  <tr>
	   <td><a id="update" href="">(2.) Update Student Record</a></td>
	  </tr>
	  <tr>
	   <td><a id="delete" href="">(3.) Delete Student Record</a></td>
	  </tr>
	  <tr>
	   <td><a id="search" href="searchTag">(4.) Search Student Record</a></td>
	  </tr>
	  </table>
</body>
</html>

