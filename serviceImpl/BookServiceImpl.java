package com.example.barc.serviceImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.barc.entity.Book;
import com.example.barc.response.BaseResponse;
import com.example.barc.response.BookList;
import com.example.barc.response.BookResp;
import com.example.barc.service.BookService;

@Service
public class BookServiceImpl implements BookService {
	
	List<Book> books = new ArrayList<Book>();

	@Override
	public BaseResponse addBook(Book request) {
		books.add(request);
		BaseResponse response = new BaseResponse();
		response.setMsg("Success");
		response.setStatus(true);
		response.setStatusCode(200);
		return response;
	}

	@Override
	public BookList getBooks() {
		BookList response = new BookList();
		response.setBookList(books);
		response.setMsg("Success");
		response.setStatus(true);
		response.setStatusCode(200);
		return response;
	}

	@Override
	public BookResp getBook(BookResp request) {
		BookResp response = new BookResp();
		String name = request.getName();
		for(Book book : books) {
			if(name.equals(book.getName())) {
				response.setId(book.getId());
				response.setName(book.getName());
			}
		}
		response.setMsg("Success");
		response.setStatus(true);
		response.setStatusCode(200);
		return response;
	}

}
