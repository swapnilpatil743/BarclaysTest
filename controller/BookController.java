package com.example.barc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.barc.entity.Book;
import com.example.barc.response.BaseResponse;
import com.example.barc.response.BookList;
import com.example.barc.response.BookResp;
import com.example.barc.service.BookService;


@RestController
@RequestMapping({ "/api/data" })
public class BookController {
	
	@Autowired
	private BookService bookService;
	
	@PostMapping("addBook")
	public BaseResponse addBook(@RequestBody Book request) {
		BaseResponse response = bookService.addBook(request);
		return response;
	}
	
	@GetMapping("/getBooks")
	public BookList getBooks() {
		BookList response = bookService.getBooks();
		return response;
	}
	
	@PostMapping("/getBook")
	public BookResp getBook(@RequestBody BookResp request) {
		BookResp response = bookService.getBook(request);
		return response;
	}

}
