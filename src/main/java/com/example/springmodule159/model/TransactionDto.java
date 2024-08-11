package com.example.springmodule159.model;

import com.example.springmodule159.model.enums.TransactionTypes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class TransactionDto {
    private Long id;
    private Double balance;
    private TransactionTypes transactionTypes;
}
