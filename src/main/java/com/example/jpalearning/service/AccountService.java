package com.example.jpalearning.service;

import com.example.jpalearning.model.Account;
import com.example.jpalearning.model.AccountPostReqBody;
import com.example.jpalearning.repository.AccountRepository;
import com.example.jpalearning.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AccountRepository accountRepository;

    public Account save(AccountPostReqBody accountPostReqBody) {

        Account account = Account.builder()
                .userEmail(accountPostReqBody.getUserEmail())
                .sold(accountPostReqBody.getSold())
                .lastChecked(accountPostReqBody.getLastchecked())
                .name(accountPostReqBody.getName())
                .users(userRepository.findById(accountPostReqBody.getUserId())
                .orElseThrow(()-> new NullPointerException("Not Found")))
                .build();

        return accountRepository.save(account);
    }

    public List<Account> listAccounts() {
        return accountRepository.findAll();
    }

}
