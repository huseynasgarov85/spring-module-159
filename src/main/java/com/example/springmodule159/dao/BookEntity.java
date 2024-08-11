package com.example.springmodule159.dao;
import jakarta.persistence.*;
import lombok.*;
@Entity
@Table(name = "books")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BookEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String bookName;
    private String type;
    @ManyToOne
    @JoinColumn(name = "author_id")
    private AuthorEntity author;
}
