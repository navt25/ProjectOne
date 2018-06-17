$(document).ready(function() {
    $("#select_detail").change(function(){
    	var jsonObj = {}
    	console.log(jsonObj);
    	jsonObj["select_detail"] = $("#select_detail").val();
    	console.log(jsonObj);
    	console.log("click here");
       $.ajax({
    	   type : "POST",
    	   contentType : "application/json",
    	   url:'welcomenew',
    	   data : JSON.stringify(jsonObj),
    	   dataType : 'json',
    	   timeout : 100000,
          success:function(data) {
        	  console.log("SUCCESS: ", jsonObj);
        	  console.log(data);
        	  var selectobject=document.getElementById("drop1")
				for (var i=0; i<selectobject.length; i++){
				selectobject.options.length = 0;
				}
        	  console.log("click");
				var myselect = document.getElementById("drop1");
				for(var i = 0; i < data.length; i++) {
					var	option = document.createElement( 'option' );
					option.text = data[i];		
					myselect.add(option);
					console.log(data[i]); 	
						}
				  }
       });
 });
	      
    $("#btnCreate").click(function(){
    	var name = $('#fname').val();
        var gender = document.getElementsByName("gender");
		var dob = $('#demo').val(); 
		var interestChecked = false;
		var interests =  document.getElementsByName("interests");
		var e = document.getElementById("select_detail");
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
        
    	 var favorite = [];
			$.each($("input[name='interests']:checked"), function(){            
				favorite.push($(this).val());
			});
			console.log(+ favorite.join(", "));
			console.log("inside click method");
		    	
    	var jsonObj = {}
    	console.log(jsonObj);
    	jsonObj["name"] = $("#fname").val();
    	jsonObj["gender"] =  $("input[type='radio'].radioBtnClass:checked").val();
    	jsonObj["date"] = $("#demo").val();
    	jsonObj["interest"] = favorite;
    	jsonObj["select_detail"] = $("#select_detail").val();
    	
    	console.log("hurray!!");
 	    console.log(jsonObj);
    	   $.ajax({
    	   type : "POST",
    	   contentType : "application/json",
    	   url:'welcomenew2',
    	   data : JSON.stringify(jsonObj),
    	   dataType : 'json',
    	   timeout : 100000,
           success:function(data) {
           
        	  console.log("data:",data);
        	  console.log("data.status:",data.status);
        	  console.log("data.message:",data.message);
        	  alert(data.message);
              },
        	  error:function(err){
        	  console.log("error",err);
        	  }
           });   	
    });	
});