package com.chandankrr.services;

import com.chandankrr.domain.entities.BookEntity;

public interface BookService {

    BookEntity createBook(String isbn, BookEntity book);
}
