package com.example.jpalearning.service;

import com.example.jpalearning.model.Account;
import com.example.jpalearning.model.AccountPostReqBody;
import com.example.jpalearning.repository.AccountRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    private final AccountRepository accountRepository;

    public AccountService(AccountRepository accountRepository) {
        this.accountRepository = accountRepository;
    }


    public Account save(AccountPostReqBody accountPostReqBody){

        Account account = Account.builder()
                .userEmail(accountPostReqBody.getUserEmail())
                .sold(accountPostReqBody.getSold())
                .build();

        return accountRepository.save(account);
    }

    public List<Account> listAccounts(){
        return accountRepository.findAll();
    }

}
