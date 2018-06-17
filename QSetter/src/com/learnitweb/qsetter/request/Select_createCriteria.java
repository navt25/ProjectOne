package com.learnitweb.qsetter.request;

import java.util.ArrayList;

public class Select_createCriteria {
 public String select_detail;
 public String name;
 public String gender;
 public String date;
 public ArrayList interest;
/* public String details;*/

public String getDate() {
	return date;
}

/*public String getDetails() {
	return details;
}

public void setDetails(String details) {
	this.details = details;
}*/

public ArrayList getInterest() {
	return interest;
}

public void setInterest(ArrayList interest) {
	this.interest = interest;
}

public void setDate(String date) {
	this.date = date;
}

public String getGender() {
	return gender;
}

public void setGender(String gender) {
	this.gender = gender;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

public String getSelect_detail() {
	return select_detail;
}

public void setSelect_detail(String select_detail) {
	this.select_detail = select_detail;
}



}
