$(document).ready(function() {
	
    $("#search").change(function(){
    	var jsonObj = {}
    	console.log(jsonObj);
    	jsonObj["search"] = $("#search").val();
    	console.log(jsonObj);
    	 
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
        	 // display(search);
        	  //alert($("#dropdown").val());
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
    
	    $("#btn").click(function(){
	    	 var favorite = [];
				$.each($("input[name='interests']:checked"), function(){            
					favorite.push($(this).val());
				});
				console.log(+ favorite.join(", "));
				//("My favourite masti are: " + favorite.join(", "));	
	    	console.log("inside click method");
   		    	
	    	var jsonObj = {}
	    	console.log(jsonObj);
	    	jsonObj["name"] = $("#fname").val();
	    	jsonObj["gender"] =  $("input[type='radio'].radioBtnClass:checked").val();
	    	jsonObj["date"] = $("#demo").val();
	    	jsonObj["interest"] = favorite;
	    	jsonObj["details"] = $("#search").val();
	    	//jsonObj["additionalDetails"] = $("#drop1").val();
	    	 console.log("hurray!!");
	 	    console.log(jsonObj);
	    	/*jsonObj["arr"] = ["study","play"];*/
	     
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