package com.example.springmodule159.dao;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "car")
@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CarEntity {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long Id;
    private String model;
    private Double balance;
}
