package com.example.barc.response;

public class BookResp extends BaseResponse {
	
	private Integer id;
	private String name;
	
	public BookResp() {}
	
	public BookResp(Integer id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	

}
