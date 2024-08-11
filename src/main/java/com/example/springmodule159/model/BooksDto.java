package com.example.springmodule159.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class BooksDto {
    private Long id;
    private String bookName;
    private String type;
    private String number;
}
