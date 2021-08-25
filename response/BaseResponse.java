package com.example.barc.response;

import java.util.List;

public class BaseResponse {
	
	private Boolean status;
	private String msg;
	private List<Error> er;
	private Integer statusCode;
	public Boolean getStatus() {
		return status;
	}
	public void setStatus(Boolean status) {
		this.status = status;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public List<Error> getEr() {
		return er;
	}
	public void setEr(List<Error> er) {
		this.er = er;
	}
	public Integer getStatusCode() {
		return statusCode;
	}
	public void setStatusCode(Integer statusCode) {
		this.statusCode = statusCode;
	}
	
	

}
