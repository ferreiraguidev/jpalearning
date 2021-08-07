package com.example.jpalearning.controller;


import com.example.jpalearning.model.Account;
import com.example.jpalearning.model.AccountPostReqBody;
import com.example.jpalearning.service.AccountService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class AccountController {

    private final AccountService accountService;

    public AccountController(AccountService accountService) {
        this.accountService = accountService;
    }


    @PostMapping("accounts")
    public ResponseEntity<Account> save(@RequestBody AccountPostReqBody accountPostReqBody){
        return new ResponseEntity<>(accountService.save(accountPostReqBody), HttpStatus.OK);

    }

    @GetMapping("accounts")
    public List<Account> accountList(){
        return accountService.listAccounts();

    }
}
