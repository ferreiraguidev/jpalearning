package com.example.jpalearning.service;

import com.example.jpalearning.model.Bank;
import com.example.jpalearning.model.BankPostReqBody;
import com.example.jpalearning.repository.BankRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BankService {

    @Autowired
    BankRepository bankRepository;

    public Bank save(BankPostReqBody bankPostReqBody) {
        Bank bank = Bank.builder()
                .name(bankPostReqBody.getName())
                .build();

        return bankRepository.save(bank);
    }

    public List<Bank> listAllBanks(){
        return bankRepository.findAll();
    }

}
