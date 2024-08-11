package com.example.springmodule159.controller;

import com.example.springmodule159.model.TransactionDto;
import com.example.springmodule159.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("transaction")
@RequiredArgsConstructor
public class TransactionalController {
    private final TransactionService transactionService;

    @GetMapping()
    public List<TransactionDto> getAll(){
        return transactionService.getAll();
    }
}
