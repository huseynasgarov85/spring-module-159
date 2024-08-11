package com.example.springmodule159.controller;

import com.example.springmodule159.dao.BookEntity;
import com.example.springmodule159.model.AuthorsDto;
import com.example.springmodule159.model.BooksDto;
import com.example.springmodule159.service.AuthorsService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("authors")
@RequiredArgsConstructor
public class AuthorController {
    private final AuthorsService authorsService;
    @GetMapping()
    public List<AuthorsDto> getAll(AuthorsDto authorsDto){
       return authorsService.getAll(authorsDto);
    }
    @GetMapping("/{authorId}")
    public AuthorsDto getById(@PathVariable Long authorId){
        return authorsService.getById(authorId);
    }
    @PostMapping()
    public void addAuthors(@RequestBody AuthorsDto authorsDto){
        authorsService.addAuthors(authorsDto);
    }
    @PostMapping("/{authorId}/book")
    public void addByAuthorsInBook(@RequestBody BooksDto booksDto, @PathVariable Long authorId){
        authorsService.addByAuthorsInBook(booksDto,authorId);
    }

}
