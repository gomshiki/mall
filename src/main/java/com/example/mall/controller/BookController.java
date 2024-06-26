package com.example.mall.controller;

import com.example.mall.dto.BookDto;
import com.example.mall.service.BookService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path = "/book")
public class BookController {

    private final BookService bookService;

    public BookController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping("/selectAll")
    public ResponseEntity<?> hello() {

        List<BookDto> bookDtos = bookService.selectAll();

        return null;
    }
}
