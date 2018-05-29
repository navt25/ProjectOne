$(document).ready(function() {
$("#btn1").click(function(){
	var jsonObj = {}
	console.log(jsonObj);
	jsonObj["name"] = $("#nam").val();
	jsonObj["gender"] = $("#gen").val();
	jsonObj["date"] = $("#dat").val();
	jsonObj["interest"] = $("#inte").val();
	jsonObj["details"] = $("#deta").val();
	jsonObj["identity"] = $("#identity").val();
	     console.log("target achieved");
	     console.log(jsonObj);
	     /*jsonObj["arr"] = ["study","play"];*/
	
	$.ajax({
	   type : "POST",
	   contentType : "application/json",
	   url:'welcomesearch',
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
	    /*console.log("first value");
         $("#btn1").click(function(){
               console.log("2 value");
	    	   var identity = $('#identity').val();
	    	   console.log("3 value");
            });  	*/
