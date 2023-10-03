package com.sakr.banksystemapi.controller;

import com.sakr.banksystemapi.model.TransactionRequestModel;
import com.sakr.banksystemapi.service.TransactionService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/transaction")
@RequiredArgsConstructor
public class TransactionController {

    private final TransactionService transactionService;

    @PostMapping("/deposit")
    public void deposit(
            @RequestBody TransactionRequestModel request
    ) {
        transactionService.deposit(request);
    }

    @PostMapping("/withdraw")
    public void withdraw(
            @RequestBody TransactionRequestModel request
    ) {
        transactionService.withdraw(request);
    }

}