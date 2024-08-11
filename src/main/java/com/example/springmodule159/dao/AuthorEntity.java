package com.example.springmodule159.dao;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "authors")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class AuthorEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String surname;
    private Boolean status;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "author")
    private List<BookEntity> books = new ArrayList<>();
}
