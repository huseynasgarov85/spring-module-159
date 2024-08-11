package com.example.springmodule159.service;

import com.example.springmodule159.dao.AuthorEntity;
import com.example.springmodule159.dao.AuthorsRepository;
import com.example.springmodule159.mapper.AuthorMapper;
import com.example.springmodule159.model.AuthorsDto;
import com.example.springmodule159.model.BooksDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
public class AuthorsService {
    private final AuthorsRepository authorsRepository;
    private final AuthorMapper authorMapper;

    public List<AuthorsDto> getAll(AuthorsDto authorsDto) {
        log.info("ActionLog.getAll.started");
        var authorEntityList = authorsRepository.findAll();
       AuthorEntity authorEntity = authorMapper.mapToEntity(authorsDto);
        authorsRepository.save(authorEntity);
        var authorDto = authorEntityList.stream().map(authorMapper::mapToDto).toList();
        log.info("ActionLog.getAll.end");
        return authorDto;

    }

    public AuthorsDto getById(Long authorsId) {
        log.info("ActionoLog.getById.started.authorsId:{}",authorsId);
        var authorEntity = authorsRepository.findById(authorsId).orElseThrow();
        var authorDto = authorMapper.mapToDto(authorEntity);
        log.info("ActionoLog.getById.end.authorsId:{}",authorsId);
        return authorDto;
    }

    public void addAuthors(AuthorsDto authorsDto) {
        log.info("ActionsLog.addAuthors.start.authorsDto:{}",authorsDto);
        var authorDto = authorMapper.mapToEntity(authorsDto);
        authorsRepository.save(authorDto);
        log.info("ActionsLog.addAuthors.start.authorsDto:{}",authorsDto);
    }

    public void addByAuthorsInBook(BooksDto booksDto, Long authorId) {
        log.info("ActionsLog.addByAuthorsInBook.start.authorId:{},{}",authorId,booksDto);
        var authorEntity = authorsRepository.findById(authorId).orElseThrow();
        var bookEntity = authorMapper.mapToEntity(booksDto);
        bookEntity.setAuthor(authorEntity);
        authorEntity.getBooks().add(bookEntity);
        authorsRepository.save(authorEntity);
        log.info("ActionsLog.addByAuthorsInBook.start.authorId:{},{}",authorId,booksDto);
    }

}
