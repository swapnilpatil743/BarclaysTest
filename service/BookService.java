package com.example.barc.service;

import com.example.barc.entity.Book;
import com.example.barc.response.BaseResponse;
import com.example.barc.response.BookList;
import com.example.barc.response.BookResp;

public interface BookService {

	BaseResponse addBook(Book request);

	BookList getBooks();

	BookResp getBook(BookResp request);

}
