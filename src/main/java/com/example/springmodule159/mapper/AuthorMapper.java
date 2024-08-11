package com.example.springmodule159.mapper;

import com.example.springmodule159.dao.AuthorEntity;
import com.example.springmodule159.dao.BookEntity;
import com.example.springmodule159.model.AuthorsDto;
import com.example.springmodule159.model.BooksDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public abstract class AuthorMapper {
    public abstract AuthorEntity mapToEntity(AuthorsDto authorsDto);
    public abstract AuthorsDto mapToDto(AuthorEntity authorEntity);
    public abstract BooksDto mapToDto(BookEntity bookEntity);
    public abstract BookEntity mapToEntity(BooksDto booksDto);
}
