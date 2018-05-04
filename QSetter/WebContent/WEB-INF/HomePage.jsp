<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>

	<h1>First Spring MVC check</h1>
	<h2>${welcomeMessage}</h2>
<style>
#welcmPageMsg {
		margin: auto;
	    width: 20%;
	    padding-top: 5cm;
	    color:blue;
	}
#create{color:black;}
#update{color:violet;}
#search{color:pink;}
#delete{color:blue;}                  
                                        
</style>
</head>
<body>
	<p id="welcmPageMsg">Welcome to my university page </p>
	<p><a id="create" href="default">(1.) Create Student Record</a></p>
	<p><a id="update" href="">(2.) Update Student Record</a></p>
	<p><a id="delete" href="">(3.) Delete Student Record</a></p>
	<p><a id="search" href="searchTag">(4.) Search Student Record</a></p>
	
	

</body>
</html>


