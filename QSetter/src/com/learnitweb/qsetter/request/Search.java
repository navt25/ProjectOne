package com.learnitweb.qsetter.request;
public class Search {
	
	
@Override
	public String toString() {
		return "Search [name=" + name + ", gender=" + gender + ", date=" + date + ", interest=" + interest
				+ ", details=" + details + ", id=" + id + "]";
	}

/*@Override
	public String toString() {
		return "Search [gender=" + gender + ", date=" + date + ", interest=" + interest + ", details=" + details
				+ ", identity=" + identity + ", ID=" + ID + ", name=" + name + "]";
	}*/

public Search(String name, String gender, String date, String interest, String details,String id) {
		super();
		this.name = name;
		this.gender = gender;
		this.date = date;
		this.interest = interest;
		this.details = details;
		//this.identity = identity;
		this.id = id;
	}

public Search() {
	System.out.println("hello constructor");
	System.out.println(name);
	System.out.println(gender);
}
public String name;
public String gender;
public String date;
public String interest;
public String details;
public String id;

public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}



public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getGender() {
	return gender;
}
public void setGender(String gender) {
	this.gender = gender;
}
public String getDate() {
	return date;
}
public void setDate(String date) {
	this.date = date;
}
public String getInterest() {
	return interest;
}
public void setInterest(String interest) {
	this.interest = interest;
}
public String getDetails() {
	return details;
}
public void setDetails(String details) {
	this.details = details;
}



}