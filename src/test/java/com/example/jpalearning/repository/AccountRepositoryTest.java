package com.example.jpalearning.repository;

import com.example.jpalearning.model.Account;
import com.example.jpalearning.model.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import java.time.LocalDate;

@DataJpaTest
class AccountRepositoryTest {

    @Autowired
    AccountRepository accountRepository;

    User user;


    @Test
    void save_Persist_When_Successfull() {
        Account accountToBeSaved = createAccount();
        Account account = this.accountRepository.save(accountToBeSaved);

        Assertions.assertThat(account).isNotNull();
        Assertions.assertThat(account.getId()).isNotNull();
        Assertions.assertThat(account.getName()).isEqualTo(accountToBeSaved.getName());

    }

    private Account createAccount() {
        return Account.builder()
                .name("corrente")
                .sold(12000L)
                .userEmail("gfamorim@claim.com")
                .users(user)
                .lastChecked(LocalDate.ofEpochDay(2020/01/10))
                .build();
    }

}