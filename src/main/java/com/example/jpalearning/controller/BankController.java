package com.example.jpalearning.controller;

import com.example.jpalearning.model.Bank;
import com.example.jpalearning.model.BankPostReqBody;
import com.example.jpalearning.service.BankService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/v1")
public class BankController {

    private final BankService bankService;

    public BankController(BankService bankService) {
        this.bankService = bankService;
    }


    @PostMapping("bank")
    public ResponseEntity<Bank> save(@RequestBody BankPostReqBody bankPostReqBody){
        return new ResponseEntity<>(bankService.save(bankPostReqBody), HttpStatus.ACCEPTED);
    }

    @GetMapping("bank")
    @ResponseStatus(HttpStatus.OK)
    public List<Bank> bankList(){
        return bankService.listAllBanks();
    }


}
