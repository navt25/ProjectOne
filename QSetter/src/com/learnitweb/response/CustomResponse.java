package com.learnitweb.response;

public class CustomResponse {
	@Override
	public String toString() {
		return "CustomResponse [status=" + status + ", message=" + message + "]";
	}
	String message;
	String status;
	

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public CustomResponse(String status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	
	
	
}
