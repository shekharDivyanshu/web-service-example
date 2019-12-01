package com.example.webserviceexample.rest;

import com.example.webserviceexample.validator.ValidBook;
import com.example.webserviceexample.vo.Book;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

@RestController
public class BookController {

    private List<Book> bookList = new ArrayList<>();

    @RequestMapping(value = "/books" , method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Book> findAll(){
        return bookList;
    }

    @PostMapping("/book")
    Book newBook(@Valid @RequestBody Book newBook) {
        bookList.add(newBook);
        return newBook;
    }

}
