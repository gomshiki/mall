package com.example.mall.service;

import com.example.mall.domain.Book;
import com.example.mall.dto.BookDto;
import com.example.mall.repository.BookRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class BookService {

    private final BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<BookDto> selectAll() {

        List<Book> books = bookRepository.findAll();


        return books.stream()
                .map(book -> new BookDto(
                        book.getId(), book.getTitle(), book.getAuthor(),
                        book.getPublisher(), book.getIsbn()))
                .toList();
    }
}