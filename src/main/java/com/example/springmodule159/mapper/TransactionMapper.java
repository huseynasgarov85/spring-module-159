package com.example.springmodule159.mapper;

import com.example.springmodule159.dao.TransactionEntity;
import com.example.springmodule159.model.TransactionDto;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface TransactionMapper {
    TransactionDto mapToDto(TransactionEntity transactionEntity);
    TransactionEntity mapToEntity(TransactionDto transactionDto);
}
