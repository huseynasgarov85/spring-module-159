package com.example.springmodule159.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AuthorsDto {
    private Long id;
    private String name;
    private String surname;
    private Boolean status;
    private List<BooksDto> books;
}
