package com.learnitweb.qsetter.request;

import java.util.ArrayList;

public class SearchCriteria {
 public String search;
 public String name;
 public String gender;
 public String date;
 public ArrayList interest;
 public String details;
 public ArrayList additionalDetails;
 


public ArrayList getAdditionalDetails() {
	return additionalDetails;
}

public void setAdditionalDetails(ArrayList additionalDetails) {
	this.additionalDetails = additionalDetails;
}

public String getDate() {
	return date;
}

public String getDetails() {
	return details;
}

public void setDetails(String details) {
	this.details = details;
}

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

public String getSearch() {
	return search;
}

public void setSearch(String search) {
	this.search = search;
}


}
