package com.example.springmodule159.service;

import com.example.springmodule159.dao.TransactionEntity;
import com.example.springmodule159.dao.TransactionRepository;
import com.example.springmodule159.mapper.TransactionMapper;
import com.example.springmodule159.model.TransactionDto;
import com.example.springmodule159.model.enums.TransactionTypes;
import com.example.springmodule159.scheduler.TransactionScheduler;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Slf4j
@RequiredArgsConstructor
@Getter
@Setter
public class TransactionService {
    private final TransactionRepository transactionRepository;
    private final TransactionMapper transactionMapper;
    private Double count=0.0;

    public List<TransactionDto> getAll() {
        log.info("ActionLog.getAll.started.");
        List<TransactionEntity> transactionEntities = transactionRepository.findAll();
        List<TransactionEntity> transaction = transactionEntities.stream().filter(it -> it.getTransactionTypes().equals(TransactionTypes.BRAVO)).toList();
        Double amount = 0.0;
        for (TransactionEntity transactionEntity : transaction) {
            amount += transactionEntity.getBalance();
        }
        count = (amount * 1.0) / 100;
        var transactionDto = transaction.stream().map(transactionMapper::mapToDto).toList();
        log.info("ActionLog.getAll.end.");
        return transactionDto;
    }
}
