package com.example.barc.response;

import java.util.List;

import com.example.barc.entity.Book;

public class BookList extends BaseResponse {
	
	List<Book> bookList;

	public List<Book> getBookList() {
		return bookList;
	}

	public void setBookList(List<Book> bookList) {
		this.bookList = bookList;
	}

	
	

}
