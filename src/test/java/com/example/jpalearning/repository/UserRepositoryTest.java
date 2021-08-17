package com.example.jpalearning.repository;

import com.example.jpalearning.model.User;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

@DataJpaTest
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;


    @Test
    void save_Persist_When_Successfull() {
        User userToBeSaved = createUser();
        User user = this.userRepository.save(userToBeSaved);

        Assertions.assertThat(user).isNotNull();
        Assertions.assertThat(user.getId()).isNotNull();
        Assertions.assertThat(user.getName()).isEqualTo(userToBeSaved.getName());


    }

    private User createUser() {
        return User.builder()
                .name("testing")
                .userEmail("testing")
                .cpf(12315L)
                .build();
    }
}