package com.example.springmodule159.scheduler;

import com.example.springmodule159.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TransactionScheduler {
    private final TransactionService transactionService;

    @Scheduled(cron = "0 0 9 1 * *")
    public void scheduler() {
        transactionService.getAll().forEach(it -> {
                    System.out.println("tebrikler " + transactionService.getCount() + " cashbacikiniz geri qayitdi");
                }
        );
    }

}
