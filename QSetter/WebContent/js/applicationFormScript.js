$(document).ready(function() {
   $('#btn').click(function() {
        //validate form 1
		var name = $('#fname').val();
        var gender = document.getElementsByName("gender");
		var dob = $('#demo').val(); 
		var interestChecked = false;
		var interests =  document.getElementsByName("interests");
		var e = document.getElementById("search");
        var optionSelIndex = e.options[e.selectedIndex].value;
           
     	if(name == null || name ==""){
			document.getElementById("nameErrMsg").innerHTML= "Please provide name";
			return false;
		}else{
			document.getElementById("nameErrMsg").innerHTML="";
		}
		if((document.getElementById("radioMale").checked == false)
			&& (document.getElementById("radioFemale").checked == false)
			&& (document.getElementById("radioOther").checked == false)){
			document.getElementById("genderErrMsg").innerHTML= "Please provide gender";
			return false;
		}else{
			document.getElementById("genderErrMsg").innerHTML="";
		}
	    if(dob == null || dob ==""){
			document.getElementById("dobErrMsg").innerHTML= "Please provide date";
			return false;
		}else{
			document.getElementById("dobErrMsg").innerHTML="";
		}
		for(var i=0; i<interests.length; i++){
			if(interests[i].checked == true) {
				interestChecked = true;
				break;
			}
		}
		if(interestChecked == false){
			document.getElementById("interestsErrMsg").innerHTML= "Please provide interests";
		return false;
		}else{
			document.getElementById("interestsErrMsg").innerHTML= "";
		}		   
        if (optionSelIndex == 0) {
             document.getElementById("detailsErrMsg").innerHTML= "Please provide details";
        return false;
		}else{
             document.getElementById("detailsErrMsg").innerHTML= "";
            }
        
		 });
		 });
		
		
		