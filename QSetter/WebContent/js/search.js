$(document).ready(function() {
$("#btn_srch").click(function(){
	var jsonObj = {}
	console.log(jsonObj);
	jsonObj["id"] = $("#identity").val();
    console.log(jsonObj);
	     
	$.ajax({
	   type : "POST",
	   contentType : "application/json",
	   url:'welcomesearch',
	   data : JSON.stringify(jsonObj),
	   dataType : 'json',
	   timeout : 100000,
	   success:function(data) {
		   console.log("SUCCESS: ", jsonObj);
     	   console.log(data);
           console.log("data:",data);
           document.getElementById("myTable").innerHTML="";
           var table = document.getElementById("myTable");
           var headerRow = table.insertRow(0);
           var headercell1 = headerRow.insertCell(0);
           var headercell2 = headerRow.insertCell(1);
           var headercell3 = headerRow.insertCell(2);
       	   var headercell4 = headerRow.insertCell(3);
       	   var headercell5 = headerRow.insertCell(4);
           var headercell6 = headerRow.insertCell(5);
       
            headercell1.innerHTML = "Name";
         	headercell2.innerHTML = "Gender";
        	headercell3.innerHTML = "Date";
        	headercell4.innerHTML = "Interest";
        	headercell5.innerHTML = "Details";
    	    headercell6.innerHTML = "ID";  
           for (var i=0; i<data.length; i++){                           
        	   var row = table.insertRow(i+1);
               var cell1 = row.insertCell(0);
               var cell2 = row.insertCell(1);
               var cell3 = row.insertCell(2);
           	   var cell4 = row.insertCell(3);
           	   var cell5 = row.insertCell(4);
           	   var cell6 = row.insertCell(5);        
           	   
           	   cell1.innerHTML = data[i].name;
               cell2.innerHTML = data[i].gender;
           	   cell3.innerHTML = data[i].date;
               cell4.innerHTML = data[i].interest;
           	   cell5.innerHTML = data[i].details; 
           	   cell6.innerHTML = data[i].id; 
           	
           	var alink = document.createElement("a");
           	alink.href = "Update?id="+data[i].id  +"&name="+data[i].name+"&gender="+data[i].gender
           	+"&date="+data[i].date+"&interest="+data[i].interest+"&details="+data[i].details; 
           	alink.text = "Update Link";
           	document.getElementsByTagName("body")[0].appendChild(alink);
        	
           	var alink = document.createElement("a");
        	alink.href = "Update?id="+data[i].id +"&name="+data[i].name+"&gender="+data[i].gender
           	+"&date="+data[i].date+"&interest="+data[i].interest+"&details="+data[i].details+"&delete=for delete"; 
           	alink.text = "Delete Link";
           	document.getElementsByTagName("body")[0].appendChild(alink);             	          	
           }            
   },
});   	});	

/*if(alink.href = "Update?id="+data[i].id  +"&name="+data[i].name+"&gender="+data[i].gender
           	+"&date="+data[i].date+"&interest="+data[i].interest+"&details="+data[i].details){*/
document.getElementById("nam").setAttribute("readonly", true);
document.getElementById("gen").setAttribute("readonly", true);
document.getElementById("dte").setAttribute("readonly", true);
document.getElementById("inte").setAttribute("readonly", true);
document.getElementById("deta").setAttribute("readonly", true);
/*}
else {
	document.getElementById("identity").setAttribute("readonly", true);
}*/
$("#btnup").click(function(){
	var jsonObj = {}
	console.log(jsonObj);
	jsonObj["name"] = $("#nam").val();
	console.log(name);
	jsonObj["gender"] = $("#gen").val();
	jsonObj["date"] = $("#dat").val();
	jsonObj["interest"] = $("#inte").val();
	jsonObj["details"] = $("#deta").val();
	jsonObj["id"] = $("#identity").val();
	    console.log("target achieved update");
        console.log(jsonObj);
	$.ajax({
	   type : "POST",
	   contentType : "application/json",
	   url:'Update',
	   data : JSON.stringify(jsonObj),
	   dataType : 'json',
	   timeout : 100000,
	   success:function(data) {
     	  console.log("data:",data);	  
        },
});   		
});
});	
