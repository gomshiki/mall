package com.example.mall.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
public class BookDto {

    private Long id;
    private String title;
    private String author;
    private String publisher;
    private String isbn;

    public BookDto() {
    }

    public BookDto(Long id, String title, String author, String publisher, String isbn) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.isbn = isbn;
    }

}
